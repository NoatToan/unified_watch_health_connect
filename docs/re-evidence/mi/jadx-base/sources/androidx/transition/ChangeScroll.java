package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.d0q;

/* JADX INFO: loaded from: classes.dex */
public class ChangeScroll extends Transition {
    public static final String[] J = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    private void k0(d0q d0qVar) {
        d0qVar.f14937a.put("android:changeScroll:x", Integer.valueOf(d0qVar.f14938b.getScrollX()));
        d0qVar.f14937a.put("android:changeScroll:y", Integer.valueOf(d0qVar.f14938b.getScrollY()));
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
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (d0qVar == null || d0qVar2 == null) {
            return null;
        }
        View view = d0qVar2.f14938b;
        int iIntValue = ((Integer) d0qVar.f14937a.get("android:changeScroll:x")).intValue();
        int iIntValue2 = ((Integer) d0qVar2.f14937a.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) d0qVar.f14937a.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) d0qVar2.f14937a.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return d.c(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
