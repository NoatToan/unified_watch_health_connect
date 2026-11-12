package m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f115430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionBarContextView f115431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b.a f115432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<View> f115433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f115434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.appcompat.view.menu.h f115435h;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z14) {
        this.f115430c = context;
        this.f115431d = actionBarContextView;
        this.f115432e = aVar;
        androidx.appcompat.view.menu.h defaultShowAsAction = new androidx.appcompat.view.menu.h(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f115435h = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // m.b
    public final void a() {
        if (this.f115434g) {
            return;
        }
        this.f115434g = true;
        this.f115432e.a(this);
    }

    @Override // m.b
    public final View b() {
        WeakReference<View> weakReference = this.f115433f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // m.b
    public final androidx.appcompat.view.menu.h c() {
        return this.f115435h;
    }

    @Override // m.b
    public final MenuInflater d() {
        return new g(this.f115431d.getContext());
    }

    @Override // m.b
    public final CharSequence e() {
        return this.f115431d.getSubtitle();
    }

    @Override // m.b
    public final CharSequence f() {
        return this.f115431d.getTitle();
    }

    @Override // m.b
    public final void g() {
        this.f115432e.b(this, this.f115435h);
    }

    @Override // m.b
    public final boolean h() {
        return this.f115431d.f4867t;
    }

    @Override // m.b
    public final void i(View view2) {
        this.f115431d.setCustomView(view2);
        this.f115433f = view2 != null ? new WeakReference<>(view2) : null;
    }

    @Override // m.b
    public final void j(int i14) {
        k(this.f115430c.getString(i14));
    }

    @Override // m.b
    public final void k(CharSequence charSequence) {
        this.f115431d.setSubtitle(charSequence);
    }

    @Override // m.b
    public final void l(int i14) {
        m(this.f115430c.getString(i14));
    }

    @Override // m.b
    public final void m(CharSequence charSequence) {
        this.f115431d.setTitle(charSequence);
    }

    @Override // m.b
    public final void n(boolean z14) {
        this.f115423b = z14;
        this.f115431d.setTitleOptional(z14);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        return this.f115432e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
        g();
        androidx.appcompat.widget.c cVar = this.f115431d.f5027d;
        if (cVar != null) {
            cVar.g();
        }
    }
}
