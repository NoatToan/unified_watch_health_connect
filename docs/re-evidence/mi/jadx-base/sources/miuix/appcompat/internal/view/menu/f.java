package miuix.appcompat.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import defpackage.jrk;
import defpackage.nx1;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements MenuItem {
    public static String C;
    public static String D;
    public static String E;
    public static String F;
    public ContextMenu.ContextMenuInfo B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26545b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Intent h;
    public char i;
    public char j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public nx1 f26546k;
    public int n;
    public Drawable o;
    public d q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f26547r;
    public Runnable s;
    public MenuItem.OnMenuItemClickListener t;
    public int v;
    public View w;
    public View x;
    public ActionProvider y;
    public MenuItem.OnActionExpandListener z;
    public boolean l = false;
    public boolean m = false;
    public int p = 0;
    public int u = 16;
    public boolean A = false;

    public f(d dVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.q = dVar;
        this.f26544a = i2;
        this.f26545b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.v = i5;
    }

    public void A(View view) {
        this.x = view;
    }

    public boolean B(boolean z) {
        int i = this.u;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.u = i2;
        return i != i2;
    }

    public boolean C() {
        return this.q.y();
    }

    public boolean D() {
        return this.q.E() && e() != 0;
    }

    public void E() {
        View view;
        if (this.l && (view = this.x) != null && view.getVisibility() == 0) {
            c().b(this.x, this.n);
            this.m = true;
            return;
        }
        nx1 nx1Var = this.f26546k;
        if (nx1Var != null) {
            nx1Var.d();
            this.f26546k = null;
            this.m = false;
        } else {
            View view2 = this.x;
            if (view2 != null) {
                view2.getOverlay().clear();
                this.m = false;
            }
        }
    }

    public final nx1 c() {
        if (this.f26546k == null) {
            this.f26546k = new nx1(this.q.s());
        }
        return this.f26546k;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        return (this.v & 8) != 0 && (this.w == null || (((onActionExpandListener = this.z) == null || onActionExpandListener.onMenuItemActionCollapse(this)) && this.q.f(this)));
    }

    public int d() {
        return this.d;
    }

    public char e() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        return ((this.v & 8) == 0 || this.w == null || ((onActionExpandListener = this.z) != null && !onActionExpandListener.onMenuItemActionExpand(this)) || !this.q.j(this)) ? false : true;
    }

    public String f() {
        char cE = e();
        if (cE == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(C);
        if (cE == '\b') {
            sb.append(E);
        } else if (cE == '\n') {
            sb.append(D);
        } else if (cE != ' ') {
            sb.append(cE);
        } else {
            sb.append(F);
        }
        return sb.toString();
    }

    public ActionProvider g() {
        return this.y;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("Implementation should use getSupportActionProvider!");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.w;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.y;
        if (actionProvider == null) {
            return null;
        }
        View viewOnCreateActionView = actionProvider.onCreateActionView(this);
        this.w = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f26545b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.o;
        if (drawable != null) {
            return drawable;
        }
        if (this.p == 0) {
            return null;
        }
        Drawable drawableF = jrk.f(this.q.A(), this.p, this.q.s().getTheme());
        this.p = 0;
        this.o = drawableF;
        return drawableF;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.h;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f26544a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f26547r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    public CharSequence h(i.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f26547r != null;
    }

    public View i() {
        return this.x;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.u & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.u & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.u & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.y;
        if (actionProvider == null || !actionProvider.overridesItemVisibility()) {
            return (this.u & 8) == 0;
        }
        return (this.u & 8) == 0 && this.y.isVisible();
    }

    public boolean j() {
        return this.m;
    }

    public boolean k() {
        return ((this.v & 8) == 0 || this.w == null) ? false : true;
    }

    public boolean l() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.t;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        d dVar = this.q;
        if (dVar.g(dVar.B(), this)) {
            return true;
        }
        Runnable runnable = this.s;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.h != null) {
            try {
                this.q.s().startActivity(this.h);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ActionProvider actionProvider = this.y;
        return actionProvider != null && actionProvider.onPerformDefaultAction();
    }

    public boolean m() {
        return (this.u & 32) == 32;
    }

    public boolean n() {
        return (this.u & 4) != 0;
    }

    public boolean o() {
        return (this.v & 1) == 1;
    }

    public boolean p() {
        return (this.v & 2) == 2;
    }

    public void q(boolean z) {
        this.A = z;
        this.q.H(false);
    }

    public void r(boolean z) {
        s(z, 2);
    }

    public void s(boolean z, int i) {
        this.l = z;
        this.n = i;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("Implementation should use setSupportActionProvider!");
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        int i;
        this.w = view;
        this.x = view;
        this.y = null;
        if (view != null && view.getId() == -1 && (i = this.f26544a) > 0) {
            view.setId(i);
        }
        this.q.F(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.u;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.u = i2;
        if (i != i2) {
            this.q.H(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.u & 4) != 0) {
            this.q.P(this);
        } else {
            t(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.g = charSequence;
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.u |= 16;
        } else {
            this.u &= -17;
        }
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.p = 0;
        this.o = drawable;
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.h = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.i == c) {
            return this;
        }
        this.i = c;
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        return z(onActionExpandListener);
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.t = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.i = c;
        this.j = Character.toLowerCase(c2);
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.v = i;
        this.q.F(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.q.H(false);
        j jVar = this.f26547r;
        if (jVar != null) {
            jVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (B(z)) {
            this.q.G(this);
        }
        return this;
    }

    public void t(boolean z) {
        int i = this.u;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.u = i2;
        if (i != i2) {
            this.q.H(false);
        }
    }

    public String toString() {
        return this.e.toString();
    }

    public void u(boolean z) {
        this.u = (z ? 4 : 0) | (this.u & (-5));
    }

    public void v(boolean z) {
        if (z) {
            this.u |= 32;
        } else {
            this.u &= -33;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w(d dVar) {
        this.q = dVar;
    }

    public void x(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.B = contextMenuInfo;
    }

    public void y(j jVar) {
        this.f26547r = jVar;
        jVar.setHeaderTitle(getTitle());
    }

    public MenuItem z(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.z = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.o = null;
        this.p = i;
        this.q.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.q.s().getString(i));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context contextS = this.q.s();
        setActionView(LayoutInflater.from(contextS).inflate(i, (ViewGroup) new LinearLayout(contextS), false));
        return this;
    }
}
