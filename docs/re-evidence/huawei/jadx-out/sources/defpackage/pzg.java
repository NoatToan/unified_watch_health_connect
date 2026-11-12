package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes43.dex */
public class pzg extends Drawable implements Animatable, Drawable.Callback, Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Animator.AnimatorListener f46008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46009c;
    private Drawable d;
    private ObjectAnimator e;
    private Drawable g;
    private View h;
    private int j;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    private void d() {
        setBounds(0, 0, this.j, this.f46007a);
        this.g.setBounds(0, 0, this.j, this.f46007a);
        this.d.setBounds(0, 0, this.j, this.f46007a);
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    private void a() {
        View view = this.h;
        boolean z = true;
        boolean z2 = false;
        if (view != null) {
            if (view.getWidth() != 0 && this.h.getWidth() != this.j) {
                this.j = this.h.getWidth();
                z2 = true;
            }
            if (this.h.getHeight() != 0 && this.h.getHeight() != this.f46007a) {
                this.f46007a = this.h.getHeight();
                z2 = true;
            }
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            if (this.j <= 0) {
                this.j = drawable.getIntrinsicWidth();
            } else {
                z = z2;
            }
            if (this.f46007a <= 0) {
                this.f46007a = this.d.getIntrinsicHeight();
            } else {
                z2 = z;
                if (!z2) {
                    return;
                }
            }
        } else if (!z2) {
            return;
        }
        d();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        View view = this.h;
        if (view != null && !view.getGlobalVisibleRect(new Rect())) {
            this.f46009c = true;
        } else {
            this.e.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.e.end();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ObjectAnimator objectAnimator = this.e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f46009c) {
            this.g.draw(canvas);
        }
        this.d.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (255 <= i) {
            this.f46009c = true;
        }
        if (this.f46009c) {
            this.d.setAlpha(255);
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        a();
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        a();
        return this.f46007a;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        invalidateSelf();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f46008b;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f46008b;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f46008b;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f46008b;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }
}
