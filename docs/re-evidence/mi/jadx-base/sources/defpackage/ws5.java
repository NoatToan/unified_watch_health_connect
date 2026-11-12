package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface ws5 {
    Menu A();

    lwq B(int i, long j);

    ViewGroup C();

    void D(boolean z);

    void E(ScrollingTabContainerView scrollingTabContainerView);

    void F(int i);

    void G(int i);

    void H(i.a aVar, e.a aVar2);

    void I(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    CharSequence J();

    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e(Menu menu, i.a aVar);

    void f();

    boolean g();

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    boolean h();

    boolean i();

    void j(int i);

    void k(CharSequence charSequence);

    int l();

    void m(int i);

    int n();

    void o(int i);

    void p();

    int q();

    void r(boolean z);

    void s();

    void setBackgroundDrawable(Drawable drawable);

    void setCustomView(View view);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    View t();

    void u(Drawable drawable);

    int v();

    void w();

    void x(Drawable drawable);

    void y(CharSequence charSequence);

    void z(int i);
}
