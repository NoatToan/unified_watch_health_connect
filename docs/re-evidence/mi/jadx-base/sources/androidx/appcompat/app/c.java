package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import defpackage.g6i;
import defpackage.ws5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws5 f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f1454b;
    public final AppCompatDelegateImpl.g c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ArrayList<ActionBar.a> g = new ArrayList<>();
    public final Runnable h = new a();
    public final Toolbar.e i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.h();
        }
    }

    public class b implements Toolbar.e {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            return c.this.f1454b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.c$c, reason: collision with other inner class name */
    public final class C0007c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1457a;

        public C0007c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.f1457a) {
                return;
            }
            this.f1457a = true;
            c.this.f1453a.s();
            c.this.f1454b.onPanelClosed(108, eVar);
            this.f1457a = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            c.this.f1454b.onMenuOpened(108, eVar);
            return true;
        }
    }

    public final class d implements androidx.appcompat.view.menu.e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (c.this.f1453a.c()) {
                c.this.f1454b.onPanelClosed(108, eVar);
            } else if (c.this.f1454b.onPreparePanel(0, null, eVar)) {
                c.this.f1454b.onMenuOpened(108, eVar);
            }
        }
    }

    public class e implements AppCompatDelegateImpl.g {
        public e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public boolean a(int i) {
            if (i != 0) {
                return false;
            }
            c cVar = c.this;
            if (cVar.d) {
                return false;
            }
            cVar.f1453a.f();
            c.this.d = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(c.this.f1453a.getContext());
            }
            return null;
        }
    }

    public c(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        g6i.g(toolbar);
        androidx.appcompat.widget.b bVar2 = new androidx.appcompat.widget.b(toolbar, false);
        this.f1453a = bVar2;
        this.f1454b = (Window.Callback) g6i.g(callback);
        bVar2.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        bVar2.setWindowTitle(charSequence);
        this.c = new e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(ActionBar.a aVar) {
        this.g.add(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean closeOptionsMenu() {
        return this.f1453a.d();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        if (!this.f1453a.h()) {
            return false;
        }
        this.f1453a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(z);
        }
    }

    public final Menu g() {
        if (!this.e) {
            this.f1453a.H(new C0007c(), new d());
            this.e = true;
        }
        return this.f1453a.A();
    }

    @Override // androidx.appcompat.app.ActionBar
    public View getCustomView() {
        return this.f1453a.t();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.f1453a.v();
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return androidx.core.view.c.v(this.f1453a.C());
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.f1453a.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getSubtitle() {
        return this.f1453a.J();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c getTabAt(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context getThemedContext() {
        return this.f1453a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getTitle() {
        return this.f1453a.getTitle();
    }

    public void h() {
        Menu menuG = g();
        androidx.appcompat.view.menu.e eVar = menuG instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuG : null;
        if (eVar != null) {
            eVar.h0();
        }
        try {
            menuG.clear();
            if (!this.f1454b.onCreatePanelMenu(0, menuG) || !this.f1454b.onPreparePanel(0, null, menuG)) {
                menuG.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.g0();
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        this.f1453a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean invalidateOptionsMenu() {
        this.f1453a.C().removeCallbacks(this.h);
        androidx.core.view.c.i0(this.f1453a.C(), this.h);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        return this.f1453a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onDestroy() {
        this.f1453a.C().removeCallbacks(this.h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu menuG = g();
        if (menuG == null) {
            return false;
        }
        menuG.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuG.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean openOptionsMenu() {
        return this.f1453a.b();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(ActionBar.a aVar) {
        this.g.remove(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(ActionBar.c cVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean requestFocus() {
        ViewGroup viewGroupC = this.f1453a.C();
        if (viewGroupC == null || viewGroupC.hasFocus()) {
            return false;
        }
        viewGroupC.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(ActionBar.c cVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(Drawable drawable) {
        this.f1453a.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view) {
        setCustomView(view, new ActionBar.LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public void setDisplayOptions(int i) {
        setDisplayOptions(i, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z) {
        setDisplayOptions(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z) {
        setDisplayOptions(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z) {
        setDisplayOptions(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z) {
        setDisplayOptions(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float f) {
        androidx.core.view.c.z0(this.f1453a.C(), f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f1453a.k(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f1453a.x(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i) {
        this.f1453a.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.b bVar) {
        this.f1453a.I(spinnerAdapter, new androidx.appcompat.app.b(bVar));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i) {
        this.f1453a.F(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i) {
        if (i == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f1453a.m(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i) {
        if (this.f1453a.l() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f1453a.z(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(CharSequence charSequence) {
        this.f1453a.y(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(CharSequence charSequence) {
        this.f1453a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(CharSequence charSequence) {
        this.f1453a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        this.f1453a.setVisibility(0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f1453a.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i, int i2) {
        this.f1453a.j((i & i2) | ((~i2) & this.f1453a.v()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int i) {
        this.f1453a.o(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int i) {
        this.f1453a.G(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(Drawable drawable) {
        this.f1453a.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(Drawable drawable) {
        this.f1453a.u(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i) {
        ws5 ws5Var = this.f1453a;
        ws5Var.y(i != 0 ? ws5Var.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i) {
        ws5 ws5Var = this.f1453a;
        ws5Var.setTitle(i != 0 ? ws5Var.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i) {
        setCustomView(LayoutInflater.from(this.f1453a.getContext()).inflate(i, this.f1453a.C(), false));
    }
}
