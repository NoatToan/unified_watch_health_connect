package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/m0;", "V", "Lp1/v;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m0<V> extends v<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134769f;

    public m0(int i14) {
        super(null);
        if (i14 >= 0) {
            f(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f134844e = 0;
        long[] jArr = this.f134840a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134840a;
            int i14 = this.f134843d;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        p13.s.m(0, this.f134843d, null, this.f134842c);
        this.f134769f = g1.a(this.f134843d) - this.f134844e;
    }

    public final int d(long j8) {
        long j14;
        long j15;
        int i14;
        int i15;
        long j16;
        long[] jArr;
        long j17;
        Object[] objArr;
        long[] jArr2;
        int i16 = -862048943;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i17 = iHashCode ^ (iHashCode << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i24 = this.f134843d;
        int i25 = i18 & i24;
        int i26 = 0;
        while (true) {
            long[] jArr3 = this.f134840a;
            int i27 = i25 >> 3;
            int i28 = (i25 & 7) << 3;
            int i29 = 1;
            long j18 = ((jArr3[i27 + 1] << (64 - i28)) & ((-i28) >> 63)) | (jArr3[i27] >>> i28);
            long j19 = i19;
            int i30 = i26;
            int i34 = 0;
            long j24 = j18 ^ (j19 * 72340172838076673L);
            long j25 = (~j24) & (j24 - 72340172838076673L) & (-9187201950435737472L);
            while (j25 != 0) {
                int iNumberOfTrailingZeros = (i25 + (Long.numberOfTrailingZeros(j25) >> 3)) & i24;
                int i35 = i16;
                if (this.f134841b[iNumberOfTrailingZeros] == j8) {
                    return iNumberOfTrailingZeros;
                }
                j25 &= j25 - 1;
                i16 = i35;
            }
            int i36 = i16;
            if ((((~j18) << 6) & j18 & (-9187201950435737472L)) != 0) {
                int iE = e(i18);
                if (this.f134769f != 0 || ((this.f134840a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j14 = 255;
                    j15 = j19;
                    i14 = 0;
                    i15 = 1;
                    j16 = 128;
                } else {
                    int i37 = this.f134843d;
                    if (i37 > 8) {
                        j16 = 128;
                        long j26 = this.f134844e;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j26 * 32, ((long) i37) * 25) <= 0) {
                            long[] jArr4 = this.f134840a;
                            int i38 = this.f134843d;
                            long[] jArr5 = this.f134841b;
                            Object[] objArr2 = this.f134842c;
                            int i39 = (i38 + 7) >> 3;
                            j14 = 255;
                            int i44 = 0;
                            while (i44 < i39) {
                                long j27 = jArr4[i44] & (-9187201950435737472L);
                                jArr4[i44] = (-72340172838076674L) & ((~j27) + (j27 >>> 7));
                                i44++;
                                i29 = i29;
                                i34 = i34;
                                j19 = j19;
                            }
                            j15 = j19;
                            i14 = i34;
                            int i45 = i29;
                            char c14 = 7;
                            int iJ = p13.u.J(jArr4);
                            int i46 = iJ - 1;
                            long j28 = 72057594037927935L;
                            jArr4[i46] = (jArr4[i46] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iJ] = jArr4[i14];
                            int i47 = i14;
                            while (i47 != i38) {
                                int i48 = i47 >> 3;
                                int i49 = (i47 & 7) << 3;
                                long j29 = (jArr4[i48] >> i49) & 255;
                                if (j29 != 128 && j29 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i47]) * i36;
                                    int i54 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i55 = i54 >>> 7;
                                    int iE2 = e(i55);
                                    int i56 = i55 & i38;
                                    c14 = c14;
                                    if (((iE2 - i56) & i38) / 8 == ((i47 - i56) & i38) / 8) {
                                        int i57 = i45;
                                        j17 = j28;
                                        jArr4[i48] = (((long) (i54 & 127)) << i49) | (jArr4[i48] & (~(255 << i49)));
                                        jArr4[jArr4.length - i57] = (jArr4[i14] & j17) | Long.MIN_VALUE;
                                        i47++;
                                        i45 = i57;
                                    } else {
                                        int i58 = i45;
                                        j17 = j28;
                                        int i59 = iE2 >> 3;
                                        long j34 = jArr4[i59];
                                        int i64 = (iE2 & 7) << 3;
                                        if (((j34 >> i64) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i59] = (j34 & (~(255 << i64))) | (((long) (i54 & 127)) << i64);
                                            jArr4[i48] = (jArr4[i48] & (~(255 << i49))) | (128 << i49);
                                            jArr2[iE2] = jArr2[i47];
                                            jArr2[i47] = 0;
                                            objArr[iE2] = objArr[i47];
                                            objArr[i47] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i59] = (((long) (i54 & 127)) << i64) | (j34 & (~(255 << i64)));
                                            long j35 = jArr2[iE2];
                                            jArr2[iE2] = jArr2[i47];
                                            jArr2[i47] = j35;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i47];
                                            objArr[i47] = obj;
                                            i47--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i14] & j17) | Long.MIN_VALUE;
                                        i47++;
                                        jArr5 = jArr2;
                                        i45 = i58;
                                        objArr2 = objArr;
                                    }
                                    j28 = j17;
                                } else {
                                    i47++;
                                }
                            }
                            i15 = i45;
                            this.f134769f = g1.a(this.f134843d) - this.f134844e;
                        }
                        iE = e(i18);
                    } else {
                        j16 = 128;
                    }
                    j14 = 255;
                    j15 = j19;
                    i14 = 0;
                    i15 = 1;
                    int iC = g1.c(this.f134843d);
                    long[] jArr6 = this.f134840a;
                    long[] jArr7 = this.f134841b;
                    Object[] objArr3 = this.f134842c;
                    int i65 = this.f134843d;
                    f(iC);
                    long[] jArr8 = this.f134840a;
                    long[] jArr9 = this.f134841b;
                    Object[] objArr4 = this.f134842c;
                    int i66 = this.f134843d;
                    int i67 = 0;
                    while (i67 < i65) {
                        if (((jArr6[i67 >> 3] >> ((i67 & 7) << 3)) & 255) < j16) {
                            long j36 = jArr7[i67];
                            int iHashCode3 = Long.hashCode(j36) * i36;
                            int i68 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i68 >>> 7);
                            jArr = jArr8;
                            long j37 = i68 & 127;
                            int i69 = iE3 >> 3;
                            int i74 = (iE3 & 7) << 3;
                            long j38 = (jArr[i69] & (~(255 << i74))) | (j37 << i74);
                            jArr[i69] = j38;
                            jArr[(((iE3 - 7) & i66) + (i66 & 7)) >> 3] = j38;
                            jArr9[iE3] = j36;
                            objArr4[iE3] = objArr3[i67];
                        } else {
                            jArr = jArr8;
                        }
                        i67++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iE = e(i18);
                }
                this.f134844e++;
                int i75 = this.f134769f;
                long[] jArr10 = this.f134840a;
                int i76 = iE >> 3;
                long j39 = jArr10[i76];
                int i77 = (iE & 7) << 3;
                if (((j39 >> i77) & j14) != j16) {
                    i15 = i14;
                }
                this.f134769f = i75 - i15;
                int i78 = this.f134843d;
                long j44 = (j39 & (~(j14 << i77))) | (j15 << i77);
                jArr10[i76] = j44;
                jArr10[(((iE - 7) & i78) + (i78 & 7)) >> 3] = j44;
                return iE;
            }
            i26 = i30 + 8;
            i25 = (i25 + i26) & i24;
            i16 = i36;
        }
    }

    public final int e(int i14) {
        int i15 = this.f134843d;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134840a;
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
        this.f134843d = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134840a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134769f = g1.a(this.f134843d) - this.f134844e;
        this.f134841b = new long[iMax];
        this.f134842c = new Object[iMax];
    }

    public final V g(long j8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134843d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134840a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j15 = (((long) i15) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                if (this.f134841b[iNumberOfTrailingZeros] == j8) {
                    break loop0;
                }
            }
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f134844e--;
        long[] jArr2 = this.f134840a;
        int i25 = this.f134843d;
        int i26 = iNumberOfTrailingZeros >> 3;
        int i27 = (iNumberOfTrailingZeros & 7) << 3;
        long j17 = (jArr2[i26] & (~(255 << i27))) | (254 << i27);
        jArr2[i26] = j17;
        jArr2[(((iNumberOfTrailingZeros - 7) & i25) + (i25 & 7)) >> 3] = j17;
        Object[] objArr = this.f134842c;
        V v14 = (V) objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return v14;
    }

    public final void h(long j8, V v14) {
        int iD = d(j8);
        this.f134841b[iD] = j8;
        this.f134842c[iD] = v14;
    }

    public /* synthetic */ m0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }

    public m0() {
        this(0, 1, null);
    }
}
