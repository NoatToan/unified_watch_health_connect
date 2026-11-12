package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import defpackage.cm8;

/* JADX INFO: loaded from: classes5.dex */
class Brush {
    private ReadableArray mColors;
    private Matrix mMatrix;
    private PatternView mPattern;
    private final SVGLength[] mPoints;
    private final BrushType mType;
    private boolean mUseContentObjectBoundingBoxUnits;
    private final boolean mUseObjectBoundingBox;
    private Rect mUserSpaceBoundingBox;

    public enum BrushType {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    public enum BrushUnits {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    public Brush(BrushType brushType, SVGLength[] sVGLengthArr, BrushUnits brushUnits) {
        this.mType = brushType;
        this.mPoints = sVGLengthArr;
        this.mUseObjectBoundingBox = brushUnits == BrushUnits.OBJECT_BOUNDING_BOX;
    }

    private RectF getPaintRect(RectF rectF) {
        float f;
        float f2;
        if (!this.mUseObjectBoundingBox) {
            rectF = new RectF(this.mUserSpaceBoundingBox);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.mUseObjectBoundingBox) {
            f = rectF.left;
            f2 = rectF.top;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new RectF(f, f2, fWidth + f, fHeight + f2);
    }

    private double getVal(SVGLength sVGLength, double d, float f, float f2) {
        return PropHelper.fromRelative(sVGLength, d, 0.0d, (this.mUseObjectBoundingBox && sVGLength.unit == SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER) ? d : f, f2);
    }

    private static void parseGradientStops(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            fArr[i2] = (float) readableArray.getDouble(i3);
            int i4 = readableArray.getInt(i3 + 1);
            iArr[i2] = (i4 & 16777215) | (Math.round((i4 >>> 24) * f) << 24);
        }
    }

    public void setContentUnits(BrushUnits brushUnits) {
        this.mUseContentObjectBoundingBoxUnits = brushUnits == BrushUnits.OBJECT_BOUNDING_BOX;
    }

    public void setGradientColors(ReadableArray readableArray) {
        this.mColors = readableArray;
    }

    public void setGradientTransform(Matrix matrix) {
        this.mMatrix = matrix;
    }

    public void setPattern(PatternView patternView) {
        this.mPattern = patternView;
    }

    public void setUserSpaceBoundingBox(Rect rect) {
        this.mUserSpaceBoundingBox = rect;
    }

    public void setupPaint(Paint paint, RectF rectF, float f, float f2) {
        RectF paintRect = getPaintRect(rectF);
        float fWidth = paintRect.width();
        float fHeight = paintRect.height();
        float f3 = paintRect.left;
        float f4 = paintRect.top;
        float textSize = paint.getTextSize();
        if (this.mType == BrushType.PATTERN) {
            double d = fWidth;
            double val = getVal(this.mPoints[0], d, f, textSize);
            double d2 = fHeight;
            double val2 = getVal(this.mPoints[1], d2, f, textSize);
            double val3 = getVal(this.mPoints[2], d, f, textSize);
            double val4 = getVal(this.mPoints[3], d2, f, textSize);
            if (val3 <= 1.0d || val4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) val3, (int) val4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF viewBox = this.mPattern.getViewBox();
            if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                RectF rectF2 = new RectF((float) val, (float) val2, (float) val3, (float) val4);
                PatternView patternView = this.mPattern;
                canvas.concat(ViewBox.getTransform(viewBox, rectF2, patternView.mAlign, patternView.mMeetOrSlice));
            }
            if (this.mUseContentObjectBoundingBoxUnits) {
                canvas.scale(fWidth / f, fHeight / f);
            }
            this.mPattern.draw(canvas, new Paint(), f2);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.mMatrix;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.mColors.size() / 2;
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        parseGradientStops(this.mColors, size, fArr, iArr, f2);
        if (size == 1) {
            int i = iArr[0];
            iArr = new int[]{i, i};
            float f5 = fArr[0];
            fArr = new float[]{f5, f5};
            cm8.C("ReactNative", "Gradient contains only on stop");
        }
        BrushType brushType = this.mType;
        if (brushType == BrushType.LINEAR_GRADIENT) {
            double d3 = fWidth;
            double d4 = f3;
            double d5 = f;
            double d6 = textSize;
            double d7 = fHeight;
            double d8 = f4;
            LinearGradient linearGradient = new LinearGradient((float) PropHelper.fromRelative(this.mPoints[0], d3, d4, d5, d6), (float) PropHelper.fromRelative(this.mPoints[1], d7, d8, d5, d6), (float) PropHelper.fromRelative(this.mPoints[2], d3, d4, d5, d6), (float) PropHelper.fromRelative(this.mPoints[3], d7, d8, d5, d6), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.mMatrix != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.mMatrix);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (brushType == BrushType.RADIAL_GRADIENT) {
            double d9 = fWidth;
            double d10 = f;
            double d11 = textSize;
            double dFromRelative = PropHelper.fromRelative(this.mPoints[2], d9, 0.0d, d10, d11);
            double d12 = fHeight;
            double dFromRelative2 = PropHelper.fromRelative(this.mPoints[3], d12, 0.0d, d10, d11);
            double dFromRelative3 = PropHelper.fromRelative(this.mPoints[4], d9, f3, d10, d11);
            double dFromRelative4 = PropHelper.fromRelative(this.mPoints[5], d12, f4, d10, d11);
            double d13 = dFromRelative2 / dFromRelative;
            RadialGradient radialGradient = new RadialGradient((float) dFromRelative3, (float) (dFromRelative4 / d13), (float) dFromRelative, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d13);
            Matrix matrix5 = this.mMatrix;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
