package com.huawei.hianalytics.visual;

import android.view.View;
import android.view.ViewGroup;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes33.dex */
public abstract class k0 {
    public static boolean a(View view) {
        if (!Pattern.matches("^([A-Za-z]|[0-9])", v1.c(view))) {
            return false;
        }
        if (!(view.getParent() instanceof ViewGroup)) {
            return b((View) view.getParent());
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            return false;
        }
        if (viewGroup.getTag(R.id.hianalytics_keyboard_view_tag) != null) {
            return true;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        int childCount = viewGroup.getChildCount();
        if (childCount <= 1) {
            return b(viewGroup);
        }
        for (int i = 0; i < childCount; i++) {
            if (i != iIndexOfChild && Pattern.matches("^([A-Za-z]|[0-9])", v1.e(viewGroup.getChildAt(i)))) {
                viewGroup.setTag(R.id.hianalytics_keyboard_view_tag, Boolean.TRUE);
                return true;
            }
        }
        return b(viewGroup);
    }

    public static boolean b(View view) {
        ViewGroup viewGroup;
        if (view == null || !(view.getParent() instanceof ViewGroup) || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return false;
        }
        if (viewGroup.getTag(R.id.hianalytics_keyboard_view_tag) != null) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        if (childCount <= 1) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        for (int i = 0; i < childCount; i++) {
            if (i != iIndexOfChild) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getTag(R.id.hianalytics_keyboard_view_tag) != null) {
                    return true;
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    int childCount2 = viewGroup2.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        if (Pattern.matches("^([A-Za-z]|[0-9])", v1.e(viewGroup2.getChildAt(i2)))) {
                            int i3 = R.id.hianalytics_keyboard_view_tag;
                            Boolean bool = Boolean.TRUE;
                            viewGroup2.setTag(i3, bool);
                            viewGroup.setTag(R.id.hianalytics_keyboard_view_tag, bool);
                            return true;
                        }
                    }
                } else if (Pattern.matches("^([A-Za-z]|[0-9])", v1.c(childAt))) {
                    int i4 = R.id.hianalytics_keyboard_view_tag;
                    Boolean bool2 = Boolean.TRUE;
                    childAt.setTag(i4, bool2);
                    viewGroup.setTag(R.id.hianalytics_keyboard_view_tag, bool2);
                    return true;
                }
            }
        }
        return false;
    }
}
