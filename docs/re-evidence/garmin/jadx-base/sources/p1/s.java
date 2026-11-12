package p1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lp1/s;", "", "<init>", "()V", "Lp1/k0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f134819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f134820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134822e;

    private s() {
        this.f134818a = g1.f134727a;
        this.f134819b = y.f134872a;
        this.f134820c = q.f134798a;
    }

    public final int a(long j8) {
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134821d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f134818a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j15 = (((long) i15) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                if (this.f134819b[iNumberOfTrailingZeros] == j8) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
    }

    public final int b(long j8) {
        int iA = a(j8);
        if (iA >= 0) {
            return this.f134820c[iA];
        }
        n23.j.s(org.apache.commons.lang3.e.e(j8, "Cannot find value for key "));
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z14;
        long[] jArr;
        long[] jArr2;
        boolean z15 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (sVar.f134822e != this.f134822e) {
            return false;
        }
        long[] jArr3 = this.f134819b;
        int[] iArr = this.f134820c;
        long[] jArr4 = this.f134818a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        loop0: while (true) {
            long j8 = jArr4[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j8) < 128) {
                        int i17 = (i14 << 3) + i16;
                        jArr2 = jArr3;
                        long j14 = jArr2[i17];
                        int i18 = iArr[i17];
                        int iA = sVar.a(j14);
                        if (iA < 0 || i18 != sVar.f134820c[iA]) {
                            break loop0;
                        }
                    } else {
                        jArr2 = jArr3;
                    }
                    j8 >>= 8;
                    i16++;
                    z15 = z15;
                    jArr3 = jArr2;
                }
                z14 = z15;
                jArr = jArr3;
                if (i15 != 8) {
                    return z14;
                }
            } else {
                z14 = z15;
                jArr = jArr3;
            }
            if (i14 == length) {
                return z14;
            }
            i14++;
            z15 = z14;
            jArr3 = jArr;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f134819b;
        int[] iArr = this.f134820c;
        long[] jArr2 = this.f134818a;
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
                        int i17 = (i14 << 3) + i16;
                        long j14 = jArr[i17];
                        iHashCode += Integer.hashCode(iArr[i17]) ^ Long.hashCode(j14);
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

    public final String toString() {
        int i14;
        int i15;
        if (this.f134822e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        long[] jArr = this.f134819b;
        int[] iArr = this.f134820c;
        long[] jArr2 = this.f134818a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i16 = 0;
            int i17 = 0;
            while (true) {
                long j8 = jArr2[i16];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((255 & j8) < 128) {
                            int i24 = (i16 << 3) + i19;
                            i15 = i16;
                            long j14 = jArr[i24];
                            int i25 = iArr[i24];
                            sb3.append(j14);
                            sb3.append("=");
                            sb3.append(i25);
                            i17++;
                            if (i17 < this.f134822e) {
                                sb3.append(", ");
                            }
                        } else {
                            i15 = i16;
                        }
                        j8 >>= 8;
                        i19++;
                        i16 = i15;
                    }
                    int i26 = i16;
                    if (i18 != 8) {
                        break;
                    }
                    i14 = i26;
                } else {
                    i14 = i16;
                }
                if (i14 == length) {
                    break;
                }
                i16 = i14 + 1;
            }
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    public /* synthetic */ s(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
