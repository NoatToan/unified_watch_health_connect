package s70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls70/h0;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.b0 f157704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f157705b;

    public h0(androidx.lifecycle.b0 b0Var, androidx.lifecycle.k0 k0Var) {
        this.f157704a = b0Var;
        this.f157705b = k0Var;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f157704a.d(this.f157705b);
    }
}
