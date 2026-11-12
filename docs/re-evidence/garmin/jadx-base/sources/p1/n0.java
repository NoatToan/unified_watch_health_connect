package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/n0;", "Lp1/x;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n0 extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134777e;

    public n0(int i14) {
        super(null);
        if (i14 >= 0) {
            c(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int b(int i14) {
        int i15 = this.f134869c;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134867a;
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

    public final void c(int i14) {
        long[] jArr;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134869c = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134867a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134777e = g1.a(this.f134869c) - this.f134870d;
        this.f134868b = new long[iMax];
    }

    public final void d(long j8) {
        long j14;
        long j15;
        int i14;
        int i15;
        long j16;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i16;
        int i17 = -862048943;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i18 = iHashCode ^ (iHashCode << 16);
        int i19 = i18 >>> 7;
        int i24 = i18 & 127;
        int i25 = this.f134869c;
        int i26 = i19 & i25;
        int i27 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f134867a;
            int i28 = i26 >> 3;
            int i29 = (i26 & 7) << 3;
            int i30 = 1;
            long j17 = ((jArr2[i28 + 1] << (64 - i29)) & ((-i29) >> 63)) | (jArr2[i28] >>> i29);
            long j18 = i24;
            int i34 = i27;
            int i35 = 0;
            long j19 = j17 ^ (j18 * 72340172838076673L);
            long j24 = (~j19) & (j19 - 72340172838076673L) & (-9187201950435737472L);
            while (j24 != 0) {
                iNumberOfTrailingZeros = (i26 + (Long.numberOfTrailingZeros(j24) >> 3)) & i25;
                int i36 = i17;
                if (this.f134868b[iNumberOfTrailingZeros] == j8) {
                    break loop0;
                }
                j24 &= j24 - 1;
                i17 = i36;
            }
            int i37 = i17;
            if ((((~j17) << 6) & j17 & (-9187201950435737472L)) != 0) {
                int iB = b(i19);
                long j25 = 255;
                if (this.f134777e != 0 || ((this.f134867a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j14 = 255;
                    j15 = j18;
                    i14 = 0;
                    i15 = 1;
                    j16 = 128;
                } else {
                    int i38 = this.f134869c;
                    if (i38 > 8) {
                        j16 = 128;
                        long j26 = this.f134870d;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j26 * 32, ((long) i38) * 25) <= 0) {
                            long[] jArr3 = this.f134867a;
                            int i39 = this.f134869c;
                            long[] jArr4 = this.f134868b;
                            int i44 = (i39 + 7) >> 3;
                            int i45 = 0;
                            while (i45 < i44) {
                                long j27 = j25;
                                long j28 = jArr3[i45] & (-9187201950435737472L);
                                jArr3[i45] = (-72340172838076674L) & ((~j28) + (j28 >>> 7));
                                i45++;
                                j18 = j18;
                                j25 = j27;
                            }
                            j14 = j25;
                            j15 = j18;
                            char c14 = 7;
                            int iJ = p13.u.J(jArr3);
                            int i46 = iJ - 1;
                            long j29 = 72057594037927935L;
                            jArr3[i46] = (jArr3[i46] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ] = jArr3[0];
                            int i47 = 0;
                            while (i47 != i39) {
                                int i48 = i47 >> 3;
                                int i49 = (i47 & 7) << 3;
                                long j34 = (jArr3[i48] >> i49) & j14;
                                if (j34 != 128 && j34 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr4[i47]) * i37;
                                    int i54 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i55 = i54 >>> 7;
                                    int iB2 = b(i55);
                                    int i56 = i55 & i39;
                                    long j35 = j29;
                                    if (((iB2 - i56) & i39) / 8 == ((i47 - i56) & i39) / 8) {
                                        int i57 = i35;
                                        jArr3[i48] = (((long) (i54 & 127)) << i49) | (jArr3[i48] & (~(j14 << i49)));
                                        jArr3[jArr3.length - i30] = (jArr3[i57] & j35) | Long.MIN_VALUE;
                                        i47++;
                                        c14 = c14;
                                        j29 = j35;
                                        i35 = i57;
                                    } else {
                                        char c15 = c14;
                                        int i58 = i35;
                                        int i59 = iB2 >> 3;
                                        long j36 = jArr3[i59];
                                        int i64 = (iB2 & 7) << 3;
                                        if (((j36 >> i64) & j14) == 128) {
                                            i16 = i30;
                                            jArr3[i59] = (j36 & (~(j14 << i64))) | (((long) (i54 & 127)) << i64);
                                            jArr3[i48] = (jArr3[i48] & (~(j14 << i49))) | (128 << i49);
                                            jArr4[iB2] = jArr4[i47];
                                            jArr4[i47] = 0;
                                        } else {
                                            i16 = i30;
                                            jArr3[i59] = (((long) (i54 & 127)) << i64) | (j36 & (~(j14 << i64)));
                                            long j37 = jArr4[iB2];
                                            jArr4[iB2] = jArr4[i47];
                                            jArr4[i47] = j37;
                                            i47--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i58] & j35) | Long.MIN_VALUE;
                                        i47++;
                                        c14 = c15;
                                        j29 = j35;
                                        i35 = i58;
                                        i30 = i16;
                                    }
                                } else {
                                    i47++;
                                }
                            }
                            i14 = i35;
                            i15 = i30;
                            this.f134777e = g1.a(this.f134869c) - this.f134870d;
                        }
                        iB = b(i19);
                    } else {
                        j16 = 128;
                    }
                    j14 = 255;
                    j15 = j18;
                    i14 = 0;
                    i15 = 1;
                    int iC = g1.c(this.f134869c);
                    long[] jArr5 = this.f134867a;
                    long[] jArr6 = this.f134868b;
                    int i65 = this.f134869c;
                    c(iC);
                    long[] jArr7 = this.f134867a;
                    long[] jArr8 = this.f134868b;
                    int i66 = this.f134869c;
                    int i67 = 0;
                    while (i67 < i65) {
                        if (((jArr5[i67 >> 3] >> ((i67 & 7) << 3)) & 255) < j16) {
                            long j38 = jArr6[i67];
                            int iHashCode3 = Long.hashCode(j38) * i37;
                            int i68 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB3 = b(i68 >>> 7);
                            long j39 = i68 & 127;
                            int i69 = iB3 >> 3;
                            int i74 = (iB3 & 7) << 3;
                            jArr = jArr7;
                            long j44 = (jArr7[i69] & (~(255 << i74))) | (j39 << i74);
                            jArr[i69] = j44;
                            jArr[(((iB3 - 7) & i66) + (i66 & 7)) >> 3] = j44;
                            jArr8[iB3] = j38;
                        } else {
                            jArr = jArr7;
                        }
                        i67++;
                        jArr5 = jArr5;
                        jArr7 = jArr;
                    }
                    iB = b(i19);
                }
                iNumberOfTrailingZeros = iB;
                this.f134870d++;
                int i75 = this.f134777e;
                long[] jArr9 = this.f134867a;
                int i76 = iNumberOfTrailingZeros >> 3;
                long j45 = jArr9[i76];
                int i77 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j45 >> i77) & j14) == j16) {
                    i14 = i15;
                }
                this.f134777e = i75 - i14;
                int i78 = this.f134869c;
                long j46 = (j45 & (~(j14 << i77))) | (j15 << i77);
                jArr9[i76] = j46;
                jArr9[(((iNumberOfTrailingZeros - 7) & i78) + (i78 & 7)) >> 3] = j46;
                break;
            }
            i27 = i34 + 8;
            i26 = (i26 + i27) & i25;
            i17 = i37;
        }
        this.f134868b[iNumberOfTrailingZeros] = j8;
    }

    public final void e(long j8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134869c;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134867a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j15 = (((long) i15) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                if (this.f134868b[iNumberOfTrailingZeros] == j8) {
                    break loop0;
                }
            }
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i18 += 8;
                i17 = (i17 + i18) & i16;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.f134870d--;
            long[] jArr2 = this.f134867a;
            int i25 = this.f134869c;
            int i26 = iNumberOfTrailingZeros >> 3;
            int i27 = (iNumberOfTrailingZeros & 7) << 3;
            long j17 = (jArr2[i26] & (~(255 << i27))) | (254 << i27);
            jArr2[i26] = j17;
            jArr2[(((iNumberOfTrailingZeros - 7) & i25) + (i25 & 7)) >> 3] = j17;
        }
    }

    public n0() {
        this(0, 1, null);
    }

    public /* synthetic */ n0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }
}
