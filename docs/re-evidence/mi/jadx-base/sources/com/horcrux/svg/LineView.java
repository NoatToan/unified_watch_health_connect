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
class LineView extends RenderableView {
    private SVGLength mX1;
    private SVGLength mX2;
    private SVGLength mY1;
    private SVGLength mY2;

    public LineView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.mX1);
        double dRelativeOnHeight = relativeOnHeight(this.mY1);
        double dRelativeOnWidth2 = relativeOnWidth(this.mX2);
        double dRelativeOnHeight2 = relativeOnHeight(this.mY2);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        return path;
    }

    @iej(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.mX1 = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.mX2 = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.mY1 = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.mY2 = SVGLength.from(dynamic);
        invalidate();
    }
}
