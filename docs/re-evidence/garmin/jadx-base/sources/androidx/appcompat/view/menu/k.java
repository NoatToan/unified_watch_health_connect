package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class k extends androidx.appcompat.view.menu.c implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e7.b f4800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f4801e;

    public class a extends androidx.core.view.b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j.a f4802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActionProvider f4803b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f4803b = actionProvider;
        }

        @Override // androidx.core.view.b
        public final boolean a() {
            return this.f4803b.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public final boolean b() {
            return this.f4803b.isVisible();
        }

        @Override // androidx.core.view.b
        public final View c() {
            return this.f4803b.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public final View d(j jVar) {
            return this.f4803b.onCreateActionView(jVar);
        }

        @Override // androidx.core.view.b
        public final boolean e() {
            return this.f4803b.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public final void f(s sVar) {
            this.f4803b.onPrepareSubMenu(k.this.d(sVar));
        }

        @Override // androidx.core.view.b
        public final boolean g() {
            return this.f4803b.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public final void h(j.a aVar) {
            this.f4802a = aVar;
            this.f4803b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z14) {
            j.a aVar = this.f4802a;
            if (aVar != null) {
                j jVar = j.this;
                jVar.f4786n.onItemVisibleChanged(jVar);
            }
        }
    }

    public static class b extends FrameLayout implements m.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f4805a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view2) {
            super(view2.getContext());
            this.f4805a = (CollapsibleActionView) view2;
            addView(view2);
        }

        @Override // m.c
        public final void onActionViewCollapsed() {
            this.f4805a.onActionViewCollapsed();
        }

        @Override // m.c
        public final void onActionViewExpanded() {
            this.f4805a.onActionViewExpanded();
        }
    }

    public class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f4806a;

        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f4806a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f4806a.onMenuItemActionCollapse(k.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f4806a.onMenuItemActionExpand(k.this.c(menuItem));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f4808a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f4808a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f4808a.onMenuItemClick(k.this.c(menuItem));
        }
    }

    public k(Context context, e7.b bVar) {
        super(context);
        if (bVar != null) {
            this.f4800d = bVar;
        } else {
            vb.h.s("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f4800d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f4800d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        androidx.core.view.b bVarA = this.f4800d.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f4803b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f4800d.getActionView();
        return actionView instanceof b ? (View) ((b) actionView).f4805a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4800d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4800d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4800d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4800d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f4800d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4800d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4800d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4800d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4800d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4800d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4800d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4800d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4800d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return d(this.f4800d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4800d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f4800d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4800d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4800d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4800d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f4800d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f4800d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f4800d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f4800d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f4718a, actionProvider);
        if (actionProvider == null) {
            aVar = null;
        }
        this.f4800d.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i14) {
        e7.b bVar = this.f4800d;
        bVar.setActionView(i14);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c14) {
        this.f4800d.setAlphabeticShortcut(c14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z14) {
        this.f4800d.setCheckable(z14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z14) {
        this.f4800d.setChecked(z14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f4800d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z14) {
        this.f4800d.setEnabled(z14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4800d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4800d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4800d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4800d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c14) {
        this.f4800d.setNumericShortcut(c14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4800d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4800d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c14, char c15) {
        this.f4800d.setShortcut(c14, c15);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i14) {
        this.f4800d.setShowAsAction(i14);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i14) {
        this.f4800d.setShowAsActionFlags(i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4800d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4800d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f4800d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z14) {
        return this.f4800d.setVisible(z14);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c14, int i14) {
        this.f4800d.setAlphabeticShortcut(c14, i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i14) {
        this.f4800d.setIcon(i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c14, int i14) {
        this.f4800d.setNumericShortcut(c14, i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c14, char c15, int i14, int i15) {
        this.f4800d.setShortcut(c14, c15, i14, i15);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i14) {
        this.f4800d.setTitle(i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view2) {
        if (view2 instanceof CollapsibleActionView) {
            view2 = new b(view2);
        }
        this.f4800d.setActionView(view2);
        return this;
    }
}
