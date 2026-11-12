package nz2;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Cloneable {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final a[] f128385a1 = {new a(0, 0, 0, 0, 0), new a(4, 4, 8, 4, 1), new a(4, 5, 16, 8, 1), new a(4, 6, 32, 32, 1), new a(4, 4, 16, 16, 2), new a(8, 16, 32, 32, 2), new a(8, 16, 128, 128, 2), new a(8, 32, 128, 256, 2), new a(32, 128, 258, 1024, 2), new a(32, 258, 258, 4096, 2)};

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String[] f128386b1 = {"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int I;
    public int M0;
    public int N0;
    public int P;
    public byte[] P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public short X0;
    public int Y0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f128387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f128389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f128391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f128392f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f128394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f128395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f128396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f128397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f128399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f128400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f128401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public short[] f128402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public short[] f128403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f128404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f128405r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f128406t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f128407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f128408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f128410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f128411z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f128393g = 1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final j f128398k0 = new j();
    public final j H0 = new j();
    public final j I0 = new j();
    public short[] J0 = new short[16];
    public short[] K0 = new short[16];
    public int[] L0 = new int[573];
    public byte[] O0 = new byte[573];
    public g Z0 = null;
    public short[] X = new short[1146];
    public short[] Y = new short[122];
    public short[] Z = new short[78];

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f128412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f128413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f128414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f128415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f128416e;

        public a(int i14, int i15, int i16, int i17, int i18) {
            this.f128412a = i14;
            this.f128413b = i15;
            this.f128414c = i16;
            this.f128415d = i17;
            this.f128416e = i18;
        }
    }

    public d(k kVar) {
        this.f128387a = kVar;
    }

    public static short[] e(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095 A[RETURN] */
    public final boolean a(int i14, int i15) {
        byte[] bArr = this.f128389c;
        int i16 = this.S0;
        int i17 = this.R0;
        int i18 = (i17 * 2) + i16;
        bArr[i18] = (byte) (i14 >>> 8);
        bArr[i18 + 1] = (byte) i14;
        this.P0[i17] = (byte) i15;
        int i19 = i17 + 1;
        this.R0 = i19;
        if (i14 == 0) {
            short[] sArr = this.X;
            int i24 = i15 * 2;
            sArr[i24] = (short) (sArr[i24] + 1);
        } else {
            this.V0++;
            int i25 = i14 - 1;
            short[] sArr2 = this.X;
            int i26 = (j.f128450i[i15] + 257) * 2;
            sArr2[i26] = (short) (sArr2[i26] + 1);
            short[] sArr3 = this.Y;
            byte[] bArr2 = j.f128449h;
            int i27 = (i25 < 256 ? bArr2[i25] : bArr2[(i25 >>> 7) + 256]) * 2;
            sArr3[i27] = (short) (sArr3[i27] + 1);
        }
        if ((i19 & 8191) == 0 && this.I > 2) {
            int i28 = i19 * 8;
            int i29 = this.A - this.f128408w;
            for (int i30 = 0; i30 < 30; i30++) {
                i28 = (int) (((((long) j.f128446e[i30]) + 5) * ((long) this.Y[i30 * 2])) + ((long) i28));
            }
            int i34 = i28 >>> 3;
            if (this.V0 >= this.R0 / 2 || i34 >= i29 / 2) {
                if (this.R0 == this.Q0 - 1) {
                    return false;
                }
            }
        } else if (this.R0 == this.Q0 - 1) {
            return false;
        }
        return true;
    }

    public final void b() {
        int i14 = this.Y0;
        if (i14 == 16) {
            o(this.X0);
            this.X0 = (short) 0;
            this.Y0 = 0;
        } else if (i14 >= 8) {
            m((byte) this.X0);
            this.X0 = (short) (this.X0 >>> 8);
            this.Y0 -= 8;
        }
    }

    public final void c(short[] sArr, short[] sArr2) {
        if (this.R0 != 0) {
            int i14 = 0;
            do {
                byte[] bArr = this.f128389c;
                int i15 = (i14 * 2) + this.S0;
                int i16 = (bArr[i15 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr[i15] << 8) & 65280);
                int i17 = this.P0[i14] & UnsignedBytes.MAX_VALUE;
                i14++;
                if (i16 == 0) {
                    r(sArr, i17);
                } else {
                    byte b14 = j.f128450i[i17];
                    r(sArr, b14 + 257);
                    int i18 = j.f128445d[b14];
                    if (i18 != 0) {
                        q(i17 - j.f128451j[b14], i18);
                    }
                    int i19 = i16 - 1;
                    byte[] bArr2 = j.f128449h;
                    byte b15 = i19 < 256 ? bArr2[i19] : bArr2[(i19 >>> 7) + 256];
                    r(sArr2, b15);
                    int i24 = j.f128446e[b15];
                    if (i24 != 0) {
                        q(i19 - j.f128452k[b15], i24);
                    }
                }
            } while (i14 < this.R0);
        }
        r(sArr, 256);
        this.W0 = sArr[513];
    }

    public final Object clone() {
        d dVar = (d) super.clone();
        byte[] bArr = dVar.f128389c;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        dVar.f128389c = bArr2;
        dVar.S0 = dVar.S0;
        byte[] bArr3 = dVar.P0;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        System.arraycopy(bArr3, 0, bArr4, 0, length2);
        dVar.P0 = bArr4;
        byte[] bArr5 = dVar.f128400m;
        int length3 = bArr5.length;
        byte[] bArr6 = new byte[length3];
        System.arraycopy(bArr5, 0, bArr6, 0, length3);
        dVar.f128400m = bArr6;
        dVar.f128402o = e(dVar.f128402o);
        dVar.f128403p = e(dVar.f128403p);
        dVar.X = e(dVar.X);
        dVar.Y = e(dVar.Y);
        dVar.Z = e(dVar.Z);
        dVar.J0 = e(dVar.J0);
        dVar.K0 = e(dVar.K0);
        int[] iArr = dVar.L0;
        int length4 = iArr.length;
        int[] iArr2 = new int[length4];
        System.arraycopy(iArr, 0, iArr2, 0, length4);
        dVar.L0 = iArr2;
        byte[] bArr7 = dVar.O0;
        int length5 = bArr7.length;
        byte[] bArr8 = new byte[length5];
        System.arraycopy(bArr7, 0, bArr8, 0, length5);
        dVar.O0 = bArr8;
        dVar.f128398k0.f128453a = dVar.X;
        dVar.H0.f128453a = dVar.Y;
        dVar.I0.f128453a = dVar.Z;
        g gVar = dVar.Z0;
        if (gVar != null) {
            dVar.Z0 = (g) gVar.clone();
        }
        return dVar;
    }

    public final int d(int i14, int i15, int i16) {
        int i17;
        k kVar = this.f128387a;
        kVar.f128463h = null;
        if (i14 == -1) {
            i14 = 6;
        }
        if (i15 < 0) {
            i15 = -i15;
            i17 = 0;
        } else if (i15 > 15) {
            i15 -= 16;
            kVar.f128465j = new b();
            i17 = 2;
        } else {
            i17 = 1;
        }
        if (i16 < 1 || i16 > 9 || i15 < 9 || i15 > 15 || i14 < 0 || i14 > 9) {
            return -2;
        }
        kVar.f128464i = this;
        this.f128393g = i17;
        this.f128397k = i15;
        int i18 = 1 << i15;
        this.f128396j = i18;
        this.f128399l = i18 - 1;
        int i19 = 1 << (i16 + 7);
        this.f128405r = i19;
        this.f128406t = i19 - 1;
        this.f128407v = (i16 + 9) / 3;
        this.f128400m = new byte[i18 * 2];
        this.f128402o = new short[i18];
        this.f128403p = new short[i19];
        int i24 = 1 << (i16 + 6);
        this.Q0 = i24;
        int i25 = i24 * 3;
        this.f128389c = new byte[i25];
        this.f128390d = i25;
        this.S0 = i24;
        this.P0 = new byte[i24];
        this.I = i14;
        kVar.f128459d = 0L;
        kVar.f128463h = null;
        this.f128392f = 0;
        this.f128391e = 0;
        this.f128388b = i17 == 0 ? 113 : 42;
        kVar.f128465j.reset();
        this.f128395i = 0;
        short[] sArr = this.X;
        j jVar = this.f128398k0;
        jVar.f128453a = sArr;
        jVar.f128455c = i.f128437h;
        short[] sArr2 = this.Y;
        j jVar2 = this.H0;
        jVar2.f128453a = sArr2;
        jVar2.f128455c = i.f128438i;
        short[] sArr3 = this.Z;
        j jVar3 = this.I0;
        jVar3.f128453a = sArr3;
        jVar3.f128455c = i.f128439j;
        this.X0 = (short) 0;
        this.Y0 = 0;
        this.W0 = 8;
        i();
        this.f128401n = this.f128396j * 2;
        this.f128403p[this.f128405r - 1] = 0;
        for (int i26 = 0; i26 < this.f128405r - 1; i26++) {
            this.f128403p[i26] = 0;
        }
        a aVar = f128385a1[this.I];
        this.F = aVar.f128413b;
        this.P = aVar.f128412a;
        this.T = aVar.f128414c;
        this.E = aVar.f128415d;
        this.A = 0;
        this.f128408w = 0;
        this.C = 0;
        this.D = 2;
        this.f128409x = 2;
        this.f128411z = 0;
        this.f128404q = 0;
        return 0;
    }

    public final void f() {
        int i14;
        int i15;
        k kVar;
        do {
            int i16 = this.f128401n;
            int i17 = this.C;
            int i18 = this.A;
            int i19 = (i16 - i17) - i18;
            int i24 = 0;
            if (i19 == 0 && i18 == 0 && i17 == 0) {
                i19 = this.f128396j;
            } else if (i19 == -1) {
                i19--;
            } else {
                int i25 = this.f128396j;
                if (i18 >= (i25 + i25) - 262) {
                    byte[] bArr = this.f128400m;
                    System.arraycopy(bArr, i25, bArr, 0, i25);
                    int i26 = this.B;
                    int i27 = this.f128396j;
                    this.B = i26 - i27;
                    this.A -= i27;
                    this.f128408w -= i27;
                    int i28 = this.f128405r;
                    int i29 = i28;
                    do {
                        short[] sArr = this.f128403p;
                        i28--;
                        int i30 = sArr[i28] & 65535;
                        i14 = this.f128396j;
                        sArr[i28] = i30 >= i14 ? (short) (i30 - i14) : (short) 0;
                        i29--;
                    } while (i29 != 0);
                    int i34 = i14;
                    do {
                        short[] sArr2 = this.f128402o;
                        i14--;
                        int i35 = sArr2[i14] & 65535;
                        i15 = this.f128396j;
                        sArr2[i14] = i35 >= i15 ? (short) (i35 - i15) : (short) 0;
                        i34--;
                    } while (i34 != 0);
                    i19 += i15;
                }
            }
            kVar = this.f128387a;
            int i36 = kVar.f128458c;
            if (i36 == 0) {
                return;
            }
            byte[] bArr2 = this.f128400m;
            int i37 = this.A + this.C;
            if (i36 <= i19) {
                i19 = i36;
            }
            if (i19 != 0) {
                kVar.f128458c = i36 - i19;
                if (kVar.f128464i.f128393g != 0) {
                    kVar.f128465j.update(kVar.f128456a, kVar.f128457b, i19);
                }
                System.arraycopy(kVar.f128456a, kVar.f128457b, bArr2, i37, i19);
                kVar.f128457b += i19;
                kVar.f128459d += (long) i19;
                i24 = i19;
            }
            int i38 = this.C + i24;
            this.C = i38;
            if (i38 >= 3) {
                byte[] bArr3 = this.f128400m;
                int i39 = this.A;
                int i44 = bArr3[i39] & UnsignedBytes.MAX_VALUE;
                this.f128404q = i44;
                this.f128404q = ((bArr3[i39 + 1] & UnsignedBytes.MAX_VALUE) ^ (i44 << this.f128407v)) & this.f128406t;
            }
            if (i38 >= 262) {
                return;
            }
        } while (kVar.f128458c != 0);
    }

    public final void g(boolean z14) {
        int i14;
        int i15;
        int i16;
        int i17 = this.f128408w;
        int i18 = i17 >= 0 ? i17 : -1;
        int i19 = this.A - i17;
        int i24 = this.I;
        byte[] bArr = j.f128448g;
        j jVar = this.H0;
        j jVar2 = this.f128398k0;
        if (i24 > 0) {
            if (this.f128394h == 2) {
                int i25 = 0;
                int i26 = 0;
                while (i25 < 7) {
                    i26 += this.X[i25 * 2];
                    i25++;
                }
                int i27 = 0;
                while (i25 < 128) {
                    i27 += this.X[i25 * 2];
                    i25++;
                }
                while (i25 < 256) {
                    i26 += this.X[i25 * 2];
                    i25++;
                }
                this.f128394h = (byte) (i26 > (i27 >>> 2) ? 0 : 1);
            }
            jVar2.a(this);
            jVar.a(this);
            p(this.X, jVar2.f128454b);
            p(this.Y, jVar.f128454b);
            this.I0.a(this);
            i15 = 18;
            while (i15 >= 3 && this.Z[(bArr[i15] * 2) + 1] == 0) {
                i15--;
            }
            int i28 = ((i15 + 1) * 3) + 14 + this.T0;
            this.T0 = i28;
            i14 = (i28 + 10) >>> 3;
            i16 = (this.U0 + 10) >>> 3;
            if (i16 <= i14) {
                i14 = i16;
            }
        } else {
            i14 = i19 + 5;
            i15 = 0;
            i16 = i14;
        }
        if (i19 + 4 <= i14 && i18 != -1) {
            q(z14 ? 1 : 0, 3);
            int i29 = this.Y0;
            if (i29 > 8) {
                o(this.X0);
            } else if (i29 > 0) {
                m((byte) this.X0);
            }
            this.X0 = (short) 0;
            this.Y0 = 0;
            this.W0 = 8;
            o((short) i19);
            o((short) (~i19));
            n(i18, i19, this.f128400m);
        } else if (i16 == i14) {
            q((z14 ? 1 : 0) + 2, 3);
            c(i.f128435f, i.f128436g);
        } else {
            q((z14 ? 1 : 0) + 4, 3);
            int i30 = jVar2.f128454b;
            int i34 = jVar.f128454b;
            int i35 = i15 + 1;
            q(i30 - 256, 5);
            q(i34, 5);
            q(i15 - 3, 4);
            for (int i36 = 0; i36 < i35; i36++) {
                q(this.Z[(bArr[i36] * 2) + 1], 3);
            }
            s(this.X, i30);
            s(this.Y, i34);
            c(this.X, this.Y);
        }
        i();
        if (z14) {
            int i37 = this.Y0;
            if (i37 > 8) {
                o(this.X0);
            } else if (i37 > 0) {
                m((byte) this.X0);
            }
            this.X0 = (short) 0;
            this.Y0 = 0;
        }
        this.f128408w = this.A;
        this.f128387a.a();
    }

    public final synchronized g h() {
        try {
            if (this.Z0 == null) {
                this.Z0 = new g();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.Z0;
    }

    public final void i() {
        for (int i14 = 0; i14 < 286; i14++) {
            this.X[i14 * 2] = 0;
        }
        for (int i15 = 0; i15 < 30; i15++) {
            this.Y[i15 * 2] = 0;
        }
        for (int i16 = 0; i16 < 19; i16++) {
            this.Z[i16 * 2] = 0;
        }
        this.X[512] = 1;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.R0 = 0;
    }

    public final int j(int i14) {
        int i15;
        int i16;
        byte[] bArr;
        int i17;
        int i18 = this.E;
        int i19 = this.A;
        int i24 = this.D;
        int i25 = this.f128396j;
        int i26 = i19 > i25 + (-262) ? i19 - (i25 - 262) : 0;
        int i27 = this.T;
        int i28 = this.f128399l;
        int i29 = i19 + 258;
        byte[] bArr2 = this.f128400m;
        int i30 = i19 + i24;
        byte b14 = bArr2[i30 - 1];
        byte b15 = bArr2[i30];
        if (i24 >= this.P) {
            i18 >>= 2;
        }
        int i34 = this.C;
        int i35 = i19;
        if (i27 <= i34) {
            i34 = i27;
        }
        int i36 = i24;
        int i37 = i18;
        int i38 = i14;
        while (true) {
            byte[] bArr3 = this.f128400m;
            int i39 = i38 + i36;
            if (bArr3[i39] == b15 && bArr3[i39 - 1] == b14 && bArr3[i38] == bArr3[i35] && bArr3[i38 + 1] == bArr3[i35 + 1]) {
                int i44 = i35 + 2;
                int i45 = i38 + 2;
                while (true) {
                    bArr = this.f128400m;
                    i17 = i44 + 1;
                    i15 = i19;
                    if (bArr[i17] != bArr[i45 + 1]) {
                        break;
                    }
                    i17 = i44 + 2;
                    if (bArr[i17] != bArr[i45 + 2]) {
                        break;
                    }
                    i17 = i44 + 3;
                    if (bArr[i17] != bArr[i45 + 3]) {
                        break;
                    }
                    i17 = i44 + 4;
                    if (bArr[i17] != bArr[i45 + 4]) {
                        break;
                    }
                    i17 = i44 + 5;
                    if (bArr[i17] != bArr[i45 + 5]) {
                        break;
                    }
                    i17 = i44 + 6;
                    if (bArr[i17] != bArr[i45 + 6]) {
                        break;
                    }
                    i17 = i44 + 7;
                    if (bArr[i17] != bArr[i45 + 7]) {
                        break;
                    }
                    i44 += 8;
                    i45 += 8;
                    if (bArr[i44] != bArr[i45] || i44 >= i29) {
                        i17 = i44;
                        break;
                    }
                    i19 = i15;
                }
                i16 = 258 - (i29 - i17);
                if (i16 > i36) {
                    this.B = i38;
                    if (i16 >= i34) {
                        break;
                    }
                    int i46 = i15 + i16;
                    b14 = bArr[i46 - 1];
                    i35 = i15;
                    b15 = bArr[i46];
                    i36 = i16;
                } else {
                    i35 = i15;
                }
            } else {
                i15 = i19;
            }
            i38 = this.f128402o[i38 & i28] & 65535;
            if (i38 <= i26 || (i37 = i37 - 1) == 0) {
                i16 = i36;
                break;
            }
            i19 = i15;
        }
        int i47 = this.C;
        return i16 <= i47 ? i16 : i47;
    }

    public final void k(short[] sArr, int i14) {
        int i15 = this.L0[i14];
        int i16 = i14 << 1;
        while (true) {
            int i17 = this.M0;
            if (i16 > i17) {
                break;
            }
            if (i16 < i17) {
                int[] iArr = this.L0;
                int i18 = i16 + 1;
                int i19 = iArr[i18];
                int i24 = iArr[i16];
                byte[] bArr = this.O0;
                short s8 = sArr[i19 * 2];
                short s14 = sArr[i24 * 2];
                if (s8 < s14 || (s8 == s14 && bArr[i19] <= bArr[i24])) {
                    i16 = i18;
                }
            }
            int[] iArr2 = this.L0;
            int i25 = iArr2[i16];
            byte[] bArr2 = this.O0;
            short s15 = sArr[i15 * 2];
            short s16 = sArr[i25 * 2];
            if (s15 < s16 || (s15 == s16 && bArr2[i15] <= bArr2[i25])) {
                break;
            }
            iArr2[i14] = i25;
            int i26 = i16;
            i16 <<= 1;
            i14 = i26;
        }
        this.L0[i14] = i15;
    }

    public final void l(int i14) {
        m((byte) (i14 >> 8));
        m((byte) i14);
    }

    public final void m(byte b14) {
        byte[] bArr = this.f128389c;
        int i14 = this.f128392f;
        this.f128392f = i14 + 1;
        bArr[i14] = b14;
    }

    public final void n(int i14, int i15, byte[] bArr) {
        System.arraycopy(bArr, i14, this.f128389c, this.f128392f, i15);
        this.f128392f += i15;
    }

    public final void o(int i14) {
        m((byte) i14);
        m((byte) (i14 >>> 8));
    }

    public final void p(short[] sArr, int i14) {
        int i15;
        int i16;
        short s8 = sArr[1];
        if (s8 == 0) {
            i15 = 138;
            i16 = 3;
        } else {
            i15 = 7;
            i16 = 4;
        }
        s8 = -1;
        sArr[((i14 + 1) * 2) + 1] = -1;
        int i17 = 0;
        int i18 = 0;
        while (i17 <= i14) {
            i17++;
            short s14 = sArr[(i17 * 2) + 1];
            i18++;
            if (i18 >= i15 || s8 != s14) {
                if (i18 < i16) {
                    short[] sArr2 = this.Z;
                    int i19 = s8 * 2;
                    sArr2[i19] = (short) (sArr2[i19] + i18);
                } else if (s8 != 0) {
                    if (s8 != s8) {
                        short[] sArr3 = this.Z;
                        int i24 = s8 * 2;
                        sArr3[i24] = (short) (sArr3[i24] + 1);
                    }
                    short[] sArr4 = this.Z;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else {
                    short[] sArr5 = this.Z;
                    if (i18 <= 10) {
                        sArr5[34] = (short) (sArr5[34] + 1);
                    } else {
                        sArr5[36] = (short) (sArr5[36] + 1);
                    }
                }
                if (s14 == 0) {
                    i15 = 138;
                } else {
                    if (s8 == s14) {
                        i15 = 6;
                    } else {
                        s8 = s8;
                        i15 = 7;
                        i16 = 4;
                    }
                    i18 = 0;
                }
                i16 = 3;
                i18 = 0;
            }
            s8 = s14;
        }
    }

    public final void q(int i14, int i15) {
        int i16 = this.Y0;
        int i17 = 16 - i15;
        short s8 = this.X0;
        if (i16 <= i17) {
            this.X0 = (short) (((i14 << i16) & 65535) | s8);
            this.Y0 = i16 + i15;
            return;
        }
        short s14 = (short) (((i14 << i16) & 65535) | s8);
        this.X0 = s14;
        o(s14);
        int i18 = this.Y0;
        this.X0 = (short) (i14 >>> (16 - i18));
        this.Y0 = (i15 - 16) + i18;
    }

    public final void r(short[] sArr, int i14) {
        int i15 = i14 * 2;
        q(sArr[i15] & 65535, sArr[i15 + 1] & 65535);
    }

    public final void s(short[] sArr, int i14) {
        int i15;
        int i16;
        int i17 = 1;
        short s8 = sArr[1];
        if (s8 == 0) {
            i15 = 138;
            i16 = 3;
        } else {
            i15 = 7;
            i16 = 4;
        }
        s8 = -1;
        int i18 = 0;
        int i19 = 0;
        while (i18 <= i14) {
            i18++;
            short s14 = sArr[(i18 * 2) + i17];
            int i24 = i19 + 1;
            if (i24 >= i15 || s8 != s14) {
                if (i24 < i16) {
                    do {
                        r(this.Z, s8);
                        i24--;
                    } while (i24 != 0);
                } else if (s8 != 0) {
                    if (s8 != s8) {
                        r(this.Z, s8);
                    } else {
                        i19 = i24;
                    }
                    r(this.Z, 16);
                    q(i19 - 3, 2);
                } else {
                    short[] sArr2 = this.Z;
                    if (i24 <= 10) {
                        r(sArr2, 17);
                        q(i19 - 2, 3);
                    } else {
                        r(sArr2, 18);
                        q(i19 - 10, 7);
                    }
                }
                if (s14 == 0) {
                    i15 = 138;
                } else {
                    if (s8 == s14) {
                        i15 = 6;
                    } else {
                        s8 = s8;
                        i15 = 7;
                        i16 = 4;
                    }
                    i19 = 0;
                }
                i16 = 3;
                i19 = 0;
            } else {
                i19 = i24;
            }
            s8 = s14;
            i17 = 1;
        }
    }
}
