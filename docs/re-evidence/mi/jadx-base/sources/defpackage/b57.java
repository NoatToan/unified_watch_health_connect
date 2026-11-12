package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b57 extends Drawable implements Animatable {
    public static final Property<b57, Float> o = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa2 f3811b;
    public ValueAnimator d;
    public ValueAnimator e;
    public boolean f;
    public boolean g;
    public float h;
    public List<cb1> i;
    public cb1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3812k;
    public float l;
    public int n;
    public final Paint m = new Paint();
    public yc1 c = new yc1();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            b57.this.e();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            b57.super.setVisible(false, false);
            b57.this.d();
        }
    }

    public class c extends Property<b57, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(b57 b57Var) {
            return Float.valueOf(b57Var.g());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(b57 b57Var, Float f) {
            b57Var.m(f.floatValue());
        }
    }

    public b57(Context context, fa2 fa2Var) {
        this.f3810a = context;
        this.f3811b = fa2Var;
        setAlpha(255);
    }

    public final void d() {
        cb1 cb1Var = this.j;
        if (cb1Var != null) {
            cb1Var.onAnimationEnd(this);
        }
        List<cb1> list = this.i;
        if (list == null || this.f3812k) {
            return;
        }
        Iterator<cb1> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this);
        }
    }

    public final void e() {
        cb1 cb1Var = this.j;
        if (cb1Var != null) {
            cb1Var.onAnimationStart(this);
        }
        List<cb1> list = this.i;
        if (list == null || this.f3812k) {
            return;
        }
        Iterator<cb1> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this);
        }
    }

    public final void f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f3812k;
        this.f3812k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f3812k = z;
    }

    public float g() {
        if (this.f3811b.b() || this.f3811b.a()) {
            return (this.g || this.f) ? this.h : this.l;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return p(false, false, false);
    }

    public boolean i() {
        ValueAnimator valueAnimator = this.e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.g;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return j() || i();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f;
    }

    public final void k() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.d.setInterpolator(wc1.f37827b);
            o(this.d);
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 1.0f, 0.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.e.setInterpolator(wc1.f37827b);
            n(this.e);
        }
    }

    public void l(cb1 cb1Var) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        if (this.i.contains(cb1Var)) {
            return;
        }
        this.i.add(cb1Var);
    }

    public void m(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.l != f) {
            this.l = f;
            invalidateSelf();
        }
    }

    public final void n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    public final void o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean p(boolean z, boolean z2, boolean z3) {
        return q(z, z2, z3 && this.c.a(this.f3810a.getContentResolver()) > 0.0f);
    }

    public boolean q(boolean z, boolean z2, boolean z3) {
        k();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.d : this.e;
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                f(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (z3 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.f3811b.b() : this.f3811b.a())) {
            f(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z4;
    }

    public boolean r(cb1 cb1Var) {
        List<cb1> list = this.i;
        if (list == null || !list.contains(cb1Var)) {
            return false;
        }
        this.i.remove(cb1Var);
        if (!this.i.isEmpty()) {
            return true;
        }
        this.i = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return p(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        q(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        q(false, true, false);
    }
}
