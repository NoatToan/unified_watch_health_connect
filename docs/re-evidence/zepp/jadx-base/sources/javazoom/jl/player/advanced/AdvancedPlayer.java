package javazoom.jl.player.advanced;

import java.io.InputStream;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;

/* JADX INFO: loaded from: classes23.dex */
public class AdvancedPlayer {
    private Bitstream a;
    private Decoder b;
    private AudioDevice c;
    private boolean d;
    private boolean e;
    private int f;
    private PlaybackListener g;

    public AdvancedPlayer(InputStream inputStream) throws JavaLayerException {
        this(inputStream, null);
    }

    private PlaybackEvent a(int i) {
        return b(this.c, i);
    }

    private PlaybackEvent b(AudioDevice audioDevice, int i) {
        return new PlaybackEvent(this, i, audioDevice.getPosition());
    }

    public synchronized void close() {
        AudioDevice audioDevice = this.c;
        if (audioDevice != null) {
            this.d = true;
            this.c = null;
            audioDevice.close();
            this.f = audioDevice.getPosition();
            try {
                this.a.close();
            } catch (BitstreamException unused) {
            }
        }
    }

    public boolean decodeFrame() throws JavaLayerException {
        Header frame;
        try {
            if (this.c == null || (frame = this.a.readFrame()) == null) {
                return false;
            }
            SampleBuffer sampleBuffer = (SampleBuffer) this.b.decodeFrame(frame, this.a);
            synchronized (this) {
                AudioDevice audioDevice = this.c;
                if (audioDevice != null) {
                    audioDevice.write(sampleBuffer.getBuffer(), 0, sampleBuffer.getBufferLength());
                }
            }
            this.a.closeFrame();
            return true;
        } catch (RuntimeException e) {
            throw new JavaLayerException("Exception decoding audio frame", e);
        }
    }

    public PlaybackListener getPlayBackListener() {
        return this.g;
    }

    public void play() throws JavaLayerException {
        play(Integer.MAX_VALUE);
    }

    public void setPlayBackListener(PlaybackListener playbackListener) {
        this.g = playbackListener;
    }

    public boolean skipFrame() throws JavaLayerException {
        if (this.a.readFrame() == null) {
            return false;
        }
        this.a.closeFrame();
        return true;
    }

    public void stop() {
        this.g.playbackFinished(a(PlaybackEvent.STOPPED));
        close();
    }

    public AdvancedPlayer(InputStream inputStream, AudioDevice audioDevice) throws JavaLayerException {
        this.d = false;
        this.e = false;
        this.f = 0;
        this.a = new Bitstream(inputStream);
        if (audioDevice != null) {
            this.c = audioDevice;
        } else {
            this.c = FactoryRegistry.systemRegistry().createAudioDevice();
        }
        AudioDevice audioDevice2 = this.c;
        Decoder decoder = new Decoder();
        this.b = decoder;
        audioDevice2.open(decoder);
    }

    public boolean play(int i) throws JavaLayerException {
        PlaybackListener playbackListener = this.g;
        if (playbackListener != null) {
            playbackListener.playbackStarted(a(PlaybackEvent.STARTED));
        }
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
        AudioDevice audioDevice = this.c;
        if (audioDevice != null) {
            audioDevice.flush();
            synchronized (this) {
                if (this.d) {
                    z = false;
                }
                this.e = z;
                close();
            }
            PlaybackListener playbackListener2 = this.g;
            if (playbackListener2 != null) {
                playbackListener2.playbackFinished(b(audioDevice, PlaybackEvent.STOPPED));
            }
        }
        return zDecodeFrame;
    }

    public boolean play(int i, int i2) throws JavaLayerException {
        boolean zSkipFrame = true;
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0 || !zSkipFrame) {
                break;
            }
            zSkipFrame = skipFrame();
            i3 = i4;
        }
        return play(i2 - i);
    }
}
