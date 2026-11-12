package c83;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lc83/o;", "Lc83/f;", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements f<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<a0<Object>> f25811a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(o53.j<? super a0<Object>> jVar) {
        this.f25811a = jVar;
    }

    @Override // c83.f
    public final void a(d<Object> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        int i14 = o13.q.f128596b;
        this.f25811a.resumeWith(new o13.q.b(th3));
    }

    @Override // c83.f
    public final void c(d<Object> dVar, a0<Object> a0Var) {
        dVar.getClass();
        int i14 = o13.q.f128596b;
        this.f25811a.resumeWith(a0Var);
    }
}
