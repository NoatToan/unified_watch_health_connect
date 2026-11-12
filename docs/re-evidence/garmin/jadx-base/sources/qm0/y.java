package qm0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Space;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqm0/y;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f145601a;

    public y(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f145601a = collapsingToolbarLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f145601a;
        collapsingToolbarLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View viewFindViewById = collapsingToolbarLayout.findViewById(R.id.chip_group_layout);
        collapsingToolbarLayout.setMinimumHeight(viewFindViewById.getMeasuredHeight() + ((Space) collapsingToolbarLayout.findViewById(R.id.space)).getMeasuredHeight());
    }
}
