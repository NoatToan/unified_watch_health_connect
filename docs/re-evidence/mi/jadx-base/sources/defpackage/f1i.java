package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;

/* JADX INFO: loaded from: classes2.dex */
public class f1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17288a = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17289b;

    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f17291b;

        public a(int i, View view) {
            this.f17290a = i;
            this.f17291b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (f1i.this.f17289b != this.f17290a) {
                return;
            }
            i1i.b(this.f17291b, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public final void b() {
        int i = this.f17289b + 1;
        this.f17289b = i;
        if (i > 10) {
            this.f17289b = 0;
        }
    }

    public final void c(View[] viewArr) {
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        b();
        int i = this.f17289b;
        for (View view : viewArr) {
            if (view != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, SleepAnalyzerAlpha.NAME_ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.addListener(new a(i, view));
                objectAnimatorOfFloat.start();
            }
        }
    }

    public void d(View[] viewArr, boolean z) {
        if (z) {
            e(viewArr);
        } else {
            c(viewArr);
        }
    }

    public final void e(View[] viewArr) {
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        b();
        for (View view : viewArr) {
            if (view != null) {
                i1i.b(view, true);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, SleepAnalyzerAlpha.NAME_ALPHA, 0.0f, 1.0f);
                view.setAlpha(0.0f);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.start();
            }
        }
    }
}
