package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/f3;", "Lp3/j3;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f3 extends j3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f135079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f135080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p1.u0<Object> f135081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p1.u0<Object> f135082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q53.w<? super Unit> f135083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1 f135084g = new q1(this, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final en0.n f135085h;

    public f3() {
        f4.f.a aVar = f4.f.f68735e;
        ov1.q qVar = new ov1.q(this, 7);
        aVar.getClass();
        this.f135085h = f4.f.a.d(qVar);
    }

    @Override // p3.j3
    public final void a(q53.w<? super Unit> wVar) {
        this.f135080c = null;
        this.f135082e = null;
    }

    @Override // p3.j3
    public final void b() {
        synchronized (this.f135131a) {
            try {
                this.f135079b = this.f135080c;
                if (this.f135082e == null) {
                    this.f135081d = null;
                } else {
                    if (this.f135081d == null) {
                        this.f135081d = p1.i1.a();
                    }
                    p1.u0<Object> u0Var = this.f135081d;
                    this.f135081d = this.f135082e;
                    this.f135082e = u0Var;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p3.j3
    public final void c() {
        this.f135085h.c();
        this.f135080c = null;
        this.f135082e = null;
        synchronized (this.f135131a) {
            this.f135083f = null;
            this.f135079b = null;
            this.f135081d = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p3.j3
    public final e23.l<Object, Unit> d(q53.w<? super Unit> wVar) {
        q53.w<? super Unit> wVar2 = this.f135083f;
        if (wVar2 != null && !wVar2.equals(wVar)) {
            j2.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f135083f = wVar;
        return this.f135084g;
    }

    @Override // p3.j3
    public final void e(q53.i iVar) {
        this.f135083f = null;
        this.f135080c = null;
        this.f135082e = null;
        b();
    }
}
