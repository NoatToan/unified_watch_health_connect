package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class AxisRenderer extends Renderer {
    protected Paint mAxisLabelPaint;
    protected Paint mAxisLinePaint;
    protected Paint mGridPaint;
    protected Paint mLimitLinePaint;
    protected Transformer mTrans;

    public AxisRenderer(ViewPortHandler viewPortHandler, Transformer transformer) {
        super(viewPortHandler);
        this.mTrans = transformer;
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
