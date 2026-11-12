package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lc22/r1;", "Landroidx/lifecycle/z0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r1 implements androidx.lifecycle.z0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.z0<Object> f23233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.s0<Object> f23234b;

    public r1(androidx.lifecycle.z0<Object> z0Var, androidx.lifecycle.s0<Object> s0Var) {
        this.f23233a = z0Var;
        this.f23234b = s0Var;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        this.f23233a.onChanged(obj);
        this.f23234b.k(this);
    }
}
