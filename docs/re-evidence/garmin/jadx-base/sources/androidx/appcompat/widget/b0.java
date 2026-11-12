package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.core.view.g1;

/* JADX INFO: loaded from: classes.dex */
public interface b0 {
    boolean a();

    void b(Menu menu, androidx.appcompat.view.menu.n.a aVar);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    void h(int i14);

    int i();

    void j(int i14);

    void k(boolean z14);

    void l();

    void m(SpinnerAdapter spinnerAdapter, i.p pVar);

    int n();

    void o();

    void p(Drawable drawable);

    g1 q(int i14, long j8);

    Toolbar r();

    void s(int i14);

    void setIcon(int i14);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean t();

    int u();

    void v(int i14);

    void w(String str);

    void x(int i14);

    void y(p0 p0Var);

    void z(int i14);
}
