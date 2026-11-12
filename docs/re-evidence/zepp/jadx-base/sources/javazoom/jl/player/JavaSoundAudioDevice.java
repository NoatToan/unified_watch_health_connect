package javazoom.jl.player;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public class JavaSoundAudioDevice extends AudioDeviceBase {
    private SourceDataLine c = null;
    private AudioFormat d = null;
    private byte[] e = new byte[4096];

    @Override // javazoom.jl.player.AudioDeviceBase
    public void closeImpl() {
        SourceDataLine sourceDataLine = this.c;
        if (sourceDataLine != null) {
            sourceDataLine.close();
        }
    }

    public void createSource() throws JavaLayerException {
        try {
            SourceDataLine line = AudioSystem.getLine(getSourceLineInfo());
            if (line instanceof SourceDataLine) {
                SourceDataLine sourceDataLine = line;
                this.c = sourceDataLine;
                sourceDataLine.open(this.d);
                this.c.start();
            }
            e = null;
        } catch (RuntimeException e) {
            e = e;
        } catch (LineUnavailableException e2) {
            e = e2;
        } catch (LinkageError e3) {
            e = e3;
        }
        if (this.c == null) {
            throw new JavaLayerException("cannot obtain source audio line", e);
        }
    }

    @Override // javazoom.jl.player.AudioDeviceBase
    public void flushImpl() {
        SourceDataLine sourceDataLine = this.c;
        if (sourceDataLine != null) {
            sourceDataLine.drain();
        }
    }

    public AudioFormat getAudioFormat() {
        if (this.d == null) {
            Decoder decoder = getDecoder();
            this.d = new AudioFormat(decoder.getOutputFrequency(), 16, decoder.getOutputChannels(), true, false);
        }
        return this.d;
    }

    public byte[] getByteArray(int i) {
        if (this.e.length < i) {
            this.e = new byte[i + 1024];
        }
        return this.e;
    }

    @Override // javazoom.jl.player.AudioDevice
    public int getPosition() {
        SourceDataLine sourceDataLine = this.c;
        if (sourceDataLine != null) {
            return (int) (sourceDataLine.getMicrosecondPosition() / 1000);
        }
        return 0;
    }

    public DataLine.Info getSourceLineInfo() {
        return new DataLine.Info(SourceDataLine.class, getAudioFormat());
    }

    public int millisecondsToBytes(AudioFormat audioFormat, int i) {
        return (int) (((double) (i * ((audioFormat.getSampleRate() * audioFormat.getChannels()) * audioFormat.getSampleSizeInBits()))) / 8000.0d);
    }

    public void open(AudioFormat audioFormat) throws JavaLayerException {
        if (isOpen()) {
            return;
        }
        setAudioFormat(audioFormat);
        openImpl();
        setOpen(true);
    }

    @Override // javazoom.jl.player.AudioDeviceBase
    public void openImpl() throws JavaLayerException {
    }

    public void setAudioFormat(AudioFormat audioFormat) {
        this.d = audioFormat;
    }

    public void test() throws JavaLayerException {
        try {
            open(new AudioFormat(22050.0f, 16, 1, true, false));
            write(new short[2205], 0, 2205);
            flush();
            close();
        } catch (RuntimeException e) {
            throw new JavaLayerException("Device test failed: " + e);
        }
    }

    public byte[] toByteArray(short[] sArr, int i, int i2) {
        byte[] byteArray = getByteArray(i2 * 2);
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return byteArray;
            }
            int i5 = i + 1;
            short s = sArr[i];
            int i6 = i3 + 1;
            byteArray[i3] = (byte) s;
            i3 = i6 + 1;
            byteArray[i6] = (byte) (s >>> 8);
            i = i5;
            i2 = i4;
        }
    }

    @Override // javazoom.jl.player.AudioDeviceBase
    public void writeImpl(short[] sArr, int i, int i2) throws JavaLayerException {
        if (this.c == null) {
            createSource();
        }
        this.c.write(toByteArray(sArr, i, i2), 0, i2 * 2);
    }
}
