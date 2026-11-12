package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import defpackage.blr;
import defpackage.g6i;
import defpackage.gz6;
import defpackage.l4h;
import defpackage.rbd;
import defpackage.t6n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f2098b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f2099a;

    @RequiresApi(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f2100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f2101b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2100a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2101b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
            }
        }

        public static WindowInsetsCompat a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2100a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2101b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            WindowInsetsCompat windowInsetsCompatA = new b().b(rbd.c(rect)).c(rbd.c(rect2)).a();
                            windowInsetsCompatA.u(windowInsetsCompatA);
                            windowInsetsCompatA.d(view.getRootView());
                            return windowInsetsCompatA;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }
    }

    @RequiresApi(30)
    public static class e extends d {
        public e() {
        }

        public e(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f2103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public rbd[] f2104b;

        public f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void a() {
            rbd[] rbdVarArr = this.f2104b;
            if (rbdVarArr != null) {
                rbd rbdVarF = rbdVarArr[m.d(1)];
                rbd rbdVarF2 = this.f2104b[m.d(2)];
                if (rbdVarF2 == null) {
                    rbdVarF2 = this.f2103a.f(2);
                }
                if (rbdVarF == null) {
                    rbdVarF = this.f2103a.f(1);
                }
                f(rbd.a(rbdVarF, rbdVarF2));
                rbd rbdVar = this.f2104b[m.d(16)];
                if (rbdVar != null) {
                    e(rbdVar);
                }
                rbd rbdVar2 = this.f2104b[m.d(32)];
                if (rbdVar2 != null) {
                    c(rbdVar2);
                }
                rbd rbdVar3 = this.f2104b[m.d(64)];
                if (rbdVar3 != null) {
                    g(rbdVar3);
                }
            }
        }

        public WindowInsetsCompat b() {
            throw null;
        }

        public void c(rbd rbdVar) {
        }

        public void d(rbd rbdVar) {
            throw null;
        }

        public void e(rbd rbdVar) {
        }

        public void f(rbd rbdVar) {
            throw null;
        }

        public void g(rbd rbdVar) {
        }

        public f(WindowInsetsCompat windowInsetsCompat) {
            this.f2103a = windowInsetsCompat;
        }
    }

    @RequiresApi(28)
    public static class i extends h {
        public i(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public WindowInsetsCompat a() {
            return WindowInsetsCompat.x(this.c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public gz6 f() {
            return gz6.e(this.c.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public int hashCode() {
            return this.c.hashCode();
        }

        public i(WindowInsetsCompat windowInsetsCompat, i iVar) {
            super(windowInsetsCompat, iVar);
        }
    }

    @RequiresApi(30)
    public static class k extends j {
        public static final WindowInsetsCompat q = WindowInsetsCompat.x(WindowInsets.CONSUMED);

        public k(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        public final void d(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        public rbd g(int i) {
            return rbd.d(this.c.getInsets(n.a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        public rbd h(int i) {
            return rbd.d(this.c.getInsetsIgnoringVisibility(n.a(i)));
        }

        public k(WindowInsetsCompat windowInsetsCompat, k kVar) {
            super(windowInsetsCompat, kVar);
        }
    }

    public static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final WindowInsetsCompat f2106b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f2107a;

        public l(WindowInsetsCompat windowInsetsCompat) {
            this.f2107a = windowInsetsCompat;
        }

        public WindowInsetsCompat a() {
            return this.f2107a;
        }

        public WindowInsetsCompat b() {
            return this.f2107a;
        }

        public WindowInsetsCompat c() {
            return this.f2107a;
        }

        public void d(View view) {
        }

        public void e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && l4h.a(l(), lVar.l()) && l4h.a(j(), lVar.j()) && l4h.a(f(), lVar.f());
        }

        public gz6 f() {
            return null;
        }

        public rbd g(int i) {
            return rbd.e;
        }

        public rbd h(int i) {
            if ((i & 8) == 0) {
                return rbd.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return l4h.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public rbd i() {
            return l();
        }

        public rbd j() {
            return rbd.e;
        }

        public rbd k() {
            return l();
        }

        public rbd l() {
            return rbd.e;
        }

        public rbd m() {
            return l();
        }

        public WindowInsetsCompat n(int i, int i2, int i3, int i4) {
            return f2106b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public void q(rbd[] rbdVarArr) {
        }

        public void r(rbd rbdVar) {
        }

        public void s(WindowInsetsCompat windowInsetsCompat) {
        }

        public void t(rbd rbdVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }
    }

    @RequiresApi(30)
    public static final class n {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2098b = k.q;
        } else {
            f2098b = l.f2106b;
        }
    }

    @RequiresApi(20)
    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f2099a = new k(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f2099a = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.f2099a = new i(this, windowInsets);
        } else {
            this.f2099a = new h(this, windowInsets);
        }
    }

    public static rbd p(rbd rbdVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, rbdVar.f32378a - i2);
        int iMax2 = Math.max(0, rbdVar.f32379b - i3);
        int iMax3 = Math.max(0, rbdVar.c - i4);
        int iMax4 = Math.max(0, rbdVar.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? rbdVar : rbd.b(iMax, iMax2, iMax3, iMax4);
    }

    @RequiresApi(20)
    public static WindowInsetsCompat x(WindowInsets windowInsets) {
        return y(windowInsets, null);
    }

    @RequiresApi(20)
    public static WindowInsetsCompat y(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) g6i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.u(androidx.core.view.c.H(view));
            windowInsetsCompat.d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public WindowInsetsCompat a() {
        return this.f2099a.a();
    }

    @Deprecated
    public WindowInsetsCompat b() {
        return this.f2099a.b();
    }

    @Deprecated
    public WindowInsetsCompat c() {
        return this.f2099a.c();
    }

    public void d(View view) {
        this.f2099a.d(view);
    }

    public gz6 e() {
        return this.f2099a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return l4h.a(this.f2099a, ((WindowInsetsCompat) obj).f2099a);
        }
        return false;
    }

    public rbd f(int i2) {
        return this.f2099a.g(i2);
    }

    public rbd g(int i2) {
        return this.f2099a.h(i2);
    }

    @Deprecated
    public rbd h() {
        return this.f2099a.j();
    }

    public int hashCode() {
        l lVar = this.f2099a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public rbd i() {
        return this.f2099a.k();
    }

    @Deprecated
    public int j() {
        return this.f2099a.l().d;
    }

    @Deprecated
    public int k() {
        return this.f2099a.l().f32378a;
    }

    @Deprecated
    public int l() {
        return this.f2099a.l().c;
    }

    @Deprecated
    public int m() {
        return this.f2099a.l().f32379b;
    }

    @Deprecated
    public boolean n() {
        return !this.f2099a.l().equals(rbd.e);
    }

    public WindowInsetsCompat o(@IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5) {
        return this.f2099a.n(i2, i3, i4, i5);
    }

    public boolean q() {
        return this.f2099a.o();
    }

    @Deprecated
    public WindowInsetsCompat r(int i2, int i3, int i4, int i5) {
        return new b(this).c(rbd.b(i2, i3, i4, i5)).a();
    }

    public void s(rbd[] rbdVarArr) {
        this.f2099a.q(rbdVarArr);
    }

    public void t(rbd rbdVar) {
        this.f2099a.r(rbdVar);
    }

    public void u(WindowInsetsCompat windowInsetsCompat) {
        this.f2099a.s(windowInsetsCompat);
    }

    public void v(rbd rbdVar) {
        this.f2099a.t(rbdVar);
    }

    @RequiresApi(20)
    public WindowInsets w() {
        l lVar = this.f2099a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }

    @RequiresApi(api = 20)
    public static class c extends f {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor<WindowInsets> g = null;
        public static boolean h = false;
        public WindowInsets c;
        public rbd d;

        public c() {
            this.c = h();
        }

        private static WindowInsets h() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatX = WindowInsetsCompat.x(this.c);
            windowInsetsCompatX.s(this.f2104b);
            windowInsetsCompatX.v(this.d);
            return windowInsetsCompatX;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void d(rbd rbdVar) {
            this.d = rbdVar;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void f(rbd rbdVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(rbdVar.f32378a, rbdVar.f32379b, rbdVar.c, rbdVar.d);
            }
        }

        public c(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.c = windowInsetsCompat.w();
        }
    }

    @RequiresApi(api = 29)
    public static class d extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = t6n.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatX = WindowInsetsCompat.x(this.c.build());
            windowInsetsCompatX.s(this.f2104b);
            return windowInsetsCompatX;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void c(rbd rbdVar) {
            this.c.setMandatorySystemGestureInsets(rbdVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void d(rbd rbdVar) {
            this.c.setStableInsets(rbdVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void e(rbd rbdVar) {
            this.c.setSystemGestureInsets(rbdVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void f(rbd rbdVar) {
            this.c.setSystemWindowInsets(rbdVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void g(rbd rbdVar) {
            this.c.setTappableElementInsets(rbdVar.e());
        }

        public d(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderA;
            super(windowInsetsCompat);
            WindowInsets windowInsetsW = windowInsetsCompat.w();
            if (windowInsetsW != null) {
                builderA = blr.a(windowInsetsW);
            } else {
                builderA = t6n.a();
            }
            this.c = builderA;
        }
    }

    @RequiresApi(21)
    public static class h extends g {
        public rbd m;

        public h(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public WindowInsetsCompat b() {
            return WindowInsetsCompat.x(this.c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public WindowInsetsCompat c() {
            return WindowInsetsCompat.x(this.c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public final rbd j() {
            if (this.m == null) {
                this.m = rbd.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public boolean o() {
            return this.c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void t(rbd rbdVar) {
            this.m = rbdVar;
        }

        public h(WindowInsetsCompat windowInsetsCompat, h hVar) {
            super(windowInsetsCompat, hVar);
            this.m = null;
            this.m = hVar.m;
        }
    }

    @RequiresApi(20)
    public static class g extends l {
        public static boolean h = false;
        public static Method i;
        public static Class<?> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f2105k;
        public static Field l;
        public final WindowInsets c;
        public rbd[] d;
        public rbd e;
        public WindowInsetsCompat f;
        public rbd g;

        public g(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private rbd u(int i2, boolean z) {
            rbd rbdVarA = rbd.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    rbdVarA = rbd.a(rbdVarA, v(i3, z));
                }
            }
            return rbdVarA;
        }

        private rbd w() {
            WindowInsetsCompat windowInsetsCompat = this.f;
            return windowInsetsCompat != null ? windowInsetsCompat.h() : rbd.e;
        }

        private rbd x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!h) {
                y();
            }
            Method method = i;
            if (method != null && j != null && f2105k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f2105k.get(l.get(objInvoke));
                    if (rect != null) {
                        return rbd.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get visible insets. (Reflection error). ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void y() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                f2105k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2105k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
            }
            h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void d(View view) {
            rbd rbdVarX = x(view);
            if (rbdVarX == null) {
                rbdVarX = rbd.e;
            }
            r(rbdVarX);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.u(this.f);
            windowInsetsCompat.t(this.g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((g) obj).g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public rbd g(int i2) {
            return u(i2, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public rbd h(int i2) {
            return u(i2, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public final rbd l() {
            if (this.e == null) {
                this.e = rbd.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public WindowInsetsCompat n(int i2, int i3, int i4, int i5) {
            b bVar = new b(WindowInsetsCompat.x(this.c));
            bVar.c(WindowInsetsCompat.p(l(), i2, i3, i4, i5));
            bVar.b(WindowInsetsCompat.p(j(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public boolean p() {
            return this.c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void q(rbd[] rbdVarArr) {
            this.d = rbdVarArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void r(rbd rbdVar) {
            this.g = rbdVar;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void s(WindowInsetsCompat windowInsetsCompat) {
            this.f = windowInsetsCompat;
        }

        public rbd v(int i2, boolean z) {
            rbd rbdVarH;
            int i3;
            if (i2 == 1) {
                return z ? rbd.b(0, Math.max(w().f32379b, l().f32379b), 0, 0) : rbd.b(0, l().f32379b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    rbd rbdVarW = w();
                    rbd rbdVarJ = j();
                    return rbd.b(Math.max(rbdVarW.f32378a, rbdVarJ.f32378a), 0, Math.max(rbdVarW.c, rbdVarJ.c), Math.max(rbdVarW.d, rbdVarJ.d));
                }
                rbd rbdVarL = l();
                WindowInsetsCompat windowInsetsCompat = this.f;
                rbdVarH = windowInsetsCompat != null ? windowInsetsCompat.h() : null;
                int iMin = rbdVarL.d;
                if (rbdVarH != null) {
                    iMin = Math.min(iMin, rbdVarH.d);
                }
                return rbd.b(rbdVarL.f32378a, 0, rbdVarL.c, iMin);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return k();
                }
                if (i2 == 32) {
                    return i();
                }
                if (i2 == 64) {
                    return m();
                }
                if (i2 != 128) {
                    return rbd.e;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f;
                gz6 gz6VarE = windowInsetsCompat2 != null ? windowInsetsCompat2.e() : f();
                return gz6VarE != null ? rbd.b(gz6VarE.b(), gz6VarE.d(), gz6VarE.c(), gz6VarE.a()) : rbd.e;
            }
            rbd[] rbdVarArr = this.d;
            rbdVarH = rbdVarArr != null ? rbdVarArr[m.d(8)] : null;
            if (rbdVarH != null) {
                return rbdVarH;
            }
            rbd rbdVarL2 = l();
            rbd rbdVarW2 = w();
            int i4 = rbdVarL2.d;
            if (i4 > rbdVarW2.d) {
                return rbd.b(0, 0, 0, i4);
            }
            rbd rbdVar = this.g;
            return (rbdVar == null || rbdVar.equals(rbd.e) || (i3 = this.g.d) <= rbdVarW2.d) ? rbd.e : rbd.b(0, 0, 0, i3);
        }

        public g(WindowInsetsCompat windowInsetsCompat, g gVar) {
            this(windowInsetsCompat, new WindowInsets(gVar.c));
        }
    }

    @RequiresApi(29)
    public static class j extends i {
        public rbd n;
        public rbd o;
        public rbd p;

        public j(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public rbd i() {
            if (this.o == null) {
                this.o = rbd.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public rbd k() {
            if (this.n == null) {
                this.n = rbd.d(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public rbd m() {
            if (this.p == null) {
                this.p = rbd.d(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        public WindowInsetsCompat n(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.x(this.c.inset(i, i2, i3, i4));
        }

        @Override // androidx.core.view.WindowInsetsCompat.h, androidx.core.view.WindowInsetsCompat.l
        public void t(rbd rbdVar) {
        }

        public j(WindowInsetsCompat windowInsetsCompat, j jVar) {
            super(windowInsetsCompat, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f2102a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f2102a = new e();
            } else if (i >= 29) {
                this.f2102a = new d();
            } else {
                this.f2102a = new c();
            }
        }

        public WindowInsetsCompat a() {
            return this.f2102a.b();
        }

        @Deprecated
        public b b(rbd rbdVar) {
            this.f2102a.d(rbdVar);
            return this;
        }

        @Deprecated
        public b c(rbd rbdVar) {
            this.f2102a.f(rbdVar);
            return this;
        }

        public b(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f2102a = new e(windowInsetsCompat);
            } else if (i >= 29) {
                this.f2102a = new d(windowInsetsCompat);
            } else {
                this.f2102a = new c(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            l lVar = windowInsetsCompat.f2099a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.f2099a = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.f2099a = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.f2099a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f2099a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f2099a = new g(this, (g) lVar);
            } else {
                this.f2099a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f2099a = new l(this);
    }
}
