package com.huami.chart.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.SparseArray;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.HMShadow;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.render.AxisRender;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AxisRender extends BaseRender<AxisStyle> {
    private static final String s = "AxisRender";
    private Path i;
    private Path j;
    private float k;
    private float l;
    private float m;
    private float n;
    private RectF o;
    private RectF p;
    private RectF q;
    private float r;

    public AxisRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.i = new Path();
        this.j = new Path();
        this.m = Float.NaN;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = Float.NaN;
    }

    private void f(float f, float f2) {
        float fTan = f - (((float) Math.tan((((double) this.n) * 3.141592653589793d) / 180.0d)) * this.k);
        float fTan2 = (float) Math.tan((((double) this.n) * 3.141592653589793d) / 180.0d);
        float f3 = this.l;
        float f4 = (fTan2 * f3) + f;
        RectF rectF = this.o;
        float f5 = this.k;
        rectF.left = fTan - f5;
        rectF.bottom = f2;
        rectF.top = f2 - (f5 * 2.0f);
        rectF.right = fTan + f5;
        RectF rectF2 = this.q;
        float f6 = this.m;
        rectF2.left = f - f6;
        rectF2.right = f + f6;
        rectF2.top = f2 - f6;
        rectF2.bottom = f6 + f2;
        RectF rectF3 = this.p;
        rectF3.left = f4 - f3;
        rectF3.bottom = f2;
        rectF3.top = f2 - (2.0f * f3);
        rectF3.right = f4 + f3;
    }

    private void g(Canvas canvas, float f, float f2, YAxisData yAxisData, float f3) {
        Paint yAxisScalePaint = this.paintProvider.getYAxisScalePaint();
        yAxisScalePaint.setColor(yAxisData.getYScaleLineColor() == null ? ((AxisStyle) this.mStyle).getyAxisScaleLineColor() : yAxisData.getYScaleLineColor().getRawColor());
        canvas.drawLine(f, f3, f2, f3, yAxisScalePaint);
    }

    private void h(Canvas canvas, float f, float f2, YAxisData yAxisData, float f3) {
        Paint yAxisScalePaint = this.paintProvider.getYAxisScalePaint();
        yAxisScalePaint.setColor(yAxisData.getYScaleLineColor() == null ? ((AxisStyle) this.mStyle).getYAxisScaleLongDashColor() : yAxisData.getYScaleLineColor().getRawColor());
        yAxisScalePaint.setPathEffect(new DashPathEffect(((AxisStyle) this.mStyle).getYAxisScaleLongDashIntervals(), 0.0f));
        canvas.drawLine(f, f3, f2, f3, yAxisScalePaint);
    }

    private float i(float f) {
        return n() + f + ((AxisStyle) this.mStyle).getBottomIndicatorBackgroundMarginTop();
    }

    private float j() {
        return ChartUtil.isRtl(this.hmChart) ? l() - ((AxisStyle) this.mStyle).getMidongLeftWidth() : l() + ((AxisStyle) this.mStyle).getMidongLeftWidth();
    }

    private float k(int i) {
        return ChartUtil.isRtl(this.hmChart) ? ((AxisStyle) this.mStyle).getxAxisMarginLeft() : (this.hmChart.getDrawAreaManager().getWidth() - ((AxisStyle) this.mStyle).getxAxisMarginRight()) - ChartUtil.calculateTextWidth(this.paintProvider.getXAxisLabelPaint(null), String.valueOf(i));
    }

    private float l() {
        return ChartUtil.isRtl(this.hmChart) ? this.hmChart.getDrawAreaManager().getWidth() - ((AxisStyle) this.mStyle).getxAxisMarginRight() : ((AxisStyle) this.mStyle).getxAxisMarginLeft();
    }

    private float m() {
        float f = 0.0f;
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 32) > 0 && ((AxisStyle) this.mStyle).getxAxisDatas() != null) {
            for (int canvasStart = getCanvasStart(); canvasStart <= getCanvasEnd() + 1; canvasStart++) {
                XAxisData xAxisData = ((AxisStyle) this.mStyle).getxAxisDatas().get(canvasStart);
                if (xAxisData != null) {
                    float fCalculateTextHeight = ChartUtil.calculateTextHeight(this.paintProvider.getXAxisLabelPaint(((AxisStyle) this.mStyle).getxLabelTypeface()), xAxisData.getTitle());
                    if (f < fCalculateTextHeight) {
                        f = fCalculateTextHeight;
                    }
                }
            }
        }
        return f;
    }

    private float n() {
        return this.hmChart.getDrawAreaManager().getBottom() + ((AxisStyle) this.mStyle).getxLabelMarginTop() + ((AxisStyle) this.mStyle).getXMovableLabelMarginTop();
    }

    private float o() {
        float f = 0.0f;
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 128) > 0 && ((AxisStyle) this.mStyle).getyAxisDatas() != null) {
            for (int i = 0; i < ((AxisStyle) this.mStyle).getyAxisDatas().size(); i++) {
                YAxisData yAxisData = ((AxisStyle) this.mStyle).getyAxisDatas().get(i);
                if (yAxisData != null) {
                    float fCalculateTextWidth = ChartUtil.calculateTextWidth(this.paintProvider.getYAxisLabelPaint(((AxisStyle) this.mStyle).getyLabelTypeface(), yAxisData.getYLabelColor()), yAxisData.getTitle());
                    if (f < fCalculateTextWidth) {
                        f = fCalculateTextWidth;
                    }
                }
            }
        }
        return f;
    }

    private float p(float f, XAxisData xAxisData, float f2, float f3) {
        if (((AxisStyle) this.mStyle).isIndentHeadAndTail()) {
            if (xAxisData == ((AxisStyle) this.mStyle).getxAxisDatas().valueAt(0)) {
                if (!ChartUtil.isRtl(this.hmChart)) {
                    return f;
                }
            } else if (xAxisData == ((AxisStyle) this.mStyle).getxAxisDatas().valueAt(((AxisStyle) this.mStyle).getxAxisDatas().size() - 1)) {
                if (ChartUtil.isRtl(this.hmChart)) {
                    return f;
                }
            }
            return f - f2;
        }
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q() {
        return "请调用setBottomIndicatorBitmap()方法";
    }

    /* JADX WARN: Code duplicated, block: B:119:0x05d4  */
    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        XAxisData xAxisData;
        float fAbs;
        XAxisData xAxisData2;
        super.draw(canvas, i, i2, f);
        float f2 = ((AxisStyle) this.mStyle).getxAxisMarginLeft();
        float width = this.hmChart.getDrawAreaManager().getWidth() - ((AxisStyle) this.mStyle).getxAxisMarginRight();
        float f3 = ((AxisStyle) this.mStyle).getyAxisMarginTop();
        float height = this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getyAxisMarginBottom();
        float height2 = this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getZeroY();
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 2) > 0) {
            canvas.drawLine(f2, height2, width, height2, this.paintProvider.getXAxisPaint());
        }
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 4) > 0) {
            canvas.drawLine(((AxisStyle) this.mStyle).getZeroX(), f3, ((AxisStyle) this.mStyle).getZeroX(), height, this.paintProvider.getYAxisPaint());
        }
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 256) > 0) {
            float height3 = this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getZeroY();
            double d = ((AxisStyle) this.mStyle).getxAxisArrowLength();
            float fCos = (float) (((double) width) - (Math.cos(0.7853981633974483d) * d));
            double d2 = height3;
            float fSin = (float) (d2 - (Math.sin(0.7853981633974483d) * d));
            float fSin2 = (float) (d2 + (d * Math.sin(0.7853981633974483d)));
            canvas.drawLine(width, height3, fCos, fSin, this.paintProvider.getXAxisArrowPaint());
            canvas.drawLine(width, height3, fCos, fSin2, this.paintProvider.getXAxisArrowPaint());
        }
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 1024) > 0) {
            float height4 = this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getZeroY();
            double d3 = ((AxisStyle) this.mStyle).getxAxisArrowLength();
            float fCos2 = (float) (((double) f2) + (Math.cos(0.7853981633974483d) * d3));
            double d4 = height4;
            float fSin3 = (float) (d4 - (Math.sin(0.7853981633974483d) * d3));
            float fSin4 = (float) (d4 + (d3 * Math.sin(0.7853981633974483d)));
            canvas.drawLine(f2, height4, fCos2, fSin3, this.paintProvider.getXAxisArrowPaint());
            canvas.drawLine(f2, height4, fCos2, fSin4, this.paintProvider.getXAxisArrowPaint());
        }
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 2048) > 0) {
            float zeroX = ((AxisStyle) this.mStyle).getZeroX();
            double d5 = zeroX;
            double d6 = ((AxisStyle) this.mStyle).getyAxisArrowLength();
            float fSin5 = (float) (d5 - (Math.sin(0.7853981633974483d) * d6));
            float fSin6 = (float) (d5 + (Math.sin(0.7853981633974483d) * d6));
            float fCos3 = (float) (((double) height) - (d6 * Math.cos(0.7853981633974483d)));
            canvas.drawLine(zeroX, height, fSin5, fCos3, this.paintProvider.getYAxisArrowPaint());
            canvas.drawLine(zeroX, height, fSin6, fCos3, this.paintProvider.getYAxisArrowPaint());
        }
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 512) > 0) {
            float zeroX2 = ((AxisStyle) this.mStyle).getZeroX();
            double d7 = zeroX2;
            double d8 = ((AxisStyle) this.mStyle).getyAxisArrowLength();
            float fSin7 = (float) (d7 - (Math.sin(0.7853981633974483d) * d8));
            float fSin8 = (float) (d7 + (Math.sin(0.7853981633974483d) * d8));
            float fCos4 = (float) (((double) f3) + (d8 * Math.cos(0.7853981633974483d)));
            canvas.drawLine(zeroX2, f3, fSin7, fCos4, this.paintProvider.getYAxisArrowPaint());
            canvas.drawLine(zeroX2, f3, fSin8, fCos4, this.paintProvider.getYAxisArrowPaint());
        }
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 4096) > 0) {
            canvas.drawRect(f2, this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getZeroY(), width, this.hmChart.getDrawAreaManager().getHeight(), this.paintProvider.getXAxisLabelBgPaint());
        }
        float fM = m();
        if ((((AxisStyle) this.mStyle).getBottomIndicatorShape() & 8) > 0) {
            this.i.reset();
            float fI = i(fM) + ((AxisStyle) this.mStyle).getBottomIndicatorBackgroundMarginTop();
            this.i.moveTo(0.0f, ((AxisStyle) this.mStyle).getBottomIndicatorBackgroundHeight() + fI);
            this.i.lineTo(0.0f, fI);
            this.i.lineTo(this.hmChart.getDrawAreaManager().getWidth(), fI);
            this.i.lineTo(this.hmChart.getDrawAreaManager().getWidth(), fI + ((AxisStyle) this.mStyle).getBottomIndicatorBackgroundHeight());
            canvas.drawPath(this.i, this.paintProvider.getBottomIndicatorBackgroundPaint(((AxisStyle) this.mStyle).getBottomIndicatorBackgroundColor()));
        }
        if ((((AxisStyle) this.mStyle).getBottomIndicatorShape() & 2) > 0) {
            if (Float.isNaN(this.m)) {
                float bottomIndicatorCircleRadius = ((AxisStyle) this.mStyle).getBottomIndicatorCircleRadius() * 2.0f;
                this.m = bottomIndicatorCircleRadius;
                float f4 = bottomIndicatorCircleRadius * 2.0f;
                this.k = f4;
                this.l = bottomIndicatorCircleRadius * 2.0f;
                this.n = (float) Math.toDegrees(Math.acos(f4 / (bottomIndicatorCircleRadius + f4)));
            }
            if (this.o == null) {
                this.o = new RectF();
                this.q = new RectF();
                this.p = new RectF();
            }
            if (!((AxisStyle) this.mStyle).isInteractiveUpCancel() || !isFingerUp()) {
                float adjustedDownX = getAdjustedDownX();
                if (!((AxisStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                    adjustedDownX = adjustedHasDataX(adjustedDownX);
                }
                float fI2 = i(fM) + ((AxisStyle) this.mStyle).getBottomIndicatorBackgroundMarginTop();
                f(adjustedDownX, fI2);
                this.j.reset();
                this.j.moveTo(this.o.centerX(), fI2);
                this.j.arcTo(this.o, 90.0f, -this.n);
                Path path = this.j;
                RectF rectF = this.q;
                float f5 = this.n;
                path.arcTo(rectF, 270.0f - f5, f5 * 2.0f);
                Path path2 = this.j;
                RectF rectF2 = this.p;
                float f6 = this.n;
                path2.arcTo(rectF2, 90.0f + f6, -f6);
                this.j.lineTo(this.p.centerX(), fI2);
                canvas.drawPath(this.j, this.paintProvider.getBottomIndicatorBackgroundPaint(((AxisStyle) this.mStyle).getBottomIndicatorBackgroundColor()));
            }
        }
        if (!((AxisStyle) this.mStyle).isInteractiveUpCancel() || !isFingerUp()) {
            if ((((AxisStyle) this.mStyle).getBottomIndicatorShape() & 2) > 0) {
                float adjustedDownX2 = getAdjustedDownX();
                if (!((AxisStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                    adjustedDownX2 = adjustedHasDataX(adjustedDownX2);
                }
                float bottomIndicatorCircleRadius2 = ((AxisStyle) this.mStyle).getBottomIndicatorCircleRadius();
                this.r = this.q.width();
                Paint bottomIndicatorShapePaint = this.paintProvider.getBottomIndicatorShapePaint(((AxisStyle) this.mStyle).getBottomIndicatorTintColor());
                HMShadow bottomIndicatorShadow = ((AxisStyle) this.mStyle).getBottomIndicatorShadow();
                if (bottomIndicatorShadow != null) {
                    bottomIndicatorShapePaint.setShadowLayer(bottomIndicatorShadow.getShadowRadius(), bottomIndicatorShadow.getShadowDx(), bottomIndicatorShadow.getShadowDy(), bottomIndicatorShadow.getShadowColor());
                }
                canvas.drawCircle(adjustedDownX2, this.q.top + ((AxisStyle) this.mStyle).getBottomIndicatorShapeMarginTop() + bottomIndicatorCircleRadius2, bottomIndicatorCircleRadius2, bottomIndicatorShapePaint);
            } else if ((((AxisStyle) this.mStyle).getBottomIndicatorShape() & 4) > 0) {
                if (((AxisStyle) this.mStyle).getBottomIndicatorBitmap() != null) {
                    float adjustedDownX3 = getAdjustedDownX();
                    if (!((AxisStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                        adjustedDownX3 = adjustedHasDataX(adjustedDownX3);
                    }
                    Bitmap bitmapTintBitmap = ((AxisStyle) this.mStyle).getBottomIndicatorTintColor() != -7829368 ? ChartUtil.tintBitmap(((AxisStyle) this.mStyle).getBottomIndicatorBitmap(), ((AxisStyle) this.mStyle).getBottomIndicatorTintColor()) : ((AxisStyle) this.mStyle).getBottomIndicatorBitmap();
                    this.r = bitmapTintBitmap.getWidth();
                    canvas.drawBitmap(bitmapTintBitmap, adjustedDownX3 - (bitmapTintBitmap.getWidth() / 2), i(fM), this.paintProvider.getXAxisPaint());
                } else {
                    HMLog.error(s, new Function0() { // from class: cl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AxisRender.q();
                        }
                    });
                }
            }
        }
        for (int canvasStart = getCanvasStart(); canvasStart <= getCanvasEnd() + 1; canvasStart++) {
            float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(canvasStart));
            if ((((AxisStyle) this.mStyle).getAxisStyle() & 8) > 0 && ((AxisStyle) this.mStyle).getxAxisDatas() != null && (xAxisData2 = ((AxisStyle) this.mStyle).getxAxisDatas().get(canvasStart)) != null) {
                float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(xAxisData2.getIndex()));
                canvas.drawLine(shownDataHorizonalValue2, this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getZeroY(), shownDataHorizonalValue2, (this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getZeroY()) - ((AxisStyle) this.mStyle).getxAxisScaleLineHeight(), this.paintProvider.getXAxisScalePaint());
            }
            if ((((AxisStyle) this.mStyle).getAxisStyle() & 32) > 0 && ((AxisStyle) this.mStyle).getxAxisDatas() != null && (xAxisData = ((AxisStyle) this.mStyle).getxAxisDatas().get(canvasStart)) != null) {
                String title = xAxisData.getTitle();
                Paint xAxisLabelPaint = this.paintProvider.getXAxisLabelPaint(((AxisStyle) this.mStyle).getxLabelTypeface());
                float fCalculateTextWidth = ChartUtil.calculateTextWidth(xAxisLabelPaint, title);
                float f7 = fCalculateTextWidth / 2.0f;
                float f8 = this.r + f7;
                float fP = p(shownDataHorizonalValue, xAxisData, fCalculateTextWidth, ((AxisStyle) this.mStyle).isLabelCenter() ? shownDataHorizonalValue - f7 : ChartUtil.isRtl(this.hmChart) ? shownDataHorizonalValue - fCalculateTextWidth : shownDataHorizonalValue);
                float adjustedDownX4 = getAdjustedDownX();
                if (!((AxisStyle) this.mStyle).isXLabelAnimate() || Float.isNaN(this.r) || this.r == 0.0f) {
                    fAbs = 1.0f;
                } else {
                    if (!((AxisStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                        adjustedDownX4 = adjustedHasDataX(adjustedDownX4);
                    }
                    if (!(((AxisStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) && adjustedDownX4 >= shownDataHorizonalValue - f8 && adjustedDownX4 <= shownDataHorizonalValue + f8) {
                        fAbs = Math.abs(shownDataHorizonalValue - adjustedDownX4) / f8;
                    } else {
                        fAbs = 1.0f;
                    }
                }
                float xMovableLabelMarginTop = fAbs * ((AxisStyle) this.mStyle).getXMovableLabelMarginTop();
                if (((AxisStyle) this.mStyle).getXLabelHighlightColor() != -7829368 && highlight(canvasStart)) {
                    xAxisLabelPaint.setColor(((AxisStyle) this.mStyle).getXLabelHighlightColor());
                }
                canvas.drawText(title, fP, this.hmChart.getDrawAreaManager().getBottom() + ((AxisStyle) this.mStyle).getxLabelMarginTop() + fM + xMovableLabelMarginTop, xAxisLabelPaint);
                if ((((AxisStyle) this.mStyle).getAxisStyle() & 64) > 0) {
                    Paint xAxisSubLabelPaint = this.paintProvider.getXAxisSubLabelPaint(((AxisStyle) this.mStyle).getxSubLabelTypeface());
                    String subTitle = xAxisData.getSubTitle();
                    float fCalculateTextWidth2 = ChartUtil.calculateTextWidth(xAxisSubLabelPaint, subTitle);
                    float height5 = (this.hmChart.getDrawAreaManager().getHeight() - ((AxisStyle) this.mStyle).getZeroY()) + ((AxisStyle) this.mStyle).getxLabelMarginTop() + ((AxisStyle) this.mStyle).getxSubLabelMarginTop() + fM + ChartUtil.calculateTextHeight(xAxisSubLabelPaint, subTitle);
                    if (((AxisStyle) this.mStyle).isLabelCenter()) {
                        fCalculateTextWidth2 /= 2.0f;
                    } else {
                        if (ChartUtil.isRtl(this.hmChart)) {
                        }
                        canvas.drawText(subTitle, shownDataHorizonalValue, height5, xAxisSubLabelPaint);
                    }
                    shownDataHorizonalValue -= fCalculateTextWidth2;
                    canvas.drawText(subTitle, shownDataHorizonalValue, height5, xAxisSubLabelPaint);
                }
            }
        }
        SparseArray<YAxisData> sparseArray = ((AxisStyle) this.mStyle).getyAxisDatas();
        if (sparseArray != null) {
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                YAxisData yAxisDataValueAt = sparseArray.valueAt(i3);
                if (yAxisDataValueAt != null) {
                    String title2 = yAxisDataValueAt.getTitle();
                    float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(yAxisDataValueAt.getValue()));
                    if ((((AxisStyle) this.mStyle).getAxisStyle() & 128) > 0) {
                        float fO = ((AxisStyle) this.mStyle).isyAxisRight() ? o() : ChartUtil.calculateTextWidth(this.paintProvider.getYAxisLabelPaint(((AxisStyle) this.mStyle).getyLabelTypeface(), yAxisDataValueAt.getYLabelColor()), title2);
                        Paint yAxisLabelPaint = this.paintProvider.getYAxisLabelPaint(((AxisStyle) this.mStyle).getyLabelTypeface(), yAxisDataValueAt.getYLabelColor());
                        if (((AxisStyle) this.mStyle).getAbsoluteZeroX() > 0.0f) {
                            canvas.drawText(title2, ((AxisStyle) this.mStyle).getAbsoluteZeroX() + ((AxisStyle) this.mStyle).getyLabelMarginYAxis(), shownDataVerticalValue + (ChartUtil.calculateTextHeight(yAxisLabelPaint, title2) / 2.0f), yAxisLabelPaint);
                        } else {
                            canvas.drawText(title2, (((AxisStyle) this.mStyle).getZeroX() - ((AxisStyle) this.mStyle).getyLabelMarginYAxis()) - fO, shownDataVerticalValue + (ChartUtil.calculateTextHeight(yAxisLabelPaint, title2) / 2.0f), yAxisLabelPaint);
                        }
                    }
                }
            }
        }
        SparseArray<YAxisData> sparseArray2 = ((AxisStyle) this.mStyle).getyAxisScaleDatas() == null ? ((AxisStyle) this.mStyle).getyAxisDatas() : ((AxisStyle) this.mStyle).getyAxisScaleDatas();
        if (sparseArray2 != null) {
            for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                YAxisData yAxisDataValueAt2 = sparseArray2.valueAt(i4);
                if (yAxisDataValueAt2 != null) {
                    float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValue(yAxisDataValueAt2.getValue()));
                    if ((((AxisStyle) this.mStyle).getAxisStyle() & 16) > 0) {
                        canvas.drawLine(((AxisStyle) this.mStyle).getZeroX(), shownDataVerticalValue2, ((AxisStyle) this.mStyle).getZeroX() - ((AxisStyle) this.mStyle).getyLabelMarginYAxis(), shownDataVerticalValue2, this.paintProvider.getYAxisScalePaint());
                    }
                    if ((yAxisDataValueAt2.getYScaleLineStyle() & 16) > 0) {
                        g(canvas, f2, width, yAxisDataValueAt2, shownDataVerticalValue2);
                    } else if ((yAxisDataValueAt2.getYScaleLineStyle() & 32768) > 0) {
                        h(canvas, f2, width, yAxisDataValueAt2, shownDataVerticalValue2);
                    } else {
                        if ((((AxisStyle) this.mStyle).getAxisStyle() & 16384) > 0) {
                            g(canvas, f2, width, yAxisDataValueAt2, shownDataVerticalValue2);
                        }
                        if ((((AxisStyle) this.mStyle).getAxisStyle() & 32768) > 0) {
                            h(canvas, f2, width, yAxisDataValueAt2, shownDataVerticalValue2);
                        }
                    }
                }
            }
        }
        if ((((AxisStyle) this.mStyle).getAxisStyle() & 8192) > 0) {
            canvas.drawRect(l(), getPositionByValue(-6.67f), j(), height2, this.paintProvider.getMidongPaint(((AxisStyle) this.mStyle).getMidongColors()[0]));
            canvas.drawRect(l(), getPositionByValue(6.67f), j(), getPositionByValue(-6.67f), this.paintProvider.getMidongPaint(((AxisStyle) this.mStyle).getMidongColors()[1]));
            canvas.drawRect(l(), getPositionByValue(20.0f), j(), getPositionByValue(6.67f), this.paintProvider.getMidongPaint(((AxisStyle) this.mStyle).getMidongColors()[2]));
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = (i5 * 10) - 20;
                canvas.drawText(String.valueOf(i6), k(i6), getPositionByValue(i6), this.paintProvider.getXAxisLabelPaint(null));
            }
        }
    }
}
