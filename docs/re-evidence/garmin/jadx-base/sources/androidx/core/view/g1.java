package androidx.core.view;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f6450a;

    public g1(View view2) {
        this.f6450a = new WeakReference<>(view2);
    }

    public final void a(float f14) {
        View view2 = this.f6450a.get();
        if (view2 != null) {
            view2.animate().alpha(f14);
        }
    }

    public final void b() {
        View view2 = this.f6450a.get();
        if (view2 != null) {
            view2.animate().cancel();
        }
    }

    public final void c(long j8) {
        View view2 = this.f6450a.get();
        if (view2 != null) {
            view2.animate().setDuration(j8);
        }
    }

    public final void d(h1 h1Var) {
        View view2 = this.f6450a.get();
        if (view2 != null) {
            if (h1Var != null) {
                view2.animate().setListener(new f1(this, h1Var, view2));
            } else {
                view2.animate().setListener(null);
            }
        }
    }

    public final void e(float f14) {
        View view2 = this.f6450a.get();
        if (view2 != null) {
            view2.animate().translationY(f14);
        }
    }
}
