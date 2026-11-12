package be;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public class e extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17708a;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f17708a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f14, Transformation transformation) {
        this.f17708a.setAnimationProgress(f14);
    }
}
