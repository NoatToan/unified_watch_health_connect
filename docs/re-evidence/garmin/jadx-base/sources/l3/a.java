package l3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll3/a;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a f109167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.n0 f109168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f109169c;

    public a(e23.a aVar, androidx.lifecycle.n0 n0Var, androidx.lifecycle.k0 k0Var) {
        this.f109167a = aVar;
        this.f109168b = n0Var;
        this.f109169c = k0Var;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f109167a.invoke();
        this.f109168b.getF158017a().d(this.f109169c);
    }
}
