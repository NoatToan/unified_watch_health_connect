package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.utils.PointD;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class YAxisRenderer extends AxisRenderer {
    protected YAxis mYAxis;
    protected Paint mZeroLinePaint;

    public YAxisRenderer(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, transformer);
        this.mYAxis = yAxis;
        this.mAxisLabelPaint.setColor(-16777216);
        this.mAxisLabelPaint.setTextSize(Utils.convertDpToPixel(10.0f));
        Paint paint = new Paint(1);
        this.mZeroLinePaint = paint;
        paint.setColor(-7829368);
        this.mZeroLinePaint.setStrokeWidth(1.0f);
        this.mZeroLinePaint.setStyle(Paint.Style.STROKE);
    }

    public void computeAxis(float f14, float f15) {
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            PointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            PointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            if (this.mYAxis.isInverted()) {
                f14 = (float) valuesByTouchPoint.f52836y;
                f15 = (float) valuesByTouchPoint2.f52836y;
            } else {
                float f16 = (float) valuesByTouchPoint2.f52836y;
                f15 = (float) valuesByTouchPoint.f52836y;
                f14 = f16;
            }
        }
        computeAxisValues(f14, f15);
    }

    public void computeAxisValues(float f14, float f15) {
        float f16 = f14;
        int labelCount = this.mYAxis.getLabelCount();
        double dAbs = Math.abs(f15 - f16);
        if (labelCount == 0 || dAbs <= 0.0d) {
            YAxis yAxis = this.mYAxis;
            yAxis.mEntries = new float[0];
            yAxis.mEntryCount = 0;
            return;
        }
        double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) labelCount));
        if (this.mYAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mYAxis.getGranularity()) {
            dRoundToNextSignificant = this.mYAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = Utils.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(dRoundToNextSignificant)));
        if (((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5) {
            dRoundToNextSignificant = Math.floor(dRoundToNextSignificant2 * 10.0d);
        }
        boolean zIsForceLabelsEnabled = this.mYAxis.isForceLabelsEnabled();
        YAxis yAxis2 = this.mYAxis;
        if (zIsForceLabelsEnabled) {
            float f17 = ((float) dAbs) / (labelCount - 1);
            yAxis2.mEntryCount = labelCount;
            if (yAxis2.mEntries.length < labelCount) {
                yAxis2.mEntries = new float[labelCount];
            }
            for (int i14 = 0; i14 < labelCount; i14++) {
                this.mYAxis.mEntries[i14] = f16;
                f16 += f17;
            }
        } else if (yAxis2.isShowOnlyMinMaxEnabled()) {
            YAxis yAxis3 = this.mYAxis;
            yAxis3.mEntryCount = 2;
            yAxis3.mEntries = new float[]{f16, f15};
        } else {
            double dCeil = Math.ceil(((double) f16) / dRoundToNextSignificant) * dRoundToNextSignificant;
            int i15 = 0;
            for (double d14 = dCeil; d14 <= Utils.nextUp(Math.floor(((double) f15) / dRoundToNextSignificant) * dRoundToNextSignificant); d14 += dRoundToNextSignificant) {
                i15++;
            }
            YAxis yAxis4 = this.mYAxis;
            yAxis4.mEntryCount = i15;
            if (yAxis4.mEntries.length < i15) {
                yAxis4.mEntries = new float[i15];
            }
            for (int i16 = 0; i16 < i15; i16++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mYAxis.mEntries[i16] = (float) dCeil;
                dCeil += dRoundToNextSignificant;
            }
        }
        YAxis yAxis5 = this.mYAxis;
        if (dRoundToNextSignificant < 1.0d) {
            yAxis5.mDecimals = (int) Math.ceil(-Math.log10(dRoundToNextSignificant));
        } else {
            yAxis5.mDecimals = 0;
        }
    }

    public void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        int i14 = 0;
        while (true) {
            YAxis yAxis = this.mYAxis;
            if (i14 >= yAxis.mEntryCount) {
                return;
            }
            String formattedLabel = yAxis.getFormattedLabel(i14);
            if (!this.mYAxis.isDrawTopYLabelEntryEnabled() && i14 >= this.mYAxis.mEntryCount - 1) {
                return;
            }
            canvas.drawText(formattedLabel, f14, fArr[(i14 * 2) + 1] + f15, this.mAxisLabelPaint);
            i14++;
        }
    }

    public void drawZeroLine(Canvas canvas, float f14, float f15, float f16, float f17) {
        this.mZeroLinePaint.setColor(this.mYAxis.getZeroLineColor());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.getZeroLineWidth());
        Path path = new Path();
        path.moveTo(f14, f16);
        path.lineTo(f15, f17);
        canvas.drawPath(path, this.mZeroLinePaint);
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fContentRight;
        float fContentRight2;
        float f14;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            int i14 = this.mYAxis.mEntryCount * 2;
            float[] fArr = new float[i14];
            for (int i15 = 0; i15 < i14; i15 += 2) {
                fArr[i15 + 1] = this.mYAxis.mEntries[i15 / 2];
            }
            this.mTrans.pointValuesToPixel(fArr);
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            float xOffset = this.mYAxis.getXOffset();
            float yOffset = this.mYAxis.getYOffset() + (Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f);
            YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            YAxis.YAxisLabelPosition labelPosition = this.mYAxis.getLabelPosition();
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                Paint paint = this.mAxisLabelPaint;
                if (labelPosition == yAxisLabelPosition) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    fContentRight = this.mViewPortHandler.offsetLeft();
                    f14 = fContentRight - xOffset;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    fContentRight2 = this.mViewPortHandler.offsetLeft();
                    f14 = fContentRight2 + xOffset;
                }
            } else {
                YAxis.YAxisLabelPosition yAxisLabelPosition2 = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                Paint paint2 = this.mAxisLabelPaint;
                if (labelPosition == yAxisLabelPosition2) {
                    paint2.setTextAlign(Paint.Align.LEFT);
                    fContentRight2 = this.mViewPortHandler.contentRight();
                    f14 = fContentRight2 + xOffset;
                } else {
                    paint2.setTextAlign(Paint.Align.RIGHT);
                    fContentRight = this.mViewPortHandler.contentRight();
                    f14 = fContentRight - xOffset;
                }
            }
            drawYLabels(canvas, f14, fArr, yOffset);
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.LEFT;
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            if (axisDependency == axisDependency2) {
                canvas.drawLine(viewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(viewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (this.mYAxis.isEnabled()) {
            float[] fArr = new float[2];
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                Path path = new Path();
                int i14 = 0;
                while (true) {
                    YAxis yAxis = this.mYAxis;
                    if (i14 >= yAxis.mEntryCount) {
                        break;
                    }
                    fArr[1] = yAxis.mEntries[i14];
                    this.mTrans.pointValuesToPixel(fArr);
                    path.moveTo(this.mViewPortHandler.offsetLeft(), fArr[1]);
                    path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
                    canvas.drawPath(path, this.mGridPaint);
                    path.reset();
                    i14++;
                }
            }
            if (this.mYAxis.isDrawZeroLineEnabled()) {
                fArr[1] = 0.0f;
                this.mTrans.pointValuesToPixel(fArr);
                float fOffsetLeft = this.mViewPortHandler.offsetLeft();
                float fContentRight = this.mViewPortHandler.contentRight();
                float f14 = fArr[1];
                drawZeroLine(canvas, fOffsetLeft, fContentRight, f14 - 1.0f, f14 - 1.0f);
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = new float[2];
        Path path = new Path();
        for (int i14 = 0; i14 < limitLines.size(); i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                fArr[1] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                path.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
                path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String label = limitLine.getLabel();
                if (label != null && !label.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float fCalcTextHeight = Utils.calcTextHeight(this.mLimitLinePaint, label);
                    float xOffset = limitLine.getXOffset() + Utils.convertDpToPixel(4.0f);
                    float yOffset = limitLine.getYOffset() + limitLine.getLineWidth() + fCalcTextHeight;
                    LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - xOffset, (fArr[1] - yOffset) + fCalcTextHeight, this.mLimitLinePaint);
                    } else if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - xOffset, fArr[1] + yOffset, this.mLimitLinePaint);
                    } else {
                        LimitLine.LimitLabelPosition limitLabelPosition = LimitLine.LimitLabelPosition.LEFT_TOP;
                        Paint paint = this.mLimitLinePaint;
                        if (labelPosition == limitLabelPosition) {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(label, this.mViewPortHandler.contentLeft() + xOffset, (fArr[1] - yOffset) + fCalcTextHeight, this.mLimitLinePaint);
                        } else {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(label, this.mViewPortHandler.offsetLeft() + xOffset, fArr[1] + yOffset, this.mLimitLinePaint);
                        }
                    }
                }
            }
        }
    }
}
