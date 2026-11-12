package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import hb.a;

/* JADX INFO: loaded from: classes14.dex */
public final class NavigationBarMenu extends h {
    private final int maxItemCount;
    private final Class<?> viewClass;

    public NavigationBarMenu(Context context, Class<?> cls, int i14) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i14;
    }

    @Override // androidx.appcompat.view.menu.h
    public MenuItem addInternal(int i14, int i15, int i16, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i14, i15, i16, charSequence);
            if (menuItemAddInternal instanceof j) {
                ((j) menuItemAddInternal).f(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbL = a.l("Maximum number of items supported by ", simpleName, " is ");
        sbL.append(this.maxItemCount);
        sbL.append(". Limit can be checked with ");
        sbL.append(simpleName);
        sbL.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbL.toString());
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public SubMenu addSubMenu(int i14, int i15, int i16, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
