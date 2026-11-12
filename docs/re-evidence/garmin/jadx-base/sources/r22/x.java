package r22;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr22/x;", "Landroidx/fragment/app/i;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class x extends androidx.fragment.app.i {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = getLayoutInflater().inflate(R.layout.composable_container, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ((ComposeView) viewFindViewById).setContent(new z3.e(-699522315, true, new r12.a(this, 3)));
        return viewInflate;
    }

    public abstract void u6(p3.m mVar, int i14);
}
