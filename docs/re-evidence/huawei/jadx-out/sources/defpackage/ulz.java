package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ulz extends qmm {
    private boolean i;
    private String k;
    private int l;
    private boolean m;
    private float n;
    private float o;

    private boolean c(float f) {
        return f >= 0.0f && f <= 34.0f;
    }

    public ulz(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(context, viewPortHandler, yAxis, transformer, hwHealthBaseBarLineChart);
        this.l = BaseApplication.getContext().getResources().getColor(R.color.color_blood_normal);
        this.i = false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (canvas == null || this.mYAxis == null || !this.mYAxis.isEnabled()) {
            return;
        }
        if (this.mYAxis.isDrawGridLinesEnabled()) {
            canvas.clipRect(new RectF(0.0f, 0.0f, this.mViewPortHandler.getChartWidth(), this.mViewPortHandler.getChartHeight()));
            this.mGridPaint.setColor(this.mYAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(qqp.a(this.d, 0.5f));
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{qqp.a(this.d, 2.0f), qqp.a(this.d, 1.0f)}, 0.0f);
            Path path = this.mRenderGridLinesPath;
            int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
            for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
                float[] fArr = {0.0f, (float) Math.floor(this.mYAxis.mEntries[i2])};
                this.mTrans.pointValuesToPixel(fArr);
                path.reset();
                if (i2 == 0) {
                    this.mGridPaint.setPathEffect(null);
                } else {
                    this.mGridPaint.setPathEffect(dashPathEffect);
                }
                canvas.drawPath(b(path, fArr[1]), this.mGridPaint);
                path.reset();
            }
            this.mGridPaint.setColor(this.l);
            if (this.m) {
                float f = this.n;
                if (f > 0.0f) {
                    float f2 = this.o;
                    if (f2 > 0.0f) {
                        e(canvas, f, f2);
                    } else {
                        this.mGridPaint.setPathEffect(null);
                        c(canvas, this.n);
                        c(canvas, this.o);
                    }
                } else {
                    this.mGridPaint.setPathEffect(null);
                    c(canvas, this.n);
                    c(canvas, this.o);
                }
            }
            this.mGridPaint.setColor(this.mYAxis.getGridColor());
        }
        if (this.mYAxis.isDrawZeroLineEnabled()) {
            drawZeroLine(canvas);
        }
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        float fB = b();
        float fAbs = (this.mAxisLabelPaint.getFontMetrics().bottom - this.mAxisLabelPaint.getFontMetrics().top) + Math.abs(fB);
        float[] fArr2 = {0.0f, this.n};
        this.mTrans.pointValuesToPixel(fArr2);
        float f3 = fArr2[1];
        float[] fArr3 = {0.0f, this.o};
        this.mTrans.pointValuesToPixel(fArr3);
        float f4 = fArr3[1];
        for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
            float f5 = fArr[(i2 * 2) + 1];
            if (!this.m || (Math.abs(f3 - f5) >= fAbs && Math.abs(f4 - f5) >= fAbs)) {
                canvas.drawText(this.mYAxis.getFormattedLabel(i2), f, f5 + fB, this.mAxisLabelPaint);
            }
        }
    }

    private void c(Canvas canvas, float f) {
        if (!c(f)) {
            LogUtil.j("BloodSugarYaxisRender", "The reference blood sugar value is not within the reasonable range.");
            return;
        }
        float[] fArr = {0.0f, f};
        this.mTrans.pointValuesToPixel(fArr);
        this.mRenderGridLinesPath.reset();
        canvas.drawPath(b(this.mRenderGridLinesPath, fArr[1]), this.mGridPaint);
        this.mRenderGridLinesPath.reset();
        b(canvas, f);
    }

    private void e(Canvas canvas, float f, float f2) {
        if (!c(f) || !c(f2)) {
            LogUtil.j("BloodSugarYaxisRender", "The reference blood sugar value is not within the reasonable range.");
            return;
        }
        float[] fArr = {0.0f, f};
        this.mTrans.pointValuesToPixel(fArr);
        float[] fArr2 = {0.0f, f2};
        this.mTrans.pointValuesToPixel(fArr2);
        Path path = new Path();
        float f3 = this.f46486a.acquireChartAnchor().f();
        float fG = this.f46486a.acquireChartAnchor().g();
        path.moveTo(f3, fArr[1]);
        path.lineTo(fG, fArr[1]);
        path.lineTo(fG, fArr2[1]);
        path.lineTo(f3, fArr2[1]);
        path.lineTo(f3, fArr[1]);
        Paint paint = new Paint();
        paint.setColor(this.l);
        if (qqs.e(BaseApplication.getContext())) {
            paint.setAlpha(30);
        } else {
            paint.setAlpha(15);
        }
        canvas.drawPath(path, paint);
        b(canvas, this.n);
        if (Math.abs(this.n - this.o) < 1.5f) {
            this.i = true;
        }
        b(canvas, this.o);
    }

    private void b(Canvas canvas, float f) {
        HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB;
        if (!this.m || f == -2.1474836E9f || !(this.mYAxis instanceof HwHealthYAxis) || (hwHealthAxisDependencyB = ((HwHealthYAxis) this.mYAxis).b()) == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
            return;
        }
        if (!(this.mAxis instanceof HwHealthYAxis)) {
            LogUtil.j("BloodSugarYaxisRender", "renderAxisLabels mAxis not instanceof HwHealthYAxis");
            return;
        }
        float requiredWidthSpace = ((HwHealthYAxis) this.mAxis).getRequiredWidthSpace(null);
        boolean zE = qmh.e(this.d);
        if (this.e) {
            zE = !zE;
        }
        float fD = d(hwHealthAxisDependencyB, requiredWidthSpace, zE);
        String strValueOf = String.valueOf(UnitUtil.e(f, 1, 1));
        float[] fArr = {0.0f, f};
        this.mTrans.pointValuesToPixel(fArr);
        float fB = fArr[1] + b();
        this.mAxisLabelPaint.setColor(this.l);
        LogUtil.a("BloodSugarYaxisRender", "drawManualReferenceLineLabel manualText = ", strValueOf);
        if (this.i) {
            Rect rect = new Rect();
            this.mAxisLabelPaint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            fB += rect.bottom - rect.top;
            this.i = false;
        }
        canvas.drawText(strValueOf, fD, fB, this.mAxisLabelPaint);
        this.mAxisLabelPaint.setColor(this.mYAxis.getGridColor());
    }

    public void b(String str) {
        this.k = str;
        f();
    }

    private void f() {
        boolean zEquals = "BLOOD_SUGAR_FINGER_TIP".equals(this.k);
        this.m = !zEquals;
        if (zEquals) {
            return;
        }
        if ("BLOOD_SUGAR_CONTINUE".equals(this.k)) {
            float[] fArrD = emq.d();
            this.n = fArrD[0];
            this.o = fArrD[1];
        } else if ("BLOOD_SUGAR_LIMOSIS".equals(this.k)) {
            this.n = 7.0f;
            this.o = 4.4f;
        } else if ("BLOOD_SUGAR_BEFORE_AFTER_MEAL_DIFFERENCE".equals(this.k)) {
            this.n = 3.3f;
            this.o = -1.0f;
        } else {
            this.n = 10.0f;
            this.o = 4.4f;
        }
    }
}
