package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.amo;
import defpackage.byq;
import defpackage.d0q;
import defpackage.p5q;

/* JADX INFO: loaded from: classes.dex */
public class Fade extends Visibility {

    public class a extends androidx.transition.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3046a;

        public a(View view) {
            this.f3046a = view;
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            byq.h(this.f3046a, 1.0f);
            byq.a(this.f3046a);
            transition.W(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f3048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3049b = false;

        public b(View view) {
            this.f3048a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            byq.h(this.f3048a, 1.0f);
            if (this.f3049b) {
                this.f3048a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.c.Q(this.f3048a) && this.f3048a.getLayerType() == 0) {
                this.f3049b = true;
                this.f3048a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        s0(i);
    }

    public static float u0(d0q d0qVar, float f) {
        Float f2;
        return (d0qVar == null || (f2 = (Float) d0qVar.f14937a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(d0q d0qVar) {
        super.j(d0qVar);
        d0qVar.f14937a.put("android:fade:transitionAlpha", Float.valueOf(byq.c(d0qVar.f14938b)));
    }

    @Override // androidx.transition.Visibility
    public Animator p0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        float fU0 = u0(d0qVar, 0.0f);
        return t0(view, fU0 != 1.0f ? fU0 : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator r0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        byq.e(view);
        return t0(view, u0(d0qVar, 1.0f), 0.0f);
    }

    public final Animator t0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        byq.h(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, byq.f4733b, f2);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.f);
        s0(p5q.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, l0()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
