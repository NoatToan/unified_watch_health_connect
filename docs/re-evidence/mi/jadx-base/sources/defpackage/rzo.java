package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.app.AppCompatActivity;
import miuix.internal.widget.RoundFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rzo extends s72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatActivity f33105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f33106b;
    public View c;
    public View d;
    public View e;
    public View f;
    public RoundFrameLayout g;
    public GestureDetector h;
    public ViewGroup.LayoutParams i;
    public h8h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i8h f33107k;
    public float m;
    public float n;
    public float o;
    public float p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f33108r;
    public final Drawable w;
    public float l = 1.0f;
    public boolean q = true;
    public final Handler s = new Handler(Looper.getMainLooper());
    public boolean t = false;
    public boolean u = true;
    public boolean v = false;
    public int x = 0;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (rzo.this.q && !rzo.this.t && !rzo.this.f33105a.isFinishing()) {
                rzo.this.T();
                rzo.this.f0();
                rzo.this.k0();
                rzo.this.r0(true, 2);
            }
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (rzo.this.f33107k != null) {
                rzo.this.f33107k.a();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (rzo.this.f33107k != null) {
                rzo.this.f33107k.i();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rzo.this.f33105a.realFinish();
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<rzo> f33113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<AppCompatActivity> f33114b;

        public e(rzo rzoVar, AppCompatActivity appCompatActivity) {
            this.f33113a = new WeakReference<>(rzoVar);
            this.f33114b = new WeakReference<>(appCompatActivity);
        }

        public final void b(AppCompatActivity appCompatActivity, rzo rzoVar, boolean z, int i, boolean z2) {
            if (rzoVar.X()) {
                rzoVar.p0(z, i);
            } else if (appCompatActivity != null) {
                appCompatActivity.realFinish();
                d(appCompatActivity, rzoVar, z2);
            }
        }

        public final void c(boolean z) {
            rzo rzoVar = this.f33113a.get();
            if (rzoVar != null) {
                rzoVar.s0(3);
            }
            AppCompatActivity appCompatActivity = this.f33114b.get();
            if (rzoVar != null) {
                b(appCompatActivity, rzoVar, true, 3, z);
            }
        }

        public final void d(AppCompatActivity appCompatActivity, rzo rzoVar, boolean z) {
            if (z) {
                ty9.i(appCompatActivity, rzoVar.u);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            c(false);
        }
    }

    public static class f extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<rzo> f33115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33116b;
        public boolean c;
        public int d;
        public boolean e;

        public /* synthetic */ f(rzo rzoVar, boolean z, int i, int i2, a aVar) {
            this(rzoVar, z, i, i2);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            WeakReference<rzo> weakReference = this.f33115a;
            rzo rzoVar = weakReference == null ? null : weakReference.get();
            if (rzoVar != null) {
                rzoVar.l0(obj);
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            WeakReference<rzo> weakReference = this.f33115a;
            rzo rzoVar = weakReference == null ? null : weakReference.get();
            if (rzoVar != null) {
                rzoVar.l0(obj);
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindBy = UpdateInfo.findBy(collection, ViewProperty.TRANSLATION_Y);
            if (!this.c || updateInfoFindBy == null) {
                return;
            }
            rzo rzoVar = this.f33115a.get();
            if (this.e || updateInfoFindBy.getFloatValue() <= this.d * 0.6f || rzoVar == null) {
                return;
            }
            this.e = true;
            rzoVar.P();
        }

        public f(rzo rzoVar, boolean z, int i, int i2) {
            this.e = false;
            this.f33115a = new WeakReference<>(rzoVar);
            this.f33116b = i2;
            this.c = z;
            this.d = i;
        }
    }

    public rzo(AppCompatActivity appCompatActivity) {
        this.f33105a = appCompatActivity;
        this.w = hm1.h(appCompatActivity, R.attr.windowBackground);
    }

    public final void K(int i) {
        s0(i);
        if (!X()) {
            this.f33105a.realFinish();
            ty9.k(this.f33105a);
        } else if (!this.t) {
            q0(i);
        }
        N();
    }

    public final boolean L() {
        new e(this, this.f33105a).c(true);
        return true;
    }

    public final void M(float f2) {
        this.c.setAlpha(this.l * (1.0f - Math.max(0.0f, Math.min(f2, 1.0f))));
    }

    public void N() {
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void Z(final boolean z, final int i) {
        float f2;
        String str;
        int i2;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f33105a.runOnUiThread(new Runnable() { // from class: lzo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25589a.Z(z, i);
                }
            });
            return;
        }
        if (this.t && z) {
            return;
        }
        this.t = true;
        if (z) {
            i2 = (int) this.f33108r;
            str = "dismiss";
            f2 = 0.0f;
        } else {
            f2 = this.l;
            str = "init";
            i2 = 0;
        }
        AnimConfig animConfigM = vy9.m(z ? 2 : 1, null);
        animConfigM.addListeners(new f(this, z, i2, i, null));
        AnimState animStateAdd = new AnimState(str).add(ViewProperty.TRANSLATION_Y, i2);
        AnimState animStateAdd2 = new AnimState(str).add(ViewProperty.ALPHA, f2);
        Folme.useAt(S()).state().to(animStateAdd, animConfigM);
        Folme.useAt(this.c).state().to(animStateAdd2, new AnimConfig[0]);
    }

    public void P() {
        b bVar = new b();
        View view = this.c;
        if (view != null) {
            view.post(bVar);
        } else {
            bVar.run();
        }
    }

    public final void Q() {
        this.d.post(new Runnable() { // from class: qzo
            @Override // java.lang.Runnable
            public final void run() {
                this.f32034a.a0();
            }
        });
    }

    public final void R() {
        View viewS = S();
        int height = viewS.getHeight() + ((this.f.getHeight() - viewS.getHeight()) / 2);
        IStateStyle iStateStyleState = Folme.useAt(viewS).state();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_Y;
        iStateStyleState.setTo(viewProperty, Integer.valueOf(height)).to(viewProperty, 0, vy9.m(1, null));
        fw6.b(this.c);
    }

    public final View S() {
        View view = this.e;
        return view == null ? this.d : view;
    }

    public final void T() {
        i8h i8hVar;
        if (ty9.f() || (i8hVar = this.f33107k) == null || !this.q) {
            return;
        }
        i8hVar.f(this.f33105a);
    }

    public final void U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            j0();
            float rawY = motionEvent.getRawY();
            this.m = rawY;
            this.n = rawY;
            this.o = 0.0f;
            f0();
            return;
        }
        if (action == 1) {
            boolean z = motionEvent.getRawY() - this.m > ((float) this.d.getHeight()) * 0.5f;
            s0(1);
            if (!z) {
                Z(false, 1);
                return;
            }
            T();
            i8h i8hVar = this.f33107k;
            Z(i8hVar == null || !i8hVar.onFinish(1), 1);
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY2 = motionEvent.getRawY();
        float f2 = this.o + (rawY2 - this.n);
        this.o = f2;
        if (f2 >= 0.0f) {
            h0(f2);
            M(this.o / this.f33108r);
        }
        this.n = rawY2;
    }

    public final boolean V() {
        return this.u && W();
    }

    public final boolean W() {
        i8h i8hVar = this.f33107k;
        if (i8hVar == null) {
            return true;
        }
        return i8hVar.h();
    }

    public final boolean X() {
        i8h i8hVar;
        return this.u && ((i8hVar = this.f33107k) == null || i8hVar.e());
    }

    public boolean Y() {
        return this.u;
    }

    @Override // defpackage.s72
    public boolean a() {
        if (ty9.f()) {
            return L();
        }
        if (this.u) {
            T();
            this.s.postDelayed(new e(this, this.f33105a), 110L);
            return true;
        }
        this.f33105a.realFinish();
        N();
        return true;
    }

    public final /* synthetic */ void a0() {
        if (V()) {
            g0();
            R();
        }
    }

    @Override // defpackage.s72
    public void b() {
        T();
        f0();
        k0();
        r0(true, 0);
    }

    public final /* synthetic */ boolean b0(View view, MotionEvent motionEvent) {
        this.h.onTouchEvent(motionEvent);
        return true;
    }

    @Override // defpackage.s72
    public View c() {
        return this.d;
    }

    public final /* synthetic */ void c0() {
        this.f.setOnTouchListener(new View.OnTouchListener() { // from class: pzo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f30939a.b0(view, motionEvent);
            }
        });
    }

    @Override // defpackage.s72
    public ViewGroup.LayoutParams d() {
        return this.i;
    }

    public final /* synthetic */ boolean d0(View view, MotionEvent motionEvent) {
        if (!this.q) {
            return true;
        }
        U(motionEvent);
        return true;
    }

    @Override // defpackage.s72
    public void e() {
        this.d.setVisibility(8);
    }

    public final /* synthetic */ void e0(float f2) {
        this.g.setAlpha(f2);
    }

    @Override // defpackage.yoc
    public void executeCloseEnterAnimation() {
        if (this.u) {
            vy9.b(this.d);
        }
    }

    @Override // defpackage.yoc
    public void executeCloseExitAnimation() {
        if (this.u) {
            vy9.d(this.d);
        }
    }

    @Override // defpackage.yoc
    public void executeOpenEnterAnimation() {
        if (this.u) {
            vy9.f(this.d);
        }
    }

    @Override // defpackage.yoc
    public void executeOpenExitAnimation() {
        if (this.u) {
            vy9.h(this.d);
        }
    }

    @Override // defpackage.s72
    public void f() {
        this.c.setVisibility(8);
    }

    public final void f0() {
        View viewS = S();
        this.f33108r = viewS.getHeight() + ((this.f.getHeight() - viewS.getHeight()) / 2);
    }

    @Override // defpackage.s72
    @SuppressLint({"ClickableViewAccessibility"})
    public void g(View view, boolean z) {
        this.f33106b = view.findViewById(vsi.e0);
        View viewFindViewById = view.findViewById(vsi.h);
        this.c = viewFindViewById;
        viewFindViewById.setVisibility(z ? 0 : 8);
        float f2 = hm1.d(view.getContext(), R.attr.isLightTheme, true) ? gw6.f19394a : gw6.f19395b;
        this.l = f2;
        this.c.setAlpha(f2);
        this.d = view.findViewById(vsi.j);
        this.f = view.findViewById(vsi.i);
        this.u = z;
        this.h = new GestureDetector(view.getContext(), new a());
        this.f.postDelayed(new Runnable() { // from class: mzo
            @Override // java.lang.Runnable
            public final void run() {
                this.f27385a.c0();
            }
        }, 500L);
        this.f33106b.setOnTouchListener(new View.OnTouchListener() { // from class: nzo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f28595a.d0(view2, motionEvent);
            }
        });
        Q();
        this.f33105a.getWindow().setBackgroundDrawableResource(rki.g);
        if (this.u || !dyq.f(this.f33105a)) {
            this.d.setBackground(this.w);
        } else {
            this.d.setBackground(new ColorDrawable(-16777216));
        }
        if (this.q && this.u) {
            this.f33106b.setVisibility(0);
        } else {
            this.f33106b.setVisibility(8);
        }
    }

    public final void g0() {
        i8h i8hVar = this.f33107k;
        if (i8hVar != null) {
            i8hVar.d(this.f33105a);
        }
    }

    public final void h0(float f2) {
        S().setTranslationY(f2);
    }

    public final void i0() {
        c cVar = new c();
        View view = this.c;
        if (view != null) {
            view.post(cVar);
        } else {
            cVar.run();
        }
    }

    @Override // defpackage.s72
    public void j() {
        if (this.u && !ty9.f()) {
            T();
        }
        K(4);
    }

    public final void j0() {
        i8h i8hVar = this.f33107k;
        if (i8hVar != null) {
            i8hVar.b();
        }
    }

    @Override // defpackage.s72
    public ViewGroup k(View view, boolean z) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f33105a, awi.N, null);
        View viewFindViewById = viewGroup.findViewById(vsi.j);
        View viewFindViewById2 = viewGroup.findViewById(vsi.e0);
        if (viewFindViewById2 != null && (viewFindViewById2.getParent() instanceof ViewGroup)) {
            ((ViewGroup) viewFindViewById2.getParent()).removeView(viewFindViewById2);
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).addView(viewFindViewById2);
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, 17);
        this.i = layoutParams2;
        if (z) {
            ((ViewGroup.LayoutParams) layoutParams2).height = -2;
            ((ViewGroup.LayoutParams) layoutParams2).width = -2;
        } else {
            ((ViewGroup.LayoutParams) layoutParams2).width = -1;
            ((ViewGroup.LayoutParams) layoutParams2).height = -1;
        }
        viewGroup.removeView(viewFindViewById);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.p = this.f33105a.getResources().getDimensionPixelSize(dmi.d0);
        RoundFrameLayout roundFrameLayout = new RoundFrameLayout(this.f33105a);
        this.g = roundFrameLayout;
        roundFrameLayout.setLayoutParams(this.i);
        this.g.addView(view);
        this.g.setRadius(z ? this.p : 0.0f);
        o0(this.g);
        m0();
        viewGroup.addView(this.g);
        n0(this.g);
        return viewGroup;
    }

    public final void k0() {
        i8h i8hVar = this.f33107k;
        if (i8hVar != null) {
            i8hVar.g();
        }
    }

    @Override // defpackage.s72
    public void l(boolean z) {
        this.q = z;
        if (z && this.u) {
            this.f33106b.setVisibility(0);
        } else {
            this.f33106b.setVisibility(8);
        }
    }

    public final void l0(Object obj) {
        if (TextUtils.equals("dismiss", obj.toString())) {
            View view = this.c;
            if (view != null) {
                view.post(new d());
            } else {
                this.f33105a.realFinish();
            }
        } else if (TextUtils.equals("init", obj.toString())) {
            i0();
        }
        this.t = false;
    }

    @Override // defpackage.s72
    public void m(boolean z) {
        this.v = z;
        RoundFrameLayout roundFrameLayout = this.g;
        if (roundFrameLayout != null) {
            o0(roundFrameLayout);
        }
    }

    public final void m0() {
        if (this.u) {
            final float alpha = this.g.getAlpha();
            this.g.setAlpha(0.0f);
            this.g.postDelayed(new Runnable() { // from class: ozo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29849a.e0(alpha);
                }
            }, 90L);
        }
    }

    @Override // defpackage.s72
    public void n(boolean z) {
        this.u = z;
        if (!xcd.b(this.f33105a.getIntent())) {
            y94.a(this.f33105a, true);
        }
        if (this.c != null && this.f33107k.c()) {
            this.c.setVisibility(z ? 0 : 8);
        }
        if (this.g != null) {
            float dimensionPixelSize = this.f33105a.getResources().getDimensionPixelSize(dmi.d0);
            this.p = dimensionPixelSize;
            RoundFrameLayout roundFrameLayout = this.g;
            if (!z) {
                dimensionPixelSize = 0.0f;
            }
            roundFrameLayout.setRadius(dimensionPixelSize);
            o0(this.g);
        }
        if (this.d != null) {
            if (z || !dyq.f(this.f33105a)) {
                this.d.setBackground(this.w);
            } else {
                this.d.setBackground(new ColorDrawable(-16777216));
            }
        }
        View view = this.f33106b;
        if (view != null) {
            if (this.q && this.u) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    public final void n0(View view) {
        this.e = view;
    }

    @Override // defpackage.s72
    public void o(i8h i8hVar) {
        this.f33107k = i8hVar;
    }

    public final void o0(RoundFrameLayout roundFrameLayout) {
        if (this.u && this.v) {
            roundFrameLayout.e(this.f33105a.getResources().getDimensionPixelSize(dmi.c0), hm1.f(this.f33105a, zhi.M, 0));
        } else {
            roundFrameLayout.e(0.0f, 0);
        }
    }

    @Override // defpackage.s72
    public void p(h8h h8hVar) {
        this.j = h8hVar;
    }

    public final void p0(boolean z, int i) {
        if (!z || this.t) {
            return;
        }
        f0();
        k0();
        Z(true, i);
    }

    @Override // defpackage.s72
    public boolean q() {
        return true;
    }

    public final void q0(int i) {
        f0();
        k0();
        Z(true, i);
    }

    @Override // defpackage.s72
    public void r() {
        this.d.setVisibility(0);
    }

    public final void r0(boolean z, int i) {
        s0(i);
        if (!z) {
            Z(false, i);
            return;
        }
        h8h h8hVar = this.j;
        if (h8hVar != null && h8hVar.onFinish(i)) {
            Z(false, i);
        } else {
            i8h i8hVar = this.f33107k;
            Z(i8hVar == null || !i8hVar.onFinish(i), i);
        }
    }

    public final void s0(int i) {
        this.x = i;
    }
}
