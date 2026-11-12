package com.huami.widget.wheelview;

import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class WheelRecycle {
    private List<View> a;
    private List<View> b;
    private WheelView c;

    public WheelRecycle(WheelView wheelView) {
        this.c = wheelView;
    }

    private List<View> a(View view, List<View> list) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(view);
        return list;
    }

    private View b(List<View> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        View view = list.get(0);
        list.remove(0);
        return view;
    }

    private void c(View view, int i) {
        int itemsCount = this.c.getViewAdapter().getItemsCount();
        if ((i < 0 || i >= itemsCount) && !this.c.isCyclic()) {
            this.b = a(view, this.b);
            return;
        }
        while (i < 0) {
            i += itemsCount;
        }
        int i2 = i % itemsCount;
        this.a = a(view, this.a);
    }

    public void clearAll() {
        List<View> list = this.a;
        if (list != null) {
            list.clear();
        }
        List<View> list2 = this.b;
        if (list2 != null) {
            list2.clear();
        }
    }

    public View getEmptyItem() {
        return b(this.b);
    }

    public View getItem() {
        return b(this.a);
    }

    public int recycleItems(LinearLayout linearLayout, int i, ItemsRange itemsRange) {
        int i2 = i;
        int i3 = 0;
        while (i3 < linearLayout.getChildCount()) {
            if (itemsRange.contains(i2)) {
                i3++;
            } else {
                c(linearLayout.getChildAt(i3), i2);
                linearLayout.removeViewAt(i3);
                if (i3 == 0) {
                    i++;
                }
            }
            i2++;
        }
        return i;
    }
}
