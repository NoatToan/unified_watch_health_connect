package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lp1/p;", "", "<init>", "()V", "Lp1/j0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f134794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134796d;

    private p() {
        this.f134793a = g1.f134727a;
        this.f134794b = q.f134798a;
    }

    public final boolean a(int i14) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i14) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134795c;
        int i18 = (i15 >>> 7) & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f134793a;
            int i24 = i18 >> 3;
            int i25 = (i18 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i17;
                if (this.f134794b[iNumberOfTrailingZeros] == i14) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f134796d != this.f134796d) {
            return false;
        }
        int[] iArr = this.f134794b;
        long[] jArr = this.f134793a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128 && !pVar.a(iArr[(i14 << 3) + i16])) {
                            return false;
                        }
                        j8 >>= 8;
                    }
                    if (i15 == 8) {
                        if (i14 != length) {
                            i14++;
                        }
                    }
                } else if (i14 != length) {
                    i14++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f134794b;
        long[] jArr = this.f134793a;
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
                        iHashCode = Integer.hashCode(iArr[(i14 << 3) + i16]) + iHashCode;
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
        int[] iArr = this.f134794b;
        long[] jArr = this.f134793a;
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
                        int i18 = iArr[(i14 << 3) + i17];
                        if (i15 == -1) {
                            sb3.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb3.append((CharSequence) ", ");
                        }
                        sb3.append(i18);
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

    public /* synthetic */ p(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
