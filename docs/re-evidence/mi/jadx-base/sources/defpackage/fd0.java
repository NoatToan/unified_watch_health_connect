package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.view.ScrollingView;
import androidx.core.view.c;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.appcompat.app.AppCompatActivity;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarContextView;
import miuix.appcompat.internal.app.widget.ActionBarImpl;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fd0 implements dd0, bl8, zk8, h.a, d.b {
    public boolean A;
    public boolean B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatActivity f17663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionBarView f17664b;
    public d c;
    public ActionMode d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public wc0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuInflater f17665k;
    public q6d m;
    public boolean n;
    public boolean o;
    public boolean p;
    public d q;
    public Rect s;
    public View t;
    public dyq.a u;
    public p7h v;
    public int w;
    public boolean y;
    public al8 z;
    public int l = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17666r = false;
    public int x = 0;
    public List<zk8> D = null;
    public boolean E = false;

    public class a extends p7h {
        public a(boolean z) {
            super(z);
        }

        @Override // defpackage.p7h
        public void handleOnBackPressed() {
            ActionMode actionMode;
            fd0 fd0Var = fd0.this;
            if (fd0Var.E || (actionMode = fd0Var.d) == null) {
                return;
            }
            actionMode.finish();
        }
    }

    public fd0(AppCompatActivity appCompatActivity) {
        this.f17663a = appCompatActivity;
        this.w = p56.a(appCompatActivity);
    }

    @Deprecated
    public boolean A() {
        q6d q6dVar = this.m;
        if (q6dVar instanceof r6d) {
            return q6dVar.isShowing();
        }
        return false;
    }

    public void B(Configuration configuration) {
        ActionBarImpl actionBarImpl;
        if (this.h && this.e && (actionBarImpl = (ActionBarImpl) getActionBar()) != null) {
            actionBarImpl.onConfigurationChanged(configuration);
        }
    }

    public void C(Bundle bundle) {
    }

    public abstract boolean D(d dVar);

    public void E() {
        ActionBarImpl actionBarImpl;
        ActionMode actionMode = this.d;
        if (actionMode != null) {
            actionMode.finish();
        }
        if (this.h && this.e && (actionBarImpl = (ActionBarImpl) getActionBar()) != null) {
            actionBarImpl.onDestroy();
        }
    }

    public abstract /* synthetic */ boolean F(int i, MenuItem menuItem);

    public void G() {
        ActionBarImpl actionBarImpl;
        if (this.h && this.e && (actionBarImpl = (ActionBarImpl) getActionBar()) != null) {
            actionBarImpl.setShowHideAnimationEnabled(true);
        }
    }

    public abstract boolean H(d dVar);

    public void I(Rect rect) {
        if (this.t == null) {
            return;
        }
        dyq.a aVar = new dyq.a(this.u);
        boolean zE = dyq.e(this.t);
        aVar.f16076b += zE ? rect.right : rect.left;
        aVar.c += rect.top;
        aVar.d += zE ? rect.left : rect.right;
        View view = this.t;
        if ((view instanceof ViewGroup) && (view instanceof ScrollingView)) {
            aVar.a((ViewGroup) view);
        } else {
            aVar.b(view);
        }
    }

    public void J() {
        ActionBarImpl actionBarImpl;
        j(false);
        if (this.h && this.e && (actionBarImpl = (ActionBarImpl) getActionBar()) != null) {
            actionBarImpl.setShowHideAnimationEnabled(false);
        }
    }

    public ActionMode K(ActionMode.Callback callback) {
        return null;
    }

    public ActionMode L(ActionMode.Callback callback, int i) {
        if (i == 0) {
            return K(callback);
        }
        return null;
    }

    public void M(View view) {
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.registerCoordinateScrollView(view);
        }
    }

    public void N(zk8 zk8Var) {
        List<zk8> list = this.D;
        if (list != null) {
            list.remove(zk8Var);
        }
    }

    public boolean O(int i) {
        if (i == 2) {
            this.f = true;
            return true;
        }
        if (i == 5) {
            this.g = true;
            return true;
        }
        if (i == 8) {
            this.h = true;
            return true;
        }
        if (i != 9) {
            return this.f17663a.requestWindowFeature(i);
        }
        this.i = true;
        return true;
    }

    public void P(boolean z) {
        Q(z, true);
    }

    public void Q(boolean z, boolean z2) {
        R(z, false, z2);
    }

    public void R(boolean z, boolean z2, boolean z3) {
        this.o = z;
        this.p = z2;
        if (this.e && this.h) {
            this.f17664b.setEndActionMenuEnable(z);
            this.f17664b.setHyperActionMenuEnable(z2);
            if (z3) {
                invalidateOptionsMenu();
            } else {
                this.f17663a.getWindow().getDecorView().post(new Runnable() { // from class: ed0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16509a.invalidateOptionsMenu();
                    }
                });
            }
        }
    }

    public void S(boolean z) {
        this.A = z;
        al8 al8Var = this.z;
        if (al8Var != null) {
            al8Var.j(z);
        }
    }

    public void T(boolean z) {
        this.B = z;
    }

    @Deprecated
    public void U(int i) {
    }

    public void V(boolean z) {
        this.C = z;
    }

    public void W(al8 al8Var) {
        if (al8Var != null) {
            this.y = true;
            this.z = al8Var;
        } else if (this.y && this.z != null) {
            this.y = false;
            x();
        }
        al8 al8Var2 = this.z;
        if (al8Var2 != null) {
            al8Var2.j(this.A);
        }
    }

    public void X(boolean z) {
        R(true, z, true);
    }

    @Deprecated
    public void Y(boolean z) {
        this.n = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Z(d dVar) {
        if (dVar == this.c) {
            return;
        }
        this.c = dVar;
        ActionBarView actionBarView = this.f17664b;
        if (actionBarView != null) {
            actionBarView.setMenu(dVar, this);
            if (this.f17664b.isEndActionMenuEnable()) {
                a(0, null, this.c, this.f17664b.getEndMenu());
            }
        }
    }

    public void a0(int i) {
        int integer = this.f17663a.getResources().getInteger(mti.c);
        if (integer >= 0 && integer <= 2) {
            i = integer;
        }
        if (this.l == i || !amr.a(this.f17663a.getWindow(), i)) {
            return;
        }
        this.l = i;
    }

    @Override // miuix.appcompat.internal.view.menu.h.a
    public void b(d dVar, boolean z) {
        this.f17663a.closeOptionsMenu();
    }

    public void b0() {
        ActionBarView actionBarView = this.f17664b;
        if (actionBarView != null) {
            actionBarView.showEndOverflowMenu();
        }
    }

    @Override // defpackage.lqc
    public void bindViewWithContentInset(View view) {
        this.t = view;
        dyq.a aVar = new dyq.a(c.F(view), this.t.getPaddingTop(), c.E(this.t), this.t.getPaddingBottom());
        this.u = aVar;
        if (view instanceof ViewGroup) {
            aVar.f16075a = ((ViewGroup) view).getClipToPadding();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.h.a
    public boolean c(d dVar) {
        return false;
    }

    @Deprecated
    public void c0() {
        View viewFindViewById;
        q6d q6dVar = this.m;
        if (q6dVar instanceof r6d) {
            View viewN0 = ((r6d) q6dVar).n0();
            ViewGroup viewGroupO0 = ((r6d) this.m).o0();
            if (viewN0 != null) {
                d0(viewN0, viewGroupO0);
                return;
            }
        }
        ActionBarView actionBarView = this.f17664b;
        if (actionBarView == null || (viewFindViewById = actionBarView.findViewById(vsi.S)) == null) {
            throw new IllegalStateException("Can't find anchor view in actionbar or any other anchor view used before. Do you use default actionbar and immersion menu is enabled?");
        }
        d0(viewFindViewById, this.f17664b);
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
    @Deprecated
    public void d0(View view, ViewGroup viewGroup) {
        if (this.n) {
            if (view == null) {
                throw new IllegalArgumentException("You must specify a valid anchor view");
            }
            if (this.q == null) {
                d dVarH = h();
                this.q = dVarH;
                D(dVarH);
            }
            if (H(this.q) && this.q.hasVisibleItems()) {
                q6d q6dVar = this.m;
                if (q6dVar == null) {
                    r6d r6dVar = new r6d(this, this.q, u());
                    r6dVar.n(81);
                    r6dVar.g(0);
                    r6dVar.b(0);
                    this.m = r6dVar;
                } else {
                    q6dVar.k(this.q);
                }
                if (this.m.isShowing()) {
                    return;
                }
                this.m.m(view, null);
            }
        }
    }

    public void e(ActionBarOverlayLayout actionBarOverlayLayout) {
        if (actionBarOverlayLayout != null) {
            ViewStub viewStub = (ViewStub) actionBarOverlayLayout.findViewById(vsi.C);
            actionBarOverlayLayout.setContentMask(viewStub != null ? viewStub.inflate() : actionBarOverlayLayout.findViewById(vsi.B));
        }
    }

    public void e0() {
        ActionBarView actionBarView = this.f17664b;
        if (actionBarView != null) {
            actionBarView.showOverflowMenu();
        }
    }

    public void f(zk8 zk8Var) {
        if (this.D == null) {
            this.D = new CopyOnWriteArrayList();
        }
        if (this.D.contains(zk8Var)) {
            this.D.add(zk8Var);
            zk8Var.setExtraHorizontalPadding(this.x);
        }
    }

    public void f0(View view) {
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.unregisterCoordinateScrollView(view);
        }
    }

    public void g(boolean z, boolean z2, ActionBarOverlayLayout actionBarOverlayLayout) {
        if (this.f17666r) {
            return;
        }
        this.f17666r = true;
        ViewStub viewStub = (ViewStub) actionBarOverlayLayout.findViewById(vsi.h0);
        ActionBarContainer actionBarContainer = viewStub != null ? (ActionBarContainer) viewStub.inflate() : (ActionBarContainer) actionBarOverlayLayout.findViewById(vsi.g0);
        if (actionBarContainer != null) {
            this.f17664b.setSplitView(actionBarContainer);
            this.f17664b.setSplitActionBar(z);
            this.f17664b.setSplitWhenNarrow(z2);
            actionBarOverlayLayout.setSplitActionBarView(actionBarContainer);
            e(actionBarOverlayLayout);
        }
        ActionBarContainer actionBarContainer2 = (ActionBarContainer) actionBarOverlayLayout.findViewById(vsi.d);
        ViewStub viewStub2 = (ViewStub) actionBarOverlayLayout.findViewById(vsi.p);
        ActionBarContextView actionBarContextView = viewStub2 != null ? (ActionBarContextView) viewStub2.inflate() : (ActionBarContextView) actionBarOverlayLayout.findViewById(vsi.o);
        if (actionBarContextView != null) {
            actionBarContainer2.setActionBarContextView(actionBarContextView);
            actionBarOverlayLayout.setActionBarContextView(actionBarContextView);
            if (actionBarContainer != null) {
                actionBarContextView.setSplitView(actionBarContainer);
                actionBarContextView.setSplitActionBar(z);
                actionBarContextView.setSplitWhenNarrow(z2);
            }
        }
    }

    public final void g0(boolean z) {
        p7h p7hVar = this.v;
        if (p7hVar != null) {
            p7hVar.setEnabled(z);
        } else {
            this.v = new a(z);
            this.f17663a.getOnBackPressedDispatcher().b(q(), this.v);
        }
    }

    public wc0 getActionBar() {
        if (!hasActionBar()) {
            this.j = null;
        } else if (this.j == null) {
            this.j = i();
        }
        return this.j;
    }

    public abstract Context getThemedContext();

    public d h() {
        d dVar = new d(k());
        dVar.N(this);
        return dVar;
    }

    public boolean hasActionBar() {
        return this.h || this.i;
    }

    @Override // defpackage.bl8
    public boolean isExtraHorizontalPaddingEnable() {
        return this.A;
    }

    @Deprecated
    public void j(boolean z) {
        q6d q6dVar = this.m;
        if (q6dVar != null) {
            q6dVar.a(z);
        }
    }

    public final Context k() {
        AppCompatActivity appCompatActivity = this.f17663a;
        wc0 actionBar = getActionBar();
        return actionBar != null ? actionBar.getThemedContext() : appCompatActivity;
    }

    public AppCompatActivity l() {
        return this.f17663a;
    }

    public int m() {
        return 2;
    }

    public int n() {
        return this.x;
    }

    @Deprecated
    public int o() {
        return 0;
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.d = null;
        g0(false);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.d = actionMode;
        g0(true);
    }

    @Override // defpackage.lqc
    public void onContentInsetChanged(Rect rect) {
        this.s = rect;
    }

    @Override // defpackage.lqc
    public void onDispatchNestedScrollOffset(int[] iArr) {
    }

    public al8 p() {
        return this.z;
    }

    public abstract LifecycleOwner q();

    public MenuInflater r() {
        if (this.f17665k == null) {
            wc0 actionBar = getActionBar();
            if (actionBar != null) {
                this.f17665k = new MenuInflater(actionBar.getThemedContext());
            } else {
                this.f17665k = new MenuInflater(this.f17663a);
            }
        }
        return this.f17665k;
    }

    public int s() {
        return this.l;
    }

    @Override // defpackage.zk8
    public boolean setExtraHorizontalPadding(int i) {
        if (this.x == i) {
            return false;
        }
        this.x = i;
        return true;
    }

    public final String t() {
        try {
            Bundle bundle = this.f17663a.getPackageManager().getActivityInfo(this.f17663a.getComponentName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString("android.support.UI_OPTIONS");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getUiOptionsFromMetadata: Activity '");
            sb.append(this.f17663a.getClass().getSimpleName());
            sb.append("' not in manifest");
            return null;
        }
    }

    public abstract View u();

    public void v() {
        ActionBarView actionBarView = this.f17664b;
        if (actionBarView != null) {
            actionBarView.hideEndOverflowMenu();
        }
    }

    public void w() {
        ActionBarView actionBarView = this.f17664b;
        if (actionBarView != null) {
            actionBarView.hideOverflowMenu();
        }
    }

    public void x() {
        al8 al8VarB = al8.a.b(this.w, fh4.d, fh4.e);
        this.z = al8VarB;
        if (al8VarB != null) {
            al8VarB.j(this.A);
        }
    }

    public boolean y() {
        return this.o;
    }

    public boolean z() {
        return this.C;
    }
}
