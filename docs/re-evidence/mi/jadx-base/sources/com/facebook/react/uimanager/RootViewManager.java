package com.facebook.react.uimanager;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.g9p;

/* JADX INFO: loaded from: classes4.dex */
public class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final String REACT_CLASS = "RootView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(g9p g9pVar) {
        return new FrameLayout(g9pVar);
    }
}
