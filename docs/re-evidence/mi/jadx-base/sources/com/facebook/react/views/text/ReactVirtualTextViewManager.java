package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.g9p;
import defpackage.ndj;
import defpackage.yfj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactVirtualTextViewManager.REACT_CLASS)
public class ReactVirtualTextViewManager extends BaseViewManager<View, yfj> {
    public static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(g9p g9pVar) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<yfj> getShadowNodeClass() {
        return yfj.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public yfj createShadowNodeInstance() {
        return new yfj();
    }
}
