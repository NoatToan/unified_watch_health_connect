package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import androidx.core.view.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2109a;

    @RequiresApi(20)
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f2110a;

        public a(View view) {
            this.f2110a = view;
        }

        @Override // androidx.core.view.b.c
        public void a() {
            View view = this.f2110a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2110a.getWindowToken(), 0);
            }
        }
    }

    public static class c {
        public void a() {
            throw null;
        }
    }

    public b(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2109a = new C0025b(view);
        } else {
            this.f2109a = new a(view);
        }
    }

    public void a() {
        this.f2109a.a();
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    @RequiresApi(30)
    public static class C0025b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f2111b;
        public WindowInsetsController c;

        public C0025b(View view) {
            super(view);
            this.f2111b = view;
        }

        public static /* synthetic */ void c(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            atomicBoolean.set((i & 8) != 0);
        }

        @Override // androidx.core.view.b.a, androidx.core.view.b.c
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                View view2 = this.f2111b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: i4n
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    b.C0025b.c(atomicBoolean, windowInsetsController2, i);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f2111b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2111b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        public C0025b(WindowInsetsController windowInsetsController) {
            super(null);
            this.c = windowInsetsController;
        }
    }

    @RequiresApi(30)
    @Deprecated
    public b(WindowInsetsController windowInsetsController) {
        this.f2109a = new C0025b(windowInsetsController);
    }
}
