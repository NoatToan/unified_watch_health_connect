package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import defpackage.cqi;
import defpackage.lwq;
import defpackage.mwq;
import defpackage.nd0;
import defpackage.nwq;
import defpackage.owq;
import defpackage.pwq;
import defpackage.qii;
import defpackage.wpo;
import defpackage.ws5;
import defpackage.z5j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class d extends ActionBar implements ActionBarOverlayLayout.d {
    public static final Interpolator F = new AccelerateInterpolator();
    public static final Interpolator G = new DecelerateInterpolator();
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1462b;
    public Activity c;
    public ActionBarOverlayLayout d;
    public ActionBarContainer e;
    public ws5 f;
    public ActionBarContextView g;
    public View h;
    public ScrollingTabContainerView i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f1463k;
    public boolean m;
    public C0008d n;
    public ActionMode o;
    public ActionMode.Callback p;
    public boolean q;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public mwq z;
    public ArrayList<e> j = new ArrayList<>();
    public int l = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<ActionBar.a> f1464r = new ArrayList<>();
    public int t = 0;
    public boolean u = true;
    public boolean y = true;
    public final nwq C = new a();
    public final nwq D = new b();
    public final pwq E = new c();

    public class a extends owq {
        public a() {
        }

        @Override // defpackage.nwq
        public void b(View view) {
            View view2;
            d dVar = d.this;
            if (dVar.u && (view2 = dVar.h) != null) {
                view2.setTranslationY(0.0f);
                d.this.e.setTranslationY(0.0f);
            }
            d.this.e.setVisibility(8);
            d.this.e.setTransitioning(false);
            d dVar2 = d.this;
            dVar2.z = null;
            dVar2.g();
            ActionBarOverlayLayout actionBarOverlayLayout = d.this.d;
            if (actionBarOverlayLayout != null) {
                androidx.core.view.c.n0(actionBarOverlayLayout);
            }
        }
    }

    public class b extends owq {
        public b() {
        }

        @Override // defpackage.nwq
        public void b(View view) {
            d dVar = d.this;
            dVar.z = null;
            dVar.e.requestLayout();
        }
    }

    public class c implements pwq {
        public c() {
        }

        @Override // defpackage.pwq
        public void a(View view) {
            ((View) d.this.e.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.d$d, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class C0008d extends ActionMode implements androidx.appcompat.view.menu.e.a {
        public final Context c;
        public final androidx.appcompat.view.menu.e d;
        public ActionMode.Callback e;
        public WeakReference<View> f;

        public C0008d(Context context, ActionMode.Callback callback) {
            this.c = context;
            this.e = callback;
            androidx.appcompat.view.menu.e eVarW = new androidx.appcompat.view.menu.e(context).W(1);
            this.d = eVarW;
            eVarW.V(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            ActionMode.Callback callback = this.e;
            if (callback != null) {
                return callback.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.e == null) {
                return;
            }
            k();
            d.this.g.l();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void c() {
            d dVar = d.this;
            if (dVar.n != this) {
                return;
            }
            if (d.checkShowingFlags(dVar.v, dVar.w, false)) {
                this.e.d(this);
            } else {
                d dVar2 = d.this;
                dVar2.o = this;
                dVar2.p = this.e;
            }
            this.e = null;
            d.this.animateToMode(false);
            d.this.g.g();
            d dVar3 = d.this;
            dVar3.d.setHideOnContentScrollEnabled(dVar3.B);
            d.this.n = null;
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
            return this.d;
        }

        @Override // androidx.appcompat.view.ActionMode
        public MenuInflater f() {
            return new wpo(this.c);
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence g() {
            return d.this.g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence i() {
            return d.this.g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void k() {
            if (d.this.n != this) {
                return;
            }
            this.d.h0();
            try {
                this.e.c(this, this.d);
            } finally {
                this.d.g0();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean l() {
            return d.this.g.j();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void m(View view) {
            d.this.g.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void n(int i) {
            o(d.this.f1461a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void o(CharSequence charSequence) {
            d.this.g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void q(int i) {
            r(d.this.f1461a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void r(CharSequence charSequence) {
            d.this.g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void s(boolean z) {
            super.s(z);
            d.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.d.h0();
            try {
                return this.e.a(this, this.d);
            } finally {
                this.d.g0();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class e extends ActionBar.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActionBar.d f1468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable f1469b;
        public CharSequence c;
        public CharSequence d;
        public int e = -1;
        public View f;

        public e() {
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public CharSequence a() {
            return this.d;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public View b() {
            return this.f;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public Drawable c() {
            return this.f1469b;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public int d() {
            return this.e;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public CharSequence e() {
            return this.c;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public void f() {
            d.this.selectTab(this);
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public ActionBar.c g(CharSequence charSequence) {
            this.c = charSequence;
            int i = this.e;
            if (i >= 0) {
                d.this.i.l(i);
            }
            return this;
        }

        public ActionBar.d h() {
            return this.f1468a;
        }

        public void i(int i) {
            this.e = i;
        }
    }

    public d(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        i(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    public static boolean checkShowingFlags(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void hideForActionMode() {
        if (this.x) {
            this.x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            updateVisibility(false);
        }
    }

    private void showForActionMode() {
        if (this.x) {
            return;
        }
        this.x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        updateVisibility(false);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.w) {
            this.w = false;
            updateVisibility(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(ActionBar.a aVar) {
        this.f1464r.add(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar) {
        addTab(cVar, this.j.isEmpty());
    }

    public void animateToMode(boolean z) {
        lwq lwqVarB;
        lwq lwqVarF;
        if (z) {
            showForActionMode();
        } else {
            hideForActionMode();
        }
        if (!j()) {
            if (z) {
                this.f.setVisibility(4);
                this.g.setVisibility(0);
                return;
            } else {
                this.f.setVisibility(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z) {
            lwqVarF = this.f.B(4, 100L);
            lwqVarB = this.g.f(0, 200L);
        } else {
            lwqVarB = this.f.B(0, 200L);
            lwqVarF = this.g.f(8, 100L);
        }
        mwq mwqVar = new mwq();
        mwqVar.d(lwqVarF, lwqVarB);
        mwqVar.h();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        if (this.w) {
            return;
        }
        this.w = true;
        updateVisibility(true);
    }

    public final void cleanupTabs() {
        if (this.f1463k != null) {
            selectTab(null);
        }
        this.j.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.i;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.j();
        }
        this.l = -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        ws5 ws5Var = this.f;
        if (ws5Var == null || !ws5Var.h()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    public final void configureTab(ActionBar.c cVar, int i) {
        e eVar = (e) cVar;
        if (eVar.h() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        eVar.i(i);
        this.j.add(i, eVar);
        int size = this.j.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.j.get(i).i(i);
            }
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        mwq mwqVar = this.z;
        if (mwqVar != null) {
            mwqVar.a();
            this.z = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.q) {
            return;
        }
        this.q = z;
        int size = this.f1464r.size();
        for (int i = 0; i < size; i++) {
            this.f1464r.get(i).a(z);
        }
    }

    public void doHide(boolean z) {
        View view;
        mwq mwqVar = this.z;
        if (mwqVar != null) {
            mwqVar.a();
        }
        if (this.t != 0 || (!this.A && !z)) {
            this.C.b(null);
            return;
        }
        this.e.setAlpha(1.0f);
        this.e.setTransitioning(true);
        mwq mwqVar2 = new mwq();
        float f = -this.e.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.e.getLocationInWindow(iArr);
            f -= iArr[1];
        }
        lwq lwqVarM = androidx.core.view.c.e(this.e).m(f);
        lwqVarM.k(this.E);
        mwqVar2.c(lwqVarM);
        if (this.u && (view = this.h) != null) {
            mwqVar2.c(androidx.core.view.c.e(view).m(f));
        }
        mwqVar2.f(F);
        mwqVar2.e(250L);
        mwqVar2.g(this.C);
        this.z = mwqVar2;
        mwqVar2.h();
    }

    public void doShow(boolean z) {
        View view;
        View view2;
        mwq mwqVar = this.z;
        if (mwqVar != null) {
            mwqVar.a();
        }
        this.e.setVisibility(0);
        if (this.t == 0 && (this.A || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.e.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.e.setTranslationY(f);
            mwq mwqVar2 = new mwq();
            lwq lwqVarM = androidx.core.view.c.e(this.e).m(0.0f);
            lwqVarM.k(this.E);
            mwqVar2.c(lwqVarM);
            if (this.u && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                mwqVar2.c(androidx.core.view.c.e(this.h).m(0.0f));
            }
            mwqVar2.f(G);
            mwqVar2.e(250L);
            mwqVar2.g(this.D);
            this.z = mwqVar2;
            mwqVar2.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.u && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            androidx.core.view.c.n0(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(int i) {
        this.t = i;
    }

    public final void ensureTabsExist() {
        if (this.i != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f1461a);
        if (this.s) {
            scrollingTabContainerView.setVisibility(0);
            this.f.E(scrollingTabContainerView);
        } else {
            if (getNavigationMode() == 2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    androidx.core.view.c.n0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.e.setTabContainer(scrollingTabContainerView);
        }
        this.i = scrollingTabContainerView;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(boolean z) {
        this.u = z;
    }

    public void g() {
        ActionMode.Callback callback = this.p;
        if (callback != null) {
            callback.d(this.o);
            this.o = null;
            this.p = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public View getCustomView() {
        return this.f.t();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.f.v();
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return androidx.core.view.c.v(this.e);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.e.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
        return this.d.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        int iL = this.f.l();
        if (iL == 1) {
            return this.f.q();
        }
        if (iL != 2) {
            return 0;
        }
        return this.j.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return this.f.l();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        e eVar;
        int iL = this.f.l();
        if (iL == 1) {
            return this.f.n();
        }
        if (iL == 2 && (eVar = this.f1463k) != null) {
            return eVar.d();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c getSelectedTab() {
        return this.f1463k;
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getSubtitle() {
        return this.f.J();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c getTabAt(int i) {
        return this.j.get(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return this.j.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context getThemedContext() {
        if (this.f1462b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1461a.getTheme().resolveAttribute(qii.h, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1462b = new ContextThemeWrapper(this.f1461a, i);
            } else {
                this.f1462b = this.f1461a;
            }
        }
        return this.f1462b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getTitle() {
        return this.f.getTitle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ws5 h(View view) {
        if (view instanceof ws5) {
            return (ws5) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : AbstractJsonLexerKt.NULL);
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        if (this.v) {
            return;
        }
        this.v = true;
        updateVisibility(false);
    }

    public final void i(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(cqi.q);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = h(view.findViewById(cqi.f14619a));
        this.g = (ActionBarContextView) view.findViewById(cqi.f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(cqi.c);
        this.e = actionBarContainer;
        ws5 ws5Var = this.f;
        if (ws5Var == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1461a = ws5Var.getContext();
        boolean z = (this.f.v() & 4) != 0;
        if (z) {
            this.m = true;
        }
        nd0 nd0VarB = nd0.b(this.f1461a);
        setHomeButtonEnabled(nd0VarB.a() || z);
        setHasEmbeddedTabs(nd0VarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f1461a.obtainStyledAttributes(null, z5j.f40915a, qii.c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(z5j.f40917k, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5j.i, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
        return this.d.q();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        int height = getHeight();
        return this.y && (height == 0 || getHideOffset() < height);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        ws5 ws5Var = this.f;
        return ws5Var != null && ws5Var.i();
    }

    public final boolean j() {
        return androidx.core.view.c.U(this.e);
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c newTab() {
        return new e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(Configuration configuration) {
        setHasEmbeddedTabs(nd0.b(this.f1461a).g());
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu menuE;
        C0008d c0008d = this.n;
        if (c0008d == null || (menuE = c0008d.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        cleanupTabs();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(ActionBar.a aVar) {
        this.f1464r.remove(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(ActionBar.c cVar) {
        removeTabAt(cVar.d());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i) {
        if (this.i == null) {
            return;
        }
        e eVar = this.f1463k;
        int iD = eVar != null ? eVar.d() : this.l;
        this.i.k(i);
        e eVarRemove = this.j.remove(i);
        if (eVarRemove != null) {
            eVarRemove.i(-1);
        }
        int size = this.j.size();
        for (int i2 = i; i2 < size; i2++) {
            this.j.get(i2).i(i2);
        }
        if (iD == i) {
            selectTab(this.j.isEmpty() ? null : this.j.get(Math.max(0, i - 1)));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean requestFocus() {
        ViewGroup viewGroupC = this.f.C();
        if (viewGroupC == null || viewGroupC.hasFocus()) {
            return false;
        }
        viewGroupC.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(ActionBar.c cVar) {
        if (getNavigationMode() != 2) {
            this.l = cVar != null ? cVar.d() : -1;
            return;
        }
        k kVarR = (!(this.c instanceof FragmentActivity) || this.f.C().isInEditMode()) ? null : ((FragmentActivity) this.c).getSupportFragmentManager().o().r();
        e eVar = this.f1463k;
        if (eVar != cVar) {
            this.i.setTabSelected(cVar != null ? cVar.d() : -1);
            e eVar2 = this.f1463k;
            if (eVar2 != null) {
                eVar2.h().c(this.f1463k, kVarR);
            }
            e eVar3 = (e) cVar;
            this.f1463k = eVar3;
            if (eVar3 != null) {
                eVar3.h().a(this.f1463k, kVarR);
            }
        } else if (eVar != null) {
            eVar.h().b(this.f1463k, kVarR);
            this.i.c(cVar.d());
        }
        if (kVarR == null || kVarR.u()) {
            return;
        }
        kVarR.l();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(Drawable drawable) {
        this.e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, this.f.C(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.m) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.m = true;
        }
        this.f.j(i);
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
        androidx.core.view.c.z0(this.e, f);
    }

    public final void setHasEmbeddedTabs(boolean z) {
        this.s = z;
        if (z) {
            this.e.setTabContainer(null);
            this.f.E(this.i);
        } else {
            this.f.E(null);
            this.e.setTabContainer(this.i);
        }
        boolean z2 = getNavigationMode() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.i;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    androidx.core.view.c.n0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f.r(!this.s && z2);
        this.d.setHasNonEmbeddedTabs(!this.s && z2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOffset(int i) {
        if (i != 0 && !this.d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.d.setActionBarHideOffset(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean z) {
        if (z && !this.d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f.k(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f.x(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
        this.f.D(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i) {
        this.f.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.b bVar) {
        this.f.I(spinnerAdapter, new androidx.appcompat.app.b(bVar));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i) {
        this.f.F(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int iL = this.f.l();
        if (iL == 2) {
            this.l = getSelectedNavigationIndex();
            selectTab(null);
            this.i.setVisibility(8);
        }
        if (iL != i && !this.s && (actionBarOverlayLayout = this.d) != null) {
            androidx.core.view.c.n0(actionBarOverlayLayout);
        }
        this.f.m(i);
        boolean z = false;
        if (i == 2) {
            ensureTabsExist();
            this.i.setVisibility(0);
            int i2 = this.l;
            if (i2 != -1) {
                setSelectedNavigationItem(i2);
                this.l = -1;
            }
        }
        this.f.r(i == 2 && !this.s);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.d;
        if (i == 2 && !this.s) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i) {
        int iL = this.f.l();
        if (iL == 1) {
            this.f.z(i);
        } else {
            if (iL != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            selectTab(this.j.get(i));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
        mwq mwqVar;
        this.A = z;
        if (z || (mwqVar = this.z) == null) {
            return;
        }
        mwqVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.e.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i) {
        setSubtitle(this.f1461a.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i) {
        setTitle(this.f1461a.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        if (this.v) {
            this.v = false;
            updateVisibility(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionMode startActionMode(ActionMode.Callback callback) {
        C0008d c0008d = this.n;
        if (c0008d != null) {
            c0008d.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        C0008d c0008d2 = new C0008d(this.g.getContext(), callback);
        if (!c0008d2.t()) {
            return null;
        }
        this.n = c0008d2;
        c0008d2.k();
        this.g.h(c0008d2);
        animateToMode(true);
        return c0008d2;
    }

    public final void updateVisibility(boolean z) {
        if (checkShowingFlags(this.v, this.w, this.x)) {
            if (this.y) {
                return;
            }
            this.y = true;
            doShow(z);
            return;
        }
        if (this.y) {
            this.y = false;
            doHide(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, int i) {
        addTab(cVar, i, this.j.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int i) {
        this.f.o(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int i) {
        this.f.G(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(Drawable drawable) {
        this.f.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(Drawable drawable) {
        this.f.u(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(CharSequence charSequence) {
        this.f.y(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, boolean z) {
        ensureTabsExist();
        this.i.b(cVar, z);
        configureTab(cVar, this.j.size());
        if (z) {
            selectTab(cVar);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i, int i2) {
        int iV = this.f.v();
        if ((i2 & 4) != 0) {
            this.m = true;
        }
        this.f.j((i & i2) | ((~i2) & iV));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view) {
        this.f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, int i, boolean z) {
        ensureTabsExist();
        this.i.a(cVar, i, z);
        configureTab(cVar, i);
        if (z) {
            selectTab(cVar);
        }
    }

    public d(Dialog dialog) {
        i(dialog.getWindow().getDecorView());
    }
}
