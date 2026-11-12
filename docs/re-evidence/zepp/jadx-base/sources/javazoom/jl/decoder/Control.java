package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
public interface Control {
    double getPosition();

    boolean isPlaying();

    boolean isRandomAccess();

    void pause();

    void setPosition(double d);

    void start();

    void stop();
}
