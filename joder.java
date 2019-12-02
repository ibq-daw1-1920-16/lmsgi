package Maquina;

import java.util.Scanner;

public class joder {

	static int cafe = 20, descafeinado = 20, te = 20, cincoCentimos = 5, diezCentimos = 5, veinteCentimos = 5,
			cincuentaCentimos = 5, cienCentimos = 5, doscientosCentimos = 5, saldoTotal = 0;

	// Creo que esto no es una buena practica(o no es bueno acostumbrarse a usarlo)
	// pero no se me ocurre otra manera

	public static int getUnCafe() {
		cafe--;
		return cafe;
	}

	public static int getUnDescafeinado() {
		descafeinado--;
		return descafeinado;
	}

	public static int getUnTe() {
		te--;
		return te;
	}

	public static int getCincoCentimos() {
		cincoCentimos++;
		return cincoCentimos;
	}

	public static int getDiezCentimos() {
		diezCentimos++;
		return diezCentimos;
	}

	public static int getVeinteCentimos() {
		veinteCentimos++;
		return veinteCentimos;
	}

	public static int getCincuentaCentimos() {
		cincuentaCentimos++;
		return cincuentaCentimos;
	}

	public static int getCienCentimos() {
		cienCentimos++;
		return cienCentimos;
	}

	public static int getDoscientosCentimos() {
		doscientosCentimos++;
		return doscientosCentimos;
	}

	// operaciones

	public static void menuPrincipal() {
		menuPrincipalInterfaz();
		menuPrincipalSwitch();

		// Primer menu
	}

	private static void menuPrincipalInterfaz() {

		System.out.println("             MENÚ");
		System.out.println("            ======");
		System.out.println("0 - Introducir monedas");
		System.out.println("1 - Cafe solo        (0,80) € Unidades = " + cafe);
		System.out.println("2 - Descafeinado     (0,70) € Unidades = " + descafeinado);
		System.out.println("3 - Te               (0,50) € Unidades = " + te);
		System.out.println("4 - Menu administración");
		System.out.println("");
		System.out.println("5 - Cancelar operación");
		System.out.println("9 - Apagar la maquina");

		// Interfaz principal
	}

	private static void menuPrincipalSwitch() {
		int scanner2;
		Scanner scanner = new Scanner(System.in);
		scanner2 = scanner.nextInt();

		switch (scanner2) {
		case 0:
			menuMonedas();
			break;
		case 1:

			getUnCafe();
			menuPrincipalInterfaz();

			break;

		case 2:

			getUnDescafeinado();
			menuPrincipalInterfaz();

			break;

		case 3:
			getUnTe();
			menuPrincipalInterfaz();
			break;

		case 4:
			menuAdministracion();
			break;
		case 5:
			System.out.println("Cancelando operación");
			menuPrincipal();

			break;
		case 9:
			apagarMaquina();
			break;

		default:
			System.out.println("Seleciona Una opcion correcta, volviendo al menu");
			menuPrincipal();
			break;
		}

		// switch principal
	}

	private static void apagarMaquina() {
		System.out.println("Apagando Maquina");
		// Off
	}

	private static void menuMonedas() {

		menuMonedasInterfaz();
		menuMonedasSwitch();

		// Menu Monedas
	}

	private static void menuMonedasInterfaz() {
		System.out.println("Introduce moneda");
		System.out.println("===================");
		System.out.println("");
		System.out.println("5 => 5 Cts   . El cajetin tiene " + cincoCentimos);
		System.out.println("10 => 10 Cts . El cajetin tiene " + diezCentimos);
		System.out.println("20 => 20 Cts . El cajetin tiene " + veinteCentimos);
		System.out.println("50 => 50 Cts . El cajetin tiene " + cincuentaCentimos);
		System.out.println("1 => 100 Cts . El cajetin tiene " + cienCentimos);
		System.out.println("2 => 200 Cts . El cajetin tiene " + doscientosCentimos);
		System.out.println("0 => Finalizar");
		System.out.println("Su credito es de ");

		// Interfaz menu monedas
	}

	private static void menuMonedasSwitch() {
		int scanner2;
		Scanner scanner = new Scanner(System.in);
		scanner2 = scanner.nextInt();
		switch (scanner2) {
		case 5:
			getCincoCentimos();
			menuMonedas();
			break;
		case 10:
			getDiezCentimos();
			menuMonedas();
			break;
		case 20:
			getVeinteCentimos();
			menuMonedas();
			break;
		case 50:
			getCincuentaCentimos();
			menuMonedas();
			break;
		case 1:
			getCienCentimos();
			menuMonedas();
			break;
		case 2:
			getDoscientosCentimos();
			menuMonedas();
			break;
		case 0:
			System.out.println("finalizando, volviendo al menu principal");
			menuPrincipal();

			break;
		default:
			System.out.println("Error, Introduzca un valor adecuado");
			menuMonedas();

			break;
		}
	}

	private static void menuAdministracion() {
		menuAdministracinInterfaz();
		menuAdministracionSwitch();
	}

	private static void menuAdministracinInterfaz() {
		System.out.println("MENU ADMINISTRACION");
		System.out.println("");
		System.out.println("===================");
		System.out.println("");
		System.out.println("1- Mostrar contenido de cajetines");
		System.out.println("2- Modificar precios productos");
		System.out.println("3- Mostrar unidades vendidas");
		System.out.println("4- Añadir productos (No implementado)");
		System.out.println("0- Volver");
	}

	private static void menuAdministracionSwitch() {
		int scanner2;
		Scanner scanner = new Scanner(System.in);
		scanner2 = scanner.nextInt();

		switch (scanner2) {
		case 1:

			break;

		case 2:

			break;
		case 3:

			break;
		case 4:
			System.out.println("funcion no implementada");
			menuAdministracion();
			break;

		case 0:
			System.out.println("Volviendo al menu principal");
			menuPrincipal();

			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {

		menuPrincipal();

	}

}
