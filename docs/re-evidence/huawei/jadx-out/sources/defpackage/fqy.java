package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes7.dex */
public class fqy extends qnz {
    private int i;
    private float k;
    private float l;
    private int m;
    private boolean n;
    private float o;
    private float[] q;
    private float r;

    private boolean c(float f) {
        return f >= 30.0f && f <= 300.0f;
    }

    public fqy(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(context, viewPortHandler, yAxis, transformer, hwHealthBaseBarLineChart);
        this.n = true;
        this.i = qqn.d(R.color.emuiColor10);
        this.m = qqn.d(R.color.emui_color_fg_2);
        this.q = new float[5];
        i();
    }

    @Override // defpackage.qnz, defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
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
            int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? 5 : 4;
            this.q = new float[5];
            float f = (this.mYAxis.mEntries[this.mYAxis.mEntries.length - 1] - this.mYAxis.mEntries[0]) / 4.0f;
            for (int i2 = 0; i2 < 5; i2++) {
                this.q[i2] = this.mYAxis.mEntries[0] + (i2 * f);
            }
            for (int i3 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i3 < i; i3++) {
                float[] fArr = {0.0f, (float) Math.floor(this.q[i3])};
                this.mTrans.pointValuesToPixel(fArr);
                path.reset();
                if (i3 == 0) {
                    this.mGridPaint.setPathEffect(null);
                } else {
                    this.mGridPaint.setPathEffect(dashPathEffect);
                }
                canvas.drawPath(b(path, fArr[1]), this.mGridPaint);
                path.reset();
            }
            float f2 = this.l;
            if (f2 > 0.0f) {
                float f3 = this.k;
                if (f3 > 0.0f) {
                    e(canvas, f2, f3, this.i);
                    e(canvas, this.o, this.r, this.m);
                    this.mGridPaint.setPathEffect(null);
                    this.mGridPaint.setAlpha(com.huawei.health.servicesui.R.dimen.secondaryContentAlpha);
                    this.mGridPaint.setColor(this.i);
                    e(canvas, this.l);
                    this.mGridPaint.setColor(this.m);
                    e(canvas, this.o);
                }
            }
            this.mGridPaint.setColor(this.mYAxis.getGridColor());
        }
        if (this.mYAxis.isDrawZeroLineEnabled()) {
            drawZeroLine(canvas);
        }
    }

    @Override // defpackage.qnz, defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        if (this.mGetTransformedPositionsBuffer.length != 10) {
            this.mGetTransformedPositionsBuffer = new float[10];
        }
        float[] fArr2 = this.mGetTransformedPositionsBuffer;
        for (int i = 0; i < fArr2.length; i += 2) {
            fArr2[i + 1] = this.q[i / 2];
        }
        this.mTrans.pointValuesToPixel(fArr2);
        int i2 = this.mYAxis.isDrawTopYLabelEntryEnabled() ? 5 : 4;
        float fB = b();
        float f3 = this.mAxisLabelPaint.getFontMetrics().bottom - this.mAxisLabelPaint.getFontMetrics().top;
        float[] fArr3 = {0.0f, this.l};
        this.mTrans.pointValuesToPixel(fArr3);
        float f4 = fArr3[1];
        float[] fArr4 = {0.0f, this.o};
        this.mTrans.pointValuesToPixel(fArr4);
        float f5 = fArr4[1];
        for (int i3 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i3 < i2; i3++) {
            float f6 = fArr2[(i3 * 2) + 1];
            if (!this.n || (Math.abs(f4 - f6) >= f3 && Math.abs(f5 - f6) >= f3)) {
                canvas.drawText(b(i3), f, f6 + fB, this.mAxisLabelPaint);
            }
        }
    }

    private String b(int i) {
        if (i < 0 || i >= this.q.length) {
            return "";
        }
        return this.mYAxis.getValueFormatter().getFormattedValue(this.q[i], this.mAxis);
    }

    private void e(Canvas canvas, float f) {
        if (!c(f)) {
            LogUtil.j("BloodPressureLineYaxisRender", "The reference blood sugar value is not within the reasonable range.");
            return;
        }
        float[] fArr = {0.0f, f};
        this.mTrans.pointValuesToPixel(fArr);
        this.mRenderGridLinesPath.reset();
        canvas.drawPath(b(this.mRenderGridLinesPath, fArr[1]), this.mGridPaint);
        this.mRenderGridLinesPath.reset();
    }

    private void e(Canvas canvas, float f, float f2, int i) {
        if (!c(f) || !c(f2)) {
            LogUtil.j("BloodPressureLineYaxisRender", "The reference blood sugar value is not within the reasonable range.");
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
        paint.setColor(i);
        if (qqs.e(BaseApplication.getContext())) {
            paint.setAlpha(26);
        } else {
            paint.setAlpha(12);
        }
        canvas.drawPath(path, paint);
        b(canvas, f, i);
    }

    private void b(Canvas canvas, float f, int i) {
        HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB;
        if (!this.n || f == -2.1474836E9f || !(this.mYAxis instanceof HwHealthYAxis) || (hwHealthAxisDependencyB = ((HwHealthYAxis) this.mYAxis).b()) == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
            return;
        }
        if (!(this.mAxis instanceof HwHealthYAxis)) {
            LogUtil.j("BloodPressureLineYaxisRender", "renderAxisLabels mAxis not instanceof HwHealthYAxis");
            return;
        }
        float requiredWidthSpace = ((HwHealthYAxis) this.mAxis).getRequiredWidthSpace(null);
        boolean zE = qmh.e(this.d);
        if (this.e) {
            zE = !zE;
        }
        float fD = d(hwHealthAxisDependencyB, requiredWidthSpace, zE);
        String strValueOf = String.valueOf(UnitUtil.e(f, 1, 0));
        float[] fArr = {0.0f, f};
        this.mTrans.pointValuesToPixel(fArr);
        float f2 = fArr[1];
        this.mAxisLabelPaint.setColor(i);
        canvas.drawText(strValueOf, fD, f2, this.mAxisLabelPaint);
        this.mAxisLabelPaint.setColor(this.mYAxis.getGridColor());
    }

    private void i() {
        this.l = 140.0f;
        this.k = 90.0f;
        this.o = 90.0f;
        this.r = 60.0f;
    }
}
