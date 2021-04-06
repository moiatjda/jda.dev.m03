/*
 * Aquest programa és una demostració de com es pot fer sonar un WAV en
 * Java
 */
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;
public class DemoPicarol {

    public static void main(String[] args) throws Exception {
        sona();
    }

    /** Fa sonar el picarol.
     * En cas que no sigui possible per qualsevol
     * motiu (ex. el fitxer no estigui disponible, o no contingui un
     * format reconegut), el procediment falla silenciosament.
     */
    public static void sona() {
        try {
            File fitxer = new File("picarol.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(fitxer);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            Thread.sleep(600);
        } catch (IOException e) {
        } catch (InterruptedException e) {
        } catch (UnsupportedAudioFileException e) {
        } catch (LineUnavailableException e) {}
    }
}

