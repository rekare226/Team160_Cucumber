package utulities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties properties; //configuration.properties'deki tum key-valueler yuklendi

    static { //static blok herseyden önce calisir

        String dosyaYolu="configuration.properties";



        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fis);
        } catch (Exception e) {

            System.out.println("properties dosyasi okunamadi");
        }




    } //static blok herseyden önce calisir ve configuration.properties dosyasındaki
    // key value ikililerini properties objesine yukler

    public static String getProperty(String key){

        return properties.getProperty(key);

}
