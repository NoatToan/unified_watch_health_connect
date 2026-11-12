package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.wpo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a extends ActionMode implements e.a {
    public Context c;
    public ActionBarContextView d;
    public ActionMode.Callback e;
    public WeakReference<View> f;
    public boolean g;
    public boolean h;
    public e i;

    public a(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = callback;
        e eVarW = new e(actionBarContextView.getContext()).W(1);
        this.i = eVarW;
        eVarW.V(this);
        this.h = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(e eVar, MenuItem menuItem) {
        return this.e.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(e eVar) {
        k();
        this.d.l();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.d(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public Menu e() {
        return this.i;
    }

    @Override // androidx.appcompat.view.ActionMode
    public MenuInflater f() {
        return new wpo(this.d.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void k() {
        this.e.c(this, this.i);
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean l() {
        return this.d.j();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void n(int i) {
        o(this.c.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void q(int i) {
        r(this.c.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
