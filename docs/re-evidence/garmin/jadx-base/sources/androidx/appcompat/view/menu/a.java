package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a implements e7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f4693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f4694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f4695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f4696g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f4698i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f4700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f4701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f4702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f4703n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4697h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4699j = 4096;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f4704o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PorterDuff.Mode f4705p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4706q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4707r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4708s = 16;

    public a(Context context, int i14, int i15, int i16, int i17, CharSequence charSequence) {
        this.f4701l = context;
        this.f4690a = i15;
        this.f4691b = i14;
        this.f4692c = i17;
        this.f4693d = charSequence;
    }

    @Override // e7.b
    public final androidx.core.view.b a() {
        return null;
    }

    @Override // e7.b
    public final e7.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f4700k;
        if (drawable != null) {
            if (this.f4706q || this.f4707r) {
                this.f4700k = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f4700k = drawableMutate;
                if (this.f4706q) {
                    drawableMutate.setTintList(this.f4704o);
                }
                if (this.f4707r) {
                    this.f4700k.setTintMode(this.f4705p);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // e7.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4699j;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4698i;
    }

    @Override // e7.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4702m;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4691b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f4700k;
    }

    @Override // e7.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4704o;
    }

    @Override // e7.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4705p;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4695f;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4690a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // e7.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4697h;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4696g;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4692c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4693d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4694e;
        return charSequence != null ? charSequence : this.f4693d;
    }

    @Override // e7.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4703n;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4708s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4708s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4708s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4708s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view2) {
        throw new UnsupportedOperationException();
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c14, int i14) {
        this.f4698i = Character.toLowerCase(c14);
        this.f4699j = KeyEvent.normalizeMetaState(i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z14) {
        this.f4708s = (z14 ? 1 : 0) | (this.f4708s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z14) {
        this.f4708s = (z14 ? 2 : 0) | (this.f4708s & (-3));
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f4702m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z14) {
        this.f4708s = (z14 ? 16 : 0) | (this.f4708s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i14) {
        this.f4700k = a7.b.getDrawable(this.f4701l, i14);
        c();
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4704o = colorStateList;
        this.f4706q = true;
        c();
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4705p = mode;
        this.f4707r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4695f = intent;
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c14, int i14) {
        this.f4696g = c14;
        this.f4697h = KeyEvent.normalizeMetaState(i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setShortcut(char c14, char c15, int i14, int i15) {
        this.f4696g = c14;
        this.f4697h = KeyEvent.normalizeMetaState(i14);
        this.f4698i = Character.toLowerCase(c15);
        this.f4699j = KeyEvent.normalizeMetaState(i15);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i14) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i14) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i14) {
        this.f4693d = this.f4701l.getResources().getString(i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4694e = charSequence;
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f4703n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z14) {
        this.f4708s = (this.f4708s & 8) | (z14 ? 0 : 8);
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final e7.b setContentDescription(CharSequence charSequence) {
        this.f4702m = charSequence;
        return this;
    }

    @Override // e7.b, android.view.MenuItem
    public final e7.b setTooltipText(CharSequence charSequence) {
        this.f4703n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i14) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c14) {
        this.f4696g = c14;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4700k = drawable;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c14) {
        this.f4698i = Character.toLowerCase(c14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4693d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c14, char c15) {
        this.f4696g = c14;
        this.f4698i = Character.toLowerCase(c15);
        return this;
    }
}
