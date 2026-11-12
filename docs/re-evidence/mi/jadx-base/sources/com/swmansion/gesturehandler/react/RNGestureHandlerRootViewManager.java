package com.swmansion.gesturehandler.react;

import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.ndj;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = RNGestureHandlerRootViewManager.REACT_CLASS)
public class RNGestureHandlerRootViewManager extends ViewGroupManager<RNGestureHandlerRootView> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.e("onGestureHandlerEvent", e4f.d("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", e4f.d("registrationName", "onGestureHandlerStateChange"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RNGestureHandlerRootView createViewInstance(g9p g9pVar) {
        return new RNGestureHandlerRootView(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(RNGestureHandlerRootView rNGestureHandlerRootView) {
        rNGestureHandlerRootView.b();
    }
}
