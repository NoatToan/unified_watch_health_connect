package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lc2/h1;", "Lh4/r$c;", "Lh5/e2;", "<init>", "()V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class h1 extends h4.r.c implements h5.e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k3 f22674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k3 f22675b;

    public h1() {
        n0 n0Var = n3.f22788a;
        this.f22674a = n0Var;
        this.f22675b = n0Var;
    }

    public abstract k3 U1(k3 k3Var);

    public void V1() {
        this.f22675b = U1(this.f22674a);
        gl1.d.j0(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g1(this, 0));
    }

    @Override // h5.e2
    public final Object X() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // h4.r.c
    public void onAttach() {
        gl1.d.h0(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g1(this, 1));
        V1();
        super.onAttach();
    }

    @Override // h4.r.c
    public void onDetach() {
        this.f22675b = this.f22674a;
        gl1.d.j0(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g1(this, 0));
        super.onDetach();
    }

    @Override // h4.r.c
    public final void onReset() {
        super.onReset();
        this.f22674a = n3.f22788a;
    }
}
