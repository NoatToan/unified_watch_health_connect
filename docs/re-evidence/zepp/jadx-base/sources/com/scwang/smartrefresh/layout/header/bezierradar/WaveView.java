package com.scwang.smartrefresh.layout.header.bezierradar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes18.dex */
public class WaveView extends View {
    private int a;
    private int b;
    private Path c;
    private Paint d;
    private int e;

    public WaveView(Context context) {
        this(context, null, 0);
    }

    private void a() {
        this.c = new Path();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-14736346);
        this.d.setAntiAlias(true);
    }

    public int getHeadHeight() {
        return this.b;
    }

    public int getWaveHeight() {
        return this.a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        this.c.reset();
        this.c.lineTo(0.0f, this.b);
        Path path = this.c;
        int i = this.e;
        if (i < 0) {
            i = width / 2;
        }
        int i2 = this.b;
        float f = width;
        path.quadTo(i, this.a + i2, f, i2);
        this.c.lineTo(f, 0.0f);
        canvas.drawPath(this.c, this.d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public void setHeadHeight(int i) {
        this.b = i;
    }

    public void setWaveColor(@ColorInt int i) {
        this.d.setColor(i);
    }

    public void setWaveHeight(int i) {
        this.a = i;
    }

    public void setWaveOffsetX(int i) {
        this.e = i;
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = -1;
        a();
    }
}
