package z2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz2/l0;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f201673a;

    public l0(o1 o1Var) {
        this.f201673a = o1Var;
    }

    @Override // p3.h0
    public final void dispose() {
        o1 o1Var = this.f201673a;
        o1Var.k();
        o1Var.f201719j.setValue(Boolean.FALSE);
    }
}
