package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
public class SampleBuffer extends Obuffer {
    private short[] a = new short[2304];
    private int[] b = new int[2];
    private int c;
    private int d;

    public SampleBuffer(int i, int i2) {
        this.c = i2;
        this.d = i;
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i3] = (short) i3;
        }
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void append(int i, short s) {
        short[] sArr = this.a;
        int[] iArr = this.b;
        sArr[iArr[i]] = s;
        iArr[i] = iArr[i] + this.c;
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void appendSamples(int i, float[] fArr) {
        int i2 = this.b[i];
        int i3 = 0;
        while (i3 < 32) {
            int i4 = i3 + 1;
            float f = fArr[i3];
            if (f > 32767.0f) {
                f = 32767.0f;
            } else if (f < -32767.0f) {
                f = -32767.0f;
            }
            this.a[i2] = (short) f;
            i2 += this.c;
            i3 = i4;
        }
        this.b[i] = i2;
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void clear_buffer() {
        for (int i = 0; i < this.c; i++) {
            this.b[i] = (short) i;
        }
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void close() {
    }

    public short[] getBuffer() {
        return this.a;
    }

    public int getBufferLength() {
        return this.b[0];
    }

    public int getChannelCount() {
        return this.c;
    }

    public int getSampleFrequency() {
        return this.d;
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void set_stop_flag() {
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void write_buffer(int i) {
    }
}
