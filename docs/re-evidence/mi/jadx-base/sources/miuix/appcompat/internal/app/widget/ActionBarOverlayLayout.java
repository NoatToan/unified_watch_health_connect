package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.al8;
import defpackage.bl8;
import defpackage.cz5;
import defpackage.dil;
import defpackage.dmi;
import defpackage.e3n;
import defpackage.eil;
import defpackage.g5j;
import defpackage.gjg;
import defpackage.gz6;
import defpackage.hm1;
import defpackage.jrk;
import defpackage.lqc;
import defpackage.p56;
import defpackage.q56;
import defpackage.qi4;
import defpackage.qr5;
import defpackage.rbd;
import defpackage.rkr;
import defpackage.s72;
import defpackage.si4;
import defpackage.tc8;
import defpackage.v9h;
import defpackage.vlr;
import defpackage.vsi;
import defpackage.wc0;
import defpackage.yoi;
import defpackage.zhi;
import defpackage.zk8;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.appcompat.app.floatingactivity.FloatingABOLayoutSpec;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.h;
import miuix.autodensity.AutoDensityConfig;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarOverlayLayout extends FrameLayout implements gjg, bl8 {
    public final Rect A;
    public final Rect B;
    public final Rect C;
    public final int[] D;
    public boolean E;
    public int F;
    public Rect G;
    public qi4 H;
    public miuix.appcompat.internal.view.menu.e I;
    public si4 J;
    public d K;
    public boolean L;
    public FloatingABOLayoutSpec M;
    public boolean N;
    public boolean O;
    public al8 P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionBarView f26404a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionBarContainer f26405b;
    public int b0;
    public View c;
    public int c0;
    public final HashSet<View> d;
    public boolean d0;
    public wc0 e;
    public lqc e0;
    public ActionBarContainer f;
    public List<zk8> f0;
    public ActionBarContextView g;
    public boolean g0;
    public View h;
    public boolean h0;
    public ActionMode i;
    public boolean i0;
    public Window.Callback j;
    public final int[] j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LifecycleOwner f26406k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Drawable q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26407r;
    public Rect s;
    public Rect t;
    public Rect u;
    public Rect v;
    public Rect w;
    public Rect x;
    public Rect y;
    public final Rect z;

    public class b implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActionMode.Callback f26408a;

        public b(ActionMode.Callback callback) {
            this.f26408a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f26408a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f26408a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f26408a.onDestroyActionMode(actionMode);
            ActionBarView actionBarView = ActionBarOverlayLayout.this.f26404a;
            if (actionBarView != null && actionBarView.isSplitActionBar()) {
                ActionBarOverlayLayout.this.f26404a.makeMenuViewShowHideWithAnimation(true);
            }
            if (ActionBarOverlayLayout.this.getCallback() != null) {
                ActionBarOverlayLayout.this.getCallback().onActionModeFinished(actionMode);
            }
            ActionBarOverlayLayout.this.i = null;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f26408a.onPrepareActionMode(actionMode, menu);
        }
    }

    public class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ObjectAnimator f26410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ObjectAnimator f26411b;
        public View.OnClickListener c;

        public Animator a() {
            return this.f26411b;
        }

        public Animator b() {
            return this.f26410a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (ActionBarOverlayLayout.this.h == null || ActionBarOverlayLayout.this.f == null || animator != this.f26411b) {
                return;
            }
            ActionBarOverlayLayout.this.f.bringToFront();
            ActionBarOverlayLayout.this.h.setOnClickListener(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ActionBarOverlayLayout.this.h == null || ActionBarOverlayLayout.this.f == null || ActionBarOverlayLayout.this.h.getAlpha() != 0.0f) {
                return;
            }
            ActionBarOverlayLayout.this.f.bringToFront();
            ActionBarOverlayLayout.this.h.setOnClickListener(null);
            ActionBarOverlayLayout.this.h.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ActionBarOverlayLayout.this.h == null || ActionBarOverlayLayout.this.f == null || animator != this.f26410a) {
                return;
            }
            ActionBarOverlayLayout.this.h.setVisibility(0);
            ActionBarOverlayLayout.this.h.bringToFront();
            ActionBarOverlayLayout.this.f.bringToFront();
            ActionBarOverlayLayout.this.h.setOnClickListener(this.c);
        }

        public c(View.OnClickListener onClickListener) {
            this.c = onClickListener;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ActionBarOverlayLayout.this.h, SleepAnalyzerAlpha.NAME_ALPHA, 0.0f, 1.0f);
            this.f26410a = objectAnimatorOfFloat;
            objectAnimatorOfFloat.addListener(this);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ActionBarOverlayLayout.this.h, SleepAnalyzerAlpha.NAME_ALPHA, 1.0f, 0.0f);
            this.f26411b = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.addListener(this);
            if (q56.a()) {
                return;
            }
            this.f26410a.setDuration(0L);
            this.f26411b.setDuration(0L);
        }
    }

    public class d implements miuix.appcompat.internal.view.menu.d.b, h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public miuix.appcompat.internal.view.menu.e f26412a;

        public d() {
        }

        public void a(miuix.appcompat.internal.view.menu.d dVar) {
            if (ActionBarOverlayLayout.this.j != null) {
                ActionBarOverlayLayout.this.j.onPanelClosed(6, dVar.B());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // miuix.appcompat.internal.view.menu.h.a
        public void b(miuix.appcompat.internal.view.menu.d dVar, boolean z) {
            if (dVar.B() != dVar) {
                a(dVar);
            }
            if (z) {
                if (ActionBarOverlayLayout.this.j != null) {
                    ActionBarOverlayLayout.this.j.onPanelClosed(6, dVar);
                }
                ActionBarOverlayLayout.this.p();
                miuix.appcompat.internal.view.menu.e eVar = this.f26412a;
                if (eVar != null) {
                    eVar.a();
                    this.f26412a = null;
                }
            }
        }

        @Override // miuix.appcompat.internal.view.menu.h.a
        public boolean c(miuix.appcompat.internal.view.menu.d dVar) {
            if (dVar == null) {
                return false;
            }
            dVar.N(this);
            miuix.appcompat.internal.view.menu.e eVar = new miuix.appcompat.internal.view.menu.e(dVar);
            this.f26412a = eVar;
            eVar.e(null);
            return true;
        }

        @Override // miuix.appcompat.internal.view.menu.d.b
        public boolean d(miuix.appcompat.internal.view.menu.d dVar, MenuItem menuItem) {
            if (ActionBarOverlayLayout.this.j != null) {
                return ActionBarOverlayLayout.this.j.onMenuItemSelected(6, menuItem);
            }
            return false;
        }
    }

    public class e extends b implements dil.b {

        public class a implements dil.a {
            public a() {
            }

            @Override // dil.a
            public void a(int i) {
                ActionBarContainer actionBarContainer = ActionBarOverlayLayout.this.f26405b;
                if (actionBarContainer != null) {
                    actionBarContainer.setCoordinatedOffsetYInSearchModeAnimation(i);
                    ActionBarOverlayLayout.this.f26405b.requestLayout();
                }
            }

            @Override // dil.a
            public void b(boolean z) {
                if (ActionBarOverlayLayout.this.l != z) {
                    ActionBarOverlayLayout.this.l = z;
                    if (ActionBarOverlayLayout.this.e != null) {
                        ((ActionBarImpl) ActionBarOverlayLayout.this.e).updateCoordinateOffsetView();
                    }
                }
            }
        }

        public e(ActionMode.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.b, android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            ((dil) actionMode).a(new a());
            return super.onCreateActionMode(actionMode, menu);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void N() {
        if (this.c == null) {
            this.c = findViewById(R.id.content);
            ActionBarContainer actionBarContainer = (ActionBarContainer) findViewById(vsi.d);
            this.f26405b = actionBarContainer;
            boolean z = false;
            if (this.N && this.O && actionBarContainer != null && !hm1.d(getContext(), zhi.b0, false)) {
                this.f26405b.setVisibility(8);
                this.f26405b = null;
            }
            ActionBarContainer actionBarContainer2 = this.f26405b;
            if (actionBarContainer2 != null) {
                actionBarContainer2.setOverlayMode(this.m);
                ActionBarView actionBarView = (ActionBarView) this.f26405b.findViewById(vsi.f37187a);
                this.f26404a = actionBarView;
                actionBarView.setBottomMenuMode(this.b0);
                if (this.N && this.O) {
                    z = true;
                }
                this.E = z;
                if (z) {
                    this.F = getResources().getDimensionPixelSize(dmi.e0);
                }
                this.f26405b.setMiuixFloatingOnInit(this.E);
            }
        }
    }

    @RequiresApi(api = 28)
    private rbd getDisplayCoutInsets() {
        WindowInsetsCompat windowInsetsCompatH = androidx.core.view.c.H(this);
        if (windowInsetsCompatH == null) {
            return null;
        }
        gz6 gz6VarE = windowInsetsCompatH.e();
        if (gz6VarE != null) {
            return rbd.b(gz6VarE.b(), gz6VarE.d(), gz6VarE.c(), gz6VarE.a());
        }
        Activity activityS = s(this);
        if (activityS != null) {
            DisplayCutout cutout = Build.VERSION.SDK_INT >= 29 ? activityS.getWindowManager().getDefaultDisplay().getCutout() : null;
            if (cutout != null) {
                return rbd.b(cutout.getSafeInsetLeft(), cutout.getSafeInsetTop(), cutout.getSafeInsetRight(), cutout.getSafeInsetBottom());
            }
        }
        return null;
    }

    @RequiresApi(api = 28)
    public final boolean A(rbd rbdVar) {
        return rbdVar != null && rbdVar.f32378a > 0;
    }

    @RequiresApi(api = 28)
    public final boolean B(rbd rbdVar) {
        return rbdVar != null && rbdVar.c > 0;
    }

    public boolean C() {
        return this.T;
    }

    public boolean D() {
        return this.m;
    }

    public final boolean E() {
        return (getWindowSystemUiVisibility() & 512) != 0;
    }

    public final boolean F(WindowInsetsCompat windowInsetsCompat, boolean z) {
        return (z ? windowInsetsCompat.g(WindowInsetsCompat.m.a() | WindowInsetsCompat.m.f()) : windowInsetsCompat.f(WindowInsetsCompat.m.a() | WindowInsetsCompat.m.f())).f32378a > 0;
    }

    public final boolean G(WindowInsetsCompat windowInsetsCompat, boolean z) {
        return (z ? windowInsetsCompat.g(WindowInsetsCompat.m.a() | WindowInsetsCompat.m.f()) : windowInsetsCompat.f(WindowInsetsCompat.m.a() | WindowInsetsCompat.m.f())).c > 0;
    }

    public boolean H() {
        return this.n;
    }

    public boolean I() {
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = (windowSystemUiVisibility & 256) != 0;
        boolean z2 = (windowSystemUiVisibility & 1024) != 0;
        boolean z3 = this.f26407r != 0;
        if (this.N) {
            return z2 || z3;
        }
        return (z && z2) || z3;
    }

    public final /* synthetic */ void J() {
        LifecycleOwner lifecycleOwner;
        if (isAttachedToWindow()) {
            ActionBarContextView actionBarContextView = this.g;
            if (actionBarContextView != null) {
                actionBarContextView.refreshBottomMenu();
            }
            ActionBarView actionBarView = this.f26404a;
            if (actionBarView != null) {
                actionBarView.refreshBottomMenu();
            }
            if (this.H == null || (lifecycleOwner = this.f26406k) == null || lifecycleOwner.getLifecycle().getState().equals(Lifecycle.State.RESUMED)) {
                return;
            }
            this.H.close();
        }
    }

    public final void K() {
        if (this.m) {
            wc0 wc0Var = this.e;
            if (wc0Var != null) {
                ((ActionBarImpl) wc0Var).updateContentInsetForNestedObserver(this.A);
            }
            lqc lqcVar = this.e0;
            if (lqcVar != null) {
                lqcVar.onContentInsetChanged(this.A);
            }
        }
    }

    public void L(boolean z) {
        if (this.E != (this.N && z)) {
            this.O = z;
            this.E = z;
            if (z) {
                this.F = getResources().getDimensionPixelSize(dmi.e0);
            }
            this.M.q(this.E);
            wc0 wc0Var = this.e;
            if (wc0Var != null) {
                ((ActionBarImpl) wc0Var).onFloatingModeChanged(this.E);
            }
            requestFitSystemWindows();
            requestLayout();
        }
    }

    public void M(int i, int i2) {
        int i3;
        int[] iArr = this.D;
        iArr[i2] = i;
        int iMax = Math.max(iArr[0], iArr[1]);
        if (!this.m) {
            l(iMax);
            return;
        }
        if (E() && iMax <= (i3 = this.B.bottom)) {
            iMax = i3;
        }
        this.z.bottom = Math.max(Math.max(iMax, this.W), this.V);
        q(this.z);
    }

    public void O(View view) {
        if (view != null) {
            this.d.add(view);
        }
    }

    public void P() {
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null) {
            actionBarView.removeBottomMenuCustomView();
        }
    }

    public void Q(zk8 zk8Var) {
        List<zk8> list = this.f0;
        if (list != null) {
            list.remove(zk8Var);
        }
    }

    public void R() {
        K();
    }

    public void S(boolean z) {
        if (this.f26404a != null) {
            setBottomMenuExtraInset(0);
            if (z) {
                this.f26404a.makeMenuViewShowHideWithAnimation(true);
            } else {
                this.f26404a.makeMenuViewShowHide(true);
            }
        }
    }

    public void T() {
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null) {
            actionBarView.showBottomMenuCustomView();
        }
    }

    public ActionMode U(View view, ActionMode.Callback callback) {
        if (!(view instanceof ActionBarOverlayLayout)) {
            return startActionMode(callback);
        }
        ActionMode actionMode = this.i;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionMode actionModeStartActionMode = view.startActionMode(o(callback));
        this.i = actionModeStartActionMode;
        return actionModeStartActionMode;
    }

    public void V(View view) {
        if (view != null) {
            this.d.remove(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    public void W() {
        int i = this.a0;
        float f = getContext().getResources().getDisplayMetrics().density;
        if (i == 0) {
            int measuredWidth = (int) ((getMeasuredWidth() * 1.0f) / f);
            int i2 = (int) ((tc8.l(getContext()).x * 1.0f) / f);
            if (this.c0 != 2 || measuredWidth <= 410 || i2 <= 640) {
                i = 2;
            } else {
                i = 3;
            }
        } else if (i == 1) {
            int i3 = (int) ((tc8.l(getContext()).x * 1.0f) / f);
            if (this.c0 != 2 || i3 <= 640) {
                i = 2;
            } else {
                i = 3;
            }
        }
        if (i != this.b0) {
            this.b0 = i;
            ActionBarContextView actionBarContextView = this.g;
            if (actionBarContextView != null) {
                actionBarContextView.setBottomMenuMode(i);
                this.g.refreshBottomMenu();
            }
            ActionBarView actionBarView = this.f26404a;
            if (actionBarView != null) {
                actionBarView.setBottomMenuMode(this.b0);
                this.f26404a.refreshBottomMenu();
            }
        }
    }

    public void X() {
        int i;
        int i2;
        ActionBarContainer actionBarContainer;
        this.z.set(this.B);
        int iMax = 0;
        if (this.e != null && (actionBarContainer = this.f26405b) != null && actionBarContainer.getVisibility() != 8 && this.f26405b.getMeasuredHeight() > 0) {
            iMax = Math.max(0, (int) (((ActionBarImpl) this.e).getTopViewHeight() + this.B.top + (this.E ? this.F : 0) + this.f26405b.getTranslationY()));
        }
        int iMax2 = Math.max(Math.max(getBottomInset(), this.V), this.W);
        if (!I() || iMax >= (i2 = this.B.top)) {
            this.z.top = iMax;
        } else {
            this.z.top = i2;
        }
        if (!E() || iMax2 >= (i = this.B.bottom)) {
            this.z.bottom = iMax2;
        } else {
            this.z.bottom = i;
        }
        Rect rect = this.z;
        int i3 = rect.left;
        Rect rect2 = this.B;
        int i4 = rect2.left;
        if (i3 < i4) {
            rect.left = i4;
        }
        int i5 = rect.right;
        int i6 = rect2.right;
        if (i5 < i6) {
            rect.right = i6;
        }
        q(rect);
    }

    public final void Y(Context context, al8 al8Var, int i, int i2) {
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
        al8Var.i(point.x, point.y, i3, i2, f, this.E);
        int iF = al8Var.h() ? (int) (al8Var.f() * f) : 0;
        if (iF != this.Q) {
            this.Q = iF;
            this.U = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        if (this.p && (drawable = this.q) != null) {
            drawable.setBounds(0, 0, getRight() - getLeft(), this.s.top);
            this.q.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (y(keyEvent)) {
            if (this.i != null) {
                ActionBarContextView actionBarContextView = this.g;
                if (actionBarContextView != null && actionBarContextView.hideOverflowMenu()) {
                    return true;
                }
                this.i.finish();
                this.i = null;
                return true;
            }
            ActionBarView actionBarView = this.f26404a;
            if (actionBarView != null && actionBarView.hideOverflowMenu()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106 A[DONT_INVERT, PHI: r10
      0x0106: PHI (r10v2 boolean) = (r10v1 boolean), (r10v5 boolean) binds: [B:42:0x00ed, B:47:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        int i;
        int i2;
        boolean zM;
        boolean z;
        boolean zM2;
        boolean z2;
        rbd displayCoutInsets;
        Window window;
        rbd rbdVarF;
        rbd rbdVarF2;
        r(this, this.h0);
        boolean zE = E();
        boolean zI = I();
        this.C.set(rect);
        this.B.set(rect);
        this.v.set(rect);
        WindowInsetsCompat windowInsetsCompatH = androidx.core.view.c.H(this);
        if (windowInsetsCompatH != null) {
            if (this.h0) {
                rbdVarF = windowInsetsCompatH.g(WindowInsetsCompat.m.h());
                rbdVarF2 = windowInsetsCompatH.g(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
            } else {
                rbdVarF = windowInsetsCompatH.f(WindowInsetsCompat.m.h());
                rbdVarF2 = windowInsetsCompatH.f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
            }
            i = rbdVarF.d;
            int i3 = windowInsetsCompatH.f(WindowInsetsCompat.m.c()).d;
            Rect rect2 = this.B;
            rect2.left = rbdVarF2.f32378a;
            rect2.right = rbdVarF2.c;
            rect2.bottom = i;
            if (this.g0 && windowInsetsCompatH.f(WindowInsetsCompat.m.c()).d > 0) {
                this.B.bottom = 0;
            }
            i2 = i3;
        } else {
            i = 0;
            i2 = 0;
        }
        if (!zE) {
            this.B.bottom = 0;
            if (F(windowInsetsCompatH, this.h0)) {
                this.B.left = 0;
            }
            if (G(windowInsetsCompatH, this.h0)) {
                this.B.right = 0;
            }
        }
        if (this.E) {
            Rect rect3 = this.v;
            rect3.top = this.F;
            rect3.left = 0;
            rect3.right = 0;
            Rect rect4 = this.B;
            rect4.top = this.s.top;
            rect4.bottom = 0;
            rect4.left = 0;
            rect4.right = 0;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            Activity activityS = s(this);
            if (activityS == null || (window = activityS.getWindow()) == null) {
                z2 = false;
            } else {
                WindowManager.LayoutParams attributes = window.getAttributes();
                z2 = attributes.layoutInDisplayCutoutMode == 1;
                if (i4 >= 30) {
                    if (z2 || attributes.layoutInDisplayCutoutMode == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            if (!z2) {
                int iJ = hm1.j(getContext(), R.attr.windowLayoutInDisplayCutoutMode, 0);
                z2 = iJ == 1;
                if (i4 >= 30) {
                    if (z2 || iJ == 3) {
                        Rect rect5 = this.v;
                        rect5.left = 0;
                        rect5.right = 0;
                        displayCoutInsets = getDisplayCoutInsets();
                        if (A(displayCoutInsets)) {
                            this.B.left = 0;
                        }
                        if (B(displayCoutInsets)) {
                            this.B.right = 0;
                        }
                    }
                } else if (z2) {
                    Rect rect6 = this.v;
                    rect6.left = 0;
                    rect6.right = 0;
                    displayCoutInsets = getDisplayCoutInsets();
                    if (A(displayCoutInsets)) {
                        this.B.left = 0;
                    }
                    if (B(displayCoutInsets)) {
                        this.B.right = 0;
                    }
                }
            } else if (z2) {
                Rect rect7 = this.v;
                rect7.left = 0;
                rect7.right = 0;
                displayCoutInsets = getDisplayCoutInsets();
                if (A(displayCoutInsets)) {
                    this.B.left = 0;
                }
                if (B(displayCoutInsets)) {
                    this.B.right = 0;
                }
            }
        }
        if (this.m) {
            X();
        }
        if (!H() && (!zE || this.v.bottom != i)) {
            this.v.bottom = 0;
        }
        n(zI, zE, i2, this.v, this.s);
        ActionBarContainer actionBarContainer = this.f26405b;
        if (actionBarContainer != null) {
            if (zI) {
                actionBarContainer.setPendingInsets(this.v);
            }
            ActionMode actionMode = this.i;
            if (actionMode instanceof eil) {
                ((eil) actionMode).g(this.v);
            }
            zM = m(this.f26405b, this.B, true, H() && !zI, true, false);
        } else {
            zM = false;
        }
        ActionBarContextView actionBarContextView = this.g;
        if (actionBarContextView != null) {
            actionBarContextView.setPendingInset(this.B);
        }
        ActionBarContainer actionBarContainer2 = this.f;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setPendingInsets(this.B);
            this.y.set(this.v);
            Rect rect8 = new Rect();
            rect8.set(this.s);
            if (this.O) {
                rect8.bottom = 0;
            }
            if (this.g0) {
                Rect rect9 = new Rect(this.B);
                rect9.bottom = this.s.bottom;
                zM2 = m(this.f, rect9, true, false, true, true);
            } else {
                zM2 = m(this.f, this.B, true, false, true, false);
            }
            zM |= zM2;
        }
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null) {
            actionBarView.setPendingInset(this.B);
        }
        if (this.t.equals(this.s)) {
            if (zM) {
            }
            if (this.f26405b == null || this.f != null) {
                z = false;
            } else {
                z = true;
            }
            return H() && !z;
        }
        this.t.set(this.s);
        requestLayout();
        if (this.f26405b == null) {
            z = false;
        } else {
            z = false;
        }
        if (H()) {
            return false;
        }
    }

    public wc0 getActionBar() {
        return this.e;
    }

    public ActionBarView getActionBarView() {
        return this.f26404a;
    }

    public Rect getBaseInnerInsets() {
        return this.v;
    }

    public int getBottomInset() {
        ActionBarContainer actionBarContainer = this.f;
        if (actionBarContainer != null) {
            return actionBarContainer.getInsetHeight();
        }
        return 0;
    }

    public int getBottomMenuCustomViewTranslationY() {
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null) {
            return actionBarView.getBottomMenuCustomViewOffset();
        }
        return 0;
    }

    public int getBottomMenuMode() {
        return this.b0;
    }

    public Window.Callback getCallback() {
        return this.j;
    }

    public Rect getContentInset() {
        return this.z;
    }

    public View getContentMask() {
        return this.h;
    }

    public View getContentView() {
        return this.c;
    }

    public int getDeviceType() {
        return this.c0;
    }

    public al8 getExtraPaddingPolicy() {
        return this.P;
    }

    public Rect getInnerInsets() {
        return this.x;
    }

    public void j(zk8 zk8Var) {
        if (this.f0 == null) {
            this.f0 = new CopyOnWriteArrayList();
        }
        if (this.f0.contains(zk8Var)) {
            return;
        }
        this.f0.add(zk8Var);
        zk8Var.setExtraHorizontalPadding(this.Q);
    }

    public final void k(View view) {
        if (!this.m || this.d0) {
            view.offsetTopAndBottom(-this.j0[1]);
            return;
        }
        lqc lqcVar = this.e0;
        if (lqcVar != null) {
            lqcVar.onDispatchNestedScrollOffset(this.j0);
        }
    }

    public void l(int i) {
        if (this.G == null) {
            this.G = new Rect();
        }
        Rect rect = this.G;
        Rect rect2 = this.u;
        rect.top = rect2.top;
        rect.bottom = i;
        rect.right = rect2.right;
        rect.left = rect2.left;
        m(this.c, rect, true, true, true, true);
        this.c.requestLayout();
    }

    public final boolean m(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        if (view == null) {
            return false;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            int i = layoutParams.leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                layoutParams.leftMargin = i2;
                z5 = true;
            }
        }
        if (z2) {
            int i3 = layoutParams.topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                layoutParams.topMargin = i4;
                z5 = true;
            }
        }
        if (z3) {
            int i5 = layoutParams.rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                layoutParams.rightMargin = i6;
                z5 = true;
            }
        }
        if (z4) {
            int i7 = layoutParams.bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                layoutParams.bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    public final void n(boolean z, boolean z2, int i, Rect rect, Rect rect2) {
        boolean zH = H();
        rect2.set(rect);
        if ((!zH || z) && !this.p) {
            rect2.top = 0;
        }
        if (this.O || z2) {
            rect2.bottom = 0;
        } else {
            int i2 = rect2.bottom;
            if (i2 != 0) {
                int i3 = i2 - i;
                rect2.bottom = i3;
                if (i3 < 0) {
                    rect2.bottom = 0;
                }
            }
        }
        if (!this.g0 || i <= 0) {
            return;
        }
        rect2.bottom = this.C.bottom;
    }

    public final b o(ActionMode.Callback callback) {
        return callback instanceof dil.b ? new e(callback) : new b(callback);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        return (Build.VERSION.SDK_INT < 28 || windowInsetsOnApplyWindowInsets.isConsumed() || !H()) ? windowInsetsOnApplyWindowInsets : windowInsets.consumeDisplayCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestFitSystemWindows();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        qr5.d("->processActionBarOverlayLayout ConfigurationChanged newConfig.densityDpi " + configuration.densityDpi);
        cz5.h().s(context, configuration);
        AutoDensityConfig.updateDensity(context);
        this.M.p();
        post(new Runnable() { // from class: ld0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24921a.J();
            }
        });
        qi4 qi4Var = this.H;
        if (qi4Var == null || !qi4Var.c0()) {
            return;
        }
        this.H.d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentInsetStateCallback(null);
        List<zk8> list = this.f0;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        N();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.m) {
            X();
        }
        al8 al8Var = this.P;
        if (al8Var != null && al8Var.h()) {
            if (this.U && this.f0 != null) {
                this.U = false;
                for (int i5 = 0; i5 < this.f0.size(); i5++) {
                    this.f0.get(i5).onExtraPaddingChanged(this.Q);
                }
            }
            if (this.T) {
                this.P.e(this.c);
            }
        }
        wc0 wc0Var = this.e;
        if (wc0Var == null || this.l) {
            return;
        }
        ((ActionBarImpl) wc0Var).updateCoordinateOffsetView();
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int iM = this.M.m(i);
        int iE = this.M.e(i2);
        View view = this.c;
        View view2 = this.h;
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != view && childAt != view2 && childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, iM, 0, iE, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                iMax = Math.max(iMax, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        ActionBarContainer actionBarContainer = this.f26405b;
        int measuredHeight = (actionBarContainer == null || actionBarContainer.getVisibility() == 8) ? 0 : this.f26405b.getMeasuredHeight();
        int bottomInset = getBottomInset();
        ActionBarView actionBarView = this.f26404a;
        int i4 = (actionBarView == null || !actionBarView.isSplitActionBar()) ? 0 : bottomInset;
        this.x.set(this.v);
        this.u.set(this.s);
        boolean zE = E();
        boolean zI = I();
        if (zI && measuredHeight > 0) {
            this.u.top = 0;
        }
        if (this.m) {
            if (!zI) {
                this.x.top += measuredHeight;
            } else if (measuredHeight > 0) {
                this.x.top = measuredHeight;
            }
            this.x.bottom += i4;
        } else {
            Rect rect = this.u;
            rect.top += measuredHeight;
            rect.bottom += i4;
        }
        if ((!this.N || !this.O) && zE) {
            if (getResources().getConfiguration().orientation == 2) {
                Rect rect2 = this.u;
                rect2.right = 0;
                rect2.left = 0;
            }
            if (bottomInset == 0) {
                this.u.bottom = 0;
            }
        }
        if (!z()) {
            m(view, this.u, true, true, true, true);
            this.G = null;
        }
        if (!this.m) {
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
        }
        if (!this.w.equals(this.x) || this.o) {
            this.w.set(this.x);
            super.fitSystemWindows(this.v);
            this.o = false;
        }
        if (I() && this.p) {
            Drawable drawable = this.q;
            if (drawable != null) {
                drawable.setBounds(0, 0, getRight() - getLeft(), this.s.top);
            } else {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
                if (viewGroup != null && viewGroup.getChildCount() == 1) {
                    View childAt2 = viewGroup.getChildAt(0);
                    childAt2.setPadding(childAt2.getPaddingLeft(), 0, childAt2.getPaddingRight(), childAt2.getPaddingBottom());
                }
            }
        }
        al8 al8Var = this.P;
        if (al8Var == null || !al8Var.h()) {
            iMakeMeasureSpec = iM;
        } else {
            int size = View.MeasureSpec.getSize(iM);
            Y(getContext(), this.P, size, View.MeasureSpec.getSize(iE));
            if (this.T) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (this.Q * 2), View.MeasureSpec.getMode(iM));
            } else {
                iMakeMeasureSpec = iM;
            }
        }
        measureChildWithMargins(view, iMakeMeasureSpec, 0, iE, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        int iMax3 = Math.max(iMax, view.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int iMax4 = Math.max(iMax2, view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
        if (view2 != null && view2.getVisibility() == 0) {
            m(view2, this.y, true, false, true, true);
            measureChildWithMargins(view2, iM, 0, iE, 0);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), iM, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), iE, iCombineMeasuredStates2 << 16));
        post(new Runnable() { // from class: kd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23737a.W();
            }
        });
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        wc0 wc0Var;
        View viewT = t(view);
        if (viewT == null) {
            return;
        }
        int[] iArr2 = this.j0;
        iArr2[1] = 0;
        ActionBarContainer actionBarContainer = this.f26405b;
        if (actionBarContainer != null && !this.l) {
            actionBarContainer.x(view, i, i2, iArr, i3, iArr2);
        }
        if (i2 > 0) {
            int i4 = iArr[1];
            if (i2 - i4 > 0 && (wc0Var = this.e) != null && (wc0Var instanceof ActionBarImpl)) {
                int i5 = i2 - i4;
                int topOffsetForCoordinateView = ((ActionBarImpl) wc0Var).getTopOffsetForCoordinateView(view);
                if (topOffsetForCoordinateView != -1) {
                    iArr[1] = iArr[1] + ((ActionBarImpl) this.e).updateTopOffsetOnNestedPreScroll(view, Math.max(0, topOffsetForCoordinateView - i5));
                }
            }
        }
        k(viewT);
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        ActionBarContainer actionBarContainer;
        if (t(view2) == null || (actionBarContainer = this.f26405b) == null) {
            return;
        }
        actionBarContainer.z(view, view2, i, i2);
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        ActionBarContainer actionBarContainer;
        return this.i0 && t(view2) != null && (actionBarContainer = this.f26405b) != null && actionBarContainer.C(view, view2, i, i2);
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i) {
        ActionBarContainer actionBarContainer;
        if (t(view) == null || (actionBarContainer = this.f26405b) == null) {
            return;
        }
        actionBarContainer.D(view, i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        return this.N;
    }

    public final void p() {
        miuix.appcompat.internal.view.menu.e eVar = this.I;
        if (eVar != null) {
            eVar.a();
            this.I = null;
            this.H = null;
        }
    }

    public final void q(Rect rect) {
        if (!this.A.equals(rect)) {
            this.A.set(rect);
            K();
        }
    }

    public final void r(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof vlr) {
                ((vlr) childAt).a(z);
            }
            if (childAt instanceof ViewGroup) {
                r((ViewGroup) childAt, z);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestFitSystemWindows() {
        super.requestFitSystemWindows();
        this.o = true;
    }

    public final Activity s(View view) {
        Context context = ((ViewGroup) view.getRootView()).getChildAt(0).getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public void setActionBar(wc0 wc0Var) {
        this.e = wc0Var;
        if (wc0Var != null) {
            ((ActionBarImpl) wc0Var).setExtraPaddingPolicy(this.P);
        }
    }

    public void setActionBarContextView(ActionBarContextView actionBarContextView) {
        this.g = actionBarContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setActionBarView(this.f26404a);
            this.g.setBottomMenuMode(this.b0);
            this.g.setPendingInset(this.B);
        }
    }

    public void setAnimating(boolean z) {
        this.L = z;
    }

    public void setBottomExtraInset(int i) {
        int i2;
        if (this.V != i) {
            this.V = i;
            int iMax = Math.max(getBottomInset(), this.W);
            if (E() && iMax <= (i2 = this.B.bottom)) {
                iMax = i2;
            }
            int iMax2 = Math.max(iMax, this.V);
            Rect rect = this.z;
            if (rect.bottom != iMax2) {
                rect.bottom = iMax2;
                q(rect);
            }
        }
    }

    public void setBottomMenuCustomView(View view) {
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null) {
            actionBarView.setBottomMenuCustomView(view);
        }
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i) {
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null) {
            actionBarView.setBottomMenuCustomViewTranslationYWithPx(i);
        }
    }

    public void setBottomMenuExtraInset(int i) {
        this.W = i;
    }

    public void setBottomMenuMode(int i) {
        if (this.a0 != i) {
            this.a0 = i;
            W();
        }
    }

    public void setCallback(Window.Callback callback) {
        this.j = callback;
    }

    public void setContentInsetStateCallback(lqc lqcVar) {
        this.e0 = lqcVar;
    }

    public void setContentMask(View view) {
        this.h = view;
        if (!q56.b() || this.h == null) {
            return;
        }
        jrk.f(getContext().getResources(), yoi.p, getContext().getTheme());
    }

    public void setContentView(View view) {
        this.c = view;
    }

    public void setCorrectNestedScrollMotionEventEnabled(boolean z) {
        this.d0 = z;
    }

    public void setExtraHorizontalPaddingEnable(boolean z) {
        if (this.R != z) {
            this.R = z;
            al8 al8Var = this.P;
            if (al8Var != null) {
                al8Var.j(z);
                requestLayout();
            }
        }
    }

    public void setExtraHorizontalPaddingInitEnable(boolean z) {
        if (this.S != z) {
            this.S = z;
        }
    }

    public void setExtraPaddingApplyToContentEnable(boolean z) {
        if (this.T != z) {
            this.T = z;
            requestLayout();
        }
    }

    public void setExtraPaddingPolicy(al8 al8Var) {
        if (this.P != null || al8Var == null) {
            this.P = al8Var;
            if (al8Var != null) {
                al8Var.j(this.R);
            }
        } else {
            this.P = al8Var;
            al8Var.j(this.R);
            if (this.S) {
                Y(getContext(), this.P, -1, -1);
                this.U = false;
                if (this.f0 != null) {
                    for (int i = 0; i < this.f0.size(); i++) {
                        this.f0.get(i).setExtraHorizontalPadding(this.Q);
                    }
                }
            }
        }
        wc0 wc0Var = this.e;
        if (wc0Var != null) {
            ((ActionBarImpl) wc0Var).setExtraPaddingPolicy(this.P);
        }
        requestLayout();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.f26406k = lifecycleOwner;
    }

    public void setNestedScrollingParentEnabled(boolean z) {
        this.i0 = z;
    }

    public void setOnStatusBarChangeListener(v9h v9hVar) {
    }

    public void setOverlayMode(boolean z) {
        this.m = z;
        ActionBarContainer actionBarContainer = this.f26405b;
        if (actionBarContainer != null) {
            actionBarContainer.setOverlayMode(z);
        }
    }

    public void setRootSubDecor(boolean z) {
        this.n = z;
    }

    public void setSplitActionBarView(ActionBarContainer actionBarContainer) {
        this.f = actionBarContainer;
        actionBarContainer.setPendingInsets(this.B);
    }

    public void setTranslucentStatus(int i) {
        if (this.f26407r != i) {
            this.f26407r = i;
            requestFitSystemWindows();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view, float f, float f2) {
        if (x(view, f, f2)) {
            return true;
        }
        return getParent() != null && getParent().showContextMenuForChild(view, f, f2);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionBarContextView actionBarContextView = this.g;
        ActionMode actionModeOnWindowStartingActionMode = null;
        if (actionBarContextView != null && actionBarContextView.C()) {
            return null;
        }
        ActionMode actionMode = this.i;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.i = null;
        if (getCallback() != null) {
            actionModeOnWindowStartingActionMode = getCallback().onWindowStartingActionMode(o(callback));
        }
        if (actionModeOnWindowStartingActionMode != null) {
            this.i = actionModeOnWindowStartingActionMode;
        }
        if (this.i != null && getCallback() != null) {
            getCallback().onActionModeStarted(this.i);
        }
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null && actionBarView.isSplitActionBar()) {
            ActionMenuView actionMenuView = this.f26404a.getActionMenuView();
            if (actionMenuView != null) {
                setBottomMenuExtraInset(actionMenuView.getCollapsedHeight());
            }
            this.f26404a.makeMenuViewShowHideWithAnimation(false);
        }
        if ((this.i instanceof dil) && this.m) {
            X();
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return U(view, callback);
    }

    public final View t(View view) {
        return (this.d.isEmpty() || !this.d.contains(view)) ? this.c : view;
    }

    public c u(View.OnClickListener onClickListener) {
        return new c(onClickListener);
    }

    public void v(boolean z) {
        if (this.f26404a != null) {
            setBottomMenuExtraInset(0);
            if (z) {
                this.f26404a.makeMenuViewShowHideWithAnimation(false);
            } else {
                this.f26404a.makeMenuViewShowHide(false);
            }
        }
    }

    public void w() {
        ActionBarView actionBarView = this.f26404a;
        if (actionBarView != null) {
            actionBarView.hideBottomMenuCustomView();
        }
    }

    public final boolean x(View view, float f, float f2) {
        qi4 qi4Var = this.H;
        if (qi4Var == null) {
            qi4 qi4Var2 = new qi4(getContext());
            this.H = qi4Var2;
            qi4Var2.N(this.K);
        } else {
            qi4Var.clear();
        }
        si4 si4VarE0 = this.H.e0(view, view.getWindowToken(), f, f2);
        this.J = si4VarE0;
        if (si4VarE0 == null) {
            return super.showContextMenuForChild(view);
        }
        si4VarE0.d(this.K);
        return true;
    }

    public final boolean y(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1;
    }

    public boolean z() {
        return this.L;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        wc0 wc0Var;
        View viewT = t(view);
        if (viewT == null) {
            return;
        }
        if (i4 < 0) {
            int i7 = iArr[1];
            if (i4 - i7 > 0 || (wc0Var = this.e) == null || !(wc0Var instanceof ActionBarImpl)) {
                i6 = i4;
            } else {
                int iUpdateTopOffsetOnNestedScroll = ((ActionBarImpl) wc0Var).updateTopOffsetOnNestedScroll(view, i4 - i7);
                iArr[1] = iArr[1] + iUpdateTopOffsetOnNestedScroll;
                i6 = i4 - iUpdateTopOffsetOnNestedScroll;
            }
        } else {
            i6 = i4;
        }
        int[] iArr2 = this.j0;
        iArr2[1] = 0;
        ActionBarContainer actionBarContainer = this.f26405b;
        if (actionBarContainer != null && !this.l) {
            actionBarContainer.y(view, i, i2, i3, i6, i5, iArr, iArr2);
        }
        k(viewT);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new HashSet<>();
        this.f26406k = null;
        this.l = false;
        this.n = true;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.y = new Rect();
        this.z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new int[2];
        this.G = null;
        this.K = new d();
        this.N = false;
        this.O = false;
        this.d0 = true;
        this.g0 = false;
        this.h0 = false;
        this.i0 = true;
        this.j0 = new int[2];
        e3n.a(context);
        this.M = new FloatingABOLayoutSpec(context, attributeSet);
        this.c0 = p56.a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.m3, i, 0);
        this.N = typedArrayObtainStyledAttributes.getBoolean(g5j.r3, false);
        this.O = s72.i(context);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(g5j.n3, false);
        this.p = z;
        if (z) {
            this.q = typedArrayObtainStyledAttributes.getDrawable(g5j.o3);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.a0 = hm1.j(context, zhi.u, 0);
        this.g0 = hm1.d(context, zhi.S, false);
        this.h0 = hm1.d(context, zhi.I, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view) {
        qi4 qi4Var = this.H;
        if (qi4Var == null) {
            qi4 qi4Var2 = new qi4(getContext());
            this.H = qi4Var2;
            qi4Var2.N(this.K);
        } else {
            qi4Var.clear();
        }
        miuix.appcompat.internal.view.menu.e eVarF0 = this.H.f0(view, view.getWindowToken());
        this.I = eVarF0;
        if (eVarF0 != null) {
            eVarF0.d(this.K);
            return true;
        }
        return super.showContextMenuForChild(view);
    }
}
