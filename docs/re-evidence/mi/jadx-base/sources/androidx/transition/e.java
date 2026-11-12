package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import defpackage.d0q;
import defpackage.ed1;
import defpackage.ypi;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public static class a extends AnimatorListenerAdapter implements Transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f3092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f3093b;
        public final int c;
        public final int d;
        public int[] e;
        public float f;
        public float g;
        public final float h;
        public final float i;

        public a(View view, View view2, int i, int i2, float f, float f2) {
            this.f3093b = view;
            this.f3092a = view2;
            this.c = i - Math.round(view.getTranslationX());
            this.d = i2 - Math.round(view.getTranslationY());
            this.h = f;
            this.i = f2;
            int[] iArr = (int[]) view2.getTag(ypi.f);
            this.e = iArr;
            if (iArr != null) {
                view2.setTag(ypi.f, null);
            }
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            this.f3093b.setTranslationX(this.h);
            this.f3093b.setTranslationY(this.i);
            transition.W(this);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            this.e[0] = Math.round(this.c + this.f3093b.getTranslationX());
            this.e[1] = Math.round(this.d + this.f3093b.getTranslationY());
            this.f3092a.setTag(ypi.f, this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f = this.f3093b.getTranslationX();
            this.g = this.f3093b.getTranslationY();
            this.f3093b.setTranslationX(this.h);
            this.f3093b.setTranslationY(this.i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f3093b.setTranslationX(this.f);
            this.f3093b.setTranslationY(this.g);
        }
    }

    public static Animator a(View view, d0q d0qVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) d0qVar.f14938b.getTag(ypi.f);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int iRound = Math.round(f5 - translationX) + i;
        int iRound2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        a aVar = new a(view, d0qVar.f14938b, iRound, iRound2, translationX, translationY);
        transition.a(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        ed1.a(objectAnimatorOfPropertyValuesHolder, aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
