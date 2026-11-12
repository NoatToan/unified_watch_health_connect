package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class oge extends n7d<ObjectAnimator> {
    public static final int[] l = {533, 567, 850, 750};
    public static final int[] m = {1267, 1000, 333, 0};
    public static final Property<oge, Float> n = new c(Float.class, "animationFraction");
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final Interpolator[] f;
    public final fa2 g;
    public int h;
    public boolean i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public cb1 f29140k;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            oge ogeVar = oge.this;
            ogeVar.h = (ogeVar.h + 1) % oge.this.g.c.length;
            oge.this.i = true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            oge.this.a();
            oge ogeVar = oge.this;
            cb1 cb1Var = ogeVar.f29140k;
            if (cb1Var != null) {
                cb1Var.onAnimationEnd(ogeVar.f27616a);
            }
        }
    }

    public class c extends Property<oge, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(oge ogeVar) {
            return Float.valueOf(ogeVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(oge ogeVar, Float f) {
            ogeVar.r(f.floatValue());
        }
    }

    public oge(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.h = 0;
        this.f29140k = null;
        this.g = linearProgressIndicatorSpec;
        this.f = new Interpolator[]{xc1.a(context, ygi.f40157a), xc1.a(context, ygi.f40158b), xc1.a(context, ygi.c), xc1.a(context, ygi.d)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.j;
    }

    private void o() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(RepositoryManager.GAP_X_MINUTE);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new a());
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, n, 1.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(RepositoryManager.GAP_X_MINUTE);
            this.e.setInterpolator(null);
            this.e.addListener(new b());
        }
    }

    private void p() {
        if (this.i) {
            Arrays.fill(this.c, i8f.a(this.g.c[this.h], this.f27616a.getAlpha()));
            this.i = false;
        }
    }

    private void s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f27617b[i2] = Math.max(0.0f, Math.min(1.0f, this.f[i2].getInterpolation(b(i, m[i2], l[i2]))));
        }
    }

    @Override // defpackage.n7d
    public void a() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.n7d
    public void c() {
        q();
    }

    @Override // defpackage.n7d
    public void d(cb1 cb1Var) {
        this.f29140k = cb1Var;
    }

    @Override // defpackage.n7d
    public void f() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f27616a.isVisible()) {
            this.e.setFloatValues(this.j, 1.0f);
            this.e.setDuration((long) ((1.0f - this.j) * 1800.0f));
            this.e.start();
        }
    }

    @Override // defpackage.n7d
    public void g() {
        o();
        q();
        this.d.start();
    }

    @Override // defpackage.n7d
    public void h() {
        this.f29140k = null;
    }

    @VisibleForTesting
    public void q() {
        this.h = 0;
        int iA = i8f.a(this.g.c[0], this.f27616a.getAlpha());
        int[] iArr = this.c;
        iArr[0] = iA;
        iArr[1] = iA;
    }

    @VisibleForTesting
    public void r(float f) {
        this.j = f;
        s((int) (f * 1800.0f));
        p();
        this.f27616a.invalidateSelf();
    }
}
