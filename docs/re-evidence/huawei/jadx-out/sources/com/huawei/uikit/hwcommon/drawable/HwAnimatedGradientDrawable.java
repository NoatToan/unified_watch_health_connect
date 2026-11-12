package com.huawei.uikit.hwcommon.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;

/* JADX INFO: loaded from: classes44.dex */
public class HwAnimatedGradientDrawable extends GradientDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f29361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f29362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29363c;
    private Animator d;
    private TimeInterpolator e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean m;

    public HwAnimatedGradientDrawable(int i, float f, float f2) {
        this.e = new HwCubicBezierInterpolator(0.2f, 0.0f, 0.4f, 1.0f);
        a(i, f, f2);
    }

    private void a(int i, float f, float f2) {
        setShape(0);
        setColor(i);
        setCornerRadius(f2);
        this.i = f2;
        this.f29363c = false;
        this.f29362b = f;
        this.h = 0.0f;
        this.f = 1.0f;
        this.g = 0.9f;
        this.m = false;
    }

    private void b() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rectAlpha", this.f29362b);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(this.e);
        if (this.i > 0.0f || this.m) {
            ObjectAnimator objectAnimatorOfFloat2 = c() < 1.0E-7f ? ObjectAnimator.ofFloat(this, "rectScale", this.g, this.f) : ObjectAnimator.ofFloat(this, "rectScale", this.f);
            objectAnimatorOfFloat2.setDuration(100L);
            objectAnimatorOfFloat2.setInterpolator(this.e);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        } else {
            c(1.0f);
            animatorSet.play(objectAnimatorOfFloat);
        }
        this.f29361a = animatorSet;
        animatorSet.start();
    }

    private void e() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rectAlpha", 0.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(this.e);
        animatorSet.playTogether(objectAnimatorOfFloat);
        this.d = animatorSet;
        animatorSet.start();
    }

    public float c() {
        return this.h;
    }

    public void c(float f) {
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        this.j = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f = this.h;
        if (f < 1.0E-7f) {
            return;
        }
        float f2 = this.j;
        setAlpha((int) (f * 255.0f));
        canvas.save();
        canvas.scale(f2, f2, canvas.getWidth() * 0.5f, canvas.getHeight() * 0.5f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRect(getBounds());
        outline.setAlpha(0.0f);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z2 = true;
            } else if (i == 16842919) {
                z3 = true;
            } else {
                Log.i("HwAnimatedGradientDrawable", "State = " + i);
            }
        }
        if (z2 && z3) {
            z = true;
        }
        b(z);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            a();
            return visible;
        }
        if (!visible) {
            Log.i("HwAnimatedGradientDrawable", "isChanged = " + visible + ".");
            return visible;
        }
        if (!this.f29363c) {
            this.h = 0.0f;
            return visible;
        }
        this.h = this.f29362b;
        this.j = this.f;
        return visible;
    }

    private void b(boolean z) {
        if (this.f29363c != z) {
            this.f29363c = z;
            if (z) {
                Animator animator = this.f29361a;
                if (animator == null || !animator.isRunning()) {
                    Animator animator2 = this.d;
                    if (animator2 != null && animator2.isRunning()) {
                        this.d.cancel();
                    }
                    b();
                    return;
                }
                return;
            }
            Animator animator3 = this.d;
            if (animator3 == null || !animator3.isRunning()) {
                Animator animator4 = this.f29361a;
                if (animator4 != null && animator4.isRunning()) {
                    this.f29361a.cancel();
                }
                e();
            }
        }
    }

    public HwAnimatedGradientDrawable() {
        this(201326592, 1.0f, 12.0f);
    }

    public HwAnimatedGradientDrawable(Context context) {
        this(201326592, 1.0f, context);
    }

    public HwAnimatedGradientDrawable(int i, float f, Context context) {
        this(i, f, 4.0f, context);
    }

    public HwAnimatedGradientDrawable(int i, float f, float f2, Context context) {
        this.e = new HwCubicBezierInterpolator(0.2f, 0.0f, 0.4f, 1.0f);
        if (context != null) {
            a(i, f, f2 * context.getResources().getDisplayMetrics().density);
        } else {
            a(i, f, 12.0f);
        }
    }

    private void a() {
        Animator animator = this.f29361a;
        if (animator != null && animator.isRunning()) {
            this.f29361a.end();
            Log.i("HwAnimatedGradientDrawable", "clearEffect: mEnterAnim is not null.");
        }
        Animator animator2 = this.d;
        if (animator2 != null && animator2.isRunning()) {
            this.d.end();
            Log.i("HwAnimatedGradientDrawable", "clearEffect: mExitAnim is not null.");
        }
        this.f29361a = null;
        this.d = null;
        this.f29363c = false;
        this.h = 0.0f;
        invalidateSelf();
    }
}
