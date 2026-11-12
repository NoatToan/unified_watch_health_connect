package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class z57 extends i22<AnimatorSet> {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public a67 i;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f40895a;

        public a(c cVar) {
            this.f40895a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            z57.this.k(valueAnimator, this.f40895a);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40897a;

        static {
            int[] iArr = new int[c.values().length];
            f40897a = iArr;
            try {
                iArr[c.Width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40897a[c.Height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40897a[c.Radius.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        Width,
        Height,
        Radius
    }

    public z57(mnq.a aVar) {
        super(aVar);
        this.i = new a67();
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final ValueAnimator h(int i, int i2, long j, c cVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new a(cVar));
        return valueAnimatorOfInt;
    }

    public z57 i(long j) {
        super.b(j);
        return this;
    }

    public final boolean j(int i, int i2, int i3, int i4, int i5) {
        return (this.d == i && this.e == i2 && this.f == i3 && this.g == i4 && this.h == i5) ? false : true;
    }

    public final void k(ValueAnimator valueAnimator, c cVar) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = b.f40897a[cVar.ordinal()];
        if (i == 1) {
            this.i.f(iIntValue);
        } else if (i == 2) {
            this.i.d(iIntValue);
        } else if (i == 3) {
            this.i.e(iIntValue);
        }
        mnq.a aVar = this.f20684b;
        if (aVar != null) {
            aVar.a(this.i);
        }
    }

    @Override // defpackage.i22
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public z57 m(float f) {
        T t = this.c;
        if (t != 0) {
            long j = (long) (f * this.f20683a);
            Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
            boolean z = false;
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j2 = z ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (!z && duration >= this.f20683a) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    public z57 m(int i, int i2, int i3, int i4, int i5) {
        if (j(i, i2, i3, i4, i5)) {
            this.c = a();
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            int i6 = (int) (((double) i5) / 1.5d);
            long j = this.f20683a;
            long j2 = j / 2;
            ValueAnimator valueAnimatorH = h(i, i2, j, c.Width);
            c cVar = c.Height;
            ValueAnimator valueAnimatorH2 = h(i3, i4, j2, cVar);
            c cVar2 = c.Radius;
            ValueAnimator valueAnimatorH3 = h(i5, i6, j2, cVar2);
            ValueAnimator valueAnimatorH4 = h(i4, i3, j2, cVar);
            ((AnimatorSet) this.c).play(valueAnimatorH2).with(valueAnimatorH3).with(valueAnimatorH).before(valueAnimatorH4).before(h(i6, i5, j2, cVar2));
        }
        return this;
    }
}
