package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class YAxisRenderer extends AxisRenderer {
    protected Path mDrawZeroLinePath;
    protected float[] mGetTransformedPositionsBuffer;
    protected RectF mGridClippingRect;
    protected RectF mLimitLineClippingRect;
    protected Path mRenderGridLinesPath;
    protected Path mRenderLimitLines;
    protected float[] mRenderLimitLinesBuffer;
    protected YAxis mYAxis;
    protected RectF mZeroLineClippingRect;
    protected Paint mZeroLinePaint;

    public YAxisRenderer(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, transformer, yAxis);
        this.mRenderGridLinesPath = new Path();
        this.mGridClippingRect = new RectF();
        this.mGetTransformedPositionsBuffer = new float[2];
        this.mDrawZeroLinePath = new Path();
        this.mZeroLineClippingRect = new RectF();
        this.mRenderLimitLines = new Path();
        this.mRenderLimitLinesBuffer = new float[2];
        this.mLimitLineClippingRect = new RectF();
        this.mYAxis = yAxis;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint.setColor(-16777216);
            this.mAxisLabelPaint.setTextSize(Utils.convertDpToPixel(10.0f));
            Paint paint = new Paint(1);
            this.mZeroLinePaint = paint;
            paint.setColor(-7829368);
            this.mZeroLinePaint.setStrokeWidth(1.0f);
            this.mZeroLinePaint.setStyle(Paint.Style.STROKE);
        }
    }

    public void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        boolean zIsDrawTopYLabelEntryEnabled = this.mYAxis.isDrawTopYLabelEntryEnabled();
        YAxis yAxis = this.mYAxis;
        int i14 = zIsDrawTopYLabelEntryEnabled ? yAxis.mEntryCount : yAxis.mEntryCount - 1;
        for (int i15 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i15 < i14; i15++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i15), f14, fArr[(i15 * 2) + 1] + f15, this.mAxisLabelPaint);
        }
    }

    public void drawZeroLine(Canvas canvas) {
        int iSave = canvas.save();
        this.mZeroLineClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mZeroLineClippingRect.inset(0.0f, -this.mYAxis.getZeroLineWidth());
        canvas.clipRect(this.mZeroLineClippingRect);
        MPPointD pixelForValues = this.mTrans.getPixelForValues(0.0f, 0.0f);
        this.mZeroLinePaint.setColor(this.mYAxis.getZeroLineColor());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.getZeroLineWidth());
        Path path = this.mDrawZeroLinePath;
        path.reset();
        path.moveTo(this.mViewPortHandler.contentLeft(), (float) pixelForValues.f52827y);
        path.lineTo(this.mViewPortHandler.contentRight(), (float) pixelForValues.f52827y);
        canvas.drawPath(path, this.mZeroLinePaint);
        canvas.restoreToCount(iSave);
    }

    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    public float[] getTransformedPositions() {
        int length = this.mGetTransformedPositionsBuffer.length;
        int i14 = this.mYAxis.mEntryCount;
        if (length != i14 * 2) {
            this.mGetTransformedPositionsBuffer = new float[i14 * 2];
        }
        float[] fArr = this.mGetTransformedPositionsBuffer;
        for (int i15 = 0; i15 < fArr.length; i15 += 2) {
            fArr[i15 + 1] = this.mYAxis.mEntries[i15 / 2];
        }
        this.mTrans.pointValuesToPixel(fArr);
        return fArr;
    }

    public Path linePath(Path path, int i14, float[] fArr) {
        int i15 = i14 + 1;
        path.moveTo(this.mViewPortHandler.offsetLeft(), fArr[i15]);
        path.lineTo(this.mViewPortHandler.contentRight(), fArr[i15]);
        return path;
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fContentRight;
        float fContentRight2;
        float f14;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
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
            drawYLabels(canvas, f14, transformedPositions, yOffset);
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
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

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (this.mYAxis.isEnabled()) {
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                int iSave = canvas.save();
                canvas.clipRect(getGridClippingRect());
                float[] transformedPositions = getTransformedPositions();
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                Path path = this.mRenderGridLinesPath;
                path.reset();
                for (int i14 = 0; i14 < transformedPositions.length; i14 += 2) {
                    canvas.drawPath(linePath(path, i14, transformedPositions), this.mGridPaint);
                    path.reset();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.mYAxis.isDrawZeroLineEnabled()) {
                drawZeroLine(canvas);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.mRenderLimitLines;
        path.reset();
        for (int i14 = 0; i14 < limitLines.size(); i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(0.0f, -limitLine.getLineWidth());
                canvas.clipRect(this.mLimitLineClippingRect);
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
                canvas.restoreToCount(iSave);
            }
        }
    }
}
