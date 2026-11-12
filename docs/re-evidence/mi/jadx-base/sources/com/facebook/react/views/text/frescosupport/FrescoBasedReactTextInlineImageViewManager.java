package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.uimanager.ViewManager;
import defpackage.apa;
import defpackage.bpa;
import defpackage.g9p;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, bpa> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(g9p g9pVar) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<bpa> getShadowNodeClass() {
        return bpa.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bpa createShadowNodeInstance() {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilderF = this.mDraweeControllerBuilder;
        if (abstractDraweeControllerBuilderF == null) {
            abstractDraweeControllerBuilderF = apa.f();
        }
        return new bpa(abstractDraweeControllerBuilderF, this.mCallerContext);
    }
}
