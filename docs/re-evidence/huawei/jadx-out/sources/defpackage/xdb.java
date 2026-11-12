package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.huawei.uikit.animations.drawable.HwGravitationalLoadingDrawable;

/* JADX INFO: loaded from: classes20.dex */
public class xdb extends HwGravitationalLoadingDrawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f52726b;
    private ValueAnimator d;
    private ValueAnimator e;
    private boolean h;
    private boolean i;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwSeekableLoadingAnim", "onAnimationUpdate:null animator");
            } else {
                xdb.this.f29184a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xdb.this.invalidateSelf();
            }
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdb.this.e.start();
            xdb.super.e(false);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwSeekableLoadingAnim", "onAnimationUpdate: null animator");
            } else {
                xdb.this.f29184a.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xdb.this.invalidateSelf();
            }
        }
    }

    xdb(HwGravitationalLoadingDrawable.j jVar, HwGravitationalLoadingDrawable.h hVar, int i, float f) {
        super(jVar, hVar, i, f);
        this.i = true;
        this.h = false;
        b();
        this.f29184a.b(0.0f);
    }

    private void b() {
        e();
        g();
        j();
    }

    public static xdb e(int i, HwGravitationalLoadingDrawable.a aVar, DisplayMetrics displayMetrics, int i2) {
        if (i2 <= 0) {
            i2 = 1200;
        }
        int iD = HwGravitationalLoadingDrawable.d(i);
        return new xdb(HwGravitationalLoadingDrawable.a(iD, aVar), HwGravitationalLoadingDrawable.d(iD, aVar), i2, displayMetrics.density);
    }

    private void e() {
        this.d = b.a(-8.0f, 15.0f);
    }

    private void g() {
        ValueAnimator valueAnimatorD = b.d(15.0f, 35.0f);
        this.f52726b = valueAnimatorD;
        valueAnimatorD.addUpdateListener(new e());
        this.f52726b.addListener(new d());
    }

    private void j() {
        ValueAnimator valueAnimatorD = b.d(60.0f, 480L);
        this.e = valueAnimatorD;
        valueAnimatorD.addUpdateListener(new a());
    }

    public void a() {
        this.i = true;
        setLevel(10000);
        start();
    }

    public void c() {
        stop();
        this.i = false;
    }

    @Override // com.huawei.uikit.animations.drawable.HwGravitationalLoadingDrawable, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (isRunning()) {
            return false;
        }
        c(i / 10000.0f);
        return true;
    }

    @Override // com.huawei.uikit.animations.drawable.HwGravitationalLoadingDrawable, android.graphics.drawable.Animatable
    public void start() {
        if (!isRunning() && this.i) {
            this.f52726b.start();
            this.h = true;
        }
    }

    @Override // com.huawei.uikit.animations.drawable.HwGravitationalLoadingDrawable, android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            this.f52726b.cancel();
            this.e.cancel();
            this.f29184a.b(0.0f);
            this.h = false;
            super.stop();
        }
    }

    private void c(float f) {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.setCurrentPlayTime((long) (f * valueAnimator.getDuration()));
        this.f29186c.d(((Float) this.d.getAnimatedValue("scale")).floatValue());
        this.f29184a.c(((Float) this.d.getAnimatedValue("degrees")).floatValue());
        invalidateSelf();
    }

    static class b {
        b() {
        }

        static ValueAnimator a(float f, float f2) {
            return ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("scale", 0.5f, 1.0f), PropertyValuesHolder.ofFloat("degrees", f, f2));
        }

        static ValueAnimator d(float f, float f2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
            valueAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.6f, 0.2f, 1.0f, 1.0f));
            valueAnimatorOfFloat.setDuration(100L);
            return valueAnimatorOfFloat;
        }

        static ValueAnimator d(float f, long j) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            return valueAnimatorOfFloat;
        }
    }
}
