package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f6507b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f6508a;

    public static class r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m1 f6543b = new a().f6509a.b().f6508a.a().f6508a.b().f6508a.c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m1 f6544a;

        public r(m1 m1Var) {
            this.f6544a = m1Var;
        }

        public void A(int i14) {
        }

        public void B(Rect[][] rectArr) {
        }

        public void C(Rect[][] rectArr) {
        }

        public m1 a() {
            return this.f6544a;
        }

        public m1 b() {
            return this.f6544a;
        }

        public m1 c() {
            return this.f6544a;
        }

        public void d(View view2) {
        }

        public void e(m1 m1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return t() == rVar.t() && s() == rVar.s() && Objects.equals(n(), rVar.n()) && Objects.equals(l(), rVar.l()) && Objects.equals(h(), rVar.h());
        }

        public List<Rect> f(int i14) {
            return Collections.EMPTY_LIST;
        }

        public List<Rect> g(int i14) {
            return Collections.EMPTY_LIST;
        }

        public androidx.core.view.i h() {
            return null;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
        }

        public c7.e i(int i14) {
            return c7.e.f25189e;
        }

        public c7.e j(int i14) {
            if ((i14 & 8) == 0) {
                return c7.e.f25189e;
            }
            vb.h.s("Unable to query the maximum insets for IME");
            return null;
        }

        public c7.e k() {
            return n();
        }

        public c7.e l() {
            return c7.e.f25189e;
        }

        public c7.e m() {
            return n();
        }

        public c7.e n() {
            return c7.e.f25189e;
        }

        public c7.e o() {
            return n();
        }

        public void p(View view2) {
        }

        public void q() {
        }

        public m1 r(int i14, int i15, int i16, int i17) {
            return f6543b;
        }

        public boolean s() {
            return false;
        }

        public boolean t() {
            return false;
        }

        public boolean u(int i14) {
            return true;
        }

        public void v(androidx.core.view.k kVar) {
        }

        public void w(c7.e[] eVarArr) {
        }

        public void x(c7.e eVar) {
        }

        public void y(m1 m1Var) {
        }

        public void z(c7.e eVar) {
        }
    }

    public static final class s {
        private s() {
        }

        public static int a(int i14) {
            if (i14 == 1) {
                return 0;
            }
            if (i14 == 2) {
                return 1;
            }
            if (i14 == 4) {
                return 2;
            }
            if (i14 == 8) {
                return 3;
            }
            if (i14 == 16) {
                return 4;
            }
            if (i14 == 32) {
                return 5;
            }
            if (i14 == 64) {
                return 6;
            }
            if (i14 == 128) {
                return 7;
            }
            if (i14 == 256) {
                return 8;
            }
            if (i14 == 512) {
                return 9;
            }
            vb.h.s(am.j.h(i14, "type needs to be >= FIRST and <= LAST, type="));
            return 0;
        }
    }

    public static final class t {
        private t() {
        }

        public static int a(int i14) {
            int iStatusBars;
            int i15 = 0;
            for (int i16 = 1; i16 <= 512; i16 <<= 1) {
                if ((i14 & i16) != 0) {
                    if (i16 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i16 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i16 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i16 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i16 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i16 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i16 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i16 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i15 |= iStatusBars;
                }
            }
            return i15;
        }
    }

    public static final class u {
        private u() {
        }

        public static int a(int i14) {
            int iStatusBars;
            int i15 = 0;
            for (int i16 = 1; i16 <= 512; i16 <<= 1) {
                if ((i14 & i16) != 0) {
                    if (i16 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i16 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i16 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i16 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i16 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i16 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i16 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i16 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i16 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i15 |= iStatusBars;
                }
            }
            return i15;
        }
    }

    static {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            f6507b = p.f6542x;
        } else if (i14 >= 30) {
            f6507b = n.f6541w;
        } else {
            f6507b = r.f6543b;
        }
    }

    public m1(m1 m1Var) {
        if (m1Var == null) {
            this.f6508a = new r(this);
            return;
        }
        r rVar = m1Var.f6508a;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 35 && (rVar instanceof q)) {
            this.f6508a = new q(this, (q) rVar);
        } else if (i14 >= 34 && (rVar instanceof p)) {
            this.f6508a = new p(this, (p) rVar);
        } else if (i14 >= 31 && (rVar instanceof o)) {
            this.f6508a = new o(this, (o) rVar);
        } else if (i14 >= 30 && (rVar instanceof n)) {
            this.f6508a = new n(this, (n) rVar);
        } else if (i14 >= 29 && (rVar instanceof m)) {
            this.f6508a = new m(this, (m) rVar);
        } else if (rVar instanceof l) {
            this.f6508a = new l(this, (l) rVar);
        } else if (rVar instanceof k) {
            this.f6508a = new k(this, (k) rVar);
        } else if (rVar instanceof j) {
            this.f6508a = new j(this, (j) rVar);
        } else {
            this.f6508a = new r(this);
        }
        rVar.e(this);
    }

    public static c7.e e(c7.e eVar, int i14, int i15, int i16, int i17) {
        int iMax = Math.max(0, eVar.f25190a - i14);
        int iMax2 = Math.max(0, eVar.f25191b - i15);
        int iMax3 = Math.max(0, eVar.f25192c - i16);
        int iMax4 = Math.max(0, eVar.f25193d - i17);
        return (iMax == i14 && iMax2 == i15 && iMax3 == i16 && iMax4 == i17) ? eVar : c7.e.c(iMax, iMax2, iMax3, iMax4);
    }

    public static m1 g(View view2, WindowInsets windowInsets) {
        windowInsets.getClass();
        m1 m1Var = new m1(windowInsets);
        if (view2 != null && view2.isAttachedToWindow()) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            m1 m1VarA = s0.e.a(view2);
            r rVar = m1Var.f6508a;
            rVar.y(m1VarA);
            View rootView = view2.getRootView();
            rVar.d(rootView);
            rVar.p(rootView);
            rVar.q();
            rVar.A(view2.getWindowSystemUiVisibility());
        }
        return m1Var;
    }

    @Deprecated
    public final int a() {
        return this.f6508a.n().f25193d;
    }

    @Deprecated
    public final int b() {
        return this.f6508a.n().f25190a;
    }

    @Deprecated
    public final int c() {
        return this.f6508a.n().f25192c;
    }

    @Deprecated
    public final int d() {
        return this.f6508a.n().f25191b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            return Objects.equals(this.f6508a, ((m1) obj).f6508a);
        }
        return false;
    }

    public final WindowInsets f() {
        r rVar = this.f6508a;
        if (rVar instanceof j) {
            return ((j) rVar).f6526c;
        }
        return null;
    }

    public final int hashCode() {
        r rVar = this.f6508a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public static class d extends c {
        public d() {
        }

        @Override // androidx.core.view.m1.i
        public void d(int i14, c7.e eVar) {
            this.f6516e.setInsets(t.a(i14), eVar.e());
        }

        public d(m1 m1Var) {
            super(m1Var);
        }
    }

    public static class e extends d {
        public e() {
        }

        public e(m1 m1Var) {
            super(m1Var);
        }
    }

    public static class f extends e {
        public f() {
        }

        @Override // androidx.core.view.m1.d, androidx.core.view.m1.i
        public void d(int i14, c7.e eVar) {
            this.f6516e.setInsets(u.a(i14), eVar.e());
        }

        public f(m1 m1Var) {
            super(m1Var);
        }
    }

    public static class h extends g {
        public h() {
        }

        public h(m1 m1Var) {
            super(m1Var);
        }
    }

    public static class l extends k {
        public l(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var, windowInsets);
        }

        @Override // androidx.core.view.m1.r
        public m1 a() {
            return m1.g(null, this.f6526c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Objects.equals(this.f6526c, lVar.f6526c) && Objects.equals(this.f6530g, lVar.f6530g) && j.M(this.f6531h, lVar.f6531h);
        }

        @Override // androidx.core.view.m1.r
        public androidx.core.view.i h() {
            return androidx.core.view.i.c(this.f6526c.getDisplayCutout());
        }

        @Override // androidx.core.view.m1.r
        public int hashCode() {
            return this.f6526c.hashCode();
        }

        public l(m1 m1Var, l lVar) {
            super(m1Var, lVar);
        }
    }

    public static class n extends m {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final m1 f6541w = m1.g(null, WindowInsets.CONSUMED);

        public n(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var, windowInsets);
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public final void d(View view2) {
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public c7.e i(int i14) {
            return c7.e.d(this.f6526c.getInsets(t.a(i14)));
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public c7.e j(int i14) {
            return c7.e.d(this.f6526c.getInsetsIgnoringVisibility(t.a(i14)));
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public boolean u(int i14) {
            return this.f6526c.isVisible(t.a(i14));
        }

        public n(m1 m1Var, n nVar) {
            super(m1Var, nVar);
        }
    }

    public static class o extends n {
        public o(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var, windowInsets);
        }

        public o(m1 m1Var, o oVar) {
            super(m1Var, oVar);
        }
    }

    public static class p extends o {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final m1 f6542x = m1.g(null, WindowInsets.CONSUMED);

        public p(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var, windowInsets);
        }

        @Override // androidx.core.view.m1.n, androidx.core.view.m1.j, androidx.core.view.m1.r
        public c7.e i(int i14) {
            return c7.e.d(this.f6526c.getInsets(u.a(i14)));
        }

        @Override // androidx.core.view.m1.n, androidx.core.view.m1.j, androidx.core.view.m1.r
        public c7.e j(int i14) {
            return c7.e.d(this.f6526c.getInsetsIgnoringVisibility(u.a(i14)));
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public void p(View view2) {
        }

        @Override // androidx.core.view.m1.n, androidx.core.view.m1.j, androidx.core.view.m1.r
        public boolean u(int i14) {
            return this.f6526c.isVisible(u.a(i14));
        }

        public p(m1 m1Var, p pVar) {
            super(m1Var, pVar);
        }
    }

    public static class q extends p {
        public q(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var, windowInsets);
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public List<Rect> f(int i14) {
            return this.f6526c.getBoundingRects(u.a(i14));
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public List<Rect> g(int i14) {
            return this.f6526c.getBoundingRectsIgnoringVisibility(u.a(i14));
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public void q() {
        }

        public q(m1 m1Var, q qVar) {
            super(m1Var, qVar);
        }
    }

    public static class g extends f {
        public g(m1 m1Var) {
            super(m1Var);
            m1Var.f6508a.s();
        }

        @Override // androidx.core.view.m1.i
        public void c(m1 m1Var) {
        }

        @Override // androidx.core.view.m1.f, androidx.core.view.m1.d, androidx.core.view.m1.i
        public void d(int i14, c7.e eVar) {
            super.d(i14, eVar);
        }

        public g() {
        }
    }

    public static class b extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Field f6510g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f6511h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Constructor<WindowInsets> f6512i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static boolean f6513j = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WindowInsets f6514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c7.e f6515f;

        public b() {
            this.f6514e = j();
        }

        private static WindowInsets j() {
            if (!f6511h) {
                try {
                    f6510g = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f6511h = true;
            }
            Field field = f6510g;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f6513j) {
                try {
                    f6512i = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f6513j = true;
            }
            Constructor<WindowInsets> constructor = f6512i;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.m1.i
        public m1 b() {
            a();
            m1 m1VarG = m1.g(null, this.f6514e);
            c7.e[] eVarArr = this.f6518b;
            r rVar = m1VarG.f6508a;
            rVar.w(eVarArr);
            rVar.z(this.f6515f);
            rVar.v(null);
            rVar.B(this.f6519c);
            rVar.C(this.f6520d);
            return m1VarG;
        }

        @Override // androidx.core.view.m1.i
        public void f(c7.e eVar) {
            this.f6515f = eVar;
        }

        @Override // androidx.core.view.m1.i
        public void h(c7.e eVar) {
            WindowInsets windowInsets = this.f6514e;
            if (windowInsets != null) {
                this.f6514e = windowInsets.replaceSystemWindowInsets(eVar.f25190a, eVar.f25191b, eVar.f25192c, eVar.f25193d);
            }
        }

        public b(m1 m1Var) {
            super(m1Var);
            this.f6514e = m1Var.f();
        }
    }

    public static class k extends j {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public c7.e f6537s;

        public k(m1 m1Var, k kVar) {
            super(m1Var, kVar);
            this.f6537s = null;
            this.f6537s = kVar.f6537s;
        }

        @Override // androidx.core.view.m1.r
        public m1 b() {
            return m1.g(null, this.f6526c.consumeStableInsets());
        }

        @Override // androidx.core.view.m1.r
        public m1 c() {
            return m1.g(null, this.f6526c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.m1.r
        public final c7.e l() {
            if (this.f6537s == null) {
                WindowInsets windowInsets = this.f6526c;
                this.f6537s = c7.e.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f6537s;
        }

        @Override // androidx.core.view.m1.r
        public boolean s() {
            return this.f6526c.isConsumed();
        }

        @Override // androidx.core.view.m1.r
        public void z(c7.e eVar) {
            this.f6537s = eVar;
        }

        public k(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var, windowInsets);
            this.f6537s = null;
        }
    }

    public static class m extends l {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public c7.e f6538t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public c7.e f6539u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public c7.e f6540v;

        public m(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var, windowInsets);
            this.f6538t = null;
            this.f6539u = null;
            this.f6540v = null;
        }

        @Override // androidx.core.view.m1.r
        public c7.e k() {
            if (this.f6539u == null) {
                this.f6539u = c7.e.d(this.f6526c.getMandatorySystemGestureInsets());
            }
            return this.f6539u;
        }

        @Override // androidx.core.view.m1.r
        public c7.e m() {
            if (this.f6538t == null) {
                this.f6538t = c7.e.d(this.f6526c.getSystemGestureInsets());
            }
            return this.f6538t;
        }

        @Override // androidx.core.view.m1.r
        public c7.e o() {
            if (this.f6540v == null) {
                this.f6540v = c7.e.d(this.f6526c.getTappableElementInsets());
            }
            return this.f6540v;
        }

        @Override // androidx.core.view.m1.j, androidx.core.view.m1.r
        public m1 r(int i14, int i15, int i16, int i17) {
            return m1.g(null, this.f6526c.inset(i14, i15, i16, i17));
        }

        @Override // androidx.core.view.m1.k, androidx.core.view.m1.r
        public void z(c7.e eVar) {
        }

        public m(m1 m1Var, m mVar) {
            super(m1Var, mVar);
            this.f6538t = null;
            this.f6539u = null;
            this.f6540v = null;
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m1 f6517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c7.e[] f6518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect[][] f6519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect[][] f6520d;

        public i(m1 m1Var) {
            this.f6519c = new Rect[10][];
            this.f6520d = new Rect[10][];
            this.f6517a = m1Var;
            c(m1Var);
        }

        public final void a() {
            c7.e[] eVarArr = this.f6518b;
            if (eVarArr != null) {
                c7.e eVarI = eVarArr[0];
                c7.e eVarI2 = eVarArr[1];
                m1 m1Var = this.f6517a;
                if (eVarI2 == null) {
                    eVarI2 = m1Var.f6508a.i(2);
                }
                if (eVarI == null) {
                    eVarI = m1Var.f6508a.i(1);
                }
                h(c7.e.a(eVarI, eVarI2));
                c7.e eVar = this.f6518b[s.a(16)];
                if (eVar != null) {
                    g(eVar);
                }
                c7.e eVar2 = this.f6518b[s.a(32)];
                if (eVar2 != null) {
                    e(eVar2);
                }
                c7.e eVar3 = this.f6518b[s.a(64)];
                if (eVar3 != null) {
                    i(eVar3);
                }
            }
        }

        public m1 b() {
            a();
            return this.f6517a;
        }

        public void c(m1 m1Var) {
            for (int i14 = 1; i14 <= 512; i14 <<= 1) {
                List<Rect> listF = m1Var.f6508a.f(i14);
                int iA = s.a(i14);
                this.f6519c[iA] = (Rect[]) listF.toArray(new Rect[listF.size()]);
                if (i14 != 8) {
                    List<Rect> listG = m1Var.f6508a.g(i14);
                    this.f6520d[iA] = (Rect[]) listG.toArray(new Rect[listG.size()]);
                }
            }
        }

        public void d(int i14, c7.e eVar) {
            if (this.f6518b == null) {
                this.f6518b = new c7.e[10];
            }
            for (int i15 = 1; i15 <= 512; i15 <<= 1) {
                if ((i14 & i15) != 0) {
                    this.f6518b[s.a(i15)] = eVar;
                }
            }
        }

        public void e(c7.e eVar) {
        }

        public void f(c7.e eVar) {
        }

        public void g(c7.e eVar) {
        }

        public void h(c7.e eVar) {
        }

        public void i(c7.e eVar) {
        }

        public i() {
            this(new m1((m1) null));
        }
    }

    public static class j extends r {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static boolean f6521n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static Method f6522o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static Class<?> f6523p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static Field f6524q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static Field f6525r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f6526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c7.e[] f6527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c7.e f6528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public m1 f6529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c7.e f6530g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6531h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.core.view.k f6532i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6533j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6534k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Rect[][] f6535l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Rect[][] f6536m;

        public j(m1 m1Var, WindowInsets windowInsets) {
            super(m1Var);
            this.f6528e = null;
            this.f6535l = new Rect[10][];
            this.f6536m = new Rect[10][];
            this.f6526c = windowInsets;
        }

        private androidx.core.view.k D(View view2) {
            Display display;
            if (view2 == null || (display = view2.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.f6544a.f6508a.t()) {
                return androidx.core.view.k.a(point.x, point.y, true, 0, 0, 0, 0);
            }
            e0 e0VarA = androidx.core.view.h.a(display, 0);
            e0 e0VarA2 = androidx.core.view.h.a(display, 1);
            e0 e0VarA3 = androidx.core.view.h.a(display, 2);
            e0 e0VarA4 = androidx.core.view.h.a(display, 3);
            return androidx.core.view.k.a(point.x, point.y, false, e0VarA != null ? e0VarA.f6429b : 0, e0VarA2 != null ? e0VarA2.f6429b : 0, e0VarA3 != null ? e0VarA3.f6429b : 0, e0VarA4 != null ? e0VarA4.f6429b : 0);
        }

        private static List<Rect> E(Rect[][] rectArr, int i14) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i15 = 1; i15 <= 512; i15 <<= 1) {
                if ((i14 & i15) != 0 && (rectArr2 = rectArr[s.a(i15)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] F(c7.e eVar) {
            ArrayList arrayList = new ArrayList();
            int i14 = eVar.f25190a;
            int i15 = eVar.f25193d;
            int i16 = eVar.f25192c;
            int i17 = eVar.f25191b;
            if (i14 != 0) {
                arrayList.add(new Rect(0, 0, eVar.f25190a, this.f6533j));
            }
            if (i17 != 0) {
                arrayList.add(new Rect(0, 0, this.f6534k, i17));
            }
            if (i16 != 0) {
                int i18 = this.f6534k;
                arrayList.add(new Rect(i18 - i16, 0, i18, this.f6533j));
            }
            if (i15 != 0) {
                int i19 = this.f6533j;
                arrayList.add(new Rect(0, i19 - i15, this.f6534k, i19));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        @SuppressLint({"WrongConstant"})
        private c7.e G(int i14, boolean z14) {
            c7.e eVarA = c7.e.f25189e;
            for (int i15 = 1; i15 <= 512; i15 <<= 1) {
                if ((i14 & i15) != 0) {
                    eVarA = c7.e.a(eVarA, H(i15, z14));
                }
            }
            return eVarA;
        }

        private c7.e I() {
            m1 m1Var = this.f6529f;
            return m1Var != null ? m1Var.f6508a.l() : c7.e.f25189e;
        }

        private c7.e J(View view2) {
            if (Build.VERSION.SDK_INT >= 30) {
                org.apache.commons.lang3.e.w("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!f6521n) {
                L();
            }
            Method method = f6522o;
            if (method != null && f6523p != null && f6524q != null) {
                try {
                    Object objInvoke = method.invoke(view2, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f6524q.get(f6525r.get(objInvoke));
                    if (rect == null) {
                        return null;
                    }
                    c7.e eVar = c7.e.f25189e;
                    return c7.e.c(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e4) {
                    e4.getMessage();
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void L() {
            try {
                f6522o = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f6523p = cls;
                f6524q = cls.getDeclaredField("mVisibleInsets");
                f6525r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f6524q.setAccessible(true);
                f6525r.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                e4.getMessage();
            }
            f6521n = true;
        }

        public static boolean M(int i14, int i15) {
            return (i14 & 6) == (i15 & 6);
        }

        @Override // androidx.core.view.m1.r
        public void A(int i14) {
            this.f6531h = i14;
        }

        @Override // androidx.core.view.m1.r
        public void B(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.f6535l = (Rect[][]) rectArr.clone();
        }

        @Override // androidx.core.view.m1.r
        public void C(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.f6536m = (Rect[][]) rectArr.clone();
        }

        public c7.e H(int i14, boolean z14) {
            c7.e eVarL;
            int i15;
            if (i14 == 1) {
                if (z14) {
                    return c7.e.c(0, Math.max(I().f25191b, n().f25191b), 0, 0);
                }
                return (this.f6531h & 4) != 0 ? c7.e.f25189e : c7.e.c(0, n().f25191b, 0, 0);
            }
            if (i14 == 2) {
                if (z14) {
                    c7.e eVarI = I();
                    c7.e eVarL2 = l();
                    return c7.e.c(Math.max(eVarI.f25190a, eVarL2.f25190a), 0, Math.max(eVarI.f25192c, eVarL2.f25192c), Math.max(eVarI.f25193d, eVarL2.f25193d));
                }
                if ((this.f6531h & 2) != 0) {
                    return c7.e.f25189e;
                }
                c7.e eVarN = n();
                m1 m1Var = this.f6529f;
                eVarL = m1Var != null ? m1Var.f6508a.l() : null;
                int iMin = eVarN.f25193d;
                if (eVarL != null) {
                    iMin = Math.min(iMin, eVarL.f25193d);
                }
                return c7.e.c(eVarN.f25190a, 0, eVarN.f25192c, iMin);
            }
            if (i14 == 8) {
                c7.e[] eVarArr = this.f6527d;
                eVarL = eVarArr != null ? eVarArr[s.a(8)] : null;
                if (eVarL != null) {
                    return eVarL;
                }
                c7.e eVarN2 = n();
                c7.e eVarI2 = I();
                int i16 = eVarN2.f25193d;
                if (i16 > eVarI2.f25193d) {
                    return c7.e.c(0, 0, 0, i16);
                }
                c7.e eVar = this.f6530g;
                return (eVar == null || eVar.equals(c7.e.f25189e) || (i15 = this.f6530g.f25193d) <= eVarI2.f25193d) ? c7.e.f25189e : c7.e.c(0, 0, 0, i15);
            }
            if (i14 == 16) {
                return m();
            }
            if (i14 == 32) {
                return k();
            }
            if (i14 == 64) {
                return o();
            }
            if (i14 != 128) {
                return c7.e.f25189e;
            }
            m1 m1Var2 = this.f6529f;
            androidx.core.view.i iVarH = m1Var2 != null ? m1Var2.f6508a.h() : h();
            if (iVarH == null) {
                return c7.e.f25189e;
            }
            DisplayCutout displayCutout = iVarH.f6455a;
            return c7.e.c(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
        }

        public boolean K(int i14) {
            if (i14 != 1 && i14 != 2) {
                if (i14 == 4) {
                    return false;
                }
                if (i14 != 8 && i14 != 128) {
                    return true;
                }
            }
            return !H(i14, false).equals(c7.e.f25189e);
        }

        @Override // androidx.core.view.m1.r
        public void d(View view2) {
            this.f6534k = view2.getWidth();
            this.f6533j = view2.getHeight();
            c7.e eVarJ = J(view2);
            if (eVarJ == null) {
                eVarJ = c7.e.f25189e;
            }
            x(eVarJ);
        }

        @Override // androidx.core.view.m1.r
        public void e(m1 m1Var) {
            m1Var.f6508a.y(this.f6529f);
            c7.e eVar = this.f6530g;
            r rVar = m1Var.f6508a;
            rVar.x(eVar);
            rVar.A(this.f6531h);
            rVar.v(this.f6532i);
            rVar.B(this.f6535l);
            rVar.C(this.f6536m);
        }

        @Override // androidx.core.view.m1.r
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f6530g, jVar.f6530g) && M(this.f6531h, jVar.f6531h);
        }

        @Override // androidx.core.view.m1.r
        public List<Rect> f(int i14) {
            return E(this.f6535l, i14);
        }

        @Override // androidx.core.view.m1.r
        public List<Rect> g(int i14) {
            return E(this.f6536m, i14);
        }

        @Override // androidx.core.view.m1.r
        public c7.e i(int i14) {
            return G(i14, false);
        }

        @Override // androidx.core.view.m1.r
        public c7.e j(int i14) {
            return G(i14, true);
        }

        @Override // androidx.core.view.m1.r
        public final c7.e n() {
            if (this.f6528e == null) {
                WindowInsets windowInsets = this.f6526c;
                this.f6528e = c7.e.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f6528e;
        }

        @Override // androidx.core.view.m1.r
        public void p(View view2) {
            this.f6532i = D(view2);
        }

        @Override // androidx.core.view.m1.r
        @SuppressLint({"WrongConstant"})
        public void q() {
            for (int i14 = 1; i14 <= 512; i14 <<= 1) {
                int iA = s.a(i14);
                this.f6535l[iA] = F(i(i14));
                if (i14 != 8) {
                    this.f6536m[iA] = F(j(i14));
                }
            }
        }

        @Override // androidx.core.view.m1.r
        public m1 r(int i14, int i15, int i16, int i17) {
            a aVar = new a(m1.g(null, this.f6526c));
            c7.e eVarE = m1.e(n(), i14, i15, i16, i17);
            i iVar = aVar.f6509a;
            iVar.h(eVarE);
            iVar.f(m1.e(l(), i14, i15, i16, i17));
            return iVar.b();
        }

        @Override // androidx.core.view.m1.r
        public boolean t() {
            return this.f6526c.isRound();
        }

        @Override // androidx.core.view.m1.r
        @SuppressLint({"WrongConstant"})
        public boolean u(int i14) {
            for (int i15 = 1; i15 <= 512; i15 <<= 1) {
                if ((i14 & i15) != 0 && !K(i15)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.m1.r
        public void v(androidx.core.view.k kVar) {
            this.f6532i = kVar;
        }

        @Override // androidx.core.view.m1.r
        public void w(c7.e[] eVarArr) {
            this.f6527d = eVarArr;
        }

        @Override // androidx.core.view.m1.r
        public void x(c7.e eVar) {
            this.f6530g = eVar;
        }

        @Override // androidx.core.view.m1.r
        public void y(m1 m1Var) {
            this.f6529f = m1Var;
        }

        public j(m1 m1Var, j jVar) {
            this(m1Var, new WindowInsets(jVar.f6526c));
        }
    }

    public static class c extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WindowInsets.Builder f6516e;

        public c(m1 m1Var) {
            super(m1Var);
            WindowInsets windowInsetsF = m1Var.f();
            this.f6516e = windowInsetsF != null ? a7.a.g(windowInsetsF) : a7.a.f();
        }

        @Override // androidx.core.view.m1.i
        public m1 b() {
            a();
            m1 m1VarG = m1.g(null, this.f6516e.build());
            c7.e[] eVarArr = this.f6518b;
            r rVar = m1VarG.f6508a;
            rVar.w(eVarArr);
            rVar.v(null);
            rVar.B(this.f6519c);
            rVar.C(this.f6520d);
            return m1VarG;
        }

        @Override // androidx.core.view.m1.i
        public void e(c7.e eVar) {
            this.f6516e.setMandatorySystemGestureInsets(eVar.e());
        }

        @Override // androidx.core.view.m1.i
        public void f(c7.e eVar) {
            this.f6516e.setStableInsets(eVar.e());
        }

        @Override // androidx.core.view.m1.i
        public void g(c7.e eVar) {
            this.f6516e.setSystemGestureInsets(eVar.e());
        }

        @Override // androidx.core.view.m1.i
        public void h(c7.e eVar) {
            this.f6516e.setSystemWindowInsets(eVar.e());
        }

        @Override // androidx.core.view.m1.i
        public void i(c7.e eVar) {
            this.f6516e.setTappableElementInsets(eVar.e());
        }

        public c() {
            this.f6516e = a7.a.f();
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f6509a;

        public a() {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 36) {
                this.f6509a = new h();
                return;
            }
            if (i14 >= 35) {
                this.f6509a = new g();
                return;
            }
            if (i14 >= 34) {
                this.f6509a = new f();
                return;
            }
            if (i14 >= 31) {
                this.f6509a = new e();
                return;
            }
            if (i14 >= 30) {
                this.f6509a = new d();
            } else if (i14 >= 29) {
                this.f6509a = new c();
            } else {
                this.f6509a = new b();
            }
        }

        public a(m1 m1Var) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 36) {
                this.f6509a = new h(m1Var);
                return;
            }
            if (i14 >= 35) {
                this.f6509a = new g(m1Var);
                return;
            }
            if (i14 >= 34) {
                this.f6509a = new f(m1Var);
                return;
            }
            if (i14 >= 31) {
                this.f6509a = new e(m1Var);
                return;
            }
            if (i14 >= 30) {
                this.f6509a = new d(m1Var);
            } else if (i14 >= 29) {
                this.f6509a = new c(m1Var);
            } else {
                this.f6509a = new b(m1Var);
            }
        }
    }

    private m1(WindowInsets windowInsets) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 35) {
            this.f6508a = new q(this, windowInsets);
            return;
        }
        if (i14 >= 34) {
            this.f6508a = new p(this, windowInsets);
            return;
        }
        if (i14 >= 31) {
            this.f6508a = new o(this, windowInsets);
            return;
        }
        if (i14 >= 30) {
            this.f6508a = new n(this, windowInsets);
        } else if (i14 >= 29) {
            this.f6508a = new m(this, windowInsets);
        } else {
            this.f6508a = new l(this, windowInsets);
        }
    }
}
