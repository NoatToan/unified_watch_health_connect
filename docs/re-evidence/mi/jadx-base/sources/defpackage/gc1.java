package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public abstract class gc1 extends iwq implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public ObjectAnimator i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18820k;
    public float l;

    public gc1(hwq hwqVar, float f, float f2, ryp rypVar, View view, float f3, float f4, long j) {
        super(hwqVar, f, f2, rypVar, view);
        this.f18820k = f3;
        this.l = f4;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phase", 0.0f, 1.0f);
        this.i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(j);
        this.i.addUpdateListener(this);
        this.i.addListener(this);
    }

    public abstract void b();

    public void c() {
        this.i.removeAllListeners();
        this.i.removeAllUpdateListeners();
        this.i.reverse();
        this.i.addUpdateListener(this);
        this.i.addListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        try {
            b();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        try {
            b();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // java.lang.Runnable
    @SuppressLint({"NewApi"})
    public void run() {
        this.i.start();
    }
}
