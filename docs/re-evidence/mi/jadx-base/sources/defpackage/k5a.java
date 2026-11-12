package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import miuix.appcompat.app.AppCompatActivity;
import miuix.appcompat.internal.app.widget.ActionBarImpl;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.responsive.page.manager.BaseResponseStateManager;

/* JADX INFO: loaded from: classes3.dex */
public class k5a extends fd0 implements oxc<Fragment> {
    public boolean F;
    public Fragment G;
    public View H;
    public View I;
    public int J;
    public Context K;
    public byte L;
    public Runnable M;
    public boolean N;
    public boolean O;
    public BaseResponseStateManager P;
    public boolean Q;
    public final Handler R;
    public final Window.Callback S;

    public class a extends sdm {
        public a() {
        }

        @Override // android.view.Window.Callback
        public void onActionModeFinished(ActionMode actionMode) {
            ((osc) k5a.this.G).onActionModeFinished(actionMode);
        }

        @Override // android.view.Window.Callback
        public void onActionModeStarted(ActionMode actionMode) {
            ((osc) k5a.this.G).onActionModeStarted(actionMode);
        }

        @Override // android.view.Window.Callback
        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return k5a.this.F(i, menuItem);
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            k5a.this.onPanelClosed(i, menu);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return k5a.this.K(callback);
        }
    }

    public class b extends BaseResponseStateManager {
        public b(oxc oxcVar) {
            super(oxcVar);
        }

        @Override // defpackage.be2
        public Context c() {
            return k5a.this.getThemedContext();
        }
    }

    public class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Context context = k5a.this.G.getContext();
            k5a k5aVar = k5a.this;
            al8 al8Var = k5aVar.z;
            if (al8Var == null || context == null || !k5aVar.L0(context, al8Var, i3 - i, i4 - i2)) {
                return;
            }
            if (k5a.this.D != null) {
                for (int i9 = 0; i9 < k5a.this.D.size(); i9++) {
                    k5a.this.D.get(i9).onExtraPaddingChanged(k5a.this.x);
                }
            }
            ((osc) k5a.this.G).onExtraPaddingChanged(k5a.this.x);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.view.Menu, miuix.appcompat.internal.view.menu.d] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            if (k5a.this.y() || k5a.this.t0()) {
                ?? H = k5a.this.h();
                boolean zOnCreatePanelMenu = k5a.this.onCreatePanelMenu(0, H);
                if (zOnCreatePanelMenu) {
                    zOnCreatePanelMenu = k5a.this.x0(0, null, H);
                }
                if (zOnCreatePanelMenu) {
                    k5a.this.Z(H);
                } else {
                    k5a.this.Z(null);
                }
            } else {
                k5a.this.Z(null);
            }
            k5a.j0(k5a.this, -18);
        }

        public /* synthetic */ d(k5a k5aVar, a aVar) {
            this();
        }
    }

    public k5a(Fragment fragment) {
        super((AppCompatActivity) fragment.getActivity());
        this.F = false;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.R = new Handler(Looper.getMainLooper());
        this.S = new a();
        this.G = fragment;
    }

    public static /* synthetic */ byte j0(k5a k5aVar, int i) {
        byte b2 = (byte) (i & k5aVar.L);
        k5aVar.L = b2;
        return b2;
    }

    public void A0(int i) {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setBottomExtraInset(i);
        }
    }

    @Override // defpackage.fd0
    public void B(Configuration configuration) {
        int iA;
        BaseResponseStateManager baseResponseStateManager = this.P;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.j(this.G.getResources().getConfiguration());
        }
        super.B(configuration);
        if (!this.y && this.w != (iA = p56.a(this.f17663a))) {
            this.w = iA;
            x();
            View view = this.I;
            if (view instanceof ActionBarOverlayLayout) {
                ((ActionBarOverlayLayout) view).setExtraPaddingPolicy(this.z);
            }
        }
        View view2 = this.I;
        if (view2 != null && (view2 instanceof ActionBarOverlayLayout)) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view2;
            if (!this.y) {
                actionBarOverlayLayout.setExtraPaddingPolicy(p());
            }
            FragmentActivity activity = this.G.getActivity();
            if (activity instanceof AppCompatActivity) {
                ((ActionBarOverlayLayout) this.I).L(((AppCompatActivity) activity).isInFloatingWindowMode());
            }
        }
        BaseResponseStateManager baseResponseStateManager2 = this.P;
        if (baseResponseStateManager2 != null) {
            baseResponseStateManager2.i(configuration);
        }
    }

    public void B0(View view) {
        View view2 = this.I;
        if (view2 instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view2).setBottomMenuCustomView(view);
        }
    }

    public void C0(int i) {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setBottomMenuCustomViewTranslationYWithPx(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fd0
    public boolean D(miuix.appcompat.internal.view.menu.d dVar) {
        return ((osc) this.G).onCreateOptionsMenu(dVar);
    }

    public void D0(int i) {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setBottomMenuMode(i);
        }
    }

    public void E0(boolean z) {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setCorrectNestedScrollMotionEventEnabled(z);
        }
    }

    @Override // defpackage.fd0
    public boolean F(int i, MenuItem menuItem) {
        if (i == 0) {
            return this.G.onOptionsItemSelected(menuItem);
        }
        if (i == 6) {
            return this.G.onContextItemSelected(menuItem);
        }
        return false;
    }

    public void F0(int i) {
        this.J = i;
    }

    public void G0(boolean z) {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setNestedScrollingParentEnabled(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fd0
    public boolean H(miuix.appcompat.internal.view.menu.d dVar) {
        this.G.onPrepareOptionsMenu(dVar);
        return true;
    }

    public void H0(boolean z) {
        this.F = z;
    }

    public void I0(boolean z) {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).S(z);
        }
    }

    public void J0() {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).T();
        }
    }

    @Override // defpackage.fd0
    public ActionMode K(ActionMode.Callback callback) {
        if (getActionBar() != null) {
            return ((ActionBarImpl) getActionBar()).startActionMode(callback);
        }
        return null;
    }

    public ActionMode K0(ActionMode.Callback callback) {
        if (callback instanceof dil.b) {
            e((ActionBarOverlayLayout) this.I);
        }
        return this.I.startActionMode(callback);
    }

    public final boolean L0(Context context, al8 al8Var, int i, int i2) {
        Resources resources = context.getResources();
        rkr rkrVarJ = tc8.j(context, resources.getConfiguration());
        if (i == -1) {
            i = rkrVarJ.c.x;
        }
        int i3 = i;
        if (i2 == -1) {
            i2 = rkrVarJ.c.y;
        }
        float f = resources.getDisplayMetrics().density;
        Point point = rkrVarJ.d;
        al8Var.i(point.x, point.y, i3, i2, f, false);
        return setExtraHorizontalPadding(al8Var.h() ? (int) (al8Var.f() * f) : 0);
    }

    @Override // defpackage.fd0
    public void M(View view) {
        super.M(view);
        if (hasActionBar()) {
            return;
        }
        LifecycleOwner parentFragment = this.G.getParentFragment();
        wc0 actionBar = parentFragment instanceof osc ? ((osc) parentFragment).getActionBar() : null;
        if (actionBar != null) {
            actionBar.registerCoordinateScrollView(view);
        }
    }

    public void M0(int i) {
        this.L = (byte) ((i & 1) | this.L);
    }

    @Override // defpackage.fd0
    public void N(zk8 zk8Var) {
        List<zk8> list = this.D;
        if (list != null) {
            list.remove(zk8Var);
        }
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).Q(zk8Var);
        }
    }

    @Override // defpackage.fd0
    public void S(boolean z) {
        super.S(z);
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setExtraHorizontalPaddingEnable(z);
        }
    }

    @Override // defpackage.fd0
    public void T(boolean z) {
        super.T(z);
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setExtraHorizontalPaddingInitEnable(this.B);
        }
    }

    @Override // defpackage.fd0
    public void V(boolean z) {
        super.V(z);
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setExtraPaddingApplyToContentEnable(z);
        }
    }

    @Override // defpackage.fd0
    public void W(al8 al8Var) {
        super.W(al8Var);
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setExtraPaddingPolicy(this.z);
        }
    }

    @Override // defpackage.dd0
    public void a(int i, View view, Menu menu, Menu menu2) {
        if (i == 0) {
            ((osc) this.G).onOptionsMenuViewAdded(menu, menu2);
        }
    }

    public boolean acceptExtraPaddingFromParent() {
        return hasActionBar() || !isExtraHorizontalPaddingEnable() || this.z == null;
    }

    public void checkThemeLegality() {
    }

    @Override // miuix.appcompat.internal.view.menu.d.b
    public boolean d(miuix.appcompat.internal.view.menu.d dVar, MenuItem menuItem) {
        return F(0, menuItem);
    }

    @Override // defpackage.oxc
    public void dispatchResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        onResponsiveLayout(configuration, fhlVar, z);
    }

    @Override // defpackage.fd0
    public void f(zk8 zk8Var) {
        super.f(zk8Var);
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).j(zk8Var);
        }
    }

    @Override // defpackage.fd0
    public void f0(View view) {
        super.f0(view);
        if (hasActionBar()) {
            return;
        }
        LifecycleOwner parentFragment = this.G.getParentFragment();
        wc0 actionBar = parentFragment instanceof osc ? ((osc) parentFragment).getActionBar() : null;
        if (actionBar != null) {
            actionBar.unregisterCoordinateScrollView(view);
        }
    }

    @Override // defpackage.lqc
    public Rect getContentInset() {
        boolean z = this.h;
        if (!z && this.s == null) {
            LifecycleOwner parentFragment = this.G.getParentFragment();
            if (parentFragment instanceof osc) {
                this.s = ((osc) parentFragment).getContentInset();
            } else if (parentFragment == null) {
                this.s = l().getContentInset();
            }
        } else if (z) {
            View view = this.I;
            if (view instanceof ActionBarOverlayLayout) {
                this.s = ((ActionBarOverlayLayout) view).getContentInset();
            }
        }
        return this.s;
    }

    @Override // defpackage.fd0
    public Context getThemedContext() {
        if (this.K == null) {
            this.K = this.f17663a;
            if (this.J != 0) {
                this.K = new ContextThemeWrapper(this.K, this.J);
            }
        }
        return this.K;
    }

    @Override // defpackage.dd0
    public wc0 i() {
        if (!this.G.isAdded() || this.f17664b == null) {
            return null;
        }
        return new ActionBarImpl(this.G);
    }

    @Override // defpackage.dd0
    public void invalidateOptionsMenu() {
        byte b2 = this.L;
        if ((b2 & 16) == 0) {
            this.L = (byte) (b2 | 16);
            m0().run();
        }
    }

    public boolean isInEditActionMode() {
        LifecycleOwner parentFragment = this.G.getParentFragment();
        return (hasActionBar() || !(parentFragment instanceof osc)) ? this.N : ((osc) parentFragment).isInEditActionMode();
    }

    public boolean isIsInSearchActionMode() {
        LifecycleOwner parentFragment = this.G.getParentFragment();
        return (hasActionBar() || !(parentFragment instanceof osc)) ? this.O : ((osc) parentFragment).isIsInSearchActionMode();
    }

    public int k0() {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            return ((ActionBarOverlayLayout) view).getBottomMenuCustomViewTranslationY();
        }
        return 0;
    }

    public View l0() {
        return this.H;
    }

    @Override // defpackage.fd0
    public int m() {
        View view = this.I;
        return view instanceof ActionBarOverlayLayout ? ((ActionBarOverlayLayout) view).getBottomMenuMode() : super.m();
    }

    public final Runnable m0() {
        if (this.M == null) {
            this.M = new d(this, null);
        }
        return this.M;
    }

    public rsk n0() {
        BaseResponseStateManager baseResponseStateManager = this.P;
        if (baseResponseStateManager != null) {
            return baseResponseStateManager.m();
        }
        return null;
    }

    @Override // defpackage.oxc
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public Fragment getResponsiveSubject() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fd0, defpackage.lqc
    public void onContentInsetChanged(Rect rect) {
        super.onContentInsetChanged(rect);
        List<Fragment> listY0 = this.G.getChildFragmentManager().y0();
        int size = listY0.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = listY0.get(i);
            if ((fragment instanceof osc) && fragment.isAdded()) {
                osc oscVar = (osc) fragment;
                if (!oscVar.hasActionBar()) {
                    oscVar.onContentInsetChanged(rect);
                }
            }
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return ((osc) this.G).onCreatePanelMenu(i, menu);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zk8
    public void onExtraPaddingChanged(int i) {
        this.x = i;
        List<Fragment> listY0 = this.G.getChildFragmentManager().y0();
        int size = listY0.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = listY0.get(i2);
            if ((fragment instanceof osc) && fragment.isAdded()) {
                osc oscVar = (osc) fragment;
                if (oscVar.acceptExtraPaddingFromParent() && oscVar.isExtraHorizontalPaddingEnable()) {
                    oscVar.onExtraPaddingChanged(i);
                }
            }
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        ((osc) this.G).onPanelClosed(i, menu);
        if (i == 0) {
            this.G.onOptionsMenuClosed(menu);
        }
    }

    @Override // defpackage.oxc
    public void onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        LifecycleOwner lifecycleOwner = this.G;
        if (lifecycleOwner instanceof oxc) {
            ((oxc) lifecycleOwner).onResponsiveLayout(configuration, fhlVar, z);
        }
    }

    public void p0(boolean z) {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).v(z);
        }
    }

    @Override // defpackage.fd0
    public LifecycleOwner q() {
        return this.G;
    }

    public void q0() {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).w();
        }
    }

    public final void r0(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (this.e) {
            if (this.I.getParent() == null || !(this.I.getParent() instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.I.getParent();
            if (viewGroup2.getChildCount() == 0) {
                viewGroup2.endViewTransition(this.I);
                return;
            }
            return;
        }
        FragmentActivity activity = this.G.getActivity();
        boolean z = activity instanceof AppCompatActivity;
        if (z) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            appCompatActivity.setExtraHorizontalPaddingEnable(false);
            appCompatActivity.setExtraPaddingApplyToContentEnable(false);
        }
        this.e = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) layoutInflater.inflate(awi.L, viewGroup, false);
        actionBarOverlayLayout.setLifecycleOwner(q());
        actionBarOverlayLayout.setCallback(this.S);
        LifecycleOwner lifecycleOwner = this.G;
        if (lifecycleOwner instanceof osc) {
            actionBarOverlayLayout.setContentInsetStateCallback((lqc) lifecycleOwner);
            actionBarOverlayLayout.j((zk8) this.G);
        }
        actionBarOverlayLayout.setRootSubDecor(false);
        actionBarOverlayLayout.setOverlayMode(this.i);
        actionBarOverlayLayout.setTranslucentStatus(s());
        if (this.J != 0) {
            checkThemeLegality();
            ((osc) this.G).checkThemeLegality();
            actionBarOverlayLayout.setBackground(hm1.h(context, R.attr.windowBackground));
        }
        if (z) {
            actionBarOverlayLayout.L(((AppCompatActivity) activity).isInFloatingWindowMode());
        }
        ActionBarView actionBarView = (ActionBarView) actionBarOverlayLayout.findViewById(vsi.f37187a);
        this.f17664b = actionBarView;
        actionBarView.setLifecycleOwner(q());
        this.f17664b.setWindowCallback(this.S);
        if (this.g) {
            this.f17664b.initIndeterminateProgress();
        }
        if (y()) {
            this.f17664b.setEndActionMenuEnable(true);
        }
        boolean zEquals = "splitActionBarWhenNarrow".equals(t());
        if (zEquals) {
            this.Q = context.getResources().getBoolean(sii.c);
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(g5j.m3);
            this.Q = typedArrayObtainStyledAttributes.getBoolean(g5j.J3, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.Q) {
            g(true, zEquals, actionBarOverlayLayout);
        }
        M0(1);
        this.I = actionBarOverlayLayout;
    }

    @Override // defpackage.lqc
    public boolean requestDispatchContentInset() {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).R();
            return true;
        }
        LifecycleOwner parentFragment = this.G.getParentFragment();
        if ((parentFragment instanceof osc) && ((osc) parentFragment).requestDispatchContentInset()) {
            return false;
        }
        return l().requestDispatchContentInset();
    }

    public boolean s0() {
        return this.P != null;
    }

    public void setOnStatusBarChangeListener(v9h v9hVar) {
        View view = this.I;
        if (view == null || !(view instanceof ActionBarOverlayLayout)) {
            return;
        }
        ((ActionBarOverlayLayout) view).setOnStatusBarChangeListener(v9hVar);
    }

    public boolean t0() {
        return this.Q;
    }

    @Override // defpackage.fd0
    public View u() {
        return this.I;
    }

    public Animator u0(int i, boolean z, int i2) {
        return uc1.a(this.G, i2);
    }

    public View v0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = getThemedContext().obtainStyledAttributes(g5j.m3);
        if (typedArrayObtainStyledAttributes.getBoolean(g5j.s3, this.F)) {
            this.P = new b(this);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(g5j.t3)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a miuix theme (or descendant) with this fragment.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g5j.t3, false)) {
            O(8);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g5j.u3, false)) {
            O(9);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(g5j.w3, this.A);
        if (this.A) {
            z = true;
        }
        S(z);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(g5j.x3, this.B);
        if (this.B) {
            z2 = true;
        }
        T(z2);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(g5j.v3, this.C);
        if (this.C) {
            z3 = true;
        }
        V(z3);
        a0(typedArrayObtainStyledAttributes.getInt(g5j.K3, 0));
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(getThemedContext());
        if (this.h) {
            r0(getThemedContext(), viewGroup, layoutInflaterCloneInContext);
            if (this.I instanceof ActionBarOverlayLayout) {
                if (!this.y) {
                    x();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.I;
                actionBarOverlayLayout.setExtraHorizontalPaddingEnable(isExtraHorizontalPaddingEnable());
                actionBarOverlayLayout.setExtraHorizontalPaddingInitEnable(this.B);
                actionBarOverlayLayout.setExtraPaddingApplyToContentEnable(z());
                actionBarOverlayLayout.setExtraPaddingPolicy(this.z);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.I.findViewById(R.id.content);
            View viewOnInflateView = ((osc) this.G).onInflateView(layoutInflaterCloneInContext, viewGroup2, bundle);
            this.H = viewOnInflateView;
            if (viewOnInflateView != null && viewOnInflateView.getParent() != viewGroup2) {
                if (this.H.getParent() != null) {
                    ((ViewGroup) this.H.getParent()).removeView(this.H);
                }
                viewGroup2.removeAllViews();
                viewGroup2.addView(this.H);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(g5j.p3, false)) {
                R(true, typedArrayObtainStyledAttributes.getBoolean(g5j.q3, false), false);
            } else {
                byte b2 = this.L;
                if ((b2 & 16) == 0) {
                    this.L = (byte) (b2 | 16);
                    this.R.post(m0());
                }
            }
        } else {
            View viewOnInflateView2 = ((osc) this.G).onInflateView(layoutInflaterCloneInContext, viewGroup, bundle);
            this.H = viewOnInflateView2;
            this.I = viewOnInflateView2;
            if (viewOnInflateView2 != null) {
                if (!this.y) {
                    x();
                }
                if (!((osc) this.G).acceptExtraPaddingFromParent()) {
                    if (this.B) {
                        Context context = this.G.getContext();
                        al8 al8Var = this.z;
                        if (al8Var != null && context != null) {
                            L0(context, al8Var, -1, -1);
                        }
                    }
                    this.I.addOnLayoutChangeListener(new c());
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return this.I;
    }

    public void w0() {
        E();
        List<zk8> list = this.D;
        if (list != null) {
            list.clear();
        }
        this.H = null;
        this.I = null;
        this.e = false;
        this.f17666r = false;
        this.j = null;
        this.f17664b = null;
        Runnable runnable = this.M;
        if (runnable != null) {
            this.R.removeCallbacks(runnable);
            this.M = null;
        }
    }

    public boolean x0(int i, View view, Menu menu) {
        if (i != 0) {
            return false;
        }
        ((osc) this.G).onPreparePanel(i, null, menu);
        return true;
    }

    public void y0(View view, Bundle bundle) {
        ((osc) this.G).onViewInflated(this.H, bundle);
    }

    public void z0() {
        View view = this.I;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).P();
        }
    }
}
