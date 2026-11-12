package c;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import gl1.y;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f22321a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(b.g gVar, e23.p pVar) {
        View childAt = ((ViewGroup) gVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(gVar, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(pVar);
        View decorView = gVar.getWindow().getDecorView();
        if (xy2.b.r(decorView) == null) {
            decorView.setTag(com.garmin.android.apps.connectmobile.R.id.view_tree_lifecycle_owner, gVar);
        }
        if (zf.b.s(decorView) == null) {
            decorView.setTag(com.garmin.android.apps.connectmobile.R.id.view_tree_view_model_store_owner, gVar);
        }
        if (y.p(decorView) == null) {
            decorView.setTag(com.garmin.android.apps.connectmobile.R.id.view_tree_saved_state_registry_owner, gVar);
        }
        gVar.setContentView(composeView2, f22321a);
    }
}
