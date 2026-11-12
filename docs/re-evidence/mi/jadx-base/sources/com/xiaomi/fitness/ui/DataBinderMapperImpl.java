package com.xiaomi.fitness.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.hkr;
import defpackage.j7e;
import defpackage.mvi;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.wh0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13304a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13305a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f13305a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13306a;

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            f13306a = map;
            map.put("layout/activity_common_0", Integer.valueOf(mvi.f27256a));
            map.put("layout/layout_data_detail_item_view_0", Integer.valueOf(mvi.l));
            map.put("layout/widget_top_bar_0", Integer.valueOf(mvi.A));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f13304a = sparseIntArray;
        sparseIntArray.put(mvi.f27256a, 1);
        sparseIntArray.put(mvi.l, 2);
        sparseIntArray.put(mvi.A, 3);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13305a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f13304a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13306a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f13304a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/activity_common_0".equals(tag)) {
                return new wh0(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for activity_common is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/layout_data_detail_item_view_0".equals(tag)) {
                return new j7e(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for layout_data_detail_item_view is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/widget_top_bar_0".equals(tag)) {
            return new hkr(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for widget_top_bar is invalid. Received: " + tag);
    }
}
