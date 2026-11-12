package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import defpackage.iej;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class TextPathView extends TextView {
    private String mHref;
    private TextProperties.TextPathMethod mMethod;
    private TextProperties.TextPathMidLine mMidLine;
    private TextProperties.TextPathSide mSide;
    private TextProperties.TextPathSpacing mSpacing;
    private SVGLength mStartOffset;

    public TextPathView(ReactContext reactContext) {
        super(reactContext);
        this.mMethod = TextProperties.TextPathMethod.align;
        this.mSpacing = TextProperties.TextPathSpacing.exact;
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        drawGroup(canvas, paint, f);
    }

    public TextProperties.TextPathMethod getMethod() {
        return this.mMethod;
    }

    public TextProperties.TextPathMidLine getMidLine() {
        return this.mMidLine;
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return getGroupPath(canvas, paint);
    }

    public TextProperties.TextPathSide getSide() {
        return this.mSide;
    }

    public TextProperties.TextPathSpacing getSpacing() {
        return this.mSpacing;
    }

    public SVGLength getStartOffset() {
        return this.mStartOffset;
    }

    public Path getTextPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.mHref);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }

    @Override // com.horcrux.svg.GroupView
    public void popGlyphContext() {
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView
    public void pushGlyphContext() {
    }

    @iej(name = "href")
    public void setHref(String str) {
        this.mHref = str;
        invalidate();
    }

    @Override // com.horcrux.svg.TextView
    @iej(name = "method")
    public void setMethod(String str) {
        this.mMethod = TextProperties.TextPathMethod.valueOf(str);
        invalidate();
    }

    @iej(name = "midLine")
    public void setSharp(String str) {
        this.mMidLine = TextProperties.TextPathMidLine.valueOf(str);
        invalidate();
    }

    @iej(name = "side")
    public void setSide(String str) {
        this.mSide = TextProperties.TextPathSide.valueOf(str);
        invalidate();
    }

    @iej(name = "spacing")
    public void setSpacing(String str) {
        this.mSpacing = TextProperties.TextPathSpacing.valueOf(str);
        invalidate();
    }

    @iej(name = "startOffset")
    public void setStartOffset(Dynamic dynamic) {
        this.mStartOffset = SVGLength.from(dynamic);
        invalidate();
    }
}
