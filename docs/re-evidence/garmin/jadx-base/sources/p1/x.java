package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lp1/x;", "", "<init>", "()V", "Lp1/n0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f134868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134870d;

    private x() {
        this.f134867a = g1.f134727a;
        this.f134868b = y.f134872a;
    }

    public final boolean a(long j8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134869c;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134867a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j15 = (((long) i15) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                if (this.f134868b[iNumberOfTrailingZeros] == j8) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f134870d != this.f134870d) {
            return false;
        }
        long[] jArr = this.f134868b;
        long[] jArr2 = this.f134867a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr2[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128 && !xVar.a(jArr[(i14 << 3) + i16])) {
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
        long[] jArr = this.f134868b;
        long[] jArr2 = this.f134867a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i14 = 0;
        int iHashCode = 0;
        while (true) {
            long j8 = jArr2[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        iHashCode = Long.hashCode(jArr[(i14 << 3) + i16]) + iHashCode;
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
        long[] jArr = this.f134868b;
        long[] jArr2 = this.f134867a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb3.append((CharSequence) "]");
            break;
        }
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            long j8 = jArr2[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j8) < 128) {
                        long j14 = jArr[(i14 << 3) + i17];
                        if (i15 == -1) {
                            sb3.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb3.append((CharSequence) ", ");
                        }
                        sb3.append(j14);
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

    public /* synthetic */ x(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
