package ca0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lca0/y1;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y1 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.y.c f26540b;

    public y1(lc.m0 m0Var, lc.y.c cVar) {
        this.f26539a = m0Var;
        this.f26540b = cVar;
    }

    @Override // p3.h0
    public final void dispose() {
        lc.m0 m0Var = this.f26539a;
        m0Var.getClass();
        lc.y.c cVar = this.f26540b;
        cVar.getClass();
        qc.h hVar = m0Var.f111904b;
        hVar.getClass();
        hVar.f144330q.remove(cVar);
    }
}
