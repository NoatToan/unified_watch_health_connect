package com.facebook.react.views.art;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import defpackage.d9;
import defpackage.g9p;
import defpackage.oej;
import defpackage.pa;
import defpackage.u8;

/* JADX INFO: loaded from: classes4.dex */
public class ARTRenderableViewManager extends ViewManager<View, oej> {
    public static final String CLASS_GROUP = "ARTGroup";
    public static final String CLASS_SHAPE = "ARTShape";
    public static final String CLASS_TEXT = "ARTText";
    private final String mClassName;

    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public oej createShadowNodeInstance() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return new u8();
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return new d9();
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return new pa();
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(g9p g9pVar) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends oej> getShadowNodeClass() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return u8.class;
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return d9.class;
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return pa.class;
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }
}
