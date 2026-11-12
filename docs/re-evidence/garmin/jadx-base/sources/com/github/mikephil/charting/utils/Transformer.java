package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class Transformer {
    protected ViewPortHandler mViewPortHandler;
    protected Matrix mMatrixValueToPx = new Matrix();
    protected Matrix mMatrixOffset = new Matrix();
    protected float[] valuePointsForGenerateTransformedValuesScatter = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesBubble = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesLine = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesCandle = new float[1];
    protected Matrix mPixelToValueMatrixBuffer = new Matrix();
    float[] ptsBuffer = new float[2];
    private Matrix mMBuffer1 = new Matrix();
    private Matrix mMBuffer2 = new Matrix();

    public Transformer(ViewPortHandler viewPortHandler) {
        this.mViewPortHandler = viewPortHandler;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesBubble(IBubbleDataSet iBubbleDataSet, float f14, int i14, int i15) {
        int i16 = ((i15 - i14) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesBubble.length != i16) {
            this.valuePointsForGenerateTransformedValuesBubble = new float[i16];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesBubble;
        for (int i17 = 0; i17 < i16; i17 += 2) {
            ?? entryForIndex = iBubbleDataSet.getEntryForIndex((i17 / 2) + i14);
            if (entryForIndex != 0) {
                fArr[i17] = entryForIndex.getX();
                fArr[i17 + 1] = entryForIndex.getY() * f14;
            } else {
                fArr[i17] = 0.0f;
                fArr[i17 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float[] generateTransformedValuesCandle(ICandleDataSet iCandleDataSet, float f14, float f15, int i14, int i15) {
        int i16 = ((int) (((i15 - i14) * f14) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesCandle.length != i16) {
            this.valuePointsForGenerateTransformedValuesCandle = new float[i16];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesCandle;
        for (int i17 = 0; i17 < i16; i17 += 2) {
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex((i17 / 2) + i14);
            if (candleEntry != null) {
                fArr[i17] = candleEntry.getX();
                fArr[i17 + 1] = candleEntry.getHigh() * f15;
            } else {
                fArr[i17] = 0.0f;
                fArr[i17 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesLine(ILineDataSet iLineDataSet, float f14, float f15, int i14, int i15) {
        int i16 = (((int) ((i15 - i14) * f14)) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesLine.length != i16) {
            this.valuePointsForGenerateTransformedValuesLine = new float[i16];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesLine;
        for (int i17 = 0; i17 < i16; i17 += 2) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex((i17 / 2) + i14);
            if (entryForIndex != 0) {
                fArr[i17] = entryForIndex.getX();
                fArr[i17 + 1] = entryForIndex.getY() * f15;
            } else {
                fArr[i17] = 0.0f;
                fArr[i17 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesScatter(IScatterDataSet iScatterDataSet, float f14, float f15, int i14, int i15) {
        int i16 = ((int) (((i15 - i14) * f14) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesScatter.length != i16) {
            this.valuePointsForGenerateTransformedValuesScatter = new float[i16];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesScatter;
        for (int i17 = 0; i17 < i16; i17 += 2) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex((i17 / 2) + i14);
            if (entryForIndex != 0) {
                fArr[i17] = entryForIndex.getX();
                fArr[i17 + 1] = entryForIndex.getY() * f15;
            } else {
                fArr[i17] = 0.0f;
                fArr[i17 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public Matrix getOffsetMatrix() {
        return this.mMatrixOffset;
    }

    public MPPointD getPixelForValues(float f14, float f15) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f14;
        fArr[1] = f15;
        pointValuesToPixel(fArr);
        float[] fArr2 = this.ptsBuffer;
        return MPPointD.getInstance(fArr2[0], fArr2[1]);
    }

    public Matrix getPixelToValueMatrix() {
        getValueToPixelMatrix().invert(this.mMBuffer2);
        return this.mMBuffer2;
    }

    public Matrix getValueMatrix() {
        return this.mMatrixValueToPx;
    }

    public Matrix getValueToPixelMatrix() {
        this.mMBuffer1.set(this.mMatrixValueToPx);
        this.mMBuffer1.postConcat(this.mViewPortHandler.mMatrixTouch);
        this.mMBuffer1.postConcat(this.mMatrixOffset);
        return this.mMBuffer1;
    }

    public void getValuesByTouchPoint(float f14, float f15, MPPointD mPPointD) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f14;
        fArr[1] = f15;
        pixelsToValue(fArr);
        float[] fArr2 = this.ptsBuffer;
        mPPointD.f52826x = fArr2[0];
        mPPointD.f52827y = fArr2[1];
    }

    public void pathValueToPixel(Path path) {
        path.transform(this.mMatrixValueToPx);
        path.transform(this.mViewPortHandler.getMatrixTouch());
        path.transform(this.mMatrixOffset);
    }

    public void pathValuesToPixel(List<Path> list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            pathValueToPixel(list.get(i14));
        }
    }

    public void pixelsToValue(float[] fArr) {
        Matrix matrix = this.mPixelToValueMatrixBuffer;
        matrix.reset();
        this.mMatrixOffset.invert(matrix);
        matrix.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().invert(matrix);
        matrix.mapPoints(fArr);
        this.mMatrixValueToPx.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void pointValuesToPixel(float[] fArr) {
        this.mMatrixValueToPx.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
        this.mMatrixOffset.mapPoints(fArr);
    }

    public void prepareMatrixOffset(boolean z14) {
        this.mMatrixOffset.reset();
        Matrix matrix = this.mMatrixOffset;
        if (!z14) {
            matrix.postTranslate(this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
        } else {
            matrix.setTranslate(this.mViewPortHandler.offsetLeft(), -this.mViewPortHandler.offsetTop());
            this.mMatrixOffset.postScale(1.0f, -1.0f);
        }
    }

    public void prepareMatrixValuePx(float f14, float f15, float f16, float f17) {
        float fContentWidth = this.mViewPortHandler.contentWidth() / f15;
        float fContentHeight = this.mViewPortHandler.contentHeight() / f16;
        if (Float.isInfinite(fContentWidth)) {
            fContentWidth = 0.0f;
        }
        if (Float.isInfinite(fContentHeight)) {
            fContentHeight = 0.0f;
        }
        this.mMatrixValueToPx.reset();
        this.mMatrixValueToPx.postTranslate(-f14, -f17);
        this.mMatrixValueToPx.postScale(fContentWidth, -fContentHeight);
    }

    public void rectToPixelPhase(RectF rectF, float f14) {
        rectF.top *= f14;
        rectF.bottom *= f14;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectToPixelPhaseHorizontal(RectF rectF, float f14) {
        rectF.left *= f14;
        rectF.right *= f14;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixel(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(RectF rectF, float f14) {
        rectF.left *= f14;
        rectF.right *= f14;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValuesToPixel(List<RectF> list) {
        Matrix valueToPixelMatrix = getValueToPixelMatrix();
        for (int i14 = 0; i14 < list.size(); i14++) {
            valueToPixelMatrix.mapRect(list.get(i14));
        }
    }

    public MPPointD getValuesByTouchPoint(float f14, float f15) {
        MPPointD mPPointD = MPPointD.getInstance(0.0d, 0.0d);
        getValuesByTouchPoint(f14, f15, mPPointD);
        return mPPointD;
    }

    public void rectValueToPixelHorizontal(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }
}
