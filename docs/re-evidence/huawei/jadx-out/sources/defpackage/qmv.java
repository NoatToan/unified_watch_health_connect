package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener;
import com.huawei.ui.commonui.linechart.common.touch.OperationSequence;

/* JADX INFO: loaded from: classes16.dex */
public class qmv implements OperationSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthBarLineChartTouchListener f46499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f46500b;
    private HwHealthBaseBarLineChart e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46501c = false;
    private float h = 1.0f;
    private float i = 1.0f;
    private float f = 1.0f;
    private MPPointF j = MPPointF.getInstance(0.0f, 0.0f);
    private Matrix g = new Matrix();
    private float d = Utils.convertDpToPixel(3.5f);

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public void release() {
    }

    public qmv(Context context, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler, HwHealthBarLineChartTouchListener hwHealthBarLineChartTouchListener) {
        this.e = null;
        this.f46499a = null;
        this.f46500b = null;
        this.e = hwHealthBaseBarLineChart;
        this.f46499a = hwHealthBarLineChartTouchListener;
        this.f46500b = viewPortHandler.getMatrixTouch();
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public boolean canSeqStart(MotionEvent motionEvent) {
        return motionEvent != null && (motionEvent.getAction() & 255) == 5;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public void onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            d(motionEvent);
        } else if (action == 3) {
            a(motionEvent);
        } else if (action == 5) {
            b(motionEvent);
        } else if (action == 6) {
            a(motionEvent);
        } else {
            d();
        }
        this.f46500b = this.e.getViewPortHandler().refresh(this.f46500b, this.e, true);
    }

    private void a(MotionEvent motionEvent) {
        d();
    }

    private void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        if (motionEvent.getPointerCount() < 2) {
            d();
            return;
        }
        if (this.f46499a.d == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE) {
            d();
            return;
        }
        i(motionEvent);
        this.h = e(motionEvent);
        this.i = c(motionEvent);
        this.f = g(motionEvent);
        if (!this.e.isScaleXEnabled()) {
            d();
            return;
        }
        if (this.f <= 10.0f) {
            d();
        } else if (this.h <= this.i) {
            d();
        } else {
            c(this.j, motionEvent);
        }
    }

    private void i(MotionEvent motionEvent) {
        this.g.set(this.f46500b);
    }

    private static void c(MPPointF mPPointF, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        float x = motionEvent.getX(0);
        float x2 = motionEvent.getX(1);
        float y = motionEvent.getY(0);
        float y2 = motionEvent.getY(1);
        mPPointF.x = (x + x2) / 2.0f;
        mPPointF.y = (y + y2) / 2.0f;
    }

    private void d(MotionEvent motionEvent) {
        f(motionEvent);
    }

    private void f(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        if (motionEvent.getPointerCount() < 2) {
            d();
            return;
        }
        if (g(motionEvent) <= this.d) {
            d();
            return;
        }
        MPPointF mPPointFA = a(this.j.x, this.j.y);
        ViewPortHandler viewPortHandler = this.e.getViewPortHandler();
        float fE = e(motionEvent) / this.h;
        if (fE < 1.0f ? viewPortHandler.canZoomOutMoreX() : viewPortHandler.canZoomInMoreX()) {
            this.f46500b.set(this.g);
            this.f46500b.postScale(fE, 1.0f, mPPointFA.x, mPPointFA.y);
        }
        MPPointF.recycleInstance(mPPointFA);
    }

    public MPPointF a(float f, float f2) {
        ViewPortHandler viewPortHandler = this.e.getViewPortHandler();
        return MPPointF.getInstance(f - viewPortHandler.offsetLeft(), -((this.e.getMeasuredHeight() - f2) - viewPortHandler.offsetBottom()));
    }

    private static float e(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return 0.0f;
        }
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float c(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return 0.0f;
        }
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public boolean isSeqInterrupted() {
        return this.f46501c;
    }

    @Override // com.huawei.ui.commonui.linechart.common.touch.OperationSequence
    public void prepare() {
        this.f46501c = false;
    }

    private void d() {
        this.f46501c = true;
    }

    private static float g(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }
}
