package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface c0 extends j {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf5/b1;", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a {
        public a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf5/b1;", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b {
        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf5/b1;", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c {
        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf5/b1;", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d {
        public d() {
        }
    }

    default int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        h1 h1Var = h1.f81827a;
        a aVar = new a();
        h1Var.getClass();
        h1.a aVar2 = new h1.a(wVar, h1.c.Max, h1.d.Height);
        long jB = g6.b.b(i14, 0, 13);
        return c0.this.mo5measure3p2s80s(new f5.a0(xVar, xVar.getF68887b()), aVar2, jB).getF68889b();
    }

    default int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        h1 h1Var = h1.f81827a;
        b bVar = new b();
        h1Var.getClass();
        h1.a aVar = new h1.a(wVar, h1.c.Max, h1.d.Width);
        long jB = g6.b.b(0, i14, 7);
        return c0.this.mo5measure3p2s80s(new f5.a0(xVar, xVar.getF68887b()), aVar, jB).getF68888a();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8);

    default int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        h1 h1Var = h1.f81827a;
        c cVar = new c();
        h1Var.getClass();
        h1.a aVar = new h1.a(wVar, h1.c.Min, h1.d.Height);
        long jB = g6.b.b(i14, 0, 13);
        return c0.this.mo5measure3p2s80s(new f5.a0(xVar, xVar.getF68887b()), aVar, jB).getF68889b();
    }

    default int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        h1 h1Var = h1.f81827a;
        d dVar = new d();
        h1Var.getClass();
        h1.a aVar = new h1.a(wVar, h1.c.Min, h1.d.Width);
        long jB = g6.b.b(0, i14, 7);
        return c0.this.mo5measure3p2s80s(new f5.a0(xVar, xVar.getF68887b()), aVar, jB).getF68888a();
    }
}
