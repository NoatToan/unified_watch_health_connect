package com.facebook.react.uimanager;

import android.view.View;
import defpackage.cbe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, cbe> {
    @Override // com.facebook.react.uimanager.ViewManager
    public Class<cbe> getShadowNodeClass() {
        return cbe.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance() {
        return new cbe();
    }
}
