package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.media3.ui.DefaultTimeBar;

/* JADX INFO: loaded from: classes20.dex */
public class xfc extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f52827a;
    private float e;
    private RectF h;
    private long j;
    private Paint k;
    private ValueAnimator n;
    private float d = -80.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52828b = DefaultTimeBar.DEFAULT_UNPLAYED_COLOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52829c = true;
    private float f = 0.0f;
    private int g = 2;
    private boolean i = false;
    private boolean o = false;
    private boolean m = false;

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (xfc.this.o) {
                xfc.this.i();
                xfc.this.o = false;
            }
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwFlickerDrawable", "onAnimationUpdate: animation is null.");
            } else if (xfc.this.h()) {
                xfc.this.k();
                xfc.this.invalidateSelf();
            }
        }
    }

    public xfc(RectF rectF, int i, Paint paint) {
        this.h = rectF;
        this.k = paint;
        e(i);
        j();
    }

    private boolean f() {
        return this.g == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        n();
        float fG = this.d + (this.f * g());
        this.d = fG;
        if (Float.compare(fG, this.e) > 0) {
            int i = (int) this.e;
            if (i != 0) {
                this.d = (this.d % i) - 80.0f;
            }
            this.f52829c = true;
        }
    }

    private void l() {
        int i = this.f52828b;
        int i2 = 16777215 & i;
        this.f52827a.setShader(new SweepGradient(this.h.centerX(), this.h.centerY(), new int[]{i2, i, i2, i2}, new float[]{0.0f, 0.11f, 0.222f, 1.0f}));
    }

    private boolean m() {
        return this.g == 2;
    }

    private void n() {
        if (this.f52829c || this.m) {
            float f = this.e;
            this.f = (80.0f + f) / 2000.0f;
            if (Float.compare(f, 0.0f) != 0) {
                this.f52829c = false;
            }
        }
    }

    private void o() {
        setLevel(0);
        this.f52829c = true;
        this.g = 2;
    }

    public void a() {
        this.g = 0;
        this.o = false;
        if (e()) {
            return;
        }
        e(System.currentTimeMillis());
        this.d = -80.0f;
        this.n.start();
        this.n.setRepeatCount(-1);
    }

    public void a(int i) {
        Paint paint = this.f52827a;
        if (paint != null) {
            paint.setStrokeWidth(i);
        }
    }

    public float b() {
        return this.d;
    }

    public void c() {
        this.i = true;
        this.g = 1;
    }

    public void d() {
        this.i = false;
        a();
    }

    public void d(int i) {
        if (this.f52828b != i) {
            this.f52828b = i;
            l();
        }
    }

    public void d(boolean z) {
        this.m = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f52829c && (Float.compare(this.e, 360.0f) == 0 || f())) {
            this.o = true;
            return;
        }
        canvas.save();
        c(canvas, this.d);
        canvas.rotate(this.d, this.h.centerX(), this.h.centerY());
        float fMin = Float.compare(this.d + 80.0f, this.e) > 0 ? this.e - this.d : 80.0f;
        float f = this.d;
        if (f < 0.0f) {
            fMin = Math.min(this.e, f + fMin);
        }
        float f2 = fMin;
        float f3 = this.d;
        float f4 = f3 < 0.0f ? -f3 : 0.0f;
        l();
        canvas.drawArc(this.h, f4, f2, false, this.f52827a);
        canvas.restore();
    }

    public boolean e() {
        return this.n.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        if (e()) {
            this.n.cancel();
            o();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        this.e = (i * 360.0f) / 10000.0f;
        if (i < 10000) {
            if (!f()) {
                this.i = false;
            }
            if (m()) {
                this.g = 0;
            }
        } else {
            this.i = true;
            if (this.f52829c) {
                o();
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        boolean z;
        if (m() || (f() && this.f52829c)) {
            this.i = false;
            z = false;
        } else {
            z = true;
        }
        if (!this.i || !this.f52829c) {
            return z;
        }
        this.i = false;
        o();
        return false;
    }

    private void j() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new d());
        this.n.addListener(new b());
    }

    private void e(int i) {
        Paint paint = new Paint();
        this.f52827a = paint;
        paint.setAntiAlias(true);
        this.f52827a.setStrokeWidth(i);
        this.f52827a.setStrokeCap(Paint.Cap.SQUARE);
        this.f52827a.setStyle(Paint.Style.STROKE);
        l();
    }

    private void c(Canvas canvas, float f) {
        Path path = new Path();
        float fMin = Math.min(Math.max(0.0f, f), 360.0f);
        path.addArc(this.h, fMin, Float.compare(f, 0.0f) < 0 ? Math.min(80.0f, this.e) : this.e - fMin);
        this.k.getFillPath(path, path);
        canvas.clipPath(path);
    }

    private void e(long j) {
        this.j = j;
    }

    private long g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.j;
        e(jCurrentTimeMillis);
        return Math.max(0L, jCurrentTimeMillis - j);
    }
}
