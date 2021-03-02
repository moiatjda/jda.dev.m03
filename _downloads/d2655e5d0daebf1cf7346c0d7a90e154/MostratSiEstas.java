/*
 * programa que mostra el seu propi codi
 * Nota: en cas que el codi font no es trobi a la carpeta actual, mostra un error
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class MostratSiEstas {
    public static void main(String[] args) throws IOException {
        String cami = "MostratSiEstas.java";
        File fitxer = new File(cami);
        if (! fitxer.exists()) {
            System.out.println("Error: no es troba el fitxer: " + cami);
            return;
        }
        FileReader fileReader = new FileReader(fitxer);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            System.out.println(linia);
        }
        input.close();
    }
}

