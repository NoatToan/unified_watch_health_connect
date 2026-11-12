package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.buffer.ScatterBuffer;
import com.github.mikephil.chartingv2.charts.ScatterChart;
import com.github.mikephil.chartingv2.data.ScatterData;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ScatterChartRenderer extends LineScatterCandleRadarRenderer {
    protected ScatterDataProvider mChart;
    protected ScatterBuffer[] mScatterBuffers;

    /* JADX INFO: renamed from: com.github.mikephil.chartingv2.renderer.ScatterChartRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$chartingv2$charts$ScatterChart$ScatterShape;

        static {
            int[] iArr = new int[ScatterChart.ScatterShape.values().length];
            $SwitchMap$com$github$mikephil$chartingv2$charts$ScatterChart$ScatterShape = iArr;
            try {
                iArr[ScatterChart.ScatterShape.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$ScatterChart$ScatterShape[ScatterChart.ScatterShape.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$ScatterChart$ScatterShape[ScatterChart.ScatterShape.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$ScatterChart$ScatterShape[ScatterChart.ScatterShape.CROSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$ScatterChart$ScatterShape[ScatterChart.ScatterShape.X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ScatterChartRenderer(ScatterDataProvider scatterDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = scatterDataProvider;
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t7 : this.mChart.getScatterData().getDataSets()) {
            if (t7.isVisible()) {
                drawDataSet(canvas, t7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x0289  */
    /* JADX WARN: Code duplicated, block: B:86:0x0319  */
    public void drawDataSet(Canvas canvas, IScatterDataSet iScatterDataSet) {
        int i14;
        int i15;
        Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
        float f14 = fConvertDpToPixel / 2.0f;
        float fConvertDpToPixel2 = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float f15 = fConvertDpToPixel2 * 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        float f16 = (fConvertDpToPixel - f15) / 2.0f;
        float f17 = f16 / 2.0f;
        ScatterChart.ScatterShape scatterShape = iScatterDataSet.getScatterShape();
        ScatterBuffer scatterBuffer = this.mScatterBuffers[this.mChart.getScatterData().getIndexOfDataSet(iScatterDataSet)];
        scatterBuffer.setPhases(phaseX, phaseY);
        scatterBuffer.feed(iScatterDataSet);
        transformer.pointValuesToPixel(scatterBuffer.buffer);
        int i16 = AnonymousClass1.$SwitchMap$com$github$mikephil$chartingv2$charts$ScatterChart$ScatterShape[scatterShape.ordinal()];
        int i17 = 0;
        if (i16 == 1) {
            int i18 = 0;
            while (i18 < scatterBuffer.size() && this.mViewPortHandler.isInBoundsRight(scatterBuffer.buffer[i18])) {
                if (this.mViewPortHandler.isInBoundsLeft(scatterBuffer.buffer[i18])) {
                    int i19 = i18 + 1;
                    if (this.mViewPortHandler.isInBoundsY(scatterBuffer.buffer[i19])) {
                        this.mRenderPaint.setColor(iScatterDataSet.getColor(i18 / 2));
                        double d14 = f15;
                        Paint paint = this.mRenderPaint;
                        if (d14 > 0.0d) {
                            paint.setStyle(Paint.Style.STROKE);
                            this.mRenderPaint.setStrokeWidth(f16);
                            float[] fArr = scatterBuffer.buffer;
                            float f18 = fArr[i18];
                            float f19 = fArr[i19];
                            i14 = i18;
                            canvas.drawRect((f18 - fConvertDpToPixel2) - f17, (f19 - fConvertDpToPixel2) - f17, f18 + fConvertDpToPixel2 + f17, f19 + fConvertDpToPixel2 + f17, this.mRenderPaint);
                            if (scatterShapeHoleColor != 1122867) {
                                this.mRenderPaint.setStyle(Paint.Style.FILL);
                                this.mRenderPaint.setColor(scatterShapeHoleColor);
                                float[] fArr2 = scatterBuffer.buffer;
                                float f22 = fArr2[i14];
                                float f24 = fArr2[i19];
                                canvas.drawRect(f22 - fConvertDpToPixel2, f24 - fConvertDpToPixel2, f22 + fConvertDpToPixel2, f24 + fConvertDpToPixel2, this.mRenderPaint);
                            }
                        } else {
                            i14 = i18;
                            paint.setStyle(Paint.Style.FILL);
                            float[] fArr3 = scatterBuffer.buffer;
                            float f25 = fArr3[i14];
                            float f26 = fArr3[i19];
                            canvas.drawRect(f25 - f14, f26 - f14, f25 + f14, f26 + f14, this.mRenderPaint);
                        }
                    } else {
                        i14 = i18;
                    }
                } else {
                    i14 = i18;
                }
                i18 = i14 + 2;
            }
            return;
        }
        if (i16 == 2) {
            while (i17 < scatterBuffer.size() && this.mViewPortHandler.isInBoundsRight(scatterBuffer.buffer[i17])) {
                if (this.mViewPortHandler.isInBoundsLeft(scatterBuffer.buffer[i17])) {
                    int i24 = i17 + 1;
                    if (this.mViewPortHandler.isInBoundsY(scatterBuffer.buffer[i24])) {
                        this.mRenderPaint.setColor(iScatterDataSet.getColor(i17 / 2));
                        int i25 = i17;
                        double d15 = f15;
                        Paint paint2 = this.mRenderPaint;
                        if (d15 > 0.0d) {
                            paint2.setStyle(Paint.Style.STROKE);
                            this.mRenderPaint.setStrokeWidth(f16);
                            float[] fArr4 = scatterBuffer.buffer;
                            i15 = i25;
                            canvas.drawCircle(fArr4[i25], fArr4[i24], fConvertDpToPixel2 + f17, this.mRenderPaint);
                            if (scatterShapeHoleColor != 1122867) {
                                this.mRenderPaint.setStyle(Paint.Style.FILL);
                                this.mRenderPaint.setColor(scatterShapeHoleColor);
                                float[] fArr5 = scatterBuffer.buffer;
                                canvas.drawCircle(fArr5[i15], fArr5[i24], fConvertDpToPixel2, this.mRenderPaint);
                            }
                        } else {
                            i15 = i25;
                            paint2.setStyle(Paint.Style.FILL);
                            float[] fArr6 = scatterBuffer.buffer;
                            canvas.drawCircle(fArr6[i15], fArr6[i24], f14, this.mRenderPaint);
                        }
                    } else {
                        i15 = i17;
                    }
                } else {
                    i15 = i17;
                }
                i17 = i15 + 2;
            }
            return;
        }
        if (i16 != 3) {
            if (i16 == 4) {
                this.mRenderPaint.setStyle(Paint.Style.STROKE);
                this.mRenderPaint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
                for (int i26 = 0; i26 < scatterBuffer.size() && this.mViewPortHandler.isInBoundsRight(scatterBuffer.buffer[i26]); i26 += 2) {
                    if (this.mViewPortHandler.isInBoundsLeft(scatterBuffer.buffer[i26])) {
                        int i27 = i26 + 1;
                        if (this.mViewPortHandler.isInBoundsY(scatterBuffer.buffer[i27])) {
                            this.mRenderPaint.setColor(iScatterDataSet.getColor(i26 / 2));
                            float[] fArr7 = scatterBuffer.buffer;
                            float f27 = fArr7[i26];
                            float f28 = fArr7[i27];
                            canvas.drawLine(f27 - f14, f28, f27 + f14, f28, this.mRenderPaint);
                            float[] fArr8 = scatterBuffer.buffer;
                            float f29 = fArr8[i26];
                            float f34 = fArr8[i27];
                            canvas.drawLine(f29, f34 - f14, f29, f34 + f14, this.mRenderPaint);
                        }
                    }
                }
                return;
            }
            if (i16 != 5) {
                return;
            }
            this.mRenderPaint.setStyle(Paint.Style.STROKE);
            this.mRenderPaint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
            for (int i28 = 0; i28 < scatterBuffer.size() && this.mViewPortHandler.isInBoundsRight(scatterBuffer.buffer[i28]); i28 += 2) {
                if (this.mViewPortHandler.isInBoundsLeft(scatterBuffer.buffer[i28])) {
                    int i29 = i28 + 1;
                    if (this.mViewPortHandler.isInBoundsY(scatterBuffer.buffer[i29])) {
                        this.mRenderPaint.setColor(iScatterDataSet.getColor(i28 / 2));
                        float[] fArr9 = scatterBuffer.buffer;
                        float f35 = fArr9[i28];
                        float f36 = fArr9[i29];
                        canvas.drawLine(f35 - f14, f36 - f14, f35 + f14, f36 + f14, this.mRenderPaint);
                        float[] fArr10 = scatterBuffer.buffer;
                        float f37 = fArr10[i28];
                        float f38 = fArr10[i29];
                        canvas.drawLine(f37 + f14, f38 - f14, f37 - f14, f38 + f14, this.mRenderPaint);
                    }
                }
            }
            return;
        }
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        while (i17 < scatterBuffer.size() && this.mViewPortHandler.isInBoundsRight(scatterBuffer.buffer[i17])) {
            if (this.mViewPortHandler.isInBoundsLeft(scatterBuffer.buffer[i17])) {
                int i30 = i17 + 1;
                if (this.mViewPortHandler.isInBoundsY(scatterBuffer.buffer[i30])) {
                    this.mRenderPaint.setColor(iScatterDataSet.getColor(i17 / 2));
                    float[] fArr11 = scatterBuffer.buffer;
                    path.moveTo(fArr11[i17], fArr11[i30] - f14);
                    float[] fArr12 = scatterBuffer.buffer;
                    path.lineTo(fArr12[i17] + f14, fArr12[i30] + f14);
                    float[] fArr13 = scatterBuffer.buffer;
                    path.lineTo(fArr13[i17] - f14, fArr13[i30] + f14);
                    double d16 = f15;
                    if (d16 > 0.0d) {
                        float[] fArr14 = scatterBuffer.buffer;
                        path.lineTo(fArr14[i17], fArr14[i30] - f14);
                        float[] fArr15 = scatterBuffer.buffer;
                        path.moveTo((fArr15[i17] - f14) + f16, (fArr15[i30] + f14) - f16);
                        float[] fArr16 = scatterBuffer.buffer;
                        path.lineTo((fArr16[i17] + f14) - f16, (fArr16[i30] + f14) - f16);
                        float[] fArr17 = scatterBuffer.buffer;
                        path.lineTo(fArr17[i17], (fArr17[i30] - f14) + f16);
                        float[] fArr18 = scatterBuffer.buffer;
                        path.lineTo((fArr18[i17] - f14) + f16, (fArr18[i30] + f14) - f16);
                    }
                    path.close();
                    canvas.drawPath(path, this.mRenderPaint);
                    path.reset();
                    if (d16 > 0.0d && scatterShapeHoleColor != 1122867) {
                        this.mRenderPaint.setColor(scatterShapeHoleColor);
                        float[] fArr19 = scatterBuffer.buffer;
                        path.moveTo(fArr19[i17], (fArr19[i30] - f14) + f16);
                        float[] fArr20 = scatterBuffer.buffer;
                        path.lineTo((fArr20[i17] + f14) - f16, (fArr20[i30] + f14) - f16);
                        float[] fArr21 = scatterBuffer.buffer;
                        path.lineTo((fArr21[i17] - f14) + f16, (fArr21[i30] + f14) - f16);
                        path.close();
                        canvas.drawPath(path, this.mRenderPaint);
                        path.reset();
                    }
                }
            }
            i17 += 2;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        for (int i14 = 0; i14 < highlightArr.length; i14++) {
            IScatterDataSet iScatterDataSet = (IScatterDataSet) this.mChart.getScatterData().getDataSetByIndex(highlightArr[i14].getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                int xIndex = highlightArr[i14].getXIndex();
                float f14 = xIndex;
                if (f14 <= this.mAnimator.getPhaseX() * this.mChart.getXChartMax()) {
                    float yValForXIndex = iScatterDataSet.getYValForXIndex(xIndex);
                    if (yValForXIndex != Float.NaN) {
                        float[] fArr = {f14, this.mAnimator.getPhaseY() * yValForXIndex};
                        this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).pointValuesToPixel(fArr);
                        drawHighlightLines(canvas, fArr, iScatterDataSet);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.github.mikephil.chartingv2.data.Entry] */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (this.mChart.getScatterData().getYValCount() < this.mViewPortHandler.getScaleX() * this.mChart.getMaxVisibleCount()) {
            List<T> dataSets = this.mChart.getScatterData().getDataSets();
            for (int i14 = 0; i14 < this.mChart.getScatterData().getDataSetCount(); i14++) {
                IScatterDataSet iScatterDataSet = (IScatterDataSet) dataSets.get(i14);
                if (iScatterDataSet.isDrawValuesEnabled() && iScatterDataSet.getEntryCount() != 0) {
                    applyValueTextStyle(iScatterDataSet);
                    float[] fArrGenerateTransformedValuesScatter = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).generateTransformedValuesScatter(iScatterDataSet, this.mAnimator.getPhaseY());
                    float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
                    for (int i15 = 0; i15 < this.mAnimator.getPhaseX() * fArrGenerateTransformedValuesScatter.length && this.mViewPortHandler.isInBoundsRight(fArrGenerateTransformedValuesScatter[i15]); i15 += 2) {
                        if (this.mViewPortHandler.isInBoundsLeft(fArrGenerateTransformedValuesScatter[i15])) {
                            int i16 = i15 + 1;
                            if (this.mViewPortHandler.isInBoundsY(fArrGenerateTransformedValuesScatter[i16])) {
                                int i17 = i15 / 2;
                                ?? entryForIndex = iScatterDataSet.getEntryForIndex(i17);
                                drawValue(canvas, iScatterDataSet.getValueFormatter(), entryForIndex.getVal(), entryForIndex, i14, fArrGenerateTransformedValuesScatter[i15], fArrGenerateTransformedValuesScatter[i16] - fConvertDpToPixel, iScatterDataSet.getValueTextColor(i17));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
        ScatterData scatterData = this.mChart.getScatterData();
        this.mScatterBuffers = new ScatterBuffer[scatterData.getDataSetCount()];
        for (int i14 = 0; i14 < this.mScatterBuffers.length; i14++) {
            this.mScatterBuffers[i14] = new ScatterBuffer(((IScatterDataSet) scatterData.getDataSetByIndex(i14)).getEntryCount() * 2);
        }
    }
}
