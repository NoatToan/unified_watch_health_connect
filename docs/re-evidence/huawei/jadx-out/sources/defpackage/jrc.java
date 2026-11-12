package defpackage;

import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.ScaleAnimation;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jrc extends GrowAnimationBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Marker f38904b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation f38903a = null;

    public void d(Marker marker) {
        this.f38904b = marker;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
    public void displayAnimation() {
        if (this.f38904b == null) {
            return;
        }
        this.f38903a = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
        if (this.mMarkerType == GrowAnimationBuilder.MarkerType.KM_MARKER) {
            this.f38903a.setInterpolator(new OvershootInterpolator(2.6f));
        } else {
            this.f38903a.setInterpolator(new OvershootInterpolator(3.2f));
        }
        LogUtil.a("Suggestion_GaoDeMarkerAnimation", "displayAnimation: new animation");
        c();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
    public void disappearAnimation() {
        if (this.f38904b == null) {
            return;
        }
        this.f38903a = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f);
        if (this.mMarkerType == GrowAnimationBuilder.MarkerType.KM_MARKER) {
            this.f38903a.setInterpolator(new AnticipateInterpolator(2.6f));
        } else {
            this.f38903a.setInterpolator(new AnticipateInterpolator(3.2f));
        }
        LogUtil.a("Suggestion_GaoDeMarkerAnimation", "disappearAnimation: new animation");
        c();
    }

    private void c() {
        this.f38903a.setFillMode(0);
        this.f38903a.setDuration(this.mDisplayFrictionAnimationDuration);
        this.f38903a.setAnimationListener(new Animation.AnimationListener() { // from class: jrc.4
            @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
            public void onAnimationStart() {
                LogUtil.a("Suggestion_GaoDeMarkerAnimation", "onAnimationStart: FrictionAnimation");
            }

            @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
            public void onAnimationEnd() {
                LogUtil.a("Suggestion_GaoDeMarkerAnimation", "onAnimationEnd: FrictionAnimation");
                if (jrc.this.mAnimationCallback != null) {
                    jrc.this.mAnimationCallback.onFinish();
                }
            }
        });
        this.f38904b.setAnimation(this.f38903a);
        this.f38904b.startAnimation();
    }
}
