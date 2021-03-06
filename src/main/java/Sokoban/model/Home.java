package Sokoban.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Home extends GameObject {

    private static BufferedImage image;
    private  String RESOURCE_PATH =  getClass().getPackage().getName()
            .replaceAll("\\.", "/")
            .replace("Sokoban/model", "pic/home2.png");

    public Home(int x, int y) {
        super(x, y, 2, 2);
        try {
            final URL url = getClass().getClassLoader().getResource(RESOURCE_PATH);
            image = ImageIO.read(url);
        }
        catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void draw(Graphics graphics) {
        int width = Model.FIELD_CELL_SIZE;
        graphics.drawImage(image, getX()-width/2, getY()-width/2,null);
    }
}
