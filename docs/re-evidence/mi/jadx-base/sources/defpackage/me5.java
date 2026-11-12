package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import miuix.animation.utils.VelocityMonitor;
import miuix.springback.view.SpringBackLayout;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class me5 extends ze2 {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public View.OnLayoutChangeListener G;
    public SpringBackLayout.a H;
    public hsq I;
    public ze2.c.b J;
    public ze2.b.a K;
    public final i L;
    public final l M;
    public final g N;
    public final f O;
    public final m P;
    public final h Q;
    public ze2.a g;
    public Context h;
    public LayoutInflater i;
    public SpringBackLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f26053k;
    public FrameLayout l;
    public View m;
    public View n;
    public View o;
    public VelocityMonitor p;
    public c2q q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f26054r;
    public ze2.b.InterfaceC1167b s;
    public float t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public long z;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingTop;
            int paddingBottom;
            SpringBackLayout springBackLayout = (SpringBackLayout) view;
            int springScrollY = springBackLayout.getSpringScrollY();
            int i9 = -springScrollY;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 0);
            me5.this.f26053k.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            View viewS = me5.this.S();
            View viewQ = me5.this.Q();
            if (viewS != null) {
                viewS.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            if (springBackLayout.I()) {
                me5.this.f26053k.layout(0, -i9, view.getWidth(), 0);
            } else {
                me5.this.f26053k.layout(0, 0, view.getWidth(), i9);
            }
            if (me5.this.j.getTarget() != null) {
                paddingTop = me5.this.j.getTarget().getPaddingTop();
                paddingBottom = me5.this.j.getTarget().getPaddingBottom();
            } else {
                paddingTop = 0;
                paddingBottom = 0;
            }
            if (viewQ != null) {
                viewQ.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(springScrollY, 0));
                viewQ.layout(0, me5.this.j.getHeight() - paddingBottom, view.getWidth(), (me5.this.j.getHeight() - paddingBottom) + springScrollY);
            }
            if (viewS != null) {
                if (springBackLayout.I()) {
                    viewS.layout(0, (-i9) + paddingTop, view.getWidth(), paddingTop);
                } else {
                    viewS.layout(0, paddingTop, view.getWidth(), i9 + paddingTop);
                }
            }
            me5.this.J0(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    public class b implements SpringBackLayout.a {
        public b() {
        }

        @Override // miuix.springback.view.SpringBackLayout.a
        public boolean a() {
            return me5.this.q.c();
        }
    }

    public class c implements hsq {
        public c() {
        }

        @Override // defpackage.hsq
        public void a(int i, int i2, boolean z) {
            me5.this.u = i2;
            me5.this.v = z;
            me5.this.q.a(i, i2);
            c2q c2qVar = me5.this.q;
            me5 me5Var = me5.this;
            if (c2qVar == me5Var.L) {
                View viewQ = me5Var.Q();
                if (me5.this.F || viewQ == null || viewQ.getVisibility() != 0) {
                    return;
                }
                viewQ.setVisibility(8);
                return;
            }
            me5Var.f26053k.setVisibility(0);
            View viewQ2 = me5.this.Q();
            if (!me5.this.F || viewQ2 == null || viewQ2.getVisibility() == 0) {
                return;
            }
            viewQ2.setVisibility(0);
        }

        @Override // defpackage.hsq
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            SpringBackLayout springBackLayout = (SpringBackLayout) view;
            int i5 = i2 - i4;
            int i6 = i - i3;
            int springScrollY = springBackLayout.getSpringScrollY();
            me5 me5Var = me5.this;
            me5Var.y = me5Var.x;
            me5Var.x = -springScrollY;
            me5Var.p.update(me5.this.x);
            me5 me5Var2 = me5.this;
            me5Var2.t = me5Var2.p.getVelocity(0);
            if (springBackLayout.I()) {
                me5.this.f26053k.setTop(springScrollY);
            } else {
                me5.this.f26053k.setTop(0);
            }
            int paddingBottom = me5.this.j.getTarget() != null ? me5.this.j.getTarget().getPaddingBottom() : 0;
            if (me5.this.m != null && springScrollY >= 0) {
                me5.this.m.layout(0, me5.this.j.getHeight() - paddingBottom, view.getWidth(), (me5.this.j.getHeight() - paddingBottom) + springScrollY);
            }
            me5 me5Var3 = me5.this;
            if (me5Var3.x < 0 && me5Var3.g == me5.this.g() && me5.this.g() != null) {
                me5 me5Var4 = me5.this;
                float fL = me5Var4.L(me5Var4.g);
                if (me5.this.u == 1 && (Math.abs(me5.this.y) < fL || Math.abs(me5.this.x) < fL)) {
                    c2q c2qVar = me5.this.q;
                    me5 me5Var5 = me5.this;
                    if (c2qVar == me5Var5.O) {
                        me5Var5.M0(me5Var5.M);
                    }
                }
            }
            if (me5.this.g != null && (me5.this.g instanceof ze2.b)) {
                me5 me5Var6 = me5.this;
                float fL2 = me5Var6.L(me5Var6.g);
                if (me5.this.u == 1 && (Math.abs(me5.this.y) < fL2 || Math.abs(me5.this.x) < fL2)) {
                    c2q c2qVar2 = me5.this.q;
                    me5 me5Var7 = me5.this;
                    if (c2qVar2 == me5Var7.O) {
                        me5Var7.M0(me5Var7.M);
                    }
                }
                if (me5.this.u == 1) {
                    c2q c2qVar3 = me5.this.q;
                    me5 me5Var8 = me5.this;
                    if (c2qVar3 == me5Var8.P && Math.abs(me5Var8.y) > me5.this.g.mEnterPoint) {
                        me5 me5Var9 = me5.this;
                        me5Var9.M0(me5Var9.M);
                    }
                }
            }
            me5.this.q.b(i5, springScrollY);
            me5 me5Var10 = me5.this;
            me5Var10.K0(springBackLayout, i6, i5, me5Var10.x);
        }
    }

    public class d implements ze2.c.b {
        public d() {
        }
    }

    public class e implements ze2.b.a {
        public e() {
        }

        @Override // ze2.b.a
        public void a(ze2.b bVar, int i) {
            me5.this.E = false;
            c2q c2qVar = me5.this.q;
            me5 me5Var = me5.this;
            if (c2qVar == me5Var.N && me5Var.g == bVar) {
                if (me5.this.f26054r != null) {
                    me5.this.f26054r.a(bVar, i);
                }
                if (me5.this.j.getSpringScrollY() == 0) {
                    me5 me5Var2 = me5.this;
                    me5Var2.M0(me5Var2.L);
                    return;
                }
                me5 me5Var3 = me5.this;
                me5Var3.M0(me5Var3.O);
                if (me5.this.u == 0) {
                    me5.this.j.F(0, 0);
                }
            }
        }

        @Override // ze2.b.a
        public void b(ze2.b bVar) {
            c2q c2qVar = me5.this.q;
            me5 me5Var = me5.this;
            if (c2qVar == me5Var.N && me5Var.g == bVar) {
                if (me5.this.j.getSpringScrollY() != 0) {
                    me5 me5Var2 = me5.this;
                    me5Var2.M0(me5Var2.O);
                    if (me5.this.u == 0 || me5.this.u == 2) {
                        me5.this.j.F(0, 0);
                    }
                } else {
                    me5 me5Var3 = me5.this;
                    me5Var3.M0(me5Var3.L);
                }
                if (me5.this.f26054r != null) {
                    me5.this.f26054r.b(bVar);
                }
            }
            if (!me5.this.E && me5.this.N() > 5000) {
                HapticCompat.e(me5.this.j, alb.w, alb.f1169k);
                me5.this.L0();
            }
            me5.this.E = false;
        }

        @Override // ze2.b.a
        public void c(ze2.b bVar) {
            ze2.a aVar;
            me5.this.E = true;
            if (me5.this.e().size() > 0 && (aVar = me5.this.e().get(0)) == bVar && me5.this.g == null) {
                c2q c2qVar = me5.this.q;
                me5 me5Var = me5.this;
                if (c2qVar == me5Var.L) {
                    me5Var.M0(me5Var.M);
                    ze2.a aVar2 = me5.this.g;
                    me5.this.g = aVar;
                    me5 me5Var2 = me5.this;
                    me5Var2.H0(me5Var2.g, aVar2, me5.this.y);
                    if (me5.this.f26054r != null) {
                        me5.this.f26054r.c(bVar);
                    }
                    me5 me5Var3 = me5.this;
                    me5Var3.j.F(0, -me5Var3.g.mTriggerPoint);
                    if (me5.this.j.I()) {
                        me5.this.f26053k.layout(0, -me5.this.g.mTriggerPoint, me5.this.f26053k.getWidth(), 0);
                    } else {
                        me5.this.f26053k.layout(0, 0, me5.this.f26053k.getWidth(), me5.this.g.mTriggerPoint);
                    }
                    me5 me5Var4 = me5.this;
                    me5Var4.M0(me5Var4.P);
                }
            }
        }

        @Override // ze2.b.a
        public void d(ze2.b bVar) {
            me5.this.E = false;
            c2q c2qVar = me5.this.q;
            me5 me5Var = me5.this;
            if (c2qVar == me5Var.N && me5Var.g == bVar) {
                if (me5.this.f26054r != null) {
                    me5.this.f26054r.d(bVar);
                }
                if (me5.this.j.getSpringScrollY() == 0) {
                    me5 me5Var2 = me5.this;
                    me5Var2.M0(me5Var2.L);
                    return;
                }
                me5 me5Var3 = me5.this;
                me5Var3.M0(me5Var3.O);
                if (me5.this.u == 0) {
                    me5.this.j.F(0, 0);
                }
            }
        }

        @Override // ze2.b.a
        public void e(ze2.b bVar, int i, String str) {
            bVar.mTriggerTexts[i] = str;
        }

        @Override // ze2.b.a
        public void f(ze2.b bVar) {
            me5.this.E = false;
            c2q c2qVar = me5.this.q;
            me5 me5Var = me5.this;
            if (c2qVar == me5Var.N && me5Var.g == bVar) {
                if (me5.this.j.getSpringScrollY() != 0) {
                    me5 me5Var2 = me5.this;
                    me5Var2.M0(me5Var2.O);
                    if (me5.this.u == 0) {
                        me5.this.j.F(0, 0);
                    }
                } else {
                    me5 me5Var3 = me5.this;
                    me5Var3.M0(me5Var3.L);
                }
                if (me5.this.f26054r != null) {
                    me5.this.f26054r.b(bVar);
                }
            }
        }
    }

    public class f extends c2q {
        public f() {
        }

        @Override // defpackage.c2q
        public void a(int i, int i2) {
            super.a(i, i2);
            if (i2 == 0) {
                me5 me5Var = me5.this;
                me5Var.M0(me5Var.L);
            }
        }

        public /* synthetic */ f(me5 me5Var, a aVar) {
            this();
        }
    }

    public class g extends c2q {
        public g() {
        }

        @Override // defpackage.c2q
        public void a(int i, int i2) {
            super.a(i, i2);
        }

        @Override // defpackage.c2q
        public void b(int i, int i2) {
            super.b(i, i2);
        }

        @Override // defpackage.c2q
        public boolean c() {
            if (me5.this.g != null && (me5.this.g instanceof ze2.b)) {
                me5 me5Var = me5.this;
                if (me5Var.x > me5Var.g.mTriggerPoint) {
                    me5 me5Var2 = me5.this;
                    me5Var2.j.F(0, -me5Var2.g.mTriggerPoint);
                    return true;
                }
            }
            return super.c();
        }

        public /* synthetic */ g(me5 me5Var, a aVar) {
            this();
        }
    }

    public class h extends c2q {
        public h() {
        }

        @Override // defpackage.c2q
        public void a(int i, int i2) {
            if (i2 == 0) {
                me5 me5Var = me5.this;
                me5Var.M0(me5Var.L);
            }
        }

        @Override // defpackage.c2q
        public void b(int i, int i2) {
            if (me5.this.g == null || !(me5.this.g instanceof ze2.d)) {
                return;
            }
            me5 me5Var = me5.this;
            if (me5Var.x >= me5Var.g.mEnterPoint || me5.this.u != 1) {
                return;
            }
            me5.this.A = -1;
            me5 me5Var2 = me5.this;
            me5Var2.M0(me5Var2.M);
        }

        public /* synthetic */ h(me5 me5Var, a aVar) {
            this();
        }
    }

    public class i extends c2q {
        public i() {
        }

        @Override // defpackage.c2q
        public void a(int i, int i2) {
            if (i == 0) {
                if (i2 == 1 || i2 == 2) {
                    me5 me5Var = me5.this;
                    me5Var.M0(me5Var.M);
                }
            }
        }

        public /* synthetic */ i(me5 me5Var, a aVar) {
            this();
        }
    }

    public interface j {
        void a(ze2.b bVar, int i);

        void b(ze2.b bVar);

        void c(ze2.b bVar);

        void d(ze2.b bVar);
    }

    public interface k {
    }

    public class m extends c2q {
        public m() {
        }

        @Override // defpackage.c2q
        public void a(int i, int i2) {
            if (i2 == 0) {
                me5 me5Var = me5.this;
                me5Var.M0(me5Var.N);
                if (me5.this.g != null && (me5.this.g instanceof ze2.b)) {
                    me5.this.g.notifyTriggered();
                    me5 me5Var2 = me5.this;
                    me5Var2.I0(me5Var2.g, me5.this.x);
                } else {
                    if (me5.this.g() == null || !(me5.this.g instanceof ze2.c)) {
                        return;
                    }
                    me5.this.g().notifyTriggered();
                    me5 me5Var3 = me5.this;
                    me5Var3.I0(me5Var3.g, me5.this.x);
                }
            }
        }

        public /* synthetic */ m(me5 me5Var, a aVar) {
            this();
        }
    }

    public me5(Context context) {
        super(context);
        this.t = 0.0f;
        this.v = true;
        this.w = false;
        this.z = -1L;
        this.A = -1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new a();
        this.H = new b();
        this.I = new c();
        this.J = new d();
        this.K = new e();
        a aVar = null;
        i iVar = new i(this, aVar);
        this.L = iVar;
        this.M = new l(this, aVar);
        this.N = new g(this, aVar);
        this.O = new f(this, aVar);
        this.P = new m(this, aVar);
        this.Q = new h(this, aVar);
        this.q = iVar;
        Y(context);
    }

    public final void A0(int i2) {
    }

    public final void B0(int i2) {
    }

    public final void C0(int i2) {
    }

    public final void D0(ze2.a aVar, int i2) {
        if (aVar != null && (aVar instanceof ze2.b)) {
            l0(i2);
            return;
        }
        if (aVar != null && (aVar instanceof ze2.d)) {
            u0(i2);
        } else {
            if (aVar == null || !(aVar instanceof ze2.c)) {
                return;
            }
            c0(i2);
        }
    }

    public final void E0(ze2.a aVar, ze2.a aVar2, int i2) {
        if (aVar != null && (aVar instanceof ze2.b)) {
            if (Math.abs(i2) < aVar.mEnterPoint) {
                s0(i2);
            }
            if (Math.abs(i2) >= aVar.mEnterPoint && Math.abs(i2) < aVar.mTriggerPoint) {
                o0(i2);
            }
            if (Math.abs(i2) >= aVar.mTriggerPoint) {
                m0(i2);
                return;
            }
            return;
        }
        if (aVar != null && (aVar instanceof ze2.d)) {
            if (Math.abs(i2) < aVar.mEnterPoint) {
                B0(i2);
            }
            if (Math.abs(i2) >= aVar.mEnterPoint && Math.abs(i2) < aVar.mTriggerPoint) {
                x0(i2);
            }
            if (Math.abs(i2) >= aVar.mTriggerPoint) {
                v0(i2);
                return;
            }
            return;
        }
        if (aVar == null || !(aVar instanceof ze2.c)) {
            return;
        }
        if (Math.abs(i2) < aVar.mEnterPoint) {
            j0(i2);
        }
        if (Math.abs(i2) >= aVar.mEnterPoint && Math.abs(i2) < aVar.mTriggerPoint) {
            f0(i2);
        }
        if (Math.abs(i2) >= aVar.mTriggerPoint) {
            d0(i2);
        }
    }

    public final void F0(ze2.a aVar, int i2) {
        if (aVar != null && (aVar instanceof ze2.b)) {
            n0(i2);
            return;
        }
        if (aVar != null && (aVar instanceof ze2.d)) {
            w0(i2);
        } else {
            if (aVar == null || !(aVar instanceof ze2.c)) {
                return;
            }
            e0(i2);
        }
    }

    public final void G0(ze2.a aVar, int i2) {
        if (aVar != null && (aVar instanceof ze2.b)) {
            p0(i2);
            return;
        }
        if (aVar != null && (aVar instanceof ze2.d)) {
            y0(i2);
        } else {
            if (aVar == null || !(aVar instanceof ze2.c)) {
                return;
            }
            g0(i2);
        }
    }

    public final void H0(ze2.a aVar, ze2.a aVar2, int i2) {
        if (aVar != null && (aVar instanceof ze2.b) && aVar2 != aVar) {
            r0(i2);
            return;
        }
        if (aVar != null && (aVar instanceof ze2.d) && aVar2 != aVar) {
            A0(i2);
        } else {
            if (aVar == null || !(aVar instanceof ze2.c) || aVar2 == aVar) {
                return;
            }
            i0(i2);
        }
    }

    public final void I0(ze2.a aVar, int i2) {
        if (aVar != null && (aVar instanceof ze2.b)) {
            t0(i2);
            return;
        }
        if (aVar != null && (aVar instanceof ze2.d)) {
            C0(i2);
        } else {
            if (aVar == null || !(aVar instanceof ze2.c)) {
                return;
            }
            k0(i2);
        }
    }

    public abstract void J0(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public abstract void K0(SpringBackLayout springBackLayout, int i2, int i3, int i4);

    public final float L(ze2.a aVar) {
        float fX;
        int i2;
        float f2;
        if (aVar != null && (aVar instanceof ze2.b)) {
            fX = T();
        } else if (aVar == null || !(aVar instanceof ze2.c)) {
            fX = (aVar == null || !(aVar instanceof ze2.d)) ? -1.0f : X();
        } else {
            fX = R();
        }
        if (fX < 0.0f) {
            if (this.x >= 0 || aVar != g() || g() == null) {
                ze2.a aVar2 = this.g;
                if (aVar2 != null && (aVar instanceof ze2.b)) {
                    int i3 = aVar2.mTriggerPoint;
                    i2 = aVar2.mEnterPoint;
                    f2 = (i3 - i2) * 0.25f;
                }
            } else {
                f2 = (g().mTriggerPoint - g().mEnterPoint) * 0.25f;
                i2 = g().mEnterPoint;
            }
            return f2 + i2;
        }
        return 0.0f;
    }

    public final void L0() {
        this.z = -1L;
    }

    public void M(SpringBackLayout springBackLayout) {
        if (!springBackLayout.I()) {
            springBackLayout.setSpringBackEnableOnTriggerAttached(true);
        }
        this.j = springBackLayout;
        springBackLayout.addView(this.f26053k);
        if (this.m != null) {
            boolean z = false;
            for (int i2 = 0; i2 < this.j.getChildCount(); i2++) {
                if (this.j.getChildAt(i2) == this.m) {
                    z = true;
                }
            }
            if (!z) {
                this.j.addView(this.m);
            }
        }
        if (this.o != null) {
            boolean z2 = false;
            for (int i3 = 0; i3 < this.l.getChildCount(); i3++) {
                if (this.l.getChildAt(i3) == this.o) {
                    z2 = true;
                }
            }
            if (!z2) {
                this.l.addView(this.o);
            }
        }
        springBackLayout.addOnLayoutChangeListener(this.G);
        springBackLayout.setOnSpringListener(this.H);
        springBackLayout.addOnScrollChangeListener(this.I);
    }

    public void M0(c2q c2qVar) {
        ze2.a aVar;
        this.q = c2qVar;
        if (c2qVar == this.L) {
            if (this.v && (aVar = this.g) != null) {
                aVar.notifyFinished();
                ze2.a aVar2 = this.g;
                if (aVar2 instanceof ze2.b) {
                    q0(this.x);
                } else if (aVar2 instanceof ze2.c) {
                    h0(this.x);
                } else if (aVar2 instanceof ze2.d) {
                    z0(this.x);
                }
            }
            this.g = null;
            this.A = -1;
            this.p.clear();
        }
    }

    public final long N() {
        if (this.z == -1) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.z;
    }

    public ze2.a O() {
        return this.g;
    }

    public c2q P() {
        return this.q;
    }

    public View Q() {
        return this.m;
    }

    public final float R() {
        return 0.0f;
    }

    public View S() {
        return this.n;
    }

    public final float T() {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            return interfaceC1167b.f();
        }
        return 0.0f;
    }

    public ViewGroup U() {
        return this.l;
    }

    public ViewGroup V() {
        return this.f26053k;
    }

    public View W() {
        return this.o;
    }

    public final float X() {
        return 0.0f;
    }

    public final void Y(Context context) {
        this.h = context;
        this.i = LayoutInflater.from(context);
        this.p = new VelocityMonitor();
        RelativeLayout relativeLayout = (RelativeLayout) this.i.inflate(hwi.f20545b, (ViewGroup) null);
        this.f26053k = relativeLayout;
        this.l = (FrameLayout) relativeLayout.findViewById(eti.f17052a);
    }

    public boolean Z() {
        c2q c2qVar = this.q;
        return (c2qVar == null || c2qVar == this.L) ? false : true;
    }

    public boolean a0() {
        return this.B;
    }

    public boolean b0() {
        return this.D;
    }

    public final void c0(int i2) {
    }

    @Override // defpackage.ze2
    public void d(ze2.a aVar) {
        View view;
        View view2;
        View view3;
        super.d(aVar);
        if (aVar instanceof ze2.c) {
            this.C = true;
            ze2.c cVar = (ze2.c) aVar;
            cVar.f41182a = this.J;
            if (this.m == null) {
                View viewOnCreateIndicator = cVar.onCreateIndicator(this.i, this.j);
                this.m = viewOnCreateIndicator;
                if (viewOnCreateIndicator == null) {
                    this.m = this.i.inflate(hwi.f, (ViewGroup) null);
                }
                SpringBackLayout springBackLayout = this.j;
                if (springBackLayout == null || (view3 = this.m) == null) {
                    return;
                }
                springBackLayout.addView(view3);
                return;
            }
            return;
        }
        if (!(aVar instanceof ze2.b)) {
            if (aVar instanceof ze2.d) {
                this.D = true;
                ze2.d dVar = (ze2.d) aVar;
                if (this.o == null) {
                    View viewOnCreateIndicator2 = dVar.onCreateIndicator(this.i, this.l);
                    this.o = viewOnCreateIndicator2;
                    if (viewOnCreateIndicator2 == null) {
                        this.o = this.i.inflate(hwi.f20544a, (ViewGroup) this.l, false);
                    }
                    FrameLayout frameLayout = this.l;
                    if (frameLayout == null || (view = this.o) == null) {
                        return;
                    }
                    frameLayout.addView(view);
                    return;
                }
                return;
            }
            return;
        }
        this.B = true;
        ze2.b bVar = (ze2.b) aVar;
        bVar.mCompleteListener = this.K;
        if (this.n == null) {
            View viewOnCreateIndicator3 = bVar.onCreateIndicator(this.i, this.f26053k);
            this.n = viewOnCreateIndicator3;
            if (viewOnCreateIndicator3 == null) {
                View viewInflate = this.i.inflate(hwi.c, (ViewGroup) null);
                View viewInflate2 = this.i.inflate(hwi.d, (ViewGroup) null);
                View viewInflate3 = this.i.inflate(hwi.e, (ViewGroup) null);
                this.f26053k.addView(viewInflate);
                this.f26053k.addView(viewInflate2);
                this.f26053k.addView(viewInflate3);
            }
            RelativeLayout relativeLayout = this.f26053k;
            if (relativeLayout == null || (view2 = this.n) == null) {
                return;
            }
            relativeLayout.addView(view2);
        }
    }

    public final void d0(int i2) {
    }

    public final void e0(int i2) {
    }

    public final void f0(int i2) {
    }

    public final void g0(int i2) {
    }

    public final void h0(int i2) {
    }

    public final void i0(int i2) {
    }

    public final void j0(int i2) {
    }

    public final void k0(int i2) {
    }

    public final void l0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.g(i2);
        }
    }

    public final void m0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.h(i2);
        }
    }

    public final void n0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.b(i2);
        }
    }

    public final void o0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.i(i2);
        }
    }

    public final void p0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.a(i2);
        }
    }

    public final void q0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.d(i2);
        }
    }

    public final void r0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.c(i2);
        }
    }

    public final void s0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.j(i2);
        }
    }

    public void setOnActionDataListener(j jVar) {
        this.f26054r = jVar;
    }

    public void setOnIndeterminateActionViewListener(ze2.b.InterfaceC1167b interfaceC1167b) {
        this.s = interfaceC1167b;
    }

    public void setOnIndeterminateUpActionViewListener(ze2.c.a aVar) {
    }

    public void setOnSimpleActionViewListener(ze2.d.a aVar) {
    }

    public void setOnUpActionDataListener(k kVar) {
    }

    public final void t0(int i2) {
        ze2.b.InterfaceC1167b interfaceC1167b = this.s;
        if (interfaceC1167b != null) {
            interfaceC1167b.e(i2);
        }
    }

    public final void u0(int i2) {
    }

    public final void v0(int i2) {
    }

    public final void w0(int i2) {
    }

    public final void x0(int i2) {
    }

    public final void y0(int i2) {
    }

    public final void z0(int i2) {
    }

    public class l extends c2q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26065b;
        public boolean c;

        public l() {
            this.f26064a = false;
            this.f26065b = false;
            this.c = false;
        }

        @Override // defpackage.c2q
        public void a(int i, int i2) {
            if (i2 == 0) {
                me5 me5Var = me5.this;
                me5Var.M0(me5Var.L);
                me5.this.j.F(0, 0);
                this.f26065b = false;
                this.c = false;
            }
        }

        @Override // defpackage.c2q
        public void b(int i, int i2) {
            if (me5.this.u == 1 || me5.this.u == 2) {
                ze2.a aVar = me5.this.g;
                me5 me5Var = me5.this;
                if (me5Var.x < 0) {
                    if (!me5Var.w) {
                        this.f26065b = false;
                    }
                    boolean z = this.f26065b;
                    ze2.c cVarG = me5.this.g();
                    if (cVarG != null) {
                        me5.this.F = true;
                        View viewQ = me5.this.Q();
                        if (viewQ != null && viewQ.getVisibility() != 0) {
                            viewQ.setVisibility(0);
                        }
                        me5.this.g = cVarG;
                        me5 me5Var2 = me5.this;
                        me5Var2.H0(me5Var2.g, aVar, me5.this.y);
                        if (Math.abs(me5.this.x) > me5.this.g().mEnterPoint && !me5.this.w) {
                            me5.this.w = true;
                            this.f26065b = true;
                            me5.this.z = SystemClock.elapsedRealtime();
                            cVarG.notifyEntered();
                            me5 me5Var3 = me5.this;
                            me5Var3.F0(me5Var3.g, me5.this.x);
                        }
                        boolean z2 = this.f26065b;
                        if (z != z2 && z2) {
                            cVarG.notifyActivated();
                            me5 me5Var4 = me5.this;
                            me5Var4.D0(me5Var4.g, me5.this.x);
                            if (me5.this.u == 2) {
                                me5.this.j.F(0, cVarG.mTriggerPoint);
                                me5 me5Var5 = me5.this;
                                me5Var5.M0(me5Var5.P);
                            }
                        }
                    }
                    me5 me5Var6 = me5.this;
                    me5Var6.E0(me5Var6.g, aVar, me5.this.x);
                    return;
                }
                this.f26065b = false;
                int i3 = me5Var.A;
                boolean z3 = this.f26064a;
                ze2.a aVar2 = me5.this.g;
                for (int i4 = 0; i4 < me5.this.e().size(); i4++) {
                    me5 me5Var7 = me5.this;
                    if (me5Var7.x <= me5Var7.e().get(i4).mEnterPoint) {
                        break;
                    }
                    me5.this.A = i4;
                }
                if (me5.this.A >= 0) {
                    ze2.a aVar3 = me5.this.e().get(me5.this.A);
                    boolean z4 = aVar3 != null && (aVar3 instanceof ze2.d);
                    if (!(z4 && me5.this.t < 1000.0f && me5.this.u == 1) && z4) {
                        me5.this.A = i3;
                    } else {
                        me5.this.g = aVar3;
                        me5 me5Var8 = me5.this;
                        me5Var8.H0(me5Var8.g, aVar, me5.this.y);
                        me5 me5Var9 = me5.this;
                        this.f26064a = me5Var9.x >= me5Var9.g.mTriggerPoint;
                    }
                } else {
                    me5.this.g = null;
                    this.f26064a = false;
                }
                if (i3 != me5.this.A) {
                    if (aVar2 != null) {
                        aVar2.onExit();
                        if (me5.this.W() != null) {
                            me5.this.W().setVisibility(8);
                        }
                    }
                    if (me5.this.g != null) {
                        if (me5.this.g instanceof ze2.b) {
                            if (me5.this.W() != null) {
                                me5.this.W().setVisibility(8);
                            }
                        } else if ((me5.this.g instanceof ze2.d) && me5.this.W() != null) {
                            me5.this.W().setVisibility(0);
                        }
                        me5.this.z = SystemClock.elapsedRealtime();
                        me5.this.g.notifyEntered();
                        me5 me5Var10 = me5.this;
                        me5Var10.F0(me5Var10.g, me5.this.x);
                        this.c = false;
                        if (this.f26064a) {
                            if (me5.this.g instanceof ze2.d) {
                                this.c = true;
                                HapticCompat.e(me5.this.j, alb.w, alb.i);
                            }
                            me5.this.g.notifyActivated();
                            me5 me5Var11 = me5.this;
                            me5Var11.D0(me5Var11.g, me5.this.x);
                        }
                    } else if (me5.this.W() != null) {
                        me5.this.W().setVisibility(8);
                    }
                } else if (aVar2 != null && z3 != this.f26064a) {
                    if (z3) {
                        me5.this.z = SystemClock.elapsedRealtime();
                        aVar2.notifyEntered();
                        me5 me5Var12 = me5.this;
                        me5Var12.F0(me5Var12.g, me5.this.x);
                        this.c = false;
                    } else {
                        if (me5.this.g instanceof ze2.d) {
                            this.c = true;
                        }
                        HapticCompat.e(me5.this.j, alb.w, alb.f1169k);
                        aVar2.notifyActivated();
                        me5 me5Var13 = me5.this;
                        me5Var13.D0(me5Var13.g, me5.this.x);
                    }
                }
                me5 me5Var14 = me5.this;
                me5Var14.E0(me5Var14.g, aVar, me5.this.x);
            }
        }

        @Override // defpackage.c2q
        public boolean c() {
            if ((!this.f26064a || me5.this.g == null) && me5.this.g != null && (me5.this.g instanceof ze2.d) && me5.this.W() != null) {
                me5.this.W().setVisibility(8);
            }
            if (me5.this.g == null) {
                return false;
            }
            if (me5.this.g instanceof ze2.b) {
                me5 me5Var = me5.this;
                if (me5Var.x > me5Var.g.mEnterPoint) {
                    if (this.f26064a) {
                        me5 me5Var2 = me5.this;
                        me5Var2.j.F(0, -me5Var2.g.mTriggerPoint);
                        me5 me5Var3 = me5.this;
                        me5Var3.M0(me5Var3.P);
                    } else {
                        if (Math.abs(me5.this.j.getScaleY()) < Math.abs(me5.this.g.mTriggerPoint)) {
                            me5.this.g.notifyExit();
                            me5 me5Var4 = me5.this;
                            me5Var4.G0(me5Var4.g, me5.this.x);
                        }
                        me5.this.j.F(0, 0);
                    }
                    return true;
                }
            }
            if (me5.this.g instanceof ze2.c) {
                me5 me5Var5 = me5.this;
                me5Var5.j.F(0, me5Var5.g.mTriggerPoint);
                me5 me5Var6 = me5.this;
                me5Var6.M0(me5Var6.P);
                return true;
            }
            me5 me5Var7 = me5.this;
            me5Var7.M0(me5Var7.Q);
            if (this.c) {
                me5.this.g.notifyTriggered();
                me5 me5Var8 = me5.this;
                me5Var8.I0(me5Var8.g, me5.this.x);
            } else {
                me5.this.g.notifyExit();
                me5 me5Var9 = me5.this;
                me5Var9.G0(me5Var9.g, me5.this.x);
            }
            if (me5.this.W() != null) {
                me5.this.W().setVisibility(8);
            }
            return false;
        }

        public /* synthetic */ l(me5 me5Var, a aVar) {
            this();
        }
    }
}
