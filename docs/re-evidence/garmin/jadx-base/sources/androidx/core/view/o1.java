package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f6545a;

    public static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f6546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f6547b;

        public a(Window window, h0 h0Var) {
            this.f6546a = window;
            this.f6547b = h0Var;
        }

        @Override // androidx.core.view.o1.g
        public final int a() {
            Object tag = this.f6546a.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.o1.g
        public final void b(int i14) {
            for (int i15 = 1; i15 <= 512; i15 <<= 1) {
                if ((i14 & i15) != 0) {
                    if (i15 == 1) {
                        i(4);
                    } else if (i15 == 2) {
                        i(2);
                    } else if (i15 == 8) {
                        this.f6547b.f6451a.a();
                    }
                }
            }
        }

        @Override // androidx.core.view.o1.g
        public final void g(int i14) {
            this.f6546a.getDecorView().setTag(356039078, Integer.valueOf(i14));
            if (i14 == 0) {
                j(6144);
                return;
            }
            if (i14 == 1) {
                j(4096);
                i(2048);
            } else {
                if (i14 != 2) {
                    return;
                }
                j(2048);
                i(4096);
            }
        }

        @Override // androidx.core.view.o1.g
        public final void h(int i14) {
            for (int i15 = 1; i15 <= 512; i15 <<= 1) {
                if ((i14 & i15) != 0) {
                    if (i15 == 1) {
                        j(4);
                        this.f6546a.clearFlags(1024);
                    } else if (i15 == 2) {
                        j(2);
                    } else if (i15 == 8) {
                        this.f6547b.f6451a.b();
                    }
                }
            }
        }

        public final void i(int i14) {
            View decorView = this.f6546a.getDecorView();
            decorView.setSystemUiVisibility(i14 | decorView.getSystemUiVisibility());
        }

        public final void j(int i14) {
            View decorView = this.f6546a.getDecorView();
            decorView.setSystemUiVisibility((~i14) & decorView.getSystemUiVisibility());
        }
    }

    public static class b extends a {
        public b(Window window, h0 h0Var) {
            super(window, h0Var);
        }

        @Override // androidx.core.view.o1.g
        public final boolean d() {
            return (this.f6546a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.o1.g
        public final void f(boolean z14) {
            if (!z14) {
                j(8192);
                return;
            }
            Window window = this.f6546a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            i(8192);
        }
    }

    public static class c extends b {
        public c(Window window, h0 h0Var) {
            super(window, h0Var);
        }

        @Override // androidx.core.view.o1.g
        public final boolean c() {
            return (this.f6546a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.o1.g
        public final void e(boolean z14) {
            if (!z14) {
                j(16);
                return;
            }
            Window window = this.f6546a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            i(16);
        }
    }

    public static class g {
        public int a() {
            return 1;
        }

        public void b(int i14) {
        }

        public boolean c() {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(boolean z14) {
        }

        public void f(boolean z14) {
        }

        public void g(int i14) {
        }

        public void h(int i14) {
        }
    }

    public o1(Window window, View view2) {
        h0 h0Var = new h0(view2);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 35) {
            this.f6545a = new f(window, this, h0Var);
        } else if (i14 >= 30) {
            this.f6545a = new d(window, this, h0Var);
        } else {
            this.f6545a = new c(window, h0Var);
        }
    }

    @Deprecated
    public static o1 c(WindowInsetsController windowInsetsController) {
        return new o1(windowInsetsController);
    }

    public final void a(boolean z14) {
        this.f6545a.e(z14);
    }

    public final void b(boolean z14) {
        this.f6545a.f(z14);
    }

    public static class e extends d {
        public e(Window window, o1 o1Var, h0 h0Var) {
            super(window, o1Var, h0Var);
        }

        @Override // androidx.core.view.o1.d, androidx.core.view.o1.g
        @SuppressLint({"WrongConstant"})
        public final int a() {
            return this.f6548a.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.o1.d, androidx.core.view.o1.g
        public final void g(int i14) {
            this.f6548a.setSystemBarsBehavior(i14);
        }

        public e(WindowInsetsController windowInsetsController, o1 o1Var, h0 h0Var) {
            super(windowInsetsController, o1Var, h0Var);
        }
    }

    public static class f extends e {
        public f(Window window, o1 o1Var, h0 h0Var) {
            super(window, o1Var, h0Var);
        }

        @Override // androidx.core.view.o1.d, androidx.core.view.o1.g
        public final boolean c() {
            return (this.f6548a.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.o1.d, androidx.core.view.o1.g
        public final boolean d() {
            return (this.f6548a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.o1.d, androidx.core.view.o1.g
        public final void e(boolean z14) {
            this.f6548a.setSystemBarsAppearance(z14 ? 16 : 0, 16);
        }

        @Override // androidx.core.view.o1.d, androidx.core.view.o1.g
        public final void f(boolean z14) {
            this.f6548a.setSystemBarsAppearance(z14 ? 8 : 0, 8);
        }

        public f(WindowInsetsController windowInsetsController, o1 o1Var, h0 h0Var) {
            super(windowInsetsController, o1Var, h0Var);
        }
    }

    public static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f6548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f6549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Window f6550c;

        public d(WindowInsetsController windowInsetsController, o1 o1Var, h0 h0Var) {
            new p1.k1();
            this.f6548a = windowInsetsController;
            this.f6549b = h0Var;
        }

        @Override // androidx.core.view.o1.g
        @SuppressLint({"WrongConstant"})
        public int a() {
            Window window = this.f6550c;
            if (window == null) {
                return this.f6548a.getSystemBarsBehavior();
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.o1.g
        public final void b(int i14) {
            if ((i14 & 8) != 0) {
                this.f6549b.f6451a.a();
            }
            this.f6548a.hide(i14 & (-9));
        }

        @Override // androidx.core.view.o1.g
        public boolean c() {
            return i(16, 16);
        }

        @Override // androidx.core.view.o1.g
        public boolean d() {
            return i(8192, 8);
        }

        @Override // androidx.core.view.o1.g
        public void e(boolean z14) {
            Window window = this.f6550c;
            if (window != null) {
                if (!z14) {
                    j(16);
                    return;
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
                    return;
                }
            }
            WindowInsetsController windowInsetsController = this.f6548a;
            if (z14) {
                windowInsetsController.setSystemBarsAppearance(16, 16);
            } else {
                windowInsetsController.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.o1.g
        public void f(boolean z14) {
            Window window = this.f6550c;
            if (window != null) {
                if (!z14) {
                    j(8192);
                    return;
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                    return;
                }
            }
            WindowInsetsController windowInsetsController = this.f6548a;
            if (z14) {
                windowInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                windowInsetsController.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.o1.g
        public void g(int i14) {
            Window window = this.f6550c;
            if (window == null) {
                this.f6548a.setSystemBarsBehavior(i14);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i14));
            if (i14 == 0) {
                j(6144);
                return;
            }
            if (i14 == 1) {
                j(4096);
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
            } else {
                if (i14 != 2) {
                    return;
                }
                j(2048);
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
            }
        }

        @Override // androidx.core.view.o1.g
        public final void h(int i14) {
            if ((i14 & 8) != 0) {
                this.f6549b.f6451a.b();
            }
            this.f6548a.show(i14 & (-9));
        }

        public final boolean i(int i14, int i15) {
            Window window = this.f6550c;
            if (window != null) {
                return (i14 & window.getDecorView().getSystemUiVisibility()) != 0;
            }
            this.f6548a.setSystemBarsAppearance(0, 0);
            return (this.f6548a.getSystemBarsAppearance() & i15) != 0;
        }

        public final void j(int i14) {
            View decorView = this.f6550c.getDecorView();
            decorView.setSystemUiVisibility((~i14) & decorView.getSystemUiVisibility());
        }

        public d(Window window, o1 o1Var, h0 h0Var) {
            this(window.getInsetsController(), o1Var, h0Var);
            this.f6550c = window;
        }
    }

    @Deprecated
    private o1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f6545a = new f(windowInsetsController, this, new h0(windowInsetsController));
        } else {
            this.f6545a = new d(windowInsetsController, this, new h0(windowInsetsController));
        }
    }
}
