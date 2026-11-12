package com.huami.watch.dataflow.chart.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes16.dex */
public abstract class PieChart extends BaseChart<Chart.Item> {
    public float alpha;
    public float mMaxValue;
    public float mRadius;
    public float mRate;
    public float mRotate;
    public float mValue;

    public PieChart(Context context) {
        super(context);
        this.alpha = -1.0f;
    }

    public void alpha(int i) {
        this.alpha = i;
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChart
    public void draw(Canvas canvas, RectF rectF, float f) {
        float f2 = rectF.left;
        float f3 = this.mRadius;
        drawPie(canvas, rectF, f2 + f3, rectF.top + f3, f3, this.mRate, f);
    }

    public abstract void drawPie(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, float f5);

    public float getMaxValue() {
        return this.mMaxValue;
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChart
    public void onRectChanged(RectF rectF) {
        this.mRadius = Math.min(rectF.width(), rectF.height()) / 2.0f;
    }

    public void rotate(float f) {
        this.mRotate = f;
    }

    public void setMaxValue(float f) {
        this.mMaxValue = f;
        updateRate();
    }

    public void setValue(float f) {
        this.mValue = f;
        updateRate();
    }

    public void updateRate() {
        float f = this.mMaxValue;
        if (f == 0.0f) {
            this.mRate = 0.0f;
            return;
        }
        float f2 = this.mValue;
        if (f2 >= f) {
            this.mRate = 1.0f;
        } else {
            this.mRate = f2 / f;
        }
    }
}
