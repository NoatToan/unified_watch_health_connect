package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.core.view.g1;
import androidx.core.view.i1;

/* JADX INFO: loaded from: classes.dex */
public class z0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f5291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f5293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatSpinner f5294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f5295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f5296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f5297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f5298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f5300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f5301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f5302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Window.Callback f5303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f5305o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Drawable f5308r;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.view.menu.a f5309a;

        public a() {
            this.f5309a = new androidx.appcompat.view.menu.a(z0.this.f5291a.getContext(), 0, R.id.home, 0, 0, z0.this.f5300j);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            z0 z0Var = z0.this;
            Window.Callback callback = z0Var.f5303m;
            if (callback == null || !z0Var.f5304n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f5309a);
        }
    }

    public class b extends i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5311a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5312b;

        public b(int i14) {
            this.f5312b = i14;
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void a() {
            z0.this.f5291a.setVisibility(0);
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void onAnimationCancel() {
            this.f5311a = true;
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void onAnimationEnd() {
            if (this.f5311a) {
                return;
            }
            z0.this.f5291a.setVisibility(this.f5312b);
        }
    }

    public z0(Toolbar toolbar, boolean z14, int i14, int i15) {
        Drawable drawable;
        this.f5306p = 0;
        this.f5307q = 0;
        this.f5291a = toolbar;
        this.f5300j = toolbar.getTitle();
        this.f5301k = toolbar.getSubtitle();
        this.f5299i = this.f5300j != null;
        this.f5298h = toolbar.getNavigationIcon();
        w0 w0VarG = w0.g(toolbar.getContext(), null, h.a.f80421a, com.garmin.android.apps.connectmobile.R.attr.actionBarStyle, 0);
        TypedArray typedArray = w0VarG.f5271b;
        int i16 = 15;
        this.f5308r = w0VarG.b(15);
        if (z14) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f5301k = text2;
                if ((this.f5292b & 8) != 0) {
                    this.f5291a.setSubtitle(text2);
                }
            }
            Drawable drawableB = w0VarG.b(20);
            if (drawableB != null) {
                this.f5297g = drawableB;
                C();
            }
            Drawable drawableB2 = w0VarG.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f5298h == null && (drawable = this.f5308r) != null) {
                p(drawable);
            }
            h(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view2 = this.f5295e;
                if (view2 != null && (this.f5292b & 16) != 0) {
                    toolbar.removeView(view2);
                }
                this.f5295e = viewInflate;
                if (viewInflate != null && (this.f5292b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                h(this.f5292b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f5308r = toolbar.getNavigationIcon();
            } else {
                i16 = 11;
            }
            this.f5292b = i16;
        }
        w0VarG.h();
        if (i14 != this.f5307q) {
            this.f5307q = i14;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                j(this.f5307q);
            }
        }
        this.f5302l = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new a());
    }

    public final void A() {
        if (this.f5294d == null) {
            this.f5294d = new AppCompatSpinner(this.f5291a.getContext(), null, com.garmin.android.apps.connectmobile.R.attr.actionDropDownStyle);
            this.f5294d.setLayoutParams(new Toolbar.g(-2, -2, 8388627));
        }
    }

    public final void B() {
        if ((this.f5292b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f5302l);
            Toolbar toolbar = this.f5291a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f5307q);
            } else {
                toolbar.setNavigationContentDescription(this.f5302l);
            }
        }
    }

    public final void C() {
        Drawable drawable;
        int i14 = this.f5292b;
        if ((i14 & 2) == 0) {
            drawable = null;
        } else if ((i14 & 1) == 0 || (drawable = this.f5297g) == null) {
            drawable = this.f5296f;
        }
        this.f5291a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.b0
    public final boolean a() {
        return this.f5291a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public final void b(Menu menu, androidx.appcompat.view.menu.n.a aVar) {
        c cVar = this.f5305o;
        Toolbar toolbar = this.f5291a;
        if (cVar == null) {
            c cVar2 = new c(toolbar.getContext());
            this.f5305o = cVar2;
            cVar2.f4717i = com.garmin.android.apps.connectmobile.R.id.action_menu_presenter;
        }
        c cVar3 = this.f5305o;
        cVar3.f4713e = aVar;
        toolbar.setMenu((androidx.appcompat.view.menu.h) menu, cVar3);
    }

    @Override // androidx.appcompat.widget.b0
    public final boolean c() {
        return this.f5291a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.b0
    public final void collapseActionView() {
        this.f5291a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.b0
    public final boolean d() {
        return this.f5291a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public final boolean e() {
        return this.f5291a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public final boolean f() {
        return this.f5291a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.b0
    public final void g() {
        this.f5304n = true;
    }

    @Override // androidx.appcompat.widget.b0
    public final Context getContext() {
        return this.f5291a.getContext();
    }

    @Override // androidx.appcompat.widget.b0
    public final CharSequence getTitle() {
        return this.f5291a.getTitle();
    }

    @Override // androidx.appcompat.widget.b0
    public final void h(int i14) {
        View view2;
        int i15 = this.f5292b ^ i14;
        this.f5292b = i14;
        if (i15 != 0) {
            int i16 = i15 & 4;
            Toolbar toolbar = this.f5291a;
            if (i16 != 0) {
                if ((i14 & 4) != 0) {
                    B();
                }
                if ((this.f5292b & 4) != 0) {
                    Drawable drawable = this.f5298h;
                    if (drawable == null) {
                        drawable = this.f5308r;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i15 & 3) != 0) {
                C();
            }
            if ((i15 & 8) != 0) {
                if ((i14 & 8) != 0) {
                    toolbar.setTitle(this.f5300j);
                    toolbar.setSubtitle(this.f5301k);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i15 & 16) == 0 || (view2 = this.f5295e) == null) {
                return;
            }
            if ((i14 & 16) != 0) {
                toolbar.addView(view2);
            } else {
                toolbar.removeView(view2);
            }
        }
    }

    @Override // androidx.appcompat.widget.b0
    public final int i() {
        return this.f5306p;
    }

    @Override // androidx.appcompat.widget.b0
    public final void j(int i14) {
        w(i14 == 0 ? null : this.f5291a.getContext().getString(i14));
    }

    @Override // androidx.appcompat.widget.b0
    public final void k(boolean z14) {
        this.f5291a.setCollapsible(z14);
    }

    @Override // androidx.appcompat.widget.b0
    public final void l() {
        this.f5291a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.b0
    public final void m(SpinnerAdapter spinnerAdapter, i.p pVar) {
        A();
        this.f5294d.setAdapter(spinnerAdapter);
        this.f5294d.setOnItemSelectedListener(pVar);
    }

    @Override // androidx.appcompat.widget.b0
    public final int n() {
        return this.f5292b;
    }

    @Override // androidx.appcompat.widget.b0
    public final void o() {
        p0 p0Var;
        int i14 = this.f5306p;
        if (1 != i14) {
            Toolbar toolbar = this.f5291a;
            if (i14 == 1) {
                AppCompatSpinner appCompatSpinner = this.f5294d;
                if (appCompatSpinner != null && appCompatSpinner.getParent() == toolbar) {
                    toolbar.removeView(this.f5294d);
                }
            } else if (i14 == 2 && (p0Var = this.f5293c) != null && p0Var.getParent() == toolbar) {
                toolbar.removeView(this.f5293c);
            }
            this.f5306p = 1;
            A();
            toolbar.addView(this.f5294d, 0);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public final void p(Drawable drawable) {
        this.f5298h = drawable;
        int i14 = this.f5292b & 4;
        Toolbar toolbar = this.f5291a;
        if (i14 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.f5308r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.b0
    public final g1 q(int i14, long j8) {
        g1 g1VarC = androidx.core.view.s0.c(this.f5291a);
        g1VarC.a(i14 == 0 ? 1.0f : 0.0f);
        g1VarC.c(j8);
        g1VarC.d(new b(i14));
        return g1VarC;
    }

    @Override // androidx.appcompat.widget.b0
    public final Toolbar r() {
        return this.f5291a;
    }

    @Override // androidx.appcompat.widget.b0
    public final void s(int i14) {
        p(i14 != 0 ? j.a.a(this.f5291a.getContext(), i14) : null);
    }

    @Override // androidx.appcompat.widget.b0
    public final void setIcon(int i14) {
        setIcon(i14 != 0 ? j.a.a(this.f5291a.getContext(), i14) : null);
    }

    @Override // androidx.appcompat.widget.b0
    public final void setTitle(CharSequence charSequence) {
        this.f5299i = true;
        this.f5300j = charSequence;
        if ((this.f5292b & 8) != 0) {
            Toolbar toolbar = this.f5291a;
            toolbar.setTitle(charSequence);
            if (this.f5299i) {
                androidx.core.view.s0.s(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.b0
    public final void setWindowCallback(Window.Callback callback) {
        this.f5303m = callback;
    }

    @Override // androidx.appcompat.widget.b0
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f5299i) {
            return;
        }
        this.f5300j = charSequence;
        if ((this.f5292b & 8) != 0) {
            Toolbar toolbar = this.f5291a;
            toolbar.setTitle(charSequence);
            if (this.f5299i) {
                androidx.core.view.s0.s(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.b0
    public final boolean t() {
        return this.f5291a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.b0
    public final int u() {
        AppCompatSpinner appCompatSpinner = this.f5294d;
        if (appCompatSpinner != null) {
            return appCompatSpinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.b0
    public final void v(int i14) {
        this.f5291a.setVisibility(i14);
    }

    @Override // androidx.appcompat.widget.b0
    public final void w(String str) {
        this.f5302l = str;
        B();
    }

    @Override // androidx.appcompat.widget.b0
    public final void x(int i14) {
        AppCompatSpinner appCompatSpinner = this.f5294d;
        if (appCompatSpinner != null) {
            appCompatSpinner.setSelection(i14);
        } else {
            vb.h.z("Can't set dropdown selected position without an adapter");
        }
    }

    @Override // androidx.appcompat.widget.b0
    public final void y(p0 p0Var) {
        p0 p0Var2 = this.f5293c;
        Toolbar toolbar = this.f5291a;
        if (p0Var2 != null && p0Var2.getParent() == toolbar) {
            toolbar.removeView(this.f5293c);
        }
        this.f5293c = p0Var;
        if (p0Var == null || this.f5306p != 2) {
            return;
        }
        toolbar.addView(p0Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f5293c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f86545a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.b0
    public final void z(int i14) {
        this.f5297g = i14 != 0 ? j.a.a(this.f5291a.getContext(), i14) : null;
        C();
    }

    @Override // androidx.appcompat.widget.b0
    public final void setIcon(Drawable drawable) {
        this.f5296f = drawable;
        C();
    }

    public z0(Toolbar toolbar, boolean z14) {
        this(toolbar, z14, com.garmin.android.apps.connectmobile.R.string.abc_action_bar_up_description, com.garmin.android.apps.connectmobile.R.drawable.abc_ic_ab_back_material);
    }
}
