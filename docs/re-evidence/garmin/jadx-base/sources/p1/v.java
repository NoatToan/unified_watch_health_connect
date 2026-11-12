package p1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lp1/v;", "V", "", "<init>", "()V", "Lp1/m0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class v<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f134841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f134842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134844e;

    private v() {
        this.f134840a = g1.f134727a;
        this.f134841b = y.f134872a;
        this.f134842c = q1.a.f142056c;
    }

    public final boolean a(long j8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134843d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134840a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j15 = (((long) i15) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                if (this.f134841b[iNumberOfTrailingZeros] == j8) {
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

    public final V b(long j8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134843d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134840a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j15 = (((long) i15) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                if (this.f134841b[iNumberOfTrailingZeros] == j8) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.f134842c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z14;
        long[] jArr;
        boolean z15;
        long[] jArr2;
        boolean z16 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (vVar.f134844e != this.f134844e) {
            return false;
        }
        long[] jArr3 = this.f134841b;
        Object[] objArr = this.f134842c;
        long[] jArr4 = this.f134840a;
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
                        z15 = z16;
                        jArr2 = jArr3;
                        long j14 = jArr2[i17];
                        Object obj2 = objArr[i17];
                        if (obj2 == null) {
                            if (vVar.b(j14) != null || !vVar.a(j14)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(vVar.b(j14))) {
                            return false;
                        }
                    } else {
                        z15 = z16;
                        jArr2 = jArr3;
                    }
                    j8 >>= 8;
                    i16++;
                    z16 = z15;
                    jArr3 = jArr2;
                }
                z14 = z16;
                jArr = jArr3;
                if (i15 != 8) {
                    return z14;
                }
            } else {
                z14 = z16;
                jArr = jArr3;
            }
            if (i14 == length) {
                return z14;
            }
            i14++;
            z16 = z14;
            jArr3 = jArr;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f134841b;
        Object[] objArr = this.f134842c;
        long[] jArr2 = this.f134840a;
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
                        Object obj = objArr[i17];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j14);
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
        if (this.f134844e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        long[] jArr = this.f134841b;
        Object[] objArr = this.f134842c;
        long[] jArr2 = this.f134840a;
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
                            Object obj = objArr[i24];
                            sb3.append(j14);
                            sb3.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            i17++;
                            if (i17 < this.f134844e) {
                                sb3.append(", ");
                            }
                        } else {
                            i15 = i16;
                        }
                        j8 >>= 8;
                        i19++;
                        i16 = i15;
                    }
                    int i25 = i16;
                    if (i18 != 8) {
                        break;
                    }
                    i14 = i25;
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

    public /* synthetic */ v(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
