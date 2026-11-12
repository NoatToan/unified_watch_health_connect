package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import defpackage.ayq;
import defpackage.wc1;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        return (tabLayout.z() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.TabView) view, 24);
    }

    public static RectF b(TabLayout.TabView tabView, @Dimension(unit = 0) int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iD = (int) ayq.d(tabView.getContext(), i);
        if (contentWidth < iD) {
            contentWidth = iD;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    public void c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, to = 1.0d) float f, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(wc1.c((int) rectFA.left, (int) rectFA2.left, f), drawable.getBounds().top, wc1.c((int) rectFA.right, (int) rectFA2.right, f), drawable.getBounds().bottom);
    }
}
