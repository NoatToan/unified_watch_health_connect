package com.mi.health.appupgrade;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.bh0;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.rti;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9967a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f9968a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f9968a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f9969a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f9969a = map;
            map.put("layout/activity_app_upgrade_0", Integer.valueOf(rti.f32891a));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f9967a = sparseIntArray;
        sparseIntArray.put(rti.f32891a, 1);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.appupgrade.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f9968a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f9967a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f9969a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f9967a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/activity_app_upgrade_0".equals(tag)) {
            return new bh0(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for activity_app_upgrade is invalid. Received: " + tag);
    }
}
