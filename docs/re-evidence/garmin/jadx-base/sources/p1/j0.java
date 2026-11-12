package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/j0;", "Lp1/p;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j0 extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134745e;

    public j0(int i14) {
        super(null);
        if (i14 >= 0) {
            f(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(int i14) {
        int i15 = this.f134796d;
        this.f134794b[d(i14)] = i14;
        return this.f134796d != i15;
    }

    public final void c() {
        this.f134796d = 0;
        long[] jArr = this.f134793a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134793a;
            int i14 = this.f134795c;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        this.f134745e = g1.a(this.f134795c) - this.f134796d;
    }

    public final int d(int i14) {
        long j8;
        long j14;
        int i15;
        long j15;
        long[] jArr;
        int[] iArr;
        int i16;
        int i17 = -862048943;
        int iHashCode = Integer.hashCode(i14) * (-862048943);
        int i18 = iHashCode ^ (iHashCode << 16);
        int i19 = i18 >>> 7;
        int i24 = i18 & 127;
        int i25 = this.f134795c;
        int i26 = i19 & i25;
        int i27 = 0;
        while (true) {
            long[] jArr2 = this.f134793a;
            int i28 = i26 >> 3;
            int i29 = (i26 & 7) << 3;
            int i30 = 1;
            long j16 = ((jArr2[i28 + 1] << (64 - i29)) & ((-i29) >> 63)) | (jArr2[i28] >>> i29);
            long j17 = i24;
            int i34 = i27;
            int i35 = 0;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            long j19 = (~j18) & (j18 - 72340172838076673L) & (-9187201950435737472L);
            while (j19 != 0) {
                int iNumberOfTrailingZeros = (i26 + (Long.numberOfTrailingZeros(j19) >> 3)) & i25;
                int i36 = i17;
                int i37 = i35;
                if (this.f134794b[iNumberOfTrailingZeros] == i14) {
                    return iNumberOfTrailingZeros;
                }
                j19 &= j19 - 1;
                i17 = i36;
                i35 = i37;
            }
            int i38 = i17;
            int i39 = i35;
            char c14 = '\b';
            if ((((~j16) << 6) & j16 & (-9187201950435737472L)) != 0) {
                int iE = e(i19);
                long j24 = 255;
                if (this.f134745e != 0 || ((this.f134793a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j14 = j17;
                    i15 = 1;
                    j15 = 128;
                } else {
                    int i44 = this.f134795c;
                    if (i44 > 8) {
                        j15 = 128;
                        long j25 = this.f134796d;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j25 * 32, ((long) i44) * 25) <= 0) {
                            long[] jArr3 = this.f134793a;
                            int i45 = this.f134795c;
                            int[] iArr2 = this.f134794b;
                            int i46 = (i45 + 7) >> 3;
                            int i47 = i39;
                            while (i47 < i46) {
                                char c15 = c14;
                                long j26 = jArr3[i47] & (-9187201950435737472L);
                                jArr3[i47] = (-72340172838076674L) & ((~j26) + (j26 >>> 7));
                                i47++;
                                j17 = j17;
                                c14 = c15;
                                j24 = j24;
                            }
                            j8 = j24;
                            j14 = j17;
                            int iJ = p13.u.J(jArr3);
                            int i48 = iJ - 1;
                            long j27 = 72057594037927935L;
                            jArr3[i48] = (jArr3[i48] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ] = jArr3[i39];
                            int i49 = i39;
                            while (i49 != i45) {
                                int i54 = i49 >> 3;
                                int i55 = (i49 & 7) << 3;
                                long j28 = (jArr3[i54] >> i55) & j8;
                                if (j28 != 128 && j28 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i49]) * i38;
                                    int i56 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i57 = i56 >>> 7;
                                    int iE2 = e(i57);
                                    int i58 = i57 & i45;
                                    if (((iE2 - i58) & i45) / 8 == ((i49 - i58) & i45) / 8) {
                                        long j29 = j27;
                                        jArr3[i54] = (((long) (i56 & 127)) << i55) | ((~(j8 << i55)) & jArr3[i54]);
                                        jArr3[jArr3.length - i30] = (jArr3[i39] & j29) | Long.MIN_VALUE;
                                        i49++;
                                        j27 = j29;
                                    } else {
                                        long j34 = j27;
                                        int i59 = iE2 >> 3;
                                        long j35 = jArr3[i59];
                                        int i64 = (iE2 & 7) << 3;
                                        if (((j35 >> i64) & j8) == 128) {
                                            iArr = iArr2;
                                            int i65 = i49;
                                            jArr3[i59] = ((~(j8 << i64)) & j35) | (((long) (i56 & 127)) << i64);
                                            jArr3[i54] = (jArr3[i54] & (~(j8 << i55))) | (128 << i55);
                                            iArr[iE2] = iArr[i65];
                                            iArr[i65] = i39;
                                            i16 = i65;
                                        } else {
                                            iArr = iArr2;
                                            int i66 = i49;
                                            jArr3[i59] = (((long) (i56 & 127)) << i64) | ((~(j8 << i64)) & j35);
                                            int i67 = iArr[iE2];
                                            iArr[iE2] = iArr[i66];
                                            iArr[i66] = i67;
                                            i16 = i66 - 1;
                                        }
                                        jArr3[jArr3.length - i30] = (jArr3[i39] & j34) | Long.MIN_VALUE;
                                        i49 = i16 + i30;
                                        i30 = i30;
                                        j27 = j34;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i49++;
                                }
                            }
                            i15 = i30;
                            this.f134745e = g1.a(this.f134795c) - this.f134796d;
                        }
                        iE = e(i19);
                    } else {
                        j15 = 128;
                    }
                    j8 = 255;
                    j14 = j17;
                    i15 = 1;
                    int iC = g1.c(this.f134795c);
                    long[] jArr4 = this.f134793a;
                    int[] iArr3 = this.f134794b;
                    int i68 = this.f134795c;
                    f(iC);
                    long[] jArr5 = this.f134793a;
                    int[] iArr4 = this.f134794b;
                    int i69 = this.f134795c;
                    int i74 = i39;
                    while (i74 < i68) {
                        if (((jArr4[i74 >> 3] >> ((i74 & 7) << 3)) & 255) < j15) {
                            int i75 = iArr3[i74];
                            int iHashCode3 = Integer.hashCode(i75) * i38;
                            int i76 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i76 >>> 7);
                            long j36 = i76 & 127;
                            int i77 = iE3 >> 3;
                            int i78 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j37 = (jArr5[i77] & (~(255 << i78))) | (j36 << i78);
                            jArr[i77] = j37;
                            jArr[(((iE3 - 7) & i69) + (i69 & 7)) >> 3] = j37;
                            iArr4[iE3] = i75;
                        } else {
                            jArr = jArr5;
                        }
                        i74++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i19);
                }
                this.f134796d += i15;
                int i79 = this.f134745e;
                long[] jArr6 = this.f134793a;
                int i84 = iE >> 3;
                long j38 = jArr6[i84];
                int i85 = (iE & 7) << 3;
                if (((j38 >> i85) & j8) != j15) {
                    i15 = i39;
                }
                this.f134745e = i79 - i15;
                int i86 = this.f134795c;
                long j39 = (j38 & (~(j8 << i85))) | (j14 << i85);
                jArr6[i84] = j39;
                jArr6[(((iE - 7) & i86) + (i86 & 7)) >> 3] = j39;
                return iE;
            }
            i27 = i34 + 8;
            i26 = (i26 + i27) & i25;
            i17 = i38;
        }
    }

    public final int e(int i14) {
        int i15 = this.f134795c;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134793a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j8 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j14 != 0) {
                return (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
    }

    public final void f(int i14) {
        long[] jArr;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134795c = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134793a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134745e = g1.a(this.f134795c) - this.f134796d;
        this.f134794b = new int[iMax];
    }

    public final boolean g(int i14) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i14) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134795c;
        int i18 = (i15 >>> 7) & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f134793a;
            int i24 = i18 >> 3;
            int i25 = (i18 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i17;
                if (this.f134794b[iNumberOfTrailingZeros] == i14) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
        }
        boolean z14 = iNumberOfTrailingZeros >= 0;
        if (z14) {
            h(iNumberOfTrailingZeros);
        }
        return z14;
    }

    public final void h(int i14) {
        this.f134796d--;
        long[] jArr = this.f134793a;
        int i15 = this.f134795c;
        int i16 = i14 >> 3;
        int i17 = (i14 & 7) << 3;
        long j8 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j8;
        jArr[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j8;
    }

    public j0() {
        this(0, 1, null);
    }

    public /* synthetic */ j0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }
}
