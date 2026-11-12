package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class zi8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f41308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41309b = false;
    public int c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public zi8(yi8 yi8Var) {
        this.f41308a = (View) yi8Var;
    }

    public final void a() {
        ViewParent parent = this.f41308a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).j(this.f41308a);
        }
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.f41309b;
    }

    public void d(Bundle bundle) {
        this.f41309b = bundle.getBoolean("expanded", false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f41309b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f41309b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }

    public void f(int i) {
        this.c = i;
    }
}
