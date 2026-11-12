package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class m8p extends Transition {

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f25892a;

        public a(TextView textView) {
            this.f25892a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f25892a.setScaleX(fFloatValue);
            this.f25892a.setScaleY(fFloatValue);
        }
    }

    private void k0(d0q d0qVar) {
        View view = d0qVar.f14938b;
        if (view instanceof TextView) {
            d0qVar.f14937a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
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
        if (d0qVar == null || d0qVar2 == null || !(d0qVar.f14938b instanceof TextView)) {
            return null;
        }
        View view = d0qVar2.f14938b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = d0qVar.f14937a;
        Map<String, Object> map2 = d0qVar2.f14937a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
