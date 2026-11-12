package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t1f extends ViewDataBinding {
    public final AppBarLayout A;
    public final CollapsingToolbarLayout B;
    public final CoordinatorLayout C;
    public final FrameLayout D;
    public final NestedScrollView E;
    public final SwipeRefreshLayout F;

    public t1f(Object obj, View view, int i, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i);
        this.A = appBarLayout;
        this.B = collapsingToolbarLayout;
        this.C = coordinatorLayout;
        this.D = frameLayout;
        this.E = nestedScrollView;
        this.F = swipeRefreshLayout;
    }
}
