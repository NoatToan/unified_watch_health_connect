package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.data.BubbleData;
import com.github.mikephil.chartingv2.data.BubbleEntry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BubbleChartRenderer extends DataRenderer {
    private float[] _hsvBuffer;
    protected BubbleDataProvider mChart;
    private float[] pointBuffer;
    private float[] sizeBuffer;

    public BubbleChartRenderer(BubbleDataProvider bubbleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.sizeBuffer = new float[4];
        this.pointBuffer = new float[2];
        this._hsvBuffer = new float[3];
        this.mChart = bubbleDataProvider;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(Utils.convertDpToPixel(1.5f));
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t7 : this.mChart.getBubbleData().getDataSets()) {
            if (t7.isVisible() && t7.getEntryCount() > 0) {
                drawDataSet(canvas, t7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawDataSet(Canvas canvas, IBubbleDataSet iBubbleDataSet) {
        Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForXIndex(this.mMinX);
        BubbleEntry bubbleEntry2 = (BubbleEntry) iBubbleDataSet.getEntryForXIndex(this.mMaxX);
        int iMax = Math.max(iBubbleDataSet.getEntryIndex(bubbleEntry), 0);
        int iMin = Math.min(iBubbleDataSet.getEntryIndex(bubbleEntry2) + 1, iBubbleDataSet.getEntryCount());
        float[] fArr = this.sizeBuffer;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        transformer.pointValuesToPixel(fArr);
        float[] fArr2 = this.sizeBuffer;
        float fMin = Math.min(Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), Math.abs(fArr2[2] - fArr2[0]));
        for (int i14 = iMax; i14 < iMin; i14++) {
            BubbleEntry bubbleEntry3 = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i14);
            this.pointBuffer[0] = ((bubbleEntry3.getXIndex() - iMax) * phaseX) + iMax;
            this.pointBuffer[1] = bubbleEntry3.getVal() * phaseY;
            transformer.pointValuesToPixel(this.pointBuffer);
            float shapeSize = getShapeSize(bubbleEntry3.getSize(), iBubbleDataSet.getMaxSize(), fMin) / 2.0f;
            if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                if (!this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                    return;
                }
                this.mRenderPaint.setColor(iBubbleDataSet.getColor(bubbleEntry3.getXIndex()));
                float[] fArr3 = this.pointBuffer;
                canvas.drawCircle(fArr3[0], fArr3[1], shapeSize, this.mRenderPaint);
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        char c14;
        Highlight[] highlightArr2 = highlightArr;
        BubbleData bubbleData = this.mChart.getBubbleData();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        int length = highlightArr2.length;
        char c15 = 0;
        int i14 = 0;
        while (i14 < length) {
            Highlight highlight = highlightArr2[i14];
            IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) bubbleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBubbleDataSet == null || !iBubbleDataSet.isHighlightEnabled()) {
                c14 = c15;
            } else {
                BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForXIndex(this.mMinX);
                BubbleEntry bubbleEntry2 = (BubbleEntry) iBubbleDataSet.getEntryForXIndex(this.mMaxX);
                int entryIndex = iBubbleDataSet.getEntryIndex(bubbleEntry);
                int iMin = Math.min(iBubbleDataSet.getEntryIndex(bubbleEntry2) + 1, iBubbleDataSet.getEntryCount());
                BubbleEntry bubbleEntry3 = (BubbleEntry) bubbleData.getEntryForHighlight(highlight);
                if (bubbleEntry3 == null || bubbleEntry3.getXIndex() != highlight.getXIndex()) {
                    c14 = c15;
                } else {
                    Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
                    float[] fArr = this.sizeBuffer;
                    fArr[c15] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.pointValuesToPixel(fArr);
                    float[] fArr2 = this.sizeBuffer;
                    c14 = c15;
                    float fMin = Math.min(Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), Math.abs(fArr2[2] - fArr2[c15]));
                    this.pointBuffer[c14] = ((bubbleEntry3.getXIndex() - entryIndex) * phaseX) + entryIndex;
                    this.pointBuffer[1] = bubbleEntry3.getVal() * phaseY;
                    transformer.pointValuesToPixel(this.pointBuffer);
                    float shapeSize = getShapeSize(bubbleEntry3.getSize(), iBubbleDataSet.getMaxSize(), fMin) / 2.0f;
                    if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[c14] + shapeSize)) {
                        if (!this.mViewPortHandler.isInBoundsRight(this.pointBuffer[c14] - shapeSize)) {
                            return;
                        }
                        if (highlight.getXIndex() >= entryIndex && highlight.getXIndex() < iMin) {
                            int color = iBubbleDataSet.getColor(bubbleEntry3.getXIndex());
                            Color.RGBToHSV(Color.red(color), Color.green(color), Color.blue(color), this._hsvBuffer);
                            float[] fArr3 = this._hsvBuffer;
                            fArr3[2] = fArr3[2] * 0.5f;
                            this.mHighlightPaint.setColor(Color.HSVToColor(Color.alpha(color), this._hsvBuffer));
                            this.mHighlightPaint.setStrokeWidth(iBubbleDataSet.getHighlightCircleWidth());
                            float[] fArr4 = this.pointBuffer;
                            canvas.drawCircle(fArr4[c14], fArr4[1], shapeSize, this.mHighlightPaint);
                        }
                    }
                }
            }
            i14++;
            highlightArr2 = highlightArr;
            c15 = c14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        BubbleChartRenderer bubbleChartRenderer = this;
        BubbleData bubbleData = bubbleChartRenderer.mChart.getBubbleData();
        if (bubbleData == null) {
            return;
        }
        if (bubbleData.getYValCount() < ((int) Math.ceil(bubbleChartRenderer.mViewPortHandler.getScaleX() * bubbleChartRenderer.mChart.getMaxVisibleCount()))) {
            List<T> dataSets = bubbleData.getDataSets();
            float fCalcTextHeight = Utils.calcTextHeight(bubbleChartRenderer.mValuePaint, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            int i14 = 0;
            while (i14 < dataSets.size()) {
                IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) dataSets.get(i14);
                if (iBubbleDataSet.isDrawValuesEnabled() && iBubbleDataSet.getEntryCount() != 0) {
                    bubbleChartRenderer.applyValueTextStyle(iBubbleDataSet);
                    float phaseX = bubbleChartRenderer.mAnimator.getPhaseX();
                    float phaseY = bubbleChartRenderer.mAnimator.getPhaseY();
                    BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForXIndex(bubbleChartRenderer.mMinX);
                    BubbleEntry bubbleEntry2 = (BubbleEntry) iBubbleDataSet.getEntryForXIndex(bubbleChartRenderer.mMaxX);
                    int entryIndex = iBubbleDataSet.getEntryIndex(bubbleEntry);
                    float[] fArrGenerateTransformedValuesBubble = bubbleChartRenderer.mChart.getTransformer(iBubbleDataSet.getAxisDependency()).generateTransformedValuesBubble(iBubbleDataSet, phaseX, phaseY, entryIndex, Math.min(iBubbleDataSet.getEntryIndex(bubbleEntry2) + 1, iBubbleDataSet.getEntryCount()));
                    if (phaseX == 1.0f) {
                        phaseX = phaseY;
                    }
                    int i15 = 0;
                    while (i15 < fArrGenerateTransformedValuesBubble.length) {
                        int i16 = (i15 / 2) + entryIndex;
                        int valueTextColor = iBubbleDataSet.getValueTextColor(i16);
                        int iArgb = Color.argb(Math.round(255.0f * phaseX), Color.red(valueTextColor), Color.green(valueTextColor), Color.blue(valueTextColor));
                        float f14 = fArrGenerateTransformedValuesBubble[i15];
                        float f15 = fArrGenerateTransformedValuesBubble[i15 + 1];
                        if (!bubbleChartRenderer.mViewPortHandler.isInBoundsRight(f14)) {
                            break;
                        }
                        if (bubbleChartRenderer.mViewPortHandler.isInBoundsLeft(f14) && bubbleChartRenderer.mViewPortHandler.isInBoundsY(f15)) {
                            BubbleEntry bubbleEntry3 = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i16);
                            bubbleChartRenderer.drawValue(canvas, iBubbleDataSet.getValueFormatter(), bubbleEntry3.getSize(), bubbleEntry3, i14, f14, (0.5f * fCalcTextHeight) + f15, iArgb);
                        }
                        i15 += 2;
                        bubbleChartRenderer = this;
                    }
                }
                i14++;
                bubbleChartRenderer = this;
            }
        }
    }

    public float getShapeSize(float f14, float f15, float f16) {
        return f16 * (f15 == 0.0f ? 1.0f : (float) Math.sqrt(f14 / f15));
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
    }
}
