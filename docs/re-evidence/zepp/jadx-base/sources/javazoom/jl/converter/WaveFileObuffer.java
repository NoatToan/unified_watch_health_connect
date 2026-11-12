package javazoom.jl.converter;

import java.util.Objects;
import javazoom.jl.decoder.Obuffer;

/* JADX INFO: loaded from: classes22.dex */
public class WaveFileObuffer extends Obuffer {
    private short[] a;
    private short[] b;
    private int c;
    private WaveFile d;
    public short[] e = new short[2];

    public WaveFileObuffer(int i, int i2, String str) {
        Objects.requireNonNull(str, "FileName");
        this.a = new short[2304];
        this.b = new short[2];
        this.c = i;
        for (int i3 = 0; i3 < i; i3++) {
            this.b[i3] = (short) i3;
        }
        WaveFile waveFile = new WaveFile();
        this.d = waveFile;
        waveFile.OpenForWrite(str, i2, (short) 16, (short) this.c);
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void append(int i, short s) {
        short[] sArr = this.a;
        short[] sArr2 = this.b;
        sArr[sArr2[i]] = s;
        sArr2[i] = (short) (sArr2[i] + this.c);
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void clear_buffer() {
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void close() {
        this.d.Close();
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void set_stop_flag() {
    }

    @Override // javazoom.jl.decoder.Obuffer
    public void write_buffer(int i) {
        this.d.WriteData(this.a, this.b[0]);
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b[i2] = (short) i2;
        }
    }
}
