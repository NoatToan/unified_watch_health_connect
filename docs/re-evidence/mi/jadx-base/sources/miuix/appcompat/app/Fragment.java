package miuix.appcompat.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import defpackage.al8;
import defpackage.ebm;
import defpackage.fhl;
import defpackage.k5a;
import defpackage.lqc;
import defpackage.osc;
import defpackage.oxc;
import defpackage.qy5;
import defpackage.rkr;
import defpackage.rsk;
import defpackage.s6g;
import defpackage.tc8;
import defpackage.ude;
import defpackage.v9h;
import defpackage.vsi;
import defpackage.wc0;
import defpackage.zk8;
import java.util.List;
import miuix.autodensity.AutoDensityConfig;

/* JADX INFO: loaded from: classes3.dex */
public class Fragment extends androidx.fragment.app.Fragment implements osc, lqc, oxc<Fragment>, ebm {
    protected k5a mDelegate;
    private int mInputViewLimitTextSizeDp;
    private boolean mHasMenu = true;
    private boolean mMenuVisible = true;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$0(View view) {
        if (isAdded()) {
            ude.a(getResources(), view, this.mInputViewLimitTextSizeDp);
        }
    }

    @Override // defpackage.osc
    public boolean acceptExtraPaddingFromParent() {
        return this.mDelegate.acceptExtraPaddingFromParent();
    }

    public void addExtraPaddingObserver(zk8 zk8Var) {
        this.mDelegate.f(zk8Var);
    }

    @Override // defpackage.lqc
    public void bindViewWithContentInset(View view) {
        this.mDelegate.bindViewWithContentInset(view);
    }

    @Override // defpackage.osc
    public void checkThemeLegality() {
    }

    @Deprecated
    public void dismissImmersionMenu(boolean z) {
        this.mDelegate.j(z);
    }

    @Override // defpackage.oxc
    public void dispatchResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        this.mDelegate.dispatchResponsiveLayout(configuration, fhlVar, z);
    }

    @Override // defpackage.osc
    public wc0 getActionBar() {
        return this.mDelegate.getActionBar();
    }

    public AppCompatActivity getAppCompatActivity() {
        k5a k5aVar = this.mDelegate;
        if (k5aVar == null) {
            return null;
        }
        return k5aVar.l();
    }

    public int getBottomMenuCustomViewTranslationY() {
        return this.mDelegate.k0();
    }

    public int getBottomMenuMode() {
        return this.mDelegate.m();
    }

    @Override // defpackage.lqc
    public Rect getContentInset() {
        return this.mDelegate.getContentInset();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public k5a getDelegate() {
        return this.mDelegate;
    }

    public int getExtraHorizontalPadding() {
        return this.mDelegate.n();
    }

    @Deprecated
    public int getExtraHorizontalPaddingLevel() {
        return this.mDelegate.o();
    }

    public al8 getExtraPaddingPolicy() {
        return this.mDelegate.p();
    }

    public View getInflatedView() {
        k5a k5aVar = this.mDelegate;
        if (k5aVar == null) {
            return null;
        }
        return k5aVar.l0();
    }

    public MenuInflater getMenuInflater() {
        return this.mDelegate.r();
    }

    public rsk getResponsiveState() {
        return this.mDelegate.n0();
    }

    @Override // defpackage.oxc
    public Fragment getResponsiveSubject() {
        return this;
    }

    @Override // defpackage.osc
    public Context getThemedContext() {
        return this.mDelegate.getThemedContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        k5a k5aVar = this.mDelegate;
        if (k5aVar == null) {
            return null;
        }
        return k5aVar.u();
    }

    public rkr getWindowInfo() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return tc8.i(activity);
        }
        return null;
    }

    public int getWindowType() {
        rkr windowInfo = getWindowInfo();
        if (windowInfo != null) {
            return windowInfo.f;
        }
        return 1;
    }

    @Override // defpackage.osc
    public boolean hasActionBar() {
        k5a k5aVar = this.mDelegate;
        if (k5aVar == null) {
            return false;
        }
        return k5aVar.hasActionBar();
    }

    public void hideBottomMenu() {
        hideBottomMenu(true);
    }

    public void hideBottomMenuCustomView() {
        this.mDelegate.q0();
    }

    public void hideEndOverflowMenu() {
        this.mDelegate.v();
    }

    public void hideOverflowMenu() {
        this.mDelegate.w();
    }

    public void invalidateOptionsMenu() {
        k5a k5aVar = this.mDelegate;
        if (k5aVar != null) {
            k5aVar.M0(1);
            if (!isHidden() && this.mHasMenu && this.mMenuVisible && isAdded()) {
                this.mDelegate.invalidateOptionsMenu();
            }
        }
    }

    @Override // defpackage.bl8
    public boolean isExtraHorizontalPaddingEnable() {
        return this.mDelegate.isExtraHorizontalPaddingEnable();
    }

    public boolean isExtraPaddingApplyToContentEnable() {
        return this.mDelegate.z();
    }

    @Override // defpackage.osc
    public boolean isInEditActionMode() {
        return this.mDelegate.isInEditActionMode();
    }

    @Override // defpackage.osc
    public boolean isIsInSearchActionMode() {
        return this.mDelegate.isIsInSearchActionMode();
    }

    public boolean isRegisterResponsive() {
        return this.mDelegate.s0();
    }

    public boolean isResponsiveEnabled() {
        return false;
    }

    @Override // defpackage.osc
    public void onActionModeFinished(ActionMode actionMode) {
        this.mDelegate.onActionModeFinished(actionMode);
    }

    @Override // defpackage.osc
    public void onActionModeStarted(ActionMode actionMode) {
        this.mDelegate.onActionModeStarted(actionMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AutoDensityConfig.updateDensity(context);
        androidx.fragment.app.d dVarX0 = getParentFragmentManager().x0();
        if (dVarX0 instanceof qy5) {
            this.mDelegate = ((qy5) dVarX0).e(this);
        } else {
            this.mDelegate = new k5a(this);
        }
        this.mDelegate.H0(isResponsiveEnabled());
        this.mInputViewLimitTextSizeDp = s6g.s(getContext()) ? 16 : 27;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AutoDensityConfig.updateDensityByConfig(getContext(), configuration);
        this.mDelegate.B(configuration);
    }

    @Override // defpackage.lqc
    public void onContentInsetChanged(Rect rect) {
        this.mDelegate.onContentInsetChanged(rect);
        onProcessBindViewWithContentInset(rect);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mDelegate.C(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return this.mDelegate.u0(i, z, i2);
    }

    @Override // defpackage.osc
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.osc
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && this.mHasMenu && this.mMenuVisible && !isHidden() && isAdded()) {
            return onCreateOptionsMenu(menu);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.mDelegate.v0(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mDelegate.j(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mDelegate.w0();
    }

    @Override // defpackage.lqc
    public void onDispatchNestedScrollOffset(int[] iArr) {
        this.mDelegate.onDispatchNestedScrollOffset(iArr);
    }

    @Override // defpackage.zk8
    public void onExtraPaddingChanged(int i) {
        this.mDelegate.onExtraPaddingChanged(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onGenericMotionEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        k5a k5aVar;
        super.onHiddenChanged(z);
        if (!z && (k5aVar = this.mDelegate) != null) {
            k5aVar.invalidateOptionsMenu();
        }
        onVisibilityChanged(!z);
    }

    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onKeyEvent(KeyEvent keyEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyLongPress(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyMultiple(i, i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onKeyShortcutEvent(KeyEvent keyEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyShortcutEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || getActionBar() == null || (getActionBar().getDisplayOptions() & 4) == 0) {
            return false;
        }
        FragmentActivity activity = getActivity();
        if (activity.getParent() == null ? activity.onNavigateUp() : activity.getParent().onNavigateUpFromChild(activity)) {
            return true;
        }
        getActivity().getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // defpackage.osc
    public void onOptionsMenuViewAdded(Menu menu, Menu menu2) {
    }

    @Override // defpackage.osc
    public void onPanelClosed(int i, Menu menu) {
    }

    @Override // defpackage.osc
    public void onPreparePanel(int i, View view, Menu menu) {
        if (i == 0 && this.mHasMenu && this.mMenuVisible && !isHidden() && isAdded()) {
            onPrepareOptionsMenu(menu);
        }
    }

    public void onProcessBindViewWithContentInset(Rect rect) {
        this.mDelegate.I(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm)) {
                ((ebm) fragment).onProvideKeyboardShortcuts(list, menu, i);
            }
        }
    }

    @Override // defpackage.oxc
    public void onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mDelegate.G();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mDelegate.J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebm
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onTrackballEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public void onUpdateArguments(Bundle bundle) {
        if (isStateSaved()) {
            return;
        }
        setArguments(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onViewCreated(View view, Bundle bundle) {
        final View viewFindViewById;
        this.mDelegate.y0(view, bundle);
        Rect contentInset = this.mDelegate.getContentInset();
        if (contentInset != null && (contentInset.top != 0 || contentInset.bottom != 0 || contentInset.left != 0 || contentInset.right != 0)) {
            onContentInsetChanged(contentInset);
        }
        if (view == null || !isAdded() || (viewFindViewById = view.findViewById(vsi.a0)) == null) {
            return;
        }
        viewFindViewById.post(new Runnable() { // from class: h2a
            @Override // java.lang.Runnable
            public final void run() {
                this.f19603a.lambda$onViewCreated$0(viewFindViewById);
            }
        });
    }

    @Override // defpackage.osc
    public void onViewInflated(View view, Bundle bundle) {
    }

    public void onVisibilityChanged(boolean z) {
    }

    public void registerCoordinateScrollView(View view) {
        this.mDelegate.M(view);
    }

    public void removeBottomMenuCustomView() {
        this.mDelegate.z0();
    }

    public void removeExtraPaddingObserver(zk8 zk8Var) {
        this.mDelegate.N(zk8Var);
    }

    @Override // defpackage.lqc
    public boolean requestDispatchContentInset() {
        return this.mDelegate.requestDispatchContentInset();
    }

    public boolean requestWindowFeature(int i) {
        return this.mDelegate.O(i);
    }

    public void setBottomExtraInset(int i) {
        this.mDelegate.A0(i);
        int size = getChildFragmentManager().y0().size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.fragment.app.Fragment fragment = getChildFragmentManager().y0().get(i2);
            if ((fragment instanceof Fragment) && fragment.isAdded()) {
                ((Fragment) fragment).setBottomExtraInset(i);
            }
        }
    }

    public void setBottomMenuCustomView(View view) {
        this.mDelegate.B0(view);
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i) {
        this.mDelegate.C0(i);
    }

    public void setBottomMenuMode(int i) {
        this.mDelegate.D0(i);
    }

    public final void setCorrectNestedScrollMotionEventEnabled(boolean z) {
        this.mDelegate.E0(z);
    }

    public void setEndActionMenuEnabled(boolean z) {
        this.mDelegate.P(z);
    }

    @Override // defpackage.zk8
    public boolean setExtraHorizontalPadding(int i) {
        return this.mDelegate.setExtraHorizontalPadding(i);
    }

    public void setExtraHorizontalPaddingEnable(boolean z) {
        this.mDelegate.S(z);
    }

    public void setExtraHorizontalPaddingInitEnable(boolean z) {
        this.mDelegate.T(z);
    }

    @Deprecated
    public void setExtraHorizontalPaddingLevel(int i) {
        this.mDelegate.U(i);
    }

    public void setExtraPaddingApplyToContentEnable(boolean z) {
        this.mDelegate.V(z);
    }

    public void setExtraPaddingPolicy(al8 al8Var) {
        this.mDelegate.W(al8Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void setHasOptionsMenu(boolean z) {
        super.setHasOptionsMenu(z);
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!z || this.mDelegate == null || isHidden() || !isAdded()) {
                return;
            }
            this.mDelegate.invalidateOptionsMenu();
        }
    }

    public void setHyperActionMenuEnabled(boolean z) {
        this.mDelegate.X(z);
    }

    @Deprecated
    public void setImmersionMenuEnabled(boolean z) {
        this.mDelegate.Y(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean z) {
        k5a k5aVar;
        super.setMenuVisibility(z);
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (isHidden() || !isAdded() || (k5aVar = this.mDelegate) == null) {
                return;
            }
            k5aVar.invalidateOptionsMenu();
        }
    }

    public void setNestedScrollingParentEnabled(boolean z) {
        k5a k5aVar = this.mDelegate;
        if (k5aVar != null) {
            k5aVar.G0(z);
        }
    }

    public void setOnStatusBarChangeListener(v9h v9hVar) {
        this.mDelegate.setOnStatusBarChangeListener(v9hVar);
    }

    public void setThemeRes(int i) {
        this.mDelegate.F0(i);
    }

    public void showBottomMenu() {
        showBottomMenu(true);
    }

    public void showBottomMenuCustomView() {
        this.mDelegate.J0();
    }

    public void showEndOverflowMenu() {
        this.mDelegate.b0();
    }

    @Deprecated
    public void showImmersionMenu() {
        this.mDelegate.c0();
    }

    public void showOverflowMenu() {
        this.mDelegate.e0();
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.mDelegate.K0(callback);
    }

    public void unregisterCoordinateScrollView(View view) {
        this.mDelegate.f0(view);
    }

    public void updateOptionsMenuContent() {
        if (this.mDelegate != null && !isHidden() && this.mHasMenu && this.mMenuVisible && isAdded()) {
            this.mDelegate.invalidateOptionsMenu();
        }
    }

    public void hideBottomMenu(boolean z) {
        this.mDelegate.p0(z);
    }

    public void showBottomMenu(boolean z) {
        this.mDelegate.I0(z);
    }

    @Deprecated
    public void showImmersionMenu(View view, ViewGroup viewGroup) {
        this.mDelegate.d0(view, viewGroup);
    }
}
