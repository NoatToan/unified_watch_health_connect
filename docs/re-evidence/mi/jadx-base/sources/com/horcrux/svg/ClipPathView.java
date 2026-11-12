package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import defpackage.cm8;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class ClipPathView extends GroupView {
    public ClipPathView(ReactContext reactContext) {
        super(reactContext);
        this.mClipRule = 1;
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        cm8.C("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableView
    public void mergeProperties(RenderableView renderableView) {
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView
    public void resetProperties() {
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
