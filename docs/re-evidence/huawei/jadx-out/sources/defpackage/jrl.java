package defpackage;

import android.os.Handler;
import com.google.android.gms.maps.model.Marker;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jrl extends GrowAnimationBuilder {
    private Marker d = null;

    public void e(Marker marker) {
        this.d = marker;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
    public void displayAnimation() {
        if (this.d == null) {
            LogUtil.a("Track_GoogleMarkerAnimation", "displayAnimation mGrowMarker is null");
        } else {
            c(this.mDisplayFrictionAnimationDuration);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
    public void disappearAnimation() {
        if (this.d == null) {
            LogUtil.a("Track_GoogleMarkerAnimation", "disappearAnimation mGrowMarker is null");
        } else {
            c(this.mDisplayFrictionAnimationDuration);
        }
    }

    private void c(long j) {
        new Handler().postDelayed(new Runnable() { // from class: jrl.2
            @Override // java.lang.Runnable
            public void run() {
                if (jrl.this.mAnimationCallback != null) {
                    jrl.this.mAnimationCallback.onFinish();
                }
            }
        }, j);
    }
}
