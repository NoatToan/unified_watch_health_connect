package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.al8;
import defpackage.dil;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.ke0;
import defpackage.me0;
import defpackage.q56;
import defpackage.s6g;
import defpackage.vsi;
import defpackage.y94;
import defpackage.yad;
import defpackage.yig;
import defpackage.zig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.utils.EaseManager;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public class SearchActionModeView extends FrameLayout implements Animator.AnimatorListener, me0, TextWatcher, View.OnClickListener {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public ObjectAnimator E;
    public ActionBarContainer F;
    public ActionBarContainer G;
    public ActionBarView H;
    public View I;
    public View J;
    public FrameLayout K;
    public List<ke0> L;
    public dil.a M;
    public View.OnClickListener N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f26454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f26455b;
    public ViewGroup c;
    public boolean d;
    public dyq.a e;
    public dyq.a f;
    public int g;
    public boolean h;
    public al8 i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference<View> f26456k;
    public WeakReference<View> l;
    public WeakReference<View> m;
    public WeakReference<View> n;
    public WeakReference<View> o;
    public WeakReference<View> p;
    public int[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26457r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public class a implements ke0 {
        public a() {
        }

        @Override // defpackage.ke0
        public void onStart(boolean z) {
            if (z) {
                SearchActionModeView.this.F.setVisibility(SearchActionModeView.this.A ? 4 : 8);
                return;
            }
            View tabContainer = SearchActionModeView.this.F.getTabContainer();
            if (tabContainer != null) {
                tabContainer.setVisibility(0);
            }
            SearchActionModeView.this.F.setVisibility(0);
        }

        @Override // defpackage.ke0
        public void onStop(boolean z) {
            View tabContainer;
            if (!z || (tabContainer = SearchActionModeView.this.F.getTabContainer()) == null) {
                return;
            }
            tabContainer.setVisibility(8);
        }

        @Override // defpackage.ke0
        public void onUpdate(boolean z, float f) {
        }
    }

    public class b implements ke0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26459a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26460b = 0;
        public int c = 0;
        public int d;
        public int e;
        public int f;
        public int g;
        public ActionBarView h;
        public View i;
        public zig j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f26461k;
        public int l;
        public View m;
        public View n;

        public b() {
        }

        public final void a() {
            zig zigVar = this.j;
            if (zigVar != null) {
                this.l = zigVar.getNestedScrollableValue();
            }
            ActionBarView actionBarView = this.h;
            if (actionBarView == null) {
                this.i.getLocationInWindow(SearchActionModeView.this.q);
                int i = SearchActionModeView.this.q[1];
                this.d = i;
                int i2 = i - SearchActionModeView.this.R;
                this.d = i2;
                int i3 = -i2;
                this.e = i3;
                this.g = i3;
                return;
            }
            int top = actionBarView.getTop();
            int collapsedHeight = this.h.getCollapsedHeight();
            int expandedHeight = this.h.getExpandedHeight();
            if (this.h.getExpandState() == 0) {
                top += collapsedHeight;
            } else if (this.h.getExpandState() == 1) {
                top += expandedHeight;
            }
            this.d = top;
            int i4 = -top;
            this.e = i4;
            this.g = i4 + this.h.getTop();
            if (this.j == null || this.f26461k || !SearchActionModeView.this.A) {
                return;
            }
            this.l += -(expandedHeight - collapsedHeight);
        }

        @Override // defpackage.ke0
        public void onStart(boolean z) {
            ActionBarView actionBarView;
            this.h = SearchActionModeView.this.getActionBarView();
            this.i = SearchActionModeView.this.m != null ? (View) SearchActionModeView.this.m.get() : null;
            this.m = SearchActionModeView.this.o != null ? (View) SearchActionModeView.this.o.get() : null;
            this.n = SearchActionModeView.this.p != null ? (View) SearchActionModeView.this.p.get() : null;
            KeyEvent.Callback callback = SearchActionModeView.this.n != null ? (View) SearchActionModeView.this.n.get() : null;
            if (callback instanceof zig) {
                this.j = (zig) callback;
            }
            if (SearchActionModeView.this.R == Integer.MAX_VALUE) {
                ((View) SearchActionModeView.this.getParent()).getLocationInWindow(SearchActionModeView.this.q);
                SearchActionModeView searchActionModeView = SearchActionModeView.this;
                searchActionModeView.R = searchActionModeView.q[1];
            }
            View view = this.i;
            if (view != null) {
                view.setAlpha(0.0f);
            }
            if (z && (actionBarView = this.h) != null) {
                this.f26461k = actionBarView.getExpandState() == 0;
            }
            if (this.i != null) {
                a();
            }
            if (!z) {
                if (SearchActionModeView.this.M != null) {
                    SearchActionModeView.this.M.b(false);
                }
                View view2 = this.i;
                if (view2 != null) {
                    view2.setImportantForAccessibility(this.f26459a);
                }
                View view3 = this.m;
                if (view3 != null) {
                    view3.setImportantForAccessibility(this.f26460b);
                }
                View view4 = this.n;
                if (view4 != null) {
                    view4.setImportantForAccessibility(this.c);
                }
                if (SearchActionModeView.this.A || this.j == null) {
                    return;
                }
                SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
                searchActionModeView2.setContentViewTranslation(searchActionModeView2.getViewHeight() + SearchActionModeView.this.t);
                this.j.a(0, 0);
                SearchActionModeView.this.N(0, 0);
                return;
            }
            View view5 = this.i;
            if (view5 != null) {
                this.f26459a = view5.getImportantForAccessibility();
                this.i.setImportantForAccessibility(4);
            }
            View view6 = this.m;
            if (view6 != null) {
                this.f26460b = view6.getImportantForAccessibility();
                this.m.setImportantForAccessibility(4);
            }
            View view7 = this.n;
            if (view7 != null) {
                this.c = view7.getImportantForAccessibility();
                this.n.setImportantForAccessibility(1);
            }
            SearchActionModeView.this.setTranslationY(this.d);
            if (SearchActionModeView.this.A) {
                return;
            }
            int i = this.d - SearchActionModeView.this.t;
            this.f = i;
            SearchActionModeView.this.setContentViewTranslation(i);
            SearchActionModeView searchActionModeView3 = SearchActionModeView.this;
            searchActionModeView3.N(searchActionModeView3.t, 0);
        }

        @Override // defpackage.ke0
        public void onStop(boolean z) {
            if (z) {
                if (SearchActionModeView.this.M != null) {
                    SearchActionModeView.this.M.a(this.l);
                    SearchActionModeView.this.M.b(true);
                }
                if (!SearchActionModeView.this.A) {
                    SearchActionModeView.this.setContentViewTranslation(0.0f);
                    zig zigVar = this.j;
                    if (zigVar != null) {
                        zigVar.a(this.l, 0);
                        SearchActionModeView searchActionModeView = SearchActionModeView.this;
                        searchActionModeView.N(searchActionModeView.t + SearchActionModeView.this.getViewHeight(), 0);
                    } else {
                        SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
                        searchActionModeView2.N(searchActionModeView2.t, 0);
                    }
                }
                if (this.n != null && SearchActionModeView.this.A) {
                    View view = this.n;
                    view.setPadding(view.getPaddingLeft(), Math.max(SearchActionModeView.this.getViewHeight() + SearchActionModeView.this.t, SearchActionModeView.this.v), this.n.getPaddingRight(), SearchActionModeView.this.w);
                }
            } else {
                if (SearchActionModeView.this.M != null) {
                    SearchActionModeView.this.M.a(0);
                }
                if (!SearchActionModeView.this.A) {
                    zig zigVar2 = this.j;
                    if (zigVar2 != null) {
                        zigVar2.a(0, 0);
                    }
                    SearchActionModeView.this.setContentViewTranslation(0.0f);
                    SearchActionModeView searchActionModeView3 = SearchActionModeView.this;
                    searchActionModeView3.N(searchActionModeView3.B, SearchActionModeView.this.C);
                }
                if (this.n != null && SearchActionModeView.this.A) {
                    View view2 = this.n;
                    view2.setPadding(view2.getPaddingLeft(), SearchActionModeView.this.v, this.n.getPaddingRight(), SearchActionModeView.this.w);
                }
            }
            SearchActionModeView.this.setTranslationY(this.d + this.e);
            SearchActionModeView.this.I.setTranslationY(SearchActionModeView.this.getTranslationY() + SearchActionModeView.this.getHeight());
        }

        @Override // defpackage.ke0
        public void onUpdate(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            SearchActionModeView.this.setTranslationY(this.d + (this.e * f));
            SearchActionModeView.this.I.setTranslationY(SearchActionModeView.this.getTranslationY() + SearchActionModeView.this.getHeight());
            int i = this.l;
            int iMax = Math.max(i, Math.round(i * f));
            if (!SearchActionModeView.this.A) {
                if (z) {
                    if (this.j != null) {
                        SearchActionModeView.this.setContentViewTranslation(((1.0f - f) * this.f) + (f * SearchActionModeView.this.getViewHeight()));
                        this.j.a(iMax, 0);
                    } else {
                        SearchActionModeView searchActionModeView = SearchActionModeView.this;
                        searchActionModeView.setContentViewTranslation(searchActionModeView.getTranslationY() - ((1.0f - f) * SearchActionModeView.this.t));
                    }
                } else if (this.j != null) {
                    SearchActionModeView.this.setContentViewTranslation((int) (SearchActionModeView.this.getViewHeight() + SearchActionModeView.this.t + ((1.0f - f) * ((this.d - SearchActionModeView.this.getViewHeight()) - SearchActionModeView.this.t))));
                    this.j.a(iMax, 0);
                } else {
                    SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
                    searchActionModeView2.setContentViewTranslation(searchActionModeView2.getTranslationY() - ((1.0f - f) * SearchActionModeView.this.t));
                }
            }
            if (SearchActionModeView.this.M != null) {
                SearchActionModeView.this.M.a(iMax);
            }
        }
    }

    public class c implements ke0 {
        public c() {
        }

        @Override // defpackage.ke0
        public void onStart(boolean z) {
            if (z) {
                SearchActionModeView.this.I.setOnClickListener(SearchActionModeView.this);
                SearchActionModeView.this.I.setVisibility(0);
                SearchActionModeView.this.I.setAlpha(0.0f);
            }
        }

        @Override // defpackage.ke0
        public void onStop(boolean z) {
            if (z) {
                if (SearchActionModeView.this.f26454a.getText().length() > 0) {
                    SearchActionModeView.this.I.setVisibility(8);
                }
            } else {
                SearchActionModeView.this.I.setVisibility(8);
                SearchActionModeView.this.I.setAlpha(1.0f);
                SearchActionModeView.this.I.setTranslationY(0.0f);
            }
        }

        @Override // defpackage.ke0
        public void onUpdate(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            SearchActionModeView.this.I.setAlpha(f);
        }
    }

    public class d implements ke0 {
        public d() {
        }

        public void a(float f, int i) {
            float f2 = 1.0f - f;
            if (dyq.e(SearchActionModeView.this)) {
                f2 = f - 1.0f;
            }
            int measuredWidth = SearchActionModeView.this.f26455b.getMeasuredWidth();
            if (SearchActionModeView.this.f26455b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) SearchActionModeView.this.f26455b.getLayoutParams();
                measuredWidth += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            }
            SearchActionModeView.this.f26455b.setTranslationX(measuredWidth * f2);
            if (SearchActionModeView.this.c.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) SearchActionModeView.this.c.getLayoutParams();
                marginLayoutParams2.setMarginEnd(Math.max(SearchActionModeView.this.getPaddingStart(), (int) (((measuredWidth - i) * f) + i)));
                SearchActionModeView.this.c.setLayoutParams(marginLayoutParams2);
            }
        }

        @Override // defpackage.ke0
        public void onStart(boolean z) {
            a(z ? 0.0f : 1.0f, SearchActionModeView.this.V);
            if (z) {
                SearchActionModeView.this.f26454a.getText().clear();
                SearchActionModeView.this.f26454a.addTextChangedListener(SearchActionModeView.this);
            } else {
                SearchActionModeView.this.f26454a.removeTextChangedListener(SearchActionModeView.this);
                SearchActionModeView.this.f26454a.getText().clear();
            }
        }

        @Override // defpackage.ke0
        public void onStop(boolean z) {
            if (!z) {
                SearchActionModeView.this.f26454a.removeTextChangedListener(SearchActionModeView.this);
                return;
            }
            int i = SearchActionModeView.this.t;
            SearchActionModeView searchActionModeView = SearchActionModeView.this;
            searchActionModeView.setPaddingRelative(searchActionModeView.getPaddingStart(), SearchActionModeView.this.s + i, SearchActionModeView.this.getPaddingEnd(), SearchActionModeView.this.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = SearchActionModeView.this.getLayoutParams();
            layoutParams.height = SearchActionModeView.this.T + i;
            a(1.0f, SearchActionModeView.this.V);
            SearchActionModeView.this.setLayoutParams(layoutParams);
        }

        @Override // defpackage.ke0
        public void onUpdate(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            int iRound = Math.round(SearchActionModeView.this.t * f);
            SearchActionModeView searchActionModeView = SearchActionModeView.this;
            searchActionModeView.setPaddingRelative(searchActionModeView.getPaddingStart(), SearchActionModeView.this.s + iRound, SearchActionModeView.this.getPaddingEnd(), SearchActionModeView.this.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = SearchActionModeView.this.getLayoutParams();
            layoutParams.height = SearchActionModeView.this.T + iRound;
            a(f, SearchActionModeView.this.V);
            SearchActionModeView.this.setLayoutParams(layoutParams);
        }
    }

    public class e implements ke0 {
        public e() {
        }

        @Override // defpackage.ke0
        public void onStart(boolean z) {
        }

        @Override // defpackage.ke0
        public void onStop(boolean z) {
        }

        @Override // defpackage.ke0
        public void onUpdate(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            ActionBarContainer splitActionBarContainer = SearchActionModeView.this.getSplitActionBarContainer();
            if (splitActionBarContainer != null) {
                splitActionBarContainer.setTranslationY(f * splitActionBarContainer.getHeight());
            }
        }
    }

    public SearchActionModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.e = null;
        this.f = null;
        this.q = new int[2];
        this.f26457r = true;
        this.t = -1;
        this.R = Integer.MAX_VALUE;
        setAlpha(0.0f);
        this.T = context.getResources().getDimensionPixelSize(dmi.t0);
        this.U = context.getResources().getDimensionPixelOffset(dmi.s0);
        this.V = context.getResources().getDimensionPixelOffset(dmi.r0);
        this.g = s6g.e(context, dmi.r0);
        this.W = s6g.s(getContext()) ? 16 : 27;
        this.j = 0;
        this.h = false;
    }

    private View getContentView() {
        WeakReference<View> weakReference = this.l;
        if (weakReference != null && weakReference.get() != null) {
            return this.l.get();
        }
        WeakReference<View> weakReference2 = this.f26456k;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup == null) {
            return null;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.content);
        this.l = new WeakReference<>(viewFindViewById);
        return viewFindViewById;
    }

    public void B() {
        if (this.L == null) {
            this.L = new ArrayList();
        }
        this.L.add(new d());
        if (O()) {
            this.L.add(new b());
            this.L.add(new a());
            this.L.add(new e());
        }
        if (getDimView() != null) {
            this.L.add(new c());
        }
    }

    public void C() {
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.E = null;
        }
    }

    public ObjectAnimator D() {
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.E = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "AnimationProgress", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(this);
        objectAnimatorOfFloat.setDuration(q56.a() ? 400L : 0L);
        objectAnimatorOfFloat.setInterpolator(H());
        return objectAnimatorOfFloat;
    }

    public void E(boolean z) {
        List<ke0> list = this.L;
        if (list == null) {
            return;
        }
        Iterator<ke0> it = list.iterator();
        while (it.hasNext()) {
            it.next().onStop(z);
        }
    }

    public void F(boolean z) {
        List<ke0> list = this.L;
        if (list == null) {
            return;
        }
        Iterator<ke0> it = list.iterator();
        while (it.hasNext()) {
            it.next().onStart(z);
        }
    }

    public void G(boolean z, float f) {
        List<ke0> list = this.L;
        if (list == null) {
            return;
        }
        Iterator<ke0> it = list.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(z, f);
        }
    }

    public TimeInterpolator H() {
        return EaseManager.getInterpolator(0, 0.98f, 0.75f);
    }

    public void I() {
        L();
    }

    public void J() {
        getActionBarView();
        getActionBarContainer();
        getSplitActionBarContainer();
    }

    public void K(Rect rect) {
        int i = this.t;
        int i2 = rect.top;
        if (i != i2) {
            this.t = i2;
            R();
            if (!this.A) {
                WeakReference<View> weakReference = this.n;
                if ((weakReference != null ? weakReference.get() : null) instanceof zig) {
                    N(this.t + getViewHeight(), 0);
                } else {
                    N(this.t, 0);
                }
            }
            S(this.d);
            requestLayout();
        }
    }

    public final void L() {
        this.R = Integer.MAX_VALUE;
    }

    public final void M(TextView textView, TextView textView2) {
        if (textView == null || textView2 == null) {
            return;
        }
        Context context = textView.getContext();
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(dmi.q0);
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = dimensionPixelSize / f;
        int i = this.W;
        if (f2 > i) {
            textView.setTextSize(1, i);
        }
        float dimensionPixelSize2 = context.getResources().getDimensionPixelSize(dmi.p0) / f;
        int i2 = this.W;
        if (dimensionPixelSize2 > i2) {
            textView2.setTextSize(1, i2);
        }
    }

    public void N(int i, int i2) {
        View contentView = getContentView();
        if (contentView != null) {
            contentView.setPaddingRelative(contentView.getPaddingStart(), i + this.B, contentView.getPaddingEnd(), i2 + this.C);
        }
    }

    public final boolean O() {
        return this.m != null;
    }

    public void P(boolean z) {
        Drawable background = getBackground();
        if (background != null) {
            if (z) {
                background.setAlpha(0);
            } else {
                background.setAlpha(255);
            }
        }
    }

    public final void Q(float f) {
        WeakReference<View> weakReference = this.f26456k;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        boolean zC = actionBarOverlayLayout != null ? actionBarOverlayLayout.C() : false;
        al8 al8Var = this.i;
        if (al8Var != null && al8Var.h() && (zC || this.h)) {
            this.j = (int) (this.i.f() * f);
        } else {
            this.j = 0;
        }
    }

    public final void R() {
        setPaddingRelative(getPaddingStart(), this.s + this.t, getPaddingEnd(), getPaddingBottom());
        getLayoutParams().height = this.T + this.t;
    }

    public final void S(boolean z) {
        if (z) {
            WeakReference<View> weakReference = this.p;
            View view = weakReference != null ? weakReference.get() : null;
            WeakReference<View> weakReference2 = this.m;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if ((view2 == null || view == null || view2.getParent() == view.getParent()) && view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && !this.A) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = getViewHeight();
                marginLayoutParams.bottomMargin = 0;
                view.setLayoutParams(marginLayoutParams);
                view.requestLayout();
            }
        }
    }

    public final void T(int i, float f) {
        setPaddingRelative(((int) (this.g * f)) + i, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        TextView textView = this.f26455b;
        dyq.a aVar = this.f;
        textView.setPaddingRelative(aVar.f16076b, aVar.c, aVar.d, aVar.e);
        int measuredWidth = this.f26455b.getMeasuredWidth();
        if (this.f26455b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26455b.getLayoutParams();
            marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(dmi.o0) + i);
            this.f26455b.setLayoutParams(marginLayoutParams);
            measuredWidth += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        if (this.c.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            marginLayoutParams2.setMarginEnd(Math.max(getPaddingStart(), measuredWidth));
            this.c.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // defpackage.me0
    public void a() {
        C();
        this.d = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.F = null;
        this.H = null;
        List<ke0> list = this.L;
        if (list != null) {
            list.clear();
            this.L = null;
        }
        if (this.M != null) {
            this.M = null;
        }
        this.G = null;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        View view;
        if (editable == null || editable.length() == 0) {
            View view2 = this.I;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            yad.a(getContext()).c(this.f26454a);
            return;
        }
        if (this.u != 0 || (view = this.I) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // defpackage.me0
    public void b(boolean z) {
        J();
        float f = getResources().getDisplayMetrics().density;
        Q(f);
        T(this.j, f);
        this.D = z;
        this.E = D();
        if (z) {
            B();
            WeakReference<View> weakReference = this.f26456k;
            ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setOverlayMode(true);
            }
        }
        F(z);
        this.E.start();
        if (this.D) {
            return;
        }
        this.f26454a.clearFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f26454a.getWindowToken(), 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.u = charSequence == null ? 0 : charSequence.length();
    }

    @Override // defpackage.me0
    public void c(ke0 ke0Var) {
        if (ke0Var == null) {
            return;
        }
        if (this.L == null) {
            this.L = new ArrayList();
        }
        if (this.L.contains(ke0Var)) {
            return;
        }
        this.L.add(ke0Var);
    }

    @Override // defpackage.me0
    public void d(ActionMode actionMode) {
        this.d = true;
        S(true);
    }

    @Override // defpackage.me0
    public void e() {
        this.f26454a.setFocusable(false);
        this.f26454a.setFocusableInTouchMode(false);
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public ActionBarContainer getActionBarContainer() {
        if (this.F == null) {
            WeakReference<View> weakReference = this.f26456k;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getId() == vsi.d && (childAt instanceof ActionBarContainer)) {
                        this.F = (ActionBarContainer) childAt;
                        break;
                    }
                }
            }
            ActionBarContainer actionBarContainer = this.F;
            if (actionBarContainer != null) {
                int i2 = ((ViewGroup.MarginLayoutParams) actionBarContainer.getLayoutParams()).topMargin;
                this.S = i2;
                if (i2 > 0) {
                    setPaddingRelative(getPaddingStart(), this.s + this.t + this.S, getPaddingEnd(), getPaddingBottom());
                }
            }
        }
        return this.F;
    }

    public ActionBarView getActionBarView() {
        if (this.H == null) {
            WeakReference<View> weakReference = this.f26456k;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                this.H = (ActionBarView) viewGroup.findViewById(vsi.f37187a);
            }
        }
        return this.H;
    }

    public float getAnimationProgress() {
        return this.O;
    }

    public View getCustomView() {
        return this.J;
    }

    public View getDimView() {
        if (this.I == null) {
            WeakReference<View> weakReference = this.f26456k;
            ViewStub viewStub = null;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (viewGroup.getChildAt(childCount).getId() == vsi.Z) {
                        viewStub = (ViewStub) viewGroup.getChildAt(childCount);
                        break;
                    }
                }
                if (viewStub != null) {
                    this.I = viewStub.inflate();
                } else {
                    this.I = viewGroup.findViewById(vsi.Y);
                }
            }
        }
        FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        return this.I;
    }

    public EditText getSearchInput() {
        return this.f26454a;
    }

    public ActionBarContainer getSplitActionBarContainer() {
        if (this.G == null) {
            WeakReference<View> weakReference = this.f26456k;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getId() == vsi.g0 && (childAt instanceof ActionBarContainer)) {
                        this.G = (ActionBarContainer) childAt;
                        break;
                    }
                }
            }
        }
        return this.G;
    }

    @Override // defpackage.me0
    public int getViewHeight() {
        return this.T;
    }

    public ViewPager getViewPager() {
        WeakReference<View> weakReference = this.f26456k;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        if (actionBarOverlayLayout == null || !((ActionBarImpl) actionBarOverlayLayout.getActionBar()).isFragmentViewPagerMode()) {
            return null;
        }
        return (ViewPager) actionBarOverlayLayout.findViewById(vsi.s0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.Q = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.Q) {
            return;
        }
        this.E = null;
        E(this.D);
        if (this.D) {
            this.f26454a.setFocusable(true);
            this.f26454a.setFocusableInTouchMode(true);
            yad.a(getContext()).c(this.f26454a);
        } else {
            yad.a(getContext()).b(this.f26454a);
        }
        if (this.D) {
            return;
        }
        WeakReference<View> weakReference = this.f26456k;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setOverlayMode(this.A);
            actionBarOverlayLayout.R();
        }
        WeakReference<View> weakReference2 = this.m;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        setAlpha(0.0f);
        a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.Q = false;
        if (this.D) {
            setAlpha(1.0f);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.N != null) {
            if (view.getId() == vsi.b0 || view.getId() == vsi.Y) {
                this.N.onClick(view);
            }
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L();
        this.f26457r = true;
        M(this.f26454a, this.f26455b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.e = new dyq.a(this);
        Drawable background = getBackground();
        if (background != null) {
            Rect rect = new Rect();
            background.getPadding(rect);
            dyq.a aVar = this.e;
            aVar.c = rect.top;
            aVar.e = rect.bottom;
        }
        dyq.a aVar2 = this.e;
        if (aVar2.c == 0) {
            aVar2.c = this.U;
        }
        TextView textView = (TextView) findViewById(vsi.b0);
        this.f26455b = textView;
        textView.setOnClickListener(this);
        this.f = new dyq.a(this.f26455b);
        ViewGroup viewGroup = (ViewGroup) findViewById(vsi.X);
        this.c = viewGroup;
        y94.b(viewGroup, false);
        EditText editText = (EditText) findViewById(R.id.input);
        this.f26454a = editText;
        M(editText, this.f26455b);
        Folme.useAt(this.c).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(this.f26454a, new AnimConfig[0]);
        this.s = this.e.c;
        View contentView = getContentView();
        if (contentView != null) {
            this.B = contentView.getPaddingTop();
            this.C = contentView.getPaddingBottom();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.I;
        if (view != null) {
            view.setTranslationY((getTranslationY() + i4) - i2);
        }
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            float f = getResources().getDisplayMetrics().density;
            Q(f);
            T(this.j, f);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setAnchorApplyExtraPaddingByUser(boolean z) {
        if (this.h != z) {
            this.h = z;
            float f = getResources().getDisplayMetrics().density;
            Q(f);
            T(this.j, f);
        }
    }

    public void setAnchorView(View view) {
        if (view == null || view.findViewById(vsi.a0) == null) {
            return;
        }
        this.m = new WeakReference<>(view);
        if (view.getParent() != null) {
            this.n = new WeakReference<>((View) view.getParent());
        }
    }

    public void setAnimateView(View view) {
        if (view != null) {
            this.o = new WeakReference<>(view);
        }
    }

    public void setAnimatedViewListener(dil.a aVar) {
        this.M = aVar;
    }

    public void setAnimationProgress(float f) {
        this.O = f;
        G(this.D, f);
    }

    public void setContentViewTranslation(float f) {
        View contentView = getContentView();
        if (contentView != null) {
            contentView.setTranslationY(f);
        }
    }

    public void setCustomView(View view) {
        if (view == null || this.P) {
            return;
        }
        this.J = view;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.K = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.K.setId(vsi.W);
        this.K.addView(this.J, layoutParams);
        this.K.setPadding(0, 0, 0, 0);
        getDimView();
        ((ViewGroup) this.I).addView(this.K, layoutParams);
        this.P = true;
    }

    public void setExtraPaddingPolicy(al8 al8Var) {
        if (this.i != al8Var) {
            this.i = al8Var;
            float f = getResources().getDisplayMetrics().density;
            Q(f);
            T(this.j, f);
        }
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.N = onClickListener;
    }

    public void setOverlayModeView(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f26456k = new WeakReference<>(actionBarOverlayLayout);
        this.A = actionBarOverlayLayout.D();
    }

    public void setResultView(View view) {
        if (view == null || (((View) view.getParent()) instanceof yig)) {
            return;
        }
        this.p = new WeakReference<>(view);
        this.v = view.getPaddingTop();
        this.w = view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.x = marginLayoutParams.topMargin;
            this.y = marginLayoutParams.bottomMargin;
        }
        this.z = true;
    }
}
