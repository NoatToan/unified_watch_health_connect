package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bak;
import defpackage.byq;
import defpackage.d0q;

/* JADX INFO: loaded from: classes.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] J = {"android:clipBounds:clip"};

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3035a;

        public a(View view) {
            this.f3035a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            androidx.core.view.c.y0(this.f3035a, null);
        }
    }

    public ChangeClipBounds() {
    }

    private void k0(d0q d0qVar) {
        View view = d0qVar.f14938b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rectT = androidx.core.view.c.t(view);
        d0qVar.f14937a.put("android:clipBounds:clip", rectT);
        if (rectT == null) {
            d0qVar.f14937a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public String[] H() {
        return J;
    }

    @Override // androidx.transition.Transition
    public void g(d0q d0qVar) {
        k0(d0qVar);
    }

    @Override // androidx.transition.Transition
    public void j(d0q d0qVar) {
        k0(d0qVar);
    }

    @Override // androidx.transition.Transition
    public Animator p(ViewGroup viewGroup, d0q d0qVar, d0q d0qVar2) {
        ObjectAnimator objectAnimatorOfObject = null;
        if (d0qVar != null && d0qVar2 != null && d0qVar.f14937a.containsKey("android:clipBounds:clip") && d0qVar2.f14937a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) d0qVar.f14937a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) d0qVar2.f14937a.get("android:clipBounds:clip");
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) d0qVar.f14937a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) d0qVar2.f14937a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            androidx.core.view.c.y0(d0qVar2.f14938b, rect);
            objectAnimatorOfObject = ObjectAnimator.ofObject(d0qVar2.f14938b, (Property<View, V>) byq.c, (TypeEvaluator) new bak(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimatorOfObject.addListener(new a(d0qVar2.f14938b));
            }
        }
        return objectAnimatorOfObject;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
