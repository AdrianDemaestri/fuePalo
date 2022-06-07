package fuePalo;

import java.awt.*;

public class Pelota {
    private int trayectoY;
    private int trayectoX;

    public Pelota(int trayectoY, int trayectoX) {
        if(trayectoY < 0)
            throw new RuntimeException("La trayectoria en Y no puede ser" +
                    "menor a 0");
        this.trayectoY = trayectoY;
        this.trayectoX = trayectoX;
    }

    public int getY() {
        return trayectoY;
    }

    public int getX() {
        return trayectoX;
    }
}
