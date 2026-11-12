package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6451a;

    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f6452a;

        public a(View view2) {
            this.f6452a = view2;
        }

        public void a() {
            View view2 = this.f6452a;
            if (view2 != null) {
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
            }
        }

        public void b() {
            View viewFindViewById;
            View view2 = this.f6452a;
            if (view2 == null) {
                return;
            }
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                viewFindViewById = view2;
            } else {
                viewFindViewById = view2.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view2.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new g0(viewFindViewById, 0));
        }
    }

    public static class c {
    }

    public h0(View view2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6451a = new b(view2);
        } else {
            this.f6451a = new a(view2);
        }
    }

    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f6453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsetsController f6454c;

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f6454c = windowInsetsController;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.j0] */
        @Override // androidx.core.view.h0.a
        public final void a() {
            WindowInsetsController windowInsetsController = this.f6454c;
            View view2 = this.f6453b;
            if (windowInsetsController == null) {
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r14 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.j0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i14) {
                    atomicBoolean.set((i14 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r14);
            if (!atomicBoolean.get() && view2 != null) {
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r14);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.h0.a
        public final void b() {
            View view2 = this.f6453b;
            if (view2 != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f6454c;
            if (windowInsetsController == null) {
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        public b(View view2) {
            super(view2);
            this.f6453b = view2;
        }
    }

    @Deprecated
    public h0(WindowInsetsController windowInsetsController) {
        this.f6451a = new b(windowInsetsController);
    }
}
