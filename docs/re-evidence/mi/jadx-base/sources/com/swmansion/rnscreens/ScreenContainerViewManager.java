package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.g9p;
import defpackage.ndj;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = ScreenContainerViewManager.REACT_CLASS)
public class ScreenContainerViewManager extends ViewGroupManager<ScreenContainer> {
    protected static final String REACT_CLASS = "RNSScreenContainer";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ScreenContainer screenContainer, View view, int i) {
        if (!(view instanceof Screen)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
        }
        screenContainer.d((Screen) view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ScreenContainer createViewInstance(g9p g9pVar) {
        return new ScreenContainer(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ScreenContainer screenContainer, int i) {
        return screenContainer.h(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ScreenContainer screenContainer) {
        return screenContainer.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ScreenContainer screenContainer, int i) {
        screenContainer.n(i);
    }
}
