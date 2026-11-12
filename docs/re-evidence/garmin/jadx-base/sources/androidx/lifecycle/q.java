package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/q;", "Lo53/u0;", "Landroidx/lifecycle/s0;", "source", "Landroidx/lifecycle/w0;", "mediator", "<init>", "(Landroidx/lifecycle/s0;Landroidx/lifecycle/w0;)V", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q implements o53.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0<?> f7992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0<?> f7993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7994c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return q.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            q qVar = q.this;
            if (!qVar.f7994c) {
                qVar.f7993b.o(qVar.f7992a);
                qVar.f7994c = true;
            }
            return Unit.INSTANCE;
        }
    }

    public q(s0<?> s0Var, w0<?> w0Var) {
        s0Var.getClass();
        w0Var.getClass();
        this.f7992a = s0Var;
        this.f7993b = w0Var;
    }

    @Override // o53.u0
    public final void dispose() {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(u53.o.f168762a.H()), null, null, new a(null), 3);
    }
}
