package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import defpackage.cm8;
import defpackage.iej;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class RadialGradientView extends DefinitionView {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private SVGLength mCx;
    private SVGLength mCy;
    private SVGLength mFx;
    private SVGLength mFy;
    private ReadableArray mGradient;
    private Brush.BrushUnits mGradientUnits;
    private Matrix mMatrix;
    private SVGLength mRx;
    private SVGLength mRy;

    public RadialGradientView(ReactContext reactContext) {
        super(reactContext);
        this.mMatrix = null;
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            Brush brush = new Brush(Brush.BrushType.RADIAL_GRADIENT, new SVGLength[]{this.mFx, this.mFy, this.mRx, this.mRy, this.mCx, this.mCy}, this.mGradientUnits);
            brush.setGradientColors(this.mGradient);
            Matrix matrix = this.mMatrix;
            if (matrix != null) {
                brush.setGradientTransform(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.mGradientUnits == Brush.BrushUnits.USER_SPACE_ON_USE) {
                brush.setUserSpaceBoundingBox(svgView.getCanvasBounds());
            }
            svgView.defineBrush(brush, this.mName);
        }
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

    @iej(name = "fx")
    public void setFx(Dynamic dynamic) {
        this.mFx = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "fy")
    public void setFy(Dynamic dynamic) {
        this.mFy = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.mGradient = readableArray;
        invalidate();
    }

    @iej(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int matrixData = PropHelper.toMatrixData(readableArray, fArr, this.mScale);
            if (matrixData == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
            } else if (matrixData != -1) {
                cm8.C("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix = null;
        }
        invalidate();
    }

    @iej(name = "gradientUnits")
    public void setGradientUnits(int i) {
        if (i == 0) {
            this.mGradientUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.mGradientUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
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
}
