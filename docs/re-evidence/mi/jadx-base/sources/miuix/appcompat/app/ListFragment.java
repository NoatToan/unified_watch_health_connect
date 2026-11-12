package miuix.appcompat.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fhl;
import defpackage.g5j;
import defpackage.k5a;
import defpackage.osc;
import defpackage.oxc;
import defpackage.qy5;
import defpackage.sii;
import defpackage.wc0;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes3.dex */
public class ListFragment extends androidx.fragment.app.ListFragment implements osc, oxc<androidx.fragment.app.Fragment> {
    public k5a l;
    public boolean m = true;
    public boolean n = true;

    @Override // defpackage.osc
    public boolean acceptExtraPaddingFromParent() {
        return this.l.acceptExtraPaddingFromParent();
    }

    @Override // defpackage.lqc
    public void bindViewWithContentInset(View view) {
        this.l.bindViewWithContentInset(view);
    }

    @Override // defpackage.osc
    public void checkThemeLegality() {
    }

    @Override // defpackage.oxc
    public void dispatchResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        this.l.dispatchResponsiveLayout(configuration, fhlVar, z);
    }

    @Override // defpackage.osc
    public wc0 getActionBar() {
        return this.l.getActionBar();
    }

    @Override // defpackage.lqc
    public Rect getContentInset() {
        return this.l.getContentInset();
    }

    @Override // defpackage.osc
    public Context getThemedContext() {
        return this.l.getThemedContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        k5a k5aVar = this.l;
        if (k5aVar == null) {
            return null;
        }
        return k5aVar.u();
    }

    @Override // defpackage.osc
    public boolean hasActionBar() {
        k5a k5aVar = this.l;
        if (k5aVar == null) {
            return false;
        }
        return k5aVar.hasActionBar();
    }

    @Override // defpackage.bl8
    public boolean isExtraHorizontalPaddingEnable() {
        return this.l.isExtraHorizontalPaddingEnable();
    }

    @Override // defpackage.osc
    public boolean isInEditActionMode() {
        return this.l.isInEditActionMode();
    }

    @Override // defpackage.osc
    public boolean isIsInSearchActionMode() {
        return this.l.isIsInSearchActionMode();
    }

    public boolean isResponsiveEnabled() {
        return false;
    }

    @Override // defpackage.osc
    public final void onActionModeFinished(ActionMode actionMode) {
        this.l.onActionModeFinished(actionMode);
    }

    @Override // defpackage.osc
    public final void onActionModeStarted(ActionMode actionMode) {
        this.l.onActionModeStarted(actionMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        androidx.fragment.app.d dVarX0 = getParentFragmentManager().x0();
        if (dVarX0 instanceof qy5) {
            this.l = ((qy5) dVarX0).e(this);
        } else {
            this.l = new k5a(this);
        }
        this.l.H0(isResponsiveEnabled());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l.B(configuration);
    }

    @Override // defpackage.lqc
    public void onContentInsetChanged(Rect rect) {
        this.l.onContentInsetChanged(rect);
        onProcessBindViewWithContentInset(rect);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l.C(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return this.l.u0(i, z, i2);
    }

    @Override // defpackage.osc
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.osc
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && this.m && this.n && !isHidden() && isAdded()) {
            return onCreateOptionsMenu(menu);
        }
        return false;
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View viewV0 = this.l.v0(layoutInflater, viewGroup, bundle);
        if (viewV0 instanceof ActionBarOverlayLayout) {
            boolean zEquals = "splitActionBarWhenNarrow".equals(this.l.t());
            if (zEquals) {
                z = getActivity().getResources().getBoolean(sii.c);
            } else {
                TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(g5j.m3);
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(g5j.J3, false);
                typedArrayObtainStyledAttributes.recycle();
                z = z2;
            }
            this.l.g(z, zEquals, (ActionBarOverlayLayout) viewV0);
        }
        return viewV0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.l.j(false);
    }

    @Override // defpackage.lqc
    public void onDispatchNestedScrollOffset(int[] iArr) {
        this.l.onDispatchNestedScrollOffset(iArr);
    }

    @Override // defpackage.zk8
    public void onExtraPaddingChanged(int i) {
        this.l.onExtraPaddingChanged(i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        k5a k5aVar;
        super.onHiddenChanged(z);
        if (!z && (k5aVar = this.l) != null) {
            k5aVar.invalidateOptionsMenu();
        }
        onVisibilityChanged(!z);
    }

    @Override // defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.osc
    public void onOptionsMenuViewAdded(Menu menu, Menu menu2) {
    }

    @Override // defpackage.osc
    public void onPanelClosed(int i, Menu menu) {
    }

    @Override // defpackage.osc
    public void onPreparePanel(int i, View view, Menu menu) {
        if (i == 0 && this.m && this.n && !isHidden() && isAdded()) {
            onPrepareOptionsMenu(menu);
        }
    }

    public void onProcessBindViewWithContentInset(Rect rect) {
        this.l.I(rect);
    }

    @Override // defpackage.oxc
    public void onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.l.G();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.l.J();
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    @Deprecated
    public void onViewCreated(View view, Bundle bundle) {
        this.l.y0(view, bundle);
    }

    @Override // defpackage.osc
    public void onViewInflated(View view, Bundle bundle) {
    }

    public void onVisibilityChanged(boolean z) {
    }

    @Override // defpackage.lqc
    public boolean requestDispatchContentInset() {
        return this.l.requestDispatchContentInset();
    }

    @Override // defpackage.zk8
    public boolean setExtraHorizontalPadding(int i) {
        return this.l.setExtraHorizontalPadding(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void setHasOptionsMenu(boolean z) {
        k5a k5aVar;
        super.setHasOptionsMenu(z);
        if (this.m != z) {
            this.m = z;
            if (isHidden() || !isAdded() || (k5aVar = this.l) == null) {
                return;
            }
            k5aVar.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean z) {
        k5a k5aVar;
        super.setMenuVisibility(z);
        if (this.n != z) {
            this.n = z;
            if (isHidden() || !isAdded() || (k5aVar = this.l) == null) {
                return;
            }
            k5aVar.invalidateOptionsMenu();
        }
    }

    @Override // defpackage.oxc
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public androidx.fragment.app.Fragment getResponsiveSubject() {
        return this;
    }
}
