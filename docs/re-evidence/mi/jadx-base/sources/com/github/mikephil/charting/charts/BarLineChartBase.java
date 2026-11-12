package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import defpackage.a12;
import defpackage.b12;
import defpackage.cc1;
import defpackage.crr;
import defpackage.dn5;
import defpackage.f8h;
import defpackage.fmq;
import defpackage.gu3;
import defpackage.hc1;
import defpackage.hpc;
import defpackage.hwq;
import defpackage.m1s;
import defpackage.r7c;
import defpackage.ryp;
import defpackage.ttr;
import defpackage.vye;
import defpackage.wye;
import defpackage.z8g;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"RtlHardcoded"})
public abstract class BarLineChartBase<T extends a12<? extends hpc<? extends Entry>>> extends Chart<T> implements b12 {
    private long drawCycles;
    protected boolean mAutoScaleMinMaxEnabled;
    protected YAxis mAxisLeft;
    protected ttr mAxisRendererLeft;
    protected ttr mAxisRendererRight;
    protected YAxis mAxisRight;
    protected Paint mBorderPaint;
    protected boolean mClipDataToContent;
    protected boolean mClipValuesToContent;
    private boolean mCustomViewPortEnabled;
    protected boolean mDoubleTapToZoomEnabled;
    private boolean mDragXEnabled;
    private boolean mDragYEnabled;
    protected boolean mDrawBorders;
    protected boolean mDrawGridBackground;
    protected f8h mDrawListener;
    protected Matrix mFitScreenMatrixBuffer;
    protected float[] mGetPositionBuffer;
    protected Paint mGridBackgroundPaint;
    protected boolean mHighlightPerDragEnabled;
    protected boolean mKeepPositionOnRotation;
    protected ryp mLeftAxisTransformer;
    protected int mMaxVisibleCount;
    protected float mMinOffset;
    private RectF mOffsetsBuffer;
    protected float[] mOnSizeChangedBuffer;
    protected boolean mPinchZoomEnabled;
    protected ryp mRightAxisTransformer;
    private boolean mScaleXEnabled;
    private boolean mScaleYEnabled;
    protected crr mXAxisRenderer;
    protected Matrix mZoomMatrixBuffer;
    protected vye posForGetHighestVisibleX;
    protected vye posForGetLowestVisibleX;
    private long totalTime;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f7763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7764b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        public a(float f, float f2, float f3, float f4) {
            this.f7763a = f;
            this.f7764b = f2;
            this.c = f3;
            this.d = f4;
        }

        @Override // java.lang.Runnable
        public void run() {
            BarLineChartBase.this.mViewPortHandler.N(this.f7763a, this.f7764b, this.c, this.d);
            BarLineChartBase.this.prepareOffsetMatrix();
            BarLineChartBase.this.prepareValuePxMatrix();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7766b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            c = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            f7766b = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7766b[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7766b[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            f7765a = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7765a[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragXEnabled = true;
        this.mDragYEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mClipDataToContent = true;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = vye.b(0.0d, 0.0d);
        this.posForGetHighestVisibleX = vye.b(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    public void autoScale() {
        ((a12) this.mData).g(getLowestVisibleX(), getHighestVisibleX());
        this.mXAxis.calculate(((a12) this.mData).s(), ((a12) this.mData).r());
        if (this.mAxisLeft.isEnabled()) {
            YAxis yAxis = this.mAxisLeft;
            a12 a12Var = (a12) this.mData;
            YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
            yAxis.calculate(a12Var.w(axisDependency), ((a12) this.mData).u(axisDependency));
        }
        if (this.mAxisRight.isEnabled()) {
            YAxis yAxis2 = this.mAxisRight;
            a12 a12Var2 = (a12) this.mData;
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
            yAxis2.calculate(a12Var2.w(axisDependency2), ((a12) this.mData).u(axisDependency2));
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        this.mXAxis.calculate(((a12) this.mData).s(), ((a12) this.mData).r());
        YAxis yAxis = this.mAxisLeft;
        a12 a12Var = (a12) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(a12Var.w(axisDependency), ((a12) this.mData).u(axisDependency));
        YAxis yAxis2 = this.mAxisRight;
        a12 a12Var2 = (a12) this.mData;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.calculate(a12Var2.w(axisDependency2), ((a12) this.mData).u(axisDependency2));
    }

    public void calculateLegendOffsets(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = this.mLegend;
        if (legend == null || !legend.isEnabled() || this.mLegend.v()) {
            return;
        }
        int i = b.c[this.mLegend.q().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            int i2 = b.f7765a[this.mLegend.s().ordinal()];
            if (i2 == 1) {
                rectF.top += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
                return;
            } else {
                if (i2 != 2) {
                    return;
                }
                rectF.bottom += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
                return;
            }
        }
        int i3 = b.f7766b[this.mLegend.m().ordinal()];
        if (i3 == 1) {
            rectF.left += Math.min(this.mLegend.f7786r, this.mViewPortHandler.n() * this.mLegend.n()) + this.mLegend.getXOffset();
            return;
        }
        if (i3 == 2) {
            rectF.right += Math.min(this.mLegend.f7786r, this.mViewPortHandler.n() * this.mLegend.n()) + this.mLegend.getXOffset();
            return;
        }
        if (i3 != 3) {
            return;
        }
        int i4 = b.f7765a[this.mLegend.s().ordinal()];
        if (i4 == 1) {
            rectF.top += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
        } else {
            if (i4 != 2) {
                return;
            }
            rectF.bottom += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        if (!this.mCustomViewPortEnabled) {
            calculateLegendOffsets(this.mOffsetsBuffer);
            RectF rectF = this.mOffsetsBuffer;
            float fG = rectF.left + 0.0f;
            float f = rectF.top + 0.0f;
            float fG2 = rectF.right + 0.0f;
            float f2 = rectF.bottom + 0.0f;
            if (this.mAxisLeft.p()) {
                fG += this.mAxisLeft.g(this.mAxisRendererLeft.getPaintAxisLabels());
            }
            if (this.mAxisRight.p()) {
                fG2 += this.mAxisRight.g(this.mAxisRendererRight.getPaintAxisLabels());
            }
            if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
                XAxis xAxis = this.mXAxis;
                float yOffset = xAxis.mLabelRotatedHeight + xAxis.getYOffset();
                if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                    f2 += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                    f += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                    f2 += yOffset;
                    f += yOffset;
                }
            }
            float extraTopOffset = f + getExtraTopOffset();
            float extraRightOffset = fG2 + getExtraRightOffset();
            float extraBottomOffset = f2 + getExtraBottomOffset();
            float extraLeftOffset = fG + getExtraLeftOffset();
            float fE = fmq.e(this.mMinOffset);
            this.mViewPortHandler.N(Math.max(fE, extraLeftOffset), Math.max(fE, extraTopOffset), Math.max(fE, extraRightOffset), Math.max(fE, extraBottomOffset));
            if (this.mLogEnabled) {
                StringBuilder sb = new StringBuilder();
                sb.append("offsetLeft: ");
                sb.append(extraLeftOffset);
                sb.append(", offsetTop: ");
                sb.append(extraTopOffset);
                sb.append(", offsetRight: ");
                sb.append(extraRightOffset);
                sb.append(", offsetBottom: ");
                sb.append(extraBottomOffset);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Content: ");
                sb2.append(this.mViewPortHandler.p().toString());
            }
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    public void centerViewTo(float f, float f2, YAxis.AxisDependency axisDependency) {
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.s();
        addViewportJob(z8g.b(this.mViewPortHandler, f - ((getXAxis().mAxisRange / this.mViewPortHandler.r()) / 2.0f), f2 + (axisRange / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void centerViewToAnimated(float f, float f2, YAxis.AxisDependency axisDependency, long j) {
        vye valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.h(), this.mViewPortHandler.j(), axisDependency);
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.s();
        addViewportJob(cc1.d(this.mViewPortHandler, f - ((getXAxis().mAxisRange / this.mViewPortHandler.r()) / 2.0f), f2 + (axisRange / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.c, (float) valuesByTouchPoint.d, j));
        vye.c(valuesByTouchPoint);
    }

    public void centerViewToY(float f, YAxis.AxisDependency axisDependency) {
        addViewportJob(z8g.b(this.mViewPortHandler, 0.0f, f + ((getAxisRange(axisDependency) / this.mViewPortHandler.s()) / 2.0f), getTransformer(axisDependency), this));
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof com.github.mikephil.charting.listener.a) {
            ((com.github.mikephil.charting.listener.a) chartTouchListener).f();
        }
    }

    public void drawGridBackground(Canvas canvas) {
        if (this.mDrawGridBackground) {
            canvas.drawRect(this.mViewPortHandler.p(), this.mGridBackgroundPaint);
        }
        if (this.mDrawBorders) {
            canvas.drawRect(this.mViewPortHandler.p(), this.mBorderPaint);
        }
    }

    public void fitScreen() {
        Matrix matrix = this.mFitScreenMatrixBuffer;
        this.mViewPortHandler.l(matrix);
        this.mViewPortHandler.L(matrix, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public YAxis getAxis(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft : this.mAxisRight;
    }

    public YAxis getAxisLeft() {
        return this.mAxisLeft;
    }

    public float getAxisRange(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft.mAxisRange : this.mAxisRight.mAxisRange;
    }

    public YAxis getAxisRight() {
        return this.mAxisRight;
    }

    @Override // com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public /* bridge */ /* synthetic */ a12 getData() {
        return (a12) super.getData();
    }

    public hpc getDataSetByTouchPoint(float f, float f2) {
        r7c highlightByTouchPoint = getHighlightByTouchPoint(f, f2);
        if (highlightByTouchPoint != null) {
            return (hpc) ((a12) this.mData).i(highlightByTouchPoint.d());
        }
        return null;
    }

    public f8h getDrawListener() {
        return null;
    }

    public Entry getEntryByTouchPoint(float f, float f2) {
        r7c highlightByTouchPoint = getHighlightByTouchPoint(f, f2);
        if (highlightByTouchPoint != null) {
            return ((a12) this.mData).n(highlightByTouchPoint);
        }
        return null;
    }

    @Override // defpackage.b12
    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).h(this.mViewPortHandler.i(), this.mViewPortHandler.f(), this.posForGetHighestVisibleX);
        return (float) Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.c);
    }

    @Override // defpackage.b12
    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).h(this.mViewPortHandler.h(), this.mViewPortHandler.f(), this.posForGetLowestVisibleX);
        return (float) Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.c);
    }

    @Override // com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public int getMaxVisibleCount() {
        return this.mMaxVisibleCount;
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Paint getPaint(int i) {
        Paint paint = super.getPaint(i);
        if (paint != null) {
            return paint;
        }
        if (i != 4) {
            return null;
        }
        return this.mGridBackgroundPaint;
    }

    public vye getPixelForValues(float f, float f2, YAxis.AxisDependency axisDependency) {
        return getTransformer(axisDependency).e(f, f2);
    }

    public wye getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        this.mGetPositionBuffer[0] = entry.getX();
        this.mGetPositionBuffer[1] = entry.getY();
        getTransformer(axisDependency).k(this.mGetPositionBuffer);
        float[] fArr = this.mGetPositionBuffer;
        return wye.c(fArr[0], fArr[1]);
    }

    public ttr getRendererLeftYAxis() {
        return this.mAxisRendererLeft;
    }

    public ttr getRendererRightYAxis() {
        return this.mAxisRendererRight;
    }

    public crr getRendererXAxis() {
        return this.mXAxisRenderer;
    }

    @Override // android.view.View
    public float getScaleX() {
        hwq hwqVar = this.mViewPortHandler;
        if (hwqVar == null) {
            return 1.0f;
        }
        return hwqVar.r();
    }

    @Override // android.view.View
    public float getScaleY() {
        hwq hwqVar = this.mViewPortHandler;
        if (hwqVar == null) {
            return 1.0f;
        }
        return hwqVar.s();
    }

    @Override // defpackage.b12
    public ryp getTransformer(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mLeftAxisTransformer : this.mRightAxisTransformer;
    }

    public vye getValuesByTouchPoint(float f, float f2, YAxis.AxisDependency axisDependency) {
        vye vyeVarB = vye.b(0.0d, 0.0d);
        getValuesByTouchPoint(f, f2, axisDependency, vyeVarB);
        return vyeVarB;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public float getYChartMax() {
        return Math.max(this.mAxisLeft.mAxisMaximum, this.mAxisRight.mAxisMaximum);
    }

    @Override // com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public float getYChartMin() {
        return Math.min(this.mAxisLeft.mAxisMinimum, this.mAxisRight.mAxisMinimum);
    }

    public boolean hasNoDragOffset() {
        return this.mViewPortHandler.v();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mAxisLeft = new YAxis(YAxis.AxisDependency.LEFT);
        this.mAxisRight = new YAxis(YAxis.AxisDependency.RIGHT);
        this.mLeftAxisTransformer = new ryp(this.mViewPortHandler);
        this.mRightAxisTransformer = new ryp(this.mViewPortHandler);
        this.mAxisRendererLeft = new ttr(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new ttr(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new crr(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setHighlighter(new gu3(this));
        this.mChartTouchListener = new com.github.mikephil.charting.listener.a(this, this.mViewPortHandler.q(), 3.0f);
        Paint paint = new Paint();
        this.mGridBackgroundPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mGridBackgroundPaint.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setColor(-16777216);
        this.mBorderPaint.setStrokeWidth(fmq.e(1.0f));
    }

    public boolean isAnyAxisInverted() {
        return this.mAxisLeft.o() || this.mAxisRight.o();
    }

    public boolean isAutoScaleMinMaxEnabled() {
        return this.mAutoScaleMinMaxEnabled;
    }

    public boolean isClipDataToContentEnabled() {
        return this.mClipDataToContent;
    }

    public boolean isClipValuesToContentEnabled() {
        return this.mClipValuesToContent;
    }

    public boolean isDoubleTapToZoomEnabled() {
        return this.mDoubleTapToZoomEnabled;
    }

    public boolean isDragEnabled() {
        return this.mDragXEnabled || this.mDragYEnabled;
    }

    public boolean isDragXEnabled() {
        return this.mDragXEnabled;
    }

    public boolean isDragYEnabled() {
        return this.mDragYEnabled;
    }

    public boolean isDrawBordersEnabled() {
        return this.mDrawBorders;
    }

    public boolean isFullyZoomedOut() {
        return this.mViewPortHandler.w();
    }

    public boolean isHighlightPerDragEnabled() {
        return this.mHighlightPerDragEnabled;
    }

    @Override // defpackage.b12
    public boolean isInverted(YAxis.AxisDependency axisDependency) {
        return getAxis(axisDependency).o();
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

    public void moveViewTo(float f, float f2, YAxis.AxisDependency axisDependency) {
        addViewportJob(z8g.b(this.mViewPortHandler, f, f2 + ((getAxisRange(axisDependency) / this.mViewPortHandler.s()) / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void moveViewToAnimated(float f, float f2, YAxis.AxisDependency axisDependency, long j) {
        vye valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.h(), this.mViewPortHandler.j(), axisDependency);
        addViewportJob(cc1.d(this.mViewPortHandler, f, f2 + ((getAxisRange(axisDependency) / this.mViewPortHandler.s()) / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.c, (float) valuesByTouchPoint.d, j));
        vye.c(valuesByTouchPoint);
    }

    public void moveViewToX(float f) {
        addViewportJob(z8g.b(this.mViewPortHandler, f, 0.0f, getTransformer(YAxis.AxisDependency.LEFT), this));
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            return;
        }
        dn5 dn5Var = this.mRenderer;
        if (dn5Var != null) {
            dn5Var.initBuffers();
        }
        calcMinMax();
        ttr ttrVar = this.mAxisRendererLeft;
        YAxis yAxis = this.mAxisLeft;
        ttrVar.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.o());
        ttr ttrVar2 = this.mAxisRendererRight;
        YAxis yAxis2 = this.mAxisRight;
        ttrVar2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum, yAxis2.o());
        crr crrVar = this.mXAxisRenderer;
        XAxis xAxis = this.mXAxis;
        crrVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        if (this.mLegend != null) {
            this.mLegendRenderer.a(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        drawGridBackground(canvas);
        if (this.mAutoScaleMinMaxEnabled) {
            autoScale();
        }
        if (this.mAxisLeft.isEnabled()) {
            ttr ttrVar = this.mAxisRendererLeft;
            YAxis yAxis = this.mAxisLeft;
            ttrVar.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.o());
        }
        if (this.mAxisRight.isEnabled()) {
            ttr ttrVar2 = this.mAxisRendererRight;
            YAxis yAxis2 = this.mAxisRight;
            ttrVar2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum, yAxis2.o());
        }
        if (this.mXAxis.isEnabled()) {
            crr crrVar = this.mXAxisRenderer;
            XAxis xAxis = this.mXAxis;
            crrVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        }
        this.mXAxisRenderer.renderAxisLine(canvas);
        this.mAxisRendererLeft.renderAxisLine(canvas);
        this.mAxisRendererRight.renderAxisLine(canvas);
        if (this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderGridLines(canvas);
        }
        if (this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderGridLines(canvas);
        }
        if (this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderGridLines(canvas);
        }
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        int iSave = canvas.save();
        if (isClipDataToContentEnabled()) {
            canvas.clipRect(this.mViewPortHandler.p());
        }
        this.mRenderer.drawData(canvas);
        if (!this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderGridLines(canvas);
        }
        if (!this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderGridLines(canvas);
        }
        if (!this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderGridLines(canvas);
        }
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        canvas.restoreToCount(iSave);
        this.mRenderer.drawExtras(canvas);
        if (this.mXAxis.isEnabled() && !this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && !this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && !this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        this.mAxisRendererLeft.renderAxisLabels(canvas);
        this.mAxisRendererRight.renderAxisLabels(canvas);
        if (isClipValuesToContentEnabled()) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.mViewPortHandler.p());
            this.mRenderer.drawValues(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            this.mRenderer.drawValues(canvas);
        }
        this.mLegendRenderer.e(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
        if (this.mLogEnabled) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            long j = this.totalTime + jCurrentTimeMillis2;
            this.totalTime = j;
            long j2 = this.drawCycles + 1;
            this.drawCycles = j2;
            StringBuilder sb = new StringBuilder();
            sb.append("Drawtime: ");
            sb.append(jCurrentTimeMillis2);
            sb.append(" ms, average: ");
            sb.append(j / j2);
            sb.append(" ms, cycles: ");
            sb.append(this.drawCycles);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.mOnSizeChangedBuffer;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.mKeepPositionOnRotation) {
            fArr[0] = this.mViewPortHandler.h();
            this.mOnSizeChangedBuffer[1] = this.mViewPortHandler.j();
            getTransformer(YAxis.AxisDependency.LEFT).j(this.mOnSizeChangedBuffer);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mKeepPositionOnRotation) {
            getTransformer(YAxis.AxisDependency.LEFT).k(this.mOnSizeChangedBuffer);
            this.mViewPortHandler.e(this.mOnSizeChangedBuffer, this);
        } else {
            hwq hwqVar = this.mViewPortHandler;
            hwqVar.L(hwqVar.q(), this, true);
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
        this.mRightAxisTransformer.l(this.mAxisRight.o());
        this.mLeftAxisTransformer.l(this.mAxisLeft.o());
    }

    public void prepareValuePxMatrix() {
        if (this.mLogEnabled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Preparing Value-Px Matrix, xmin: ");
            sb.append(this.mXAxis.mAxisMinimum);
            sb.append(", xmax: ");
            sb.append(this.mXAxis.mAxisMaximum);
            sb.append(", xdelta: ");
            sb.append(this.mXAxis.mAxisRange);
        }
        ryp rypVar = this.mRightAxisTransformer;
        XAxis xAxis = this.mXAxis;
        float f = xAxis.mAxisMinimum;
        float f2 = xAxis.mAxisRange;
        YAxis yAxis = this.mAxisRight;
        rypVar.m(f, f2, yAxis.mAxisRange, yAxis.mAxisMinimum);
        ryp rypVar2 = this.mLeftAxisTransformer;
        XAxis xAxis2 = this.mXAxis;
        float f3 = xAxis2.mAxisMinimum;
        float f4 = xAxis2.mAxisRange;
        YAxis yAxis2 = this.mAxisLeft;
        rypVar2.m(f3, f4, yAxis2.mAxisRange, yAxis2.mAxisMinimum);
    }

    public void resetTracking() {
        this.totalTime = 0L;
        this.drawCycles = 0L;
    }

    public void resetViewPortOffsets() {
        this.mCustomViewPortEnabled = false;
        calculateOffsets();
    }

    public void resetZoom() {
        this.mViewPortHandler.M(this.mZoomMatrixBuffer);
        this.mViewPortHandler.L(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.mAutoScaleMinMaxEnabled = z;
    }

    public void setBorderColor(int i) {
        this.mBorderPaint.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.mBorderPaint.setStrokeWidth(fmq.e(f));
    }

    public void setClipDataToContent(boolean z) {
        this.mClipDataToContent = z;
    }

    public void setClipValuesToContent(boolean z) {
        this.mClipValuesToContent = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.mDoubleTapToZoomEnabled = z;
    }

    public void setDragEnabled(boolean z) {
        this.mDragXEnabled = z;
        this.mDragYEnabled = z;
    }

    public void setDragOffsetX(float f) {
        this.mViewPortHandler.P(f);
    }

    public void setDragOffsetY(float f) {
        this.mViewPortHandler.Q(f);
    }

    public void setDragXEnabled(boolean z) {
        this.mDragXEnabled = z;
    }

    public void setDragYEnabled(boolean z) {
        this.mDragYEnabled = z;
    }

    public void setDrawBorders(boolean z) {
        this.mDrawBorders = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.mDrawGridBackground = z;
    }

    public void setGridBackgroundColor(int i) {
        this.mGridBackgroundPaint.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.mHighlightPerDragEnabled = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.mKeepPositionOnRotation = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.mMaxVisibleCount = i;
    }

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public void setOnDrawListener(f8h f8hVar) {
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setPaint(Paint paint, int i) {
        super.setPaint(paint, i);
        if (i != 4) {
            return;
        }
        this.mGridBackgroundPaint = paint;
    }

    public void setPinchZoom(boolean z) {
        this.mPinchZoomEnabled = z;
    }

    public void setRendererLeftYAxis(ttr ttrVar) {
        this.mAxisRendererLeft = ttrVar;
    }

    public void setRendererRightYAxis(ttr ttrVar) {
        this.mAxisRendererRight = ttrVar;
    }

    public void setScaleEnabled(boolean z) {
        this.mScaleXEnabled = z;
        this.mScaleYEnabled = z;
    }

    public void setScaleMinima(float f, float f2) {
        this.mViewPortHandler.V(f);
        this.mViewPortHandler.W(f2);
    }

    public void setScaleXEnabled(boolean z) {
        this.mScaleXEnabled = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.mScaleYEnabled = z;
    }

    public void setViewPortOffsets(float f, float f2, float f3, float f4) {
        this.mCustomViewPortEnabled = true;
        post(new a(f, f2, f3, f4));
    }

    public void setVisibleXRange(float f, float f2) {
        float f3 = this.mXAxis.mAxisRange;
        this.mViewPortHandler.T(f3 / f, f3 / f2);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.mViewPortHandler.V(this.mXAxis.mAxisRange / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.mViewPortHandler.R(this.mXAxis.mAxisRange / f);
    }

    public void setVisibleYRange(float f, float f2, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.U(getAxisRange(axisDependency) / f, getAxisRange(axisDependency) / f2);
    }

    public void setVisibleYRangeMaximum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.W(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRangeMinimum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.S(getAxisRange(axisDependency) / f);
    }

    public void setXAxisRenderer(crr crrVar) {
        this.mXAxisRenderer = crrVar;
    }

    public void zoom(float f, float f2, float f3, float f4) {
        this.mViewPortHandler.Z(f, f2, f3, -f4, this.mZoomMatrixBuffer);
        this.mViewPortHandler.L(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    @TargetApi(11)
    public void zoomAndCenterAnimated(float f, float f2, float f3, float f4, YAxis.AxisDependency axisDependency, long j) {
        vye valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.h(), this.mViewPortHandler.j(), axisDependency);
        addViewportJob(hc1.d(this.mViewPortHandler, this, getTransformer(axisDependency), getAxis(axisDependency), this.mXAxis.mAxisRange, f, f2, this.mViewPortHandler.r(), this.mViewPortHandler.s(), f3, f4, (float) valuesByTouchPoint.c, (float) valuesByTouchPoint.d, j));
        vye.c(valuesByTouchPoint);
    }

    public void zoomIn() {
        wye wyeVarO = this.mViewPortHandler.o();
        this.mViewPortHandler.b0(wyeVarO.c, -wyeVarO.d, this.mZoomMatrixBuffer);
        this.mViewPortHandler.L(this.mZoomMatrixBuffer, this, false);
        wye.f(wyeVarO);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomOut() {
        wye wyeVarO = this.mViewPortHandler.o();
        this.mViewPortHandler.c0(wyeVarO.c, -wyeVarO.d, this.mZoomMatrixBuffer);
        this.mViewPortHandler.L(this.mZoomMatrixBuffer, this, false);
        wye.f(wyeVarO);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomToCenter(float f, float f2) {
        wye centerOffsets = getCenterOffsets();
        Matrix matrix = this.mZoomMatrixBuffer;
        this.mViewPortHandler.Z(f, f2, centerOffsets.c, -centerOffsets.d, matrix);
        this.mViewPortHandler.L(matrix, this, false);
    }

    public void getValuesByTouchPoint(float f, float f2, YAxis.AxisDependency axisDependency, vye vyeVar) {
        getTransformer(axisDependency).h(f, f2, vyeVar);
    }

    public void zoom(float f, float f2, float f3, float f4, YAxis.AxisDependency axisDependency) {
        addViewportJob(m1s.b(this.mViewPortHandler, f, f2, f3, f4, getTransformer(axisDependency), axisDependency, this));
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragXEnabled = true;
        this.mDragYEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mClipDataToContent = true;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = vye.b(0.0d, 0.0d);
        this.posForGetHighestVisibleX = vye.b(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragXEnabled = true;
        this.mDragYEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mClipDataToContent = true;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = vye.b(0.0d, 0.0d);
        this.posForGetHighestVisibleX = vye.b(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }
}
