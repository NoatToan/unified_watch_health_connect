package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import defpackage.iej;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class SymbolView extends GroupView {
    private String mAlign;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private float mVbHeight;
    private float mVbWidth;

    public SymbolView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    public void drawSymbol(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.mAlign != null) {
            float f4 = this.mMinX;
            float f5 = this.mScale;
            float f6 = this.mMinY;
            canvas.concat(ViewBox.getTransform(new RectF(f4 * f5, f6 * f5, (f4 + this.mVbWidth) * f5, (f6 + this.mVbHeight) * f5), new RectF(0.0f, 0.0f, f2, f3), this.mAlign, this.mMeetOrSlice));
            super.draw(canvas, paint, f);
        }
    }

    @iej(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
    }

    @iej(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        invalidate();
    }

    @iej(name = "minX")
    public void setMinX(float f) {
        this.mMinX = f;
        invalidate();
    }

    @iej(name = "minY")
    public void setMinY(float f) {
        this.mMinY = f;
        invalidate();
    }

    @iej(name = "vbHeight")
    public void setVbHeight(float f) {
        this.mVbHeight = f;
        invalidate();
    }

    @iej(name = "vbWidth")
    public void setVbWidth(float f) {
        this.mVbWidth = f;
        invalidate();
    }
}
