package androidx.core.view;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6433c;

    public /* synthetic */ e1(int i14, Object obj, Object obj2) {
        this.f6431a = i14;
        this.f6432b = obj;
        this.f6433c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6431a) {
            case 0:
                ((View) i.t.this.f86673e.getParent()).invalidate();
                break;
            case 1:
                ((AppBarLayout) this.f6432b).lambda$initializeLiftOnScrollWithElevation$1((MaterialShapeDrawable) this.f6433c, valueAnimator);
                break;
            case 2:
                ((ExpandCollapseAnimationHelper) this.f6432b).lambda$getExpandCollapseAnimator$0((Rect) this.f6433c, valueAnimator);
                break;
            case 3:
                CameraAnimationsPluginImpl.registerInternalUpdateListener$lambda$26((CameraAnimationsPluginImpl) this.f6432b, (CameraAnimator) this.f6433c, valueAnimator);
                break;
            default:
                e23.l lVar = (e23.l) this.f6432b;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f6433c;
                valueAnimator.getClass();
                lVar.invoke(Integer.valueOf(lottieAnimationView.getFrame()));
                break;
        }
    }
}
