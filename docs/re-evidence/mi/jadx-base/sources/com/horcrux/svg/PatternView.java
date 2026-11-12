package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import defpackage.cm8;
import defpackage.iej;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class PatternView extends GroupView {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    String mAlign;
    private SVGLength mH;
    private Matrix mMatrix;
    int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private Brush.BrushUnits mPatternContentUnits;
    private Brush.BrushUnits mPatternUnits;
    private float mVbHeight;
    private float mVbWidth;
    private SVGLength mW;
    private SVGLength mX;
    private SVGLength mY;

    public PatternView(ReactContext reactContext) {
        super(reactContext);
        this.mMatrix = null;
    }

    public RectF getViewBox() {
        float f = this.mMinX;
        float f2 = this.mScale;
        float f3 = this.mMinY;
        return new RectF(f * f2, f3 * f2, (f + this.mVbWidth) * f2, (f3 + this.mVbHeight) * f2);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            Brush brush = new Brush(Brush.BrushType.PATTERN, new SVGLength[]{this.mX, this.mY, this.mW, this.mH}, this.mPatternUnits);
            brush.setContentUnits(this.mPatternContentUnits);
            brush.setPattern(this);
            Matrix matrix = this.mMatrix;
            if (matrix != null) {
                brush.setGradientTransform(matrix);
            }
            SvgView svgView = getSvgView();
            Brush.BrushUnits brushUnits = this.mPatternUnits;
            Brush.BrushUnits brushUnits2 = Brush.BrushUnits.USER_SPACE_ON_USE;
            if (brushUnits == brushUnits2 || this.mPatternContentUnits == brushUnits2) {
                brush.setUserSpaceBoundingBox(svgView.getCanvasBounds());
            }
            svgView.defineBrush(brush, this.mName);
        }
    }

    @iej(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
    }

    @iej(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
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

    @iej(name = "patternContentUnits")
    public void setPatternContentUnits(int i) {
        if (i == 0) {
            this.mPatternContentUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.mPatternContentUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @iej(name = "patternTransform")
    public void setPatternTransform(ReadableArray readableArray) {
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

    @iej(name = "patternUnits")
    public void setPatternUnits(int i) {
        if (i == 0) {
            this.mPatternUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.mPatternUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
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
