package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public class z1n extends i22<ValueAnimator> {
    public a2n d;
    public int e;
    public int f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            z1n.this.j(valueAnimator);
        }
    }

    public z1n(mnq.a aVar) {
        super(aVar);
        this.e = -1;
        this.f = -1;
        this.d = new a2n();
    }

    private boolean i(int i, int i2) {
        return (this.e == i && this.f == i2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        this.d.b(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(this.d);
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

    public final PropertyValuesHolder h() {
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", this.e, this.f);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public z1n m(float f) {
        T t = this.c;
        if (t != 0) {
            long j = (long) (f * this.f20683a);
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public z1n l(int i, int i2) {
        if (this.c != 0 && i(i, i2)) {
            this.e = i;
            this.f = i2;
            ((ValueAnimator) this.c).setValues(h());
        }
        return this;
    }
}
