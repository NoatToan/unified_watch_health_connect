package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lp1/f;", "", "<init>", "()V", "Lp1/f0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f134718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134719c;

    private f() {
        this.f134717a = g1.f134727a;
        this.f134718b = g.f134725a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v3 */
    public final boolean equals(Object obj) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i14;
        long j8;
        int iNumberOfTrailingZeros;
        boolean z18 = true;
        if (obj == this) {
            return true;
        }
        boolean z19 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        float[] fArr = this.f134718b;
        long[] jArr = this.f134717a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j14 = jArr[i15];
            long j15 = -9187201950435737472L;
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                for (?? r15 = z19; r15 < i17; r15++) {
                    if ((j14 & 255) < 128) {
                        float f14 = fArr[(i15 << 3) + r15];
                        int iHashCode = Float.hashCode(f14) * (-862048943);
                        int i18 = iHashCode ^ (iHashCode << 16);
                        z16 = z18;
                        int i19 = i18 & 127;
                        z17 = z19;
                        int i24 = fVar.f134719c;
                        int i25 = (i18 >>> 7) & i24;
                        ?? r24 = z17;
                        while (true) {
                            long[] jArr2 = fVar.f134717a;
                            int i26 = i25 >> 3;
                            j8 = j15;
                            int i27 = (i25 & 7) << 3;
                            long j16 = (jArr2[i26] >>> i27) | ((jArr2[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
                            int i28 = i16;
                            long j17 = j16 ^ (((long) i19) * 72340172838076673L);
                            long j18 = (j17 - 72340172838076673L) & (~j17) & j8;
                            while (j18 != 0) {
                                iNumberOfTrailingZeros = (i25 + (Long.numberOfTrailingZeros(j18) >> 3)) & i24;
                                i14 = i28;
                                if (fVar.f134718b[iNumberOfTrailingZeros] == f14) {
                                    break;
                                }
                                j18 &= j18 - 1;
                                i28 = i14;
                            }
                            i14 = i28;
                            if ((j16 & ((~j16) << 6) & j8) != 0) {
                                iNumberOfTrailingZeros = -1;
                                break;
                            }
                            int i29 = r24 + 8;
                            i25 = (i25 + i29) & i24;
                            j15 = j8;
                            i16 = i14;
                            r24 = i29;
                        }
                        if (!(iNumberOfTrailingZeros >= 0 ? z16 : z17)) {
                            return z17;
                        }
                    } else {
                        z16 = z18;
                        z17 = z19;
                        i14 = i16;
                        j8 = j15;
                    }
                    j14 >>= i14;
                    z18 = z16;
                    z19 = z17;
                    j15 = j8;
                    i16 = i14;
                }
                z14 = z18;
                z15 = z19;
                if (i17 != i16) {
                    return z14;
                }
            } else {
                z14 = z18;
                z15 = z19;
            }
            if (i15 == length) {
                return z14;
            }
            i15++;
            z18 = z14;
            z19 = z15;
        }
    }

    public final int hashCode() {
        float[] fArr = this.f134718b;
        long[] jArr = this.f134717a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i14 = 0;
        int iHashCode = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        iHashCode = Float.hashCode(fArr[(i14 << 3) + i16]) + iHashCode;
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return iHashCode;
                }
            }
            if (i14 == length) {
                return iHashCode;
            }
            i14++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        float[] fArr = this.f134718b;
        long[] jArr = this.f134717a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb3.append((CharSequence) "]");
            break;
        }
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j8) < 128) {
                        float f14 = fArr[(i14 << 3) + i17];
                        if (i15 == -1) {
                            sb3.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb3.append((CharSequence) ", ");
                        }
                        sb3.append(f14);
                        i15++;
                    }
                    j8 >>= 8;
                }
                if (i16 == 8) {
                    if (i14 == length) {
                        i14++;
                    }
                }
                sb3.append((CharSequence) "]");
                break;
            }
            if (i14 == length) {
                sb3.append((CharSequence) "]");
                break;
            }
            i14++;
        }
        return sb3.toString();
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
