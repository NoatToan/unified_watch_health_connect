package javazoom.jl.player;

import java.io.InputStream;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;

/* JADX INFO: loaded from: classes23.dex */
public class Player {
    private int a;
    private Bitstream b;
    private Decoder c;
    private AudioDevice d;
    private boolean e;
    private boolean f;
    private int g;

    public Player(InputStream inputStream) throws JavaLayerException {
        this(inputStream, null);
    }

    public synchronized void close() {
        AudioDevice audioDevice = this.d;
        if (audioDevice != null) {
            this.e = true;
            this.d = null;
            audioDevice.close();
            this.g = audioDevice.getPosition();
            try {
                this.b.close();
            } catch (BitstreamException unused) {
            }
        }
    }

    public boolean decodeFrame() throws JavaLayerException {
        Header frame;
        try {
            if (this.d == null || (frame = this.b.readFrame()) == null) {
                return false;
            }
            SampleBuffer sampleBuffer = (SampleBuffer) this.c.decodeFrame(frame, this.b);
            synchronized (this) {
                AudioDevice audioDevice = this.d;
                if (audioDevice != null) {
                    audioDevice.write(sampleBuffer.getBuffer(), 0, sampleBuffer.getBufferLength());
                }
            }
            this.b.closeFrame();
            return true;
        } catch (RuntimeException e) {
            throw new JavaLayerException("Exception decoding audio frame", e);
        }
    }

    public int getPosition() {
        int i = this.g;
        AudioDevice audioDevice = this.d;
        return audioDevice != null ? audioDevice.getPosition() : i;
    }

    public synchronized boolean isComplete() {
        return this.f;
    }

    public void play() throws JavaLayerException {
        play(Integer.MAX_VALUE);
    }

    public Player(InputStream inputStream, AudioDevice audioDevice) throws JavaLayerException {
        this.a = 0;
        this.e = false;
        this.f = false;
        this.g = 0;
        this.b = new Bitstream(inputStream);
        this.c = new Decoder();
        if (audioDevice != null) {
            this.d = audioDevice;
        } else {
            this.d = FactoryRegistry.systemRegistry().createAudioDevice();
        }
        this.d.open(this.c);
    }

    public boolean play(int i) throws JavaLayerException {
        AudioDevice audioDevice;
        boolean z = true;
        boolean zDecodeFrame = true;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || !zDecodeFrame) {
                break;
            }
            zDecodeFrame = decodeFrame();
            i = i2;
        }
        if (!zDecodeFrame && (audioDevice = this.d) != null) {
            audioDevice.flush();
            synchronized (this) {
                if (this.e) {
                    z = false;
                }
                this.f = z;
                close();
            }
        }
        return zDecodeFrame;
    }
}
