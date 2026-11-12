package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public class d extends d0 {
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f11125d);
        setMode(b7.j.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(t tVar, float f14) {
        Float f15;
        return (tVar == null || (f15 = (Float) tVar.f11163a.get("android:fade:transitionAlpha")) == null) ? f14 : f15.floatValue();
    }

    public final ObjectAnimator a(float f14, float f15, View view2) {
        if (f14 == f15) {
            return null;
        }
        x.f11174a.b(f14, view2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, x.f11175b, f15);
        a aVar = new a(view2);
        objectAnimatorOfFloat.addListener(aVar);
        getRootTransition().addListener(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.d0, androidx.transition.m
    public final void captureStartValues(t tVar) {
        super.captureStartValues(tVar);
        Float fValueOf = (Float) tVar.f11164b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (tVar.f11164b.getVisibility() == 0) {
                fValueOf = Float.valueOf(x.f11174a.a(tVar.f11164b));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        tVar.f11163a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.m
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.d0
    public final Animator onAppear(ViewGroup viewGroup, View view2, t tVar, t tVar2) {
        x.f11174a.getClass();
        return a(b(tVar, 0.0f), 1.0f, view2);
    }

    @Override // androidx.transition.d0
    public final Animator onDisappear(ViewGroup viewGroup, View view2, t tVar, t tVar2) {
        b0 b0Var = x.f11174a;
        b0Var.getClass();
        ObjectAnimator objectAnimatorA = a(b(tVar, 1.0f), 0.0f, view2);
        if (objectAnimatorA == null) {
            b0Var.b(b(tVar2, 1.0f), view2);
        }
        return objectAnimatorA;
    }

    public static class a extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f11086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11087b = false;

        public a(View view2) {
            this.f11086a = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            x.f11174a.b(1.0f, this.f11086a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z14) {
            boolean z15 = this.f11087b;
            View view2 = this.f11086a;
            if (z15) {
                view2.setLayerType(0, null);
            }
            if (z14) {
                return;
            }
            b0 b0Var = x.f11174a;
            b0Var.b(1.0f, view2);
            b0Var.getClass();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view2 = this.f11086a;
            if (view2.hasOverlappingRendering() && view2.getLayerType() == 0) {
                this.f11087b = true;
                view2.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionPause(m mVar) {
            View view2 = this.f11086a;
            view2.setTag(R.id.transition_pause_alpha, Float.valueOf(view2.getVisibility() == 0 ? x.f11174a.a(view2) : 0.0f));
        }

        @Override // androidx.transition.m.h
        public final void onTransitionResume(m mVar) {
            this.f11086a.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionStart(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionStart(m mVar, boolean z14) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }

    public d() {
    }

    public d(int i14) {
        setMode(i14);
    }
}
