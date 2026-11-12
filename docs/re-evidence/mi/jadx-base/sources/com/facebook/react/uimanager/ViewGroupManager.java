package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cbe;
import defpackage.o0d;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, cbe> implements o0d {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    public void addView(T t, View view, int i) {
        t.addView(view, i);
    }

    public void addViews(T t, List<View> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView(t, list.get(i), i);
        }
    }

    public View getChildAt(T t, int i) {
        return t.getChildAt(i);
    }

    public int getChildCount(T t) {
        return t.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends cbe> getShadowNodeClass() {
        return cbe.class;
    }

    @Override // defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void removeAllViews(T t) {
        for (int childCount = getChildCount(t) - 1; childCount >= 0; childCount--) {
            removeViewAt(t, childCount);
        }
    }

    public void removeView(T t, View view) {
        for (int i = 0; i < getChildCount(t); i++) {
            if (getChildAt(t, i) == view) {
                removeViewAt(t, i);
                return;
            }
        }
    }

    public void removeViewAt(T t, int i) {
        t.removeViewAt(i);
    }

    public boolean shouldPromoteGrandchildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance() {
        return new cbe();
    }
}
