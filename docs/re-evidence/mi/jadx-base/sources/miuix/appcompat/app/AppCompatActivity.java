package miuix.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import defpackage.al8;
import defpackage.bl8;
import defpackage.ebm;
import defpackage.fg1;
import defpackage.fh0;
import defpackage.fhl;
import defpackage.h8h;
import defpackage.i8h;
import defpackage.j8h;
import defpackage.oxc;
import defpackage.rkr;
import defpackage.rsk;
import defpackage.s6g;
import defpackage.tc8;
import defpackage.ude;
import defpackage.v9h;
import defpackage.vsi;
import defpackage.wc0;
import defpackage.xoc;
import defpackage.yoc;
import defpackage.zk8;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingSuperCall"})
public class AppCompatActivity extends FragmentActivity implements xoc, yoc, oxc<Activity>, bl8 {
    private fg1 mAppDelegate;
    private int mInputViewLimitTextSizeDp;
    private rkr mWindowInfo;

    public class b implements fh0 {
        public b() {
        }

        @Override // defpackage.fh0
        public void a(int i, View view, Menu menu, Menu menu2) {
            AppCompatActivity.this.onOptionsMenuViewAdded(menu, menu2);
        }

        @Override // defpackage.fh0
        public void b() {
            AppCompatActivity.super.onPostResume();
        }

        @Override // defpackage.fh0
        public void c(Bundle bundle) {
            AppCompatActivity.super.onRestoreInstanceState(bundle);
        }

        @Override // defpackage.fh0
        public void onConfigurationChanged(Configuration configuration) {
            AppCompatActivity.super.onConfigurationChanged(configuration);
        }

        @Override // defpackage.fh0
        public void onCreate(Bundle bundle) {
            AppCompatActivity.super.onCreate(bundle);
        }

        @Override // defpackage.fh0
        public boolean onCreatePanelMenu(int i, Menu menu) {
            return AppCompatActivity.super.onCreatePanelMenu(i, menu);
        }

        @Override // defpackage.fh0
        public View onCreatePanelView(int i) {
            return AppCompatActivity.super.onCreatePanelView(i);
        }

        @Override // defpackage.fh0
        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return AppCompatActivity.super.onMenuItemSelected(i, menuItem);
        }

        @Override // defpackage.fh0
        public void onPanelClosed(int i, Menu menu) {
            AppCompatActivity.super.onPanelClosed(i, menu);
        }

        @Override // defpackage.fh0
        public boolean onPreparePanel(int i, View view, Menu menu) {
            return AppCompatActivity.super.onPreparePanel(i, view, menu);
        }

        @Override // defpackage.fh0
        public void onSaveInstanceState(Bundle bundle) {
            AppCompatActivity.super.onSaveInstanceState(bundle);
        }

        @Override // defpackage.fh0
        public void onStop() {
            AppCompatActivity.super.onStop();
        }
    }

    public class c implements j8h {
        public c() {
        }

        @Override // defpackage.j8h
        public void a(boolean z) {
            AppCompatActivity.this.onFloatingWindowModeChanged(z);
        }

        @Override // defpackage.j8h
        public boolean b(boolean z) {
            return AppCompatActivity.this.onFloatingWindowModeChanging(z);
        }
    }

    public AppCompatActivity() {
        this.mAppDelegate = new fg1(this, new b(), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0() {
        ude.a(getResources(), findViewById(vsi.a0), this.mInputViewLimitTextSizeDp);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.mAppDelegate.l0(view, layoutParams);
    }

    public void addExtraPaddingObserver(zk8 zk8Var) {
        this.mAppDelegate.f(zk8Var);
    }

    public void afterConfigurationChanged(Configuration configuration) {
        this.mAppDelegate.m0(configuration);
    }

    public void beforeConfigurationChanged(Configuration configuration) {
        this.mAppDelegate.o0(configuration);
    }

    @Override // defpackage.lqc
    public void bindViewWithContentInset(View view) {
        this.mAppDelegate.bindViewWithContentInset(view);
    }

    public void checkThemeLegality() {
    }

    @Deprecated
    public void dismissImmersionMenu(boolean z) {
        this.mAppDelegate.j(z);
    }

    @Override // defpackage.oxc
    public void dispatchResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        this.mAppDelegate.dispatchResponsiveLayout(configuration, fhlVar, z);
    }

    @Override // defpackage.yoc
    public void executeCloseEnterAnimation() {
        this.mAppDelegate.q0();
    }

    @Override // defpackage.yoc
    public void executeCloseExitAnimation() {
        this.mAppDelegate.r0();
    }

    @Override // defpackage.yoc
    public void executeOpenEnterAnimation() {
        this.mAppDelegate.s0();
    }

    @Override // defpackage.yoc
    public void executeOpenExitAnimation() {
        this.mAppDelegate.t0();
    }

    public void exitFloatingActivityAll() {
        this.mAppDelegate.u0();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.mAppDelegate.k1()) {
            return;
        }
        realFinish();
    }

    public String getActivityIdentity() {
        return this.mAppDelegate.v0();
    }

    public wc0 getAppCompatActionBar() {
        return this.mAppDelegate.getActionBar();
    }

    public int getBottomMenuCustomViewTranslationY() {
        return this.mAppDelegate.w0();
    }

    public int getBottomMenuMode() {
        return this.mAppDelegate.m();
    }

    @Override // defpackage.lqc
    public Rect getContentInset() {
        return this.mAppDelegate.getContentInset();
    }

    public int getExtraHorizontalPadding() {
        return this.mAppDelegate.n();
    }

    @Deprecated
    public int getExtraHorizontalPaddingLevel() {
        return this.mAppDelegate.o();
    }

    public al8 getExtraPaddingPolicy() {
        return this.mAppDelegate.p();
    }

    public View getFloatingBrightPanel() {
        return this.mAppDelegate.y0();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return this.mAppDelegate.r();
    }

    public rsk getResponsiveState() {
        return this.mAppDelegate.z0();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.oxc
    public Activity getResponsiveSubject() {
        return this;
    }

    public int getTranslucentStatus() {
        return this.mAppDelegate.s();
    }

    public rkr getWindowInfo() {
        return this.mWindowInfo;
    }

    public int getWindowType() {
        rkr rkrVar = this.mWindowInfo;
        if (rkrVar != null) {
            return rkrVar.f;
        }
        return 1;
    }

    public void hideBottomMenu() {
        hideBottomMenu(true);
    }

    public void hideBottomMenuCustomView() {
        this.mAppDelegate.C0();
    }

    public void hideEndOverflowMenu() {
        this.mAppDelegate.v();
    }

    public void hideFloatingBrightPanel() {
        this.mAppDelegate.D0();
    }

    public void hideFloatingDimBackground() {
        this.mAppDelegate.E0();
    }

    public void hideOverflowMenu() {
        this.mAppDelegate.w();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        this.mAppDelegate.invalidateOptionsMenu();
    }

    @Override // defpackage.bl8
    public boolean isExtraHorizontalPaddingEnable() {
        return this.mAppDelegate.isExtraHorizontalPaddingEnable();
    }

    public boolean isExtraPaddingApplyToContentEnable() {
        return this.mAppDelegate.z();
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return this.mAppDelegate.I0() || super.isFinishing();
    }

    public boolean isFloatingWindowTheme() {
        return this.mAppDelegate.J0();
    }

    @Override // defpackage.xoc
    public boolean isInFloatingWindowMode() {
        return this.mAppDelegate.isInFloatingWindowMode();
    }

    public boolean isRegisterResponsive() {
        return this.mAppDelegate.K0();
    }

    public boolean isResponsiveEnabled() {
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.mAppDelegate.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.mAppDelegate.onActionModeStarted(actionMode);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        beforeConfigurationChanged(getResources().getConfiguration());
        if (!this.mWindowInfo.a()) {
            tc8.s(this.mWindowInfo);
        }
        this.mAppDelegate.B(configuration);
        afterConfigurationChanged(configuration);
    }

    @Override // defpackage.lqc
    public void onContentInsetChanged(Rect rect) {
        this.mAppDelegate.onContentInsetChanged(rect);
        onProcessBindViewWithContentInset(rect);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        tc8.t(this);
        this.mAppDelegate.i1(isResponsiveEnabled());
        this.mAppDelegate.C(bundle);
        this.mWindowInfo = tc8.k(this, null, true);
        this.mInputViewLimitTextSizeDp = s6g.s(this) ? 16 : 27;
        getWindow().getDecorView().post(new Runnable() { // from class: cf1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5266a.lambda$onCreate$0();
            }
        });
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.mAppDelegate.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.mAppDelegate.P0(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.mAppDelegate.E();
        tc8.u(this);
        this.mWindowInfo = null;
        super.onDestroy();
    }

    @Override // defpackage.lqc
    public void onDispatchNestedScrollOffset(int[] iArr) {
    }

    @Override // defpackage.zk8
    public void onExtraPaddingChanged(int i) {
        this.mAppDelegate.onExtraPaddingChanged(i);
    }

    public void onFloatingWindowModeChanged(boolean z) {
    }

    public boolean onFloatingWindowModeChanging(boolean z) {
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (ebm.l(getSupportFragmentManager(), i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (ebm.b(getSupportFragmentManager(), i, keyEvent)) {
            return true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        if (ebm.n(getSupportFragmentManager(), i, i2, keyEvent)) {
            return true;
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (ebm.r(getSupportFragmentManager(), i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.mAppDelegate.F(i, menuItem);
    }

    public void onOptionsMenuViewAdded(Menu menu, Menu menu2) {
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.mAppDelegate.onPanelClosed(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        this.mAppDelegate.G();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.mAppDelegate.Q0(i, view, menu);
    }

    public void onProcessBindViewWithContentInset(Rect rect) {
        this.mAppDelegate.I(rect);
    }

    @Override // defpackage.oxc
    public void onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        this.mAppDelegate.R0(bundle);
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mAppDelegate.S0(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        this.mAppDelegate.J();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        this.mAppDelegate.j1(charSequence);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.mAppDelegate.L(callback, i);
    }

    public void realFinish() {
        super.finish();
    }

    public void registerCoordinateScrollView(View view) {
        this.mAppDelegate.M(view);
    }

    public void removeBottomMenuCustomView() {
        this.mAppDelegate.T0();
    }

    public void removeExtraPaddingObserver(zk8 zk8Var) {
        this.mAppDelegate.N(zk8Var);
    }

    @Override // defpackage.lqc
    public boolean requestDispatchContentInset() {
        return this.mAppDelegate.requestDispatchContentInset();
    }

    public boolean requestExtraWindowFeature(int i) {
        return this.mAppDelegate.O(i);
    }

    public void setBottomExtraInset(int i) {
        this.mAppDelegate.U0(i);
    }

    public void setBottomMenuCustomView(View view) {
        this.mAppDelegate.V0(view);
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i) {
        this.mAppDelegate.W0(i);
    }

    public void setBottomMenuMode(int i) {
        this.mAppDelegate.X0(i);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        this.mAppDelegate.Y0(i);
    }

    public final void setCorrectNestedScrollMotionEventEnabled(boolean z) {
        this.mAppDelegate.b1(z);
    }

    public void setEnableSwipToDismiss(boolean z) {
        this.mAppDelegate.c1(z);
    }

    public void setEndActionMenuEnabled(boolean z) {
        this.mAppDelegate.P(z);
    }

    @Override // defpackage.zk8
    public boolean setExtraHorizontalPadding(int i) {
        return this.mAppDelegate.setExtraHorizontalPadding(i);
    }

    public void setExtraHorizontalPaddingEnable(boolean z) {
        this.mAppDelegate.S(z);
    }

    public void setExtraHorizontalPaddingInitEnable(boolean z) {
        this.mAppDelegate.T(z);
    }

    @Deprecated
    public void setExtraHorizontalPaddingLevel(int i) {
        this.mAppDelegate.U(i);
    }

    public void setExtraPaddingApplyToContentEnable(boolean z) {
        this.mAppDelegate.V(z);
    }

    public void setExtraPaddingPolicy(al8 al8Var) {
        this.mAppDelegate.W(al8Var);
    }

    public void setFloatingWindowBorderEnable(boolean z) {
        this.mAppDelegate.d1(z);
    }

    public void setFloatingWindowMode(boolean z) {
        this.mAppDelegate.e1(z);
    }

    public void setHyperActionMenuEnabled(boolean z) {
        this.mAppDelegate.X(z);
    }

    @Deprecated
    public void setImmersionMenuEnabled(boolean z) {
        this.mAppDelegate.Y(z);
    }

    public void setOnFloatingCallback(i8h i8hVar) {
        this.mAppDelegate.g1(i8hVar);
    }

    public void setOnFloatingWindowCallback(h8h h8hVar) {
        this.mAppDelegate.h1(h8hVar);
    }

    public void setOnStatusBarChangeListener(v9h v9hVar) {
        this.mAppDelegate.setOnStatusBarChangeListener(v9hVar);
    }

    public void setTranslucentStatus(int i) {
        this.mAppDelegate.a0(i);
    }

    public void showBottomMenu() {
        showBottomMenu(true);
    }

    public void showBottomMenuCustomView() {
        this.mAppDelegate.n1();
    }

    public void showEndOverflowMenu() {
        this.mAppDelegate.b0();
    }

    public void showFloatingBrightPanel() {
        this.mAppDelegate.o1();
    }

    @Deprecated
    public void showImmersionMenu() {
        this.mAppDelegate.c0();
    }

    public void showOverflowMenu() {
        this.mAppDelegate.e0();
    }

    @Override // android.app.Activity
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.mAppDelegate.p1(callback);
    }

    @VisibleForTesting
    public void testNotifyResponseChange(int i) {
        this.mAppDelegate.q1(i);
    }

    public void unregisterCoordinateScrollView(View view) {
        this.mAppDelegate.f0(view);
    }

    public void hideBottomMenu(boolean z) {
        this.mAppDelegate.B0(z);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.mAppDelegate.K(callback);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        this.mAppDelegate.Z0(view);
    }

    public void showBottomMenu(boolean z) {
        this.mAppDelegate.m1(z);
    }

    @Deprecated
    public void showImmersionMenu(View view, ViewGroup viewGroup) {
        this.mAppDelegate.d0(view, viewGroup);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.mAppDelegate.a1(view, layoutParams);
    }
}
