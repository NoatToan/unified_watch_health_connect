package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li3/h9;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h9 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h8 f88313a;

    public h9(h8 h8Var) {
        this.f88313a = h8Var;
    }

    @Override // p3.h0
    public final void dispose() {
        h8 h8Var = this.f88313a;
        h8Var.dismiss();
        h8Var.f88300e.disposeComposition();
    }
}
