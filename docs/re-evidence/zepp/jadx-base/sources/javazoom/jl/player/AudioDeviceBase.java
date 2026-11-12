package javazoom.jl.player;

import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AudioDeviceBase implements AudioDevice {
    private boolean a = false;
    private Decoder b = null;

    @Override // javazoom.jl.player.AudioDevice
    public synchronized void close() {
        if (isOpen()) {
            closeImpl();
            setOpen(false);
            this.b = null;
        }
    }

    public void closeImpl() {
    }

    @Override // javazoom.jl.player.AudioDevice
    public void flush() {
        if (isOpen()) {
            flushImpl();
        }
    }

    public void flushImpl() {
    }

    public Decoder getDecoder() {
        return this.b;
    }

    @Override // javazoom.jl.player.AudioDevice
    public synchronized boolean isOpen() {
        return this.a;
    }

    @Override // javazoom.jl.player.AudioDevice
    public synchronized void open(Decoder decoder) throws JavaLayerException {
        if (!isOpen()) {
            this.b = decoder;
            openImpl();
            setOpen(true);
        }
    }

    public void openImpl() throws JavaLayerException {
    }

    public void setOpen(boolean z) {
        this.a = z;
    }

    @Override // javazoom.jl.player.AudioDevice
    public void write(short[] sArr, int i, int i2) throws JavaLayerException {
        if (isOpen()) {
            writeImpl(sArr, i, i2);
        }
    }

    public void writeImpl(short[] sArr, int i, int i2) throws JavaLayerException {
    }
}
