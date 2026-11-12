package p1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lp1/f1;", "K", "V", "", "<init>", "()V", "Lp1/t0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f134721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f134722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134724e;

    private f1() {
        this.f134720a = g1.f134727a;
        Object[] objArr = q1.a.f142056c;
        this.f134721b = objArr;
        this.f134722c = objArr;
    }

    public final boolean a(K k14) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k14 != null ? k14.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134723d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134720a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j8 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j14 = (((long) i15) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (p005kotlin.jvm.internal.s.g(this.f134721b[iNumberOfTrailingZeros], k14)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean b(K k14) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k14 != null ? k14.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134723d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134720a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j8 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j14 = (((long) i15) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (p005kotlin.jvm.internal.s.g(this.f134721b[iNumberOfTrailingZeros], k14)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean c(V v14) {
        Object[] objArr = this.f134722c;
        long[] jArr = this.f134720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128 && p005kotlin.jvm.internal.s.g(v14, objArr[(i14 << 3) + i16])) {
                            return true;
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
        return false;
    }

    public final V d(K k14) {
        int iNumberOfTrailingZeros;
        int i14 = 0;
        int iHashCode = (k14 != null ? k14.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & 127;
        int i17 = this.f134723d;
        int i18 = i15 >>> 7;
        loop0: while (true) {
            int i19 = i18 & i17;
            long[] jArr = this.f134720a;
            int i24 = i19 >> 3;
            int i25 = (i19 & 7) << 3;
            long j8 = ((jArr[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr[i24] >>> i25);
            long j14 = (((long) i16) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i19) & i17;
                if (p005kotlin.jvm.internal.s.g(this.f134721b[iNumberOfTrailingZeros], k14)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i18 = i19 + i14;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.f134722c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean e() {
        return this.f134724e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (f1Var.f134724e != this.f134724e) {
            return false;
        }
        Object[] objArr = this.f134721b;
        Object[] objArr2 = this.f134722c;
        long[] jArr = this.f134720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128) {
                            int i17 = (i14 << 3) + i16;
                            Object obj2 = objArr[i17];
                            Object obj3 = objArr2[i17];
                            if (obj3 == null) {
                                if (f1Var.d(obj2) != null || !f1Var.b(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(f1Var.d(obj2))) {
                                return false;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i14 != length) {
                        break;
                    }
                    i14++;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f134724e != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f134721b;
        Object[] objArr2 = this.f134722c;
        long[] jArr = this.f134720a;
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
                        Object obj2 = objArr2[i17];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
      0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (e()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        Object[] objArr = this.f134721b;
        Object[] objArr2 = this.f134722c;
        long[] jArr = this.f134720a;
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
                            Object obj2 = objArr2[i18];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb3.append(obj2);
                            i15++;
                            if (i15 < this.f134724e) {
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

    public /* synthetic */ f1(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
