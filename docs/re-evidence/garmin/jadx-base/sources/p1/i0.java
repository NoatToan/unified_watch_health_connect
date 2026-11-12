package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/i0;", "V", "Lp1/n;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i0<V> extends n<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134742f;

    public i0(int i14) {
        super(null);
        if (i14 >= 0) {
            f(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f134776e = 0;
        long[] jArr = this.f134772a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134772a;
            int i14 = this.f134775d;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        p13.s.m(0, this.f134775d, null, this.f134774c);
        this.f134742f = g1.a(this.f134775d) - this.f134776e;
    }

    public final int d(int i14) {
        long j8;
        long j14;
        int i15;
        long j15;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i16 = -862048943;
        int iHashCode = Integer.hashCode(i14) * (-862048943);
        int i17 = iHashCode ^ (iHashCode << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i24 = this.f134775d;
        int i25 = i18 & i24;
        int i26 = 0;
        while (true) {
            long[] jArr2 = this.f134772a;
            int i27 = i25 >> 3;
            int i28 = (i25 & 7) << 3;
            int i29 = 1;
            long j16 = ((jArr2[i27 + 1] << (64 - i28)) & ((-i28) >> 63)) | (jArr2[i27] >>> i28);
            long j17 = i19;
            int i30 = i26;
            int i34 = 0;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            long j19 = (~j18) & (j18 - 72340172838076673L) & (-9187201950435737472L);
            while (j19 != 0) {
                int iNumberOfTrailingZeros = (i25 + (Long.numberOfTrailingZeros(j19) >> 3)) & i24;
                int i35 = i16;
                int i36 = i34;
                if (this.f134773b[iNumberOfTrailingZeros] == i14) {
                    return iNumberOfTrailingZeros;
                }
                j19 &= j19 - 1;
                i16 = i35;
                i34 = i36;
            }
            int i37 = i16;
            int i38 = i34;
            if ((((~j16) << 6) & j16 & (-9187201950435737472L)) != 0) {
                int iE = e(i18);
                long j24 = 255;
                if (this.f134742f != 0 || ((this.f134772a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j14 = j17;
                    i15 = 1;
                    j15 = 128;
                } else {
                    int i39 = this.f134775d;
                    if (i39 > 8) {
                        j15 = 128;
                        long j25 = this.f134776e;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j25 * 32, ((long) i39) * 25) <= 0) {
                            long[] jArr3 = this.f134772a;
                            int i44 = this.f134775d;
                            int[] iArr2 = this.f134773b;
                            Object[] objArr2 = this.f134774c;
                            int i45 = (i44 + 7) >> 3;
                            int i46 = i38;
                            while (i46 < i45) {
                                long j26 = j24;
                                long j27 = jArr3[i46] & (-9187201950435737472L);
                                jArr3[i46] = (-72340172838076674L) & ((~j27) + (j27 >>> 7));
                                i46++;
                                j17 = j17;
                                j24 = j26;
                            }
                            j8 = j24;
                            j14 = j17;
                            int iJ = p13.u.J(jArr3);
                            int i47 = iJ - 1;
                            long j28 = 72057594037927935L;
                            jArr3[i47] = (jArr3[i47] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ] = jArr3[i38];
                            int i48 = i38;
                            while (i48 != i44) {
                                int i49 = i48 >> 3;
                                int i54 = (i48 & 7) << 3;
                                long j29 = (jArr3[i49] >> i54) & j8;
                                if (j29 != 128 && j29 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i48]) * i37;
                                    int i55 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i56 = i55 >>> 7;
                                    int iE2 = e(i56);
                                    int i57 = i56 & i44;
                                    if (((iE2 - i57) & i44) / 8 == ((i48 - i57) & i44) / 8) {
                                        long j34 = j28;
                                        jArr3[i49] = (((long) (i55 & 127)) << i54) | ((~(j8 << i54)) & jArr3[i49]);
                                        jArr3[jArr3.length - i29] = (jArr3[i38] & j34) | Long.MIN_VALUE;
                                        i48++;
                                        j28 = j34;
                                    } else {
                                        long j35 = j28;
                                        int i58 = iE2 >> 3;
                                        long j36 = jArr3[i58];
                                        int i59 = (iE2 & 7) << 3;
                                        if (((j36 >> i59) & j8) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i58] = ((~(j8 << i59)) & j36) | (((long) (i55 & 127)) << i59);
                                            jArr3[i49] = (jArr3[i49] & (~(j8 << i54))) | (128 << i54);
                                            iArr[iE2] = iArr[i48];
                                            iArr[i48] = i38;
                                            objArr[iE2] = objArr[i48];
                                            objArr[i48] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i58] = (((long) (i55 & 127)) << i59) | ((~(j8 << i59)) & j36);
                                            int i64 = iArr[iE2];
                                            iArr[iE2] = iArr[i48];
                                            iArr[i48] = i64;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i48];
                                            objArr[i48] = obj;
                                            i48--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i38] & j35) | Long.MIN_VALUE;
                                        i48++;
                                        j28 = j35;
                                        i29 = i29;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i48++;
                                }
                            }
                            i15 = i29;
                            this.f134742f = g1.a(this.f134775d) - this.f134776e;
                        }
                        iE = e(i18);
                    } else {
                        j15 = 128;
                    }
                    j8 = 255;
                    j14 = j17;
                    i15 = 1;
                    int iC = g1.c(this.f134775d);
                    long[] jArr4 = this.f134772a;
                    int[] iArr3 = this.f134773b;
                    Object[] objArr3 = this.f134774c;
                    int i65 = this.f134775d;
                    f(iC);
                    long[] jArr5 = this.f134772a;
                    int[] iArr4 = this.f134773b;
                    Object[] objArr4 = this.f134774c;
                    int i66 = this.f134775d;
                    int i67 = i38;
                    while (i67 < i65) {
                        if (((jArr4[i67 >> 3] >> ((i67 & 7) << 3)) & 255) < j15) {
                            int i68 = iArr3[i67];
                            int iHashCode3 = Integer.hashCode(i68) * i37;
                            int i69 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i69 >>> 7);
                            long j37 = i69 & 127;
                            int i74 = iE3 >> 3;
                            int i75 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j38 = (jArr5[i74] & (~(255 << i75))) | (j37 << i75);
                            jArr[i74] = j38;
                            jArr[(((iE3 - 7) & i66) + (i66 & 7)) >> 3] = j38;
                            iArr4[iE3] = i68;
                            objArr4[iE3] = objArr3[i67];
                        } else {
                            jArr = jArr5;
                        }
                        i67++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i18);
                }
                this.f134776e++;
                int i76 = this.f134742f;
                long[] jArr6 = this.f134772a;
                int i77 = iE >> 3;
                long j39 = jArr6[i77];
                int i78 = (iE & 7) << 3;
                if (((j39 >> i78) & j8) != j15) {
                    i15 = i38;
                }
                this.f134742f = i76 - i15;
                int i79 = this.f134775d;
                long j44 = (j39 & (~(j8 << i78))) | (j14 << i78);
                jArr6[i77] = j44;
                jArr6[(((iE - 7) & i79) + (i79 & 7)) >> 3] = j44;
                return iE;
            }
            i26 = i30 + 8;
            i25 = (i25 + i26) & i24;
            i16 = i37;
        }
    }

    public final int e(int i14) {
        int i15 = this.f134775d;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134772a;
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
        this.f134775d = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134772a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134742f = g1.a(this.f134775d) - this.f134776e;
        this.f134773b = new int[iMax];
        this.f134774c = new Object[iMax];
    }

    public final V g(int i14) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i14) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134775d;
        int i18 = (i15 >>> 7) & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f134772a;
            int i24 = i18 >> 3;
            int i25 = (i18 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i17;
                if (this.f134773b[iNumberOfTrailingZeros] == i14) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return h(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V h(int i14) {
        this.f134776e--;
        long[] jArr = this.f134772a;
        int i15 = this.f134775d;
        int i16 = i14 >> 3;
        int i17 = (i14 & 7) << 3;
        long j8 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j8;
        jArr[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j8;
        Object[] objArr = this.f134774c;
        V v14 = (V) objArr[i14];
        objArr[i14] = null;
        return v14;
    }

    public final void i(int i14, V v14) {
        int iD = d(i14);
        this.f134773b[iD] = i14;
        this.f134774c[iD] = v14;
    }

    public /* synthetic */ i0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }

    public i0() {
        this(0, 1, null);
    }
}
