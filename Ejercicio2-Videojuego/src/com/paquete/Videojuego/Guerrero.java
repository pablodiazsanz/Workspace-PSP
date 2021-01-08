package com.paquete.Videojuego;

public class Guerrero extends Personaje {
	private String grito = "ARRRGGGGGGGGG";
	private int danoRealizado;
	private int num, numAleatorio;

	public Guerrero(Arma arma, String nombre, int puntosDeVida, int atributoEspecifico) {
		super(arma, nombre, puntosDeVida, atributoEspecifico);
	}

	public int atacar() {
		System.out.println(grito);
		getArma().usar();
		num = (int) Math.floor(Math.random() * 9 + 1);
		numAleatorio = (int) Math.floor(Math.random() * 9 + 1);
		if (num == numAleatorio) {
			System.out.println("GOLPE CRITICO");
			danoRealizado = 2000;
			System.out.println("Daño Realizado: " + danoRealizado);
		} else {
			if (getArma() instanceof Espada || getArma().getClass() == Arco.class) {
				danoRealizado = getArma().getDanoEspecifico() + getAtributoEspecifico();
				System.out.println(getNombre() + " ha utilizado un arma de su atributo especial FUERZA");
				System.out.println("Daño Realizado: " + danoRealizado);
			} else {
				danoRealizado = getArma().getDanoEspecifico();
				System.out.println(getNombre() + " ha atacado a su rival.");
				System.out.println("Daño Realizado: " + danoRealizado);
			}
		}
		return danoRealizado;
	}

}
