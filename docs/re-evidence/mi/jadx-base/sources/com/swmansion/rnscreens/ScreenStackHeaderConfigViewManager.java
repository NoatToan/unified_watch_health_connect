package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.g9p;
import defpackage.iej;
import defpackage.ndj;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
public class ScreenStackHeaderConfigViewManager extends ViewGroupManager<ScreenStackHeaderConfig> {
    protected static final String REACT_CLASS = "RNSScreenStackHeaderConfig";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @iej(customType = "Color", name = "color")
    public void setColor(ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        screenStackHeaderConfig.setTintColor(i);
    }

    @iej(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        screenStackHeaderConfig.setGestureEnabled(z);
    }

    @iej(name = "hidden")
    public void setHidden(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        screenStackHeaderConfig.setHidden(z);
    }

    @iej(name = "hideBackButton")
    public void setHideBackButton(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        screenStackHeaderConfig.setHideBackButton(z);
    }

    @iej(name = "hideShadow")
    public void setHideShadow(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z) {
        screenStackHeaderConfig.setHideShadow(z);
    }

    @iej(name = "title")
    public void setTitle(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        screenStackHeaderConfig.setTitle(str);
    }

    @iej(customType = "Color", name = "titleColor")
    public void setTitleColor(ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        screenStackHeaderConfig.setTitleColor(i);
    }

    @iej(name = "titleFontFamily")
    public void setTitleFontFamily(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        screenStackHeaderConfig.setTitleFontFamily(str);
    }

    @iej(name = "titleFontSize")
    public void setTitleFontSize(ScreenStackHeaderConfig screenStackHeaderConfig, float f) {
        screenStackHeaderConfig.setTitleFontSize(f);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ScreenStackHeaderConfig screenStackHeaderConfig, View view, int i) {
        if (!(view instanceof ScreenStackHeaderSubview)) {
            throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
        }
        screenStackHeaderConfig.c((ScreenStackHeaderSubview) view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ScreenStackHeaderConfig createViewInstance(g9p g9pVar) {
        return new ScreenStackHeaderConfig(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        return screenStackHeaderConfig.d(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ScreenStackHeaderConfig screenStackHeaderConfig) {
        return screenStackHeaderConfig.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ScreenStackHeaderConfig screenStackHeaderConfig) {
        super.onAfterUpdateTransaction(screenStackHeaderConfig);
        screenStackHeaderConfig.g();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        screenStackHeaderConfig.h(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @iej(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(ScreenStackHeaderConfig screenStackHeaderConfig, int i) {
        screenStackHeaderConfig.setBackgroundColor(i);
    }
}
