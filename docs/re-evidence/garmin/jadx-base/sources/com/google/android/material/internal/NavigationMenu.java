package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationMenu extends h {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public SubMenu addSubMenu(int i14, int i15, int i16, CharSequence charSequence) {
        j jVar = (j) addInternal(i14, i15, i16, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, jVar);
        jVar.f4787o = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(jVar.f4777e);
        return navigationSubMenu;
    }
}
