package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lc2/d2;", "", "value", "Lg6/a;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22622a;

    public static long a(long j8, u1 u1Var) {
        u1 u1Var2 = u1.Horizontal;
        return g6.b.a(u1Var == u1Var2 ? g6.a.l(j8) : g6.a.k(j8), u1Var == u1Var2 ? g6.a.j(j8) : g6.a.i(j8), u1Var == u1Var2 ? g6.a.k(j8) : g6.a.l(j8), u1Var == u1Var2 ? g6.a.i(j8) : g6.a.j(j8));
    }

    public static long b(int i14, long j8) {
        return g6.b.a(0, g6.a.j(j8), (i14 & 4) != 0 ? g6.a.k(j8) : 0, g6.a.i(j8));
    }

    public static final long c(long j8, u1 u1Var) {
        return u1Var == u1.Horizontal ? g6.b.a(g6.a.l(j8), g6.a.j(j8), g6.a.k(j8), g6.a.i(j8)) : g6.b.a(g6.a.k(j8), g6.a.i(j8), g6.a.l(j8), g6.a.j(j8));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d2) {
            return g6.a.d(this.f22622a, ((d2) obj).f22622a);
        }
        return false;
    }

    public final int hashCode() {
        g6.a.C1525a c1525a = g6.a.f75987b;
        return Long.hashCode(this.f22622a);
    }

    public final String toString() {
        return "OrientationIndependentConstraints(value=" + ((Object) g6.a.n(this.f22622a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
