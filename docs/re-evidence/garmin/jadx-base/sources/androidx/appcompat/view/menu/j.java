package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class j implements e7.b {
    public androidx.core.view.b A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f4777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f4778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f4779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f4780h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f4782j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f4784l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f4786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f4787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f4789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f4790r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4797y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f4798z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4781i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4783k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4785m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f4791s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f4792t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4793u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4794v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4795w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4796x = 16;
    public boolean C = false;

    public class a {
        public a() {
        }
    }

    public j(h hVar, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18) {
        this.f4786n = hVar;
        this.f4773a = i15;
        this.f4774b = i14;
        this.f4775c = i16;
        this.f4776d = i17;
        this.f4777e = charSequence;
        this.f4797y = i18;
    }

    public static void c(int i14, int i15, String str, StringBuilder sb3) {
        if ((i14 & i15) == i15) {
            sb3.append(str);
        }
    }

    @Override // e7.b
    public final androidx.core.view.b a() {
        return this.A;
    }

    @Override // e7.b
    public final e7.b b(androidx.core.view.b bVar) {
        this.f4798z = null;
        this.A = bVar;
        this.f4786n.onItemsChanged(true);
        androidx.core.view.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.h(new a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4797y & 8) == 0) {
            return false;
        }
        if (this.f4798z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4786n.collapseItemActionView(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f4795w && (this.f4793u || this.f4794v)) {
            drawable = drawable.mutate();
            if (this.f4793u) {
                drawable.setTintList(this.f4791s);
            }
            if (this.f4794v) {
                drawable.setTintMode(this.f4792t);
            }
            this.f4795w = false;
        }
        return drawable;
    }

    public final boolean e() {
        androidx.core.view.b bVar;
        if ((this.f4797y & 8) == 0) {
            return false;
        }
        if (this.f4798z == null && (bVar = this.A) != null) {
            this.f4798z = bVar.d(this);
        }
        return this.f4798z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4786n.expandItemActionView(this);
        }
        return false;
    }

    public final void f(boolean z14) {
        this.f4796x = (z14 ? 4 : 0) | (this.f4796x & (-5));
    }

    public final void g(boolean z14) {
        int i14 = this.f4796x;
        if (z14) {
            this.f4796x = i14 | 32;
        } else {
            this.f4796x = i14 & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view2 = this.f4798z;
        if (view2 != null) {
            return view2;
        }
        androidx.core.view.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.f4798z = viewD;
        return viewD;
    }

    @Override // e7.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4783k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4782j;
    }

    @Override // e7.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4789q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4774b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4784l;
        if (drawable != null) {
            return d(drawable);
        }
        if (this.f4785m == 0) {
            return null;
        }
        Drawable drawableA = j.a.a(this.f4786n.getContext(), this.f4785m);
        this.f4785m = 0;
        this.f4784l = drawableA;
        return d(drawableA);
    }

    @Override // e7.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4791s;
    }

    @Override // e7.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4792t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4779g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f4773a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // e7.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4781i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4780h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4775c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4787o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f4777e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4778f;
        return charSequence != null ? charSequence : this.f4777e;
    }

    @Override // e7.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4790r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4787o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4796x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4796x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4796x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        androidx.core.view.b bVar = this.A;
        if (bVar == null || !bVar.g()) {
            return (this.f4796x & 8) == 0;
        }
        return (this.f4796x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i14) {
        int i15;
        h hVar = this.f4786n;
        Context context = hVar.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i14, (ViewGroup) new LinearLayout(context), false);
        this.f4798z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i15 = this.f4773a) > 0) {
            viewInflate.setId(i15);
        }
        hVar.onItemActionRequestChanged(this);
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c14, int i14) {
        if (this.f4782j == c14 && this.f4783k == i14) {
            return this;
        }
        this.f4782j = Character.toLowerCase(c14);
        this.f4783k = KeyEvent.normalizeMetaState(i14);
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z14) {
        int i14 = this.f4796x;
        int i15 = (z14 ? 1 : 0) | (i14 & (-2));
        this.f4796x = i15;
        if (i14 != i15) {
            this.f4786n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z14) {
        int i14 = this.f4796x;
        int i15 = i14 & 4;
        h hVar = this.f4786n;
        if (i15 != 0) {
            hVar.setExclusiveItemChecked(this);
            return this;
        }
        int i16 = (z14 ? 2 : 0) | (i14 & (-3));
        this.f4796x = i16;
        if (i14 != i16) {
            hVar.onItemsChanged(false);
        }
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final e7.b setContentDescription(CharSequence charSequence) {
        this.f4789q = charSequence;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z14) {
        int i14 = this.f4796x;
        if (z14) {
            this.f4796x = i14 | 16;
        } else {
            this.f4796x = i14 & (-17);
        }
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i14) {
        this.f4784l = null;
        this.f4785m = i14;
        this.f4795w = true;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4791s = colorStateList;
        this.f4793u = true;
        this.f4795w = true;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4792t = mode;
        this.f4794v = true;
        this.f4795w = true;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4779g = intent;
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c14, int i14) {
        if (this.f4780h == c14 && this.f4781i == i14) {
            return this;
        }
        this.f4780h = c14;
        this.f4781i = KeyEvent.normalizeMetaState(i14);
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4788p = onMenuItemClickListener;
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setShortcut(char c14, char c15, int i14, int i15) {
        this.f4780h = c14;
        this.f4781i = KeyEvent.normalizeMetaState(i14);
        this.f4782j = Character.toLowerCase(c15);
        this.f4783k = KeyEvent.normalizeMetaState(i15);
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i14) {
        int i15 = i14 & 3;
        if (i15 != 0 && i15 != 1 && i15 != 2) {
            vb.h.s("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        } else {
            this.f4797y = i14;
            this.f4786n.onItemActionRequestChanged(this);
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i14) {
        setShowAsAction(i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4777e = charSequence;
        this.f4786n.onItemsChanged(false);
        s sVar = this.f4787o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4778f = charSequence;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final e7.b setTooltipText(CharSequence charSequence) {
        this.f4790r = charSequence;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z14) {
        int i14 = this.f4796x;
        int i15 = (z14 ? 0 : 8) | (i14 & (-9));
        this.f4796x = i15;
        if (i14 != i15) {
            this.f4786n.onItemVisibleChanged(this);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4777e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // e7.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4785m = 0;
        this.f4784l = drawable;
        this.f4795w = true;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i14) {
        setTitle(this.f4786n.getContext().getString(i14));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c14) {
        if (this.f4780h == c14) {
            return this;
        }
        this.f4780h = c14;
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c14, char c15) {
        this.f4780h = c14;
        this.f4782j = Character.toLowerCase(c15);
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c14) {
        if (this.f4782j == c14) {
            return this;
        }
        this.f4782j = Character.toLowerCase(c14);
        this.f4786n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view2) {
        int i14;
        this.f4798z = view2;
        this.A = null;
        if (view2 != null && view2.getId() == -1 && (i14 = this.f4773a) > 0) {
            view2.setId(i14);
        }
        this.f4786n.onItemActionRequestChanged(this);
        return this;
    }
}
