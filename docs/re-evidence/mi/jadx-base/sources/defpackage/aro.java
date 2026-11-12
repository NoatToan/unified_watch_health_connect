package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public class aro extends i22<ValueAnimator> {
    public int d;
    public int e;
    public bro f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            aro.this.j(valueAnimator);
        }
    }

    public aro(mnq.a aVar) {
        super(aVar);
        this.d = -1;
        this.e = -1;
        this.f = new bro();
    }

    private boolean i(int i, int i2) {
        return (this.d == i && this.e == i2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        this.f.c(iIntValue);
        this.f.d(iIntValue2);
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(this.f);
        }
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public final PropertyValuesHolder h(String str, int i, int i2) {
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public aro m(float f) {
        T t = this.c;
        if (t != 0) {
            long j = (long) (f * this.f20683a);
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public aro l(int i, int i2) {
        if (this.c != 0 && i(i, i2)) {
            this.d = i;
            this.e = i2;
            ((ValueAnimator) this.c).setValues(h("ANIMATION_COORDINATE", i, i2), h("ANIMATION_COORDINATE_REVERSE", i2, i));
        }
        return this;
    }
}
