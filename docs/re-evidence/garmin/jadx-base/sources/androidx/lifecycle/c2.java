package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/c2;", "Landroidx/lifecycle/k0;", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c2 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.b f7854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f7855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.j<Object> f7856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Object> f7857d;

    public c2(b0.b bVar, b0 b0Var, o53.j<Object> jVar, e23.a<Object> aVar) {
        this.f7854a = bVar;
        this.f7855b = b0Var;
        this.f7856c = jVar;
        this.f7857d = aVar;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        Object bVar;
        b0.a.INSTANCE.getClass();
        b0.a aVarC = b0.a.Companion.c(this.f7854a);
        o53.j<Object> jVar = this.f7856c;
        b0 b0Var = this.f7855b;
        if (aVar != aVarC) {
            if (aVar == b0.a.ON_DESTROY) {
                b0Var.d(this);
                int i14 = o13.q.f128596b;
                jVar.resumeWith(new o13.q.b(new LifecycleDestroyedException()));
                return;
            }
            return;
        }
        b0Var.d(this);
        e23.a<Object> aVar2 = this.f7857d;
        try {
            int i15 = o13.q.f128596b;
            bVar = aVar2.invoke();
        } catch (Throwable th3) {
            int i16 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        jVar.resumeWith(bVar);
    }
}
