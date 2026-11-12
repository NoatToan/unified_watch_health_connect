package j23;

import androidx.room.a0;
import ds.e0;
import j20.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class t extends s {
    public static <T extends Comparable<? super T>> T b(T t7, T t14) {
        t7.getClass();
        t14.getClass();
        return t7.compareTo(t14) < 0 ? t14 : t7;
    }

    public static double c(double d14, double d15, double d16) {
        if (d15 <= d16) {
            if (d14 < d15) {
                return d15;
            }
            return d14 > d16 ? d16 : d14;
        }
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("Cannot coerce value to an empty range: maximum ", d16, " is less than minimum ");
        sbA.append(d15);
        sbA.append('.');
        throw new IllegalArgumentException(sbA.toString());
    }

    public static float d(float f14, float f15, float f16) {
        if (f15 <= f16) {
            if (f14 < f15) {
                return f15;
            }
            return f14 > f16 ? f16 : f14;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f16 + " is less than minimum " + f15 + '.');
    }

    public static int e(int i14, int i15, int i16) {
        if (i15 <= i16) {
            if (i14 < i15) {
                return i15;
            }
            return i14 > i16 ? i16 : i14;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i16 + " is less than minimum " + i15 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(int i14, l lVar) {
        lVar.getClass();
        int i15 = lVar.f96797b;
        int i16 = lVar.f96796a;
        if (lVar instanceof f) {
            return ((Number) j(Integer.valueOf(i14), (f) lVar)).intValue();
        }
        if (lVar.isEmpty()) {
            x.i(46, "Cannot coerce value to an empty range: ", lVar);
            return 0;
        }
        if (i14 < Integer.valueOf(i16).intValue()) {
            return Integer.valueOf(i16).intValue();
        }
        return i14 > Integer.valueOf(i15).intValue() ? Integer.valueOf(i15).intValue() : i14;
    }

    public static long g(long j8, long j14, long j15) {
        if (j14 > j15) {
            vb.h.s(a0.l(e0.k(j15, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j14, '.'));
            return 0L;
        }
        if (j8 < j14) {
            return j14;
        }
        return j8 > j15 ? j15 : j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long h(long j8, o oVar) {
        long j14 = oVar.f96807b;
        long j15 = oVar.f96806a;
        if (oVar instanceof f) {
            return ((Number) j(Long.valueOf(j8), (f) oVar)).longValue();
        }
        if (oVar.isEmpty()) {
            x.i(46, "Cannot coerce value to an empty range: ", oVar);
            return 0L;
        }
        if (j8 < Long.valueOf(j15).longValue()) {
            return Long.valueOf(j15).longValue();
        }
        return j8 > Long.valueOf(j14).longValue() ? Long.valueOf(j14).longValue() : j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Comparable i(g6.f fVar, i iVar) {
        T t7 = iVar.f96794b;
        T t14 = iVar.f96793a;
        if (iVar instanceof f) {
            return j(fVar, (f) iVar);
        }
        if (g.a.b(iVar)) {
            x.i(46, "Cannot coerce value to an empty range: ", iVar);
            return null;
        }
        if (fVar.compareTo(t14) < 0) {
            return t14;
        }
        return fVar.compareTo(t7) > 0 ? t7 : fVar;
    }

    public static <T extends Comparable<? super T>> T j(T t7, f<T> fVar) {
        fVar.getClass();
        if (fVar.isEmpty()) {
            x.i(46, "Cannot coerce value to an empty range: ", fVar);
            return null;
        }
        if (!fVar.a(t7, fVar.getStart()) || fVar.a(fVar.getStart(), t7)) {
            return (!fVar.a(fVar.b(), t7) || fVar.a(t7, fVar.b())) ? t7 : fVar.b();
        }
        return fVar.getStart();
    }

    public static <T extends Comparable<? super T>> T k(T t7, T t14, T t15) {
        t7.getClass();
        if (t14 == null || t15 == null) {
            if (t14 != null && t7.compareTo(t14) < 0) {
                return t14;
            }
            if (t15 != null && t7.compareTo(t15) > 0) {
                return t15;
            }
        } else {
            if (t14.compareTo(t15) > 0) {
                fb1.c.s(46, "Cannot coerce value to an empty range: maximum ", t15, " is less than minimum ", t14);
                return null;
            }
            if (t7.compareTo(t14) < 0) {
                return t14;
            }
            if (t7.compareTo(t15) > 0) {
                return t15;
            }
        }
        return t7;
    }

    public static j l(int i14, int i15) {
        j.f96795d.getClass();
        return new j(i14, i15, -1);
    }

    public static j m(l lVar) {
        lVar.getClass();
        j.a aVar = j.f96795d;
        int i14 = lVar.f96797b;
        int i15 = lVar.f96796a;
        int i16 = -lVar.f96798c;
        aVar.getClass();
        return new j(i14, i15, i16);
    }

    public static j n(int i14, l lVar) {
        lVar.getClass();
        boolean z14 = i14 > 0;
        Integer numValueOf = Integer.valueOf(i14);
        if (!z14) {
            x.i(46, "Step must be positive, was: ", numValueOf);
            return null;
        }
        j.a aVar = j.f96795d;
        int i15 = lVar.f96796a;
        int i16 = lVar.f96797b;
        if (lVar.f96798c <= 0) {
            i14 = -i14;
        }
        aVar.getClass();
        return new j(i15, i16, i14);
    }

    public static l o(int i14, int i15) {
        if (i15 > Integer.MIN_VALUE) {
            return new l(i14, i15 - 1);
        }
        l.f96803e.getClass();
        return l.f96804f;
    }
}
