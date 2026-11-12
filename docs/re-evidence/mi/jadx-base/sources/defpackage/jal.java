package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.Visibility;
import androidx.transition.b;

/* JADX INFO: loaded from: classes6.dex */
public class jal extends Visibility {

    public class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f22595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f22596b;
        public final /* synthetic */ float c;

        public a(View view, float f, float f2) {
            this.f22595a = view;
            this.f22596b = f;
            this.c = f2;
        }

        @Override // androidx.transition.Transition.f
        public void d(Transition transition) {
            this.f22595a.setScaleX(this.f22596b);
            this.f22595a.setScaleY(this.c);
            transition.W(this);
        }
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(d0q d0qVar) {
        super.j(d0qVar);
        d0qVar.f14937a.put("scale:scaleX", Float.valueOf(d0qVar.f14938b.getScaleX()));
        d0qVar.f14937a.put("scale:scaleY", Float.valueOf(d0qVar.f14938b.getScaleY()));
    }

    @Override // androidx.transition.Visibility
    public Animator p0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        return t0(view, 0.0f, 1.0f, d0qVar);
    }

    @Override // androidx.transition.Visibility
    public Animator r0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        return t0(view, 1.0f, 0.0f, d0qVar);
    }

    public final Animator t0(View view, float f, float f2, d0q d0qVar) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float fFloatValue = scaleX * f;
        float f3 = scaleX * f2;
        float fFloatValue2 = f * scaleY;
        float f4 = f2 * scaleY;
        if (d0qVar != null) {
            Float f5 = (Float) d0qVar.f14937a.get("scale:scaleX");
            Float f6 = (Float) d0qVar.f14937a.get("scale:scaleY");
            if (f5 != null && f5.floatValue() != scaleX) {
                fFloatValue = f5.floatValue();
            }
            if (f6 != null && f6.floatValue() != scaleY) {
                fFloatValue2 = f6.floatValue();
            }
        }
        view.setScaleX(fFloatValue);
        view.setScaleY(fFloatValue2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, fFloatValue, f3), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, fFloatValue2, f4));
        a(new a(view, scaleX, scaleY));
        return animatorSet;
    }
}
