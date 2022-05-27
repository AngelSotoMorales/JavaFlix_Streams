package javaflix.com.dataSource;

import java.util.ArrayList;
import java.util.List;
import javaflix.com.enums.Tipo;

import javaflix.com.pojos.Platillo;

public final class DataSource {
	
	public static final List<Platillo>generaPlatillos() {
		List<Platillo> lPlatillos = new ArrayList<>();
		try {
			lPlatillos.add(new Platillo("Ensalada cesar", 45.0, true, 20, (short) 3, Tipo.ENTRADA));
			lPlatillos.add(new Platillo("Enchiladas verdes", 110.0, true, 180, (short) 4  , Tipo.PRINCIPAL));
			lPlatillos.add(new Platillo("Pozole Gde Rojo", 80.50, false, 95, (short) 4  , Tipo.PRINCIPAL));
			lPlatillos.add(new Platillo("Boneless", 65.0, true, 100, (short) 3  , Tipo.ENTRADA));
			lPlatillos.add(new Platillo("Chorizo argentino", 330.0, true, 190, (short) 5  , Tipo.PRINCIPAL));
			lPlatillos.add(new Platillo("Arroz hervido", 60.0, false, 65, (short) 4  , Tipo.ENTRADA));
			lPlatillos.add(new Platillo("Brisket", 755.0, true, 290, (short) 5  , Tipo.PRINCIPAL));
			lPlatillos.add(new Platillo("Sirloin", 500.0, true, 195, (short) 5  , Tipo.PRINCIPAL));
			lPlatillos.add(new Platillo("Arroz con leche", 65.0, true, 75, (short) 5  , Tipo.POSTRE));
			lPlatillos.add(new Platillo("Flan napolitano", 50.0, true, 99, (short) 4  , Tipo.POSTRE));			
		} catch (Exception e) {
			System.out.println("Error generando informacion, "+e.getMessage());
		}
		return lPlatillos;
	}
}
