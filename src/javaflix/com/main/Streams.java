package javaflix.com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javaflix.com.dataSource.DataSource;
import javaflix.com.enums.Tipo;
import javaflix.com.pojos.Platillo;

public class Streams {

	public static void main(String[] args) {
		try {
			List<Platillo> lPlatillos = DataSource.generaPlatillos();						
			
			//foreach
			//imprimirPlatillos(lPlatillos);
			//imprimirPlatillosStream(lPlatillos);
			
			//filter, map, limit, foreach
			//filtrarPlatillosStream(lPlatillos,50,5);
			//filtrarPlatillos(lPlatillos,50,5);
			
			//Collect
			//int size = obtienePlatillosStream(lPlatillos, 50, 5).size();
			//System.out.println("Platillos en la lista -> "+size);
			
			//map, max
			//precioPlatilloMasCaroStream(lPlatillos);
			//precioPlatilloMasCaro(lPlatillos);
			
			//collect, groupingby
			//agruparPlatillosStream(lPlatillos);
			
		} catch (Exception e) {
			System.out.println("Error al ejecutar stream, "+e.getMessage());
		}

	}
	
	private static void imprimirPlatillosStream(List<Platillo> lPlatillos) {
		//Forma 1 [Lambda function]
		lPlatillos.stream().forEach((platillo) -> System.out.println(platillo));
		
		//Forma2 [Method reference (syntatic sugar)]
		//lPlatillos.stream().forEach(System.out::println);
	}
	
	private static void imprimirPlatillos(List<Platillo> lPlatillos) {
		for (Platillo platillo : lPlatillos) {
			System.out.println(platillo);
		}
	}
	
	
	private static void filtrarPlatillosStream(List<Platillo> lPlatillos, int calorias, int limite) {
		lPlatillos.stream().
					filter(p -> p.getCalorias() > calorias). //Operacion intermedia
					map(Platillo::getNombre). //Operacion intermedia
					limit(limite).	//Operacion intermedia
					forEach(System.out::println); //Operacion final
	}	
	
	private static void filtrarPlatillos(List<Platillo> lPlatillos, int calorias, int limite) {
		List<String> lPlatilloAux = new ArrayList<>();		
		
		//Recorrer la lista con platillos
		for (Platillo platillo : lPlatillos) {
			if(platillo.getCalorias() > calorias && lPlatilloAux.size() < limite ) {
				lPlatilloAux.add(platillo.getNombre());
			}
		}
		
		//Imprimir informacion
		for (String platillo : lPlatilloAux) {
			System.out.println(platillo);
		}
		
	}
	
	private static List<String> obtienePlatillosStream(List<Platillo> lPlatillos, int calorias, int limite) {
		return lPlatillos.stream().
					filter(p -> p.getCalorias() > calorias). //Operacion intermedia
					map(Platillo::getNombre). //Operacion intermedia
					limit(limite).	//Operacion intermedia
					collect(Collectors.toList()); //Operacion final
	}
	
	private static void precioPlatilloMasCaroStream(List<Platillo> lPlatillos) {
		Optional<Double> platilloMasCaro = lPlatillos.stream().
													  map(Platillo::getPrecio). //Operacion intermedia
													  max(Double::compare); //Operacion Final
		System.out.println(platilloMasCaro.get());
	}
	
	private static void precioPlatilloMasCaro(List<Platillo> lPlatillos) {
		double max = 0d;
		for (Platillo platillo : lPlatillos) {
			if(platillo.getPrecio() > max) {
				max = platillo.getPrecio();
			}
		}
		System.out.println(max);
	}
	
	private static void agruparPlatillosStream(List<Platillo> lPlatillos) {
		Map<Tipo, List<Platillo>> platillosPorTipo = lPlatillos.stream().
																collect(Collectors.groupingBy(Platillo::getTipo));
		platillosPorTipo.forEach((k,v) -> System.out.println(k +" , "+ v));
	}

}
