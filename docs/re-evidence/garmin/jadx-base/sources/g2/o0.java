package g2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg2/o0;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f75194a;

    public o0(z0 z0Var) {
        this.f75194a = z0Var;
    }

    @Override // p3.h0
    public final void dispose() {
        z0 z0Var = this.f75194a;
        t1 t1Var = z0Var.f75315d;
        if (t1Var != null) {
            t1Var.f75220d = false;
        }
        z0Var.f75315d = null;
    }
}
