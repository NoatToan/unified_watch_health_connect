package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public class i9p extends uor {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j9p f20915k;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i9p.this.r(valueAnimator);
        }
    }

    public i9p(mnq.a aVar) {
        super(aVar);
        this.f20915k = new j9p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(ValueAnimator valueAnimator) {
        this.f20915k.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(this.f20915k);
        }
    }

    @Override // defpackage.uor
    public uor n(int i, int i2, int i3, boolean z) {
        if (k(i, i2, i3, z)) {
            this.c = a();
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = z;
            int i4 = i3 * 2;
            int i5 = i - i3;
            this.h = i5;
            this.i = i + i3;
            this.f20915k.d(i5);
            this.f20915k.c(this.i);
            this.f20915k.f(i4);
            uor.b bVarH = h(z);
            long j = this.f20683a;
            long j2 = (long) (j * 0.8d);
            long j3 = (long) (j * 0.2d);
            long j4 = (long) (j * 0.5d);
            long j5 = (long) (j * 0.5d);
            ValueAnimator valueAnimatorI = i(bVarH.f35978a, bVarH.f35979b, j2, false, this.f20915k);
            ValueAnimator valueAnimatorI2 = i(bVarH.c, bVarH.d, j2, true, this.f20915k);
            valueAnimatorI2.setStartDelay(j3);
            ValueAnimator valueAnimatorP = p(i4, i3, j4);
            ValueAnimator valueAnimatorP2 = p(i3, i4, j4);
            valueAnimatorP2.setStartDelay(j5);
            ((AnimatorSet) this.c).playTogether(valueAnimatorI, valueAnimatorI2, valueAnimatorP, valueAnimatorP2);
        }
        return this;
    }

    public final ValueAnimator p(int i, int i2, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new a());
        return valueAnimatorOfInt;
    }

    @Override // defpackage.uor
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public i9p j(long j) {
        super.j(j);
        return this;
    }

    @Override // defpackage.uor
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i9p m(float f) {
        T t = this.c;
        if (t != 0) {
            long j = (long) (f * this.f20683a);
            int size = ((AnimatorSet) t).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.c).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}
