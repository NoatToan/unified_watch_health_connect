package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.List;
import miuix.appcompat.app.AppCompatActivity;
import miuix.appcompat.app.floatingactivity.FloatingActivitySwitcher;
import miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingActivitySwitcher;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarImpl;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.responsive.page.manager.BaseResponseStateManager;

/* JADX INFO: loaded from: classes3.dex */
public class fg1 extends fd0 implements oxc<Activity> {
    public ActionBarOverlayLayout F;
    public ActionBarContainer G;
    public ViewGroup H;
    public LayoutInflater I;
    public fh0 J;
    public j8h K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Boolean O;
    public int P;
    public s72 Q;
    public ViewGroup R;
    public final String S;
    public boolean T;
    public boolean U;
    public BaseResponseStateManager V;
    public CharSequence W;
    public Window X;
    public d Y;
    public Runnable Z;
    public final Runnable a0;

    public class a extends BaseResponseStateManager {
        public a(oxc oxcVar) {
            super(oxcVar);
        }

        @Override // defpackage.be2
        public Context c() {
            return fg1.this.f17663a;
        }
    }

    public class b extends p7h {
        public b(boolean z) {
            super(z);
        }

        @Override // defpackage.p7h
        public void handleOnBackPressed() {
            fg1.this.Q.j();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Menu, miuix.appcompat.internal.view.menu.d] */
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
            ?? H = fg1.this.h();
            if ((fg1.this.y() || fg1.this.U) && fg1.this.J.onCreatePanelMenu(0, H) && fg1.this.J.onPreparePanel(0, null, H)) {
                fg1.this.Z(H);
            } else {
                fg1.this.Z(null);
            }
        }
    }

    public class d extends skr {
        public d(Window.Callback callback) {
            super(callback);
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            if (ebm.h(fg1.this.f17663a.getSupportFragmentManager(), motionEvent)) {
                return true;
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (ebm.j(fg1.this.f17663a.getSupportFragmentManager(), keyEvent)) {
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (ebm.f(fg1.this.f17663a.getSupportFragmentManager(), keyEvent)) {
                return true;
            }
            return super.dispatchKeyShortcutEvent(keyEvent);
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (ebm.o(fg1.this.f17663a.getSupportFragmentManager(), motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            if (ebm.k(fg1.this.f17663a.getSupportFragmentManager(), motionEvent)) {
                return true;
            }
            return super.dispatchTrackballEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            ebm.g(fg1.this.f17663a.getSupportFragmentManager(), list, menu, i);
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    public fg1(AppCompatActivity appCompatActivity, fh0 fh0Var, j8h j8hVar) {
        super(appCompatActivity);
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = null;
        this.R = null;
        this.T = false;
        this.a0 = new c();
        this.S = String.valueOf(SystemClock.elapsedRealtimeNanos());
        this.J = fh0Var;
        this.K = j8hVar;
    }

    public static boolean M0(Context context) {
        return hm1.d(context, zhi.b0, true);
    }

    @Override // defpackage.oxc
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public Activity getResponsiveSubject() {
        return this.f17663a;
    }

    @Override // defpackage.fd0
    public void B(final Configuration configuration) {
        int iA;
        AppCompatActivity appCompatActivity = this.f17663a;
        tc8.x(appCompatActivity, appCompatActivity.getWindowInfo(), configuration, false);
        this.Z = new Runnable() { // from class: eg1
            @Override // java.lang.Runnable
            public final void run() {
                this.f16615a.N0(configuration);
            }
        };
        if (this.f17663a.getWindow() != null) {
            this.f17663a.getWindow().getDecorView().post(this.Z);
        }
        super.B(configuration);
        if (!this.y && this.w != (iA = p56.a(this.f17663a))) {
            this.w = iA;
            x();
            ActionBarOverlayLayout actionBarOverlayLayout = this.F;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setExtraPaddingPolicy(this.z);
            }
        }
        this.J.onConfigurationChanged(configuration);
        if (A()) {
            c0();
        }
    }

    public void B0(boolean z) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.v(z);
        }
    }

    @Override // defpackage.fd0
    public void C(Bundle bundle) {
        this.f17663a.checkThemeLegality();
        if (!mi1.f26203a) {
            mi1.f26203a = true;
            mi1.b(getThemedContext().getApplicationContext());
        }
        boolean zD = hm1.d(this.f17663a, zhi.f0, hm1.j(this.f17663a, zhi.e0, 0) != 0);
        if (this.A) {
            zD = true;
        }
        boolean zD2 = hm1.d(this.f17663a, zhi.g0, this.B);
        if (this.B) {
            zD2 = true;
        }
        boolean zD3 = this.C ? true : hm1.d(this.f17663a, zhi.d0, this.C);
        S(zD);
        T(zD2);
        V(zD3);
        this.J.onCreate(bundle);
        G0();
        F0(this.M, bundle);
    }

    public void C0() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fd0
    public boolean D(miuix.appcompat.internal.view.menu.d dVar) {
        return this.f17663a.onCreateOptionsMenu(dVar);
    }

    public void D0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.e();
        }
    }

    @Override // defpackage.fd0
    public void E() {
        super.E();
        AppCompatActivity appCompatActivity = this.f17663a;
        if (appCompatActivity == null || appCompatActivity.getWindow() == null) {
            return;
        }
        View decorView = this.f17663a.getWindow().getDecorView();
        decorView.removeCallbacks(this.a0);
        Runnable runnable = this.Z;
        if (runnable != null) {
            decorView.removeCallbacks(runnable);
        }
    }

    public void E0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.f();
        }
    }

    @Override // defpackage.fd0
    public boolean F(int i, MenuItem menuItem) {
        if (this.J.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0 && menuItem.getItemId() == 16908332 && getActionBar() != null && (getActionBar().getDisplayOptions() & 4) != 0) {
            if (!(this.f17663a.getParent() == null ? this.f17663a.onNavigateUp() : this.f17663a.getParent().onNavigateUpFromChild(this.f17663a))) {
                this.f17663a.finish();
            }
        }
        return false;
    }

    public void F0(boolean z, Bundle bundle) {
        if (z) {
            Intent intent = this.f17663a.getIntent();
            if (intent == null || !MultiAppFloatingActivitySwitcher.O(intent)) {
                FloatingActivitySwitcher.w(this.f17663a, bundle);
            } else {
                MultiAppFloatingActivitySwitcher.I(this.f17663a, intent, bundle);
            }
        }
    }

    @Override // defpackage.fd0
    public void G() {
        this.J.b();
        ActionBarImpl actionBarImpl = (ActionBarImpl) getActionBar();
        if (actionBarImpl != null) {
            actionBarImpl.setShowHideAnimationEnabled(true);
        }
    }

    public final void G0() {
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (this.e) {
            return;
        }
        p0();
        this.e = true;
        Window window = this.f17663a.getWindow();
        this.I = window.getLayoutInflater();
        TypedArray typedArrayObtainStyledAttributes = this.f17663a.obtainStyledAttributes(g5j.m3);
        if (typedArrayObtainStyledAttributes.getBoolean(g5j.s3, this.L)) {
            this.V = new a(this);
        }
        if (typedArrayObtainStyledAttributes.getInt(g5j.E3, 0) == 1) {
            this.f17663a.getWindow().setGravity(80);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(g5j.t3)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a miui theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g5j.t3, false)) {
            O(8);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g5j.u3, false)) {
            O(9);
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(g5j.r3, false);
        this.N = typedArrayObtainStyledAttributes.getBoolean(g5j.C3, false);
        a0(typedArrayObtainStyledAttributes.getInt(g5j.K3, 0));
        this.P = this.f17663a.getResources().getConfiguration().uiMode;
        H0(window);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.F;
        if (actionBarOverlayLayout2 != null) {
            actionBarOverlayLayout2.setCallback(this.f17663a);
            this.F.setContentInsetStateCallback(this.f17663a);
            this.F.j(this.f17663a);
            this.F.setTranslucentStatus(s());
        }
        if (this.h && (actionBarOverlayLayout = this.F) != null) {
            this.G = (ActionBarContainer) actionBarOverlayLayout.findViewById(vsi.d);
            this.F.setOverlayMode(this.i);
            ActionBarView actionBarView = (ActionBarView) this.F.findViewById(vsi.f37187a);
            this.f17664b = actionBarView;
            actionBarView.setLifecycleOwner(q());
            this.f17664b.setWindowCallback(this.f17663a);
            if (this.g) {
                this.f17664b.initIndeterminateProgress();
            }
            if (y()) {
                this.f17664b.setEndActionMenuEnable(true);
            }
            if (this.f17664b.getCustomNavigationView() != null) {
                ActionBarView actionBarView2 = this.f17664b;
                actionBarView2.setDisplayOptions(actionBarView2.getDisplayOptions() | 16);
            }
            boolean zEquals = "splitActionBarWhenNarrow".equals(t());
            if (zEquals) {
                this.U = this.f17663a.getResources().getBoolean(sii.c);
            } else {
                this.U = typedArrayObtainStyledAttributes.getBoolean(g5j.J3, false);
            }
            if (this.U) {
                g(true, zEquals, this.F);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(g5j.p3, false)) {
                R(true, typedArrayObtainStyledAttributes.getBoolean(g5j.q3, false), false);
            } else if (this.f17663a.getWindow() != null) {
                this.f17663a.getWindow().getDecorView().post(this.a0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fd0
    public boolean H(miuix.appcompat.internal.view.menu.d dVar) {
        return this.f17663a.onPrepareOptionsMenu(dVar);
    }

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
    public final void H0(Window window) {
        ViewGroup viewGroupK;
        this.Q = this.M ? uy9.a(this.f17663a) : null;
        this.R = null;
        View viewInflate = View.inflate(this.f17663a, x0(window), null);
        View view = viewInflate;
        if (this.Q != null) {
            boolean zL1 = l1();
            this.N = zL1;
            this.Q.n(zL1);
            viewGroupK = this.Q.k(viewInflate, this.N);
            this.R = viewGroupK;
            r1(this.N);
            if (this.Q.q()) {
                view = viewGroupK;
                this.f17663a.getOnBackPressedDispatcher().b(this.f17663a, new b(true));
                view = viewGroupK;
            }
        }
        view = viewGroupK;
        if (!this.y) {
            x();
        }
        View viewFindViewById = view.findViewById(vsi.j);
        if (viewFindViewById instanceof ActionBarOverlayLayout) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewFindViewById;
            this.F = actionBarOverlayLayout;
            actionBarOverlayLayout.setLifecycleOwner(q());
            this.F.setExtraHorizontalPaddingEnable(this.A);
            this.F.setExtraHorizontalPaddingInitEnable(this.B);
            this.F.setExtraPaddingApplyToContentEnable(this.C);
            this.F.setExtraPaddingPolicy(p());
            ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
            ViewGroup viewGroup2 = (ViewGroup) window.findViewById(R.id.content);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    viewGroup.addView(childAt);
                }
                viewGroup2.setId(-1);
                viewGroup.setId(R.id.content);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
        }
        window.setContentView(view);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.F;
        if (actionBarOverlayLayout2 != null) {
            this.H = (ViewGroup) actionBarOverlayLayout2.findViewById(R.id.content);
        }
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.g(this.R, l1());
        }
    }

    public boolean I0() {
        return this.T;
    }

    @Override // defpackage.fd0
    public void J() {
        this.J.onStop();
        j(false);
        ActionBarImpl actionBarImpl = (ActionBarImpl) getActionBar();
        if (actionBarImpl != null) {
            actionBarImpl.setShowHideAnimationEnabled(false);
        }
    }

    public boolean J0() {
        return this.M;
    }

    @Override // defpackage.fd0
    public ActionMode K(ActionMode.Callback callback) {
        return getActionBar() != null ? ((ActionBarImpl) getActionBar()).startActionMode(callback) : super.K(callback);
    }

    public boolean K0() {
        return this.V != null;
    }

    public final boolean L0() {
        return PluginPackageConstant.RN_DIR_A.equals(l().getApplicationContext().getApplicationInfo().packageName);
    }

    @Override // defpackage.fd0
    public void N(zk8 zk8Var) {
        super.N(zk8Var);
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.Q(zk8Var);
        }
    }

    public final /* synthetic */ void N0(Configuration configuration) {
        AppCompatActivity appCompatActivity = this.f17663a;
        tc8.x(appCompatActivity, appCompatActivity.getWindowInfo(), null, true);
        f1(isInFloatingWindowMode(), configuration.uiMode, true, b63.d);
    }

    public final void O0(boolean z) {
        this.K.a(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [fh0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fh0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [fd0, fg1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [miuix.appcompat.internal.view.menu.d] */
    /* JADX WARN: Type inference failed for: r5v3, types: [miuix.appcompat.internal.view.menu.d] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.Menu, miuix.appcompat.internal.view.menu.d] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.Menu, miuix.appcompat.internal.view.menu.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public View P0(int i) {
        ?? H;
        if (i != 0) {
            return this.J.onCreatePanelView(i);
        }
        if (y() || this.U) {
            ?? r5 = this.c;
            boolean zOnPreparePanel = true;
            r5 = r5;
            if (this.d == null) {
                if (r5 == 0) {
                    H = h();
                    Z(H);
                    H.a0();
                    zOnPreparePanel = this.J.onCreatePanelMenu(0, H);
                }
                if (zOnPreparePanel) {
                    r5 = H;
                    r5.a0();
                    zOnPreparePanel = this.J.onPreparePanel(0, null, r5);
                }
            } else if (r5 == 0) {
                zOnPreparePanel = false;
            }
            if (zOnPreparePanel) {
                r5.Z();
            } else {
                Z(null);
            }
        }
        return null;
    }

    public boolean Q0(int i, View view, Menu menu) {
        return i != 0 && this.J.onPreparePanel(i, view, menu);
    }

    public void R0(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray;
        this.J.c(bundle);
        if (this.G == null || (sparseParcelableArray = bundle.getSparseParcelableArray("miuix:ActionBar")) == null) {
            return;
        }
        this.G.restoreHierarchyState(sparseParcelableArray);
    }

    @Override // defpackage.fd0
    public void S(boolean z) {
        super.S(z);
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraHorizontalPaddingEnable(z);
        }
    }

    public void S0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.J.onSaveInstanceState(bundle);
        if (this.Q != null) {
            FloatingActivitySwitcher.B(this.f17663a, bundle);
            MultiAppFloatingActivitySwitcher.W(this.f17663a.getTaskId(), this.f17663a.getActivityIdentity(), bundle);
        }
        if (this.G != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.G.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("miuix:ActionBar", sparseArray);
        }
    }

    @Override // defpackage.fd0
    public void T(boolean z) {
        super.T(z);
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraHorizontalPaddingInitEnable(z);
        }
    }

    public void T0() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.P();
        }
    }

    public void U0(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomExtraInset(i);
        }
    }

    @Override // defpackage.fd0
    public void V(boolean z) {
        super.V(z);
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraPaddingApplyToContentEnable(z);
        }
    }

    public void V0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomMenuCustomView(view);
        }
    }

    @Override // defpackage.fd0
    public void W(al8 al8Var) {
        super.W(al8Var);
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraPaddingPolicy(this.z);
        }
    }

    public void W0(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomMenuCustomViewTranslationYWithPx(i);
        }
    }

    public void X0(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomMenuMode(i);
        }
    }

    public void Y0(int i) {
        if (!this.e) {
            G0();
        }
        ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.I.inflate(i, this.H);
        }
        this.Y.a().onContentChanged();
    }

    public void Z0(View view) {
        a1(view, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.dd0
    public void a(int i, View view, Menu menu, Menu menu2) {
        this.J.a(i, view, menu, menu2);
    }

    public void a1(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.e) {
            G0();
        }
        ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.H.addView(view, layoutParams);
        }
        this.Y.a().onContentChanged();
    }

    public void b1(boolean z) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setCorrectNestedScrollMotionEventEnabled(z);
        }
    }

    public void c1(boolean z) {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.l(z);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.d.b
    public boolean d(miuix.appcompat.internal.view.menu.d dVar, MenuItem menuItem) {
        return this.f17663a.onMenuItemSelected(0, menuItem);
    }

    public void d1(boolean z) {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.m(z);
        }
    }

    @Override // defpackage.oxc
    public void dispatchResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        onResponsiveLayout(configuration, fhlVar, z);
    }

    public void e1(boolean z) {
        this.O = Boolean.valueOf(z);
        f1(z, this.P, true, true);
    }

    @Override // defpackage.fd0
    public void f(zk8 zk8Var) {
        super.f(zk8Var);
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.j(zk8Var);
        }
    }

    public final void f1(boolean z, int i, boolean z2, boolean z3) {
        if (this.M) {
            if (z3 || b63.f3843b) {
                if (this.N == z || !this.K.b(z)) {
                    if (i != this.P) {
                        this.P = i;
                        this.Q.n(z);
                        return;
                    }
                    return;
                }
                this.N = z;
                this.Q.n(z);
                r1(this.N);
                ViewGroup.LayoutParams layoutParamsD = this.Q.d();
                if (layoutParamsD != null) {
                    if (z) {
                        layoutParamsD.height = -2;
                        layoutParamsD.width = -2;
                    } else {
                        layoutParamsD.height = -1;
                        layoutParamsD.width = -1;
                    }
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.F;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.requestLayout();
                    this.F.L(z);
                }
                if (z2) {
                    O0(z);
                }
            }
        }
    }

    public void g1(i8h i8hVar) {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.o(i8hVar);
        }
    }

    @Override // defpackage.lqc
    public Rect getContentInset() {
        return this.s;
    }

    @Override // defpackage.fd0
    public Context getThemedContext() {
        return this.f17663a;
    }

    public void h1(h8h h8hVar) {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.p(h8hVar);
        }
    }

    @Override // defpackage.dd0
    public wc0 i() {
        if (!this.e) {
            G0();
        }
        if (this.F == null) {
            return null;
        }
        return new ActionBarImpl(this.f17663a, this.F);
    }

    public void i1(boolean z) {
        this.L = z;
    }

    @Override // defpackage.dd0
    public void invalidateOptionsMenu() {
        AppCompatActivity appCompatActivity = this.f17663a;
        if (appCompatActivity == null || appCompatActivity.isFinishing() || this.f17663a.isDestroyed()) {
            return;
        }
        this.a0.run();
    }

    public boolean isInFloatingWindowMode() {
        Boolean bool = this.O;
        return bool == null ? l1() : bool.booleanValue();
    }

    public void j1(CharSequence charSequence) {
        this.W = charSequence;
        ActionBarView actionBarView = this.f17664b;
        if (actionBarView != null) {
            actionBarView.setWindowTitle(charSequence);
        }
    }

    public boolean k1() {
        s72 s72Var = this.Q;
        if (s72Var == null) {
            return false;
        }
        boolean zA = s72Var.a();
        if (zA) {
            this.T = true;
        }
        return zA;
    }

    public void l0(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.e) {
            G0();
        }
        ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
        this.Y.a().onContentChanged();
    }

    public final boolean l1() {
        s72 s72Var = this.Q;
        return s72Var != null && s72Var.h();
    }

    @Override // defpackage.fd0
    public int m() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        return actionBarOverlayLayout != null ? actionBarOverlayLayout.getBottomMenuMode() : super.m();
    }

    public void m0(Configuration configuration) {
        BaseResponseStateManager baseResponseStateManager = this.V;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.i(configuration);
        }
    }

    public void m1(boolean z) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.S(z);
        }
    }

    public final void n0(Window window) {
        if (this.X != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof d) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        d dVar = new d(callback);
        this.Y = dVar;
        window.setCallback(dVar);
        this.X = window;
    }

    public void n1() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.T();
        }
    }

    public void o0(Configuration configuration) {
        BaseResponseStateManager baseResponseStateManager = this.V;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.j(configuration);
        }
    }

    public void o1() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.r();
        }
    }

    @Override // defpackage.fd0, defpackage.lqc
    public void onContentInsetChanged(Rect rect) {
        super.onContentInsetChanged(rect);
        List<Fragment> listY0 = this.f17663a.getSupportFragmentManager().y0();
        int size = listY0.size();
        for (int i = 0; i < size; i++) {
            LifecycleOwner lifecycleOwner = (Fragment) listY0.get(i);
            if (lifecycleOwner instanceof osc) {
                osc oscVar = (osc) lifecycleOwner;
                if (!oscVar.hasActionBar()) {
                    oscVar.onContentInsetChanged(rect);
                }
            }
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i != 0 && this.J.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.zk8
    public void onExtraPaddingChanged(int i) {
        this.x = i;
    }

    public void onPanelClosed(int i, Menu menu) {
        this.J.onPanelClosed(i, menu);
    }

    @Override // defpackage.oxc
    public void onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
        AppCompatActivity appCompatActivity = this.f17663a;
        if (appCompatActivity instanceof oxc) {
            appCompatActivity.onResponsiveLayout(configuration, fhlVar, z);
        }
    }

    public final void p0() {
        AppCompatActivity appCompatActivity;
        Window window = this.X;
        if (window != null) {
            return;
        }
        if (window == null && (appCompatActivity = this.f17663a) != null) {
            n0(appCompatActivity.getWindow());
        }
        if (this.X == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public ActionMode p1(ActionMode.Callback callback) {
        if (callback instanceof dil.b) {
            e(this.F);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.startActionMode(callback);
        }
        return null;
    }

    @Override // defpackage.fd0
    public LifecycleOwner q() {
        return this.f17663a;
    }

    public void q0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.executeCloseEnterAnimation();
        }
    }

    @VisibleForTesting
    public void q1(int i) {
        BaseResponseStateManager baseResponseStateManager = this.V;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.s(i);
        }
    }

    public void r0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.executeCloseExitAnimation();
        }
    }

    public final void r1(boolean z) {
        Window window = this.f17663a.getWindow();
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        boolean z2 = ((systemUiVisibility & 1024) != 0) || (s() != 0);
        if (z) {
            window.addFlags(201326592);
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
            }
        } else {
            systemUiVisibility = z2 ? systemUiVisibility | 1024 : systemUiVisibility & (-1025);
            if (Build.VERSION.SDK_INT >= 30) {
                if (z2) {
                    window.setDecorFitsSystemWindows(false);
                } else {
                    window.setDecorFitsSystemWindows(true);
                }
            }
        }
        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    @Override // defpackage.lqc
    public boolean requestDispatchContentInset() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout == null) {
            return false;
        }
        actionBarOverlayLayout.R();
        return true;
    }

    public void s0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.executeOpenEnterAnimation();
        }
    }

    public void setOnStatusBarChangeListener(v9h v9hVar) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setOnStatusBarChangeListener(v9hVar);
        }
    }

    public void t0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.executeOpenExitAnimation();
        }
    }

    @Override // defpackage.fd0
    public View u() {
        return this.F;
    }

    public void u0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            s72Var.b();
        }
    }

    public String v0() {
        return this.S;
    }

    public int w0() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.getBottomMenuCustomViewTranslationY();
        }
        return 0;
    }

    public final int x0(Window window) {
        int i;
        Context context = window.getContext();
        if (hm1.d(context, zhi.b0, false)) {
            i = hm1.d(context, zhi.c0, false) ? awi.M : awi.L;
        } else {
            i = awi.O;
        }
        int iC = hm1.c(context, zhi.T);
        if (iC > 0 && L0() && M0(context)) {
            i = iC;
        }
        if (!window.isFloating() && (window.getCallback() instanceof Dialog)) {
            amr.a(window, hm1.j(context, zhi.q0, 0));
        }
        return i;
    }

    public View y0() {
        s72 s72Var = this.Q;
        if (s72Var != null) {
            return s72Var.c();
        }
        return null;
    }

    public rsk z0() {
        BaseResponseStateManager baseResponseStateManager = this.V;
        if (baseResponseStateManager != null) {
            return baseResponseStateManager.m();
        }
        return null;
    }
}
