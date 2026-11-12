package javazoom.jl.player;

import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public interface AudioDevice {
    void close();

    void flush();

    int getPosition();

    boolean isOpen();

    void open(Decoder decoder) throws JavaLayerException;

    void write(short[] sArr, int i, int i2) throws JavaLayerException;
}
