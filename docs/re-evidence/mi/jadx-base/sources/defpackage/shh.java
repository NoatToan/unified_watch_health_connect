package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class shh implements prc {

    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<yu6.a> f33641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<View> f33642b;

        public a(yu6.a aVar, View view) {
            this.f33641a = new WeakReference<>(aVar);
            this.f33642b = new WeakReference<>(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.f33642b.get();
            if (view != null) {
                view.setTag(null);
            }
            yu6.a aVar = this.f33641a.get();
            if (aVar != null) {
                aVar.end();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f33642b.get();
            if (view != null) {
                view.setTag(null);
            }
            yu6.a aVar = this.f33641a.get();
            if (aVar != null) {
                aVar.end();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f33642b.get();
            if (view != null) {
                view.setTag("hide");
            }
        }
    }

    public class b extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<miuix.appcompat.app.c.d> f33643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<View> f33644b;

        public b(miuix.appcompat.app.c.d dVar, View view) {
            this.f33643a = new WeakReference<>(dVar);
            this.f33644b = new WeakReference<>(view);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
            View view = this.f33644b.get();
            if (view != null) {
                view.setTag("show");
            }
            miuix.appcompat.app.c.d dVar = this.f33643a.get();
            if (dVar != null) {
                dVar.onShowAnimStart();
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            miuix.appcompat.app.c.d dVar = this.f33643a.get();
            if (dVar != null) {
                dVar.onShowAnimComplete();
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<miuix.appcompat.app.c.d> f33645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<View> f33646b;

        public c(miuix.appcompat.app.c.d dVar, View view) {
            this.f33645a = new WeakReference<>(dVar);
            this.f33646b = new WeakReference<>(view);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f33646b.get();
            if (view != null) {
                view.setTag(null);
            }
            miuix.appcompat.app.c.d dVar = this.f33645a.get();
            if (dVar != null) {
                dVar.onShowAnimComplete();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            View view = this.f33646b.get();
            if (view != null) {
                view.setTag("show");
            }
            miuix.appcompat.app.c.d dVar = this.f33645a.get();
            if (dVar != null) {
                dVar.onShowAnimStart();
            }
        }
    }

    @Override // defpackage.prc
    public void a(View view, View view2, yu6.a aVar) {
        if ("hide".equals(view.getTag())) {
            return;
        }
        d(view, new a(aVar, view));
        fw6.a(view2);
    }

    @Override // defpackage.prc
    public void b() {
    }

    @Override // defpackage.prc
    public void c(View view, View view2, boolean z, miuix.appcompat.app.c.d dVar) {
        if ("show".equals(view.getTag())) {
            return;
        }
        if (view.getScaleX() != 1.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (bb1.f()) {
            e(view, dVar);
        } else {
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase(EaseManager.getStyle(-2, 0.8f, 0.3f));
            animConfig.addListeners(new b(dVar, view));
            Folme.useAt(view).state().setFlags(1L).fromTo(g(true, true, view), g(true, false, view), animConfig);
        }
        fw6.b(view2);
    }

    public final void d(View view, a aVar) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ViewProperty.ALPHA, 1.0f, 0.0f);
        float f = f(view);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat(ViewProperty.SCALE_X, 1.0f, f), PropertyValuesHolder.ofFloat(ViewProperty.SCALE_Y, 1.0f, f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public final void e(View view, miuix.appcompat.app.c.d dVar) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ViewProperty.ALPHA, 0.0f, 1.0f);
        float f = f(view);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat(ViewProperty.SCALE_X, f, 1.0f), PropertyValuesHolder.ofFloat(ViewProperty.SCALE_Y, f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfPropertyValuesHolder.addListener(new c(dVar, view));
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public final float f(View view) {
        return Math.max(0.8f, 1.0f - (60.0f / Math.max(view.getWidth(), view.getHeight())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final AnimState g(boolean z, boolean z2, View view) {
        AnimState animState = new AnimState();
        float f = 1.0f;
        if (z) {
            if (z2 != 0) {
                f = f(view);
            }
        } else if (z2 == 0) {
            f = f(view);
        }
        if (z) {
            z2 = !z2;
        }
        double d = f;
        animState.add(ViewProperty.SCALE_X, d);
        animState.add(ViewProperty.SCALE_Y, d);
        animState.add(ViewProperty.ALPHA, z2);
        return animState;
    }
}
