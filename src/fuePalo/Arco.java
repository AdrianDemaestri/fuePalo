package fuePalo;

import java.awt.*;

public class Arco {
    private Dimension dimension;

    public Arco(Dimension dimension) {
        this.dimension = dimension;
    }

    public Arco(int width, int height) {

        dimension = new Dimension(width, height);
    }

    public Dimension getDimension(){
        return  this.dimension;
    }


}

