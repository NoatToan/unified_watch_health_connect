package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls1/x1;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x1 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f155848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f155849b;

    public x1(t1 t1Var, t1.d dVar) {
        this.f155848a = t1Var;
        this.f155849b = dVar;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f155848a.f155752i.remove(this.f155849b);
    }
}
