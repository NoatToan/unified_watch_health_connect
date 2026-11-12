package javazoom.jl.converter;

/* JADX INFO: loaded from: classes22.dex */
public class WaveFile extends RiffFile {
    public static final int MAX_WAVE_CHANNELS = 2;
    private int e;
    private long d = 0;
    private RiffFile.a c = new RiffFile.a();
    private a b = new a();

    public class WaveFileSample {
        public short[] chan = new short[2];

        public WaveFileSample() {
        }
    }

    public class a {
        public RiffFile.a a;
        public b b;

        public a() {
            this.a = new RiffFile.a();
            this.b = WaveFile.this.new b();
            this.a.a = RiffFile.FourCC("fmt ");
            this.a.b = 16;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002f  */
        public int a() {
            boolean z;
            b bVar;
            short s;
            if (this.a.a == RiffFile.FourCC("fmt ") && ((s = (bVar = this.b).b) == 1 || s == 2)) {
                int i = bVar.d;
                int i2 = bVar.c * s;
                short s2 = bVar.f;
                if (i == (i2 * s2) / 8 && bVar.e == (s * s2) / 8) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            return z ? 1 : 0;
        }
    }

    public class b {
        public short a;
        public short b = 0;
        public int c = 0;
        public int d = 0;
        public short e = 0;
        public short f = 0;

        public b() {
            this.a = (short) 0;
            this.a = (short) 1;
            a(44100, (short) 16, (short) 1);
        }

        public void a(int i, short s, short s2) {
            this.c = i;
            this.b = s2;
            this.f = s;
            this.d = ((i * s2) * s) / 8;
            this.e = (short) ((s2 * s) / 8);
        }
    }

    public WaveFile() {
        this.e = 0;
        this.c.a = RiffFile.FourCC("data");
        this.c.b = 0;
        this.e = 0;
    }

    public short BitsPerSample() {
        return this.b.b.f;
    }

    @Override // javazoom.jl.converter.RiffFile
    public int Close() {
        int iBackpatch = this.fmode == 1 ? Backpatch(this.d, this.c, 8) : 0;
        return iBackpatch == 0 ? super.Close() : iBackpatch;
    }

    @Override // javazoom.jl.converter.RiffFile
    public long CurrentFilePosition() {
        return super.CurrentFilePosition();
    }

    public short NumChannels() {
        return this.b.b.b;
    }

    public int NumSamples() {
        return this.e;
    }

    public int OpenForWrite(String str, int i, short s, short s2) {
        if (str == null || (!(s == 8 || s == 16) || s2 < 1 || s2 > 2)) {
            return 4;
        }
        this.b.b.a(i, s, s2);
        int iOpen = Open(str, 1);
        if (iOpen != 0) {
            return iOpen;
        }
        int iWrite = Write(new byte[]{87, 65, 86, org.threeten.bp.a.o}, 4);
        if (iWrite != 0) {
            return iWrite;
        }
        Write(this.b.a, 8);
        Write(this.b.b.a, 2);
        Write(this.b.b.b, 2);
        Write(this.b.b.c, 4);
        Write(this.b.b.d, 4);
        Write(this.b.b.e, 2);
        int iWrite2 = Write(this.b.b.f, 2);
        if (iWrite2 != 0) {
            return iWrite2;
        }
        this.d = CurrentFilePosition();
        return Write(this.c, 8);
    }

    public int SamplingRate() {
        return this.b.b.c;
    }

    public int WriteData(short[] sArr, int i) {
        int i2 = i * 2;
        this.c.b += i2;
        return super.Write(sArr, i2);
    }

    public int OpenForWrite(String str, WaveFile waveFile) {
        return OpenForWrite(str, waveFile.SamplingRate(), waveFile.BitsPerSample(), waveFile.NumChannels());
    }
}
