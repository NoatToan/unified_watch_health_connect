package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public class o44 extends i22<ValueAnimator> {
    public p44 d;
    public int e;
    public int f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            o44.this.j(valueAnimator);
        }
    }

    public o44(mnq.a aVar) {
        super(aVar);
        this.d = new p44();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        this.d.c(iIntValue);
        this.d.d(iIntValue2);
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(this.d);
        }
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public PropertyValuesHolder h(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.f;
            i2 = this.e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.e;
            i2 = this.f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final boolean i(int i, int i2) {
        return (this.e == i && this.f == i2) ? false : true;
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public o44 m(float f) {
        T t = this.c;
        if (t != 0) {
            long j = (long) (f * this.f20683a);
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public o44 l(int i, int i2) {
        if (this.c != 0 && i(i, i2)) {
            this.e = i;
            this.f = i2;
            ((ValueAnimator) this.c).setValues(h(false), h(true));
        }
        return this;
    }
}
