package defpackage;

import android.graphics.Canvas;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;

/* JADX INFO: loaded from: classes41.dex */
public class ozo extends XAxisRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f45030a;
    private float e;

    public ozo(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        this.f45030a = -3.4028234663852886E38d;
        this.e = -3.4028235E38f;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f, MPPointF mPPointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (zIsCenterAxisLabelsEnabled) {
                fArr[i2] = this.mXAxis.mCenteredEntries[i2 / 2];
            } else {
                fArr[i2] = this.mXAxis.mEntries[i2 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float fCalcTextWidth = fArr[i3];
            if (this.mViewPortHandler.isInBoundsX(fCalcTextWidth)) {
                String formattedValue = this.mXAxis.getValueFormatter().getFormattedValue(this.mXAxis.mEntries[i3 / 2], this.mXAxis);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    if (i3 == this.mXAxis.mEntryCount - 1 && this.mXAxis.mEntryCount > 1) {
                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mAxisLabelPaint, formattedValue);
                        if (fCalcTextWidth2 > this.mViewPortHandler.offsetRight() * 2.0f && fCalcTextWidth + fCalcTextWidth2 > this.mViewPortHandler.getChartWidth()) {
                            fCalcTextWidth -= fCalcTextWidth2 / 2.0f;
                        }
                    } else if (i3 == 0) {
                        fCalcTextWidth += Utils.calcTextWidth(this.mAxisLabelPaint, formattedValue) / 2.0f;
                    } else {
                        LogUtil.d("PLGACHIEVE_HwHealthAchieveReportXAxisRenderer", "drawLabels i is not matching");
                    }
                }
                float f2 = fCalcTextWidth;
                double dAbs = Math.abs(this.f45030a - ((double) f2));
                if (dAbs < Utils.convertDpToPixel(17.0f)) {
                    drawLabel(canvas, formattedValue, f2, f, mPPointF, labelRotationAngle);
                } else if (dAbs < Utils.convertDpToPixel(34.0f)) {
                    drawLabel(canvas, formattedValue, f2, f + Utils.convertPixelsToDp((float) dAbs), mPPointF, labelRotationAngle);
                } else {
                    drawLabel(canvas, formattedValue, f2, f + Utils.convertDpToPixel(17.0f), mPPointF, labelRotationAngle);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabel(Canvas canvas, String str, float f, float f2, MPPointF mPPointF, float f3) {
        int alpha = this.mAxisLabelPaint.getAlpha();
        Typeface typeface = this.mAxisLabelPaint.getTypeface();
        int color = this.mAxisLabelPaint.getColor();
        if (this.e == f) {
            this.mAxisLabelPaint.setColor(BaseApplication.getContext().getResources().getColor(R.color.textColorPrimary));
            this.mAxisLabelPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            this.mAxisLabelPaint.setAlpha(255);
        }
        Utils.drawXAxisValue(canvas, str, f, f2, this.mAxisLabelPaint, mPPointF, f3);
        this.mAxisLabelPaint.setColor(color);
        this.mAxisLabelPaint.setTypeface(typeface);
        this.mAxisLabelPaint.setAlpha(alpha);
    }

    public void e(double d) {
        this.f45030a = d;
    }

    public void c(float f) {
        this.e = f;
    }
}
