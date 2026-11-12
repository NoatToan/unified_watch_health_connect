package com.huawei.ui.commonui.linechart.combinedchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener;
import com.huawei.ui.commonui.linechart.icommon.HwHealthCombinedDataProvider;
import com.huawei.ui.commonui.linechart.utils.CustomChartTitleBar;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import defpackage.njy;
import defpackage.qlu;
import defpackage.qlv;
import defpackage.qlw;
import defpackage.qly;
import defpackage.qmb;
import defpackage.qmc;
import defpackage.qmd;
import defpackage.qmh;
import defpackage.qml;
import defpackage.qnm;
import defpackage.qnt;
import defpackage.qoa;
import defpackage.qqn;
import defpackage.qqv;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthBaseCombinedChart extends HwHealthBaseScrollBarLineChart<qmc> implements HwHealthCombinedDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataParser f23595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f23596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomChartTitleBar f23597c;
    protected DrawOrder[] d;
    private Context e;
    private boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private DataParser j;
    private boolean k;
    private TimeValueMode l;
    private int m;
    private int n;
    private ViewTreeObserver.OnGlobalLayoutListener o;
    private int p;
    private HwHealthBarLineChartTouchListener.OnScaleListener q;
    private OnDoubleTapListener s;
    private OnSingleTapConfirmedListener t;

    public interface DataParser {
        boolean isSupportOverlaying();

        boolean isSupportSampling();

        void onOverlaying(List<HwHealthBaseEntry> list, HwHealthLineDataSet hwHealthLineDataSet);

        int onSampling(List<HwHealthBaseEntry> list, int i, HwHealthLineDataSet hwHealthLineDataSet);
    }

    public enum DrawOrder {
        BAR,
        LINE,
        POINT
    }

    /* JADX INFO: loaded from: classes43.dex */
    public interface OnDoubleTapListener {
        boolean isOnDoubleTap(MotionEvent motionEvent);
    }

    public interface OnSingleTapConfirmedListener {
        boolean isOnSingleTapConfirmed(MotionEvent motionEvent);
    }

    public enum TimeValueMode {
        DEFAULT,
        MINUTES,
        METERS,
        KILOMETERS
    }

    public HwHealthBaseCombinedChart(Context context) {
        super(context);
        this.f23596b = false;
        this.i = 0L;
        this.p = 0;
        this.f23597c = null;
        this.l = TimeValueMode.DEFAULT;
        this.m = qqn.b(BaseApplication.getContext(), R.color.textColorSecondary);
        this.n = qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color);
        this.g = true;
        this.f = false;
        this.s = null;
        this.t = null;
        this.h = false;
        e eVar = new e();
        this.j = eVar;
        this.k = true;
        this.f23595a = eVar;
        this.o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                HwHealthBaseCombinedChart.this.post(new Runnable() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.5.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (HwHealthBaseCombinedChart.this.e == null) {
                            return;
                        }
                        HwHealthBaseCombinedChart.this.p = (int) (qqv.d(HwHealthBaseCombinedChart.this.e) / (HwHealthBaseCombinedChart.this.e.getResources().getDisplayMetrics().density * 3.0f));
                        HwHealthBaseCombinedChart.this.c(HwHealthBaseCombinedChart.this.p);
                        HwHealthBaseCombinedChart.this.getViewTreeObserver().removeOnGlobalLayoutListener(HwHealthBaseCombinedChart.this.o);
                    }
                });
            }
        };
        this.q = new HwHealthBarLineChartTouchListener.OnScaleListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.3
            @Override // com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener.OnScaleListener
            public void onScale(float f) {
                LogUtil.a("HealthChart_HwHealthBaseCombinedChart", "width:", Integer.valueOf(HwHealthBaseCombinedChart.this.getWidth()), " scaleX:", Float.valueOf(f));
                if (HwHealthBaseCombinedChart.this.e != null) {
                    HwHealthBaseCombinedChart.this.c((int) ((qqv.d(HwHealthBaseCombinedChart.this.e) * f) / (HwHealthBaseCombinedChart.this.e.getResources().getDisplayMetrics().density * 3.0f)));
                    return;
                }
                LogUtil.e("HealthChart_HwHealthBaseCombinedChart", "mContext is null,pls check");
            }
        };
        d();
    }

    public HwHealthBaseCombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23596b = false;
        this.i = 0L;
        this.p = 0;
        this.f23597c = null;
        this.l = TimeValueMode.DEFAULT;
        this.m = qqn.b(BaseApplication.getContext(), R.color.textColorSecondary);
        this.n = qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color);
        this.g = true;
        this.f = false;
        this.s = null;
        this.t = null;
        this.h = false;
        e eVar = new e();
        this.j = eVar;
        this.k = true;
        this.f23595a = eVar;
        this.o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                HwHealthBaseCombinedChart.this.post(new Runnable() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.5.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (HwHealthBaseCombinedChart.this.e == null) {
                            return;
                        }
                        HwHealthBaseCombinedChart.this.p = (int) (qqv.d(HwHealthBaseCombinedChart.this.e) / (HwHealthBaseCombinedChart.this.e.getResources().getDisplayMetrics().density * 3.0f));
                        HwHealthBaseCombinedChart.this.c(HwHealthBaseCombinedChart.this.p);
                        HwHealthBaseCombinedChart.this.getViewTreeObserver().removeOnGlobalLayoutListener(HwHealthBaseCombinedChart.this.o);
                    }
                });
            }
        };
        this.q = new HwHealthBarLineChartTouchListener.OnScaleListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.3
            @Override // com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener.OnScaleListener
            public void onScale(float f) {
                LogUtil.a("HealthChart_HwHealthBaseCombinedChart", "width:", Integer.valueOf(HwHealthBaseCombinedChart.this.getWidth()), " scaleX:", Float.valueOf(f));
                if (HwHealthBaseCombinedChart.this.e != null) {
                    HwHealthBaseCombinedChart.this.c((int) ((qqv.d(HwHealthBaseCombinedChart.this.e) * f) / (HwHealthBaseCombinedChart.this.e.getResources().getDisplayMetrics().density * 3.0f)));
                    return;
                }
                LogUtil.e("HealthChart_HwHealthBaseCombinedChart", "mContext is null,pls check");
            }
        };
        d();
    }

    public HwHealthBaseCombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23596b = false;
        this.i = 0L;
        this.p = 0;
        this.f23597c = null;
        this.l = TimeValueMode.DEFAULT;
        this.m = qqn.b(BaseApplication.getContext(), R.color.textColorSecondary);
        this.n = qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color);
        this.g = true;
        this.f = false;
        this.s = null;
        this.t = null;
        this.h = false;
        e eVar = new e();
        this.j = eVar;
        this.k = true;
        this.f23595a = eVar;
        this.o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                HwHealthBaseCombinedChart.this.post(new Runnable() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.5.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (HwHealthBaseCombinedChart.this.e == null) {
                            return;
                        }
                        HwHealthBaseCombinedChart.this.p = (int) (qqv.d(HwHealthBaseCombinedChart.this.e) / (HwHealthBaseCombinedChart.this.e.getResources().getDisplayMetrics().density * 3.0f));
                        HwHealthBaseCombinedChart.this.c(HwHealthBaseCombinedChart.this.p);
                        HwHealthBaseCombinedChart.this.getViewTreeObserver().removeOnGlobalLayoutListener(HwHealthBaseCombinedChart.this.o);
                    }
                });
            }
        };
        this.q = new HwHealthBarLineChartTouchListener.OnScaleListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.3
            @Override // com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener.OnScaleListener
            public void onScale(float f) {
                LogUtil.a("HealthChart_HwHealthBaseCombinedChart", "width:", Integer.valueOf(HwHealthBaseCombinedChart.this.getWidth()), " scaleX:", Float.valueOf(f));
                if (HwHealthBaseCombinedChart.this.e != null) {
                    HwHealthBaseCombinedChart.this.c((int) ((qqv.d(HwHealthBaseCombinedChart.this.e) * f) / (HwHealthBaseCombinedChart.this.e.getResources().getDisplayMetrics().density * 3.0f)));
                    return;
                }
                LogUtil.e("HealthChart_HwHealthBaseCombinedChart", "mContext is null,pls check");
            }
        };
        d();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.d = new DrawOrder[]{DrawOrder.BAR, DrawOrder.LINE, DrawOrder.POINT};
        setHighlighter(new qmd(this, this));
        setHighlightFullBarEnabled(true);
        this.mRenderer = new HwHealthBaseCombinedChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.k) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setXAxisValueFormatter(IAxisValueFormatter iAxisValueFormatter) {
        XAxis xAxis = getXAxis();
        if (xAxis == null) {
            LogUtil.j("HealthChart_HwHealthBaseCombinedChart", "setValueFormatter failed, cause");
        } else {
            xAxis.setValueFormatter(iAxisValueFormatter);
            invalidate();
        }
    }

    private void d() {
        this.e = getContext();
        setLayerType(1, null);
        this.mLegend.setXOffset(0.0f);
        setTouchEnabled(true);
        setDragEnabled(true);
        setScaleEnabled(true);
        setScaleYEnabled(false);
        setDoubleTapToZoomEnabled(false);
        setMaximumScaleX(4.0f);
        setDrawGridBackground(true);
        setGridBackgroundColor(Color.argb(0, 0, 0, 0));
        qnm.b(getContext(), getLegend());
        this.mLegendRenderer = new qoa(this.e, this, this.mViewPortHandler, this.mLegend);
        setDrawBorders(false);
        i();
        setExtraTopOffset(13.0f);
        setMaxHighlightDistance(1000.0f);
        e();
        if (this.mChartTouchListener instanceof HwHealthBarLineChartTouchListener) {
            ((HwHealthBarLineChartTouchListener) this.mChartTouchListener).e(this.q);
        }
        a();
        XAxis xAxis = getXAxis();
        xAxis.setAxisLineWidth(0.5f);
        xAxis.setAxisLineColor(-7829368);
        xAxis.setDrawGridLines(false);
        xAxis.setTextColor(this.m);
        xAxis.setTextSize(10.0f);
        if (this.l == TimeValueMode.MINUTES) {
            xAxis.setValueFormatter(new qmb());
        } else if (this.l == TimeValueMode.METERS) {
            xAxis.setValueFormatter(new qlw());
        } else if (this.l == TimeValueMode.KILOMETERS) {
            xAxis.setValueFormatter(new qlv());
        } else {
            xAxis.setValueFormatter(new qlu());
        }
        xAxis.setAxisMinimum(0.0f);
        HwHealthMarkerView hwHealthMarkerView = new HwHealthMarkerView(this.e, R.layout.custom_marker_view, this);
        hwHealthMarkerView.setChartView(this);
        setMarker(hwHealthMarkerView);
        getLegend().setEnabled(true);
        setVisibility(8);
        acquireLayout().m(Utils.convertDpToPixel(20.0f)).b(Utils.convertDpToPixel(24.0f)).i(Utils.convertDpToPixel(0.0f));
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void clipDataArea(Canvas canvas) {
        RectF rectF = new RectF(this.mViewPortHandler.getContentRect());
        rectF.top -= this.mXAxis.getYOffset();
        rectF.bottom += this.mXAxis.getYOffset();
        rectF.left -= Utils.convertDpToPixel(5.0f);
        rectF.right += Utils.convertDpToPixel(5.0f);
        canvas.clipRect(rectF);
    }

    private void i() {
        getDescription().setEnabled(true);
        getDescription().setText(getResources().getString(R.string.IDS_hwh_motiontrack_detail_chart_time));
        if (!qmh.e(this.e)) {
            getDescription().setTextAlign(Paint.Align.RIGHT);
        } else {
            getDescription().setTextAlign(Paint.Align.LEFT);
        }
        getDescription().setTextSize(10.0f);
        getDescription().setTextColor(this.m);
    }

    protected void e() {
        final GestureDetector gestureDetector = new GestureDetector(this.e, new GestureDetector.SimpleOnGestureListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (HwHealthBaseCombinedChart.this.s == null) {
                    return false;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(jElapsedRealtime - HwHealthBaseCombinedChart.this.i) < 2300) {
                    return false;
                }
                HwHealthBaseCombinedChart.this.i = jElapsedRealtime;
                return HwHealthBaseCombinedChart.this.s.isOnDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (HwHealthBaseCombinedChart.this.t == null) {
                    return false;
                }
                return HwHealthBaseCombinedChart.this.t.isOnSingleTapConfirmed(motionEvent);
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!HwHealthBaseCombinedChart.this.mTouchEnabled) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }
                return HwHealthBaseCombinedChart.this.onTouchEvent(motionEvent);
            }
        });
    }

    public void setMaximumScaleX(float f) {
        this.mViewPortHandler.setMaximumScaleX(f);
    }

    public void setAvoidFirstLastClipping(boolean z) {
        this.mXAxis.setAvoidFirstLastClipping(z);
    }

    public void setLabelColor(int i) {
        this.m = Color.argb(128, Color.red(i), Color.green(i), Color.blue(i));
        getDescription().setTextColor(this.m);
        getXAxis().setTextColor(this.m);
        this.mAxisFirstParty.setTextColor(this.m);
        this.mAxisSecondParty.setTextColor(this.m);
        this.mLegend.setTextColor(this.m);
        this.n = Color.argb(51, Color.red(i), Color.green(i), Color.blue(i));
        this.mAxisFirstParty.setGridColor(this.n);
    }

    private void a() {
        this.mAxisFirstParty.setDrawAxisLine(false);
        this.mAxisFirstParty.setAxisLineWidth(0.5f);
        this.mAxisFirstParty.setAxisLineColor(Color.argb(127, 0, 0, 0));
        this.mAxisFirstParty.setDrawGridLines(true);
        this.mAxisFirstParty.setGridColor(this.n);
        this.mAxisFirstParty.setGridLineWidth(0.5f);
        this.mAxisFirstParty.setTextColor(this.m);
        this.mAxisFirstParty.setTextSize(10.0f);
        this.mAxisFirstParty.setLabelCount(5, true);
        this.mAxisSecondParty.setDrawAxisLine(false);
        this.mAxisSecondParty.setAxisLineWidth(0.5f);
        this.mAxisSecondParty.setAxisLineColor(-7829368);
        this.mAxisSecondParty.setDrawGridLines(false);
        this.mAxisSecondParty.setTextColor(this.m);
        this.mAxisSecondParty.setTextSize(10.0f);
        this.mAxisSecondParty.setLabelCount(5, true);
    }

    public void setYRenderFillArea(List<qml> list) {
        this.mAxisRendererFirstParty.a(list);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthCombinedDataProvider
    public qmc getCombinedData() {
        return (qmc) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(qmc qmcVar) {
        super.setData(qmcVar);
        setHighlighter(new qmd(this, this));
        if (this.mRenderer instanceof HwHealthBaseCombinedChartRenderer) {
            ((HwHealthBaseCombinedChartRenderer) this.mRenderer).b();
            this.mRenderer.initBuffers();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            LogUtil.e(Chart.LOG_TAG, "Can't select by touch. No data set.");
            return null;
        }
        Highlight highlight = getHighlighter().getHighlight(f, f2);
        return (highlight == null || !isHighlightFullBarEnabled()) ? highlight : new Highlight(highlight.getX(), highlight.getY(), highlight.getXPx(), highlight.getYPx(), highlight.getDataSetIndex(), -1, highlight.getAxis());
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void drawDescription(Canvas canvas) {
        float fConvertDpToPixel;
        if (this.mDescription == null || !this.mDescription.isEnabled()) {
            return;
        }
        this.mDescPaint.setTypeface(this.mDescription.getTypeface());
        this.mDescPaint.setTextSize(this.mDescription.getTextSize());
        this.mDescPaint.setColor(this.mDescription.getTextColor());
        this.mDescPaint.setTextAlign(this.mDescription.getTextAlign());
        if (!qmh.e(getContext())) {
            this.mDescPaint.setTextAlign(Paint.Align.RIGHT);
            fConvertDpToPixel = getWidth() - Utils.convertDpToPixel(1.0f);
        } else {
            this.mDescPaint.setTextAlign(Paint.Align.LEFT);
            fConvertDpToPixel = Utils.convertDpToPixel(1.0f);
        }
        canvas.drawText(this.mDescription.getText(), fConvertDpToPixel, this.mChartAnchor.e().top + (-this.mDescPaint.getFontMetrics().top), this.mDescPaint);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider
    public qnt getPointData() {
        if (this.mData == 0) {
            return null;
        }
        return ((qmc) this.mData).i();
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider
    public qnt getLineData() {
        if (this.mData == 0) {
            return null;
        }
        return ((qmc) this.mData).j();
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public qly getBarData() {
        if (this.mData == 0) {
            return null;
        }
        return ((qmc) this.mData).h();
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isDrawBarShadowEnabled() {
        return this.f;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isDrawValueAboveBarEnabled() {
        return this.g;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.f23596b = z;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isHighlightFullBarEnabled() {
        return this.f23596b;
    }

    public DrawOrder[] getDrawOrder() {
        if (getData() != null && ((qmc) getData()).f() != null) {
            return ((qmc) getData()).f();
        }
        return (DrawOrder[]) this.d.clone();
    }

    public void setTimeValueMode(TimeValueMode timeValueMode) {
        this.l = timeValueMode;
        XAxis xAxis = getXAxis();
        if (this.l == TimeValueMode.MINUTES) {
            xAxis.setValueFormatter(new qmb());
            getDescription().setText(getResources().getString(R.string.IDS_hwh_motiontrack_detail_chart_time_min));
            return;
        }
        if (this.l == TimeValueMode.METERS) {
            xAxis.setValueFormatter(new qlw());
            if (UnitUtil.f()) {
                getDescription().setText(getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_foot));
                return;
            } else {
                getDescription().setText(getResources().getString(R.string.IDS_hwh_motiontrack_swim_distance_meter));
                return;
            }
        }
        if (this.l == TimeValueMode.KILOMETERS) {
            xAxis.setValueFormatter(new qlv());
            if (UnitUtil.f()) {
                getDescription().setText(getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_mi));
                return;
            } else {
                getDescription().setText(getResources().getString(R.string.IDS_route_alt_chart_x_label));
                return;
            }
        }
        xAxis.setValueFormatter(new qlu());
        getDescription().setText(getResources().getString(R.string.IDS_hwh_motiontrack_detail_chart_time));
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        if (getWidth() == 0) {
            setVisibility(0);
            getViewTreeObserver().addOnGlobalLayoutListener(this.o);
            return;
        }
        int i = this.p;
        if (i == 0) {
            LogUtil.j("HealthChart_HwHealthBaseCombinedChart", "mOneScreenShowCounts null,width not null");
        } else {
            c(i);
        }
    }

    public void c(int i) {
        if (this.mData == 0) {
            return;
        }
        if (this.mRenderer instanceof HwHealthBaseCombinedChartRenderer) {
            ((HwHealthBaseCombinedChartRenderer) this.mRenderer).b();
            this.mRenderer.initBuffers();
        }
        ((qmc) this.mData).e();
        e(i);
        notifyDataSetChanged();
        invalidate();
        for (T t : ((qmc) this.mData).getDataSets()) {
            if (t != null) {
                if (t instanceof IHwHealthLineDataSet) {
                    ((IHwHealthLineDataSet) t).checkIfNeedReload();
                } else {
                    t.setValues(t.acquireEntryVals());
                    t.makeDataCalculated(true);
                }
            }
        }
    }

    private void e(int i) {
        if (this.mData == 0) {
            return;
        }
        c();
        List<T> dataSets = ((qmc) this.mData).getDataSets();
        LogUtil.a("HealthChart_HwHealthBaseCombinedChart", "fillOriginalData mData size = ", Integer.valueOf(dataSets.size()), " counts ", Integer.valueOf(i));
        if (dataSets.size() == 0) {
            return;
        }
        Iterator it = dataSets.iterator();
        while (it.hasNext()) {
            if (njy.e(((HwHealthBaseBarLineDataSet) it.next()).acquireEntryVals())) {
                return;
            }
        }
        boolean z = true;
        for (T t : dataSets) {
            if (t instanceof HwHealthLineDataSet) {
                if (z) {
                    LogUtil.a("HealthChart_HwHealthBaseCombinedChart", "firData setDrawFilled true");
                    ((HwHealthLineDataSet) t).setDrawFilled(true);
                } else {
                    LogUtil.a("HealthChart_HwHealthBaseCombinedChart", "not firData setDrawFilled false");
                    ((HwHealthLineDataSet) t).setDrawFilled(false);
                }
            }
            if (z) {
                z = false;
            }
        }
        d(i);
        b();
    }

    private void b() {
        if (this.f23597c == null) {
            return;
        }
        List<T> dataSets = ((qmc) this.mData).getDataSets();
        if (njy.e(dataSets)) {
            LogUtil.j("HealthChart_HwHealthBaseCombinedChart", "setTitle not find data,lineDataSets size zero,return");
            return;
        }
        ArrayList arrayList = new ArrayList(dataSets.size());
        for (T t : dataSets) {
            if (t instanceof HwHealthLineDataSet) {
                arrayList.add(((HwHealthLineDataSet) t).e().b());
            } else if (t instanceof HwHealthBarDataSet) {
                arrayList.add(((HwHealthBarDataSet) t).a().b());
            } else {
                LogUtil.e("HealthChart_HwHealthBaseCombinedChart", "dataSet type is error. pls check");
            }
        }
        int size = arrayList.size();
        String str = "";
        if (size == 1) {
            str = "" + ((String) arrayList.get(0));
        } else if (size == 2) {
            str = "" + String.format(Locale.ENGLISH, this.e.getResources().getString(R.string.IDS_hwh_motiontrack_detail_chart_title_two), arrayList.get(0), arrayList.get(1));
        } else if (size == 3) {
            str = "" + String.format(Locale.ENGLISH, this.e.getResources().getString(R.string.IDS_hwh_motiontrack_detail_chart_title_three), arrayList.get(0), arrayList.get(1), arrayList.get(2));
        } else {
            LogUtil.j("HealthChart_HwHealthBaseCombinedChart", "lineDataSets.size not support:", Integer.valueOf(arrayList.size()));
        }
        this.f23597c.setTitle(str);
    }

    protected void c() {
        List<T> dataSets = ((qmc) this.mData).getDataSets();
        if (dataSets.size() == 0) {
            return;
        }
        this.mAxisFirstParty.setEnabled(true);
        this.mAxisSecondParty.setEnabled(true);
        this.mAxisThirdParty.setEnabled(true);
        this.mAxisFirstParty.setDrawAxisLine(false);
        this.mAxisSecondParty.setDrawAxisLine(false);
        this.mAxisThirdParty.setDrawAxisLine(false);
        if (dataSets.size() == 1) {
            this.mAxisFirstParty.setDrawLabels(true);
            this.mAxisSecondParty.setDrawLabels(false);
            this.mAxisThirdParty.setDrawLabels(false);
        }
        if (dataSets.size() == 2) {
            this.mAxisFirstParty.setDrawLabels(true);
            this.mAxisSecondParty.setDrawLabels(true);
            this.mAxisThirdParty.setDrawLabels(false);
        }
        if (dataSets.size() == 3) {
            this.mAxisFirstParty.setDrawLabels(false);
            this.mAxisSecondParty.setDrawLabels(false);
            this.mAxisThirdParty.setDrawLabels(false);
        }
        if (this.h) {
            this.mAxisFirstParty.setDrawLabels(false);
            this.mAxisSecondParty.setDrawLabels(false);
            this.mAxisThirdParty.setDrawLabels(false);
        }
    }

    private void d(int i) {
        if (i == 0) {
            LogUtil.j("HealthChart_HwHealthBaseCombinedChart", "fillOriginalData showCounts zero,why?,return");
            return;
        }
        List<T> dataSets = ((qmc) this.mData).getDataSets();
        if (dataSets.size() > 3) {
            LogUtil.j("HealthChart_HwHealthBaseCombinedChart", "only support 3 layers");
            return;
        }
        for (T t : dataSets) {
            if (t != null) {
                if (!(t instanceof HwHealthLineDataSet)) {
                    t.makeDataCalculated(true);
                } else {
                    HwHealthLineDataSet hwHealthLineDataSet = (HwHealthLineDataSet) t;
                    List<T> listAcquireEntryVals = hwHealthLineDataSet.acquireEntryVals();
                    ArrayList arrayList = new ArrayList(listAcquireEntryVals.size());
                    for (T t2 : listAcquireEntryVals) {
                        if (t2 != null) {
                            arrayList.add(new HwHealthBaseEntry(t2.getX(), t2.getY(), t2.getData()));
                        }
                    }
                    if (this.f23595a.isSupportOverlaying()) {
                        this.f23595a.onOverlaying(arrayList, hwHealthLineDataSet);
                        hwHealthLineDataSet.j();
                    }
                    if (this.f23595a.isSupportSampling()) {
                        hwHealthLineDataSet.c(this.f23595a.onSampling(arrayList, i, hwHealthLineDataSet));
                    }
                    hwHealthLineDataSet.setValues(arrayList);
                    t.makeDataCalculated(true);
                }
            }
        }
    }

    public void setOnSingleTapConfirmedListener(OnSingleTapConfirmedListener onSingleTapConfirmedListener) {
        this.t = onSingleTapConfirmedListener;
    }

    public void d(DataParser dataParser) {
        if (dataParser == null) {
            this.f23595a = this.j;
        } else {
            this.f23595a = dataParser;
        }
    }

    public void setIsTouchEventConsumption(boolean z) {
        this.k = z;
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class e implements DataParser {
        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public boolean isSupportOverlaying() {
            return false;
        }

        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public boolean isSupportSampling() {
            return false;
        }

        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public void onOverlaying(List<HwHealthBaseEntry> list, HwHealthLineDataSet hwHealthLineDataSet) {
        }

        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public int onSampling(List<HwHealthBaseEntry> list, int i, HwHealthLineDataSet hwHealthLineDataSet) {
            return 0;
        }

        private e() {
        }
    }
}
