package com.huami.chart.provider;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import com.huami.chart.chart.HMChart;
import com.huami.chart.provider.MyPaint;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.HMColor;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class MyPaint extends PaintProvider {
    private static final String c = "MyPaint";
    private Paint a;
    private RenderConfig b;

    public MyPaint(HMChart hMChart) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-7829368);
        this.b = hMChart.getRenderConfigManager().getRenderConfig();
    }

    private int d(int i) {
        try {
            return this.b.getMultiLineStyle().getLineColors()[i];
        } catch (Exception e) {
            HMLog.info(c, new Function0() { // from class: mb5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MyPaint.f(e);
                }
            });
            if (this.b.getLineStyle() != null) {
                return this.b.getLineStyle().getLineColor();
            }
            return -1;
        }
    }

    private Shader e(int i) {
        try {
            return this.b.getMultiLineStyle().getLinesShader()[i];
        } catch (Exception unused) {
            if (this.b.getLineStyle() != null) {
                return this.b.getLineStyle().getLineShader();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Exception exc) {
        return "getLineColors error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "lineShader ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "null lineShader ";
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getBackgroundGridPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getBackgroundStyle().getGridLineColor());
        this.a.setStrokeWidth(renderConfig.getBackgroundStyle().getGridLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getBackgroundPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        int backgroundStyle = this.b.getBackgroundStyle().getBackgroundStyle();
        if (backgroundStyle == 2) {
            this.a.setColor(this.b.getBackgroundStyle().getBackgroundColor());
        } else if (backgroundStyle == 4) {
            this.a.setStrokeWidth(this.b.getBackgroundStyle().getGridLineWidth());
            this.a.setColor(this.b.getBackgroundStyle().getGridLineColor());
        }
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getBarChartPaint(boolean z, HMColor hMColor) {
        int hightlightColor;
        this.a.reset();
        if (hMColor == null) {
            hightlightColor = z ? -1 : -7829368;
        } else {
            hightlightColor = z ? hMColor.getHightlightColor() : hMColor.getRawColor();
        }
        this.a.setColor(hightlightColor);
        this.a.setAntiAlias(true);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getBottomIndicatorBackgroundPaint(int i) {
        this.a.setAntiAlias(true);
        this.a.setColor(i);
        this.a.setStyle(Paint.Style.FILL);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getBottomIndicatorShapePaint(int i) {
        this.a.setAntiAlias(true);
        this.a.setColor(i);
        this.a.setStyle(Paint.Style.FILL);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getGapPointPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setColor(this.b.getLineStyle().getLineColor());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getGapSubPointPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setColor(this.b.getLineStyle().getSubLineColor());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getGoalLineLabelPaint(int i) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setTextSize(this.b.getGoalLineStyle().getGoalLineLabelSize());
        int[] goalLineLabelColors = this.b.getGoalLineStyle().getGoalLineLabelColors();
        if (goalLineLabelColors != null) {
            this.a.setColor(i < goalLineLabelColors.length ? goalLineLabelColors[i] : -7829368);
        } else {
            this.a.setColor(-7829368);
        }
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getGoalLinePaint(int i) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(this.b.getGoalLineStyle().getGoalLineWidth());
        this.a.setPathEffect(new DashPathEffect(this.b.getGoalLineStyle().getDashLineInterval(), 1.0f));
        int[] goalLineColors = this.b.getGoalLineStyle().getGoalLineColors();
        if (goalLineColors != null) {
            this.a.setColor(i < goalLineColors.length ? goalLineColors[i] : -7829368);
        } else {
            this.a.setColor(-7829368);
        }
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getInteractiveLinePaint(int i) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setColor(i);
        this.a.setStyle(Paint.Style.FILL);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getLineBgJoinPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setColor(this.b.getLineJoinStyle().getEdgeColor());
        this.a.setStrokeJoin(Paint.Join.ROUND);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getLineJoinPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        if (this.b.getLineJoinStyle().getLineJointStyle() == 4) {
            this.a.setStyle(Paint.Style.STROKE);
        } else {
            this.a.setStyle(Paint.Style.FILL);
        }
        this.a.setColor(this.b.getLineJoinStyle().getLineJointColor());
        this.a.setStrokeJoin(Paint.Join.ROUND);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getLinePaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setColor(this.b.getLineStyle().getLineColor());
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeJoin(Paint.Join.ROUND);
        if (this.b.getLineStyle().getLineShadowRadius() >= 0.0f) {
            this.a.setShadowLayer(this.b.getLineStyle().getLineShadowRadius(), this.b.getLineStyle().getLineShadowDx(), this.b.getLineStyle().getLineShadowDy(), this.b.getLineStyle().getLineShadowColor());
        }
        if (this.b.getLineStyle().getLineShader() != null) {
            this.a.setShader(this.b.getLineStyle().getLineShader());
        }
        this.a.setStrokeWidth(this.b.getLineStyle().getLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getMidongPaint(int i) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setColor(i);
        this.a.setStyle(Paint.Style.FILL);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getMultiLineGapPointPaint(int i) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setColor(d(i));
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getMultiLinePaint(int i) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setColor(d(i));
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeJoin(Paint.Join.ROUND);
        if (this.b.getMultiLineStyle().getLineShadowRadius() >= 0.0f) {
            this.a.setShadowLayer(this.b.getMultiLineStyle().getLineShadowRadius(), this.b.getMultiLineStyle().getLineShadowDx(), this.b.getMultiLineStyle().getLineShadowDy(), this.b.getMultiLineStyle().getLineShadowColor());
        }
        Shader shaderE = e(i);
        if (shaderE != null) {
            this.a.setShader(shaderE);
        }
        this.a.setStrokeWidth(this.b.getMultiLineStyle().getLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getNoDataTextPaint() {
        NoDataStyle noDataStyle = this.b.getNoDataStyle();
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setColor(noDataStyle.getNoDataLabelColor());
        this.a.setTextSize(noDataStyle.getNoDataLabelSize());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getPointPaint(int i) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setColor(i);
        this.a.setStyle(Paint.Style.FILL);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getSectionLinePaint(int i) {
        this.a.setAntiAlias(true);
        this.a.setColor(i);
        this.a.setStrokeWidth(this.b.getSectionLineStyle().getLineWidth());
        this.a.setStyle(Paint.Style.FILL);
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getSubLinePaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setColor(this.b.getLineStyle().getSubLineColor());
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeJoin(Paint.Join.ROUND);
        if (this.b.getLineStyle().getSubLineShader() != null) {
            HMLog.verbose(c, new Function0() { // from class: nb5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MyPaint.g();
                }
            });
            this.a.setShader(this.b.getLineStyle().getSubLineShader());
        } else {
            HMLog.verbose(c, new Function0() { // from class: ob5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MyPaint.h();
                }
            });
        }
        this.a.setStrokeWidth(this.b.getLineStyle().getLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getSubPointPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setColor(this.b.getLineStyle().getSubPointColor());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getValuePaint(boolean z) {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        RenderConfig renderConfig = this.b;
        this.a.setColor(z ? renderConfig.getValueStyle().getValueColor().getHightlightColor() : renderConfig.getValueStyle().getValueColor().getRawColor());
        this.a.setTextSize(renderConfig.getValueStyle().getValueTextSize());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getXAxisArrowPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getAxisStyle().getxAxisLineColor());
        this.a.setStrokeWidth(renderConfig.getAxisStyle().getxAxisLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getXAxisLabelBgPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setColor(this.b.getAxisStyle().getxAxisLabelBgColor());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getXAxisLabelPaint(Typeface typeface) {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getAxisStyle().getxLabelColor());
        this.a.setTextSize(renderConfig.getAxisStyle().getxLabelSize());
        if (typeface != null) {
            this.a.setTypeface(typeface);
        }
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getXAxisPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getAxisStyle().getxAxisLineColor());
        this.a.setStrokeWidth(renderConfig.getAxisStyle().getxAxisLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getXAxisScalePaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getAxisStyle().getxAxisScaleLineColor());
        this.a.setStrokeWidth(renderConfig.getAxisStyle().getxAxisScaleLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getXAxisSubLabelPaint(Typeface typeface) {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getAxisStyle().getxSubLabelColor());
        this.a.setTextSize(renderConfig.getAxisStyle().getxSubLabelSize());
        if (typeface != null) {
            this.a.setTypeface(typeface);
        }
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getYAxisArrowPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getAxisStyle().getyAxisLineColor());
        this.a.setStrokeWidth(renderConfig.getAxisStyle().getyAxisLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getYAxisLabelPaint(Typeface typeface, HMColor hMColor) {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(hMColor != null ? hMColor.getRawColor() : renderConfig.getAxisStyle().getyLabelColor());
        this.a.setTextSize(renderConfig.getAxisStyle().getyLabelSize());
        if (typeface != null) {
            this.a.setTypeface(typeface);
        }
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getYAxisPaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        RenderConfig renderConfig = this.b;
        this.a.setColor(renderConfig.getAxisStyle().getyAxisLineColor());
        this.a.setStrokeWidth(renderConfig.getAxisStyle().getyAxisLineWidth());
        return this.a;
    }

    @Override // com.huami.chart.provider.PaintProvider
    public Paint getYAxisScalePaint() {
        this.a.reset();
        this.a.setAntiAlias(true);
        this.a.setColor(this.b.getAxisStyle().getyAxisScaleLineColor());
        this.a.setStrokeWidth(this.b.getAxisStyle().getyAxisScaleLineWidth());
        return this.a;
    }
}
