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
class CircleView extends RenderableView {
    private SVGLength mCx;
    private SVGLength mCy;
    private SVGLength mR;

    public CircleView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addCircle((float) relativeOnWidth(this.mCx), (float) relativeOnHeight(this.mCy), (float) relativeOnOther(this.mR), Path.Direction.CW);
        return path;
    }

    @iej(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.mCx = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.mCy = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "r")
    public void setR(Dynamic dynamic) {
        this.mR = SVGLength.from(dynamic);
        invalidate();
    }
}
