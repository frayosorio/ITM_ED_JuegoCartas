package juegocartas;

import java.util.Random;
import javax.swing.JPanel;

public class Jugador {

    private int TOTAL_CARTAS = 0;

    private Carta[] cartas = new Carta[TOTAL_CARTAS];
    private Random r;

    public Jugador() {
        r = new Random();
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        //for (int i = 0; i < cartas.length; i++) {
        for(Carta c:cartas){
            //cartas[i].mostrar(pnl, 10, 5);
            c.mostrar(pnl, 10, 5);
        }
        pnl.repaint();
    }

}
