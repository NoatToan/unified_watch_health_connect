package cu1;

import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu1/m;", "Landroidx/core/view/a;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GCMCheckableRow f55687a;

    public m(GCMCheckableRow gCMCheckableRow) {
        this.f55687a = gCMCheckableRow;
    }

    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        fVar.l(true);
        fVar.m(this.f55687a.isChecked());
    }
}
