package com.github.mikephil.chartingv2.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.CandleEntry;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class Transformer {
    protected ViewPortHandler mViewPortHandler;
    protected Matrix mMatrixValueToPx = new Matrix();
    protected Matrix mMatrixOffset = new Matrix();
    private Matrix mMBuffer1 = new Matrix();
    private Matrix mMBuffer2 = new Matrix();

    public Transformer(ViewPortHandler viewPortHandler) {
        this.mViewPortHandler = viewPortHandler;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    public float[] generateTransformedValuesBarChart(IBarDataSet iBarDataSet, int i14, BarData barData, float f14) {
        int entryCount = iBarDataSet.getEntryCount() * 2;
        float[] fArr = new float[entryCount];
        int dataSetCount = barData.getDataSetCount();
        float groupSpace = barData.getGroupSpace();
        for (int i15 = 0; i15 < entryCount; i15 += 2) {
            ?? entryForIndex = iBarDataSet.getEntryForIndex(i15 / 2);
            int xIndex = entryForIndex.getXIndex();
            float xIndex2 = (xIndex * groupSpace) + ((dataSetCount - 1) * xIndex) + entryForIndex.getXIndex() + i14;
            float val = entryForIndex.getVal();
            fArr[i15] = (groupSpace / 2.0f) + xIndex2;
            fArr[i15 + 1] = val * f14;
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.chartingv2.data.Entry] */
    public float[] generateTransformedValuesBubble(IBubbleDataSet iBubbleDataSet, float f14, float f15, int i14, int i15) {
        int iCeil = ((int) Math.ceil(i15 - i14)) * 2;
        float[] fArr = new float[iCeil];
        for (int i16 = 0; i16 < iCeil; i16 += 2) {
            ?? entryForIndex = iBubbleDataSet.getEntryForIndex((i16 / 2) + i14);
            if (entryForIndex != 0) {
                fArr[i16] = ((entryForIndex.getXIndex() - i14) * f14) + i14;
                fArr[i16 + 1] = entryForIndex.getVal() * f15;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float[] generateTransformedValuesCandle(ICandleDataSet iCandleDataSet, float f14, float f15, int i14, int i15) {
        int iCeil = ((int) Math.ceil((i15 - i14) * f14)) * 2;
        float[] fArr = new float[iCeil];
        for (int i16 = 0; i16 < iCeil; i16 += 2) {
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex((i16 / 2) + i14);
            if (candleEntry != null) {
                fArr[i16] = candleEntry.getXIndex();
                fArr[i16 + 1] = candleEntry.getHigh() * f15;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    public float[] generateTransformedValuesHorizontalBarChart(IBarDataSet iBarDataSet, int i14, BarData barData, float f14) {
        int entryCount = iBarDataSet.getEntryCount() * 2;
        float[] fArr = new float[entryCount];
        int dataSetCount = barData.getDataSetCount();
        float groupSpace = barData.getGroupSpace();
        for (int i15 = 0; i15 < entryCount; i15 += 2) {
            ?? entryForIndex = iBarDataSet.getEntryForIndex(i15 / 2);
            int xIndex = entryForIndex.getXIndex();
            fArr[i15] = entryForIndex.getVal() * f14;
            fArr[i15 + 1] = (groupSpace / 2.0f) + (xIndex * groupSpace) + ((dataSetCount - 1) * xIndex) + xIndex + i14;
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.chartingv2.data.Entry] */
    public float[] generateTransformedValuesLine(ILineDataSet iLineDataSet, float f14, float f15, int i14, int i15) {
        int iCeil = ((int) Math.ceil((i15 - i14) * f14)) * 2;
        float[] fArr = new float[iCeil];
        for (int i16 = 0; i16 < iCeil; i16 += 2) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex((i16 / 2) + i14);
            if (entryForIndex != 0) {
                fArr[i16] = entryForIndex.getXIndex();
                fArr[i16 + 1] = entryForIndex.getVal() * f15;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    public float[] generateTransformedValuesScatter(IScatterDataSet iScatterDataSet, float f14) {
        int entryCount = iScatterDataSet.getEntryCount() * 2;
        float[] fArr = new float[entryCount];
        for (int i14 = 0; i14 < entryCount; i14 += 2) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex(i14 / 2);
            if (entryForIndex != 0) {
                fArr[i14] = entryForIndex.getXIndex();
                fArr[i14 + 1] = entryForIndex.getVal() * f14;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public Matrix getOffsetMatrix() {
        return this.mMatrixOffset;
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

    public PointD getValuesByTouchPoint(float f14, float f15) {
        float[] fArr = {f14, f15};
        pixelsToValue(fArr);
        return new PointD(fArr[0], fArr[1]);
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
        Matrix matrix = new Matrix();
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

    public void rectValueToPixel(RectF rectF, float f14) {
        rectF.top *= f14;
        rectF.bottom *= f14;
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

    public void rectValueToPixel(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }
}
