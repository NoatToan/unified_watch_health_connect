package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
class b implements FrameDecoder {
    public Bitstream a;
    public Header b;
    public e c;
    public e d;
    public Obuffer e;
    public int f;
    public int g;
    public int h;
    public a[] i;
    public Crc16 j;

    public static abstract class a {
        public static final float[] a = {2.0f, 1.587401f, 1.2599211f, 1.0f, 0.7937005f, 0.62996054f, 0.5f, 0.39685026f, 0.31498027f, 0.25f, 0.19842513f, 0.15749013f, 0.125f, 0.099212565f, 0.07874507f, 0.0625f, 0.049606282f, 0.039372534f, 0.03125f, 0.024803141f, 0.019686267f, 0.015625f, 0.012401571f, 0.009843133f, 0.0078125f, 0.0062007853f, 0.0049215667f, 0.00390625f, 0.0031003926f, 0.0024607833f, 0.001953125f, 0.0015501963f, 0.0012303917f, 9.765625E-4f, 7.7509816E-4f, 6.1519584E-4f, 4.8828125E-4f, 3.8754908E-4f, 3.0759792E-4f, 2.4414062E-4f, 1.9377454E-4f, 1.5379896E-4f, 1.2207031E-4f, 9.688727E-5f, 7.689948E-5f, 6.1035156E-5f, 4.8443635E-5f, 3.844974E-5f, 3.0517578E-5f, 2.4221818E-5f, 1.922487E-5f, 1.5258789E-5f, 1.2110909E-5f, 9.612435E-6f, 7.6293945E-6f, 6.0554544E-6f, 4.8062175E-6f, 3.8146973E-6f, 3.0277272E-6f, 2.4031087E-6f, 1.9073486E-6f, 1.5138636E-6f, 1.2015544E-6f, 0.0f};

        public abstract boolean a(int i, e eVar, e eVar2);

        public abstract void b(Bitstream bitstream, Header header, Crc16 crc16) throws DecoderException;

        public abstract boolean c(Bitstream bitstream);

        public abstract void d(Bitstream bitstream, Header header);
    }

    /* JADX INFO: renamed from: javazoom.jl.decoder.b$b, reason: collision with other inner class name */
    public static class C1155b extends a {
        public static final float[] j = {0.0f, 0.6666667f, 0.2857143f, 0.13333334f, 0.06451613f, 0.031746034f, 0.015748031f, 0.007843138f, 0.0039138943f, 0.0019550342f, 9.770396E-4f, 4.884005E-4f, 2.4417043E-4f, 1.2207776E-4f, 6.103702E-5f};
        public static final float[] k = {0.0f, -0.6666667f, -0.8571429f, -0.9333334f, -0.9677419f, -0.98412704f, -0.992126f, -0.9960785f, -0.99804306f, -0.9990225f, -0.9995115f, -0.99975586f, -0.9998779f, -0.99993896f, -0.9999695f};
        public int b;
        public int c = 0;
        public int d;
        public float e;
        public int f;
        public float g;
        public float h;
        public float i;

        public C1155b(int i) {
            this.b = i;
        }

        @Override // javazoom.jl.decoder.b.a
        public boolean a(int i, e eVar, e eVar2) {
            if (this.d == 0 || i == 2) {
                return true;
            }
            eVar.u(((this.g * this.h) + this.i) * this.e, this.b);
            return true;
        }

        @Override // javazoom.jl.decoder.b.a
        public void b(Bitstream bitstream, Header header, Crc16 crc16) throws DecoderException {
            int i = bitstream.get_bits(4);
            this.d = i;
            if (i == 15) {
                throw new DecoderException(514, (Throwable) null);
            }
            if (crc16 != null) {
                crc16.add_bits(i, 4);
            }
            int i2 = this.d;
            if (i2 != 0) {
                this.f = i2 + 1;
                this.h = j[i2];
                this.i = k[i2];
            }
        }

        @Override // javazoom.jl.decoder.b.a
        public boolean c(Bitstream bitstream) {
            if (this.d != 0) {
                this.g = bitstream.get_bits(this.f);
            }
            int i = this.c + 1;
            this.c = i;
            if (i != 12) {
                return false;
            }
            this.c = 0;
            return true;
        }

        @Override // javazoom.jl.decoder.b.a
        public void d(Bitstream bitstream, Header header) {
            if (this.d != 0) {
                this.e = a.a[bitstream.get_bits(6)];
            }
        }
    }

    public static class c extends C1155b {
        public float l;

        public c(int i) {
            super(i);
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public boolean a(int i, e eVar, e eVar2) {
            if (this.d != 0) {
                float f = (this.g * this.h) + this.i;
                this.g = f;
                if (i == 0) {
                    float f2 = this.e * f;
                    float f3 = f * this.l;
                    eVar.u(f2, this.b);
                    eVar2.u(f3, this.b);
                } else if (i == 1) {
                    eVar.u(f * this.e, this.b);
                } else {
                    eVar.u(f * this.l, this.b);
                }
            }
            return true;
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public void b(Bitstream bitstream, Header header, Crc16 crc16) throws DecoderException {
            super.b(bitstream, header, crc16);
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public boolean c(Bitstream bitstream) {
            return super.c(bitstream);
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public void d(Bitstream bitstream, Header header) {
            if (this.d != 0) {
                float[] fArr = a.a;
                this.e = fArr[bitstream.get_bits(6)];
                this.l = fArr[bitstream.get_bits(6)];
            }
        }
    }

    public static class d extends C1155b {
        public int l;
        public float m;
        public int n;
        public float o;
        public float p;
        public float q;

        public d(int i) {
            super(i);
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public boolean a(int i, e eVar, e eVar2) {
            super.a(i, eVar, eVar2);
            if (this.l != 0 && i != 1) {
                float f = ((this.o * this.p) + this.q) * this.m;
                if (i == 0) {
                    eVar2.u(f, this.b);
                } else {
                    eVar.u(f, this.b);
                }
            }
            return true;
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public void b(Bitstream bitstream, Header header, Crc16 crc16) throws DecoderException {
            this.d = bitstream.get_bits(4);
            this.l = bitstream.get_bits(4);
            if (crc16 != null) {
                crc16.add_bits(this.d, 4);
                crc16.add_bits(this.l, 4);
            }
            int i = this.d;
            if (i != 0) {
                this.f = i + 1;
                this.h = C1155b.j[i];
                this.i = C1155b.k[i];
            }
            int i2 = this.l;
            if (i2 != 0) {
                this.n = i2 + 1;
                this.p = C1155b.j[i2];
                this.q = C1155b.k[i2];
            }
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public boolean c(Bitstream bitstream) {
            boolean zC = super.c(bitstream);
            if (this.l != 0) {
                this.o = bitstream.get_bits(this.n);
            }
            return zC;
        }

        @Override // javazoom.jl.decoder.b.C1155b, javazoom.jl.decoder.b.a
        public void d(Bitstream bitstream, Header header) {
            if (this.d != 0) {
                this.e = a.a[bitstream.get_bits(6)];
            }
            if (this.l != 0) {
                this.m = a.a[bitstream.get_bits(6)];
            }
        }
    }

    public b() {
        this.j = null;
        this.j = new Crc16();
    }

    public void a(Bitstream bitstream, Header header, e eVar, e eVar2, Obuffer obuffer, int i) {
        this.a = bitstream;
        this.b = header;
        this.c = eVar;
        this.d = eVar2;
        this.e = obuffer;
        this.f = i;
    }

    public void b() {
        int i = this.g;
        int i2 = 0;
        if (i == 3) {
            while (i2 < this.h) {
                this.i[i2] = new C1155b(i2);
                i2++;
            }
        } else if (i != 1) {
            while (i2 < this.h) {
                this.i[i2] = new d(i2);
                i2++;
            }
        } else {
            while (i2 < this.b.intensity_stereo_bound()) {
                this.i[i2] = new d(i2);
                i2++;
            }
            while (i2 < this.h) {
                this.i[i2] = new c(i2);
                i2++;
            }
        }
    }

    public void c() throws DecoderException {
        for (int i = 0; i < this.h; i++) {
            this.i[i].b(this.a, this.b, this.j);
        }
    }

    public void d() {
        int iMode = this.b.mode();
        boolean zC = false;
        boolean zA = false;
        do {
            for (int i = 0; i < this.h; i++) {
                zC = this.i[i].c(this.a);
            }
            do {
                for (int i2 = 0; i2 < this.h; i2++) {
                    zA = this.i[i2].a(this.f, this.c, this.d);
                }
                this.c.a(this.e);
                if (this.f == 0 && iMode != 3) {
                    this.d.a(this.e);
                }
            } while (!zA);
        } while (!zC);
    }

    @Override // javazoom.jl.decoder.FrameDecoder
    public void decodeFrame() throws DecoderException {
        this.h = this.b.number_of_subbands();
        this.i = new a[32];
        this.g = this.b.mode();
        b();
        c();
        e();
        if (this.j != null || this.b.checksum_ok()) {
            f();
            d();
        }
    }

    public void e() {
    }

    public void f() {
        for (int i = 0; i < this.h; i++) {
            this.i[i].d(this.a, this.b);
        }
    }
}
