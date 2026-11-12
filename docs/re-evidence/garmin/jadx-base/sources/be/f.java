package be;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public class f extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17709a;

    public f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f17709a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f14, Transformation transformation) {
        this.f17709a.setAnimationProgress(1.0f - f14);
    }
}
