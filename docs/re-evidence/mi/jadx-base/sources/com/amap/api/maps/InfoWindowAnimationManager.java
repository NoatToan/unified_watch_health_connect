package com.amap.api.maps;

import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.interfaces.IInfoWindowManager;

/* JADX INFO: loaded from: classes4.dex */
public class InfoWindowAnimationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IInfoWindowManager f6420a;

    public InfoWindowAnimationManager(IInfoWindowManager iInfoWindowManager) {
        this.f6420a = iInfoWindowManager;
    }

    public void setInfoWindowAnimation(Animation animation, Animation.AnimationListener animationListener) {
        this.f6420a.setInfoWindowAnimation(animation, animationListener);
    }

    public void setInfoWindowAppearAnimation(Animation animation) {
        this.f6420a.setInfoWindowAppearAnimation(animation);
    }

    public void setInfoWindowBackColor(int i) {
        this.f6420a.setInfoWindowBackColor(i);
    }

    public void setInfoWindowBackEnable(boolean z) {
        this.f6420a.setInfoWindowBackEnable(z);
    }

    public void setInfoWindowBackScale(float f, float f2) {
        this.f6420a.setInfoWindowBackScale(f, f2);
    }

    public void setInfoWindowDisappearAnimation(Animation animation) {
        this.f6420a.setInfoWindowDisappearAnimation(animation);
    }

    public void setInfoWindowMovingAnimation(Animation animation) {
        this.f6420a.setInfoWindowMovingAnimation(animation);
    }

    public void startAnimation() {
        this.f6420a.startAnimation();
    }
}
