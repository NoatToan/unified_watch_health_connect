package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1471b;

    public interface Callback {
        boolean a(ActionMode actionMode, Menu menu);

        boolean b(ActionMode actionMode, MenuItem menuItem);

        boolean c(ActionMode actionMode, Menu menu);

        void d(ActionMode actionMode);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f1470a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f1471b;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f1470a = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.f1471b = z;
    }
}
