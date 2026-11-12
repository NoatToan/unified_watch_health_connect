package com.huami.watch.dataflow.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huami.watch.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CirclePieChartView extends View {
    private static final float e = -90.0f;
    private static final float f = 360.0f;
    private static final int g = 400;
    private static final int h = 400;
    private List<PieChartData> a;
    private RectF b;
    private Paint c;
    private float d;

    public static class PieChartData {
        public float a;
        public int b;

        public PieChartData(float f, int i) {
            this.a = f;
            this.b = i;
        }
    }

    public CirclePieChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new RectF();
        this.d = DensityUtil.dpToPx(context, 18.0f);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.c.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<PieChartData> list = this.a;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.a.size();
        int i = 0;
        float f2 = -90.0f;
        while (i < size) {
            PieChartData pieChartData = this.a.get(i);
            float f3 = i == size + (-1) ? (360.0f - f2) - 90.0f : (pieChartData.a * 360.0f) / 100.0f;
            this.c.setColor(pieChartData.b);
            canvas.drawArc(this.b, f2, f3, true, this.c);
            f2 += f3;
            i++;
        }
        this.c.setColor(Color.parseColor("#ffffffff"));
        canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.d, this.c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(400, 400);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(400, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, 400);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.b;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        float f2 = i2;
        rectF.right = f2;
        rectF.bottom = f2;
    }

    public void setData(List<PieChartData> list) {
        this.a = list;
        invalidate();
    }
}
