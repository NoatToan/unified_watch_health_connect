package com.facebook.react.views.unimplementedview;

import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.g9p;
import defpackage.iej;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactUnimplementedViewManager.REACT_CLASS)
public class ReactUnimplementedViewManager extends ViewGroupManager<ReactUnimplementedView> {
    public static final String REACT_CLASS = "UnimplementedNativeView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(name = "name")
    public void setName(ReactUnimplementedView reactUnimplementedView, String str) {
        reactUnimplementedView.setName(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactUnimplementedView createViewInstance(g9p g9pVar) {
        return new ReactUnimplementedView(g9pVar);
    }
}
