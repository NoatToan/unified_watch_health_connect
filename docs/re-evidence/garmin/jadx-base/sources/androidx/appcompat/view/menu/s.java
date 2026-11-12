package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class s extends h implements SubMenu {
    private j mItem;
    private h mParentMenu;

    public s(Context context, h hVar, j jVar) {
        super(context);
        this.mParentMenu = hVar;
        this.mItem = jVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean collapseItemActionView(j jVar) {
        return this.mParentMenu.collapseItemActionView(jVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean dispatchMenuItemSelected(h hVar, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(hVar, menuItem) || this.mParentMenu.dispatchMenuItemSelected(hVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean expandItemActionView(j jVar) {
        return this.mParentMenu.expandItemActionView(jVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public String getActionViewStatesKey() {
        j jVar = this.mItem;
        int i14 = jVar != null ? jVar.f4773a : 0;
        if (i14 == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + i14;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.h
    public h getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.h
    public void setCallback(h.a aVar) {
        this.mParentMenu.setCallback(aVar);
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public void setGroupDividerEnabled(boolean z14) {
        this.mParentMenu.setGroupDividerEnabled(z14);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view2) {
        return (SubMenu) super.setHeaderViewInt(view2);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public void setQwertyMode(boolean z14) {
        this.mParentMenu.setQwertyMode(z14);
    }

    @Override // androidx.appcompat.view.menu.h
    public void setShortcutsVisible(boolean z14) {
        this.mParentMenu.setShortcutsVisible(z14);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i14) {
        this.mItem.setIcon(i14);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i14) {
        return (SubMenu) super.setHeaderIconInt(i14);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i14) {
        return (SubMenu) super.setHeaderTitleInt(i14);
    }
}
