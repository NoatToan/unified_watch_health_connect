package javazoom.jl.player;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public class jlp {
    private String a = null;
    private boolean b = false;

    private jlp() {
    }

    public static jlp createInstance(String[] strArr) {
        jlp jlpVar = new jlp();
        if (jlpVar.parseArgs(strArr)) {
            return jlpVar;
        }
        return null;
    }

    public static void main(String[] strArr) {
        int i;
        try {
            jlp jlpVarCreateInstance = createInstance(strArr);
            if (jlpVarCreateInstance != null) {
                jlpVarCreateInstance.play();
            }
            i = 0;
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace(System.err);
            i = 1;
        }
        System.exit(i);
    }

    public AudioDevice getAudioDevice() throws JavaLayerException {
        return FactoryRegistry.systemRegistry().createAudioDevice();
    }

    public InputStream getInputStream() throws IOException {
        return new BufferedInputStream(new FileInputStream(this.a));
    }

    public InputStream getURLInputStream() throws Exception {
        return new BufferedInputStream(FirebasePerfUrlConnection.openStream(new URL(this.a)));
    }

    public void init(String str) {
        this.a = str;
    }

    public boolean parseArgs(String[] strArr) {
        if (strArr.length == 1) {
            init(strArr[0]);
            this.b = false;
        } else {
            if (strArr.length != 2) {
                showUsage();
                return false;
            }
            if (!strArr[0].equals("-url")) {
                showUsage();
                return false;
            }
            init(strArr[1]);
            this.b = true;
        }
        return true;
    }

    public void play() throws JavaLayerException {
        try {
            System.out.println("playing " + this.a + "...");
            new Player(this.b ? getURLInputStream() : getInputStream(), getAudioDevice()).play();
        } catch (IOException e) {
            throw new JavaLayerException("Problem playing file " + this.a, e);
        } catch (Exception e2) {
            throw new JavaLayerException("Problem playing file " + this.a, e2);
        }
    }

    public void showUsage() {
        System.out.println("Usage: jlp [-url] <filename>");
        System.out.println("");
        System.out.println(" e.g. : java javazoom.jl.player.jlp localfile.mp3");
        System.out.println("        java javazoom.jl.player.jlp -url http://www.server.com/remotefile.mp3");
        System.out.println("        java javazoom.jl.player.jlp -url http://www.shoutcastserver.com:8000");
    }

    public jlp(String str) {
        init(str);
    }
}
