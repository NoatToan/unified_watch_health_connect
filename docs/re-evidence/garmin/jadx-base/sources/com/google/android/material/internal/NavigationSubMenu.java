package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.s;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationSubMenu extends s {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, j jVar) {
        super(context, navigationMenu, jVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public void onItemsChanged(boolean z14) {
        super.onItemsChanged(z14);
        ((h) getParentMenu()).onItemsChanged(z14);
    }
}
