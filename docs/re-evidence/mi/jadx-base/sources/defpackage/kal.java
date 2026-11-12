package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public class kal extends o44 {
    public int g;
    public float h;
    public lal i;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            kal.this.j(valueAnimator);
        }
    }

    public kal(mnq.a aVar) {
        super(aVar);
        this.i = new lal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.i.c(iIntValue);
        this.i.d(iIntValue2);
        this.i.g(iIntValue3);
        this.i.h(iIntValue4);
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(this.i);
        }
    }

    @Override // defpackage.o44, defpackage.i22
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public PropertyValuesHolder n(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.g;
            i = (int) (i2 * this.h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.g;
            i2 = (int) (i * this.h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final boolean o(int i, int i2, int i3, float f) {
        return (this.e == i && this.f == i2 && this.g == i3 && this.h == f) ? false : true;
    }

    public kal p(int i, int i2, int i3, float f) {
        if (this.c != 0 && o(i, i2, i3, f)) {
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = f;
            ((ValueAnimator) this.c).setValues(h(false), h(true), n(false), n(true));
        }
        return this;
    }
}
