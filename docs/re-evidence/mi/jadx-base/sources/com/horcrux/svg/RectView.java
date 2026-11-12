package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import defpackage.iej;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class RectView extends RenderableView {
    private SVGLength mH;
    private SVGLength mRx;
    private SVGLength mRy;
    private SVGLength mW;
    private SVGLength mX;
    private SVGLength mY;

    public RectView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.mX);
        double dRelativeOnHeight = relativeOnHeight(this.mY);
        double dRelativeOnWidth2 = relativeOnWidth(this.mW);
        double dRelativeOnHeight2 = relativeOnHeight(this.mH);
        double dRelativeOnWidth3 = relativeOnWidth(this.mRx);
        double dRelativeOnHeight3 = relativeOnHeight(this.mRy);
        if (dRelativeOnWidth3 == 0.0d && dRelativeOnHeight3 == 0.0d) {
            path.addRect((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2), Path.Direction.CW);
        } else {
            if (dRelativeOnWidth3 == 0.0d) {
                dRelativeOnWidth3 = dRelativeOnHeight3;
            } else if (dRelativeOnHeight3 == 0.0d) {
                dRelativeOnHeight3 = dRelativeOnWidth3;
            }
            double d = dRelativeOnWidth2 / 2.0d;
            if (dRelativeOnWidth3 > d) {
                dRelativeOnWidth3 = d;
            }
            double d2 = dRelativeOnHeight2 / 2.0d;
            if (dRelativeOnHeight3 > d2) {
                dRelativeOnHeight3 = d2;
            }
            path.addRoundRect(new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2)), (float) dRelativeOnWidth3, (float) dRelativeOnHeight3, Path.Direction.CW);
        }
        return path;
    }

    @iej(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.mRx = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.mRy = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "x")
    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "y")
    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.from(dynamic);
        invalidate();
    }
}
