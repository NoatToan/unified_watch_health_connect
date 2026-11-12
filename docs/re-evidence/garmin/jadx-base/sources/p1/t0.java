package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp1/t0;", "K", "V", "Lp1/f1;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t0<K, V> extends f1<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134836f;

    public t0(int i14) {
        super(null);
        if (i14 >= 0) {
            j(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void g() {
        this.f134724e = 0;
        long[] jArr = this.f134720a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134720a;
            int i14 = this.f134723d;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        p13.s.m(0, this.f134723d, null, this.f134722c);
        p13.s.m(0, this.f134723d, null, this.f134721b);
        this.f134836f = g1.a(this.f134723d) - this.f134724e;
    }

    public final int h(int i14) {
        int i15 = this.f134723d;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134720a;
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

    public final int i(K k14) {
        long j8;
        long j14;
        long j15;
        long[] jArr;
        Object[] objArr;
        int i14 = -862048943;
        int iHashCode = (k14 != null ? k14.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f134723d;
        int i19 = i16 & i18;
        int i24 = 0;
        while (true) {
            long[] jArr2 = this.f134720a;
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
                if (p005kotlin.jvm.internal.s.g(this.f134721b[iNumberOfTrailingZeros], k14)) {
                    return iNumberOfTrailingZeros;
                }
                j19 &= j19 - 1;
                i14 = i28;
            }
            int i29 = i14;
            if ((((~j16) << 6) & j16 & (-9187201950435737472L)) != 0) {
                int iH = h(i16);
                long j24 = 255;
                if (this.f134836f != 0 || ((this.f134720a[iH >> 3] >> ((iH & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j14 = j17;
                    j15 = 128;
                } else {
                    int i30 = this.f134723d;
                    if (i30 > 8) {
                        int i34 = 8;
                        long j25 = this.f134724e;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j25 * 32, ((long) i30) * 25) <= 0) {
                            long[] jArr3 = this.f134720a;
                            int i35 = this.f134723d;
                            Object[] objArr2 = this.f134721b;
                            Object[] objArr3 = this.f134722c;
                            j15 = 128;
                            int i36 = (i35 + 7) >> 3;
                            int i37 = 0;
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
                            jArr3[i39] = (jArr3[i39] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ] = jArr3[0];
                            int i44 = 0;
                            while (i44 != i35) {
                                int i45 = i44 >> 3;
                                int i46 = (i44 & 7) << 3;
                                long j28 = (jArr3[i45] >> i46) & j8;
                                if (j28 != 128 && j28 == 254) {
                                    Object obj = objArr2[i44];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i29;
                                    int i47 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i48 = i47 >>> 7;
                                    int iH2 = h(i48);
                                    int i49 = i48 & i35;
                                    if (((iH2 - i49) & i35) / i38 == ((i44 - i49) & i35) / i38) {
                                        jArr3[i45] = (((long) (i47 & 127)) << i46) | (jArr3[i45] & (~(j8 << i46)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i44++;
                                        i38 = i38;
                                    } else {
                                        int i54 = i38;
                                        int i55 = iH2 >> 3;
                                        long j29 = jArr3[i55];
                                        int i56 = (iH2 & 7) << 3;
                                        if (((j29 >> i56) & j8) == 128) {
                                            objArr = objArr2;
                                            jArr3[i55] = ((~(j8 << i56)) & j29) | (((long) (i47 & 127)) << i56);
                                            jArr3[i45] = (jArr3[i45] & (~(j8 << i46))) | (128 << i46);
                                            objArr[iH2] = objArr[i44];
                                            objArr[i44] = null;
                                            objArr3[iH2] = objArr3[i44];
                                            objArr3[i44] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i55] = (((long) (i47 & 127)) << i56) | ((~(j8 << i56)) & j29);
                                            Object obj2 = objArr[iH2];
                                            objArr[iH2] = objArr[i44];
                                            objArr[i44] = obj2;
                                            Object obj3 = objArr3[iH2];
                                            objArr3[iH2] = objArr3[i44];
                                            objArr3[i44] = obj3;
                                            i44--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i44++;
                                        i38 = i54;
                                        i35 = i35;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i44++;
                                }
                            }
                            this.f134836f = g1.a(this.f134723d) - this.f134724e;
                        }
                        iH = h(i16);
                    }
                    j8 = 255;
                    j14 = j17;
                    j15 = 128;
                    int iC = g1.c(this.f134723d);
                    long[] jArr4 = this.f134720a;
                    Object[] objArr4 = this.f134721b;
                    Object[] objArr5 = this.f134722c;
                    int i57 = this.f134723d;
                    j(iC);
                    long[] jArr5 = this.f134720a;
                    Object[] objArr6 = this.f134721b;
                    Object[] objArr7 = this.f134722c;
                    int i58 = this.f134723d;
                    int i59 = 0;
                    while (i59 < i57) {
                        if (((jArr4[i59 >> 3] >> ((i59 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr4[i59];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i29;
                            int i64 = iHashCode3 ^ (iHashCode3 << 16);
                            int iH3 = h(i64 >>> 7);
                            jArr = jArr5;
                            long j34 = i64 & 127;
                            int i65 = iH3 >> 3;
                            int i66 = (iH3 & 7) << 3;
                            long j35 = (jArr[i65] & (~(255 << i66))) | (j34 << i66);
                            jArr[i65] = j35;
                            jArr[(((iH3 - 7) & i58) + (i58 & 7)) >> 3] = j35;
                            objArr6[iH3] = obj4;
                            objArr7[iH3] = objArr5[i59];
                        } else {
                            jArr = jArr5;
                        }
                        i59++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iH = h(i16);
                }
                this.f134724e++;
                int i67 = this.f134836f;
                long[] jArr6 = this.f134720a;
                int i68 = iH >> 3;
                long j36 = jArr6[i68];
                int i69 = (iH & 7) << 3;
                this.f134836f = i67 - (((j36 >> i69) & j8) == j15 ? 1 : 0);
                int i74 = this.f134723d;
                long j37 = (j36 & (~(j8 << i69))) | (j14 << i69);
                jArr6[i68] = j37;
                jArr6[(((iH - 7) & i74) + (i74 & 7)) >> 3] = j37;
                return ~iH;
            }
            i24 += 8;
            i19 = (i19 + i24) & i18;
            i17 = i27;
            i14 = i29;
        }
    }

    public final void j(int i14) {
        long[] jArr;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134723d = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            int i16 = iMax >> 3;
            long j8 = 255 << ((iMax & 7) << 3);
            jArr2[i16] = (jArr2[i16] & (~j8)) | j8;
            jArr = jArr2;
        }
        this.f134720a = jArr;
        this.f134836f = g1.a(this.f134723d) - this.f134724e;
        Object[] objArr = q1.a.f142056c;
        this.f134721b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f134722c = objArr;
    }

    public final V k(K k14) {
        int iNumberOfTrailingZeros;
        int i14 = 0;
        int iHashCode = (k14 != null ? k14.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134723d;
        int i18 = i15 >>> 7;
        loop0: while (true) {
            int i19 = i18 & i17;
            long[] jArr = this.f134720a;
            int i24 = i19 >> 3;
            int i25 = (i19 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i19) & i17;
                if (p005kotlin.jvm.internal.s.g(this.f134721b[iNumberOfTrailingZeros], k14)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i18 = i19 + i14;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return l(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V l(int i14) {
        this.f134724e--;
        long[] jArr = this.f134720a;
        int i15 = this.f134723d;
        int i16 = i14 >> 3;
        int i17 = (i14 & 7) << 3;
        long j8 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j8;
        jArr[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j8;
        this.f134721b[i14] = null;
        Object[] objArr = this.f134722c;
        V v14 = (V) objArr[i14];
        objArr[i14] = null;
        return v14;
    }

    public final void m(K k14, V v14) {
        int i14 = i(k14);
        if (i14 < 0) {
            i14 = ~i14;
        }
        this.f134721b[i14] = k14;
        this.f134722c[i14] = v14;
    }

    public /* synthetic */ t0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }

    public t0() {
        this(0, 1, null);
    }
}
