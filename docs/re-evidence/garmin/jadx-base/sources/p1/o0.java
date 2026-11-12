package p1;

import java.io.Serializable;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/o0;", "K", "Lp1/w0;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o0<K> extends w0<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134781f;

    public o0(int i14) {
        super(null);
        if (i14 >= 0) {
            d(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int c(int i14) {
        int i15 = this.f134865d;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134862a;
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
        this.f134865d = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134862a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134781f = g1.a(this.f134865d) - this.f134866e;
        this.f134863b = new Object[iMax];
        this.f134864c = new float[iMax];
    }

    public final void e(int i14) {
        this.f134866e--;
        long[] jArr = this.f134862a;
        int i15 = this.f134865d;
        int i16 = i14 >> 3;
        int i17 = (i14 & 7) << 3;
        long j8 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j8;
        jArr[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j8;
        this.f134863b[i14] = null;
    }

    public final void f(Serializable serializable, float f14) {
        long j8;
        long j14;
        long j15;
        int i14;
        long[] jArr;
        Object[] objArr;
        Serializable serializable2 = serializable;
        int i15 = -862048943;
        int iHashCode = (serializable2 != null ? serializable2.hashCode() : 0) * (-862048943);
        int i16 = iHashCode ^ (iHashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f134865d;
        int i24 = i17 & i19;
        int i25 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f134862a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            long j16 = ((jArr2[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr2[i26] >>> i27);
            long j17 = i18;
            int i28 = i18;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            long j19 = -9187201950435737472L;
            long j24 = (~j18) & (j18 - 72340172838076673L) & (-9187201950435737472L);
            while (j24 != 0) {
                int iNumberOfTrailingZeros = (i24 + (Long.numberOfTrailingZeros(j24) >> 3)) & i19;
                int i29 = i15;
                if (p005kotlin.jvm.internal.s.g(this.f134863b[iNumberOfTrailingZeros], serializable2)) {
                    i14 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j24 &= j24 - 1;
                    i15 = i29;
                }
            }
            int i30 = i15;
            if ((((~j16) << 6) & j16 & (-9187201950435737472L)) != 0) {
                int iC = c(i17);
                if (this.f134781f != 0 || ((this.f134862a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j14 = j17;
                    j15 = 128;
                } else {
                    int i34 = this.f134865d;
                    if (i34 > 8) {
                        long j25 = this.f134866e;
                        o13.z.a aVar = o13.z.f128618b;
                        j15 = 128;
                        if (Long.compareUnsigned(j25 * 32, ((long) i34) * 25) <= 0) {
                            long[] jArr3 = this.f134862a;
                            int i35 = this.f134865d;
                            Object[] objArr2 = this.f134863b;
                            float[] fArr = this.f134864c;
                            int i36 = (i35 + 7) >> 3;
                            j8 = 255;
                            int i37 = 0;
                            while (i37 < i36) {
                                long j26 = jArr3[i37] & j19;
                                jArr3[i37] = (-72340172838076674L) & ((~j26) + (j26 >>> 7));
                                i37++;
                                j17 = j17;
                                j19 = -9187201950435737472L;
                            }
                            j14 = j17;
                            char c14 = 7;
                            int iJ = p13.u.J(jArr3);
                            int i38 = iJ - 1;
                            long j27 = 72057594037927935L;
                            jArr3[i38] = (jArr3[i38] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ] = jArr3[0];
                            int i39 = 0;
                            while (i39 != i35) {
                                int i44 = i39 >> 3;
                                int i45 = (i39 & 7) << 3;
                                long j28 = (jArr3[i44] >> i45) & 255;
                                if (j28 != 128 && j28 == 254) {
                                    Object obj = objArr2[i39];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i30;
                                    int i46 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i47 = i46 >>> 7;
                                    int iC2 = c(i47);
                                    int i48 = i47 & i35;
                                    char c15 = c14;
                                    if (((iC2 - i48) & i35) / 8 == ((i39 - i48) & i35) / 8) {
                                        long j29 = j27;
                                        jArr3[i44] = (((long) (i46 & 127)) << i45) | (jArr3[i44] & (~(255 << i45)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j29) | Long.MIN_VALUE;
                                        i39++;
                                        c14 = c15;
                                        j27 = j29;
                                    } else {
                                        long j34 = j27;
                                        int i49 = iC2 >> 3;
                                        long j35 = jArr3[i49];
                                        int i54 = (iC2 & 7) << 3;
                                        if (((j35 >> i54) & 255) == 128) {
                                            objArr = objArr2;
                                            jArr3[i49] = ((~(255 << i54)) & j35) | (((long) (i46 & 127)) << i54);
                                            jArr3[i44] = (jArr3[i44] & (~(255 << i45))) | (128 << i45);
                                            objArr[iC2] = objArr[i39];
                                            objArr[i39] = null;
                                            fArr[iC2] = fArr[i39];
                                            fArr[i39] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i49] = ((~(255 << i54)) & j35) | (((long) (i46 & 127)) << i54);
                                            Object obj2 = objArr[iC2];
                                            objArr[iC2] = objArr[i39];
                                            objArr[i39] = obj2;
                                            float f15 = fArr[iC2];
                                            fArr[iC2] = fArr[i39];
                                            fArr[i39] = f15;
                                            i39--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j34) | Long.MIN_VALUE;
                                        i39++;
                                        i35 = i35;
                                        c14 = c15;
                                        j27 = j34;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i39++;
                                }
                            }
                            this.f134781f = g1.a(this.f134865d) - this.f134866e;
                        }
                        iC = c(i17);
                    } else {
                        j15 = 128;
                    }
                    j8 = 255;
                    j14 = j17;
                    int iC3 = g1.c(this.f134865d);
                    long[] jArr4 = this.f134862a;
                    Object[] objArr3 = this.f134863b;
                    float[] fArr2 = this.f134864c;
                    int i55 = this.f134865d;
                    d(iC3);
                    long[] jArr5 = this.f134862a;
                    Object[] objArr4 = this.f134863b;
                    float[] fArr3 = this.f134864c;
                    int i56 = this.f134865d;
                    int i57 = 0;
                    while (i57 < i55) {
                        if (((jArr4[i57 >> 3] >> ((i57 & 7) << 3)) & 255) < j15) {
                            Object obj3 = objArr3[i57];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i30;
                            int i58 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC4 = c(i58 >>> 7);
                            jArr = jArr5;
                            long j36 = i58 & 127;
                            int i59 = iC4 >> 3;
                            int i64 = (iC4 & 7) << 3;
                            long j37 = (jArr[i59] & (~(255 << i64))) | (j36 << i64);
                            jArr[i59] = j37;
                            jArr[(((iC4 - 7) & i56) + (i56 & 7)) >> 3] = j37;
                            objArr4[iC4] = obj3;
                            fArr3[iC4] = fArr2[i57];
                        } else {
                            jArr = jArr5;
                        }
                        i57++;
                        jArr5 = jArr;
                    }
                    iC = c(i17);
                }
                this.f134866e++;
                int i65 = this.f134781f;
                long[] jArr6 = this.f134862a;
                int i66 = iC >> 3;
                long j38 = jArr6[i66];
                int i67 = (iC & 7) << 3;
                this.f134781f = i65 - (((j38 >> i67) & j8) == j15 ? 1 : 0);
                int i68 = this.f134865d;
                long j39 = (j38 & (~(j8 << i67))) | (j14 << i67);
                jArr6[i66] = j39;
                jArr6[(((iC - 7) & i68) + (i68 & 7)) >> 3] = j39;
                i14 = ~iC;
                break;
            }
            i25 += 8;
            i24 = (i24 + i25) & i19;
            serializable2 = serializable;
            i18 = i28;
            i15 = i30;
        }
        if (i14 < 0) {
            i14 = ~i14;
        }
        this.f134863b[i14] = serializable;
        this.f134864c[i14] = f14;
    }

    public /* synthetic */ o0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }

    public o0() {
        this(0, 1, null);
    }
}
