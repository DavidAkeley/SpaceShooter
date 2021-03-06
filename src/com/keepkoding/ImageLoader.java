package com.keepkoding;

import java.io.IOException;
import java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class ImageLoader {
    /** Loads and returns a BufferedImage from the  assets  directory  given
     *  the  name  of  the  image  file  in  the assets directory (e.g. load
     *  com/keepkoding/assets/foo.png using ImageLoader.load("foo.png");
     */
    public static BufferedImage load(String name) {
        URL url = ImageLoader.class.getResource("assets/" + name);
        try {
            return ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException("Could not load image '"
                + name + "': '" + e.getMessage() + ".");
        }
    }
}


