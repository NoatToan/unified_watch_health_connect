package yo0;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import p005kotlin.Metadata;
import r22.u0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyo0/f;", "Lr22/v0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f198359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f198360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f198361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub1.k f198362d;

    public f(String str, c cVar, ub1.k kVar) {
        this.f198361c = cVar;
        this.f198362d = kVar;
        this.f198360b = fb1.c.n("PromoAlertComposableDialog_", str);
    }

    @Override // r22.v0
    public final void L3(u0 u0Var) {
        this.f198359a = u0Var;
    }

    @Override // r22.v0
    /* JADX INFO: renamed from: b5, reason: from getter */
    public final String getF149861e() {
        return this.f198360b;
    }

    @Override // r22.v0
    public final void g(v vVar) {
        c cVar = this.f198361c;
        androidx.fragment.app.m mVar = cVar.f198339b;
        ComposeView composeView = new ComposeView(cVar.f198339b, null, 0, 6, null);
        composeView.setContent(new z3.e(1752734761, true, new e(this, this.f198362d, 0)));
        mVar.addContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
    }
}
