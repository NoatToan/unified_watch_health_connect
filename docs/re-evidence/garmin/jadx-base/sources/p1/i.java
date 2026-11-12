package p1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lp1/i;", "", "<init>", "()V", "Lp1/g0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f134738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f134739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134741e;

    private i() {
        this.f134737a = g1.f134727a;
        int[] iArr = q.f134798a;
        this.f134738b = iArr;
        this.f134739c = iArr;
    }

    public final int a(int i14) {
        int iHashCode = Integer.hashCode(i14) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134740d;
        int i18 = (i15 >>> 7) & i17;
        int i19 = 0;
        while (true) {
            long[] jArr = this.f134737a;
            int i24 = i18 >> 3;
            int i25 = (i18 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i17;
                if (this.f134738b[iNumberOfTrailingZeros] == i14) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
        }
    }

    public final int b(int i14) {
        int iA = a(i14);
        if (iA >= 0) {
            return this.f134739c[iA];
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        boolean z14;
        boolean z15 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.f134741e != this.f134741e) {
            return false;
        }
        int[] iArr = this.f134738b;
        int[] iArr2 = this.f134739c;
        long[] jArr = this.f134737a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        loop0: while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j8) < 128) {
                        int i17 = (i14 << 3) + i16;
                        int i18 = iArr[i17];
                        int i19 = iArr2[i17];
                        int iA = iVar.a(i18);
                        if (iA < 0 || i19 != iVar.f134739c[iA]) {
                            break loop0;
                        }
                    }
                    j8 >>= 8;
                    i16++;
                    z15 = z15;
                }
                z14 = z15;
                if (i15 != 8) {
                    return z14;
                }
            } else {
                z14 = z15;
            }
            if (i14 == length) {
                return z14;
            }
            i14++;
            z15 = z14;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f134738b;
        int[] iArr2 = this.f134739c;
        long[] jArr = this.f134737a;
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
                        int i17 = (i14 << 3) + i16;
                        int i18 = iArr[i17];
                        iHashCode += Integer.hashCode(iArr2[i17]) ^ Integer.hashCode(i18);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f134741e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        int[] iArr = this.f134738b;
        int[] iArr2 = this.f134739c;
        long[] jArr = this.f134737a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j8) < 128) {
                            int i18 = (i14 << 3) + i17;
                            int i19 = iArr[i18];
                            int i24 = iArr2[i18];
                            sb3.append(i19);
                            sb3.append("=");
                            sb3.append(i24);
                            i15++;
                            if (i15 < this.f134741e) {
                                sb3.append(", ");
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i14 != length) {
                        break;
                    }
                    i14++;
                }
            }
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
