package mq;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import kotlin.w3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    public static final void a(View view2, e23.a<Unit> aVar) {
        ComposeView composeView;
        if (view2 == null || (composeView = (ComposeView) view2.findViewById(R.id.composable_container)) == null) {
            return;
        }
        composeView.setVisibility(0);
        composeView.setViewCompositionStrategy(w3.b.f91619b);
        composeView.setContent(new z3.e(2044513285, true, new ll1.g(aVar, 15)));
    }
}
