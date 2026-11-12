package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AxisRenderer extends Renderer {
    protected AxisBase mAxis;
    protected Paint mAxisLabelPaint;
    protected Paint mAxisLinePaint;
    protected Paint mGridPaint;
    protected Paint mLimitLinePaint;
    protected Transformer mTrans;

    public AxisRenderer(ViewPortHandler viewPortHandler, Transformer transformer, AxisBase axisBase) {
        super(viewPortHandler);
        this.mTrans = transformer;
        this.mAxis = axisBase;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint = new Paint(1);
            Paint paint = new Paint();
            this.mGridPaint = paint;
            paint.setColor(-7829368);
            this.mGridPaint.setStrokeWidth(1.0f);
            Paint paint2 = this.mGridPaint;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.mGridPaint.setAlpha(90);
            Paint paint3 = new Paint();
            this.mAxisLinePaint = paint3;
            paint3.setColor(-16777216);
            this.mAxisLinePaint.setStrokeWidth(1.0f);
            this.mAxisLinePaint.setStyle(style);
            Paint paint4 = new Paint(1);
            this.mLimitLinePaint = paint4;
            paint4.setStyle(style);
        }
    }

    public void computeAxis(float f14, float f15, boolean z14) {
        float f16;
        double d14;
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        if (viewPortHandler != null && viewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            if (z14) {
                f16 = (float) valuesByTouchPoint.f52827y;
                d14 = valuesByTouchPoint2.f52827y;
            } else {
                f16 = (float) valuesByTouchPoint2.f52827y;
                d14 = valuesByTouchPoint.f52827y;
            }
            float f17 = (float) d14;
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f14 = f16;
            f15 = f17;
        }
        computeAxisValues(f14, f15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public void computeAxisValues(float f14, float f15) {
        float f16 = f14;
        int labelCount = this.mAxis.getLabelCount();
        double dAbs = Math.abs(f15 - f16);
        if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mAxis.getGranularity()) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = Utils.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(dRoundToNextSignificant)));
        if (((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5) {
            dRoundToNextSignificant = Math.floor(dRoundToNextSignificant2 * 10.0d);
        }
        ?? IsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            dRoundToNextSignificant = ((float) dAbs) / (labelCount - 1);
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i14 = 0; i14 < labelCount; i14++) {
                this.mAxis.mEntries[i14] = f16;
                f16 = (float) (((double) f16) + dRoundToNextSignificant);
            }
        } else {
            double dCeil = dRoundToNextSignificant == 0.0d ? 0.0d : Math.ceil(((double) f16) / dRoundToNextSignificant) * dRoundToNextSignificant;
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                dCeil -= dRoundToNextSignificant;
            }
            double dNextUp = dRoundToNextSignificant == 0.0d ? 0.0d : Utils.nextUp(Math.floor(((double) f15) / dRoundToNextSignificant) * dRoundToNextSignificant);
            if (dRoundToNextSignificant != 0.0d) {
                double d14 = dCeil;
                IsCenterAxisLabelsEnabled = IsCenterAxisLabelsEnabled;
                while (d14 <= dNextUp) {
                    d14 += dRoundToNextSignificant;
                    IsCenterAxisLabelsEnabled++;
                }
            }
            labelCount = IsCenterAxisLabelsEnabled;
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = labelCount;
            if (axisBase3.mEntries.length < labelCount) {
                axisBase3.mEntries = new float[labelCount];
            }
            for (int i15 = 0; i15 < labelCount; i15++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i15] = (float) dCeil;
                dCeil += dRoundToNextSignificant;
            }
        }
        AxisBase axisBase4 = this.mAxis;
        if (dRoundToNextSignificant < 1.0d) {
            axisBase4.mDecimals = (int) Math.ceil(-Math.log10(dRoundToNextSignificant));
        } else {
            axisBase4.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            AxisBase axisBase5 = this.mAxis;
            if (axisBase5.mCenteredEntries.length < labelCount) {
                axisBase5.mCenteredEntries = new float[labelCount];
            }
            float f17 = ((float) dRoundToNextSignificant) / 2.0f;
            for (int i16 = 0; i16 < labelCount; i16++) {
                AxisBase axisBase6 = this.mAxis;
                axisBase6.mCenteredEntries[i16] = axisBase6.mEntries[i16] + f17;
            }
        }
    }

    public Paint getPaintAxisLabels() {
        return this.mAxisLabelPaint;
    }

    public Paint getPaintAxisLine() {
        return this.mAxisLinePaint;
    }

    public Paint getPaintGrid() {
        return this.mGridPaint;
    }

    public Transformer getTransformer() {
        return this.mTrans;
    }

    public abstract void renderAxisLabels(Canvas canvas);

    public abstract void renderAxisLine(Canvas canvas);

    public abstract void renderGridLines(Canvas canvas);

    public abstract void renderLimitLines(Canvas canvas);
}
