package c;

import ch.qos.logback.core.joran.action.Action;
import java.util.concurrent.CancellationException;
import o53.b0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc/l;", "Ld/a;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lc/r;", "info", "<init>", "(Lo53/b0;Lc/r;)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f22323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.p<? super r53.i<b.c>, ? super t13.d<? super Unit>, ? extends Object> f22324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q53.b f22325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f22326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22327g;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/i;", "Lb/c;", "it", "", "<anonymous>", "(Lr53/i;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.activity.compose.ComposePredictiveBackHandler$currentOnBack$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<r53.i<? extends b.c>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.i<? extends b.c> iVar, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
    }

    public l(b0 b0Var, r rVar) {
        super(rVar);
        this.f22323c = b0Var;
        this.f22324d = new a(null);
    }

    @Override // d.a
    public final void b() {
        q53.b bVar = this.f22325e;
        if (bVar != null) {
            bVar.n(new CancellationException("onBack cancelled"), true);
        }
        c2 c2Var = this.f22326f;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f22325e = null;
        this.f22326f = null;
        this.f22327g = false;
    }

    @Override // d.a
    public final void c() {
        if (this.f22325e != null && !this.f22327g) {
            b();
        }
        if (this.f22325e == null) {
            this.f22327g = false;
            this.f22325e = q53.l.a(-2, 4, q53.a.SUSPEND);
            this.f22326f = ge1.b.T(this.f22323c, null, null, new m(this, null), 3);
        }
        q53.b bVar = this.f22325e;
        if (bVar != null) {
            bVar.q(null);
        }
        this.f22327g = false;
    }

    @Override // d.a
    public final void d(b.c cVar) {
        q53.b bVar = this.f22325e;
        if (bVar != null) {
            q53.m.a(bVar.i(cVar));
        }
    }

    @Override // d.a
    public final void e() {
        b();
        if (super.a()) {
            this.f22327g = true;
            this.f22325e = q53.l.a(-2, 4, q53.a.SUSPEND);
            this.f22326f = ge1.b.T(this.f22323c, null, null, new m(this, null), 3);
        }
    }

    public final void f(boolean z14) {
        c2 c2Var;
        if (!z14 && super.a() && (c2Var = this.f22326f) != null && !c2Var.isActive()) {
            b();
        }
        this.f56981a.f(z14);
        this.f56982b.i(z14);
    }
}
