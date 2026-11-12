package hx0;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhx0/c0;", "Landroidx/core/view/a;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f86029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f86030b;

    public c0(d0 d0Var, b0 b0Var) {
        this.f86029a = d0Var;
        this.f86030b = b0Var;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        boolean z14 = this.f86029a.f86035a;
        b0 b0Var = this.f86030b;
        if (z14) {
            fVar.l(true);
            fVar.m(b0Var.f86024b);
        } else {
            fVar.l(false);
            fVar.t(b0Var.f86024b);
        }
    }
}
