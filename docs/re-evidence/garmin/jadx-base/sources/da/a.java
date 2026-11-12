package da;

import fb1.c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f58639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f58640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f58641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f58642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f58643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f58644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f58645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f58646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f58647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f58649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f58650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f58651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f58652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f58653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f58654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f58655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f58656u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f58657v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f58658w;

    public a(int i14, int i15, float f14, float f15, int i16) {
        this.f58636a = i14;
        this.f58637b = i15;
        this.f58638c = f14;
        this.f58639d = f15;
        this.f58640e = i14 / i16;
        this.f58641f = i14 / 400;
        int i17 = i14 / 65;
        this.f58642g = i17;
        int i18 = i17 * 2;
        this.f58643h = i18;
        this.f58644i = new short[i18];
        this.f58645j = new short[i18 * i15];
        this.f58647l = new short[i18 * i15];
        this.f58649n = new short[i18 * i15];
    }

    public static void e(int i14, int i15, short[] sArr, int i16, short[] sArr2, int i17, short[] sArr3, int i18) {
        for (int i19 = 0; i19 < i15; i19++) {
            int i24 = (i16 * i15) + i19;
            int i25 = (i18 * i15) + i19;
            int i26 = (i17 * i15) + i19;
            for (int i27 = 0; i27 < i14; i27++) {
                sArr[i24] = (short) (((sArr3[i25] * i27) + ((i14 - i27) * sArr2[i26])) / i14);
                i24 += i15;
                i26 += i15;
                i25 += i15;
            }
        }
    }

    public final void a(short[] sArr, int i14, int i15) {
        short[] sArrC = c(this.f58647l, this.f58648m, i15);
        this.f58647l = sArrC;
        int i16 = this.f58637b;
        System.arraycopy(sArr, i14 * i16, sArrC, this.f58648m * i16, i16 * i15);
        this.f58648m += i15;
    }

    public final void b(short[] sArr, int i14, int i15) {
        int i16 = this.f58643h / i15;
        int i17 = this.f58637b;
        int i18 = i15 * i17;
        int i19 = i14 * i17;
        for (int i24 = 0; i24 < i16; i24++) {
            int i25 = 0;
            for (int i26 = 0; i26 < i18; i26++) {
                i25 += sArr[c.d(i24, i18, i19, i26)];
            }
            this.f58644i[i24] = (short) (i25 / i18);
        }
    }

    public final short[] c(short[] sArr, int i14, int i15) {
        int length = sArr.length;
        int i16 = this.f58637b;
        int i17 = length / i16;
        return i14 + i15 <= i17 ? sArr : Arrays.copyOf(sArr, (((i17 * 3) / 2) + i15) * i16);
    }

    public final int d(short[] sArr, int i14, int i15, int i16) {
        int i17 = i14 * this.f58637b;
        int i18 = 255;
        int i19 = 1;
        int i24 = 0;
        int i25 = 0;
        while (i15 <= i16) {
            int iAbs = 0;
            for (int i26 = 0; i26 < i15; i26++) {
                iAbs += Math.abs(sArr[i17 + i26] - sArr[(i17 + i15) + i26]);
            }
            if (iAbs * i24 < i19 * i15) {
                i24 = i15;
                i19 = iAbs;
            }
            if (iAbs * i18 > i25 * i15) {
                i18 = i15;
                i25 = iAbs;
            }
            i15++;
        }
        this.f58656u = i19 / i24;
        this.f58657v = i25 / i18;
        return i24;
    }

    public final void f() {
        float f14;
        double d14;
        int iD;
        int i14;
        int i15;
        int iRound;
        int i16;
        int i17;
        int i18;
        long j8;
        long j14;
        int i19 = this.f58648m;
        float f15 = this.f58638c;
        float f16 = this.f58639d;
        double d15 = f15 / f16;
        float f17 = this.f58640e * f16;
        int i24 = this.f58636a;
        int i25 = 1;
        int i26 = this.f58637b;
        int i27 = 0;
        if (d15 > 1.00001d || d15 < 0.99999d) {
            int i28 = this.f58646k;
            int i29 = this.f58643h;
            if (i28 >= i29) {
                int i30 = 0;
                while (true) {
                    int i34 = this.f58653r;
                    if (i34 > 0) {
                        int iMin = Math.min(i29, i34);
                        a(this.f58645j, i30, iMin);
                        this.f58653r -= iMin;
                        i30 += iMin;
                        f14 = f17;
                        d14 = d15;
                        i29 = i29;
                    } else {
                        short[] sArr = this.f58645j;
                        int i35 = i24 > 4000 ? i24 / 4000 : i25;
                        int i36 = this.f58642g;
                        int i37 = this.f58641f;
                        if (i26 == i25 && i35 == i25) {
                            iD = d(sArr, i30, i37, i36);
                            f14 = f17;
                            d14 = d15;
                        } else {
                            b(sArr, i30, i35);
                            f14 = f17;
                            d14 = d15;
                            short[] sArr2 = this.f58644i;
                            int iD2 = d(sArr2, i27, i37 / i35, i36 / i35);
                            if (i35 != 1) {
                                int i38 = iD2 * i35;
                                int i39 = i35 * 4;
                                int i44 = i38 - i39;
                                int i45 = i38 + i39;
                                if (i44 >= i37) {
                                    i37 = i44;
                                }
                                if (i45 <= i36) {
                                    i36 = i45;
                                }
                                if (i26 == 1) {
                                    iD = d(sArr, i30, i37, i36);
                                } else {
                                    b(sArr, i30, 1);
                                    iD = d(sArr2, i27, i37, i36);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i46 = this.f58656u;
                        int i47 = this.f58657v;
                        if (i46 == 0 || (i14 = this.f58654s) == 0 || i47 > i46 * 3 || i46 * 2 <= this.f58655t * 3) {
                            i14 = iD;
                        }
                        this.f58655t = i46;
                        this.f58654s = iD;
                        short[] sArr3 = this.f58645j;
                        double d16 = this.f58658w;
                        if (d14 > 1.0d) {
                            if (d14 >= 2.0d) {
                                double d17 = (((double) i14) / (d14 - 1.0d)) + d16;
                                iRound = (int) Math.round(d17);
                                this.f58658w = d17 - ((double) iRound);
                            } else {
                                double d18 = (((2.0d - d14) * ((double) i14)) / (d14 - 1.0d)) + d16;
                                int iRound2 = (int) Math.round(d18);
                                this.f58653r = iRound2;
                                this.f58658w = d18 - ((double) iRound2);
                                iRound = i14;
                            }
                            short[] sArrC = c(this.f58647l, this.f58648m, iRound);
                            this.f58647l = sArrC;
                            int i48 = i30 + i14;
                            int i49 = i30;
                            int i54 = iRound;
                            e(i54, this.f58637b, sArrC, this.f58648m, sArr3, i49, sArr3, i48);
                            this.f58648m += i54;
                            i30 = i14 + i54 + i49;
                        } else {
                            i29 = i29;
                            int i55 = i30;
                            if (d14 < 0.5d) {
                                double d19 = ((((double) i14) * d14) / (1.0d - d14)) + d16;
                                int iRound3 = (int) Math.round(d19);
                                this.f58658w = d19 - ((double) iRound3);
                                i15 = iRound3;
                            } else {
                                double d24 = ((((2.0d * d14) - 1.0d) * ((double) i14)) / (1.0d - d14)) + d16;
                                int iRound4 = (int) Math.round(d24);
                                this.f58653r = iRound4;
                                this.f58658w = d24 - ((double) iRound4);
                                i15 = i14;
                            }
                            int i56 = i14 + i15;
                            short[] sArrC2 = c(this.f58647l, this.f58648m, i56);
                            this.f58647l = sArrC2;
                            System.arraycopy(sArr3, i55 * i26, sArrC2, this.f58648m * i26, i14 * i26);
                            e(i15, this.f58637b, this.f58647l, this.f58648m + i14, sArr3, i55 + i14, sArr3, i55);
                            this.f58648m += i56;
                            i30 = i55 + i15;
                        }
                    }
                    if (i30 + i29 > i28) {
                        break;
                    }
                    i27 = 0;
                    i29 = i29;
                    i25 = 1;
                    f17 = f14;
                    d15 = d14;
                }
                int i57 = this.f58646k - i30;
                short[] sArr4 = this.f58645j;
                System.arraycopy(sArr4, i30 * i26, sArr4, 0, i57 * i26);
                this.f58646k = i57;
            }
            if (f14 != 1.0f || this.f58648m == i19) {
            }
            long j15 = (long) (i24 / f14);
            long j16 = i24;
            while (j15 != 0 && j16 != 0 && j15 % 2 == 0 && j16 % 2 == 0) {
                j15 /= 2;
                j16 /= 2;
            }
            int i58 = this.f58648m - i19;
            short[] sArrC3 = c(this.f58649n, this.f58650o, i58);
            this.f58649n = sArrC3;
            System.arraycopy(this.f58647l, i19 * i26, sArrC3, this.f58650o * i26, i58 * i26);
            this.f58648m = i19;
            this.f58650o += i58;
            int i59 = 0;
            while (true) {
                i16 = this.f58650o;
                i17 = i16 - 1;
                if (i59 >= i17) {
                    break;
                }
                while (true) {
                    i18 = this.f58651p + 1;
                    j8 = i18;
                    long j17 = j8 * j15;
                    j14 = this.f58652q;
                    if (j17 <= j14 * j16) {
                        break;
                    }
                    this.f58647l = c(this.f58647l, this.f58648m, 1);
                    int i64 = 0;
                    while (i64 < i26) {
                        short[] sArr5 = this.f58647l;
                        int i65 = (this.f58648m * i26) + i64;
                        short[] sArr6 = this.f58649n;
                        int i66 = (i59 * i26) + i64;
                        short s8 = sArr6[i66];
                        short s14 = sArr6[i66 + i26];
                        long j18 = ((long) this.f58652q) * j16;
                        int i67 = this.f58651p;
                        long j19 = j15;
                        int i68 = i59;
                        long j24 = ((long) (i67 + 1)) * j19;
                        long j25 = j24 - j18;
                        long j26 = j24 - (((long) i67) * j19);
                        sArr5[i65] = (short) ((((j26 - j25) * ((long) s14)) + (((long) s8) * j25)) / j26);
                        i64++;
                        i59 = i68;
                        j15 = j19;
                    }
                    this.f58652q++;
                    this.f58648m++;
                    i59 = i59;
                    j15 = j15;
                }
                long j27 = j15;
                int i69 = i59;
                this.f58651p = i18;
                if (j8 == j16) {
                    this.f58651p = 0;
                    fa.a.d(j14 == j27);
                    this.f58652q = 0;
                }
                i59 = i69 + 1;
                j15 = j27;
            }
            if (i17 == 0) {
                return;
            }
            short[] sArr7 = this.f58649n;
            System.arraycopy(sArr7, i17 * i26, sArr7, 0, (i16 - i17) * i26);
            this.f58650o -= i17;
            return;
        }
        a(this.f58645j, 0, this.f58646k);
        this.f58646k = 0;
        f14 = f17;
        if (f14 != 1.0f) {
        }
    }
}
