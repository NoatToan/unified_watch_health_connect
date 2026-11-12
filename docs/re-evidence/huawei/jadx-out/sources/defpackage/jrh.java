package defpackage;

import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.animation.Animation;
import com.huawei.hms.maps.model.animation.ScaleAnimation;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jrh extends GrowAnimationBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Marker f38931b = null;
    private Animation e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38930a = false;

    public void b(Marker marker) {
        this.f38931b = marker;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
    public void displayAnimation() {
        if (this.f38931b == null) {
            LogUtil.a("Track_HmsMarkerAnimation", "displayAnimation mGrowMarker is null");
            return;
        }
        this.f38930a = false;
        this.e = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
        if (this.mMarkerType == GrowAnimationBuilder.MarkerType.KM_MARKER) {
            this.e.setInterpolator(new OvershootInterpolator(2.6f));
        } else {
            this.e.setInterpolator(new OvershootInterpolator(3.2f));
        }
        d();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
    public void disappearAnimation() {
        if (this.f38931b == null) {
            LogUtil.a("Track_HmsMarkerAnimation", "disappearAnimation mGrowMarker is null");
            return;
        }
        this.f38930a = true;
        this.e = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f);
        if (this.mMarkerType == GrowAnimationBuilder.MarkerType.KM_MARKER) {
            this.e.setInterpolator(new AnticipateInterpolator(2.6f));
        } else {
            this.e.setInterpolator(new AnticipateInterpolator(3.2f));
        }
        d();
    }

    private void d() {
        this.e.setFillMode(0);
        this.e.setDuration(this.mDisplayFrictionAnimationDuration);
        this.e.setAnimationListener(new Animation.AnimationListener() { // from class: jrh.1
            @Override // com.huawei.hms.maps.model.animation.Animation.AnimationListener
            public void onAnimationStart() {
            }

            @Override // com.huawei.hms.maps.model.animation.Animation.AnimationListener
            public void onAnimationEnd() {
                if (jrh.this.f38930a && jrh.this.f38931b != null) {
                    jrh.this.f38931b.setVisible(false);
                }
                if (jrh.this.mAnimationCallback != null) {
                    jrh.this.mAnimationCallback.onFinish();
                }
            }
        });
        this.f38931b.setAnimation(this.e);
        this.f38931b.startAnimation();
    }
}
