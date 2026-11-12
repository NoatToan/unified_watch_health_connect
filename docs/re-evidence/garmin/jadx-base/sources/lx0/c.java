package lx0;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llx0/c;", "Landroidx/core/view/a;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.C2191b f115150a;

    public c(b.C2191b c2191b) {
        this.f115150a = c2191b;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        fVar.t(this.f115150a.f115148c.getVisibility() == 0);
    }
}
