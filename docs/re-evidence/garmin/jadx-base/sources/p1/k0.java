package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/k0;", "Lp1/s;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k0 extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134758f;

    public k0(int i14) {
        super(null);
        if (i14 >= 0) {
            d(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int c(int i14) {
        int i15 = this.f134821d;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134818a;
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

    public final void d(int i14) {
        long[] jArr;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134821d = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134818a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134758f = g1.a(this.f134821d) - this.f134822e;
        this.f134819b = new long[iMax];
        this.f134820c = new int[iMax];
    }

    public final void e(int i14, long j8) {
        long j14;
        long j15;
        int i15;
        int i16;
        long j16;
        int i17;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i18 = -862048943;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i19 = iHashCode ^ (iHashCode << 16);
        int i24 = i19 >>> 7;
        int i25 = i19 & 127;
        int i26 = this.f134821d;
        int i27 = i24 & i26;
        int i28 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f134818a;
            int i29 = i27 >> 3;
            int i30 = (i27 & 7) << 3;
            int i34 = 1;
            long j17 = ((jArr3[i29 + 1] << (64 - i30)) & ((-i30) >> 63)) | (jArr3[i29] >>> i30);
            long j18 = i25;
            int i35 = i28;
            int i36 = 0;
            long j19 = j17 ^ (j18 * 72340172838076673L);
            long j24 = (~j19) & (j19 - 72340172838076673L) & (-9187201950435737472L);
            while (j24 != 0) {
                int iNumberOfTrailingZeros = (i27 + (Long.numberOfTrailingZeros(j24) >> 3)) & i26;
                int i37 = i18;
                if (this.f134819b[iNumberOfTrailingZeros] == j8) {
                    i17 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j24 &= j24 - 1;
                    i18 = i37;
                }
            }
            int i38 = i18;
            if ((((~j17) << 6) & j17 & (-9187201950435737472L)) != 0) {
                int iC = c(i24);
                if (this.f134758f != 0 || ((this.f134818a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j14 = 255;
                    j15 = j18;
                    i15 = 0;
                    i16 = 1;
                    j16 = 128;
                } else {
                    int i39 = this.f134821d;
                    if (i39 > 8) {
                        j16 = 128;
                        long j25 = this.f134822e;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j25 * 32, ((long) i39) * 25) <= 0) {
                            long[] jArr4 = this.f134818a;
                            int i44 = this.f134821d;
                            long[] jArr5 = this.f134819b;
                            int[] iArr2 = this.f134820c;
                            int i45 = (i44 + 7) >> 3;
                            j14 = 255;
                            int i46 = 0;
                            while (i46 < i45) {
                                long j26 = jArr4[i46] & (-9187201950435737472L);
                                jArr4[i46] = (-72340172838076674L) & ((~j26) + (j26 >>> 7));
                                i46++;
                                i34 = i34;
                                i36 = i36;
                                j18 = j18;
                            }
                            j15 = j18;
                            i15 = i36;
                            int i47 = i34;
                            char c14 = 7;
                            int iJ = p13.u.J(jArr4);
                            int i48 = iJ - 1;
                            long j27 = 72057594037927935L;
                            jArr4[i48] = (jArr4[i48] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iJ] = jArr4[i15];
                            int i49 = i15;
                            while (i49 != i44) {
                                int i54 = i49 >> 3;
                                int i55 = (i49 & 7) << 3;
                                long j28 = (jArr4[i54] >> i55) & 255;
                                if (j28 != 128 && j28 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i49]) * i38;
                                    int i56 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i57 = i56 >>> 7;
                                    int iC2 = c(i57);
                                    int i58 = i57 & i44;
                                    char c15 = c14;
                                    if (((iC2 - i58) & i44) / 8 == ((i49 - i58) & i44) / 8) {
                                        int i59 = i47;
                                        long j29 = j27;
                                        jArr4[i54] = (((long) (i56 & 127)) << i55) | (jArr4[i54] & (~(255 << i55)));
                                        jArr4[jArr4.length - i59] = (jArr4[i15] & j29) | Long.MIN_VALUE;
                                        i49++;
                                        i47 = i59;
                                        c14 = c15;
                                        j27 = j29;
                                    } else {
                                        int i64 = i47;
                                        long j34 = j27;
                                        int i65 = iC2 >> 3;
                                        long j35 = jArr4[i65];
                                        int i66 = (iC2 & 7) << 3;
                                        if (((j35 >> i66) & 255) == 128) {
                                            jArr2 = jArr5;
                                            iArr = iArr2;
                                            jArr4[i65] = (j35 & (~(255 << i66))) | (((long) (i56 & 127)) << i66);
                                            jArr4[i54] = (jArr4[i54] & (~(255 << i55))) | (128 << i55);
                                            jArr2[iC2] = jArr2[i49];
                                            jArr2[i49] = 0;
                                            iArr[iC2] = iArr[i49];
                                            iArr[i49] = i15;
                                        } else {
                                            iArr = iArr2;
                                            jArr2 = jArr5;
                                            jArr4[i65] = (((long) (i56 & 127)) << i66) | (j35 & (~(255 << i66)));
                                            long j36 = jArr2[iC2];
                                            jArr2[iC2] = jArr2[i49];
                                            jArr2[i49] = j36;
                                            int i67 = iArr[iC2];
                                            iArr[iC2] = iArr[i49];
                                            iArr[i49] = i67;
                                            i49--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i15] & j34) | Long.MIN_VALUE;
                                        i49++;
                                        jArr5 = jArr2;
                                        i47 = i64;
                                        c14 = c15;
                                        j27 = j34;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i49++;
                                }
                            }
                            i16 = i47;
                            this.f134758f = g1.a(this.f134821d) - this.f134822e;
                        }
                        iC = c(i24);
                    } else {
                        j16 = 128;
                    }
                    j14 = 255;
                    j15 = j18;
                    i15 = 0;
                    i16 = 1;
                    int iC3 = g1.c(this.f134821d);
                    long[] jArr6 = this.f134818a;
                    long[] jArr7 = this.f134819b;
                    int[] iArr3 = this.f134820c;
                    int i68 = this.f134821d;
                    d(iC3);
                    long[] jArr8 = this.f134818a;
                    long[] jArr9 = this.f134819b;
                    int[] iArr4 = this.f134820c;
                    int i69 = this.f134821d;
                    int i74 = 0;
                    while (i74 < i68) {
                        if (((jArr6[i74 >> 3] >> ((i74 & 7) << 3)) & 255) < j16) {
                            long j37 = jArr7[i74];
                            int iHashCode3 = Long.hashCode(j37) * i38;
                            int i75 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC4 = c(i75 >>> 7);
                            jArr = jArr8;
                            long j38 = i75 & 127;
                            int i76 = iC4 >> 3;
                            int i77 = (iC4 & 7) << 3;
                            long j39 = (jArr[i76] & (~(255 << i77))) | (j38 << i77);
                            jArr[i76] = j39;
                            jArr[(((iC4 - 7) & i69) + (i69 & 7)) >> 3] = j39;
                            jArr9[iC4] = j37;
                            iArr4[iC4] = iArr3[i74];
                        } else {
                            jArr = jArr8;
                        }
                        i74++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iC = c(i24);
                }
                this.f134822e++;
                int i78 = this.f134758f;
                long[] jArr10 = this.f134818a;
                int i79 = iC >> 3;
                long j44 = jArr10[i79];
                int i84 = (iC & 7) << 3;
                if (((j44 >> i84) & j14) != j16) {
                    i16 = i15;
                }
                this.f134758f = i78 - i16;
                int i85 = this.f134821d;
                long j45 = (j44 & (~(j14 << i84))) | (j15 << i84);
                jArr10[i79] = j45;
                jArr10[(((iC - 7) & i85) + (i85 & 7)) >> 3] = j45;
                i17 = ~iC;
                break;
            }
            i28 = i35 + 8;
            i27 = (i27 + i28) & i26;
            i18 = i38;
        }
        if (i17 < 0) {
            i17 = ~i17;
        }
        this.f134819b[i17] = j8;
        this.f134820c[i17] = i14;
    }

    public k0() {
        this(0, 1, null);
    }

    public /* synthetic */ k0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }
}
