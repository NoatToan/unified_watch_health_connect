package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;
import miuix.smooth.SmoothContainerDrawable2;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class d2n {
    public static final int[] W = {R.attr.state_checked};
    public boolean A;
    public SpringAnimation B;
    public SpringAnimation C;
    public SpringAnimation D;
    public SpringAnimation E;
    public SpringAnimation F;
    public float H;
    public int Q;
    public int R;
    public int S;
    public int V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f15001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15002b;
    public Drawable c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15003k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f15004r;
    public StateListDrawable t;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public CompoundButton z;
    public final Rect s = new Rect();
    public boolean u = false;
    public final FloatProperty<CompoundButton> v = new a("SliderOffset");
    public float G = 1.0f;
    public boolean I = false;
    public int J = -1;
    public int K = -1;
    public boolean L = false;
    public float M = -1.0f;
    public final FloatProperty<CompoundButton> N = new b("SliderScale");
    public final DynamicAnimation.OnAnimationUpdateListener O = new DynamicAnimation.OnAnimationUpdateListener() { // from class: c2n
        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            this.f4866a.x(dynamicAnimation, f, f2);
        }
    };
    public final FloatProperty<CompoundButton> P = new c("MaskCheckedSlideBarAlpha");
    public float T = 1.0f;
    public float[] U = {0.0f, 0.0f};

    public class a extends FloatProperty<CompoundButton> {
        public a(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(CompoundButton compoundButton) {
            return d2n.this.r();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(CompoundButton compoundButton, float f) {
            d2n.this.Q((int) f);
        }
    }

    public class b extends FloatProperty<CompoundButton> {
        public b(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(CompoundButton compoundButton) {
            return d2n.this.G;
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(CompoundButton compoundButton, float f) {
            d2n.this.G = f;
        }
    }

    public class c extends FloatProperty<CompoundButton> {
        public c(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(CompoundButton compoundButton) {
            return d2n.this.H;
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(CompoundButton compoundButton, float f) {
            d2n.this.H = f;
        }
    }

    public class d implements DynamicAnimation.OnAnimationEndListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f15008a;

        public d(Runnable runnable) {
            this.f15008a = runnable;
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationEndListener
        public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            this.f15008a.run();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d2n d2nVar = d2n.this;
            d2nVar.A = d2nVar.l >= d2n.this.f15003k;
        }
    }

    public d2n(CompoundButton compoundButton) {
        this.H = 1.0f;
        this.z = compoundButton;
        this.A = compoundButton.isChecked();
        if (this.z.isChecked()) {
            return;
        }
        this.H = 0.0f;
    }

    public void A(Canvas canvas) {
        P();
        B(canvas);
        boolean zB = eyq.b(this.z);
        int i = this.i;
        if (zB) {
            i = -i;
        }
        int i2 = zB ? (this.e - this.l) - this.g : this.l;
        float[] fArr = this.U;
        float f = fArr[0];
        int i3 = i2 + i + ((int) f);
        int i4 = (zB ? this.e - this.l : this.g + this.l) + i + ((int) f);
        int i5 = this.f;
        int i6 = this.h;
        int i7 = ((i5 - i6) / 2) + ((int) fArr[1]);
        int i8 = i6 + i7;
        J(canvas, (i4 + i3) / 2, (i8 + i7) / 2);
        if (this.A) {
            this.f15001a.setBounds(i3, i7, i4, i8);
            this.f15001a.draw(canvas);
        } else {
            this.c.setBounds(i3, i7, i4, i8);
            this.c.draw(canvas);
        }
        I(canvas);
    }

    public final void B(Canvas canvas) {
        int i = (int) ((1.0f - this.H) * 255.0f);
        if (i > 0) {
            this.x.setAlpha(i);
            this.x.draw(canvas);
        }
        int i2 = (int) (this.H * 255.0f);
        if (i2 > 0) {
            this.w.setAlpha(i2);
            this.w.draw(canvas);
        }
    }

    public void C(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            this.U = i(this.z, motionEvent);
            this.z.invalidate();
            return;
        }
        if (actionMasked == 9) {
            if (this.C.isRunning()) {
                this.C.cancel();
            }
            this.B.start();
        } else {
            if (actionMasked != 10) {
                return;
            }
            float[] fArr = this.U;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            if (this.B.isRunning()) {
                this.B.cancel();
            }
            this.C.start();
        }
    }

    public final void D() {
        if (this.C.isRunning()) {
            this.C.cancel();
        }
        if (this.B.isRunning()) {
            return;
        }
        this.B.start();
    }

    public void E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.s;
        boolean zB = eyq.b(this.z);
        rect.set(zB ? (this.e - this.l) - this.g : this.l, 0, zB ? this.e - this.l : this.l + this.g, this.f);
        boolean z = true;
        if (action == 0) {
            if (rect.contains(x, y)) {
                this.o = true;
                this.z.setPressed(true);
                D();
                int i = this.l;
                if (i > this.j && i < this.f15003k) {
                    z = false;
                }
                this.u = z;
            } else {
                this.o = false;
            }
            this.m = x;
            this.n = x;
            this.p = false;
            return;
        }
        if (action == 1) {
            this.z.playSoundEffect(0);
            F();
            if (this.o && this.p) {
                z = this.l >= this.f15003k / 2;
                this.A = z;
                j(z);
                if (rect.contains(x, y)) {
                    HapticCompat.e(this.z, alb.F, alb.i);
                }
            } else {
                l();
            }
            this.o = false;
            this.p = false;
            this.z.setPressed(false);
            return;
        }
        if (action == 2) {
            if (this.o) {
                y(x - this.m);
                this.m = x;
                if (Math.abs(x - this.n) >= this.q) {
                    this.p = true;
                    this.z.getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            return;
        }
        if (action != 3) {
            return;
        }
        F();
        if (this.o) {
            z = this.l >= this.f15003k / 2;
            this.A = z;
            j(z);
        }
        this.o = false;
        this.p = false;
        this.z.setPressed(false);
    }

    public final void F() {
        if (this.B.isRunning()) {
            this.B.cancel();
        }
        if (this.C.isRunning()) {
            return;
        }
        this.C.start();
    }

    public final void G() {
        if (this.I) {
            this.l = this.J;
            this.f15002b = this.K;
            this.H = this.M;
            this.A = this.L;
            this.I = false;
            this.J = -1;
            this.K = -1;
            this.M = -1.0f;
        }
    }

    public final void H() {
        this.J = this.l;
        this.K = this.f15002b;
        this.M = this.H;
        this.L = this.A;
        this.I = true;
    }

    public final void I(Canvas canvas) {
        canvas.restore();
    }

    public final void J(Canvas canvas, int i, int i2) {
        canvas.save();
        float f = this.G;
        canvas.scale(f, f, i, i2);
    }

    public void K(float f) {
        this.T = f;
    }

    public void L(boolean z) {
        H();
        this.A = z;
        this.l = z ? this.f15003k : this.j;
        this.f15002b = z ? 255 : 0;
        this.H = z ? 1.0f : 0.0f;
        SpringAnimation springAnimation = this.F;
        if (springAnimation != null && springAnimation.isRunning()) {
            this.F.cancel();
        }
        if (this.E.isRunning()) {
            this.E.cancel();
        }
        if (this.D.isRunning()) {
            this.D.cancel();
        }
        this.z.invalidate();
    }

    public final void M(boolean z) {
        if (this.A) {
            if (this.E.isRunning()) {
                this.E.cancel();
            }
            if (!this.D.isRunning() && !z) {
                this.H = 1.0f;
            }
        }
        if (this.A) {
            return;
        }
        if (this.D.isRunning()) {
            this.D.cancel();
        }
        if (this.E.isRunning() || !z) {
            return;
        }
        this.H = 0.0f;
    }

    public void N(int i) {
        Drawable drawable = this.w;
        if (drawable instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable).k(i);
        }
        Drawable drawable2 = this.x;
        if (drawable2 instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable2).k(i);
        }
        Drawable drawable3 = this.y;
        if (drawable3 instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable3).k(i);
        }
    }

    public void O() {
        ViewParent parent = this.z.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(false);
        }
    }

    public void P() {
        if (s() != null) {
            this.f15001a.setState(this.z.getDrawableState());
            this.c.setState(this.z.getDrawableState());
            this.t.setState(this.z.getDrawableState());
            this.w.setState(this.z.getDrawableState());
            this.x.setState(this.z.getDrawableState());
        }
    }

    public void Q(int i) {
        this.l = i;
        this.z.invalidate();
    }

    public final void R(boolean z) {
        SpringAnimation springAnimation = this.F;
        if (springAnimation == null || !springAnimation.isRunning()) {
            boolean z2 = this.A;
            this.l = z2 ? this.f15003k : this.j;
            this.f15002b = z2 ? 255 : 0;
        }
        G();
        M(z);
    }

    public boolean S(Drawable drawable) {
        return drawable == this.t;
    }

    public final float[] i(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float width = iArr[0] + (view.getWidth() * 0.5f);
        float height = iArr[1] + (view.getHeight() * 0.5f);
        float width2 = view.getWidth() == 0 ? 0.0f : (rawX - width) / view.getWidth();
        float height2 = view.getHeight() != 0 ? (rawY - height) / view.getHeight() : 0.0f;
        float fMax = Math.max(-1.0f, Math.min(1.0f, width2));
        float fMax2 = Math.max(-1.0f, Math.min(1.0f, height2));
        int i = this.V;
        return new float[]{fMax * i, fMax2 * i};
    }

    public final void j(boolean z) {
        if (z != this.z.isChecked()) {
            this.z.setChecked(z);
            R(z);
            z();
        }
        k(z, z ? this.f15003k : this.j, new e());
    }

    public final void k(boolean z, int i, Runnable runnable) {
        SpringAnimation springAnimation = this.F;
        if (springAnimation != null && springAnimation.isRunning()) {
            this.F.cancel();
        }
        if (z != this.z.isChecked()) {
            return;
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.z, this.v, i);
        this.F = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.F.getSpring().setDampingRatio(0.7f);
        this.F.addUpdateListener(this.O);
        this.F.addEndListener(new d(runnable));
        this.F.start();
        if (z) {
            if (!this.D.isRunning()) {
                this.D.start();
            }
            if (this.E.isRunning()) {
                this.E.cancel();
                return;
            }
            return;
        }
        if (!this.E.isRunning()) {
            this.E.start();
        }
        if (this.D.isRunning()) {
            this.D.cancel();
        }
    }

    public final void l() {
        j(!this.z.isChecked());
        HapticCompat.e(this.z, alb.F, alb.i);
    }

    public final Drawable m(Drawable drawable) {
        SmoothContainerDrawable2 smoothContainerDrawable2 = new SmoothContainerDrawable2();
        smoothContainerDrawable2.k(this.z.getLayerType());
        smoothContainerDrawable2.j(this.Q);
        smoothContainerDrawable2.h(drawable);
        int i = this.S;
        int i2 = this.R;
        smoothContainerDrawable2.setBounds(new Rect(i, i2, this.e - i, this.f - i2));
        return smoothContainerDrawable2;
    }

    public final StateListDrawable n() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setBounds(0, 0, this.e, this.f);
        stateListDrawable.setCallback(this.z);
        return stateListDrawable;
    }

    public float o() {
        return this.T;
    }

    public int p() {
        return this.f;
    }

    public int q() {
        return this.e;
    }

    public int r() {
        return this.l;
    }

    public Drawable s() {
        return this.f15001a;
    }

    public void setOnPerformCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15004r = onCheckedChangeListener;
    }

    public void t() {
        SpringAnimation springAnimation = new SpringAnimation(this.z, this.N, 1.127f);
        this.B = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.B.getSpring().setDampingRatio(0.6f);
        this.B.setMinimumVisibleChange(0.002f);
        this.B.addUpdateListener(this.O);
        SpringAnimation springAnimation2 = new SpringAnimation(this.z, this.N, 1.0f);
        this.C = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.C.getSpring().setDampingRatio(0.6f);
        this.C.setMinimumVisibleChange(0.002f);
        this.C.addUpdateListener(this.O);
        SpringAnimation springAnimation3 = new SpringAnimation(this.z, this.P, 1.0f);
        this.D = springAnimation3;
        springAnimation3.getSpring().setStiffness(438.64f);
        this.D.getSpring().setDampingRatio(0.99f);
        this.D.setMinimumVisibleChange(0.00390625f);
        this.D.addUpdateListener(this.O);
        SpringAnimation springAnimation4 = new SpringAnimation(this.z, this.P, 0.0f);
        this.E = springAnimation4;
        springAnimation4.getSpring().setStiffness(986.96f);
        this.E.getSpring().setDampingRatio(0.99f);
        this.E.setMinimumVisibleChange(0.00390625f);
        this.E.addUpdateListener(this.O);
    }

    public final void u(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        this.w = drawable;
        this.x = drawable2;
        this.y = drawable3;
    }

    public void v(Context context, TypedArray typedArray) {
        this.Q = this.z.getResources().getDimensionPixelSize(jmi.f22928a);
        this.R = this.z.getResources().getDimensionPixelSize(jmi.f);
        this.S = this.z.getResources().getDimensionPixelSize(jmi.e);
        this.z.setDrawingCacheEnabled(false);
        this.q = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.f15001a = typedArray.getDrawable(o5j.b0);
        this.c = typedArray.getDrawable(o5j.a0);
        this.z.setBackground(typedArray.getDrawable(o5j.X));
        Color.parseColor("#FF3482FF");
        this.d = typedArray.getColor(o5j.c0, context.getColor(yki.f40271a));
        int dimensionPixelSize = this.z.getResources().getDimensionPixelSize(jmi.c);
        int dimensionPixelSize2 = this.z.getResources().getDimensionPixelSize(jmi.f22929b);
        int dimensionPixelSize3 = this.z.getResources().getDimensionPixelSize(jmi.d);
        this.e = (dimensionPixelSize2 * 2) + this.z.getResources().getDimensionPixelSize(jmi.j);
        this.f = (dimensionPixelSize * 2) + dimensionPixelSize3;
        int dimensionPixelSize4 = this.z.getResources().getDimensionPixelSize(jmi.i);
        int dimensionPixelSize5 = this.z.getResources().getDimensionPixelSize(jmi.g);
        this.i = dimensionPixelSize5;
        this.g = dimensionPixelSize4;
        this.h = dimensionPixelSize4;
        this.j = 0;
        this.f15003k = (this.e - dimensionPixelSize4) - (dimensionPixelSize5 * 2);
        this.l = 0;
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(o5j.Y, typedValue);
        TypedValue typedValue2 = new TypedValue();
        typedArray.getValue(o5j.Z, typedValue2);
        Drawable drawable = typedArray.getDrawable(o5j.Y);
        Drawable drawable2 = typedArray.getDrawable(o5j.Z);
        if (typedValue.type == typedValue2.type && typedValue.data == typedValue2.data && typedValue.resourceId == typedValue2.resourceId) {
            drawable2 = drawable;
        }
        if (drawable2 != null && drawable != null) {
            drawable2.setTint(this.d);
            u(m(drawable2), m(drawable), m(drawable2));
            this.t = n();
        }
        P();
        if (this.z.isChecked()) {
            Q(this.f15003k);
        }
        this.V = this.z.getResources().getDimensionPixelOffset(jmi.h);
    }

    public void w() {
        StateListDrawable stateListDrawable = this.t;
        if (stateListDrawable != null) {
            stateListDrawable.jumpToCurrentState();
        }
    }

    public final /* synthetic */ void x(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.z.invalidate();
    }

    public final void y(int i) {
        if (eyq.b(this.z)) {
            i = -i;
        }
        int i2 = this.l + i;
        this.l = i2;
        int i3 = this.j;
        if (i2 < i3) {
            this.l = i3;
        } else {
            int i4 = this.f15003k;
            if (i2 > i4) {
                this.l = i4;
            }
        }
        int i5 = this.l;
        boolean z = i5 == i3 || i5 == this.f15003k;
        if (z && !this.u) {
            HapticCompat.e(this.z, alb.F, alb.i);
        }
        this.u = z;
        Q(this.l);
    }

    public void z() {
        if (this.f15004r != null) {
            this.f15004r.onCheckedChanged(this.z, this.z.isChecked());
        }
    }
}
