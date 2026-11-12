package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.core.view.c;
import defpackage.cqi;
import defpackage.ge0;
import defpackage.hpi;
import defpackage.i2j;
import defpackage.lwq;
import defpackage.of1;
import defpackage.owq;
import defpackage.qii;
import defpackage.ws5;
import defpackage.xfp;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b implements ws5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f1678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1679b;
    public View c;
    public Spinner d;
    public View e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1680k;
    public CharSequence l;
    public Window.Callback m;
    public boolean n;
    public ActionMenuPresenter o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f1681r;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ge0 f1682a;

        public a() {
            this.f1682a = new ge0(b.this.f1678a.getContext(), 0, R.id.home, 0, 0, b.this.j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            Window.Callback callback = bVar.m;
            if (callback == null || !bVar.n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1682a);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$b, reason: collision with other inner class name */
    public class C0011b extends owq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1684a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1685b;

        public C0011b(int i) {
            this.f1685b = i;
        }

        @Override // defpackage.owq, defpackage.nwq
        public void a(View view) {
            this.f1684a = true;
        }

        @Override // defpackage.nwq
        public void b(View view) {
            if (this.f1684a) {
                return;
            }
            b.this.f1678a.setVisibility(this.f1685b);
        }

        @Override // defpackage.owq, defpackage.nwq
        public void c(View view) {
            b.this.f1678a.setVisibility(0);
        }
    }

    public b(Toolbar toolbar, boolean z) {
        this(toolbar, z, i2j.f20704a, hpi.n);
    }

    @Override // defpackage.ws5
    public Menu A() {
        return this.f1678a.getMenu();
    }

    @Override // defpackage.ws5
    public lwq B(int i, long j) {
        return c.e(this.f1678a).b(i == 0 ? 1.0f : 0.0f).f(j).h(new C0011b(i));
    }

    @Override // defpackage.ws5
    public ViewGroup C() {
        return this.f1678a;
    }

    @Override // defpackage.ws5
    public void D(boolean z) {
    }

    @Override // defpackage.ws5
    public void E(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1678a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.p != 2) {
            return;
        }
        this.f1678a.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f1402a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // defpackage.ws5
    public void F(int i) {
        u(i != 0 ? of1.b(getContext(), i) : null);
    }

    @Override // defpackage.ws5
    public void G(int i) {
        x(i != 0 ? of1.b(getContext(), i) : null);
    }

    @Override // defpackage.ws5
    public void H(i.a aVar, e.a aVar2) {
        this.f1678a.M(aVar, aVar2);
    }

    @Override // defpackage.ws5
    public void I(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        L();
        this.d.setAdapter(spinnerAdapter);
        this.d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // defpackage.ws5
    public CharSequence J() {
        return this.f1678a.getSubtitle();
    }

    public final int K() {
        if (this.f1678a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1681r = this.f1678a.getNavigationIcon();
        return 15;
    }

    public final void L() {
        if (this.d == null) {
            this.d = new AppCompatSpinner(getContext(), null, qii.i);
            this.d.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    public void M(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        if (TextUtils.isEmpty(this.f1678a.getNavigationContentDescription())) {
            o(this.q);
        }
    }

    public final void N(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f1679b & 8) != 0) {
            this.f1678a.setTitle(charSequence);
            if (this.i) {
                c.u0(this.f1678a.getRootView(), charSequence);
            }
        }
    }

    public final void O() {
        if ((this.f1679b & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.f1678a.setNavigationContentDescription(this.q);
            } else {
                this.f1678a.setNavigationContentDescription(this.l);
            }
        }
    }

    public final void P() {
        if ((this.f1679b & 4) == 0) {
            this.f1678a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1678a;
        Drawable drawable = this.h;
        if (drawable == null) {
            drawable = this.f1681r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void Q() {
        Drawable drawable;
        int i = this.f1679b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.g) == null) {
            drawable = this.f;
        }
        this.f1678a.setLogo(drawable);
    }

    @Override // defpackage.ws5
    public boolean a() {
        return this.f1678a.d();
    }

    @Override // defpackage.ws5
    public boolean b() {
        return this.f1678a.R();
    }

    @Override // defpackage.ws5
    public boolean c() {
        return this.f1678a.B();
    }

    @Override // defpackage.ws5
    public void collapseActionView() {
        this.f1678a.e();
    }

    @Override // defpackage.ws5
    public boolean d() {
        return this.f1678a.w();
    }

    @Override // defpackage.ws5
    public void e(Menu menu, i.a aVar) {
        if (this.o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1678a.getContext());
            this.o = actionMenuPresenter;
            actionMenuPresenter.o(cqi.g);
        }
        this.o.f(aVar);
        this.f1678a.L((e) menu, this.o);
    }

    @Override // defpackage.ws5
    public void f() {
        this.n = true;
    }

    @Override // defpackage.ws5
    public boolean g() {
        return this.f1678a.A();
    }

    @Override // defpackage.ws5
    public Context getContext() {
        return this.f1678a.getContext();
    }

    @Override // defpackage.ws5
    public int getHeight() {
        return this.f1678a.getHeight();
    }

    @Override // defpackage.ws5
    public CharSequence getTitle() {
        return this.f1678a.getTitle();
    }

    @Override // defpackage.ws5
    public int getVisibility() {
        return this.f1678a.getVisibility();
    }

    @Override // defpackage.ws5
    public boolean h() {
        return this.f1678a.v();
    }

    @Override // defpackage.ws5
    public boolean i() {
        return this.f1678a.C();
    }

    @Override // defpackage.ws5
    public void j(int i) {
        View view;
        int i2 = this.f1679b ^ i;
        this.f1679b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    O();
                }
                P();
            }
            if ((i2 & 3) != 0) {
                Q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1678a.setTitle(this.j);
                    this.f1678a.setSubtitle(this.f1680k);
                } else {
                    this.f1678a.setTitle((CharSequence) null);
                    this.f1678a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.e) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1678a.addView(view);
            } else {
                this.f1678a.removeView(view);
            }
        }
    }

    @Override // defpackage.ws5
    public void k(CharSequence charSequence) {
        this.l = charSequence;
        O();
    }

    @Override // defpackage.ws5
    public int l() {
        return this.p;
    }

    @Override // defpackage.ws5
    public void m(int i) {
        View view;
        int i2 = this.p;
        if (i != i2) {
            if (i2 == 1) {
                Spinner spinner = this.d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f1678a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.d);
                    }
                }
            } else if (i2 == 2 && (view = this.c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f1678a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.c);
                }
            }
            this.p = i;
            if (i != 0) {
                if (i == 1) {
                    L();
                    this.f1678a.addView(this.d, 0);
                    return;
                }
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i);
                }
                View view2 = this.c;
                if (view2 != null) {
                    this.f1678a.addView(view2, 0);
                    Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.c.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                    layoutParams.f1402a = 8388691;
                }
            }
        }
    }

    @Override // defpackage.ws5
    public int n() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // defpackage.ws5
    public void o(int i) {
        k(i == 0 ? null : getContext().getString(i));
    }

    @Override // defpackage.ws5
    public void p() {
    }

    @Override // defpackage.ws5
    public int q() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // defpackage.ws5
    public void r(boolean z) {
        this.f1678a.setCollapsible(z);
    }

    @Override // defpackage.ws5
    public void s() {
        this.f1678a.f();
    }

    @Override // defpackage.ws5
    public void setBackgroundDrawable(Drawable drawable) {
        c.v0(this.f1678a, drawable);
    }

    @Override // defpackage.ws5
    public void setCustomView(View view) {
        View view2 = this.e;
        if (view2 != null && (this.f1679b & 16) != 0) {
            this.f1678a.removeView(view2);
        }
        this.e = view;
        if (view == null || (this.f1679b & 16) == 0) {
            return;
        }
        this.f1678a.addView(view);
    }

    @Override // defpackage.ws5
    public void setIcon(int i) {
        setIcon(i != 0 ? of1.b(getContext(), i) : null);
    }

    @Override // defpackage.ws5
    public void setTitle(CharSequence charSequence) {
        this.i = true;
        N(charSequence);
    }

    @Override // defpackage.ws5
    public void setVisibility(int i) {
        this.f1678a.setVisibility(i);
    }

    @Override // defpackage.ws5
    public void setWindowCallback(Window.Callback callback) {
        this.m = callback;
    }

    @Override // defpackage.ws5
    public void setWindowTitle(CharSequence charSequence) {
        if (this.i) {
            return;
        }
        N(charSequence);
    }

    @Override // defpackage.ws5
    public View t() {
        return this.e;
    }

    @Override // defpackage.ws5
    public void u(Drawable drawable) {
        this.g = drawable;
        Q();
    }

    @Override // defpackage.ws5
    public int v() {
        return this.f1679b;
    }

    @Override // defpackage.ws5
    public void w() {
    }

    @Override // defpackage.ws5
    public void x(Drawable drawable) {
        this.h = drawable;
        P();
    }

    @Override // defpackage.ws5
    public void y(CharSequence charSequence) {
        this.f1680k = charSequence;
        if ((this.f1679b & 8) != 0) {
            this.f1678a.setSubtitle(charSequence);
        }
    }

    @Override // defpackage.ws5
    public void z(int i) {
        Spinner spinner = this.d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i);
    }

    public b(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.p = 0;
        this.q = 0;
        this.f1678a = toolbar;
        this.j = toolbar.getTitle();
        this.f1680k = toolbar.getSubtitle();
        this.i = this.j != null;
        this.h = toolbar.getNavigationIcon();
        xfp xfpVarV = xfp.v(toolbar.getContext(), null, z5j.f40915a, qii.c, 0);
        this.f1681r = xfpVarV.g(z5j.l);
        if (z) {
            CharSequence charSequenceP = xfpVarV.p(z5j.f40918r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = xfpVarV.p(z5j.p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                y(charSequenceP2);
            }
            Drawable drawableG = xfpVarV.g(z5j.n);
            if (drawableG != null) {
                u(drawableG);
            }
            Drawable drawableG2 = xfpVarV.g(z5j.m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.h == null && (drawable = this.f1681r) != null) {
                x(drawable);
            }
            j(xfpVarV.k(z5j.h, 0));
            int iN = xfpVarV.n(z5j.g, 0);
            if (iN != 0) {
                setCustomView(LayoutInflater.from(this.f1678a.getContext()).inflate(iN, (ViewGroup) this.f1678a, false));
                j(this.f1679b | 16);
            }
            int iM = xfpVarV.m(z5j.j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1678a.getLayoutParams();
                layoutParams.height = iM;
                this.f1678a.setLayoutParams(layoutParams);
            }
            int iE = xfpVarV.e(z5j.f, -1);
            int iE2 = xfpVarV.e(z5j.e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1678a.K(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = xfpVarV.n(z5j.s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1678a;
                toolbar2.O(toolbar2.getContext(), iN2);
            }
            int iN3 = xfpVarV.n(z5j.q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1678a;
                toolbar3.N(toolbar3.getContext(), iN3);
            }
            int iN4 = xfpVarV.n(z5j.o, 0);
            if (iN4 != 0) {
                this.f1678a.setPopupTheme(iN4);
            }
        } else {
            this.f1679b = K();
        }
        xfpVarV.w();
        M(i);
        this.l = this.f1678a.getNavigationContentDescription();
        this.f1678a.setNavigationOnClickListener(new a());
    }

    @Override // defpackage.ws5
    public void setIcon(Drawable drawable) {
        this.f = drawable;
        Q();
    }
}
