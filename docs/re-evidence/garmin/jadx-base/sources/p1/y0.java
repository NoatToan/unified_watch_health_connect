package p1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lp1/y0;", "K", "", "<init>", "()V", "Lp1/p0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class y0<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f134874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f134875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134877e;

    private y0() {
        this.f134873a = g1.f134727a;
        this.f134874b = q1.a.f142056c;
        this.f134875c = q.f134798a;
    }

    public final int a(K k14) {
        int i14 = 0;
        int iHashCode = (k14 != null ? k14.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134876d;
        int i18 = i15 >>> 7;
        while (true) {
            int i19 = i18 & i17;
            long[] jArr = this.f134873a;
            int i24 = i19 >> 3;
            int i25 = (i19 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i19) & i17;
                if (p005kotlin.jvm.internal.s.g(this.f134874b[iNumberOfTrailingZeros], k14)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i18 = i19 + i14;
        }
    }

    public final int b(K k14) {
        int iA = a(k14);
        if (iA >= 0) {
            return this.f134875c[iA];
        }
        n23.j.s(org.apache.commons.lang3.e.f("There is no key ", " in the map", k14));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        boolean z14;
        boolean z15 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (y0Var.f134877e != this.f134877e) {
            return false;
        }
        Object[] objArr = this.f134874b;
        int[] iArr = this.f134875c;
        long[] jArr = this.f134873a;
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
                        Object obj2 = objArr[i17];
                        int i18 = iArr[i17];
                        int iA = y0Var.a(obj2);
                        if (iA < 0 || i18 != y0Var.f134875c[iA]) {
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
        Object[] objArr = this.f134874b;
        int[] iArr = this.f134875c;
        long[] jArr = this.f134873a;
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
                        Object obj = objArr[i17];
                        iHashCode += Integer.hashCode(iArr[i17]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f134877e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        Object[] objArr = this.f134874b;
        int[] iArr = this.f134875c;
        long[] jArr = this.f134873a;
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
                            Object obj = objArr[i18];
                            int i19 = iArr[i18];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            sb3.append(i19);
                            i15++;
                            if (i15 < this.f134877e) {
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

    public /* synthetic */ y0(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
