package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.PieData;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.renderer.PieChartRenderer;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class PieChart extends PieRadarChartBase<PieData> {
    private float[] mAbsoluteAngles;
    private CharSequence mCenterText;
    private float mCenterTextRadiusPercent;
    private RectF mCircleBox;
    private float[] mDrawAngles;
    private boolean mDrawCenterText;
    private boolean mDrawHole;
    private boolean mDrawRoundedSlices;
    private boolean mDrawSlicesUnderHole;
    private boolean mDrawXLabels;
    private float mHoleRadiusPercent;
    protected float mMaxAngle;
    protected float mTransparentCircleRadiusPercent;
    private boolean mUsePercentValues;

    public PieChart(Context context) {
        super(context);
        this.mCircleBox = new RectF();
        this.mDrawXLabels = true;
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    private float calcAngle(float f14) {
        return calcAngle(f14, ((PieData) this.mData).getYValueSum());
    }

    private void calcAngles() {
        this.mDrawAngles = new float[((PieData) this.mData).getYValCount()];
        this.mAbsoluteAngles = new float[((PieData) this.mData).getYValCount()];
        float yValueSum = ((PieData) this.mData).getYValueSum();
        List<IPieDataSet> dataSets = ((PieData) this.mData).getDataSets();
        int i14 = 0;
        for (int i15 = 0; i15 < ((PieData) this.mData).getDataSetCount(); i15++) {
            IPieDataSet iPieDataSet = dataSets.get(i15);
            for (int i16 = 0; i16 < iPieDataSet.getEntryCount(); i16++) {
                this.mDrawAngles[i14] = calcAngle(Math.abs(iPieDataSet.getEntryForIndex(i16).getVal()), yValueSum);
                float[] fArr = this.mAbsoluteAngles;
                if (i14 == 0) {
                    fArr[i14] = this.mDrawAngles[i14];
                } else {
                    fArr[i14] = fArr[i14 - 1] + this.mDrawAngles[i14];
                }
                i14++;
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        calcAngles();
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        PointF centerOffsets = getCenterOffsets();
        float selectionShift = ((PieData) this.mData).getDataSet().getSelectionShift();
        RectF rectF = this.mCircleBox;
        float f14 = centerOffsets.x;
        float f15 = centerOffsets.y;
        rectF.set((f14 - diameter) + selectionShift, (f15 - diameter) + selectionShift, (f14 + diameter) - selectionShift, (f15 + diameter) - selectionShift);
    }

    public float[] getAbsoluteAngles() {
        return this.mAbsoluteAngles;
    }

    public PointF getCenterCircleBox() {
        return new PointF(this.mCircleBox.centerX(), this.mCircleBox.centerY());
    }

    public CharSequence getCenterText() {
        return this.mCenterText;
    }

    public float getCenterTextRadiusPercent() {
        return this.mCenterTextRadiusPercent;
    }

    public RectF getCircleBox() {
        return this.mCircleBox;
    }

    public int getDataSetIndexForIndex(int i14) {
        List<IPieDataSet> dataSets = ((PieData) this.mData).getDataSets();
        for (int i15 = 0; i15 < dataSets.size(); i15++) {
            if (dataSets.get(i15).getEntryForXIndex(i14) != null) {
                return i15;
            }
        }
        return -1;
    }

    public float[] getDrawAngles() {
        return this.mDrawAngles;
    }

    public float getHoleRadius() {
        return this.mHoleRadiusPercent;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public int getIndexForAngle(float f14) {
        float normalizedAngle = Utils.getNormalizedAngle(f14 - getRotationAngle());
        int i14 = 0;
        while (true) {
            float[] fArr = this.mAbsoluteAngles;
            if (i14 >= fArr.length) {
                return -1;
            }
            if (fArr[i14] > normalizedAngle) {
                return i14;
            }
            i14++;
        }
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public float[] getMarkerPosition(Entry entry, Highlight highlight) {
        PointF centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float holeRadius = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            holeRadius = (radius - (getHoleRadius() * (radius / 100.0f))) / 2.0f;
        }
        float f14 = radius - holeRadius;
        float rotationAngle = getRotationAngle();
        int xIndex = entry.getXIndex();
        float f15 = this.mDrawAngles[xIndex] / 2.0f;
        double d14 = f14;
        return new float[]{(float) ((Math.cos(Math.toRadians(this.mAnimator.getPhaseY() * ((this.mAbsoluteAngles[xIndex] + rotationAngle) - f15))) * d14) + ((double) centerCircleBox.x)), (float) ((Math.sin(Math.toRadians(this.mAnimator.getPhaseY() * ((rotationAngle + this.mAbsoluteAngles[xIndex]) - f15))) * d14) + ((double) centerCircleBox.y))};
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.mCircleBox;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.mCircleBox.height() / 2.0f);
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new PieChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
    }

    public boolean isDrawCenterTextEnabled() {
        return this.mDrawCenterText;
    }

    public boolean isDrawHoleEnabled() {
        return this.mDrawHole;
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.mDrawRoundedSlices;
    }

    public boolean isDrawSliceTextEnabled() {
        return this.mDrawXLabels;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.mDrawSlicesUnderHole;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.mUsePercentValues;
    }

    public boolean needsHighlight(int i14, int i15) {
        if (valuesToHighlight() && i15 >= 0) {
            int i16 = 0;
            while (true) {
                Highlight[] highlightArr = this.mIndicesToHighlight;
                if (i16 >= highlightArr.length) {
                    break;
                }
                if (highlightArr[i16].getXIndex() == i14 && this.mIndicesToHighlight[i16].getDataSetIndex() == i15) {
                    return true;
                }
                i16++;
            }
        }
        return false;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer != null && (dataRenderer instanceof PieChartRenderer)) {
            ((PieChartRenderer) dataRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        this.mRenderer.drawExtras(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mCenterText = "";
        } else {
            this.mCenterText = charSequence;
        }
    }

    public void setCenterTextColor(int i14) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setColor(i14);
    }

    public void setCenterTextRadiusPercent(float f14) {
        this.mCenterTextRadiusPercent = f14;
    }

    public void setCenterTextSize(float f14) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(Utils.convertDpToPixel(f14));
    }

    public void setCenterTextSizePixels(float f14) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(f14);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((PieChartRenderer) this.mRenderer).getPaintCenterText().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z14) {
        this.mDrawCenterText = z14;
    }

    public void setDrawHoleEnabled(boolean z14) {
        this.mDrawHole = z14;
    }

    public void setDrawSliceText(boolean z14) {
        this.mDrawXLabels = z14;
    }

    public void setDrawSlicesUnderHole(boolean z14) {
        this.mDrawSlicesUnderHole = z14;
    }

    public void setHoleColor(int i14) {
        ((PieChartRenderer) this.mRenderer).getPaintHole().setColor(i14);
    }

    public void setHoleRadius(float f14) {
        this.mHoleRadiusPercent = f14;
    }

    public void setMaxAngle(float f14) {
        if (f14 > 360.0f) {
            f14 = 360.0f;
        }
        if (f14 < 90.0f) {
            f14 = 90.0f;
        }
        this.mMaxAngle = f14;
    }

    public void setTransparentCircleAlpha(int i14) {
        ((PieChartRenderer) this.mRenderer).getPaintTransparentCircle().setAlpha(i14);
    }

    public void setTransparentCircleColor(int i14) {
        Paint paintTransparentCircle = ((PieChartRenderer) this.mRenderer).getPaintTransparentCircle();
        int alpha = paintTransparentCircle.getAlpha();
        paintTransparentCircle.setColor(i14);
        paintTransparentCircle.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f14) {
        this.mTransparentCircleRadiusPercent = f14;
    }

    public void setUsePercentValues(boolean z14) {
        this.mUsePercentValues = z14;
    }

    private float calcAngle(float f14, float f15) {
        return (f14 / f15) * this.mMaxAngle;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCircleBox = new RectF();
        this.mDrawXLabels = true;
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mCircleBox = new RectF();
        this.mDrawXLabels = true;
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }
}
