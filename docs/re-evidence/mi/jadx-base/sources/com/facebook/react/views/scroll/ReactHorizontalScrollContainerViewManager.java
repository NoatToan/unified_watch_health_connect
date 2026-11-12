package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.g9p;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
public class ReactHorizontalScrollContainerViewManager extends ViewGroupManager<ReactHorizontalScrollContainerView> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollContainerView createViewInstance(g9p g9pVar) {
        return new ReactHorizontalScrollContainerView(g9pVar);
    }
}
