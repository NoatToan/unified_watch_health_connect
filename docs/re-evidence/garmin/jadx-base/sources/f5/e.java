package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface e extends h5.c0 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Ljava/lang/Object;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a {
        public a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Ljava/lang/Object;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b {
        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v1 f68927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1 v1Var) {
            super(1);
            this.f68927a = v1Var;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            aVar.r(this.f68927a, 0, 0, 0.0f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Ljava/lang/Object;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d {
        public d() {
        }
    }

    /* JADX INFO: renamed from: f5.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lf5/y0;", "intrinsicMeasurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Ljava/lang/Object;Lf5/y0;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C1426e {
        public C1426e() {
        }
    }

    boolean N1();

    default int O(f5.c cVar, w wVar, int i14) {
        h5.c1 coordinator = getNode().getCoordinator();
        coordinator.getClass();
        h5.m0 m0VarD1 = coordinator.D1();
        m0VarD1.getClass();
        if (!m0VarD1.P0()) {
            return wVar.e0(i14);
        }
        h5.h1 h1Var = h5.h1.f81827a;
        d dVar = new d();
        h1Var.getClass();
        new h5.h1.a(wVar, h5.h1.c.Min, h5.h1.d.Height);
        g6.b.b(i14, 0, 13);
        new f5.d(cVar, cVar.getF68910b());
        return e.this.c0().getF68912b();
    }

    default int S0(f5.c cVar, w wVar, int i14) {
        h5.c1 coordinator = getNode().getCoordinator();
        coordinator.getClass();
        h5.m0 m0VarD1 = coordinator.D1();
        m0VarD1.getClass();
        if (!m0VarD1.P0()) {
            return wVar.a0(i14);
        }
        h5.h1 h1Var = h5.h1.f81827a;
        a aVar = new a();
        h1Var.getClass();
        new h5.h1.a(wVar, h5.h1.c.Max, h5.h1.d.Height);
        g6.b.b(i14, 0, 13);
        new f5.d(cVar, cVar.getF68910b());
        return e.this.c0().getF68912b();
    }

    default int U0(f5.c cVar, w wVar, int i14) {
        h5.c1 coordinator = getNode().getCoordinator();
        coordinator.getClass();
        h5.m0 m0VarD1 = coordinator.D1();
        m0VarD1.getClass();
        if (!m0VarD1.P0()) {
            return wVar.l0(i14);
        }
        h5.h1 h1Var = h5.h1.f81827a;
        b bVar = new b();
        h1Var.getClass();
        new h5.h1.a(wVar, h5.h1.c.Max, h5.h1.d.Width);
        g6.b.b(0, i14, 7);
        new f5.d(cVar, cVar.getF68910b());
        return e.this.c0().getF68911a();
    }

    a1 c0();

    default int g1(f5.c cVar, w wVar, int i14) {
        h5.c1 coordinator = getNode().getCoordinator();
        coordinator.getClass();
        h5.m0 m0VarD1 = coordinator.D1();
        m0VarD1.getClass();
        if (!m0VarD1.P0()) {
            return wVar.O(i14);
        }
        h5.h1 h1Var = h5.h1.f81827a;
        C1426e c1426e = new C1426e();
        h1Var.getClass();
        new h5.h1.a(wVar, h5.h1.c.Min, h5.h1.d.Width);
        g6.b.b(0, i14, 7);
        new f5.d(cVar, cVar.getF68910b());
        return e.this.c0().getF68911a();
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    default a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        v1 v1VarQ = y0Var.Q(j8);
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new c(v1VarQ));
    }
}
