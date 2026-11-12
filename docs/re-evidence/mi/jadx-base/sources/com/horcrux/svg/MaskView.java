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
class MaskView extends GroupView {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    SVGLength mH;
    private Brush.BrushUnits mMaskContentUnits;
    private Brush.BrushUnits mMaskUnits;
    private Matrix mMatrix;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    public MaskView(ReactContext reactContext) {
        super(reactContext);
        this.mMatrix = null;
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    @iej(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "maskContentUnits")
    public void setMaskContentUnits(int i) {
        if (i == 0) {
            this.mMaskContentUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.mMaskContentUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @iej(name = "maskTransform")
    public void setMaskTransform(ReadableArray readableArray) {
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

    @iej(name = "maskUnits")
    public void setMaskUnits(int i) {
        if (i == 0) {
            this.mMaskUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.mMaskUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
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
