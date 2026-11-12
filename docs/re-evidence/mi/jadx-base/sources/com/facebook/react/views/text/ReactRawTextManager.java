package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import defpackage.g9p;
import defpackage.kej;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactRawTextManager.REACT_CLASS)
public class ReactRawTextManager extends ViewManager<View, kej> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<kej> getShadowNodeClass() {
        return kej.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public kej createShadowNodeInstance() {
        return new kej();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactTextView createViewInstance(g9p g9pVar) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
}
