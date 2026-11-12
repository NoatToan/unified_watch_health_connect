package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xre implements ck8, dpf {
    public static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f39388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39389b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f39390k;
    public long l;
    public long[] m;
    public int n;

    public xre() {
        this.f39388a = new byte[8];
        this.m = new long[80];
        this.f39389b = 0;
        reset();
    }

    @Override // defpackage.ck8
    public int d() {
        return 128;
    }

    public final long e(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    public final long f(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public final long g(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    public final long h(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    public final long i(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public final long j(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    public final void k() {
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            this.c = j & 2305843009213693951L;
        }
    }

    public void l(xre xreVar) {
        byte[] bArr = xreVar.f39388a;
        System.arraycopy(bArr, 0, this.f39388a, 0, bArr.length);
        this.f39389b = xreVar.f39389b;
        this.c = xreVar.c;
        this.d = xreVar.d;
        this.e = xreVar.e;
        this.f = xreVar.f;
        this.g = xreVar.g;
        this.h = xreVar.h;
        this.i = xreVar.i;
        this.j = xreVar.j;
        this.f39390k = xreVar.f39390k;
        this.l = xreVar.l;
        long[] jArr = xreVar.m;
        System.arraycopy(jArr, 0, this.m, 0, jArr.length);
        this.n = xreVar.n;
    }

    public void m() {
        k();
        long j = this.c << 3;
        long j2 = this.d;
        byte b2 = -128;
        while (true) {
            update(b2);
            if (this.f39389b == 0) {
                o(j, j2);
                n();
                return;
            }
            b2 = 0;
        }
    }

    public void n() {
        k();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.m;
            long jH = h(jArr[i - 2]);
            long[] jArr2 = this.m;
            jArr[i] = jH + jArr2[i - 7] + g(jArr2[i - 15]) + this.m[i - 16];
        }
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        long j5 = this.i;
        long j6 = this.j;
        long j7 = this.f39390k;
        long j8 = j6;
        long j9 = j4;
        int i2 = 0;
        long jI = j2;
        long j10 = j3;
        long j11 = j5;
        int i3 = 0;
        long j12 = this.l;
        long j13 = j;
        long j14 = j7;
        while (i3 < 10) {
            long j15 = j11;
            long j16 = j(j11) + e(j11, j8, j14);
            long[] jArr3 = o;
            int i4 = i2 + 1;
            long j17 = j12 + j16 + jArr3[i2] + this.m[i2];
            long j18 = j9 + j17;
            long jI2 = j17 + i(j13) + f(j13, jI, j10);
            int i5 = i2 + 2;
            long j19 = j14 + j(j18) + e(j18, j15, j8) + jArr3[i4] + this.m[i4];
            long j20 = j10 + j19;
            long jI3 = j19 + i(jI2) + f(jI2, j13, jI);
            int i6 = i2 + 3;
            long j21 = j8 + j(j20) + e(j20, j18, j15) + jArr3[i5] + this.m[i5];
            long j22 = jI + j21;
            long jI4 = j21 + i(jI3) + f(jI3, jI2, j13);
            int i7 = i2 + 4;
            long j23 = j15 + j(j22) + e(j22, j20, j18) + jArr3[i6] + this.m[i6];
            long j24 = j13 + j23;
            long jI5 = j23 + i(jI4) + f(jI4, jI3, jI2);
            int i8 = i2 + 5;
            long j25 = j18 + j(j24) + e(j24, j22, j20) + jArr3[i7] + this.m[i7];
            long j26 = jI2 + j25;
            long jI6 = j25 + i(jI5) + f(jI5, jI4, jI3);
            int i9 = i2 + 6;
            long j27 = j20 + j(j26) + e(j26, j24, j22) + jArr3[i8] + this.m[i8];
            long j28 = jI3 + j27;
            long jI7 = j27 + i(jI6) + f(jI6, jI5, jI4);
            j14 = j28;
            int i10 = i2 + 7;
            long j29 = j22 + j(j28) + e(j28, j26, j24) + jArr3[i9] + this.m[i9];
            long j30 = jI4 + j29;
            j8 = j30;
            jI = j29 + i(jI7) + f(jI7, jI6, jI5);
            i2 += 8;
            long j31 = j24 + j(j30) + e(j30, j14, j26) + jArr3[i10] + this.m[i10];
            long jI8 = j31 + i(jI) + f(jI, jI7, jI6);
            i3++;
            j11 = jI5 + j31;
            j10 = jI7;
            j12 = j26;
            j9 = jI6;
            j13 = jI8;
        }
        this.e += j13;
        this.f += jI;
        this.g += j10;
        this.h += j9;
        this.i += j11;
        this.j += j8;
        this.f39390k += j14;
        this.l += j12;
        this.n = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.m[i11] = 0;
        }
    }

    public void o(long j, long j2) {
        if (this.n > 14) {
            n();
        }
        long[] jArr = this.m;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public void p(byte[] bArr, int i) {
        this.m[this.n] = zgh.b(bArr, i);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            n();
        }
    }

    @Override // defpackage.aw6
    public void reset() {
        this.c = 0L;
        this.d = 0L;
        int i = 0;
        this.f39389b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f39388a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.aw6
    public void update(byte b2) {
        byte[] bArr = this.f39388a;
        int i = this.f39389b;
        int i2 = i + 1;
        this.f39389b = i2;
        bArr[i] = b2;
        if (i2 == bArr.length) {
            p(bArr, 0);
            this.f39389b = 0;
        }
        this.c++;
    }

    public xre(xre xreVar) {
        this.f39388a = new byte[8];
        this.m = new long[80];
        l(xreVar);
    }

    @Override // defpackage.aw6
    public void update(byte[] bArr, int i, int i2) {
        while (this.f39389b != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f39388a.length) {
            p(bArr, i);
            byte[] bArr2 = this.f39388a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.c += (long) bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
