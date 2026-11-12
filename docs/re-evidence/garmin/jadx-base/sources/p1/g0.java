package p1;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/g0;", "Lp1/i;", "", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g0 extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134726f;

    public g0(int i14) {
        super(null);
        if (i14 >= 0) {
            e(g1.e(i14));
        } else {
            vb.h.s("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f134741e = 0;
        long[] jArr = this.f134737a;
        if (jArr != g1.f134727a) {
            p13.s.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f134737a;
            int i14 = this.f134740d;
            int i15 = i14 >> 3;
            long j8 = 255 << ((i14 & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j8)) | j8;
        }
        this.f134726f = g1.a(this.f134740d) - this.f134741e;
    }

    public final int d(int i14) {
        int i15 = this.f134740d;
        int i16 = i14 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f134737a;
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

    public final void e(int i14) {
        long[] jArr;
        int iMax = i14 > 0 ? Math.max(7, g1.d(i14)) : 0;
        this.f134740d = iMax;
        if (iMax == 0) {
            jArr = g1.f134727a;
        } else {
            int i15 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i15];
            Arrays.fill(jArr2, 0, i15, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f134737a = jArr;
        int i16 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i16] = (jArr[i16] & (~j8)) | j8;
        this.f134726f = g1.a(this.f134740d) - this.f134741e;
        this.f134738b = new int[iMax];
        this.f134739c = new int[iMax];
    }

    public final void f(int i14, int i15) {
        long j8;
        long j14;
        int i16;
        int i17;
        long j15;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i18 = i14;
        int i19 = -862048943;
        int iHashCode = Integer.hashCode(i18) * (-862048943);
        int i24 = iHashCode ^ (iHashCode << 16);
        int i25 = i24 >>> 7;
        int i26 = i24 & 127;
        int i27 = this.f134740d;
        int i28 = i25 & i27;
        int i29 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f134737a;
            int i30 = i28 >> 3;
            int i34 = (i28 & 7) << 3;
            int i35 = 1;
            int i36 = i29;
            int i37 = 0;
            long j16 = (((-i34) >> 63) & (jArr2[i30 + 1] << (64 - i34))) | (jArr2[i30] >>> i34);
            long j17 = i26;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            long j19 = (j18 - 72340172838076673L) & (~j18) & (-9187201950435737472L);
            while (j19 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j19) >> 3) + i28) & i27;
                int i38 = i19;
                if (this.f134738b[iNumberOfTrailingZeros] == i18) {
                    break loop0;
                }
                j19 &= j19 - 1;
                i19 = i38;
            }
            int i39 = i19;
            if ((j16 & ((~j16) << 6) & (-9187201950435737472L)) != 0) {
                int iD = d(i25);
                long j24 = 255;
                if (this.f134726f != 0 || ((this.f134737a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j8 = j17;
                    j14 = 255;
                    i16 = 1;
                    i17 = 0;
                    j15 = 128;
                } else {
                    int i44 = this.f134740d;
                    if (i44 > 8) {
                        j15 = 128;
                        long j25 = this.f134741e;
                        o13.z.a aVar = o13.z.f128618b;
                        if (Long.compareUnsigned(j25 * 32, ((long) i44) * 25) <= 0) {
                            long[] jArr3 = this.f134737a;
                            int i45 = this.f134740d;
                            int[] iArr3 = this.f134738b;
                            int[] iArr4 = this.f134739c;
                            int i46 = (i45 + 7) >> 3;
                            int i47 = 0;
                            while (i47 < i46) {
                                long j26 = jArr3[i47] & (-9187201950435737472L);
                                jArr3[i47] = (-72340172838076674L) & ((~j26) + (j26 >>> 7));
                                i47++;
                                j24 = j24;
                                j17 = j17;
                            }
                            j8 = j17;
                            j14 = j24;
                            char c14 = 7;
                            int iJ = p13.u.J(jArr3);
                            int i48 = iJ - 1;
                            jArr3[i48] = (jArr3[i48] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ] = jArr3[0];
                            int i49 = 0;
                            while (i49 != i45) {
                                int i54 = i49 >> 3;
                                int i55 = (i49 & 7) << 3;
                                long j27 = (jArr3[i54] >> i55) & j14;
                                if (j27 != 128 && j27 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i49]) * i39;
                                    int i56 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i57 = i56 >>> 7;
                                    int iD2 = d(i57);
                                    int i58 = i57 & i45;
                                    char c15 = c14;
                                    if (((iD2 - i58) & i45) / 8 == ((i49 - i58) & i45) / 8) {
                                        int i59 = i37;
                                        jArr3[i54] = (((long) (i56 & 127)) << i55) | (jArr3[i54] & (~(j14 << i55)));
                                        jArr3[jArr3.length - 1] = (jArr3[i59] & 72057594037927935L) | Long.MIN_VALUE;
                                        i49++;
                                        i35 = i35;
                                        c14 = c15;
                                        i37 = i59;
                                    } else {
                                        int i64 = i35;
                                        int i65 = i37;
                                        int i66 = iD2 >> 3;
                                        long j28 = jArr3[i66];
                                        int i67 = (iD2 & 7) << 3;
                                        if (((j28 >> i67) & j14) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i66] = ((~(j14 << i67)) & j28) | (((long) (i56 & 127)) << i67);
                                            jArr3[i54] = (jArr3[i54] & (~(j14 << i55))) | (128 << i55);
                                            iArr[iD2] = iArr[i49];
                                            iArr[i49] = i65;
                                            iArr2[iD2] = iArr2[i49];
                                            iArr2[i49] = i65;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i66] = (((long) (i56 & 127)) << i67) | ((~(j14 << i67)) & j28);
                                            int i68 = iArr[iD2];
                                            iArr[iD2] = iArr[i49];
                                            iArr[i49] = i68;
                                            int i69 = iArr2[iD2];
                                            iArr2[iD2] = iArr2[i49];
                                            iArr2[i49] = i69;
                                            i49--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i65] & 72057594037927935L) | Long.MIN_VALUE;
                                        i49++;
                                        i35 = i64;
                                        c14 = c15;
                                        i37 = i65;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i49++;
                                }
                            }
                            i16 = i35;
                            i17 = i37;
                            this.f134726f = g1.a(this.f134740d) - this.f134741e;
                        }
                        iD = d(i25);
                    } else {
                        j15 = 128;
                    }
                    j8 = j17;
                    j14 = 255;
                    i16 = 1;
                    i17 = 0;
                    int iC = g1.c(this.f134740d);
                    long[] jArr4 = this.f134737a;
                    int[] iArr5 = this.f134738b;
                    int[] iArr6 = this.f134739c;
                    int i74 = this.f134740d;
                    e(iC);
                    long[] jArr5 = this.f134737a;
                    int[] iArr7 = this.f134738b;
                    int[] iArr8 = this.f134739c;
                    int i75 = this.f134740d;
                    int i76 = 0;
                    while (i76 < i74) {
                        if (((jArr4[i76 >> 3] >> ((i76 & 7) << 3)) & 255) < j15) {
                            int i77 = iArr5[i76];
                            int iHashCode3 = Integer.hashCode(i77) * i39;
                            int i78 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD3 = d(i78 >>> 7);
                            jArr = jArr5;
                            long j29 = i78 & 127;
                            int i79 = iD3 >> 3;
                            int i84 = (iD3 & 7) << 3;
                            long j34 = (jArr[i79] & (~(255 << i84))) | (j29 << i84);
                            jArr[i79] = j34;
                            jArr[(((iD3 - 7) & i75) + (i75 & 7)) >> 3] = j34;
                            iArr7[iD3] = i77;
                            iArr8[iD3] = iArr6[i76];
                        } else {
                            jArr = jArr5;
                        }
                        i76++;
                        jArr5 = jArr;
                    }
                    iD = d(i25);
                }
                this.f134741e++;
                int i85 = this.f134726f;
                long[] jArr6 = this.f134737a;
                int i86 = iD >> 3;
                long j35 = jArr6[i86];
                int i87 = (iD & 7) << 3;
                if (((j35 >> i87) & j14) == j15) {
                    i17 = i16;
                }
                this.f134726f = i85 - i17;
                int i88 = this.f134740d;
                long j36 = (j35 & (~(j14 << i87))) | (j8 << i87);
                jArr6[i86] = j36;
                jArr6[(((iD - 7) & i88) + (i88 & 7)) >> 3] = j36;
                iNumberOfTrailingZeros = ~iD;
                break;
            }
            i29 = i36 + 8;
            i28 = (i28 + i29) & i27;
            i18 = i14;
            i19 = i39;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f134738b[iNumberOfTrailingZeros] = i14;
        this.f134739c[iNumberOfTrailingZeros] = i15;
    }

    public g0() {
        this(0, 1, null);
    }

    public /* synthetic */ g0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 6 : i14);
    }
}
