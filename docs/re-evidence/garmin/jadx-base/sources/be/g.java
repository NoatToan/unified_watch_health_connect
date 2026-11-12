package be;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public class g extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17712c;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i14, int i15) {
        this.f17712c = swipeRefreshLayout;
        this.f17710a = i14;
        this.f17711b = i15;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f14, Transformation transformation) {
        d dVar = this.f17712c.B;
        int i14 = this.f17710a;
        dVar.setAlpha((int) (((this.f17711b - i14) * f14) + i14));
    }
}
