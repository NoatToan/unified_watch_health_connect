package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public class ClipCircleBorderView extends View {
    private Path a;
    private int b;
    private Paint c;
    private int d;

    public ClipCircleBorderView(Context context) {
        this(context, null);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a == null) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int i = width - this.d;
            this.c.setStrokeWidth(dip2px(getContext(), 2.0f));
            this.b = i;
            Path path = new Path();
            this.a = path;
            int i2 = this.b;
            path.addArc(new RectF(width - i2, height - i2, width + i2, height + i2), 0.0f, 360.0f);
        }
        canvas.clipPath(this.a, Region.Op.DIFFERENCE);
        canvas.drawColor(Color.parseColor("#B8000000"));
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.b, this.c);
    }

    public void setHorizontalPadding(int i) {
        this.d = i;
    }

    public ClipCircleBorderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipCircleBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.c.setColor(Color.parseColor("#FFFFFF"));
        this.c.setStyle(Paint.Style.STROKE);
    }
}
