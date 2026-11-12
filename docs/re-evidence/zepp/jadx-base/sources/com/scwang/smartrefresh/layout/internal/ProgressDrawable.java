package com.scwang.smartrefresh.layout.internal;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class ProgressDrawable extends Drawable implements Animatable {
    private ValueAnimator b;
    private Paint d;
    private int a = 0;
    private Path c = new Path();

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDrawable.this.a = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
            ProgressDrawable.this.invalidateSelf();
        }
    }

    public ProgressDrawable() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.d.setAntiAlias(true);
        this.d.setColor(-5592406);
        b();
    }

    private void b() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.b = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new a());
        this.b.setDuration(10000L);
        this.b.setInterpolator(new LinearInterpolator());
        this.b.setRepeatCount(-1);
        this.b.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        canvas.save();
        float f = iWidth / 2;
        int i = iHeight / 2;
        float f2 = i;
        canvas.rotate(this.a, f, f2);
        int iMax = Math.max(1, iWidth / 20);
        for (int i2 = 0; i2 < 12; i2++) {
            this.c.reset();
            float f3 = iWidth - iMax;
            float f4 = iMax;
            this.c.addCircle(f3, f2, f4, Path.Direction.CW);
            float f5 = iWidth - (iMax * 5);
            this.c.addRect(f5, i - iMax, f3, i + iMax, Path.Direction.CW);
            this.c.addCircle(f5, f2, f4, Path.Direction.CW);
            this.d.setAlpha((i2 + 5) * 17);
            canvas.rotate(30.0f, f, f2);
            canvas.drawPath(this.c, this.d);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int height() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    public void setColor(int i) {
        this.d.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.b.isRunning()) {
            return;
        }
        this.b.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.b.isRunning()) {
            this.b.cancel();
        }
    }

    public int width() {
        return getBounds().width();
    }
}
