package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class uor extends i22<AnimatorSet> {
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public vor j;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vor f35976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f35977b;

        public a(vor vorVar, boolean z) {
            this.f35976a = vorVar;
            this.f35977b = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            uor.this.l(this.f35976a, valueAnimator, this.f35977b);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35979b;
        public final int c;
        public final int d;

        public b(int i, int i2, int i3, int i4) {
            this.f35978a = i;
            this.f35979b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public uor(mnq.a aVar) {
        super(aVar);
        this.j = new vor();
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public b h(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.d;
            int i6 = this.f;
            i = i5 + i6;
            int i7 = this.e;
            i2 = i7 + i6;
            i3 = i5 - i6;
            i4 = i7 - i6;
        } else {
            int i8 = this.d;
            int i9 = this.f;
            i = i8 - i9;
            int i10 = this.e;
            i2 = i10 - i9;
            i3 = i8 + i9;
            i4 = i10 + i9;
        }
        return new b(i, i2, i3, i4);
    }

    public ValueAnimator i(int i, int i2, long j, boolean z, vor vorVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new a(vorVar, z));
        return valueAnimatorOfInt;
    }

    public uor j(long j) {
        super.b(j);
        return this;
    }

    public boolean k(int i, int i2, int i3, boolean z) {
        return (this.d == i && this.e == i2 && this.f == i3 && this.g == z) ? false : true;
    }

    public final void l(vor vorVar, ValueAnimator valueAnimator, boolean z) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.g) {
            if (z) {
                vorVar.d(iIntValue);
            } else {
                vorVar.c(iIntValue);
            }
        } else if (z) {
            vorVar.c(iIntValue);
        } else {
            vorVar.d(iIntValue);
        }
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(vorVar);
        }
    }

    @Override // defpackage.i22
    public uor m(float f) {
        T t = this.c;
        if (t == 0) {
            return this;
        }
        long j = (long) (f * this.f20683a);
        Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    public uor n(int i, int i2, int i3, boolean z) {
        if (k(i, i2, i3, z)) {
            this.c = a();
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = z;
            int i4 = i - i3;
            this.h = i4;
            this.i = i + i3;
            this.j.d(i4);
            this.j.c(this.i);
            b bVarH = h(z);
            long j = this.f20683a / 2;
            ((AnimatorSet) this.c).playSequentially(i(bVarH.f35978a, bVarH.f35979b, j, false, this.j), i(bVarH.c, bVarH.d, j, true, this.j));
        }
        return this;
    }
}
