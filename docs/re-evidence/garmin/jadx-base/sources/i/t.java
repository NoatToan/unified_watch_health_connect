package i;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b0;
import androidx.core.view.e1;
import androidx.core.view.g1;
import androidx.core.view.i1;
import androidx.core.view.j1;
import androidx.core.view.s0;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import com.google.maps.android.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class t extends i.a implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator D = new AccelerateInterpolator();
    public static final DecelerateInterpolator E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f86669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f86670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f86671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f86672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f86673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f86674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f86675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f86676h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f86678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f86680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f86681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m.b.a f86682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f86683o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f86685q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f86688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f86689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f86690v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m.h f86692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f86693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f86694z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<e> f86677i = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<i.a.b> f86684p = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f86686r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f86687s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f86691w = true;
    public final a A = new a();
    public final b B = new b();
    public final c C = new c();

    public class a extends i1 {
        public a() {
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void onAnimationEnd() {
            View view2;
            t tVar = t.this;
            if (tVar.f86687s && (view2 = tVar.f86676h) != null) {
                view2.setTranslationY(0.0f);
                tVar.f86673e.setTranslationY(0.0f);
            }
            tVar.f86673e.setVisibility(8);
            tVar.f86673e.setTransitioning(false);
            tVar.f86692x = null;
            m.b.a aVar = tVar.f86682n;
            if (aVar != null) {
                aVar.a(tVar.f86681m);
                tVar.f86681m = null;
                tVar.f86682n = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = tVar.f86672d;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    public class b extends i1 {
        public b() {
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void onAnimationEnd() {
            t tVar = t.this;
            tVar.f86692x = null;
            tVar.f86673e.requestLayout();
        }
    }

    public class c implements j1 {
        public c() {
        }
    }

    public class d extends m.b implements androidx.appcompat.view.menu.h.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f86698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f86699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m.b.a f86700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference<View> f86701f;

        public d(Context context, m.b.a aVar) {
            this.f86698c = context;
            this.f86700e = aVar;
            androidx.appcompat.view.menu.h defaultShowAsAction = new androidx.appcompat.view.menu.h(context).setDefaultShowAsAction(1);
            this.f86699d = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // m.b
        public final void a() {
            t tVar = t.this;
            if (tVar.f86680l != this) {
                return;
            }
            boolean z14 = tVar.f86688t;
            boolean z15 = tVar.f86689u;
            if (z14 || z15) {
                tVar.f86681m = this;
                tVar.f86682n = this.f86700e;
            } else {
                this.f86700e.a(this);
            }
            this.f86700e = null;
            tVar.G(false);
            ActionBarContextView actionBarContextView = tVar.f86675g;
            if (actionBarContextView.f4859k == null) {
                actionBarContextView.h();
            }
            tVar.f86672d.setHideOnContentScrollEnabled(tVar.f86694z);
            tVar.f86680l = null;
        }

        @Override // m.b
        public final View b() {
            WeakReference<View> weakReference = this.f86701f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // m.b
        public final androidx.appcompat.view.menu.h c() {
            return this.f86699d;
        }

        @Override // m.b
        public final MenuInflater d() {
            return new m.g(this.f86698c);
        }

        @Override // m.b
        public final CharSequence e() {
            return t.this.f86675g.getSubtitle();
        }

        @Override // m.b
        public final CharSequence f() {
            return t.this.f86675g.getTitle();
        }

        @Override // m.b
        public final void g() {
            if (t.this.f86680l != this) {
                return;
            }
            androidx.appcompat.view.menu.h hVar = this.f86699d;
            hVar.stopDispatchingItemsChanged();
            try {
                this.f86700e.b(this, hVar);
            } finally {
                hVar.startDispatchingItemsChanged();
            }
        }

        @Override // m.b
        public final boolean h() {
            return t.this.f86675g.f4867t;
        }

        @Override // m.b
        public final void i(View view2) {
            t.this.f86675g.setCustomView(view2);
            this.f86701f = new WeakReference<>(view2);
        }

        @Override // m.b
        public final void j(int i14) {
            k(t.this.f86669a.getResources().getString(i14));
        }

        @Override // m.b
        public final void k(CharSequence charSequence) {
            t.this.f86675g.setSubtitle(charSequence);
        }

        @Override // m.b
        public final void l(int i14) {
            m(t.this.f86669a.getResources().getString(i14));
        }

        @Override // m.b
        public final void m(CharSequence charSequence) {
            t.this.f86675g.setTitle(charSequence);
        }

        @Override // m.b
        public final void n(boolean z14) {
            this.f115423b = z14;
            t.this.f86675g.setTitleOptional(z14);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            m.b.a aVar = this.f86700e;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
            if (this.f86700e == null) {
                return;
            }
            g();
            androidx.appcompat.widget.c cVar = t.this.f86675g.f5027d;
            if (cVar != null) {
                cVar.g();
            }
        }
    }

    public class e extends i.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86703a = -1;

        public e() {
        }

        @Override // i.a.d
        public final int a() {
            return this.f86703a;
        }

        @Override // i.a.d
        public final void b() {
            t.this.I(this);
        }
    }

    public t(Activity activity, boolean z14) {
        this.f86671c = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z14) {
            return;
        }
        this.f86676h = decorView.findViewById(R.id.content);
    }

    @Override // i.a
    public final void A(int i14) {
        int i15 = this.f86674f.i();
        if (i15 == 1) {
            this.f86674f.x(i14);
        } else if (i15 == 2) {
            I(this.f86677i.get(i14));
        } else {
            vb.h.z("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    @Override // i.a
    public final void B(boolean z14) {
        m.h hVar;
        this.f86693y = z14;
        if (z14 || (hVar = this.f86692x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // i.a
    public final void C(CharSequence charSequence) {
        this.f86674f.setTitle(charSequence);
    }

    @Override // i.a
    public final void D(CharSequence charSequence) {
        this.f86674f.setWindowTitle(charSequence);
    }

    @Override // i.a
    public final void E() {
        if (this.f86688t) {
            this.f86688t = false;
            K(false);
        }
    }

    @Override // i.a
    public final m.b F(f.e eVar) {
        d dVar = this.f86680l;
        if (dVar != null) {
            dVar.a();
        }
        this.f86672d.setHideOnContentScrollEnabled(false);
        this.f86675g.h();
        d dVar2 = new d(this.f86675g.getContext(), eVar);
        androidx.appcompat.view.menu.h hVar = dVar2.f86699d;
        hVar.stopDispatchingItemsChanged();
        try {
            boolean zC = dVar2.f86700e.c(dVar2, hVar);
            hVar.startDispatchingItemsChanged();
            if (!zC) {
                return null;
            }
            this.f86680l = dVar2;
            dVar2.g();
            this.f86675g.f(dVar2);
            G(true);
            return dVar2;
        } catch (Throwable th3) {
            hVar.startDispatchingItemsChanged();
            throw th3;
        }
    }

    public final void G(boolean z14) {
        g1 g1VarQ;
        g1 g1VarE;
        boolean z15 = this.f86690v;
        if (z14) {
            if (!z15) {
                this.f86690v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f86672d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                K(false);
            }
        } else if (z15) {
            this.f86690v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f86672d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            K(false);
        }
        boolean zIsLaidOut = this.f86673e.isLaidOut();
        b0 b0Var = this.f86674f;
        if (!zIsLaidOut) {
            if (z14) {
                b0Var.v(4);
                this.f86675g.setVisibility(0);
                return;
            } else {
                b0Var.v(0);
                this.f86675g.setVisibility(8);
                return;
            }
        }
        if (z14) {
            g1VarE = b0Var.q(4, 100L);
            g1VarQ = this.f86675g.e(0, 200L);
        } else {
            g1VarQ = b0Var.q(0, 200L);
            g1VarE = this.f86675g.e(8, 100L);
        }
        m.h hVar = new m.h();
        ArrayList<g1> arrayList = hVar.f115477a;
        arrayList.add(g1VarE);
        View view2 = g1VarE.f6450a.get();
        long duration = view2 != null ? view2.animate().getDuration() : 0L;
        View view3 = g1VarQ.f6450a.get();
        if (view3 != null) {
            view3.animate().setStartDelay(duration);
        }
        arrayList.add(g1VarQ);
        hVar.b();
    }

    public final void H(View view2) {
        b0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.decor_content_parent);
        this.f86672d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.action_bar);
        if (callbackFindViewById instanceof b0) {
            wrapper = (b0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : BuildConfig.TRAVIS));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f86674f = wrapper;
        this.f86675g = (ActionBarContextView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.action_bar_container);
        this.f86673e = actionBarContainer;
        b0 b0Var = this.f86674f;
        if (b0Var == null || this.f86675g == null || actionBarContainer == null) {
            vb.h.z(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        this.f86669a = b0Var.getContext();
        boolean z14 = (this.f86674f.n() & 4) != 0;
        if (z14) {
            this.f86679k = true;
        }
        Context context = m.a.a(this.f86669a).f115421a;
        x(context.getApplicationInfo().targetSdkVersion < 14 || z14);
        J(context.getResources().getBoolean(com.garmin.android.apps.connectmobile.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f86669a.obtainStyledAttributes(null, h.a.f80421a, com.garmin.android.apps.connectmobile.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f86672d;
            if (!actionBarOverlayLayout2.f4876g) {
                vb.h.z("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f86694z = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f86673e;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void I(i.a.d dVar) {
        androidx.fragment.app.a aVar;
        if (this.f86674f.i() != 2) {
            if (dVar != null) {
                dVar.a();
                return;
            }
            return;
        }
        Activity activity = this.f86671c;
        if (!(activity instanceof androidx.fragment.app.m) || this.f86674f.r().isInEditMode()) {
            aVar = null;
        } else {
            v supportFragmentManager = ((androidx.fragment.app.m) activity).getSupportFragmentManager();
            supportFragmentManager.getClass();
            aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.i();
        }
        e eVar = this.f86678j;
        if (eVar != dVar) {
            if (dVar != null) {
                dVar.a();
            }
            throw null;
        }
        if (eVar != null) {
            throw null;
        }
        if (aVar == null || aVar.f7235c.isEmpty()) {
            return;
        }
        aVar.e();
    }

    public final void J(boolean z14) {
        this.f86685q = z14;
        if (z14) {
            this.f86673e.setTabContainer(null);
            this.f86674f.y(null);
        } else {
            this.f86674f.y(null);
            this.f86673e.setTabContainer(null);
        }
        boolean z15 = this.f86674f.i() == 2;
        this.f86674f.k(!this.f86685q && z15);
        this.f86672d.setHasNonEmbeddedTabs(!this.f86685q && z15);
    }

    public final void K(boolean z14) {
        int i14 = 0;
        boolean z15 = this.f86690v || !(this.f86688t || this.f86689u);
        boolean z16 = this.f86691w;
        c cVar = this.C;
        View view2 = this.f86676h;
        if (!z15) {
            if (z16) {
                this.f86691w = false;
                m.h hVar = this.f86692x;
                if (hVar != null) {
                    hVar.a();
                }
                int i15 = this.f86686r;
                a aVar = this.A;
                if (i15 != 0 || (!this.f86693y && !z14)) {
                    aVar.onAnimationEnd();
                    return;
                }
                this.f86673e.setAlpha(1.0f);
                this.f86673e.setTransitioning(true);
                m.h hVar2 = new m.h();
                float f14 = -this.f86673e.getHeight();
                if (z14) {
                    int[] iArr = {0, 0};
                    this.f86673e.getLocationInWindow(iArr);
                    f14 -= iArr[1];
                }
                g1 g1VarC = s0.c(this.f86673e);
                g1VarC.e(f14);
                View view3 = g1VarC.f6450a.get();
                if (view3 != null) {
                    view3.animate().setUpdateListener(cVar != null ? new e1(i14, cVar, view3) : null);
                }
                boolean z17 = hVar2.f115481e;
                ArrayList<g1> arrayList = hVar2.f115477a;
                if (!z17) {
                    arrayList.add(g1VarC);
                }
                if (this.f86687s && view2 != null) {
                    g1 g1VarC2 = s0.c(view2);
                    g1VarC2.e(f14);
                    if (!hVar2.f115481e) {
                        arrayList.add(g1VarC2);
                    }
                }
                boolean z18 = hVar2.f115481e;
                if (!z18) {
                    hVar2.f115479c = D;
                }
                if (!z18) {
                    hVar2.f115478b = 250L;
                }
                if (!z18) {
                    hVar2.f115480d = aVar;
                }
                this.f86692x = hVar2;
                hVar2.b();
                return;
            }
            return;
        }
        if (z16) {
            return;
        }
        this.f86691w = true;
        m.h hVar3 = this.f86692x;
        if (hVar3 != null) {
            hVar3.a();
        }
        this.f86673e.setVisibility(0);
        int i16 = this.f86686r;
        b bVar = this.B;
        if (i16 == 0 && (this.f86693y || z14)) {
            this.f86673e.setTranslationY(0.0f);
            float f15 = -this.f86673e.getHeight();
            if (z14) {
                int[] iArr2 = {0, 0};
                this.f86673e.getLocationInWindow(iArr2);
                f15 -= iArr2[1];
            }
            this.f86673e.setTranslationY(f15);
            m.h hVar4 = new m.h();
            g1 g1VarC3 = s0.c(this.f86673e);
            g1VarC3.e(0.0f);
            View view4 = g1VarC3.f6450a.get();
            if (view4 != null) {
                view4.animate().setUpdateListener(cVar != null ? new e1(i14, cVar, view4) : null);
            }
            boolean z19 = hVar4.f115481e;
            ArrayList<g1> arrayList2 = hVar4.f115477a;
            if (!z19) {
                arrayList2.add(g1VarC3);
            }
            if (this.f86687s && view2 != null) {
                view2.setTranslationY(f15);
                g1 g1VarC4 = s0.c(view2);
                g1VarC4.e(0.0f);
                if (!hVar4.f115481e) {
                    arrayList2.add(g1VarC4);
                }
            }
            boolean z24 = hVar4.f115481e;
            if (!z24) {
                hVar4.f115479c = E;
            }
            if (!z24) {
                hVar4.f115478b = 250L;
            }
            if (!z24) {
                hVar4.f115480d = bVar;
            }
            this.f86692x = hVar4;
            hVar4.b();
        } else {
            this.f86673e.setAlpha(1.0f);
            this.f86673e.setTranslationY(0.0f);
            if (this.f86687s && view2 != null) {
                view2.setTranslationY(0.0f);
            }
            bVar.onAnimationEnd();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f86672d;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // i.a
    public final boolean b() {
        b0 b0Var = this.f86674f;
        if (b0Var == null || !b0Var.t()) {
            return false;
        }
        this.f86674f.collapseActionView();
        return true;
    }

    @Override // i.a
    public final void c(boolean z14) {
        if (z14 == this.f86683o) {
            return;
        }
        this.f86683o = z14;
        ArrayList<i.a.b> arrayList = this.f86684p;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.get(i14).a();
        }
    }

    @Override // i.a
    public final int d() {
        return this.f86674f.n();
    }

    @Override // i.a
    public final Context e() {
        if (this.f86670b == null) {
            TypedValue typedValue = new TypedValue();
            this.f86669a.getTheme().resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarWidgetTheme, typedValue, true);
            int i14 = typedValue.resourceId;
            if (i14 != 0) {
                this.f86670b = new ContextThemeWrapper(this.f86669a, i14);
            } else {
                this.f86670b = this.f86669a;
            }
        }
        return this.f86670b;
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f86674f.getTitle();
    }

    @Override // i.a
    public final void g() {
        if (this.f86688t) {
            return;
        }
        this.f86688t = true;
        K(false);
    }

    @Override // i.a
    public final boolean i() {
        int height = this.f86673e.getHeight();
        if (this.f86691w) {
            return height == 0 || this.f86672d.getActionBarHideOffset() < height;
        }
        return false;
    }

    @Override // i.a
    public final void j() {
        J(m.a.a(this.f86669a).f115421a.getResources().getBoolean(com.garmin.android.apps.connectmobile.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // i.a
    public final boolean l(int i14, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        d dVar = this.f86680l;
        if (dVar == null || (hVar = dVar.f86699d) == null) {
            return false;
        }
        hVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return hVar.performShortcut(i14, keyEvent, 0);
    }

    @Override // i.a
    public final void o(ColorDrawable colorDrawable) {
        this.f86673e.setPrimaryBackground(colorDrawable);
    }

    @Override // i.a
    public final void p(boolean z14) {
        if (this.f86679k) {
            return;
        }
        q(z14);
    }

    @Override // i.a
    public final void q(boolean z14) {
        int i14 = z14 ? 4 : 0;
        int iN = this.f86674f.n();
        this.f86679k = true;
        this.f86674f.h((i14 & 4) | (iN & (-5)));
    }

    @Override // i.a
    public final void r(int i14) {
        if ((i14 & 4) != 0) {
            this.f86679k = true;
        }
        this.f86674f.h(i14);
    }

    @Override // i.a
    public final void s(boolean z14) {
        this.f86674f.h(((z14 ? 8 : 0) & 8) | (this.f86674f.n() & (-9)));
    }

    @Override // i.a
    public final void t() {
        this.f86674f.w(null);
    }

    @Override // i.a
    public final void u(int i14) {
        this.f86674f.j(i14);
    }

    @Override // i.a
    public final void v(int i14) {
        this.f86674f.s(i14);
    }

    @Override // i.a
    public final void w(Drawable drawable) {
        this.f86674f.p(drawable);
    }

    @Override // i.a
    public final void x(boolean z14) {
        this.f86674f.getClass();
    }

    @Override // i.a
    public final void y(SpinnerAdapter spinnerAdapter, ConnectIQAppStoreActivity connectIQAppStoreActivity) {
        this.f86674f.m(spinnerAdapter, new p(connectIQAppStoreActivity));
    }

    @Override // i.a
    public final void z() {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int i14 = this.f86674f.i();
        if (i14 == 2) {
            if (this.f86674f.i() == 1) {
                this.f86674f.u();
            }
            I(null);
            throw null;
        }
        if (i14 != 1 && !this.f86685q && (actionBarOverlayLayout = this.f86672d) != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            actionBarOverlayLayout.requestApplyInsets();
        }
        this.f86674f.o();
        this.f86674f.k(false);
        this.f86672d.setHasNonEmbeddedTabs(false);
    }

    public t(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }

    public t(View view2) {
        H(view2);
    }
}
