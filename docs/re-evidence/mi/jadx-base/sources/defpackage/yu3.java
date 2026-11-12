package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;
import miuix.internal.view.CheckBoxAnimatedStateListDrawable;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public class yu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40550b;
    public wu3 d;
    public wu3 e;
    public wu3 f;
    public CheckBoxAnimatedStateListDrawable g;
    public SpringAnimation h;
    public SpringAnimation i;
    public SpringAnimation j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SpringAnimation f40551k;
    public SpringAnimation l;
    public SpringAnimation m;
    public SpringAnimation n;
    public SpringAnimation o;
    public SpringAnimation p;
    public SpringAnimation q;
    public boolean x;
    public float c = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DynamicAnimation.OnAnimationUpdateListener f40552r = new DynamicAnimation.OnAnimationUpdateListener() { // from class: xu3
        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
            this.f39469a.h(dynamicAnimation, f2, f3);
        }
    };
    public DynamicAnimation.OnAnimationUpdateListener s = new a();
    public FloatProperty<CheckBoxAnimatedStateListDrawable> t = new b("Scale");
    public FloatProperty<CheckBoxAnimatedStateListDrawable> u = new c("ContentAlpha");
    public FloatProperty<yu3> v = new d("Scale");
    public FloatProperty<wu3> w = new e("Alpha");

    public class a implements DynamicAnimation.OnAnimationUpdateListener {
        public a() {
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            yu3.this.g.l(yu3.this.f());
            yu3.this.g.invalidateSelf();
        }
    }

    public class b extends FloatProperty<CheckBoxAnimatedStateListDrawable> {
        public b(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable) {
            return yu3.this.g.d();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, float f) {
            yu3.this.g.l(f);
        }
    }

    public class c extends FloatProperty<CheckBoxAnimatedStateListDrawable> {
        public c(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable) {
            return checkBoxAnimatedStateListDrawable.c();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, float f) {
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            checkBoxAnimatedStateListDrawable.k(f);
        }
    }

    public class d extends FloatProperty<yu3> {
        public d(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(yu3 yu3Var) {
            return yu3.this.f();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(yu3 yu3Var, float f) {
            yu3.this.k(f);
        }
    }

    public class e extends FloatProperty<wu3> {
        public e(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(wu3 wu3Var) {
            return wu3Var.getAlpha() / 255;
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(wu3 wu3Var, float f) {
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            wu3Var.setAlpha((int) (f * 255.0f));
        }
    }

    public class f implements DynamicAnimation.OnAnimationUpdateListener {
        public f() {
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            yu3.this.g.invalidateSelf();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!yu3.this.o.isRunning()) {
                yu3.this.o.start();
            }
            if (yu3.this.p.isRunning()) {
                return;
            }
            yu3.this.p.start();
        }
    }

    public yu3(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f40549a = i4;
        this.f40550b = i5;
        this.x = z;
        wu3 wu3Var = new wu3(i, i4, i5, i6, i7, i8);
        this.d = wu3Var;
        wu3Var.setAlpha(this.f40549a);
        wu3 wu3Var2 = new wu3(i2, i4, i5);
        this.e = wu3Var2;
        wu3Var2.setAlpha(0);
        wu3 wu3Var3 = new wu3(i3, i4, i5);
        this.f = wu3Var3;
        wu3Var3.setAlpha(255);
        this.g = checkBoxAnimatedStateListDrawable;
        g();
    }

    public void e(Canvas canvas) {
        this.d.draw(canvas);
        this.e.draw(canvas);
        this.f.draw(canvas);
    }

    public float f() {
        return this.c;
    }

    public final void g() {
        SpringAnimation springAnimation = new SpringAnimation(this, this.v, 0.85f);
        this.h = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.h.getSpring().setDampingRatio(0.99f);
        this.h.getSpring().setFinalPosition(0.85f);
        this.h.setMinimumVisibleChange(0.002f);
        this.h.addUpdateListener(this.s);
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.v, 1.0f);
        this.f40551k = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f40551k.getSpring().setDampingRatio(0.6f);
        this.f40551k.setMinimumVisibleChange(0.002f);
        this.f40551k.addUpdateListener(new f());
        SpringAnimation springAnimation3 = new SpringAnimation(this.g, this.u, 0.5f);
        this.n = springAnimation3;
        springAnimation3.getSpring().setStiffness(986.96f);
        this.n.getSpring().setDampingRatio(0.99f);
        this.n.setMinimumVisibleChange(0.00390625f);
        this.n.addUpdateListener(this.f40552r);
        SpringAnimation springAnimation4 = new SpringAnimation(this.e, this.w, 0.1f);
        this.i = springAnimation4;
        springAnimation4.getSpring().setStiffness(986.96f);
        this.i.getSpring().setDampingRatio(0.99f);
        this.i.setMinimumVisibleChange(0.00390625f);
        this.i.addUpdateListener(this.f40552r);
        SpringAnimation springAnimation5 = new SpringAnimation(this.e, this.w, 0.0f);
        this.j = springAnimation5;
        springAnimation5.getSpring().setStiffness(986.96f);
        this.j.getSpring().setDampingRatio(0.99f);
        this.j.setMinimumVisibleChange(0.00390625f);
        this.j.addUpdateListener(this.f40552r);
        SpringAnimation springAnimation6 = new SpringAnimation(this.f, this.w, 1.0f);
        this.l = springAnimation6;
        springAnimation6.getSpring().setStiffness(986.96f);
        this.l.getSpring().setDampingRatio(0.7f);
        this.l.setMinimumVisibleChange(0.00390625f);
        this.l.addUpdateListener(this.f40552r);
        SpringAnimation springAnimation7 = new SpringAnimation(this.g, this.u, 1.0f);
        this.o = springAnimation7;
        springAnimation7.getSpring().setStiffness(438.64f);
        this.o.getSpring().setDampingRatio(0.6f);
        this.o.setMinimumVisibleChange(0.00390625f);
        this.o.addUpdateListener(this.f40552r);
        SpringAnimation springAnimation8 = new SpringAnimation(this.f, this.w, 0.0f);
        this.m = springAnimation8;
        springAnimation8.getSpring().setStiffness(986.96f);
        this.m.getSpring().setDampingRatio(0.99f);
        this.m.setMinimumVisibleChange(0.00390625f);
        this.m.addUpdateListener(this.f40552r);
        SpringAnimation springAnimation9 = new SpringAnimation(this.g, this.t, 1.0f);
        this.p = springAnimation9;
        springAnimation9.getSpring().setStiffness(438.64f);
        this.p.getSpring().setDampingRatio(0.6f);
        this.p.setMinimumVisibleChange(0.002f);
        this.p.addUpdateListener(this.f40552r);
        if (this.x) {
            this.p.setStartVelocity(5.0f);
        } else {
            this.p.setStartVelocity(10.0f);
        }
        SpringAnimation springAnimation10 = new SpringAnimation(this.g, this.t, 0.3f);
        this.q = springAnimation10;
        springAnimation10.getSpring().setStiffness(986.96f);
        this.q.getSpring().setDampingRatio(0.99f);
        this.q.setMinimumVisibleChange(0.002f);
        this.q.addUpdateListener(this.s);
    }

    public final /* synthetic */ void h(DynamicAnimation dynamicAnimation, float f2, float f3) {
        this.g.invalidateSelf();
    }

    public void i(int i, int i2, int i3, int i4) {
        this.d.setBounds(i, i2, i3, i4);
        this.e.setBounds(i, i2, i3, i4);
        this.f.setBounds(i, i2, i3, i4);
    }

    public void j(Rect rect) {
        this.d.setBounds(rect);
        this.e.setBounds(rect);
        this.f.setBounds(rect);
    }

    public void k(float f2) {
        this.d.a(f2);
        this.e.a(f2);
        this.f.a(f2);
        this.c = f2;
    }

    public void l(boolean z, boolean z2) {
        if (z2 && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!this.h.isRunning()) {
                this.h.start();
            }
            if (!this.n.isRunning()) {
                this.n.start();
            }
            if (!z && !this.i.isRunning()) {
                this.i.start();
            }
            if (this.j.isRunning()) {
                this.j.cancel();
            }
            if (this.f40551k.isRunning()) {
                this.f40551k.cancel();
            }
            if (this.o.isRunning()) {
                this.o.cancel();
            }
            if (this.p.isRunning()) {
                this.p.cancel();
            }
            if (this.q.isRunning()) {
                this.q.cancel();
            }
            if (this.m.isRunning()) {
                this.m.cancel();
            }
            if (this.l.isRunning()) {
                this.l.cancel();
            }
        }
    }

    public void m(boolean z, boolean z2) {
        if (!z2 || Thread.currentThread() != Looper.getMainLooper().getThread()) {
            if (z) {
                this.f.setAlpha((int) (this.l.getSpring().getFinalPosition() * 255.0f));
                return;
            } else {
                this.f.setAlpha((int) (this.m.getSpring().getFinalPosition() * 255.0f));
                return;
            }
        }
        if (this.h.isRunning()) {
            this.h.cancel();
        }
        if (this.n.isRunning()) {
            this.n.cancel();
        }
        if (this.i.isRunning()) {
            this.i.cancel();
        }
        if (!this.j.isRunning()) {
            this.j.start();
        }
        if (z) {
            if (this.m.isRunning()) {
                this.m.cancel();
            }
            if (!this.l.isRunning()) {
                this.l.start();
            }
            new Handler().postDelayed(new g(), 50L);
            if (this.x) {
                this.f40551k.setStartVelocity(10.0f);
            } else {
                this.f40551k.setStartVelocity(5.0f);
            }
        } else {
            if (this.l.isRunning()) {
                this.l.cancel();
            }
            if (!this.m.isRunning()) {
                this.m.start();
            }
            if (!this.q.isRunning()) {
                this.q.start();
            }
        }
        this.f40551k.start();
    }

    public void n(boolean z, boolean z2) {
        if (!z2) {
            this.f.setAlpha(0);
            this.e.setAlpha(0);
            this.d.setAlpha(this.f40550b);
        } else {
            if (z) {
                this.f.setAlpha(255);
                this.e.setAlpha(25);
            } else {
                this.f.setAlpha(0);
                this.e.setAlpha(0);
            }
            this.d.setAlpha(this.f40549a);
        }
    }
}
