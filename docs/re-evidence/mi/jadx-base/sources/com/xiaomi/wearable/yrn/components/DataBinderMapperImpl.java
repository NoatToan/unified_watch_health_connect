package com.xiaomi.wearable.yrn.components;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.aee;
import defpackage.cee;
import defpackage.eee;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.uvi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f14454a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f14455a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f14455a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f14456a;

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            f14456a = map;
            map.put("layout/layout_yrnamap_common_cluster_0", Integer.valueOf(uvi.f36191b));
            map.put("layout/layout_yrnamap_common_cluster_select_0", Integer.valueOf(uvi.c));
            map.put("layout/layout_yrnamap_common_marker_0", Integer.valueOf(uvi.d));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f14454a = sparseIntArray;
        sparseIntArray.put(uvi.f36191b, 1);
        sparseIntArray.put(uvi.c, 2);
        sparseIntArray.put(uvi.d, 3);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(34);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.temperature.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.map.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.persist.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.map.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.motion.recognition.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.steps.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.training_plan_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f14455a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f14454a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f14456a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f14454a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/layout_yrnamap_common_cluster_0".equals(tag)) {
                return new aee(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for layout_yrnamap_common_cluster is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/layout_yrnamap_common_cluster_select_0".equals(tag)) {
                return new cee(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for layout_yrnamap_common_cluster_select is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/layout_yrnamap_common_marker_0".equals(tag)) {
            return new eee(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for layout_yrnamap_common_marker is invalid. Received: " + tag);
    }
}
