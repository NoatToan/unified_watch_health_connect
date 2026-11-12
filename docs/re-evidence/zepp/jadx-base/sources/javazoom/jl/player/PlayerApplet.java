package javazoom.jl.player;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.applet.Applet;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public class PlayerApplet extends Applet implements Runnable {
    public static final String AUDIO_PARAMETER = "audioURL";
    private Player a = null;
    private Thread b = null;
    private String c = null;

    public Thread createPlayerThread() {
        return new Thread(this, "Audio player thread");
    }

    public void destroy() {
    }

    public AudioDevice getAudioDevice() throws JavaLayerException {
        return FactoryRegistry.systemRegistry().createAudioDevice();
    }

    public String getAudioFileName() {
        String str = this.c;
        return str == null ? getParameter(AUDIO_PARAMETER) : str;
    }

    public InputStream getAudioStream() {
        try {
            URL audioURL = getAudioURL();
            if (audioURL != null) {
                return FirebasePerfUrlConnection.openStream(audioURL);
            }
            return null;
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public URL getAudioURL() {
        String audioFileName = getAudioFileName();
        if (audioFileName != null) {
            try {
                return new URL(getDocumentBase(), audioFileName);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        return null;
    }

    public String getFileName() {
        return this.c;
    }

    public void init() {
    }

    public void play(InputStream inputStream, AudioDevice audioDevice) throws JavaLayerException {
        stopPlayer();
        if (inputStream == null || audioDevice == null) {
            return;
        }
        this.a = new Player(inputStream, audioDevice);
        Thread threadCreatePlayerThread = createPlayerThread();
        this.b = threadCreatePlayerThread;
        threadCreatePlayerThread.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        Player player = this.a;
        if (player != null) {
            try {
                player.play();
            } catch (JavaLayerException e) {
                System.err.println("Problem playing audio: " + e);
            }
        }
    }

    public void setFileName(String str) {
        this.c = str;
    }

    public void start() {
        String audioFileName = getAudioFileName();
        try {
            play(getAudioStream(), getAudioDevice());
        } catch (JavaLayerException e) {
            synchronized (System.err) {
                System.err.println("Unable to play " + audioFileName);
                e.printStackTrace(System.err);
            }
        }
    }

    public void stop() {
        try {
            stopPlayer();
        } catch (JavaLayerException e) {
            System.err.println(e);
        }
    }

    public void stopPlayer() throws JavaLayerException {
        Player player = this.a;
        if (player != null) {
            player.close();
            this.a = null;
            this.b = null;
        }
    }
}
