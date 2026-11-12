package com.google.android.material.bottomnavigation;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import defpackage.kwi;
import defpackage.pmi;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int getItemDefaultMarginResId() {
        return pmi.f;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int getItemLayoutResId() {
        return kwi.f24371a;
    }
}
