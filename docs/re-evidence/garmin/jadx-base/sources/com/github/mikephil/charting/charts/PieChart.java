package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.PieHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PieChart extends PieRadarChartBase<PieData> {
    private float[] mAbsoluteAngles;
    private CharSequence mCenterText;
    private MPPointF mCenterTextOffset;
    private float mCenterTextRadiusPercent;
    private RectF mCircleBox;
    private float[] mDrawAngles;
    private boolean mDrawCenterText;
    private boolean mDrawEntryLabels;
    private boolean mDrawHole;
    private boolean mDrawRoundedSlices;
    private boolean mDrawSlicesUnderHole;
    private float mHoleRadiusPercent;
    protected float mMaxAngle;
    private float mMinAngleForSlices;
    protected float mTransparentCircleRadiusPercent;
    private boolean mUsePercentValues;

    public PieChart(Context context) {
        super(context);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
        this.mMinAngleForSlices = 0.0f;
    }

    private float calcAngle(float f14) {
        return calcAngle(f14, ((PieData) this.mData).getYValueSum());
    }

    private void calcAngles() {
        float f14;
        int entryCount = ((PieData) this.mData).getEntryCount();
        float f15 = 0.0f;
        if (this.mDrawAngles.length != entryCount) {
            this.mDrawAngles = new float[entryCount];
        } else {
            for (int i14 = 0; i14 < entryCount; i14++) {
                this.mDrawAngles[i14] = 0.0f;
            }
        }
        if (this.mAbsoluteAngles.length != entryCount) {
            this.mAbsoluteAngles = new float[entryCount];
        } else {
            for (int i15 = 0; i15 < entryCount; i15++) {
                this.mAbsoluteAngles[i15] = 0.0f;
            }
        }
        float yValueSum = ((PieData) this.mData).getYValueSum();
        List<IPieDataSet> dataSets = ((PieData) this.mData).getDataSets();
        float f16 = this.mMinAngleForSlices;
        boolean z14 = f16 != 0.0f && ((float) entryCount) * f16 <= this.mMaxAngle;
        float[] fArr = new float[entryCount];
        float f17 = 0.0f;
        float f18 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < ((PieData) this.mData).getDataSetCount(); i17++) {
            IPieDataSet iPieDataSet = dataSets.get(i17);
            int i18 = 0;
            while (i18 < iPieDataSet.getEntryCount()) {
                float fCalcAngle = calcAngle(Math.abs(iPieDataSet.getEntryForIndex(i18).getY()), yValueSum);
                if (z14) {
                    float f19 = this.mMinAngleForSlices;
                    f14 = f15;
                    float f22 = fCalcAngle - f19;
                    if (f22 <= f14) {
                        fArr[i16] = f19;
                        f17 += -f22;
                    } else {
                        fArr[i16] = fCalcAngle;
                        f18 += f22;
                    }
                } else {
                    f14 = f15;
                }
                this.mDrawAngles[i16] = fCalcAngle;
                float[] fArr2 = this.mAbsoluteAngles;
                if (i16 == 0) {
                    fArr2[i16] = fCalcAngle;
                } else {
                    fArr2[i16] = fArr2[i16 - 1] + fCalcAngle;
                }
                i16++;
                i18++;
                f15 = f14;
            }
        }
        if (z14) {
            for (int i19 = 0; i19 < entryCount; i19++) {
                float f24 = fArr[i19];
                float f25 = f24 - (((f24 - this.mMinAngleForSlices) / f18) * f17);
                fArr[i19] = f25;
                float[] fArr3 = this.mAbsoluteAngles;
                if (i19 == 0) {
                    fArr3[0] = fArr[0];
                } else {
                    fArr3[i19] = fArr3[i19 - 1] + f25;
                }
            }
            this.mDrawAngles = fArr;
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        calcAngles();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        MPPointF centerOffsets = getCenterOffsets();
        float selectionShift = ((PieData) this.mData).getDataSet().getSelectionShift();
        RectF rectF = this.mCircleBox;
        float f14 = centerOffsets.f52828x;
        float f15 = centerOffsets.f52829y;
        rectF.set((f14 - diameter) + selectionShift, (f15 - diameter) + selectionShift, (f14 + diameter) - selectionShift, (f15 + diameter) - selectionShift);
        MPPointF.recycleInstance(centerOffsets);
    }

    /* JADX INFO: renamed from: getAbsoluteAngles */
    public float[] getF31353b() {
        return this.mAbsoluteAngles;
    }

    public MPPointF getCenterCircleBox() {
        return MPPointF.getInstance(this.mCircleBox.centerX(), this.mCircleBox.centerY());
    }

    public CharSequence getCenterText() {
        return this.mCenterText;
    }

    public MPPointF getCenterTextOffset() {
        MPPointF mPPointF = this.mCenterTextOffset;
        return MPPointF.getInstance(mPPointF.f52828x, mPPointF.f52829y);
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
            if (dataSets.get(i15).getEntryForXValue(i14, Float.NaN) != null) {
                return i15;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: getDrawAngles */
    public float[] getF31352a() {
        return this.mDrawAngles;
    }

    public float getHoleRadius() {
        return this.mHoleRadiusPercent;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
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

    @Override // com.github.mikephil.charting.charts.Chart
    public float[] getMarkerPosition(Highlight highlight) {
        MPPointF centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float holeRadius = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            holeRadius = (radius - (getHoleRadius() * (radius / 100.0f))) / 2.0f;
        }
        float f14 = radius - holeRadius;
        float rotationAngle = getRotationAngle();
        int x14 = (int) highlight.getX();
        float f15 = this.mDrawAngles[x14] / 2.0f;
        double d14 = f14;
        float fCos = (float) ((Math.cos(Math.toRadians(this.mAnimator.getPhaseY() * ((this.mAbsoluteAngles[x14] + rotationAngle) - f15))) * d14) + ((double) centerCircleBox.f52828x));
        float fSin = (float) ((Math.sin(Math.toRadians(this.mAnimator.getPhaseY() * ((rotationAngle + this.mAbsoluteAngles[x14]) - f15))) * d14) + ((double) centerCircleBox.f52829y));
        MPPointF.recycleInstance(centerCircleBox);
        return new float[]{fCos, fSin};
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    public float getMinAngleForSlices() {
        return this.mMinAngleForSlices;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.mCircleBox;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.mCircleBox.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new PieChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new PieHighlighter(this);
    }

    public boolean isDrawCenterTextEnabled() {
        return this.mDrawCenterText;
    }

    public boolean isDrawEntryLabelsEnabled() {
        return this.mDrawEntryLabels;
    }

    public boolean isDrawHoleEnabled() {
        return this.mDrawHole;
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.mDrawRoundedSlices;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.mDrawSlicesUnderHole;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.mUsePercentValues;
    }

    public boolean needsHighlight(int i14) {
        if (!valuesToHighlight()) {
            return false;
        }
        int i15 = 0;
        while (true) {
            Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i15 >= highlightArr.length) {
                return false;
            }
            if (((int) highlightArr[i15].getX()) == i14) {
                return true;
            }
            i15++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer != null && (dataRenderer instanceof PieChartRenderer)) {
            ((PieChartRenderer) dataRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
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

    public void setCenterTextOffset(float f14, float f15) {
        this.mCenterTextOffset.f52828x = Utils.convertDpToPixel(f14);
        this.mCenterTextOffset.f52829y = Utils.convertDpToPixel(f15);
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

    public void setDrawEntryLabels(boolean z14) {
        this.mDrawEntryLabels = z14;
    }

    public void setDrawHoleEnabled(boolean z14) {
        this.mDrawHole = z14;
    }

    public void setDrawRoundedSlices(boolean z14) {
        this.mDrawRoundedSlices = z14;
    }

    @Deprecated
    public void setDrawSliceText(boolean z14) {
        this.mDrawEntryLabels = z14;
    }

    public void setDrawSlicesUnderHole(boolean z14) {
        this.mDrawSlicesUnderHole = z14;
    }

    public void setEntryLabelColor(int i14) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setColor(i14);
    }

    public void setEntryLabelTextSize(float f14) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTextSize(Utils.convertDpToPixel(f14));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTypeface(typeface);
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

    public void setMinAngleForSlices(float f14) {
        float f15 = this.mMaxAngle;
        if (f14 > f15 / 2.0f) {
            f14 = f15 / 2.0f;
        } else if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        this.mMinAngleForSlices = f14;
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
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
        this.mMinAngleForSlices = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
        this.mMinAngleForSlices = 0.0f;
    }
}
