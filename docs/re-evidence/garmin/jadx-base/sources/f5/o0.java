package f5;

/* JADX INFO: loaded from: classes.dex */
public interface o0 extends h4.r.b {
    default int maxIntrinsicHeight(x xVar, w wVar, int i14) {
        d1.f68915a.getClass();
        return mo0measure3p2s80s(new a0(xVar, xVar.getF68910b()), new d1.a(wVar, d1.c.Max, d1.d.Height), g6.b.b(i14, 0, 13)).getF68912b();
    }

    default int maxIntrinsicWidth(x xVar, w wVar, int i14) {
        d1.f68915a.getClass();
        return mo0measure3p2s80s(new a0(xVar, xVar.getF68910b()), new d1.a(wVar, d1.c.Max, d1.d.Width), g6.b.b(0, i14, 7)).getF68911a();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    a1 mo0measure3p2s80s(b1 b1Var, y0 y0Var, long j8);

    default int minIntrinsicHeight(x xVar, w wVar, int i14) {
        d1.f68915a.getClass();
        return mo0measure3p2s80s(new a0(xVar, xVar.getF68910b()), new d1.a(wVar, d1.c.Min, d1.d.Height), g6.b.b(i14, 0, 13)).getF68912b();
    }

    default int minIntrinsicWidth(x xVar, w wVar, int i14) {
        d1.f68915a.getClass();
        return mo0measure3p2s80s(new a0(xVar, xVar.getF68910b()), new d1.a(wVar, d1.c.Min, d1.d.Width), g6.b.b(0, i14, 7)).getF68911a();
    }
}
