package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.section.chart.BarChartRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes7.dex */
public class fro extends BarChartRender {
    private boolean j;

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return true;
    }

    public fro(HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
        this.j = z;
    }

    @Override // defpackage.qlz
    protected void b(Canvas canvas, RectF rectF, Paint paint, float f, float f2) {
        float f3 = f2 / 2.0f;
        int i = (int) (rectF.top + ((int) f3));
        if (f > 0.0f) {
            canvas.save();
            canvas.clipRect(rectF.left, rectF.top, rectF.right, i);
            canvas.drawRoundRect(new RectF(rectF.left, rectF.top, rectF.right, rectF.top + f2), f3, f3, paint);
            f -= f3;
            canvas.restore();
        }
        if (f > Math.pow(10.0d, -5.0d)) {
            canvas.drawRect(rectF.left, i, rectF.right, (rectF.bottom - 0.0f) - Utils.convertDpToPixel(4.0f), paint);
        }
    }

    @Override // defpackage.qlz
    protected float e(RectF rectF, float f, float f2, float f3) {
        if (!this.j) {
            return super.e(rectF, f, f2, f3);
        }
        if (f >= 1.0E-7f) {
            return f;
        }
        rectF.top -= f2;
        rectF.bottom -= f2 / 2.0f;
        return Math.abs(rectF.top - rectF.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.qlz
    public void c(Canvas canvas, String str, float f, float f2, int i) {
        float width;
        boolean z;
        float fA;
        this.mValuePaint.setColor(i);
        this.mValuePaint.setTextAlign(Paint.Align.RIGHT);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("\\;");
        int iA = qqp.a(BaseApplication.b(), 2.0f);
        if (canvas.getWidth() > 0) {
            if (LanguageUtil.ba(BaseApplication.b())) {
                width = iA;
                z = true;
            } else {
                width = canvas.getWidth() - iA;
            }
            fA = qqp.a(BaseApplication.b(), 9.0f);
            if (strArrSplit.length == 1) {
                e(canvas, strArrSplit[0], width, f2, i, z);
                return;
            }
            if (strArrSplit.length == 2) {
                this.mValuePaint.setTextSize(qqp.a(BaseApplication.b(), 8.0f));
                float f3 = width;
                boolean z2 = z;
                e(canvas, strArrSplit[0], f3, f2 - fA, i, z2);
                e(canvas, strArrSplit[1], f3, f2, i, z2);
            }
        }
        width = 0.0f;
        z = false;
        fA = qqp.a(BaseApplication.b(), 9.0f);
        if (strArrSplit.length == 1) {
            e(canvas, strArrSplit[0], width, f2, i, z);
            return;
        }
        if (strArrSplit.length == 2) {
            this.mValuePaint.setTextSize(qqp.a(BaseApplication.b(), 8.0f));
            float f4 = width;
            boolean z3 = z;
            e(canvas, strArrSplit[0], f4, f2 - fA, i, z3);
            e(canvas, strArrSplit[1], f4, f2, i, z3);
        }
    }

    public void e(Canvas canvas, String str, float f, float f2, int i, boolean z) {
        this.mValuePaint.setColor(i);
        if (z) {
            this.mValuePaint.setTextAlign(Paint.Align.LEFT);
        } else {
            this.mValuePaint.setTextAlign(Paint.Align.RIGHT);
        }
        canvas.drawText(str, f, f2, this.mValuePaint);
    }
}
