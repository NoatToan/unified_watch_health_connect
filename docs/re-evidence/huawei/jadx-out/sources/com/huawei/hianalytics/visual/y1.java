package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TabHost;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes33.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f11717a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f11718b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11719c = false;
    public static boolean d = false;
    public static Object e;
    public static Class f;
    public static Method g;
    public static Class h;
    public static Class i;

    public static boolean a(Class cls) {
        if (!f11717a) {
            b();
        }
        return h == cls || i == cls;
    }

    public static void b() {
        if (f11717a) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Field declaredField = cls.getDeclaredField("mViews");
            f11718b = declaredField;
            declaredField.setAccessible(true);
            if (f11718b.getType() == ArrayList.class) {
                f11719c = true;
            } else if (f11718b.getType() == View[].class) {
                d = true;
            }
            Field declaredField2 = cls.getDeclaredField("sDefaultWindowManager");
            declaredField2.setAccessible(true);
            e = declaredField2.get(null);
        } catch (Exception unused) {
        }
        try {
            f = Class.forName("com.android.internal.view.menu.ListMenuItemView");
            g = Class.forName("com.android.internal.view.menu.MenuView$ItemView").getDeclaredMethod("getItemData", new Class[0]);
        } catch (Exception unused2) {
        }
        try {
            try {
                h = Class.forName("com.android.internal.policy.PhoneWindow$DecorView");
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            h = Class.forName("com.android.internal.policy.DecorView");
        }
        try {
            i = Class.forName("android.widget.PopupWindow$PopupDecorView");
        } catch (Exception unused5) {
        }
        f11717a = true;
    }

    public static View[] a() {
        View[] viewArr;
        Object obj = e;
        if (obj == null) {
            m.a().getClass();
            Activity activityB = u.f11699c.b();
            return activityB == null ? new View[0] : new View[]{(activityB == null || activityB.getWindow() == null || !activityB.getWindow().isActive()) ? null : activityB.getWindow().getDecorView()};
        }
        View[] viewArr2 = new View[0];
        try {
            if (f11719c) {
                viewArr = (View[]) ((List) Objects.requireNonNull(f11718b.get(obj))).toArray(viewArr2);
            } else {
                if (d) {
                    viewArr = (View[]) f11718b.get(obj);
                }
                if (viewArr2 == null && viewArr2.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (View view : viewArr2) {
                        if (view != null) {
                            arrayList.add(view);
                        }
                    }
                    return (View[]) arrayList.toArray(new View[arrayList.size()]);
                }
                return new View[0];
            }
            viewArr2 = viewArr;
        } catch (Exception unused) {
        }
        if (viewArr2 == null) {
        }
        return new View[0];
    }

    public static View a(View view, MenuItem menuItem) {
        Object objA;
        View view2;
        HashMap map = v1.f11708a;
        if (!i1.a(menuItem, "androidx.appcompat.view.menu.ActionMenuItem") || menuItem.getItemId() != 16908332 || !i1.a(view.getParent(), "androidx.appcompat.widget.Toolbar", "android.support.v7.widget.Toolbar", "android.widget.Toolbar") || !(view instanceof ImageButton) || (view2 = (View) i1.a(i1.a(new String[]{"androidx.appcompat.widget.Toolbar", "android.support.v7.widget.Toolbar", "android.widget.Toolbar"}), view.getParent(), "mNavButtonView")) == null || view2 != view) {
            try {
                if (f == view.getClass()) {
                    objA = g.invoke(view, new Object[0]);
                } else {
                    objA = (i1.a(view, "androidx.appcompat.view.menu.ListMenuItemView") || i1.a(view, "android.support.v7.view.menu.ListMenuItemView") || i1.a(view, "com.google.android.material.bottomnavigation.BottomNavigationItemView", "android.support.design.internal.NavigationMenuItemView")) ? i1.a(view, "getItemData", new Object[0]) : null;
                }
            } catch (Exception unused) {
            }
            if (objA != menuItem) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View viewA = a(viewGroup.getChildAt(i2), menuItem);
                        if (viewA != null) {
                            return viewA;
                        }
                    }
                }
                return null;
            }
        }
        return view;
    }

    public static View a(View view, String str) {
        String str2;
        if (!(view instanceof TabHost)) {
            str2 = "";
        } else {
            str2 = (String) i1.a(view, "getCurrentTabTag", new Object[0]);
        }
        if (!TextUtils.isEmpty(str) && str.equals(str2)) {
            return (View) i1.a(view, "getCurrentTabView", new Object[0]);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View viewA = a(viewGroup.getChildAt(i2), str);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }
}
