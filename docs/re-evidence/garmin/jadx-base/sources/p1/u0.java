package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/u0;", "E", "Lp1/h1;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u0<E> extends h1<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134839e;

    public u0(int i14) {
        super(null);
        if (i14 >= 0) {
            h(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean d(E e4) {
        int i14 = this.f134735d;
        this.f134733b[f(e4)] = e4;
        return this.f134735d != i14;
    }

    public final void e() {
        this.f134735d = 0;
        long[] jArr = this.f134732a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134732a;
            int i14 = this.f134734c;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        p13.s.m(0, this.f134734c, null, this.f134733b);
        this.f134839e = g1.a(this.f134734c) - this.f134735d;
    }

    public final int f(E e4) {
        long j8;
        long j14;
        long j15;
        long[] jArr;
        Object[] objArr;
        int i14 = -862048943;
        int iHashCode = (e4 != null ? e4.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f134734c;
        int i19 = i16 & i18;
        int i24 = 0;
        while (true) {
            long[] jArr2 = this.f134732a;
            int i25 = i19 >> 3;
            int i26 = (i19 & 7) << 3;
            long j16 = ((jArr2[i25 + 1] << (64 - i26)) & ((-i26) >> 63)) | (jArr2[i25] >>> i26);
            long j17 = i17;
            int i27 = i17;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            long j19 = (~j18) & (j18 - 72340172838076673L) & (-9187201950435737472L);
            while (j19 != 0) {
                int iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j19) >> 3)) & i18;
                int i28 = i14;
                if (p005kotlin.jvm.internal.s.g(this.f134733b[iNumberOfTrailingZeros], e4)) {
                    return iNumberOfTrailingZeros;
                }
                j19 &= j19 - 1;
                i14 = i28;
            }
            int i29 = i14;
            if ((((~j16) << 6) & j16 & (-9187201950435737472L)) != 0) {
                int iG = g(i16);
                long j24 = 255;
                if (this.f134839e != 0 || ((this.f134732a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j14 = j17;
                    j15 = 128;
                } else {
                    int i30 = this.f134734c;
                    if (i30 > 8) {
                        int i34 = 8;
                        long j25 = this.f134735d;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j25 * 32, ((long) i30) * 25) <= 0) {
                            long[] jArr3 = this.f134732a;
                            int i35 = this.f134734c;
                            Object[] objArr2 = this.f134733b;
                            int i36 = (i35 + 7) >> 3;
                            int i37 = 0;
                            j15 = 128;
                            while (i37 < i36) {
                                long j26 = j24;
                                long j27 = jArr3[i37] & (-9187201950435737472L);
                                jArr3[i37] = (-72340172838076674L) & ((~j27) + (j27 >>> 7));
                                i37++;
                                i34 = i34;
                                j17 = j17;
                                j24 = j26;
                            }
                            j8 = j24;
                            j14 = j17;
                            int i38 = i34;
                            int iJ = p13.u.J(jArr3);
                            int i39 = iJ - 1;
                            long j28 = 72057594037927935L;
                            jArr3[i39] = (jArr3[i39] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ] = jArr3[0];
                            int i44 = 0;
                            while (i44 != i35) {
                                int i45 = i44 >> 3;
                                int i46 = (i44 & 7) << 3;
                                long j29 = (jArr3[i45] >> i46) & j8;
                                if (j29 != 128 && j29 == 254) {
                                    Object obj = objArr2[i44];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i29;
                                    int i47 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i48 = i47 >>> 7;
                                    int iG2 = g(i48);
                                    int i49 = i48 & i35;
                                    if (((iG2 - i49) & i35) / i38 == ((i44 - i49) & i35) / i38) {
                                        long j34 = j28;
                                        jArr3[i45] = (((long) (i47 & 127)) << i46) | ((~(j8 << i46)) & jArr3[i45]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j34) | Long.MIN_VALUE;
                                        i44++;
                                        j28 = j34;
                                    } else {
                                        long j35 = j28;
                                        int i54 = iG2 >> 3;
                                        long j36 = jArr3[i54];
                                        int i55 = (iG2 & 7) << 3;
                                        if (((j36 >> i55) & j8) == 128) {
                                            objArr = objArr2;
                                            jArr3[i54] = ((~(j8 << i55)) & j36) | (((long) (i47 & 127)) << i55);
                                            jArr3[i45] = (jArr3[i45] & (~(j8 << i46))) | (128 << i46);
                                            objArr[iG2] = objArr[i44];
                                            objArr[i44] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i54] = (((long) (i47 & 127)) << i55) | ((~(j8 << i55)) & j36);
                                            Object obj2 = objArr[iG2];
                                            objArr[iG2] = objArr[i44];
                                            objArr[i44] = obj2;
                                            i44--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j35) | Long.MIN_VALUE;
                                        i44++;
                                        j28 = j35;
                                        i38 = i38;
                                        i35 = i35;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i44++;
                                }
                            }
                            this.f134839e = g1.a(this.f134734c) - this.f134735d;
                        }
                        iG = g(i16);
                    }
                    j8 = 255;
                    j14 = j17;
                    j15 = 128;
                    int iC = g1.c(this.f134734c);
                    long[] jArr4 = this.f134732a;
                    Object[] objArr3 = this.f134733b;
                    int i56 = this.f134734c;
                    h(iC);
                    long[] jArr5 = this.f134732a;
                    Object[] objArr4 = this.f134733b;
                    int i57 = this.f134734c;
                    int i58 = 0;
                    while (i58 < i56) {
                        if (((jArr4[i58 >> 3] >> ((i58 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr3[i58];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i29;
                            int i59 = iHashCode3 ^ (iHashCode3 << 16);
                            int iG3 = g(i59 >>> 7);
                            long j37 = i59 & 127;
                            int i64 = iG3 >> 3;
                            int i65 = (iG3 & 7) << 3;
                            jArr = jArr5;
                            long j38 = (jArr5[i64] & (~(255 << i65))) | (j37 << i65);
                            jArr[i64] = j38;
                            jArr[(((iG3 - 7) & i57) + (i57 & 7)) >> 3] = j38;
                            objArr4[iG3] = obj3;
                        } else {
                            jArr = jArr5;
                        }
                        i58++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iG = g(i16);
                }
                this.f134735d++;
                int i66 = this.f134839e;
                long[] jArr6 = this.f134732a;
                int i67 = iG >> 3;
                long j39 = jArr6[i67];
                int i68 = (iG & 7) << 3;
                this.f134839e = i66 - (((j39 >> i68) & j8) == j15 ? 1 : 0);
                int i69 = this.f134734c;
                long j44 = (j39 & (~(j8 << i68))) | (j14 << i68);
                jArr6[i67] = j44;
                jArr6[(((iG - 7) & i69) + (i69 & 7)) >> 3] = j44;
                return iG;
            }
            i24 += 8;
            i19 = (i19 + i24) & i18;
            i17 = i27;
            i14 = i29;
        }
    }

    public final int g(int i14) {
        int i15 = this.f134734c;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134732a;
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

    public final void h(int i14) {
        long[] jArr;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134734c = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134732a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134839e = g1.a(this.f134734c) - this.f134735d;
        this.f134733b = iMax == 0 ? q1.a.f142056c : new Object[iMax];
    }

    public final void i(E e4) {
        int iNumberOfTrailingZeros;
        int i14 = 0;
        int iHashCode = (e4 != null ? e4.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134734c;
        int i18 = i15 >>> 7;
        loop0: while (true) {
            int i19 = i18 & i17;
            long[] jArr = this.f134732a;
            int i24 = i19 >> 3;
            int i25 = (i19 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i19) & i17;
                if (p005kotlin.jvm.internal.s.g(this.f134733b[iNumberOfTrailingZeros], e4)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i14 += 8;
                i18 = i19 + i14;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(E e4) {
        this.f134733b[f(e4)] = e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(h1<E> h1Var) {
        h1Var.getClass();
        Object[] objArr = h1Var.f134733b;
        long[] jArr = h1Var.f134732a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        j(objArr[(i14 << 3) + i16]);
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final boolean l(E e4) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e4 != null ? e4.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134734c;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134732a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j8 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j14 = (((long) i15) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (p005kotlin.jvm.internal.s.g(this.f134733b[iNumberOfTrailingZeros], e4)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
        boolean z14 = iNumberOfTrailingZeros >= 0;
        if (z14) {
            m(iNumberOfTrailingZeros);
        }
        return z14;
    }

    public final void m(int i14) {
        this.f134735d--;
        long[] jArr = this.f134732a;
        int i15 = this.f134734c;
        int i16 = i14 >> 3;
        int i17 = (i14 & 7) << 3;
        long j8 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j8;
        jArr[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j8;
        this.f134733b[i14] = null;
    }

    public u0() {
        this(0, 1, null);
    }

    public /* synthetic */ u0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }
}
