package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.touch.GlobalActionMonitor;
import com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener;
import com.huawei.ui.commonui.linechart.common.touch.OperationSequence;
import com.huawei.ui.commonui.linechart.common.touch.TouchModeDelegateMgr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public class qmz implements OperationSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthBaseBarLineChart f46507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GlobalActionMonitor f46508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f46509c;
    private int d;
    private Context e;
    private HwHealthBarLineChartTouchListener f;
    private float k;
    private Matrix l;
    private int m;
    private int n;
    private VelocityTracker p;
    private ViewPortHandler s;
    private boolean o = false;
    private MPPointF q = MPPointF.getInstance(0.0f, 0.0f);
    private boolean g = false;
    private Matrix t = new Matrix();
    private AtomicBoolean j = new AtomicBoolean(false);
    private boolean i = false;
    private boolean h = false;

    public qmz(Context context, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler, HwHealthBarLineChartTouchListener hwHealthBarLineChartTouchListener) {
        this.f46507a = null;
        this.f = null;
        this.s = null;
        this.l = null;
        this.f46508b = null;
        this.e = context;
        this.f46507a = hwHealthBaseBarLineChart;
        this.s = viewPortHandler;
        this.f = hwHealthBarLineChartTouchListener;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.m = 6500;
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.l = viewPortHandler.getMatrixTouch();
        this.f46508b = new GlobalActionMonitor(this.f46507a);
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public boolean canSeqStart(MotionEvent motionEvent) {
        return motionEvent != null && (motionEvent.getAction() & 255) == 0;
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public boolean isSeqInterrupted() {
        return this.o;
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public void prepare() {
        this.o = false;
        this.g = false;
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public void release() {
        VelocityTracker velocityTracker = this.p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.p = null;
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public void onTouchEvent(MotionEvent motionEvent) {
        if (this.j.get() || motionEvent == null) {
            return;
        }
        this.p.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.g = false;
            this.i = false;
            this.h = false;
            if (this.f46508b.e(motionEvent)) {
                return;
            }
            d(motionEvent);
            return;
        }
        if (action != 1) {
            if (action == 2) {
                LogUtil.d("HealthChart_SinglePointer", "perform Move :", Float.valueOf(Math.abs(motionEvent.getX() - this.q.getX())));
                if (!this.f46508b.d(motionEvent)) {
                    c(motionEvent);
                }
                if (this.g || this.h) {
                    this.f46508b.c();
                    return;
                }
                return;
            }
            if (action != 3) {
                d();
                return;
            }
        }
        if (this.f46508b.a(motionEvent)) {
            return;
        }
        a(motionEvent);
    }

    private void d() {
        this.o = true;
        VelocityTracker velocityTracker = this.p;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    private void a(MotionEvent motionEvent) {
        if (this.f.d != HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE) {
            d();
            return;
        }
        if (e(motionEvent, this.p)) {
            float x = motionEvent.getX() - this.q.x;
            boolean z = (x < 0.0f && !qmh.e(this.e)) || (x > 0.0f && qmh.e(this.e));
            float fAbs = Math.abs(this.p.getXVelocity());
            float f = this.m;
            if (fAbs < f) {
                fAbs = f;
            }
            if (d(motionEvent, fAbs, z)) {
                d();
                return;
            }
        }
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f46507a;
        if (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) {
            HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = (HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart;
            if (hwHealthBaseScrollBarLineChart.acquireChartShowMode() == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE) {
                Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
                hwHealthBaseScrollBarLineChart.correctViewPosition(new HwHealthBaseScrollBarLineChart.b(hwHealthBaseScrollBarLineChart, hwHealthBaseScrollBarLineChart) { // from class: qmz.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ HwHealthBaseScrollBarLineChart f46511b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                        this.f46511b = hwHealthBaseScrollBarLineChart;
                        Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                        this.f46511b.animateBorderYAuto(2);
                        ((HwHealthBaseScrollBarLineChart) qmz.this.f46507a).adsorbMarkerViewToSelectedDataByDataArea();
                    }
                });
            }
        }
        d();
    }

    private boolean e(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        this.p.computeCurrentVelocity(1000, this.n);
        float xVelocity = this.p.getXVelocity();
        if (Math.abs(this.s.contentWidth()) < 1.0E-6d) {
            LogUtil.j("HealthChart_SinglePointer", "Math.abs(mViewPortHandler.contentWidth()) < 1e-6");
            return false;
        }
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f46507a;
        if (!(hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) || ((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart).querySupportTouchScroll()) {
            return Math.abs(xVelocity) > ((float) this.m) && Math.abs(motionEvent.getX() - this.q.getX()) / this.s.contentWidth() > 0.16666667f && Math.abs(this.f46509c - SystemClock.elapsedRealtime()) < 600;
        }
        return Math.abs(motionEvent.getX() - this.q.getX()) / this.s.contentWidth() > 0.16666667f;
    }

    private void d(MotionEvent motionEvent) {
        b(motionEvent);
        this.d = this.f46507a.getMonthDaysOfMinTime();
    }

    private void c(MotionEvent motionEvent) {
        if (!this.g) {
            float fAbs = Math.abs(motionEvent.getX() - this.q.getX());
            float fAbs2 = Math.abs(motionEvent.getY() - this.q.getY());
            if (fAbs > TouchModeDelegateMgr.f23694b && fAbs2 > TouchModeDelegateMgr.f23694b) {
                if (fAbs < fAbs2 * 2.0f) {
                    this.g = true;
                    c();
                    d();
                    return;
                }
                this.g = true;
            }
        }
        boolean z = this.f.d == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE && ((HwHealthBaseScrollBarLineChart) this.f46507a).querySupportTouchScroll();
        HwHealthBaseScrollBarLineChart.ChartShowMode chartShowMode = this.f.d;
        if (chartShowMode == HwHealthBaseScrollBarLineChart.ChartShowMode.NORMAL || chartShowMode == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_SCALE_MODE || z) {
            e(motionEvent);
        }
    }

    private void c() {
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f46507a;
        if (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) {
            HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = (HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart;
            if (hwHealthBaseScrollBarLineChart.acquireChartShowMode() == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE) {
                Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
                hwHealthBaseScrollBarLineChart.correctViewPosition(new HwHealthBaseScrollBarLineChart.b(hwHealthBaseScrollBarLineChart, hwHealthBaseScrollBarLineChart) { // from class: qmz.4
                    final /* synthetic */ HwHealthBaseScrollBarLineChart d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                        this.d = hwHealthBaseScrollBarLineChart;
                        Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                        this.d.animateBorderYAuto(1);
                        ((HwHealthBaseScrollBarLineChart) qmz.this.f46507a).adsorbMarkerViewToSelectedDataByDataArea();
                    }
                });
            }
        }
    }

    private boolean d(MotionEvent motionEvent, float f, boolean z) {
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.f46507a;
        if (!(hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart)) {
            return false;
        }
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = (HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart;
        if (!hwHealthBaseScrollBarLineChart.isSupportFling()) {
            return false;
        }
        if (z) {
            if (!hwHealthBaseScrollBarLineChart.canScrollNewerPager()) {
                return false;
            }
            this.j.set(true);
            Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
            HwHealthBaseScrollBarLineChart.b bVar = new HwHealthBaseScrollBarLineChart.b(hwHealthBaseScrollBarLineChart) { // from class: qmz.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                    Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
                }

                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                public void c() {
                    super.c();
                    qmz.this.j.set(false);
                    ((HwHealthBaseScrollBarLineChart) qmz.this.f46507a).adsorbMarkerViewToSelectedDataByDataArea();
                }
            };
            HwHealthBaseScrollBarLineChart.AnimateValueTransfer animateValueTransfer = new HwHealthBaseScrollBarLineChart.AnimateValueTransfer() { // from class: qmz.2
                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateValueTransfer
                public float transferValue(float f2) {
                    return (2.0f * f2) - (f2 * f2);
                }
            };
            Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
            hwHealthBaseScrollBarLineChart.scrollOnePageNewer(bVar, animateValueTransfer, new HwHealthBaseScrollBarLineChart.AbstractAnimateTimeComputer(hwHealthBaseScrollBarLineChart, f) { // from class: qmz.5
                final /* synthetic */ float e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                    this.e = f;
                    Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
                }

                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AbstractAnimateTimeComputer
                public int computeTimeByPixel(float f2) {
                    return (int) (((f2 * 2.0f) / this.e) * 1000.0f);
                }
            });
        } else {
            if (!hwHealthBaseScrollBarLineChart.canScrollOlderPager()) {
                return false;
            }
            c(hwHealthBaseScrollBarLineChart, f);
        }
        return true;
    }

    private void e(MotionEvent motionEvent) {
        float fAbs = Math.abs(motionEvent.getX() - this.q.x);
        float fAbs2 = Math.abs(motionEvent.getY() - this.q.y);
        if (this.f46507a.isDragXEnabled() && fAbs >= fAbs2) {
            this.i = true;
            if (fAbs > TouchModeDelegateMgr.f23694b || fAbs2 > TouchModeDelegateMgr.f23694b) {
                this.h = true;
            }
        }
        if (this.i) {
            float x = motionEvent.getX();
            float f = this.k;
            this.k = motionEvent.getX();
            a(x - f, 0.0f);
            this.l = this.f46507a.getViewPortHandler().refresh(this.l, this.f46507a, true);
        }
    }

    private void b(MotionEvent motionEvent) {
        this.t.set(this.s.getMatrixTouch());
        this.q.x = motionEvent.getX();
        this.q.y = motionEvent.getY();
        this.f46509c = SystemClock.elapsedRealtime();
        this.k = motionEvent.getX();
    }

    private void a(float f, float f2) {
        int i;
        int monthDaysOfMinTime = this.f46507a.getMonthDaysOfMinTime();
        float f3 = (monthDaysOfMinTime == 0 || (i = this.d) == 0) ? 1.0f : i / monthDaysOfMinTime;
        this.d = monthDaysOfMinTime;
        if (Float.compare(f3, 1.0f) != 0) {
            this.l.postScale(f3, 1.0f, 0.0f, 0.0f);
        }
        this.l.postTranslate(f, f2);
    }

    private void c(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, float f) {
        this.j.set(true);
        Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
        HwHealthBaseScrollBarLineChart.b bVar = new HwHealthBaseScrollBarLineChart.b(hwHealthBaseScrollBarLineChart) { // from class: qmz.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
                qmz.this.j.set(false);
                ((HwHealthBaseScrollBarLineChart) qmz.this.f46507a).adsorbMarkerViewToSelectedDataByDataArea();
            }
        };
        HwHealthBaseScrollBarLineChart.AnimateValueTransfer animateValueTransfer = new HwHealthBaseScrollBarLineChart.AnimateValueTransfer() { // from class: qmz.10
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateValueTransfer
            public float transferValue(float f2) {
                return (2.0f * f2) - (f2 * f2);
            }
        };
        Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
        hwHealthBaseScrollBarLineChart.scrollOnePageOlder(bVar, animateValueTransfer, new HwHealthBaseScrollBarLineChart.AbstractAnimateTimeComputer(hwHealthBaseScrollBarLineChart, f) { // from class: qmz.6

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f46517b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.f46517b = f;
                Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AbstractAnimateTimeComputer
            public int computeTimeByPixel(float f2) {
                return (int) (((f2 * 2.0f) / this.f46517b) * 1000.0f);
            }
        });
    }
}
