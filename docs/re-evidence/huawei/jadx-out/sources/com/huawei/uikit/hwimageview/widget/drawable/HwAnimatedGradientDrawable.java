package com.huawei.uikit.hwimageview.widget.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes44.dex */
public class HwAnimatedGradientDrawable extends GradientDrawable {
    private static final TimeInterpolator e = new PathInterpolator(0.2f, 0.0f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f29510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f29512c;
    private Animator d;
    private float f;
    private float g;
    private boolean h;
    private float i;
    private float j;

    public HwAnimatedGradientDrawable() {
        this(201326592, 1.0f, 12.0f);
    }

    private void c() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rectAlpha", 0.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(e);
        animatorSet.playTogether(objectAnimatorOfFloat);
        this.d = animatorSet;
        animatorSet.start();
    }

    private void e() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rectAlpha", this.f29512c);
        objectAnimatorOfFloat.setDuration(100L);
        TimeInterpolator timeInterpolator = e;
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        if (getCornerRadius() > 0.0f || this.h) {
            ObjectAnimator objectAnimatorOfFloat2 = d() < 1.0E-7f ? ObjectAnimator.ofFloat(this, "rectScale", this.i, this.g) : ObjectAnimator.ofFloat(this, "rectScale", this.g);
            objectAnimatorOfFloat2.setDuration(100L);
            objectAnimatorOfFloat2.setInterpolator(timeInterpolator);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        } else {
            e(1.0f);
            animatorSet.play(objectAnimatorOfFloat);
        }
        this.f29510a = animatorSet;
        animatorSet.start();
    }

    private void e(int i, float f, float f2) {
        setShape(0);
        setColor(i);
        setCornerRadius(f2);
        this.f29511b = false;
        this.f29512c = f;
        this.f = 0.0f;
        this.g = 1.0f;
        this.i = 0.9f;
        this.h = false;
    }

    public float d() {
        return this.f;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f = this.f;
        if (f < 1.0E-7f) {
            return;
        }
        setAlpha((int) (f * 255.0f));
        canvas.save();
        float f2 = this.j;
        canvas.scale(f2, f2, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public void e(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.j = f;
            invalidateSelf();
        } else {
            Log.w("HwAnimatedGradientDraw", "illegal params: rectScale = " + f);
        }
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
                Log.w("HwAnimatedGradientDraw", "onStateChange: wrong state");
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
            b();
            return visible;
        }
        if (!visible) {
            Log.w("HwAnimatedGradientDraw", "setVisible: unexpected visibility state");
            return visible;
        }
        if (!this.f29511b) {
            this.f = 0.0f;
            return visible;
        }
        this.f = this.f29512c;
        this.j = this.g;
        return visible;
    }

    public HwAnimatedGradientDrawable(int i, float f, float f2) {
        e(i, f, f2);
    }

    public HwAnimatedGradientDrawable(Context context) {
        this(201326592, 1.0f, context);
    }

    public HwAnimatedGradientDrawable(int i, float f, Context context) {
        this(i, f, 4.0f, context);
    }

    public HwAnimatedGradientDrawable(int i, float f, float f2, Context context) {
        if (context != null) {
            e(i, f, f2 * context.getResources().getDisplayMetrics().density);
        } else {
            e(i, f, 12.0f);
        }
    }

    private void b(boolean z) {
        if (this.f29511b != z) {
            this.f29511b = z;
            if (z) {
                Animator animator = this.f29510a;
                if (animator == null || !animator.isRunning()) {
                    Animator animator2 = this.d;
                    if (animator2 != null && animator2.isRunning()) {
                        this.d.cancel();
                    }
                    e();
                    return;
                }
                return;
            }
            Animator animator3 = this.d;
            if (animator3 == null || !animator3.isRunning()) {
                Animator animator4 = this.f29510a;
                if (animator4 != null && animator4.isRunning()) {
                    this.f29510a.cancel();
                }
                c();
            }
        }
    }

    private void b() {
        Animator animator = this.f29510a;
        if (animator != null && animator.isRunning()) {
            this.f29510a.end();
        }
        Animator animator2 = this.d;
        if (animator2 != null && animator2.isRunning()) {
            this.d.end();
        }
        this.f29510a = null;
        this.d = null;
        this.f29511b = false;
        this.f = 0.0f;
        invalidateSelf();
    }
}
