package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import z6.h0;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.fragment.app.m implements d, h0.a, i.b.c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private e mDelegate;
    private Resources mResources;

    public class a implements nd.c.b {
        public a() {
        }

        @Override // nd.c.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            c.this.getDelegate().getClass();
            return bundle;
        }
    }

    public class b implements e.b {
        public b() {
        }

        @Override // e.b
        public final void a(b.g gVar) {
            c cVar = c.this;
            e delegate = cVar.getDelegate();
            delegate.j();
            cVar.getSavedStateRegistry().a(c.DELEGATE_TAG);
            delegate.n();
        }
    }

    public c() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // b.g, android.app.Activity
    public void addContentView(View view2, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().a(view2, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().c(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        i.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // z6.e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.m(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i14) {
        return (T) getDelegate().d(i14);
    }

    public e getDelegate() {
        if (this.mDelegate == null) {
            e.c cVar = e.f86561a;
            this.mDelegate = new f(this, this);
        }
        return this.mDelegate;
    }

    @Override // i.b.c
    public i.b.InterfaceC1717b getDrawerToggleDelegate() {
        return getDelegate().f();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i14 = b1.f5036c;
        }
        return resources == null ? super.getResources() : resources;
    }

    public i.a getSupportActionBar() {
        return getDelegate().i();
    }

    @Override // z6.h0.a
    public Intent getSupportParentActivityIntent() {
        return z6.i.b(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().k();
    }

    @Override // b.g, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().m(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(h0 h0Var) {
        h0Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = z6.i.b(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(h0Var.f202638b.getPackageManager());
            }
            h0Var.c(component);
            h0Var.a(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i14, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i14, keyEvent);
    }

    public void onLocalesChanged(h7.g gVar) {
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i14, MenuItem menuItem) {
        if (super.onMenuItemSelected(i14, menuItem)) {
            return true;
        }
        i.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i14, Menu menu) {
        return super.onMenuOpened(i14, menu);
    }

    public void onNightModeChanged(int i14) {
    }

    @Override // b.g, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i14, Menu menu) {
        super.onPanelClosed(i14, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().p();
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().q();
    }

    public void onPrepareSupportNavigateUpTaskStack(h0 h0Var) {
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().r();
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().s();
    }

    @Override // i.d
    public void onSupportActionModeFinished(m.b bVar) {
    }

    @Override // i.d
    public void onSupportActionModeStarted(m.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        h0 h0VarE = h0.e(this);
        onCreateSupportNavigateUpTaskStack(h0VarE);
        onPrepareSupportNavigateUpTaskStack(h0VarE);
        h0VarE.g();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i14) {
        super.onTitleChanged(charSequence, i14);
        getDelegate().B(charSequence);
    }

    @Override // i.d
    public m.b onWindowStartingSupportActionMode(m.b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        i.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.n()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // b.g, android.app.Activity
    public void setContentView(int i14) {
        initializeViewTreeOwners();
        getDelegate().v(i14);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().z(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i14) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z14) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z14) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z14) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i14) {
        super.setTheme(i14);
        getDelegate().A(i14);
    }

    public m.b startSupportActionMode(m.b.a aVar) {
        return getDelegate().C(aVar);
    }

    @Override // androidx.fragment.app.m
    public void supportInvalidateOptionsMenu() {
        getDelegate().k();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i14) {
        return getDelegate().u(i14);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public c(int i14) {
        super(i14);
        initDelegate();
    }

    @Override // b.g, android.app.Activity
    public void setContentView(View view2) {
        initializeViewTreeOwners();
        getDelegate().w(view2);
    }

    @Override // b.g, android.app.Activity
    public void setContentView(View view2, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().x(view2, layoutParams);
    }
}
