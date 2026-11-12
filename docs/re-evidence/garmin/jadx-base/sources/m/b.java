package m;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f115422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115423b;

    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void a();

    public abstract View b();

    public abstract androidx.appcompat.view.menu.h c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public boolean h() {
        return false;
    }

    public abstract void i(View view2);

    public abstract void j(int i14);

    public abstract void k(CharSequence charSequence);

    public abstract void l(int i14);

    public abstract void m(CharSequence charSequence);

    public void n(boolean z14) {
        this.f115423b = z14;
    }
}
