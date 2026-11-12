package com.facebook.react.views.art;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import defpackage.g9;
import defpackage.g9p;
import defpackage.l0s;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ARTSurfaceViewManager.REACT_CLASS)
public class ARTSurfaceViewManager extends BaseViewManager<ARTSurfaceView, g9> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new a();
    public static final String REACT_CLASS = "ARTSurfaceView";

    public class a implements YogaMeasureFunction {
        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(l0s l0sVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<g9> getShadowNodeClass() {
        return g9.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(ARTSurfaceView aRTSurfaceView, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g9 createShadowNodeInstance() {
        g9 g9Var = new g9();
        g9Var.setMeasureFunction(MEASURE_FUNCTION);
        return g9Var;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ARTSurfaceView createViewInstance(g9p g9pVar) {
        return new ARTSurfaceView(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ARTSurfaceView aRTSurfaceView, Object obj) {
        ((g9) obj).c(aRTSurfaceView);
    }
}
