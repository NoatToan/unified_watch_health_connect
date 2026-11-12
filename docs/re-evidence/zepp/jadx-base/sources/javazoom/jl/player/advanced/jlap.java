package javazoom.jl.player.advanced;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public class jlap {

    public class InfoListener extends PlaybackListener {
        public InfoListener() {
        }

        @Override // javazoom.jl.player.advanced.PlaybackListener
        public void playbackFinished(PlaybackEvent playbackEvent) {
            System.out.println("Play completed at frame " + playbackEvent.getFrame());
            System.exit(0);
        }

        @Override // javazoom.jl.player.advanced.PlaybackListener
        public void playbackStarted(PlaybackEvent playbackEvent) {
            System.out.println("Play started from frame " + playbackEvent.getFrame());
        }
    }

    public static class a extends Thread {
        public final /* synthetic */ AdvancedPlayer a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public a(AdvancedPlayer advancedPlayer, int i, int i2) {
            this.a = advancedPlayer;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.a.play(this.b, this.c);
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public static void main(String[] strArr) {
        jlap jlapVar = new jlap();
        if (strArr.length != 1) {
            jlapVar.showUsage();
            System.exit(0);
            return;
        }
        try {
            jlapVar.play(strArr[0]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
    }

    public static AdvancedPlayer playMp3(File file, PlaybackListener playbackListener) throws IOException, JavaLayerException {
        return playMp3(file, 0, Integer.MAX_VALUE, playbackListener);
    }

    public void play(String str) throws IOException, JavaLayerException {
        playMp3(new File(str), new InfoListener());
    }

    public void showUsage() {
        System.out.println("Usage: jla <filename>");
        System.out.println("");
        System.out.println(" e.g. : java javazoom.jl.player.advanced.jlap localfile.mp3");
    }

    public static AdvancedPlayer playMp3(File file, int i, int i2, PlaybackListener playbackListener) throws IOException, JavaLayerException {
        return playMp3(new BufferedInputStream(new FileInputStream(file)), i, i2, playbackListener);
    }

    public static AdvancedPlayer playMp3(InputStream inputStream, int i, int i2, PlaybackListener playbackListener) throws JavaLayerException {
        AdvancedPlayer advancedPlayer = new AdvancedPlayer(inputStream);
        advancedPlayer.setPlayBackListener(playbackListener);
        new a(advancedPlayer, i, i2).start();
        return advancedPlayer;
    }
}
