package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.auk;
import defpackage.g6i;
import defpackage.i3m;
import defpackage.k47;
import defpackage.kti;
import defpackage.l8f;
import defpackage.m8f;
import defpackage.p2m;
import defpackage.pii;
import defpackage.r2m;
import defpackage.u43;
import defpackage.u8g;
import defpackage.uco;
import defpackage.v8f;
import defpackage.w4d;
import defpackage.w8g;
import defpackage.wc1;
import defpackage.zc1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static final TimeInterpolator D = wc1.c;
    public static final int[] E = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] F = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] G = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] H = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] I = {R.attr.state_enabled};
    public static final int[] J = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r2m f8718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l8f f8719b;
    public Drawable c;
    public u43 d;
    public Drawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8720k;
    public final uco l;
    public Animator m;
    public u8g n;
    public u8g o;
    public float p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8721r;
    public ArrayList<Animator.AnimatorListener> t;
    public ArrayList<Animator.AnimatorListener> u;
    public ArrayList<j> v;
    public final FloatingActionButton w;
    public final p2m x;
    public boolean g = true;
    public float q = 1.0f;
    public int s = 0;
    public final Rect y = new Rect();
    public final RectF z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0217a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f8723b;
        public final /* synthetic */ k c;

        public C0217a(boolean z, k kVar) {
            this.f8723b = z;
            this.c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8722a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.s = 0;
            a.this.m = null;
            if (this.f8722a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.w;
            boolean z = this.f8723b;
            floatingActionButton.b(z ? 8 : 4, z);
            k kVar = this.c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.w.b(0, this.f8723b);
            a.this.s = 1;
            a.this.m = animator;
            this.f8722a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f8725b;

        public b(boolean z, k kVar) {
            this.f8724a = z;
            this.f8725b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.s = 0;
            a.this.m = null;
            k kVar = this.f8725b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.w.b(0, this.f8724a);
            a.this.s = 2;
            a.this.m = animator;
        }
    }

    public class c extends v8f {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            a.this.q = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f8726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f8727b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ Matrix h;

        public d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f8726a = f;
            this.f8727b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = f7;
            this.h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.w.setAlpha(wc1.b(this.f8726a, this.f8727b, 0.0f, 0.2f, fFloatValue));
            a.this.w.setScaleX(wc1.a(this.c, this.d, fFloatValue));
            a.this.w.setScaleY(wc1.a(this.e, this.d, fFloatValue));
            a.this.q = wc1.a(this.f, this.g, fFloatValue);
            a.this.h(wc1.a(this.f, this.g, fFloatValue), this.h);
            a.this.w.setImageMatrix(this.h);
        }
    }

    public class e implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FloatEvaluator f8728a = new FloatEvaluator();

        public e() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f, Float f2, Float f3) {
            float fFloatValue = this.f8728a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.G();
            return true;
        }
    }

    public class g extends m {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return 0.0f;
        }
    }

    public class h extends m {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.h + aVar.i;
        }
    }

    public class i extends m {
        public i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.h + aVar.j;
        }
    }

    public interface j {
        void a();

        void b();
    }

    public interface k {
        void a();

        void b();
    }

    public class l extends m {
        public l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return a.this.h;
        }
    }

    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8732b;
        public float c;

        public m() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f0((int) this.c);
            this.f8731a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f8731a) {
                l8f l8fVar = a.this.f8719b;
                this.f8732b = l8fVar == null ? 0.0f : l8fVar.w();
                this.c = a();
                this.f8731a = true;
            }
            a aVar = a.this;
            float f = this.f8732b;
            aVar.f0((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ m(a aVar, C0217a c0217a) {
            this();
        }
    }

    public a(FloatingActionButton floatingActionButton, p2m p2mVar) {
        this.w = floatingActionButton;
        this.x = p2mVar;
        uco ucoVar = new uco();
        this.l = ucoVar;
        ucoVar.a(E, k(new i()));
        ucoVar.a(F, k(new h()));
        ucoVar.a(G, k(new h()));
        ucoVar.a(H, k(new h()));
        ucoVar.a(I, k(new l()));
        ucoVar.a(J, k(new g()));
        this.p = floatingActionButton.getRotation();
    }

    public void A() {
        l8f l8fVar = this.f8719b;
        if (l8fVar != null) {
            m8f.f(this.w, l8fVar);
        }
        if (J()) {
            this.w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    public void B() {
        throw null;
    }

    public void C() {
        ViewTreeObserver viewTreeObserver = this.w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    public void D(int[] iArr) {
        throw null;
    }

    public void E(float f2, float f3, float f4) {
        throw null;
    }

    public void F(Rect rect) {
        g6i.h(this.e, "Didn't initialize content background");
        if (!Y()) {
            this.x.setBackgroundDrawable(this.e);
        } else {
            this.x.setBackgroundDrawable(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void G() {
        float rotation = this.w.getRotation();
        if (this.p != rotation) {
            this.p = rotation;
            c0();
        }
    }

    public void H() {
        ArrayList<j> arrayList = this.v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void I() {
        ArrayList<j> arrayList = this.v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public boolean J() {
        throw null;
    }

    public void K(ColorStateList colorStateList) {
        l8f l8fVar = this.f8719b;
        if (l8fVar != null) {
            l8fVar.setTintList(colorStateList);
        }
        u43 u43Var = this.d;
        if (u43Var != null) {
            u43Var.c(colorStateList);
        }
    }

    public void L(PorterDuff.Mode mode) {
        l8f l8fVar = this.f8719b;
        if (l8fVar != null) {
            l8fVar.setTintMode(mode);
        }
    }

    public final void M(float f2) {
        if (this.h != f2) {
            this.h = f2;
            E(f2, this.i, this.j);
        }
    }

    public void N(boolean z) {
        this.f = z;
    }

    public final void O(u8g u8gVar) {
        this.o = u8gVar;
    }

    public final void P(float f2) {
        if (this.i != f2) {
            this.i = f2;
            E(this.h, f2, this.j);
        }
    }

    public final void Q(float f2) {
        this.q = f2;
        Matrix matrix = this.B;
        h(f2, matrix);
        this.w.setImageMatrix(matrix);
    }

    public final void R(int i2) {
        if (this.f8721r != i2) {
            this.f8721r = i2;
            d0();
        }
    }

    public void S(int i2) {
        this.f8720k = i2;
    }

    public final void T(float f2) {
        if (this.j != f2) {
            this.j = f2;
            E(this.h, this.i, f2);
        }
    }

    public void U(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            k47.o(drawable, auk.d(colorStateList));
        }
    }

    public void V(boolean z) {
        this.g = z;
        e0();
    }

    public final void W(r2m r2mVar) {
        this.f8718a = r2mVar;
        l8f l8fVar = this.f8719b;
        if (l8fVar != null) {
            l8fVar.setShapeAppearanceModel(r2mVar);
        }
        Object obj = this.c;
        if (obj instanceof i3m) {
            ((i3m) obj).setShapeAppearanceModel(r2mVar);
        }
        u43 u43Var = this.d;
        if (u43Var != null) {
            u43Var.f(r2mVar);
        }
    }

    public final void X(u8g u8gVar) {
        this.n = u8gVar;
    }

    public boolean Y() {
        throw null;
    }

    public final boolean Z() {
        return androidx.core.view.c.U(this.w) && !this.w.isInEditMode();
    }

    public final boolean a0() {
        return !this.f || this.w.getSizeDimension() >= this.f8720k;
    }

    public void b0(k kVar, boolean z) {
        if (y()) {
            return;
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.n == null;
        if (!Z()) {
            this.w.b(0, z);
            this.w.setAlpha(1.0f);
            this.w.setScaleY(1.0f);
            this.w.setScaleX(1.0f);
            Q(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.w.getVisibility() != 0) {
            this.w.setAlpha(0.0f);
            this.w.setScaleY(z2 ? 0.4f : 0.0f);
            this.w.setScaleX(z2 ? 0.4f : 0.0f);
            Q(z2 ? 0.4f : 0.0f);
        }
        u8g u8gVar = this.n;
        AnimatorSet animatorSetI = u8gVar != null ? i(u8gVar, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f);
        animatorSetI.addListener(new b(z, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    public void c0() {
        throw null;
    }

    public final void d0() {
        Q(this.q);
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        this.u.add(animatorListener);
    }

    public final void e0() {
        Rect rect = this.y;
        r(rect);
        F(rect);
        this.x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(animatorListener);
    }

    public void f0(float f2) {
        l8f l8fVar = this.f8719b;
        if (l8fVar != null) {
            l8fVar.a0(f2);
        }
    }

    public void g(j jVar) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(jVar);
    }

    public final void g0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    public final void h(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.w.getDrawable();
        if (drawable == null || this.f8721r == 0) {
            return;
        }
        RectF rectF = this.z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.f8721r;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.f8721r;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public final AnimatorSet i(u8g u8gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        u8gVar.h("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        u8gVar.h("scale").a(objectAnimatorOfFloat2);
        g0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        u8gVar.h("scale").a(objectAnimatorOfFloat3);
        g0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f4, this.B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.w, new w4d(), new c(), new Matrix(this.B));
        u8gVar.h("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        zc1.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet j(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.w.getAlpha(), f2, this.w.getScaleX(), f3, this.w.getScaleY(), this.q, f4, new Matrix(this.B)));
        arrayList.add(valueAnimatorOfFloat);
        zc1.a(animatorSet, arrayList);
        animatorSet.setDuration(w8g.d(this.w.getContext(), pii.N, this.w.getContext().getResources().getInteger(kti.f24282b)));
        animatorSet.setInterpolator(w8g.e(this.w.getContext(), pii.O, wc1.f37827b));
        return animatorSet;
    }

    public final ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final Drawable l() {
        return this.e;
    }

    public float m() {
        throw null;
    }

    public boolean n() {
        return this.f;
    }

    public final u8g o() {
        return this.o;
    }

    public float p() {
        return this.i;
    }

    public final ViewTreeObserver.OnPreDrawListener q() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    public void r(Rect rect) {
        int sizeDimension = this.f ? (this.f8720k - this.w.getSizeDimension()) / 2 : 0;
        float fM = this.g ? m() + this.j : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fM));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fM * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float s() {
        return this.j;
    }

    public final r2m t() {
        return this.f8718a;
    }

    public final u8g u() {
        return this.n;
    }

    public void v(k kVar, boolean z) {
        if (x()) {
            return;
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!Z()) {
            this.w.b(z ? 8 : 4, z);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        u8g u8gVar = this.o;
        AnimatorSet animatorSetI = u8gVar != null ? i(u8gVar, 0.0f, 0.0f, 0.0f) : j(0.0f, 0.4f, 0.4f);
        animatorSetI.addListener(new C0217a(z, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    public void w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        throw null;
    }

    public boolean x() {
        if (this.w.getVisibility() == 0) {
            return this.s == 1;
        }
        return this.s != 2;
    }

    public boolean y() {
        if (this.w.getVisibility() != 0) {
            return this.s == 2;
        }
        return this.s != 1;
    }

    public void z() {
        throw null;
    }
}
