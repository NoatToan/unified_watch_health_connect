package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls1/v1;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f155819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f155820b;

    public v1(t1 t1Var, t1 t1Var2) {
        this.f155819a = t1Var;
        this.f155820b = t1Var2;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f155819a.f155753j.remove(this.f155820b);
    }
}
