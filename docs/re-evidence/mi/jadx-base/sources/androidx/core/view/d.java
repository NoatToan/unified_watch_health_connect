package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import defpackage.tlr;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2122a;

    @RequiresApi(20)
    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f2123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.core.view.b f2124b;

        public a(Window window, androidx.core.view.b bVar) {
            this.f2123a = window;
            this.f2124b = bVar;
        }

        @Override // androidx.core.view.d.e
        public void a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    d(i2);
                }
            }
        }

        @Override // androidx.core.view.d.e
        public void addOnControllableInsetsChangedListener(f fVar) {
        }

        public final void d(int i) {
            if (i == 1) {
                e(4);
            } else if (i == 2) {
                e(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f2124b.a();
            }
        }

        public void e(int i) {
            View decorView = this.f2123a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void f(int i) {
            this.f2123a.addFlags(i);
        }

        public void g(int i) {
            View decorView = this.f2123a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void h(int i) {
            this.f2123a.clearFlags(i);
        }

        @Override // androidx.core.view.d.e
        public void removeOnControllableInsetsChangedListener(f fVar) {
        }
    }

    @RequiresApi(23)
    public static class b extends a {
        public b(Window window, androidx.core.view.b bVar) {
            super(window, bVar);
        }

        @Override // androidx.core.view.d.e
        public void c(boolean z) {
            if (!z) {
                g(8192);
                return;
            }
            h(67108864);
            f(Integer.MIN_VALUE);
            e(8192);
        }
    }

    @RequiresApi(26)
    public static class c extends b {
        public c(Window window, androidx.core.view.b bVar) {
            super(window, bVar);
        }

        @Override // androidx.core.view.d.e
        public void b(boolean z) {
            if (!z) {
                g(16);
                return;
            }
            h(134217728);
            f(Integer.MIN_VALUE);
            e(16);
        }
    }

    public static class e {
        public void a(int i) {
        }

        public void addOnControllableInsetsChangedListener(f fVar) {
        }

        public void b(boolean z) {
        }

        public void c(boolean z) {
        }

        public void removeOnControllableInsetsChangedListener(f fVar) {
        }
    }

    public interface f {
        void a(d dVar, int i);
    }

    @RequiresApi(30)
    @Deprecated
    public d(WindowInsetsController windowInsetsController) {
        this.f2122a = new C0027d(windowInsetsController, this, new androidx.core.view.b(windowInsetsController));
    }

    @RequiresApi(30)
    @Deprecated
    public static d d(WindowInsetsController windowInsetsController) {
        return new d(windowInsetsController);
    }

    public void a(int i) {
        this.f2122a.a(i);
    }

    public void addOnControllableInsetsChangedListener(f fVar) {
        this.f2122a.addOnControllableInsetsChangedListener(fVar);
    }

    public void b(boolean z) {
        this.f2122a.b(z);
    }

    public void c(boolean z) {
        this.f2122a.c(z);
    }

    public void removeOnControllableInsetsChangedListener(f fVar) {
        this.f2122a.removeOnControllableInsetsChangedListener(fVar);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    @RequiresApi(30)
    public static class C0027d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f2125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f2126b;
        public final androidx.core.view.b c;
        public final SimpleArrayMap<f, WindowInsetsController.OnControllableInsetsChangedListener> d;
        public Window e;

        public C0027d(Window window, d dVar, androidx.core.view.b bVar) {
            this(window.getInsetsController(), dVar, bVar);
            this.e = window;
        }

        @Override // androidx.core.view.d.e
        public void a(int i) {
            if ((i & 8) != 0) {
                this.c.a();
            }
            this.f2126b.hide(i & (-9));
        }

        @Override // androidx.core.view.d.e
        public void addOnControllableInsetsChangedListener(final f fVar) {
            if (this.d.containsKey(fVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener(fVar) { // from class: ulr
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                    this.f35920a.e(null, windowInsetsController, i);
                }
            };
            this.d.put(fVar, onControllableInsetsChangedListener);
            this.f2126b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.d.e
        public void b(boolean z) {
            if (z) {
                if (this.e != null) {
                    f(16);
                }
                this.f2126b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.e != null) {
                    g(16);
                }
                this.f2126b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.d.e
        public void c(boolean z) {
            if (z) {
                if (this.e != null) {
                    f(8192);
                }
                this.f2126b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.e != null) {
                    g(8192);
                }
                this.f2126b.setSystemBarsAppearance(0, 8);
            }
        }

        public final /* synthetic */ void e(f fVar, WindowInsetsController windowInsetsController, int i) {
            if (this.f2126b == windowInsetsController) {
                fVar.a(this.f2125a, i);
            }
        }

        public void f(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void g(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.d.e
        public void removeOnControllableInsetsChangedListener(f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerA = tlr.a(this.d.remove(fVar));
            if (onControllableInsetsChangedListenerA != null) {
                this.f2126b.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerA);
            }
        }

        public C0027d(WindowInsetsController windowInsetsController, d dVar, androidx.core.view.b bVar) {
            this.d = new SimpleArrayMap<>();
            this.f2126b = windowInsetsController;
            this.f2125a = dVar;
            this.c = bVar;
        }
    }

    public d(Window window, View view) {
        androidx.core.view.b bVar = new androidx.core.view.b(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2122a = new C0027d(window, this, bVar);
        } else {
            this.f2122a = new c(window, bVar);
        }
    }
}
