package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/p0;", "K", "Lp1/y0;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p0<K> extends y0<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134797f;

    public p0(int i14) {
        super(null);
        if (i14 >= 0) {
            f(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f134877e = 0;
        long[] jArr = this.f134873a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134873a;
            int i14 = this.f134876d;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        p13.s.m(0, this.f134876d, null, this.f134874b);
        this.f134797f = g1.a(this.f134876d) - this.f134877e;
    }

    public final int d(int i14) {
        int i15 = this.f134876d;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134873a;
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

    public final int e(K k14) {
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
        int i18 = this.f134876d;
        int i19 = i16 & i18;
        int i24 = 0;
        while (true) {
            long[] jArr2 = this.f134873a;
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
                if (p005kotlin.jvm.internal.s.g(this.f134874b[iNumberOfTrailingZeros], k14)) {
                    return iNumberOfTrailingZeros;
                }
                j19 &= j19 - 1;
                i14 = i28;
            }
            int i29 = i14;
            if ((((~j16) << 6) & j16 & (-9187201950435737472L)) != 0) {
                int iD = d(i16);
                long j24 = 255;
                if (this.f134797f != 0 || ((this.f134873a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j14 = j17;
                    j15 = 128;
                } else {
                    int i30 = this.f134876d;
                    if (i30 > 8) {
                        int i34 = 8;
                        long j25 = this.f134877e;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j25 * 32, ((long) i30) * 25) <= 0) {
                            long[] jArr3 = this.f134873a;
                            int i35 = this.f134876d;
                            Object[] objArr2 = this.f134874b;
                            int[] iArr = this.f134875c;
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
                                    int iD2 = d(i48);
                                    int i49 = i48 & i35;
                                    long j34 = j28;
                                    if (((iD2 - i49) & i35) / 8 == ((i44 - i49) & i35) / i38) {
                                        jArr3[i45] = (((long) (i47 & 127)) << i46) | (jArr3[i45] & (~(j8 << i46)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j34) | Long.MIN_VALUE;
                                        i44++;
                                        i38 = i38;
                                        j28 = j34;
                                    } else {
                                        int i54 = i38;
                                        int i55 = iD2 >> 3;
                                        long j35 = jArr3[i55];
                                        int i56 = (iD2 & 7) << 3;
                                        if (((j35 >> i56) & j8) == 128) {
                                            objArr = objArr2;
                                            jArr3[i55] = ((~(j8 << i56)) & j35) | (((long) (i47 & 127)) << i56);
                                            jArr3[i45] = (jArr3[i45] & (~(j8 << i46))) | (128 << i46);
                                            objArr[iD2] = objArr[i44];
                                            objArr[i44] = null;
                                            iArr[iD2] = iArr[i44];
                                            iArr[i44] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i55] = (((long) (i47 & 127)) << i56) | ((~(j8 << i56)) & j35);
                                            Object obj2 = objArr[iD2];
                                            objArr[iD2] = objArr[i44];
                                            objArr[i44] = obj2;
                                            int i57 = iArr[iD2];
                                            iArr[iD2] = iArr[i44];
                                            iArr[i44] = i57;
                                            i44--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j34) | Long.MIN_VALUE;
                                        i44++;
                                        i35 = i35;
                                        i38 = i54;
                                        j28 = j34;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i44++;
                                }
                            }
                            this.f134797f = g1.a(this.f134876d) - this.f134877e;
                        }
                        iD = d(i16);
                    }
                    j8 = 255;
                    j14 = j17;
                    j15 = 128;
                    int iC = g1.c(this.f134876d);
                    long[] jArr4 = this.f134873a;
                    Object[] objArr3 = this.f134874b;
                    int[] iArr2 = this.f134875c;
                    int i58 = this.f134876d;
                    f(iC);
                    long[] jArr5 = this.f134873a;
                    Object[] objArr4 = this.f134874b;
                    int[] iArr3 = this.f134875c;
                    int i59 = this.f134876d;
                    int i64 = 0;
                    while (i64 < i58) {
                        if (((jArr4[i64 >> 3] >> ((i64 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr3[i64];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i29;
                            int i65 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD3 = d(i65 >>> 7);
                            jArr = jArr5;
                            long j36 = i65 & 127;
                            int i66 = iD3 >> 3;
                            int i67 = (iD3 & 7) << 3;
                            long j37 = (jArr[i66] & (~(255 << i67))) | (j36 << i67);
                            jArr[i66] = j37;
                            jArr[(((iD3 - 7) & i59) + (i59 & 7)) >> 3] = j37;
                            objArr4[iD3] = obj3;
                            iArr3[iD3] = iArr2[i64];
                        } else {
                            jArr = jArr5;
                        }
                        i64++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iD = d(i16);
                }
                this.f134877e++;
                int i68 = this.f134797f;
                long[] jArr6 = this.f134873a;
                int i69 = iD >> 3;
                long j38 = jArr6[i69];
                int i74 = (iD & 7) << 3;
                this.f134797f = i68 - (((j38 >> i74) & j8) == j15 ? 1 : 0);
                int i75 = this.f134876d;
                long j39 = (j38 & (~(j8 << i74))) | (j14 << i74);
                jArr6[i69] = j39;
                jArr6[(((iD - 7) & i75) + (i75 & 7)) >> 3] = j39;
                return ~iD;
            }
            i24 += 8;
            i19 = (i19 + i24) & i18;
            i17 = i27;
            i14 = i29;
        }
    }

    public final void f(int i14) {
        long[] jArr;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134876d = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134873a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134797f = g1.a(this.f134876d) - this.f134877e;
        this.f134874b = new Object[iMax];
        this.f134875c = new int[iMax];
    }

    public final void g(int i14) {
        this.f134877e--;
        long[] jArr = this.f134873a;
        int i15 = this.f134876d;
        int i16 = i14 >> 3;
        int i17 = (i14 & 7) << 3;
        long j8 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j8;
        jArr[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j8;
        this.f134874b[i14] = null;
    }

    public final void h(K k14, int i14) {
        int iE = e(k14);
        if (iE < 0) {
            iE = ~iE;
        }
        this.f134874b[iE] = k14;
        this.f134875c[iE] = i14;
    }

    public /* synthetic */ p0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }

    public p0() {
        this(0, 1, null);
    }
}
