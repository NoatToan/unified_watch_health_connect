package ct1;

import p005kotlin.Metadata;
import p3.h0;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lct1/j;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l f55513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f55514b;

    public j(e23.l lVar, x3 x3Var) {
        this.f55513a = lVar;
        this.f55514b = x3Var;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f55513a.invoke(Integer.valueOf(((Number) this.f55514b.getValue()).intValue()));
    }
}
