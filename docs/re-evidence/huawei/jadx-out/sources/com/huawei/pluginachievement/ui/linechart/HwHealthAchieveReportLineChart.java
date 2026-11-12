package com.huawei.pluginachievement.ui.linechart;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.R;
import defpackage.izn;
import defpackage.ozg;
import defpackage.ozh;
import defpackage.ozl;
import defpackage.ozo;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class HwHealthAchieveReportLineChart extends LineChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Bitmap> f22239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f22240c;
    private boolean d;
    private ozh e;
    private int f;
    private HwHealthAchieveReportMarkView g;
    private Canvas h;
    private GradientDrawable i;
    private int j;
    private RectF k;
    private int l;
    private int m;
    private OnSingleTapListener n;
    private float[] o;
    private float r;
    private float t;

    public interface OnSingleTapListener {
        void onSingleTap(int i);
    }

    public HwHealthAchieveReportLineChart(Context context) {
        super(context);
        this.l = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);
        this.j = Color.parseColor("#FFFDB290");
        this.f = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);
        this.e = new ozh();
        this.t = 0.0f;
        this.f22240c = 0.0f;
        this.m = 1;
        this.d = true;
        this.r = 0.0f;
        this.f22238a = 0.0f;
        this.f22239b = null;
        this.k = new RectF();
        a();
    }

    public HwHealthAchieveReportLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);
        this.j = Color.parseColor("#FFFDB290");
        this.f = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);
        this.e = new ozh();
        this.t = 0.0f;
        this.f22240c = 0.0f;
        this.m = 1;
        this.d = true;
        this.r = 0.0f;
        this.f22238a = 0.0f;
        this.f22239b = null;
        this.k = new RectF();
        a();
    }

    public HwHealthAchieveReportLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);
        this.j = Color.parseColor("#FFFDB290");
        this.f = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);
        this.e = new ozh();
        this.t = 0.0f;
        this.f22240c = 0.0f;
        this.m = 1;
        this.d = true;
        this.r = 0.0f;
        this.f22238a = 0.0f;
        this.f22239b = null;
        this.k = new RectF();
        a();
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        if (getContext() == null) {
            LogUtil.a("event", "context is null");
        }
        this.mXAxisRenderer = new ozo(this.mViewPortHandler, getXAxis(), this.mLeftAxisTransformer);
        this.mRenderer = new ozl(this, this.mAnimator, this.mViewPortHandler);
    }

    public void setMyMarkView(HwHealthAchieveReportMarkView hwHealthAchieveReportMarkView) {
        this.g = hwHealthAchieveReportMarkView;
        setMarker(hwHealthAchieveReportMarkView);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            float f = this.r;
            if (x < f) {
                d(f);
                this.g.d(this.r);
                float[] fArr = this.o;
                if (fArr != null && fArr.length > 1) {
                    d(fArr[0]);
                }
            } else {
                float f2 = this.f22238a;
                if (x > f2) {
                    d(f2);
                    this.g.d(this.f22238a);
                    float[] fArr2 = this.o;
                    if (fArr2 != null && fArr2.length > 1) {
                        d(fArr2[fArr2.length - 2]);
                    }
                } else {
                    d(x);
                    int iC = c(x) * 2;
                    float[] fArr3 = this.o;
                    if (fArr3 != null && iC < fArr3.length) {
                        d(fArr3[iC]);
                    }
                    this.g.d(x);
                }
            }
            this.n.onSingleTap(c(x));
            if (this.mChartTouchListener == null || this.mData == 0 || !this.mTouchEnabled) {
                return false;
            }
            return this.mChartTouchListener.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 1 && x > this.r && x < this.f22238a) {
            this.t = this.g.getmMarkDrawX();
            int iC2 = c(x) * 2;
            float[] fArr4 = this.o;
            if (fArr4 != null && iC2 < fArr4.length) {
                this.f22240c = fArr4[iC2];
                d();
            }
        }
        return false;
    }

    private void getRange() {
        if (this.mRenderer instanceof ozl) {
            this.r = ((ozl) this.mRenderer).e();
            float fA = ((ozl) this.mRenderer).a() == 0.0f ? this.r : ((ozl) this.mRenderer).a();
            this.f22238a = fA;
            LogUtil.a("PLGACHIEVE_HwHealthAchieveReportLineChart", "startPoint = ", Float.valueOf(this.r), "endPoint=", Float.valueOf(fA));
        }
    }

    private int c(float f) {
        float f2 = this.r;
        float f3 = this.f22238a;
        if (f2 == f3 || f <= 0.0f) {
            return 0;
        }
        if (f >= f3) {
            return this.m;
        }
        int i = this.m;
        return Math.min((int) (((f - f2) / ((f3 - f2) / i)) + 0.5f), i);
    }

    private void c() {
        this.o = new float[this.mXAxis.mEntryCount * 2];
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = 0;
        while (true) {
            float[] fArr = this.o;
            if (i >= fArr.length) {
                this.mLeftAxisTransformer.pointValuesToPixel(this.o);
                return;
            }
            if (zIsCenterAxisLabelsEnabled) {
                fArr[i] = this.mXAxis.mCenteredEntries[i / 2];
            } else {
                fArr[i] = this.mXAxis.mEntries[i / 2];
            }
            i += 2;
        }
    }

    void b() {
        if (this.d) {
            getRange();
            this.d = false;
            if (LanguageUtil.ba(getContext())) {
                d(this.r);
                this.g.d(this.r);
            } else {
                d(this.f22238a);
                this.g.d(this.f22238a);
            }
        }
    }

    private void a() {
        e();
    }

    private void e() {
        getDescription().setEnabled(false);
        setPinchZoom(false);
        setDrawBorders(false);
        setTouchEnabled(true);
        setDragEnabled(true);
        setScaleEnabled(false);
        setLogEnabled(false);
        getLegend().setEnabled(false);
        e(BaseApplication.getContext().getResources().getColor(R.color.colorBackground), BaseApplication.getContext().getResources().getColor(R.color.colorBackground));
    }

    public void b(int i, int i2, int i3) {
        this.l = i;
        this.j = i2;
        this.f = i3;
    }

    public void setChartData(Context context, ArrayList<String> arrayList, ArrayList<Entry> arrayList2, boolean z, boolean z2) {
        if (arrayList == null || arrayList2 == null) {
            return;
        }
        if (z && !z2) {
            this.mLeftAxisTransformer = new ozg(this.mViewPortHandler, this);
            this.mXAxisRenderer = new ozo(this.mViewPortHandler, getXAxis(), this.mLeftAxisTransformer);
        }
        this.m = arrayList2.size() - 1 == 0 ? 1 : arrayList2.size() - 1;
        XAxis xAxis = getXAxis();
        xAxis.setGranularity(1.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setGridLineWidth(0.5f);
        xAxis.setDrawLimitLinesBehindData(true);
        xAxis.setTextColor(context.getResources().getColor(R.color.textColorTertiary));
        xAxis.setTextSize(10.0f);
        xAxis.setDrawAxisLine(false);
        xAxis.setYOffset(10.0f);
        getAxisRight().setEnabled(false);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setEnabled(false);
        axisLeft.setDrawLabels(false);
        axisLeft.setStartAtZero(false);
        axisLeft.setSpaceTop(12.0f);
        axisLeft.setDrawGridLines(false);
        ArrayList<String> arrayList3 = new ArrayList<>(16);
        b(arrayList3, arrayList);
        e(xAxis, arrayList3);
        d(context, arrayList2, z, z2);
    }

    private static void e(XAxis xAxis, final List<String> list) {
        if (list == null) {
            return;
        }
        final int size = list.size();
        xAxis.setValueFormatter(new IAxisValueFormatter() { // from class: com.huawei.pluginachievement.ui.linechart.HwHealthAchieveReportLineChart.4
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                int i = (int) f;
                if (i < 0 || i >= size) {
                    return "";
                }
                return (String) list.get(i);
            }
        });
    }

    private void d(Context context, ArrayList<Entry> arrayList, boolean z, boolean z2) {
        ArrayList arrayList2 = new ArrayList(16);
        LineDataSet lineDataSetB = b(context, 1, arrayList, z, z2);
        if (lineDataSetB != null) {
            arrayList2.add(lineDataSetB);
        }
        LogUtil.a("dataSets", "size=", Integer.valueOf(arrayList2.size()));
        setData(new LineData(arrayList2));
        highlightValues(new Highlight[]{getHighlightByTouchPoint(919.50006f, 864.0f)});
    }

    private LineDataSet b(Context context, int i, List<Entry> list, boolean z, final boolean z2) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.disableDashedLine();
        if (z) {
            lineDataSet.setValueFormatter(new IValueFormatter() { // from class: com.huawei.pluginachievement.ui.linechart.HwHealthAchieveReportLineChart.5
                @Override // com.github.mikephil.charting.formatter.IValueFormatter
                public String getFormattedValue(float f, Entry entry, int i2, ViewPortHandler viewPortHandler) {
                    if (z2) {
                        return UnitUtil.e(f, 1, 2);
                    }
                    return izn.a(f);
                }
            });
        } else {
            lineDataSet.setValueFormatter(new IValueFormatter() { // from class: com.huawei.pluginachievement.ui.linechart.HwHealthAchieveReportLineChart.3
                @Override // com.github.mikephil.charting.formatter.IValueFormatter
                public String getFormattedValue(float f, Entry entry, int i2, ViewPortHandler viewPortHandler) {
                    return UnitUtil.e(f, 1, 2);
                }
            });
        }
        return d(context, lineDataSet, i);
    }

    private LineDataSet d(Context context, LineDataSet lineDataSet, int i) {
        if (i == 1) {
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setColor(this.l);
            lineDataSet.setDrawCircles(true);
            lineDataSet.setCircleColor(this.l);
            lineDataSet.setDrawCircleHole(true);
            lineDataSet.setValueTextSize(10.0f);
            lineDataSet.setValueTextColor(context.getResources().getColor(R.color.textColorTertiary));
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(context.getResources().getDrawable(R.drawable.report_line_chart_shadow_run));
            return lineDataSet;
        }
        if (i == 2) {
            lineDataSet.setColor(this.j);
            lineDataSet.setLineWidth(3.0f);
            lineDataSet.setDrawCircles(true);
            lineDataSet.setCircleColor(this.j);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setValueTextSize(10.0f);
            lineDataSet.setValueTextColor(this.j);
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(context.getResources().getDrawable(R.drawable.report_line_chart_shadow_run));
            return lineDataSet;
        }
        if (i != 3) {
            return lineDataSet;
        }
        lineDataSet.setColor(this.f);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.enableDashedLine(10.0f, 10.0f, 0.0f);
        lineDataSet.setDrawCircles(true);
        lineDataSet.setCircleColor(this.f);
        lineDataSet.setDrawCircleHole(true);
        lineDataSet.setValueTextSize(10.0f);
        lineDataSet.setValueTextColor(context.getResources().getColor(R.color.textColorTertiary));
        return lineDataSet;
    }

    private void b(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        arrayList.addAll(arrayList2);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        calculateLegendOffsets(this.k);
        float fConvertDpToPixel = Utils.convertDpToPixel(16.0f) + this.k.left;
        float fConvertDpToPixel2 = Utils.convertDpToPixel(50.0f) + this.k.top;
        float fConvertDpToPixel3 = Utils.convertDpToPixel(16.0f) + this.k.right;
        float fConvertDpToPixel4 = Utils.convertDpToPixel(50.0f) + this.k.bottom;
        if (this.mAxisLeft.needsOffset()) {
            fConvertDpToPixel += this.mAxisLeft.getRequiredWidthSpace(this.mAxisRendererLeft.getPaintAxisLabels());
        }
        if (this.mAxisRight.needsOffset()) {
            fConvertDpToPixel3 += this.mAxisRight.getRequiredWidthSpace(this.mAxisRendererRight.getPaintAxisLabels());
        }
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float yOffset = this.mXAxis.mLabelHeight + this.mXAxis.getYOffset();
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                fConvertDpToPixel4 += yOffset;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                fConvertDpToPixel2 += yOffset;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                fConvertDpToPixel4 += yOffset;
                fConvertDpToPixel2 += yOffset;
            } else {
                LogUtil.d("PLGACHIEVE_HwHealthAchieveReportLineChart", "calculateOffsets position is not matching");
            }
        }
        float extraTopOffset = getExtraTopOffset();
        float extraRightOffset = getExtraRightOffset();
        float extraBottomOffset = getExtraBottomOffset();
        float extraLeftOffset = getExtraLeftOffset();
        float fConvertDpToPixel5 = Utils.convertDpToPixel(this.mMinOffset);
        this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel5, fConvertDpToPixel + extraLeftOffset), Math.max(fConvertDpToPixel5, fConvertDpToPixel2 + extraTopOffset), Math.max(fConvertDpToPixel5, fConvertDpToPixel3 + extraRightOffset), Math.max(fConvertDpToPixel5, fConvertDpToPixel4 + extraBottomOffset));
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    private boolean c(Bitmap bitmap, int i, int i2) {
        return bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        LogUtil.a("PLGACHIEVE_HwHealthAchieveReportLineChart", "line onDraw");
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.f22239b;
        Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
        if (!c(bitmapCreateBitmap, chartWidth, chartHeight)) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_8888);
            this.f22239b = new WeakReference<>(bitmapCreateBitmap);
            this.h = new Canvas(bitmapCreateBitmap);
        }
        if (bitmapCreateBitmap == null) {
            return;
        }
        bitmapCreateBitmap.eraseColor(0);
        b(this.h);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
    }

    private void b(Canvas canvas) {
        if (this.d && this.mData != 0) {
            float[] fArr = {((LineData) this.mData).getXMax(), 0.0f};
            this.mLeftAxisTransformer.pointValuesToPixel(fArr);
            d(fArr[0]);
            d(fArr[0]);
            c();
        }
        if (this.mData == 0) {
            return;
        }
        calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        drawGridBackground(canvas);
        e(canvas);
        if (this.mAutoScaleMinMaxEnabled) {
            autoScale();
        }
        if (this.mAxisLeft.isEnabled()) {
            this.mAxisRendererLeft.computeAxis(this.mAxisLeft.mAxisMinimum, this.mAxisLeft.mAxisMaximum, this.mAxisLeft.isInverted());
        }
        if (this.mAxisRight.isEnabled()) {
            this.mAxisRendererRight.computeAxis(this.mAxisRight.mAxisMinimum, this.mAxisRight.mAxisMaximum, this.mAxisRight.isInverted());
        }
        if (this.mXAxis.isEnabled()) {
            this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
        }
        this.mXAxisRenderer.renderAxisLine(canvas);
        this.mAxisRendererLeft.renderAxisLine(canvas);
        this.mAxisRendererRight.renderAxisLine(canvas);
        this.mXAxisRenderer.renderGridLines(canvas);
        this.mAxisRendererLeft.renderGridLines(canvas);
        this.mAxisRendererRight.renderGridLines(canvas);
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        c(canvas);
    }

    private void c(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipRect(this.mViewPortHandler.getContentRect());
        this.mRenderer.drawData(canvas);
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
            canvas.clipRect(this.mViewPortHandler.getContentRect());
            this.mRenderer.drawValues(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            this.mRenderer.drawValues(canvas);
        }
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setOnSingleTapListener(OnSingleTapListener onSingleTapListener) {
        this.n = onSingleTapListener;
    }

    private void e(Canvas canvas) {
        GradientDrawable gradientDrawable = this.i;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setBounds(0, 0, (int) this.mViewPortHandler.getChartWidth(), (int) (this.mViewPortHandler.contentBottom() + this.mXAxis.getYOffset() + Utils.convertDpToPixel(40.0f)));
        this.i.draw(canvas);
    }

    private void e(int i, int i2) {
        this.i = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2});
    }

    public void d() {
        this.e.e(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.pluginachievement.ui.linechart.HwHealthAchieveReportLineChart.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fE = HwHealthAchieveReportLineChart.this.e.e();
                HwHealthAchieveReportLineChart hwHealthAchieveReportLineChart = HwHealthAchieveReportLineChart.this;
                hwHealthAchieveReportLineChart.b(hwHealthAchieveReportLineChart.t + ((HwHealthAchieveReportLineChart.this.f22240c - HwHealthAchieveReportLineChart.this.t) * fE));
            }
        }, 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        d(f);
        this.g.d(f);
        invalidate();
    }

    private void d(double d) {
        if (this.mXAxisRenderer instanceof ozo) {
            ((ozo) this.mXAxisRenderer).e(d);
        }
    }

    private void d(float f) {
        if (this.mXAxisRenderer instanceof ozo) {
            ((ozo) this.mXAxisRenderer).c(f);
        }
    }
}
