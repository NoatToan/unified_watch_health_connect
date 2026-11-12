package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
public class qmm extends YAxisRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HwHealthBaseBarLineChart f46486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected qng f46487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<qml> f46488c;
    protected Context d;
    protected boolean e;
    public float f;
    public int g;
    public boolean h;
    private float i;
    public Paint j;
    private float k;
    private float l;
    private float m;
    private AtomicInteger n;
    private float o;
    private float p;
    private AtomicBoolean r;
    private int s;
    private String t;

    public qmm(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(viewPortHandler, yAxis, transformer);
        this.h = false;
        this.e = false;
        this.s = -1;
        this.i = Float.MAX_VALUE;
        this.k = Float.MAX_VALUE;
        this.o = Float.MAX_VALUE;
        this.m = Float.MAX_VALUE;
        this.l = 0.0f;
        this.p = -3.4028235E38f;
        this.r = new AtomicBoolean(false);
        this.n = new AtomicInteger(0);
        this.d = context;
        this.f46486a = hwHealthBaseBarLineChart;
        this.f46487b = new qng();
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (!(this.mYAxis instanceof HwHealthYAxis)) {
            LogUtil.j("HwHealthYAxisRenderer", "renderGridLines mYAxis not instanceof HwHealthYAxis");
            return;
        }
        HwHealthYAxis hwHealthYAxis = (HwHealthYAxis) this.mYAxis;
        if (hwHealthYAxis.isEnabled()) {
            boolean zIsDrawGridLinesEnabled = hwHealthYAxis.isDrawGridLinesEnabled();
            if (zIsDrawGridLinesEnabled || this.h) {
                int iSave = canvas.save();
                canvas.clipRect(new RectF(0.0f, 0.0f, this.mViewPortHandler.getChartWidth(), this.mViewPortHandler.getChartHeight()));
                this.mGridPaint.setColor(hwHealthYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(hwHealthYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(hwHealthYAxis.getGridDashPathEffect());
                Path path = this.mRenderGridLinesPath;
                path.reset();
                float[] transformedPositions = getTransformedPositions();
                if (zIsDrawGridLinesEnabled) {
                    for (int i = 0; i < transformedPositions.length; i += 2) {
                        if (i == transformedPositions.length - 1 || i == transformedPositions.length - 2 || i == 0 || i == 1) {
                            d(transformedPositions, i, path, canvas);
                        } else {
                            this.mGridPaint.setColor(hwHealthYAxis.a() ? hwHealthYAxis.getGridColor() : hwHealthYAxis.e());
                            canvas.drawPath(linePath(path, i, transformedPositions), this.mGridPaint);
                            path.reset();
                            this.mGridPaint.setColor(hwHealthYAxis.getGridColor());
                        }
                    }
                }
                if (this.h) {
                    this.mGridPaint.setColor(this.g);
                    float[] fArr = {0.0f, this.f};
                    this.mTrans.pointValuesToPixel(fArr);
                    Path pathB = b(path, fArr[1]);
                    Paint paint = this.j;
                    if (paint == null) {
                        paint = this.mGridPaint;
                    }
                    canvas.drawPath(pathB, paint);
                    path.reset();
                }
                canvas.restoreToCount(iSave);
            }
            if (hwHealthYAxis.isDrawZeroLineEnabled()) {
                drawZeroLine(canvas);
            }
            a(canvas);
        }
    }

    private void d(float[] fArr, int i, Path path, Canvas canvas) {
        int gridColor = this.mYAxis.getGridColor();
        if (!(this.mYAxis instanceof HwHealthYAxis)) {
            LogUtil.j("HwHealthYAxisRenderer", "mYAxis not instanceof HwHealthYAxis");
            return;
        }
        int iD = ((HwHealthYAxis) this.mYAxis).a() ? gridColor : ((HwHealthYAxis) this.mYAxis).d();
        this.mGridPaint.setPathEffect(null);
        this.mGridPaint.setColor(iD);
        canvas.drawPath(linePath(path, i, fArr), this.mGridPaint);
        path.reset();
        this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
        this.mGridPaint.setColor(gridColor);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public Path linePath(Path path, int i, float[] fArr) {
        return b(path, fArr[i + 1]);
    }

    protected Path b(Path path, float f) {
        float f2 = this.f46486a.acquireChartAnchor().f();
        float fG = this.f46486a.acquireChartAnchor().g();
        path.moveTo(f2, f);
        path.lineTo(fG, f);
        return path;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        float fB = b();
        for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
            float f3 = this.mYAxis.mEntries[i2];
            if (!this.h || Math.abs(this.p - f3) >= 1.0E-6d) {
                canvas.drawText(this.mYAxis.getFormattedLabel(i2), f, fArr[(i2 * 2) + 1] + fB, this.mAxisLabelPaint);
            }
        }
    }

    protected float b() {
        Paint.FontMetrics fontMetrics = this.mAxisLabelPaint.getFontMetrics();
        return ((fontMetrics.bottom - fontMetrics.top) * (-1.0f)) + (fontMetrics.top * (-1.0f));
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (!(this.mYAxis instanceof HwHealthYAxis)) {
            LogUtil.j("HwHealthYAxisRenderer", "renderAxisLabels mYAxis not instanceof HwHealthYAxis");
            return;
        }
        HwHealthYAxis hwHealthYAxis = (HwHealthYAxis) this.mYAxis;
        if (!hwHealthYAxis.isEnabled() || hwHealthYAxis.getAxisMaximum() == 2000000.0f) {
            return;
        }
        i();
        HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = hwHealthYAxis.b();
        if (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
            return;
        }
        boolean zIsDrawLabelsEnabled = hwHealthYAxis.isDrawLabelsEnabled();
        if (zIsDrawLabelsEnabled || this.h) {
            float requiredWidthSpace = hwHealthYAxis.getRequiredWidthSpace(null);
            boolean zE = qmh.e(this.d);
            if (this.e) {
                zE = !zE;
            }
            float fD = d(hwHealthAxisDependencyB, requiredWidthSpace, zE);
            float[] transformedPositions = getTransformedPositions();
            float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f;
            float yOffset = hwHealthYAxis.getYOffset();
            if (zIsDrawLabelsEnabled) {
                drawYLabels(canvas, fD, transformedPositions, fCalcTextHeight + yOffset);
            }
            if (!this.h || this.f == -2.1474836E9f) {
                return;
            }
            float fB = b();
            Rect rect = new Rect();
            String formattedValue = TextUtils.isEmpty(this.t) ? hwHealthYAxis.getValueFormatter().getFormattedValue(this.f, hwHealthYAxis) : this.t;
            this.mAxisLabelPaint.getTextBounds(formattedValue, 0, formattedValue.length(), rect);
            float[] fArr = {0.0f, this.f};
            this.mTrans.pointValuesToPixel(fArr);
            float f = fArr[1];
            if (this.j != null) {
                this.mAxisLabelPaint.setColor(this.j.getColor());
            } else {
                this.mAxisLabelPaint.setColor(j());
            }
            canvas.drawText(formattedValue, fD, f + fB, this.mAxisLabelPaint);
        }
    }

    private int j() {
        int i = this.s;
        return i != -1 ? i : this.g;
    }

    private void i() {
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
    }

    protected float d(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency, float f, boolean z) {
        if ((hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && !z) || (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && z)) {
            this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
            return this.mViewPortHandler.offsetLeft() - f;
        }
        if ((hwHealthAxisDependency != HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY || z) && !(hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && z)) {
            return 0.0f;
        }
        this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
        return this.mViewPortHandler.contentRight() + f;
    }

    public void c(boolean z) {
        this.e = z;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            if (!(this.mYAxis instanceof HwHealthYAxis)) {
                LogUtil.j("HwHealthYAxisRenderer", "renderAxisLine mYAxis not instanceof HwHealthYAxis");
                return;
            }
            if (((HwHealthYAxis) this.mYAxis).b() == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
                return;
            }
            HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = ((HwHealthYAxis) this.mYAxis).b();
            boolean zE = qmh.e(this.d);
            if (this.e) {
                zE = !zE;
            }
            if ((hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && !zE) || (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && zE)) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else {
                if ((hwHealthAxisDependencyB != HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY || zE) && !(hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && zE)) {
                    return;
                }
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        if (Math.abs(f2 - Float.MAX_VALUE) < 1.0E-6d || Math.abs(Float.MAX_VALUE + f) < 1.0E-6d) {
            super.computeAxis(f, f2, z);
            return;
        }
        if (!(this.mAxis instanceof HwHealthYAxis)) {
            LogUtil.j("HwHealthYAxisRenderer", "mAxis not instanceof HwHealthYAxis");
            return;
        }
        HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = ((HwHealthYAxis) this.mAxis).b();
        if (!(this.f46486a.getData() instanceof HwHealthBaseBarLineData)) {
            LogUtil.j("HwHealthYAxisRenderer", "mChart.getData() not instanceof HwHealthBaseBarLineData");
            return;
        }
        HwHealthBaseBarLineData hwHealthBaseBarLineData = (HwHealthBaseBarLineData) this.f46486a.getData();
        if (hwHealthAxisDependencyB == null || hwHealthBaseBarLineData == null) {
            LogUtil.j("HwHealthYAxisRenderer", "computeAxis dependency null or chart chartData null,return");
            return;
        }
        IHwHealthBarLineDataSet dataSet = hwHealthBaseBarLineData.getDataSet(hwHealthAxisDependencyB);
        if (dataSet == null) {
            super.computeAxis(f, f2, z);
            return;
        }
        if (dataSet.getForcedLabels() == null || dataSet.getForcedLabels().length == 0) {
            this.mAxis.setLabelCount(dataSet.getLabelCount(), true);
            super.computeAxis(f, f2, z);
            return;
        }
        a(dataSet.getForcedLabels());
    }

    private void a(float[] fArr) {
        this.mAxis.mEntryCount = fArr.length;
        this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
        System.arraycopy(fArr, 0, this.mAxis.mEntries, 0, fArr.length);
    }

    public void b(float f, float f2, boolean z, HwHealthBaseScrollBarLineChart.b bVar, HwHealthBaseScrollBarLineChart.AnimateValueTransfer animateValueTransfer, int i, int i2) {
        if (Math.abs(f - 0.0f) < 1.0E-6d) {
            bVar.c();
            return;
        }
        if (Math.abs(f - this.k) < 1.0E-6d && Math.abs(f2 - this.o) < 1.0E-6d) {
            bVar.c();
            return;
        }
        if (this.r.get() && i2 < this.n.get()) {
            bVar.c();
            return;
        }
        this.mYAxis.setAxisMinimum(f2);
        this.k = f;
        this.o = f2;
        if (Math.abs(this.m - Float.MAX_VALUE) < 1.0E-6d) {
            float f3 = this.k;
            this.m = f3;
            this.l = f3;
            this.i = 0.0f;
            this.mYAxis.setAxisMaximum(this.m);
            this.f46486a.postInvalidate();
            bVar.c();
            return;
        }
        float f4 = this.k;
        float f5 = f4 - this.m;
        if (f5 > 0.0f) {
            this.m = f5 + f4;
        }
        float f6 = f4 - this.m;
        this.i = f6;
        LogUtil.d("HwHealthYAxisRenderer", "set Velocity:", Float.valueOf(f6));
        this.l = this.m;
        if (z) {
            i = 0;
        }
        this.r.set(true);
        this.n.set(i2);
        b(animateValueTransfer, bVar, i);
    }

    private void b(final HwHealthBaseScrollBarLineChart.AnimateValueTransfer animateValueTransfer, final HwHealthBaseScrollBarLineChart.b bVar, int i) {
        this.f46487b.c(new ValueAnimator.AnimatorUpdateListener() { // from class: qmm.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fTransferValue = animateValueTransfer.transferValue(qmm.this.f46487b.a());
                float f = qmm.this.l + (qmm.this.i * fTransferValue);
                qmm.this.mYAxis.setAxisMaximum(f);
                qmm.this.m = f;
                qmm.this.f46486a.postInvalidate();
                if (Float.compare(fTransferValue, 1.0f) == 0) {
                    bVar.c();
                    qmm.this.r.set(false);
                    qmm.this.n.set(0);
                }
            }
        }, i);
    }

    public void g() {
        this.k = Float.MAX_VALUE;
        this.o = Float.MAX_VALUE;
    }

    public void b(float f, int i, String str) {
        c(f, i);
        this.t = str;
    }

    public void d(int i, int i2) {
        this.h = true;
        this.f = i;
        this.g = i2;
    }

    public void c(float f, int i) {
        this.h = true;
        this.f = f;
        this.g = i;
    }

    public void e(int i) {
        this.h = true;
        this.s = i;
    }

    public void c(int i, Paint paint) {
        this.h = true;
        this.f = i;
        this.j = paint;
    }

    public void e_() {
        this.h = false;
        this.j = null;
    }

    public boolean h() {
        return this.h;
    }

    public float c() {
        return this.f;
    }

    public void e() {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled() && this.mAxis.getAxisMaximum() != 2000000.0f && this.h) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            if (!(this.mYAxis instanceof HwHealthYAxis)) {
                LogUtil.j("HwHealthYAxisRenderer", "considerGridLinesAndManualRefLine mYAxis not instanceof HwHealthYAxis");
                return;
            }
            if (((HwHealthYAxis) this.mYAxis).b() == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
                return;
            }
            int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
            float fB = b();
            Rect rect = new Rect();
            String formattedValue = this.mYAxis.getValueFormatter().getFormattedValue(this.f, this.mYAxis);
            this.mAxisLabelPaint.getTextBounds(formattedValue, 0, formattedValue.length(), rect);
            float[] fArr = {0.0f, this.f};
            this.mTrans.pointValuesToPixel(fArr);
            float f = fArr[1] + fB;
            float fHeight = rect.height() + f;
            this.p = -3.4028235E38f;
            for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
                String formattedLabel = this.mYAxis.getFormattedLabel(i2);
                this.mAxisLabelPaint.getTextBounds(formattedLabel, 0, formattedLabel.length(), rect);
                float f2 = transformedPositions[(i2 * 2) + 1] + fB;
                float fHeight2 = rect.height() + f2;
                if ((f2 <= fHeight || fHeight2 <= fHeight) && (f2 >= f || fHeight2 >= f)) {
                    if (this.mYAxis instanceof HwHealthYAxis) {
                        this.p = ((HwHealthYAxis) this.mYAxis).mEntries[i2];
                        return;
                    }
                    return;
                }
            }
        }
    }

    public float a() {
        return this.f;
    }

    public void a(List<qml> list) {
        this.f46488c = list;
    }

    private void a(Canvas canvas) {
        if (njy.e(this.f46488c)) {
            return;
        }
        canvas.save();
        float axisMaximum = this.mYAxis.getAxisMaximum();
        float axisMinimum = this.mYAxis.getAxisMinimum();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        for (qml qmlVar : this.f46488c) {
            if (qmlVar.c() < 0.0f || qmlVar.b() > axisMaximum || qmlVar.e() < axisMinimum) {
                LogUtil.j("HwHealthYAxisRenderer", "drawRecommendInterval area data invalid");
            } else {
                paint.setColor(qmlVar.a());
                float[] fArr = {qmlVar.c(), Math.min(qmlVar.e(), axisMaximum), qmlVar.d(), Math.max(qmlVar.b(), axisMinimum)};
                this.mTrans.pointValuesToPixel(fArr);
                canvas.drawRect(new RectF(fArr[0], fArr[1], fArr[2], fArr[3]), paint);
            }
        }
    }
}
