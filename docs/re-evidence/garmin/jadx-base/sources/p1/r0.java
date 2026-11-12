package p1;

import java.util.Arrays;
import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/r0;", "E", "Lp1/c1;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r0<E> extends c1<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f134817h;

    public r0(int i14) {
        super(null);
        if (i14 >= 0) {
            f(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(E e4) {
        int i14 = this.f134689g;
        int iD = d(e4);
        this.f134684b[iD] = e4;
        long[] jArr = this.f134685c;
        int i15 = this.f134686d;
        jArr[iD] = (((long) i15) & 2147483647L) | 4611686016279904256L;
        if (i15 != Integer.MAX_VALUE) {
            jArr[i15] = ((((long) iD) & 2147483647L) << 31) | (jArr[i15] & (-4611686016279904257L));
        }
        this.f134686d = iD;
        if (this.f134687e == Integer.MAX_VALUE) {
            this.f134687e = iD;
        }
        return this.f134689g != i14;
    }

    public final void c() {
        this.f134689g = 0;
        long[] jArr = this.f134683a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134683a;
            int i14 = this.f134688f;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        p13.s.m(0, this.f134688f, null, this.f134684b);
        p13.s.p(this.f134685c, 4611686018427387903L);
        this.f134686d = Integer.MAX_VALUE;
        this.f134687e = Integer.MAX_VALUE;
        this.f134817h = g1.a(this.f134688f) - this.f134689g;
    }

    public final int d(E e4) {
        int i14;
        long j8;
        long j14;
        long j15;
        char c14;
        long[] jArr;
        int i15 = -862048943;
        int iHashCode = (e4 != null ? e4.hashCode() : 0) * (-862048943);
        int i16 = iHashCode ^ (iHashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f134688f;
        int i24 = i17 & i19;
        int i25 = 0;
        while (true) {
            long[] jArr2 = this.f134683a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            long j16 = ((jArr2[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr2[i26] >>> i27);
            long j17 = i18;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            long j19 = (j18 - 72340172838076673L) & (~j18) & (-9187201950435737472L);
            while (j19 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j19) >> 3) + i24) & i19;
                int i28 = i15;
                if (p005kotlin.jvm.internal.s.g(this.f134684b[iNumberOfTrailingZeros], e4)) {
                    return iNumberOfTrailingZeros;
                }
                j19 &= j19 - 1;
                i15 = i28;
            }
            int i29 = i15;
            if ((j16 & ((~j16) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i17);
                long j24 = 255;
                if (this.f134817h != 0 || ((this.f134683a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i14 = 0;
                    j8 = j17;
                    j14 = 255;
                    j15 = 128;
                } else {
                    int i30 = this.f134688f;
                    if (i30 > 8) {
                        c14 = 31;
                        long j25 = this.f134689g;
                        o13.z.a aVar = o13.z.f128618b;
                        j15 = 128;
                        if (Long.compareUnsigned(j25 * 32, ((long) i30) * 25) <= 0) {
                            long[] jArr3 = this.f134683a;
                            if (jArr3 == null) {
                                i14 = 0;
                                j8 = j17;
                                j14 = 255;
                            } else {
                                int i34 = this.f134688f;
                                Object[] objArr = this.f134684b;
                                long[] jArr4 = this.f134685c;
                                long[] jArr5 = new long[i34];
                                Arrays.fill(jArr5, 0, i34, 9223372034707292159L);
                                i14 = 0;
                                int i35 = (i34 + 7) >> 3;
                                int i36 = 0;
                                while (i36 < i35) {
                                    long j26 = j24;
                                    long j27 = jArr3[i36] & (-9187201950435737472L);
                                    int i37 = i36;
                                    jArr3[i37] = ((~j27) + (j27 >>> 7)) & (-72340172838076674L);
                                    i36 = i37 + 1;
                                    j24 = j26;
                                }
                                j14 = j24;
                                int length = jArr3.length;
                                int i38 = length - 1;
                                int i39 = length - 2;
                                jArr3[i39] = (jArr3[i39] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i38] = jArr3[0];
                                int i44 = 0;
                                while (i44 != i34) {
                                    int i45 = i44 >> 3;
                                    int i46 = (i44 & 7) << 3;
                                    long j28 = (jArr3[i45] >> i46) & j14;
                                    if (j28 != 128 && j28 == 254) {
                                        Object obj = objArr[i44];
                                        int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i29;
                                        int i47 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i48 = i47 >>> 7;
                                        int iE2 = e(i48);
                                        int i49 = i48 & i34;
                                        if (((iE2 - i49) & i34) / 8 == ((i44 - i49) & i34) / 8) {
                                            int i54 = i34;
                                            Object[] objArr2 = objArr;
                                            jArr3[i45] = (jArr3[i45] & (~(j14 << i46))) | (((long) (i47 & 127)) << i46);
                                            if (jArr5[i44] == 9223372034707292159L) {
                                                long j29 = i44;
                                                jArr5[i44] = j29 | (j29 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i44++;
                                            i34 = i54;
                                            objArr = objArr2;
                                        } else {
                                            int i55 = i34;
                                            Object[] objArr3 = objArr;
                                            int i56 = iE2 >> 3;
                                            long j34 = jArr3[i56];
                                            int i57 = (iE2 & 7) << 3;
                                            if (((j34 >> i57) & j14) == 128) {
                                                jArr3[i56] = (j34 & (~(j14 << i57))) | (((long) (i47 & 127)) << i57);
                                                jArr3[i45] = (jArr3[i45] & (~(j14 << i46))) | (128 << i46);
                                                objArr3[iE2] = objArr3[i44];
                                                objArr3[i44] = null;
                                                jArr4[iE2] = jArr4[i44];
                                                jArr4[i44] = 4611686018427387903L;
                                                int i58 = (int) ((jArr5[i44] >> 32) & 4294967295L);
                                                int i59 = Integer.MAX_VALUE;
                                                if (i58 != Integer.MAX_VALUE) {
                                                    jArr5[i58] = ((long) iE2) | (jArr5[i58] & (-4294967296L));
                                                    jArr5[i44] = (jArr5[i44] & 4294967295L) | (-4294967296L);
                                                    i59 = Integer.MAX_VALUE;
                                                } else {
                                                    jArr5[i44] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr5[iE2] = (((long) i44) << 32) | ((long) i59);
                                            } else {
                                                j17 = j17;
                                                jArr3[i56] = (((long) (i47 & 127)) << i57) | (j34 & (~(j14 << i57)));
                                                Object obj2 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i44];
                                                objArr3[i44] = obj2;
                                                long j35 = jArr4[iE2];
                                                jArr4[iE2] = jArr4[i44];
                                                jArr4[i44] = j35;
                                                int i64 = (int) ((jArr5[i44] >> 32) & 4294967295L);
                                                if (i64 != Integer.MAX_VALUE) {
                                                    long j36 = iE2;
                                                    jArr5[i64] = (jArr5[i64] & (-4294967296L)) | j36;
                                                    jArr5[i44] = (jArr5[i44] & 4294967295L) | (j36 << 32);
                                                } else {
                                                    long j37 = iE2;
                                                    jArr5[i44] = j37 | (j37 << 32);
                                                    i64 = i44;
                                                }
                                                jArr5[iE2] = (((long) i64) << 32) | ((long) i44);
                                                i44--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i44++;
                                            i34 = i55;
                                            objArr = objArr3;
                                            j17 = j17;
                                        }
                                    } else {
                                        i44++;
                                    }
                                }
                                j8 = j17;
                                this.f134817h = g1.a(this.f134688f) - this.f134689g;
                                long[] jArr6 = this.f134685c;
                                int length2 = jArr6.length;
                                for (int i65 = 0; i65 < length2; i65++) {
                                    long j38 = jArr6[i65];
                                    int i66 = (int) ((j38 >> 31) & 2147483647L);
                                    int i67 = (int) (j38 & 2147483647L);
                                    jArr6[i65] = (((j38 & (-4611686018427387904L)) | ((long) (i66 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i66] & 4294967295L)))) << 31) | ((long) (i67 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i67] & 4294967295L)));
                                }
                                int i68 = this.f134686d;
                                if (i68 != Integer.MAX_VALUE) {
                                    this.f134686d = (int) (jArr5[i68] & 4294967295L);
                                }
                                int i69 = this.f134687e;
                                if (i69 != Integer.MAX_VALUE) {
                                    this.f134687e = (int) (jArr5[i69] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i17);
                    } else {
                        c14 = 31;
                        j15 = 128;
                    }
                    i14 = 0;
                    j8 = j17;
                    j14 = 255;
                    int iC = g1.c(this.f134688f);
                    long[] jArr7 = this.f134683a;
                    Object[] objArr4 = this.f134684b;
                    long[] jArr8 = this.f134685c;
                    int i74 = this.f134688f;
                    int[] iArr = new int[i74];
                    f(iC);
                    long[] jArr9 = this.f134683a;
                    Object[] objArr5 = this.f134684b;
                    long[] jArr10 = this.f134685c;
                    int i75 = this.f134688f;
                    int i76 = 0;
                    while (i76 < i74) {
                        if (((jArr7[i76 >> 3] >> ((i76 & 7) << 3)) & 255) < j15) {
                            Object obj3 = objArr4[i76];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i29;
                            int i77 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i77 >>> 7);
                            jArr = jArr9;
                            long j39 = i77 & 127;
                            int i78 = iE3 >> 3;
                            int i79 = (iE3 & 7) << 3;
                            long j44 = (jArr[i78] & (~(255 << i79))) | (j39 << i79);
                            jArr[i78] = j44;
                            jArr[(((iE3 - 7) & i75) + (i75 & 7)) >> 3] = j44;
                            objArr5[iE3] = obj3;
                            jArr10[iE3] = jArr8[i76];
                            iArr[i76] = iE3;
                        } else {
                            jArr = jArr9;
                        }
                        i76++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.f134685c;
                    int length3 = jArr11.length;
                    for (int i84 = 0; i84 < length3; i84++) {
                        long j45 = jArr11[i84];
                        int i85 = (int) ((j45 >> c14) & 2147483647L);
                        int i86 = (int) (j45 & 2147483647L);
                        jArr11[i84] = (((j45 & (-4611686018427387904L)) | ((long) (i85 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i85]))) << c14) | ((long) (i86 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i86]));
                    }
                    int i87 = this.f134686d;
                    if (i87 != Integer.MAX_VALUE) {
                        this.f134686d = iArr[i87];
                    }
                    int i88 = this.f134687e;
                    if (i88 != Integer.MAX_VALUE) {
                        this.f134687e = iArr[i88];
                    }
                    iE = e(i17);
                }
                this.f134689g++;
                int i89 = this.f134817h;
                long[] jArr12 = this.f134683a;
                int i93 = iE >> 3;
                long j46 = jArr12[i93];
                int i94 = (iE & 7) << 3;
                if (((j46 >> i94) & j14) == j15) {
                    i14 = 1;
                }
                this.f134817h = i89 - i14;
                int i95 = this.f134688f;
                long j47 = (j46 & (~(j14 << i94))) | (j8 << i94);
                jArr12[i93] = j47;
                jArr12[(((iE - 7) & i95) + (i95 & 7)) >> 3] = j47;
                return iE;
            }
            i25 += 8;
            i24 = (i24 + i25) & i19;
            i15 = i29;
        }
    }

    public final int e(int i14) {
        int i15 = this.f134688f;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134683a;
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
        long[] jArr2;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134688f = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i15];
            Arrays.fill(jArr3, 0, i15, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f134683a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134817h = g1.a(this.f134688f) - this.f134689g;
        this.f134684b = iMax == 0 ? q1.a.f142056c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = b0.f134675b;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f134685c = jArr2;
    }

    public final boolean g(E e4) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e4 != null ? e4.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134688f;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134683a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j8 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j14 = (((long) i15) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (p005kotlin.jvm.internal.s.g(this.f134684b[iNumberOfTrailingZeros], e4)) {
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
            h(iNumberOfTrailingZeros);
        }
        return z14;
    }

    public final void h(int i14) {
        this.f134689g--;
        long[] jArr = this.f134683a;
        int i15 = this.f134688f;
        int i16 = i14 >> 3;
        int i17 = (i14 & 7) << 3;
        long j8 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j8;
        jArr[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j8;
        this.f134684b[i14] = null;
        long[] jArr2 = this.f134685c;
        long j14 = jArr2[i14];
        int i18 = (int) ((j14 >> 31) & 2147483647L);
        int i19 = (int) (j14 & 2147483647L);
        if (i18 != Integer.MAX_VALUE) {
            jArr2[i18] = (jArr2[i18] & (-2147483648L)) | (((long) i19) & 2147483647L);
        } else {
            this.f134686d = i19;
        }
        if (i19 != Integer.MAX_VALUE) {
            jArr2[i19] = ((((long) i18) & 2147483647L) << 31) | (jArr2[i19] & (-4611686016279904257L));
        } else {
            this.f134687e = i18;
        }
        jArr2[i14] = 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[LOOP:0: B:5:0x0012->B:17:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[EDGE_INSN: B:24:0x0054->B:18:0x0054 BREAK  A[LOOP:0: B:5:0x0012->B:17:0x0051], SYNTHETIC] */
    public final boolean i(Collection<? extends E> collection) {
        collection.getClass();
        Object[] objArr = this.f134684b;
        int i14 = this.f134689g;
        long[] jArr = this.f134683a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j8 = jArr[i15];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j8) < 128) {
                            int i18 = (i15 << 3) + i17;
                            if (!p13.h0.R(collection, objArr[i18])) {
                                h(i18);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return i14 != this.f134689g;
    }

    public /* synthetic */ r0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }

    public r0() {
        this(0, 1, null);
    }
}
