package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;

/* JADX INFO: loaded from: classes20.dex */
public class xey extends BitmapDrawable implements Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f52812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52814c;
    private ValueAnimator d;
    private float e;
    private Interpolator f;
    private float g;
    private float h;
    private float i;
    private float j;

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            xey.this.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    private static Bitmap a(int i) {
        if (i > 250) {
            i = 250;
        } else if (i <= 0) {
            i = 1;
        }
        return Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    private void c(int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.d.setRepeatCount(-1);
        this.d.setInterpolator(new LinearInterpolator());
        Paint paint = new Paint();
        this.f52812a = paint;
        this.j = 0.0f;
        this.g = 0.0f;
        this.f52813b = i;
        paint.setColor(i);
        this.f52812a.setAntiAlias(true);
        this.d.addUpdateListener(new e());
    }

    public void b(float f) {
        this.e = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (canvas == null) {
            Log.w("HwLoadingDrawableImpl", "draw: canvas is null");
            return;
        }
        this.f52812a.setColor(this.f52813b);
        if (this.e * 60.0f >= 60.0f) {
            this.e = 0.0f;
        }
        canvas.save();
        for (int i = 0; i < 12; i++) {
            float f = (this.e * 60.0f) + (i * 5);
            this.f52812a.setAlpha(((int) c(f, false)) + 127);
            canvas.drawCircle(this.i, this.h, this.f52814c + (((float) c(f, true)) * this.f52814c), this.f52812a);
            canvas.rotate(-30.0f, this.j, this.g);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.d;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return;
        }
        this.d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.d.end();
    }

    public xey(Resources resources, int i, int i2) {
        super(resources, a(i));
        this.e = 0.0f;
        this.f = new HwCubicBezierInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        c(i2);
    }

    private float a() {
        Rect bounds = getBounds();
        float f = (bounds.left + bounds.right) / 2.0f;
        this.j = f;
        float f2 = (bounds.top + bounds.bottom) / 2.0f;
        this.g = f2;
        return f < f2 ? f : f2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    private double c(float f, boolean z) {
        double d;
        float interpolation;
        float f2 = f % 60.0f;
        if (f2 < 0.0f || f2 >= 10.0f) {
            if (f2 < 10.0f || f2 >= 33.076923f) {
                if (f2 < 33.076923f || f2 >= 60.0f) {
                    Log.w("HwLoadingDrawableImpl", "invalid tempFrame");
                }
                d = 0.0d;
            } else {
                interpolation = this.f.getInterpolation((f2 * (-0.043333333f)) + 1.0f + 0.43333334f);
            }
            if (z) {
                return d;
            }
            return (int) (d * 128.0d);
        }
        interpolation = this.f.getInterpolation(f2 * 0.1f);
        d = interpolation;
        if (z) {
            return d;
        }
        return (int) (d * 128.0d);
    }

    private void e() {
        float fA = a() * 0.6944444f;
        this.f52814c = 0.1f * fA;
        this.i = this.j;
        this.h = this.g - fA;
    }
}
