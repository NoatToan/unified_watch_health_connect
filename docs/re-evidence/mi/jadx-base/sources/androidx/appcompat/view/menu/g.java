package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import defpackage.i2j;
import defpackage.k47;
import defpackage.oe0;
import defpackage.of1;
import defpackage.xpo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class g implements xpo {
    public View A;
    public oe0 B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1509b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public e n;
    public k o;
    public Runnable p;
    public MenuItem.OnMenuItemClickListener q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f1511r;
    public CharSequence s;
    public int z;
    public int i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1510k = 4096;
    public int m = 0;
    public ColorStateList t = null;
    public PorterDuff.Mode u = null;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public int y = 16;
    public boolean D = false;

    public class a implements oe0.b {
        public a() {
        }

        @Override // oe0.b
        public void onActionProviderVisibilityChanged(boolean z) {
            g gVar = g.this;
            gVar.n.L(gVar);
        }
    }

    public g(e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = eVar;
        this.f1508a = i2;
        this.f1509b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.z = i5;
    }

    public static void d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.n.J() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // defpackage.xpo
    public xpo a(oe0 oe0Var) {
        oe0 oe0Var2 = this.B;
        if (oe0Var2 != null) {
            oe0Var2.h();
        }
        this.A = null;
        this.B = oe0Var;
        this.n.M(true);
        oe0 oe0Var3 = this.B;
        if (oe0Var3 != null) {
            oe0Var3.j(new a());
        }
        return this;
    }

    @Override // defpackage.xpo
    public oe0 b() {
        return this.B;
    }

    public void c() {
        this.n.K(this);
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = k47.r(drawable).mutate();
            if (this.v) {
                k47.o(drawable, this.t);
            }
            if (this.w) {
                k47.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.m(this);
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public char g() {
        return this.n.I() ? this.j : this.h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        oe0 oe0Var = this.B;
        if (oe0Var == null) {
            return null;
        }
        View viewD = oe0Var.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1510k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1511r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1509b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable drawableB = of1.b(this.n.w(), this.m);
        this.m = 0;
        this.l = drawableB;
        return e(drawableB);
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1508a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
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

    @Override // defpackage.xpo, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    public String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(i2j.o));
        }
        int i = this.n.I() ? this.f1510k : this.i;
        d(sb, i, 65536, resources.getString(i2j.f20706k));
        d(sb, i, 4096, resources.getString(i2j.g));
        d(sb, i, 2, resources.getString(i2j.f));
        d(sb, i, 1, resources.getString(i2j.l));
        d(sb, i, 4, resources.getString(i2j.n));
        d(sb, i, 8, resources.getString(i2j.j));
        if (cG == '\b') {
            sb.append(resources.getString(i2j.h));
        } else if (cG == '\n') {
            sb.append(resources.getString(i2j.i));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(i2j.m));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public CharSequence i(MenuView.ItemView itemView) {
        return (itemView == null || !itemView.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        oe0 oe0Var = this.B;
        if (oe0Var == null || !oe0Var.g()) {
            return (this.y & 8) == 0;
        }
        return (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        oe0 oe0Var;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (oe0Var = this.B) != null) {
            this.A = oe0Var.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.w().startActivity(this.g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        oe0 oe0Var = this.B;
        return oe0Var != null && oe0Var.e();
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public xpo setActionView(int i) {
        Context contextW = this.n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public xpo setActionView(View view) {
        int i;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i = this.f1508a) > 0) {
            view.setId(i);
        }
        this.n.K(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.n.M(false);
    }

    public void s(boolean z) {
        int i = this.y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.y = i2;
        if (i != i2) {
            this.n.M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.y = i2;
        if (i != i2) {
            this.n.M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.X(this);
        } else {
            s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i;
        this.n.K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.M(false);
        k kVar = this.o;
        if (kVar != null) {
            kVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.n.L(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public xpo setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public void x(k kVar) {
        this.o = kVar;
        kVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z) {
        int i = this.y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.y = i2;
        return i != i2;
    }

    public boolean z() {
        return this.n.C();
    }

    @Override // android.view.MenuItem
    public xpo setContentDescription(CharSequence charSequence) {
        this.f1511r = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public xpo setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.M(false);
        return this;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.f1510k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.f1510k = KeyEvent.normalizeMetaState(i);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.M(false);
        return this;
    }

    @Override // defpackage.xpo, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.f1510k = KeyEvent.normalizeMetaState(i2);
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.x = true;
        this.n.M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.n.w().getString(i));
    }
}
