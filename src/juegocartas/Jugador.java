package juegocartas;

import java.util.Random;
import javax.swing.JPanel;

public class Jugador {

    private int TOTAL_CARTAS = 10;
    private int MARGEN_SUPERIOR = 10;
    private int MARGEN_IZQUIERDA = 10;
    private int DISTANCIA = 50;

    private Carta[] cartas = new Carta[TOTAL_CARTAS];
    private Random r;

    public Jugador() {
        r = new Random();
    }

    public void repartir() {
        for (int i = 0; i < TOTAL_CARTAS; i++) {
            cartas[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        //for (int i = 0; i < cartas.length; i++) {

        int x = MARGEN_IZQUIERDA;
        for (Carta c : cartas) {
            //cartas[i].mostrar(pnl, 10, 5);
            c.mostrar(pnl, x, MARGEN_SUPERIOR);
            x += DISTANCIA;
        }
        pnl.repaint();
    }

}
