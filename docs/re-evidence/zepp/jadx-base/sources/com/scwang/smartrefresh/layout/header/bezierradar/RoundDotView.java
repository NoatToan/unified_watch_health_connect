package com.scwang.smartrefresh.layout.header.bezierradar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.ColorInt;
import com.scwang.smartrefresh.layout.util.DensityUtil;

/* JADX INFO: loaded from: classes18.dex */
public class RoundDotView extends View {
    private int a;
    private Paint b;
    private float c;
    private float d;

    public RoundDotView(Context context) {
        super(context);
        this.a = 7;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setColor(-1);
        this.c = DensityUtil.dp2px(7.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i = this.a;
        float f = this.d;
        float f2 = ((width / i) * f) - (f > 1.0f ? ((f - 1.0f) * (width / i)) / f : 0.0f);
        float f3 = height;
        float f4 = 2.0f;
        float f5 = f3 - (f > 1.0f ? (((f - 1.0f) * f3) / 2.0f) / f : 0.0f);
        int i2 = 0;
        while (true) {
            int i3 = this.a;
            if (i2 >= i3) {
                return;
            }
            float f6 = (i2 + 1.0f) - ((i3 + 1.0f) / f4);
            float fAbs = (1.0f - ((Math.abs(f6) / this.a) * f4)) * 255.0f;
            float fPx2dp = DensityUtil.px2dp(f3);
            double d = fAbs;
            float f7 = f2;
            this.b.setAlpha((int) (d * (1.0d - (1.0d / Math.pow((((double) fPx2dp) / 800.0d) + 1.0d, 15.0d)))));
            float f8 = this.c * (1.0f - (1.0f / ((fPx2dp / 10.0f) + 1.0f)));
            canvas.drawCircle(((width / 2) - (f8 / 2.0f)) + (f6 * f7), f5 / 2.0f, f8, this.b);
            i2++;
            f2 = f7;
            f4 = 2.0f;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public void setDotColor(@ColorInt int i) {
        this.b.setColor(i);
    }

    public void setFraction(float f) {
        this.d = f;
    }
}
