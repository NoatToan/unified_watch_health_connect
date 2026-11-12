package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public class om9 extends o44 {
    public pm9 g;
    public int h;
    public int i;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            om9.this.j(valueAnimator);
        }
    }

    public om9(mnq.a aVar) {
        super(aVar);
        this.g = new pm9();
    }

    @Override // defpackage.o44, defpackage.i22
    /* JADX INFO: renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public final void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int iIntValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int iIntValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.g.c(iIntValue);
        this.g.d(iIntValue2);
        this.g.i(iIntValue3);
        this.g.j(iIntValue4);
        this.g.k(iIntValue5);
        this.g.l(iIntValue6);
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(this.g);
        }
    }

    public final PropertyValuesHolder n(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.h;
            i = i2 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i = this.h;
            i2 = i / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final PropertyValuesHolder o(boolean z) {
        int i;
        String str;
        int i2 = 0;
        if (z) {
            str = "ANIMATION_STROKE_REVERSE";
            i2 = this.h;
            i = 0;
        } else {
            i = this.h;
            str = "ANIMATION_STROKE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        return (this.e == i && this.f == i2 && this.h == i3 && this.i == i4) ? false : true;
    }

    public om9 q(int i, int i2, int i3, int i4) {
        if (this.c != 0 && p(i, i2, i3, i4)) {
            this.e = i;
            this.f = i2;
            this.h = i3;
            this.i = i4;
            ((ValueAnimator) this.c).setValues(h(false), h(true), n(false), n(true), o(false), o(true));
        }
        return this;
    }
}
