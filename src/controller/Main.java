package controller;

import java.io.File;
import model.Image;
import persistence.FileImageLoader;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\3º UNIVERSIDAD\\PRIMER SEMESTRE\\INGENIERÍA DEL SOFTWARE 2\\pruebaimageviewer");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
    
}
