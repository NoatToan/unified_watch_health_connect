package wb;

import bb.g0;
import bb.h0;
import bb.o;
import fa.z;
import j20.x;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f183805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f183806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f183807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f183808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f183809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f183810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f183811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f183812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f183813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f183814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f183815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f183816l;

    public final class b implements g0 {
        private b() {
        }

        @Override // bb.g0
        public final long getDurationUs() {
            a aVar = a.this;
            return (aVar.f183810f * 1000000) / ((long) aVar.f183808d.f183850i);
        }

        @Override // bb.g0
        public final g0.a getSeekPoints(long j8) {
            a aVar = a.this;
            long j14 = (((long) aVar.f183808d.f183850i) * j8) / 1000000;
            long j15 = aVar.f183806b;
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j14);
            long j16 = aVar.f183807c;
            return new g0.a(new h0(j8, z.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j16 - j15)).divide(BigInteger.valueOf(aVar.f183810f)).longValue() + j15) - 30000, aVar.f183806b, j16 - 1)));
        }

        @Override // bb.g0
        public final boolean isSeekable() {
            return true;
        }
    }

    public a(h hVar, long j8, long j14, long j15, long j16, boolean z14) {
        fa.a.a(j8 >= 0 && j14 > j8);
        this.f183808d = hVar;
        this.f183806b = j8;
        this.f183807c = j14;
        if (j15 == j14 - j8 || z14) {
            this.f183810f = j16;
            this.f183809e = 4;
        } else {
            this.f183809e = 0;
        }
        this.f183805a = new e();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    @Override // wb.f
    public final long a(o oVar) throws IOException {
        long j8;
        long j14;
        long j15;
        int i14 = this.f183809e;
        long j16 = this.f183807c;
        e eVar = this.f183805a;
        if (i14 == 0) {
            j8 = 0;
            long position = oVar.getPosition();
            this.f183811g = position;
            this.f183809e = 1;
            long j17 = j16 - 65307;
            if (j17 > position) {
                return j17;
            }
        } else if (i14 != 1) {
            if (i14 == 2) {
                if (this.f183813i == this.f183814j) {
                    j15 = -1;
                } else {
                    long position2 = oVar.getPosition();
                    if (eVar.b(oVar, this.f183814j)) {
                        eVar.a(oVar, false);
                        oVar.resetPeekPosition();
                        long j18 = this.f183812h;
                        long j19 = eVar.f183833b;
                        long j24 = j18 - j19;
                        j14 = 2;
                        int i15 = eVar.f183835d + eVar.f183836e;
                        if (0 > j24 || j24 >= 72000) {
                            if (j24 < 0) {
                                this.f183814j = position2;
                                this.f183816l = j19;
                            } else {
                                this.f183813i = oVar.getPosition() + ((long) i15);
                                this.f183815k = eVar.f183833b;
                            }
                            long j25 = this.f183814j;
                            long j26 = this.f183813i;
                            if (j25 - j26 < 100000) {
                                this.f183814j = j26;
                                j15 = j26;
                            } else {
                                long position3 = oVar.getPosition() - (((long) i15) * (j24 <= 0 ? 2L : 1L));
                                long j27 = this.f183814j;
                                long j28 = this.f183813i;
                                j15 = z.j((((j27 - j28) * j24) / (this.f183816l - this.f183815k)) + position3, j28, j27 - 1);
                            }
                        } else {
                            j15 = -1;
                        }
                    } else {
                        j15 = this.f183813i;
                        if (j15 == position2) {
                            vb.h.C("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (j15 != -1) {
                        return j15;
                    }
                    this.f183809e = 3;
                }
                j14 = 2;
                if (j15 != -1) {
                    return j15;
                }
                this.f183809e = 3;
            } else {
                if (i14 != 3) {
                    if (i14 == 4) {
                        return -1L;
                    }
                    x.h();
                    return 0L;
                }
                j14 = 2;
            }
            while (true) {
                eVar.b(oVar, -1L);
                eVar.a(oVar, false);
                if (eVar.f183833b > this.f183812h) {
                    oVar.resetPeekPosition();
                    this.f183809e = 4;
                    return -(this.f183815k + j14);
                }
                oVar.skipFully(eVar.f183835d + eVar.f183836e);
                this.f183813i = oVar.getPosition();
                this.f183815k = eVar.f183833b;
            }
        } else {
            j8 = 0;
        }
        eVar.f183832a = 0;
        eVar.f183833b = j8;
        eVar.f183834c = 0;
        eVar.f183835d = 0;
        eVar.f183836e = 0;
        if (!eVar.b(oVar, -1L)) {
            vb.h.m();
            return 0L;
        }
        eVar.a(oVar, false);
        oVar.skipFully(eVar.f183835d + eVar.f183836e);
        long j29 = eVar.f183833b;
        while ((eVar.f183832a & 4) != 4 && eVar.b(oVar, -1L) && oVar.getPosition() < j16 && eVar.a(oVar, true)) {
            try {
                oVar.skipFully(eVar.f183835d + eVar.f183836e);
                j29 = eVar.f183833b;
            } catch (EOFException unused) {
            }
        }
        this.f183810f = j29;
        this.f183809e = 4;
        return this.f183811g;
    }

    @Override // wb.f
    public final g0 createSeekMap() {
        if (this.f183810f != 0) {
            return new b();
        }
        return null;
    }

    @Override // wb.f
    public final void startSeek(long j8) {
        this.f183812h = z.j(j8, 0L, this.f183810f - 1);
        this.f183809e = 2;
        this.f183813i = this.f183806b;
        this.f183814j = this.f183807c;
        this.f183815k = 0L;
        this.f183816l = this.f183810f;
    }
}
