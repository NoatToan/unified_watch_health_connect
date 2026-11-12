package com.amap.api.maps;

import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.interfaces.IInfoWindowManager;

/* JADX INFO: loaded from: classes21.dex */
public class InfoWindowAnimationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IInfoWindowManager f3394a;

    public InfoWindowAnimationManager(IInfoWindowManager iInfoWindowManager) {
        this.f3394a = iInfoWindowManager;
    }

    public void setInfoWindowAnimation(Animation animation, Animation.AnimationListener animationListener) {
        this.f3394a.setInfoWindowAnimation(animation, animationListener);
    }

    public void setInfoWindowAppearAnimation(Animation animation) {
        this.f3394a.setInfoWindowAppearAnimation(animation);
    }

    public void setInfoWindowBackColor(int i) {
        this.f3394a.setInfoWindowBackColor(i);
    }

    public void setInfoWindowBackEnable(boolean z) {
        this.f3394a.setInfoWindowBackEnable(z);
    }

    public void setInfoWindowBackScale(float f, float f2) {
        this.f3394a.setInfoWindowBackScale(f, f2);
    }

    public void setInfoWindowDisappearAnimation(Animation animation) {
        this.f3394a.setInfoWindowDisappearAnimation(animation);
    }

    public void setInfoWindowMovingAnimation(Animation animation) {
        this.f3394a.setInfoWindowMovingAnimation(animation);
    }

    public void startAnimation() {
        this.f3394a.startAnimation();
    }
}
