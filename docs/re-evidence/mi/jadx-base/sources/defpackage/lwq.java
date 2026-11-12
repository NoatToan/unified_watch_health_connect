package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class lwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f25506a;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nwq f25507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f25508b;

        public a(nwq nwqVar, View view) {
            this.f25507a = nwqVar;
            this.f25508b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25507a.a(this.f25508b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25507a.b(this.f25508b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f25507a.c(this.f25508b);
        }
    }

    public lwq(View view) {
        this.f25506a = new WeakReference<>(view);
    }

    public lwq b(float f) {
        View view = this.f25506a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = this.f25506a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f25506a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public lwq f(long j) {
        View view = this.f25506a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public lwq g(Interpolator interpolator) {
        View view = this.f25506a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public lwq h(nwq nwqVar) {
        View view = this.f25506a.get();
        if (view != null) {
            i(view, nwqVar);
        }
        return this;
    }

    public final void i(View view, nwq nwqVar) {
        if (nwqVar != null) {
            view.animate().setListener(new a(nwqVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public lwq j(long j) {
        View view = this.f25506a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public lwq k(final pwq pwqVar) {
        final View view = this.f25506a.get();
        if (view != null) {
            view.animate().setUpdateListener(pwqVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: kwq
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    pwqVar.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f25506a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public lwq m(float f) {
        View view = this.f25506a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
