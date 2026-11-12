package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class w82 extends ValueAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f37709a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f37710b = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorPauseListener> c = new CopyOnWriteArraySet();

    public void a() {
        Iterator<Animator.AnimatorListener> it = this.f37710b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f37710b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37709a.add(animatorUpdateListener);
    }

    public void b(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.f37710b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    public void c() {
        Iterator<Animator.AnimatorPauseListener> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    public void d() {
        Iterator<Animator.AnimatorListener> it = this.f37710b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    public void e() {
        Iterator<Animator.AnimatorPauseListener> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    public void f(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.f37710b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z);
        }
    }

    public void g() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f37709a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f37710b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f37709a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f37710b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37709a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
