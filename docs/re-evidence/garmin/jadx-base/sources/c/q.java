package c;

import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc/q;", "I", "O", "Lf/c;", "Lc/a;", "launcher", "Lp3/x3;", "Lg/a;", "currentContract", "<init>", "(Lc/a;Lp3/x3;)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q<I, O> extends f.c<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<I> f22337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3<g.a<I, O>> f22338b;

    /* JADX WARN: Multi-variable type inference failed */
    public q(a<I> aVar, x3<? extends g.a<I, O>> x3Var) {
        this.f22337a = aVar;
        this.f22338b = x3Var;
    }

    @Override // f.c
    public final void a(I i14, z6.b bVar) {
        f.g gVar = this.f22337a.f22300a;
        if (gVar != null) {
            gVar.a(i14, bVar);
        } else {
            vb.h.z("Launcher has not been initialized");
        }
    }
}
