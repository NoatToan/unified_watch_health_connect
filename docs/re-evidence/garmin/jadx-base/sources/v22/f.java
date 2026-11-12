package v22;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv22/f;", "Landroidx/core/view/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends androidx.core.view.a {
    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
        view2.getClass();
        fVar.getClass();
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        fVar.b(new l7.f.a(32, z.b(R.string.lbl_move_up_or_down, view2)));
    }
}
