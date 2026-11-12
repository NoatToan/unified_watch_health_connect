package com.github.mikephil.chartingv2.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.chartingv2.jobs.AnimatedMoveViewJob;
import com.github.mikephil.chartingv2.jobs.AnimatedZoomJob;
import com.github.mikephil.chartingv2.jobs.MoveViewJob;
import com.github.mikephil.chartingv2.jobs.ZoomJob;
import com.github.mikephil.chartingv2.listener.BarLineChartTouchListener;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.listener.OnDrawListener;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import com.github.mikephil.chartingv2.renderer.YAxisRenderer;
import com.github.mikephil.chartingv2.utils.PointD;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"RtlHardcoded"})
@Deprecated
public abstract class BarLineChartBase<T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> extends Chart<T> implements BarLineScatterCandleBubbleDataProvider {
    private long drawCycles;
    private Integer mAutoScaleLastHighestVisibleXIndex;
    private Integer mAutoScaleLastLowestVisibleXIndex;
    private boolean mAutoScaleMinMaxEnabled;
    protected YAxis mAxisLeft;
    protected YAxisRenderer mAxisRendererLeft;
    protected YAxisRenderer mAxisRendererRight;
    protected YAxis mAxisRight;
    protected Paint mBorderPaint;
    private boolean mCustomViewPortEnabled;
    protected boolean mDoubleTapToZoomEnabled;
    private boolean mDragEnabled;
    protected boolean mDrawBorders;
    protected boolean mDrawGridBackground;
    protected OnDrawListener mDrawListener;
    protected Paint mGridBackgroundPaint;
    protected boolean mHighlightPerDragEnabled;
    protected boolean mKeepPositionOnRotation;
    protected Transformer mLeftAxisTransformer;
    protected int mMaxVisibleCount;
    protected float mMinOffset;
    protected boolean mPinchZoomEnabled;
    protected Transformer mRightAxisTransformer;
    private boolean mScaleXEnabled;
    private boolean mScaleYEnabled;
    protected XAxisRenderer mXAxisRenderer;
    private long totalTime;

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mAutoScaleLastLowestVisibleXIndex = null;
        this.mAutoScaleLastHighestVisibleXIndex = null;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mCustomViewPortEnabled = false;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        if (this.mAutoScaleMinMaxEnabled) {
            ((BarLineScatterCandleBubbleData) this.mData).calcMinMax(getLowestVisibleXIndex(), getHighestVisibleXIndex());
        }
        this.mXAxis.mAxisMaximum = ((BarLineScatterCandleBubbleData) this.mData).getXVals().size() - 1;
        XAxis xAxis = this.mXAxis;
        xAxis.mAxisRange = Math.abs(xAxis.mAxisMaximum - xAxis.mAxisMinimum);
        YAxis yAxis = this.mAxisLeft;
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = (BarLineScatterCandleBubbleData) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calcMinMax(barLineScatterCandleBubbleData.getYMin(axisDependency), ((BarLineScatterCandleBubbleData) this.mData).getYMax(axisDependency));
        YAxis yAxis2 = this.mAxisRight;
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleData2 = (BarLineScatterCandleBubbleData) this.mData;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.calcMinMax(barLineScatterCandleBubbleData2.getYMin(axisDependency2), ((BarLineScatterCandleBubbleData) this.mData).getYMax(axisDependency2));
    }

    public void calcModulus() {
        XAxis xAxis = this.mXAxis;
        if (xAxis == null || !xAxis.isEnabled()) {
            return;
        }
        if (!this.mXAxis.isAxisModulusCustom()) {
            float[] fArr = new float[9];
            this.mViewPortHandler.getMatrixTouch().getValues(fArr);
            this.mXAxis.mAxisLabelModulus = (int) Math.ceil((((BarLineScatterCandleBubbleData) this.mData).getXValCount() * this.mXAxis.mLabelRotatedWidth) / (this.mViewPortHandler.contentWidth() * fArr[0]));
        }
        if (this.mLogEnabled) {
            XAxis xAxis2 = this.mXAxis;
            int i14 = xAxis2.mAxisLabelModulus;
            int i15 = xAxis2.mLabelWidth;
            int i16 = xAxis2.mLabelRotatedWidth;
            this.mViewPortHandler.contentWidth();
        }
        XAxis xAxis3 = this.mXAxis;
        if (xAxis3.mAxisLabelModulus < 1) {
            xAxis3.mAxisLabelModulus = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void calculateOffsets() {
        float fMin;
        float requiredWidthSpace;
        float fMin2;
        if (!this.mCustomViewPortEnabled) {
            Legend legend = this.mLegend;
            float requiredWidthSpace2 = 0.0f;
            if (legend == null || !legend.isEnabled()) {
                fMin = 0.0f;
                requiredWidthSpace = 0.0f;
                fMin2 = requiredWidthSpace;
            } else if (this.mLegend.getPosition() == Legend.LegendPosition.RIGHT_OF_CHART || this.mLegend.getPosition() == Legend.LegendPosition.RIGHT_OF_CHART_CENTER) {
                requiredWidthSpace = (this.mLegend.getXOffset() * 2.0f) + Math.min(this.mLegend.mNeededWidth, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartWidth()) + 0.0f;
                fMin = 0.0f;
                fMin2 = 0.0f;
            } else if (this.mLegend.getPosition() == Legend.LegendPosition.LEFT_OF_CHART || this.mLegend.getPosition() == Legend.LegendPosition.LEFT_OF_CHART_CENTER) {
                fMin = 0.0f;
                fMin2 = 0.0f;
                requiredWidthSpace2 = (this.mLegend.getXOffset() * 2.0f) + Math.min(this.mLegend.mNeededWidth, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartWidth()) + 0.0f;
                requiredWidthSpace = 0.0f;
            } else if (this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_LEFT || this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_RIGHT || this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_CENTER) {
                Legend legend2 = this.mLegend;
                fMin = Math.min(legend2.mNeededHeight + legend2.mTextHeightMax, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight()) + 0.0f;
                requiredWidthSpace = 0.0f;
                fMin2 = requiredWidthSpace;
            } else if (this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_LEFT || this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_RIGHT || this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_CENTER) {
                Legend legend3 = this.mLegend;
                fMin2 = Math.min(legend3.mNeededHeight + legend3.mTextHeightMax, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight()) + 0.0f;
                fMin = 0.0f;
                requiredWidthSpace = 0.0f;
            } else {
                fMin = 0.0f;
                requiredWidthSpace = 0.0f;
                fMin2 = requiredWidthSpace;
            }
            if (this.mAxisLeft.needsOffset()) {
                requiredWidthSpace2 += this.mAxisLeft.getRequiredWidthSpace(this.mAxisRendererLeft.getPaintAxisLabels());
            }
            if (this.mAxisRight.needsOffset()) {
                requiredWidthSpace += this.mAxisRight.getRequiredWidthSpace(this.mAxisRendererRight.getPaintAxisLabels());
            }
            if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
                XAxis xAxis = this.mXAxis;
                float yOffset = xAxis.getYOffset() + xAxis.mLabelRotatedHeight;
                if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                    fMin += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                    fMin2 += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                    fMin += yOffset;
                    fMin2 += yOffset;
                }
            }
            float extraTopOffset = getExtraTopOffset() + fMin2;
            float extraRightOffset = getExtraRightOffset() + requiredWidthSpace;
            float extraBottomOffset = getExtraBottomOffset() + fMin;
            float extraLeftOffset = getExtraLeftOffset() + requiredWidthSpace2;
            float fConvertDpToPixel = Utils.convertDpToPixel(this.mMinOffset);
            this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel, extraLeftOffset), Math.max(fConvertDpToPixel, extraTopOffset), Math.max(fConvertDpToPixel, extraRightOffset), Math.max(fConvertDpToPixel, extraBottomOffset));
            if (this.mLogEnabled) {
                this.mViewPortHandler.getContentRect().toString();
            }
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    public void centerViewTo(float f14, float f15, YAxis.AxisDependency axisDependency) {
        addViewportJob(new MoveViewJob(this.mViewPortHandler, f14 - ((getXAxis().getValues().size() / this.mViewPortHandler.getScaleX()) / 2.0f), ((getDeltaY(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f) + f15, getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void centerViewToAnimated(float f14, float f15, YAxis.AxisDependency axisDependency, long j8) {
        PointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(new AnimatedMoveViewJob(this.mViewPortHandler, f14 - ((getXAxis().getValues().size() / this.mViewPortHandler.getScaleX()) / 2.0f), ((getDeltaY(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f) + f15, getTransformer(axisDependency), this, (float) valuesByTouchPoint.f52835x, (float) valuesByTouchPoint.f52836y, j8));
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof BarLineChartTouchListener) {
            ((BarLineChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    public void drawGridBackground(Canvas canvas) {
        if (this.mDrawGridBackground) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mGridBackgroundPaint);
        }
        if (this.mDrawBorders) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mBorderPaint);
        }
    }

    public void fitScreen() {
        this.mViewPortHandler.refresh(this.mViewPortHandler.fitScreen(), this, false);
        calculateOffsets();
        postInvalidate();
    }

    public YAxis getAxis(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft : this.mAxisRight;
    }

    public YAxis getAxisLeft() {
        return this.mAxisLeft;
    }

    public YAxis getAxisRight() {
        return this.mAxisRight;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart, com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface, com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public /* bridge */ /* synthetic */ BarLineScatterCandleBubbleData getData() {
        return (BarLineScatterCandleBubbleData) super.getData();
    }

    public IBarLineScatterCandleBubbleDataSet getDataSetByTouchPoint(float f14, float f15) {
        Highlight highlightByTouchPoint = getHighlightByTouchPoint(f14, f15);
        if (highlightByTouchPoint != null) {
            return (IBarLineScatterCandleBubbleDataSet) ((BarLineScatterCandleBubbleData) this.mData).getDataSetByIndex(highlightByTouchPoint.getDataSetIndex());
        }
        return null;
    }

    public float getDeltaY(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft.mAxisRange : this.mAxisRight.mAxisRange;
    }

    public OnDrawListener getDrawListener() {
        return this.mDrawListener;
    }

    public Entry getEntryByTouchPoint(float f14, float f15) {
        Highlight highlightByTouchPoint = getHighlightByTouchPoint(f14, f15);
        if (highlightByTouchPoint != null) {
            return ((BarLineScatterCandleBubbleData) this.mData).getEntryForHighlight(highlightByTouchPoint);
        }
        return null;
    }

    public int getHighestVisibleXIndex() {
        float[] fArr = {this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom()};
        getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        return fArr[0] >= ((float) ((BarLineScatterCandleBubbleData) this.mData).getXValCount()) ? ((BarLineScatterCandleBubbleData) this.mData).getXValCount() - 1 : (int) fArr[0];
    }

    public Highlight getHighlightByTouchPoint(float f14, float f15) {
        if (this.mData == 0) {
            return null;
        }
        return getHighlighter().getHighlight(f14, f15);
    }

    public int getLowestVisibleXIndex() {
        float[] fArr = {this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom()};
        getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        float f14 = fArr[0];
        if (f14 <= 0.0f) {
            return 0;
        }
        return (int) (f14 + 1.0f);
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public float[] getMarkerPosition(Entry entry, Highlight highlight) {
        float phaseY;
        int dataSetIndex = highlight.getDataSetIndex();
        float xIndex = entry.getXIndex();
        float val = entry.getVal();
        if (this instanceof BarChart) {
            float groupSpace = ((BarData) this.mData).getGroupSpace();
            int dataSetCount = ((BarLineScatterCandleBubbleData) this.mData).getDataSetCount();
            int xIndex2 = entry.getXIndex();
            if (this instanceof HorizontalBarChart) {
                float f14 = (groupSpace / 2.0f) + (xIndex2 * groupSpace) + ((dataSetCount - 1) * xIndex2) + xIndex2 + dataSetIndex;
                float phaseY2 = this.mAnimator.getPhaseY() * (((BarEntry) entry).getVals() != null ? highlight.getRange().f52830to : entry.getVal());
                phaseY = f14;
                xIndex = phaseY2;
            } else {
                xIndex = (groupSpace / 2.0f) + (xIndex2 * groupSpace) + ((dataSetCount - 1) * xIndex2) + xIndex2 + dataSetIndex;
                phaseY = (((BarEntry) entry).getVals() != null ? highlight.getRange().f52830to : entry.getVal()) * this.mAnimator.getPhaseY();
            }
        } else {
            phaseY = this.mAnimator.getPhaseY() * val;
        }
        float[] fArr = {xIndex, phaseY};
        getTransformer(((IBarLineScatterCandleBubbleDataSet) ((BarLineScatterCandleBubbleData) this.mData).getDataSetByIndex(dataSetIndex)).getAxisDependency()).pointValuesToPixel(fArr);
        return fArr;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public int getMaxVisibleCount() {
        return this.mMaxVisibleCount;
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public Paint getPaint(int i14) {
        Paint paint = super.getPaint(i14);
        if (paint != null) {
            return paint;
        }
        if (i14 != 4) {
            return null;
        }
        return this.mGridBackgroundPaint;
    }

    public PointD getPixelsForValues(float f14, float f15, YAxis.AxisDependency axisDependency) {
        float[] fArr = {f14, f15};
        getTransformer(axisDependency).pointValuesToPixel(fArr);
        return new PointD(fArr[0], fArr[1]);
    }

    public PointF getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = {entry.getXIndex(), entry.getVal()};
        getTransformer(axisDependency).pointValuesToPixel(fArr);
        return new PointF(fArr[0], fArr[1]);
    }

    public YAxisRenderer getRendererLeftYAxis() {
        return this.mAxisRendererLeft;
    }

    public YAxisRenderer getRendererRightYAxis() {
        return this.mAxisRendererRight;
    }

    public XAxisRenderer getRendererXAxis() {
        return this.mXAxisRenderer;
    }

    @Override // android.view.View
    public float getScaleX() {
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        if (viewPortHandler == null) {
            return 1.0f;
        }
        return viewPortHandler.getScaleX();
    }

    @Override // android.view.View
    public float getScaleY() {
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        if (viewPortHandler == null) {
            return 1.0f;
        }
        return viewPortHandler.getScaleY();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public Transformer getTransformer(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mLeftAxisTransformer : this.mRightAxisTransformer;
    }

    public PointD getValuesByTouchPoint(float f14, float f15, YAxis.AxisDependency axisDependency) {
        float[] fArr = {f14, f15};
        getTransformer(axisDependency).pixelsToValue(fArr);
        return new PointD(fArr[0], fArr[1]);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return Math.max(this.mAxisLeft.mAxisMaximum, this.mAxisRight.mAxisMaximum);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return Math.min(this.mAxisLeft.mAxisMinimum, this.mAxisRight.mAxisMinimum);
    }

    public float getYValueByTouchPoint(float f14, float f15, YAxis.AxisDependency axisDependency) {
        return (float) getValuesByTouchPoint(f14, f15, axisDependency).f52836y;
    }

    public boolean hasNoDragOffset() {
        return this.mViewPortHandler.hasNoDragOffset();
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mAxisLeft = new YAxis(YAxis.AxisDependency.LEFT);
        this.mAxisRight = new YAxis(YAxis.AxisDependency.RIGHT);
        this.mLeftAxisTransformer = new Transformer(this.mViewPortHandler);
        this.mRightAxisTransformer = new Transformer(this.mViewPortHandler);
        this.mAxisRendererLeft = new YAxisRenderer(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new YAxisRenderer(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new XAxisRenderer(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setHighlighter(new ChartHighlighter(this));
        this.mChartTouchListener = new BarLineChartTouchListener(this, this.mViewPortHandler.getMatrixTouch());
        Paint paint = new Paint();
        this.mGridBackgroundPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mGridBackgroundPaint.setColor(Color.rgb(PsExtractor.VIDEO_STREAM_MASK, PsExtractor.VIDEO_STREAM_MASK, PsExtractor.VIDEO_STREAM_MASK));
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setColor(-16777216);
        this.mBorderPaint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
    }

    public boolean isAnyAxisInverted() {
        return this.mAxisLeft.isInverted() || this.mAxisRight.isInverted();
    }

    public boolean isAutoScaleMinMaxEnabled() {
        return this.mAutoScaleMinMaxEnabled;
    }

    public boolean isDoubleTapToZoomEnabled() {
        return this.mDoubleTapToZoomEnabled;
    }

    public boolean isDragEnabled() {
        return this.mDragEnabled;
    }

    public boolean isFullyZoomedOut() {
        return this.mViewPortHandler.isFullyZoomedOut();
    }

    public boolean isHighlightPerDragEnabled() {
        return this.mHighlightPerDragEnabled;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public boolean isInverted(YAxis.AxisDependency axisDependency) {
        return getAxis(axisDependency).isInverted();
    }

    public boolean isKeepPositionOnRotation() {
        return this.mKeepPositionOnRotation;
    }

    public boolean isPinchZoomEnabled() {
        return this.mPinchZoomEnabled;
    }

    public boolean isScaleXEnabled() {
        return this.mScaleXEnabled;
    }

    public boolean isScaleYEnabled() {
        return this.mScaleYEnabled;
    }

    public void moveViewTo(float f14, float f15, YAxis.AxisDependency axisDependency) {
        addViewportJob(new MoveViewJob(this.mViewPortHandler, f14, ((getDeltaY(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f) + f15, getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void moveViewToAnimated(float f14, float f15, YAxis.AxisDependency axisDependency, long j8) {
        PointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(new AnimatedMoveViewJob(this.mViewPortHandler, f14, ((getDeltaY(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f) + f15, getTransformer(axisDependency), this, (float) valuesByTouchPoint.f52835x, (float) valuesByTouchPoint.f52836y, j8));
    }

    public void moveViewToX(float f14) {
        addViewportJob(new MoveViewJob(this.mViewPortHandler, f14, 0.0f, getTransformer(YAxis.AxisDependency.LEFT), this));
    }

    public void moveViewToY(float f14, YAxis.AxisDependency axisDependency) {
        addViewportJob(new MoveViewJob(this.mViewPortHandler, 0.0f, ((getDeltaY(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f) + f14, getTransformer(axisDependency), this));
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            return;
        }
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer != null) {
            dataRenderer.initBuffers();
        }
        calcMinMax();
        YAxisRenderer yAxisRenderer = this.mAxisRendererLeft;
        YAxis yAxis = this.mAxisLeft;
        yAxisRenderer.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum);
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererRight;
        YAxis yAxis2 = this.mAxisRight;
        yAxisRenderer2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum);
        this.mXAxisRenderer.computeAxis(((BarLineScatterCandleBubbleData) this.mData).getXValMaximumLength(), ((BarLineScatterCandleBubbleData) this.mData).getXVals());
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        Integer num;
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        calcModulus();
        this.mXAxisRenderer.calcXBounds(this, this.mXAxis.mAxisLabelModulus);
        this.mRenderer.calcXBounds(this, this.mXAxis.mAxisLabelModulus);
        drawGridBackground(canvas);
        if (this.mAxisLeft.isEnabled()) {
            YAxisRenderer yAxisRenderer = this.mAxisRendererLeft;
            YAxis yAxis = this.mAxisLeft;
            yAxisRenderer.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum);
        }
        if (this.mAxisRight.isEnabled()) {
            YAxisRenderer yAxisRenderer2 = this.mAxisRendererRight;
            YAxis yAxis2 = this.mAxisRight;
            yAxisRenderer2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum);
        }
        this.mXAxisRenderer.renderAxisLine(canvas);
        this.mAxisRendererLeft.renderAxisLine(canvas);
        this.mAxisRendererRight.renderAxisLine(canvas);
        if (this.mAutoScaleMinMaxEnabled) {
            int lowestVisibleXIndex = getLowestVisibleXIndex();
            int highestVisibleXIndex = getHighestVisibleXIndex();
            Integer num2 = this.mAutoScaleLastLowestVisibleXIndex;
            if (num2 == null || num2.intValue() != lowestVisibleXIndex || (num = this.mAutoScaleLastHighestVisibleXIndex) == null || num.intValue() != highestVisibleXIndex) {
                calcMinMax();
                calculateOffsets();
                this.mAutoScaleLastLowestVisibleXIndex = Integer.valueOf(lowestVisibleXIndex);
                this.mAutoScaleLastHighestVisibleXIndex = Integer.valueOf(highestVisibleXIndex);
            }
        }
        int iSave = canvas.save();
        canvas.clipRect(this.mViewPortHandler.getContentRect());
        this.mXAxisRenderer.renderGridLines(canvas);
        this.mAxisRendererLeft.renderGridLines(canvas);
        this.mAxisRendererRight.renderGridLines(canvas);
        if (this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        canvas.restoreToCount(iSave);
        this.mRenderer.drawExtras(canvas);
        if (!this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (!this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (!this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        this.mAxisRendererLeft.renderAxisLabels(canvas);
        this.mAxisRendererRight.renderAxisLabels(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawMarkers(canvas);
        drawDescription(canvas);
        if (this.mLogEnabled) {
            long jCurrentTimeMillis2 = this.totalTime + (System.currentTimeMillis() - jCurrentTimeMillis);
            this.totalTime = jCurrentTimeMillis2;
            long j8 = this.drawCycles + 1;
            this.drawCycles = j8;
            long j14 = jCurrentTimeMillis2 / j8;
        }
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart, android.view.View
    public void onSizeChanged(int i14, int i15, int i16, int i17) {
        float[] fArr = new float[2];
        if (this.mKeepPositionOnRotation) {
            fArr[0] = this.mViewPortHandler.contentLeft();
            fArr[1] = this.mViewPortHandler.contentTop();
            getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        }
        super.onSizeChanged(i14, i15, i16, i17);
        if (this.mKeepPositionOnRotation) {
            getTransformer(YAxis.AxisDependency.LEFT).pointValuesToPixel(fArr);
            this.mViewPortHandler.centerViewPort(fArr, this);
        } else {
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            viewPortHandler.refresh(viewPortHandler.getMatrixTouch(), this, true);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener == null || this.mData == 0 || !this.mTouchEnabled) {
            return false;
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    public void prepareOffsetMatrix() {
        this.mRightAxisTransformer.prepareMatrixOffset(this.mAxisRight.isInverted());
        this.mLeftAxisTransformer.prepareMatrixOffset(this.mAxisLeft.isInverted());
    }

    public void prepareValuePxMatrix() {
        if (this.mLogEnabled) {
            XAxis xAxis = this.mXAxis;
            float f14 = xAxis.mAxisMinimum;
            float f15 = xAxis.mAxisMaximum;
            float f16 = xAxis.mAxisRange;
        }
        Transformer transformer = this.mRightAxisTransformer;
        XAxis xAxis2 = this.mXAxis;
        float f17 = xAxis2.mAxisMinimum;
        float f18 = xAxis2.mAxisRange;
        YAxis yAxis = this.mAxisRight;
        transformer.prepareMatrixValuePx(f17, f18, yAxis.mAxisRange, yAxis.mAxisMinimum);
        Transformer transformer2 = this.mLeftAxisTransformer;
        XAxis xAxis3 = this.mXAxis;
        float f19 = xAxis3.mAxisMinimum;
        float f22 = xAxis3.mAxisRange;
        YAxis yAxis2 = this.mAxisLeft;
        transformer2.prepareMatrixValuePx(f19, f22, yAxis2.mAxisRange, yAxis2.mAxisMinimum);
    }

    public void resetTracking() {
        this.totalTime = 0L;
        this.drawCycles = 0L;
    }

    public void resetViewPortOffsets() {
        this.mCustomViewPortEnabled = false;
        calculateOffsets();
    }

    public void setAutoScaleMinMaxEnabled(boolean z14) {
        this.mAutoScaleMinMaxEnabled = z14;
    }

    public void setBorderColor(int i14) {
        this.mBorderPaint.setColor(i14);
    }

    public void setBorderWidth(float f14) {
        this.mBorderPaint.setStrokeWidth(Utils.convertDpToPixel(f14));
    }

    public void setDoubleTapToZoomEnabled(boolean z14) {
        this.mDoubleTapToZoomEnabled = z14;
    }

    public void setDragEnabled(boolean z14) {
        this.mDragEnabled = z14;
    }

    public void setDragOffsetX(float f14) {
        this.mViewPortHandler.setDragOffsetX(f14);
    }

    public void setDragOffsetY(float f14) {
        this.mViewPortHandler.setDragOffsetY(f14);
    }

    public void setDrawBorders(boolean z14) {
        this.mDrawBorders = z14;
    }

    public void setDrawGridBackground(boolean z14) {
        this.mDrawGridBackground = z14;
    }

    public void setGridBackgroundColor(int i14) {
        this.mGridBackgroundPaint.setColor(i14);
    }

    public void setHighlightPerDragEnabled(boolean z14) {
        this.mHighlightPerDragEnabled = z14;
    }

    public void setKeepPositionOnRotation(boolean z14) {
        this.mKeepPositionOnRotation = z14;
    }

    public void setMaxVisibleValueCount(int i14) {
        this.mMaxVisibleCount = i14;
    }

    public void setMinOffset(float f14) {
        this.mMinOffset = f14;
    }

    public void setOnDrawListener(OnDrawListener onDrawListener) {
        this.mDrawListener = onDrawListener;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void setPaint(Paint paint, int i14) {
        super.setPaint(paint, i14);
        if (i14 != 4) {
            return;
        }
        this.mGridBackgroundPaint = paint;
    }

    public void setPinchZoom(boolean z14) {
        this.mPinchZoomEnabled = z14;
    }

    public void setRendererLeftYAxis(YAxisRenderer yAxisRenderer) {
        this.mAxisRendererLeft = yAxisRenderer;
    }

    public void setRendererRightYAxis(YAxisRenderer yAxisRenderer) {
        this.mAxisRendererRight = yAxisRenderer;
    }

    public void setScaleEnabled(boolean z14) {
        this.mScaleXEnabled = z14;
        this.mScaleYEnabled = z14;
    }

    public void setScaleMinima(float f14, float f15) {
        this.mViewPortHandler.setMinimumScaleX(f14);
        this.mViewPortHandler.setMinimumScaleY(f15);
    }

    public void setScaleXEnabled(boolean z14) {
        this.mScaleXEnabled = z14;
    }

    public void setScaleYEnabled(boolean z14) {
        this.mScaleYEnabled = z14;
    }

    public void setViewPortOffsets(final float f14, final float f15, final float f16, final float f17) {
        this.mCustomViewPortEnabled = true;
        post(new Runnable() { // from class: com.github.mikephil.chartingv2.charts.BarLineChartBase.1
            @Override // java.lang.Runnable
            public void run() {
                BarLineChartBase.this.mViewPortHandler.restrainViewPort(f14, f15, f16, f17);
                BarLineChartBase.this.prepareOffsetMatrix();
                BarLineChartBase.this.prepareValuePxMatrix();
            }
        });
    }

    public void setVisibleXRange(float f14, float f15) {
        float f16 = this.mXAxis.mAxisRange;
        float f17 = f16 / f14;
        this.mViewPortHandler.setMinMaxScaleX(f16 / f15, f17);
    }

    public void setVisibleXRangeMaximum(float f14) {
        this.mViewPortHandler.setMinimumScaleX(this.mXAxis.mAxisRange / f14);
    }

    public void setVisibleXRangeMinimum(float f14) {
        this.mViewPortHandler.setMaximumScaleX(this.mXAxis.mAxisRange / f14);
    }

    public void setVisibleYRangeMaximum(float f14, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinimumScaleY(getDeltaY(axisDependency) / f14);
    }

    public void setXAxisRenderer(XAxisRenderer xAxisRenderer) {
        this.mXAxisRenderer = xAxisRenderer;
    }

    public void zoom(float f14, float f15, float f16, float f17, YAxis.AxisDependency axisDependency) {
        addViewportJob(new ZoomJob(this.mViewPortHandler, f14, f15, f16, f17, getTransformer(axisDependency), axisDependency, this));
    }

    @TargetApi(11)
    public void zoomAndCenterAnimated(float f14, float f15, float f16, float f17, YAxis.AxisDependency axisDependency, long j8) {
        PointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(new AnimatedZoomJob(this.mViewPortHandler, this, getTransformer(axisDependency), getAxis(axisDependency), this.mXAxis.getValues().size(), f14, f15, this.mViewPortHandler.getScaleX(), this.mViewPortHandler.getScaleY(), f16, f17, (float) valuesByTouchPoint.f52835x, (float) valuesByTouchPoint.f52836y, j8));
    }

    public void zoomIn() {
        PointF contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.refresh(this.mViewPortHandler.zoomIn(contentCenter.x, -contentCenter.y), this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomOut() {
        PointF contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.refresh(this.mViewPortHandler.zoomOut(contentCenter.x, -contentCenter.y), this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void zoom(float f14, float f15, float f16, float f17) {
        this.mViewPortHandler.refresh(this.mViewPortHandler.zoom(f14, f15, f16, f17), this, false);
        calculateOffsets();
        postInvalidate();
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mAutoScaleLastLowestVisibleXIndex = null;
        this.mAutoScaleLastHighestVisibleXIndex = null;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mCustomViewPortEnabled = false;
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mAutoScaleLastLowestVisibleXIndex = null;
        this.mAutoScaleLastHighestVisibleXIndex = null;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mCustomViewPortEnabled = false;
    }
}
