package com.xiaomi.fitness.eco.device.manager;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.ad7;
import defpackage.au7;
import defpackage.dt7;
import defpackage.fui;
import defpackage.qk5;
import defpackage.qr7;
import defpackage.rk5;
import defpackage.tq7;
import defpackage.ut7;
import defpackage.vq7;
import defpackage.yc7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12073a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12074a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(4);
            f12074a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "deviceInfo");
            sparseArray.put(2, "item");
            sparseArray.put(3, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12075a;

        static {
            HashMap<String, Integer> map = new HashMap<>(8);
            f12075a = map;
            map.put("layout/eco_activity_bind_device_0", Integer.valueOf(fui.d));
            map.put("layout/eco_activity_bind_huami_scale_0", Integer.valueOf(fui.e));
            map.put("layout/eco_device_activity_bind_rope_skipping_list_0", Integer.valueOf(fui.f));
            map.put("layout/eco_device_bind_4_electrode_0", Integer.valueOf(fui.g));
            map.put("layout/eco_device_item_rope_skipping_list_0", Integer.valueOf(fui.h));
            map.put("layout/eco_device_yunmai_pair_0", Integer.valueOf(fui.f18254k));
            map.put("layout/eco_fragment_other_device_tab_v4_0", Integer.valueOf(fui.l));
            map.put("layout/eco_item_other_device_v4_0", Integer.valueOf(fui.m));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f12073a = sparseIntArray;
        sparseIntArray.put(fui.d, 1);
        sparseIntArray.put(fui.e, 2);
        sparseIntArray.put(fui.f, 3);
        sparseIntArray.put(fui.g, 4);
        sparseIntArray.put(fui.h, 5);
        sparseIntArray.put(fui.f18254k, 6);
        sparseIntArray.put(fui.l, 7);
        sparseIntArray.put(fui.m, 8);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(42);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.alexa.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.uri_parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.blood_sugar_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.nfc.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_eco_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12074a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12073a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12075a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12073a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/eco_activity_bind_device_0".equals(tag)) {
                        return new yc7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_activity_bind_device is invalid. Received: " + tag);
                case 2:
                    if ("layout/eco_activity_bind_huami_scale_0".equals(tag)) {
                        return new ad7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_activity_bind_huami_scale is invalid. Received: " + tag);
                case 3:
                    if ("layout/eco_device_activity_bind_rope_skipping_list_0".equals(tag)) {
                        return new tq7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_device_activity_bind_rope_skipping_list is invalid. Received: " + tag);
                case 4:
                    if ("layout/eco_device_bind_4_electrode_0".equals(tag)) {
                        return new vq7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_device_bind_4_electrode is invalid. Received: " + tag);
                case 5:
                    if ("layout/eco_device_item_rope_skipping_list_0".equals(tag)) {
                        return new qr7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_device_item_rope_skipping_list is invalid. Received: " + tag);
                case 6:
                    if ("layout/eco_device_yunmai_pair_0".equals(tag)) {
                        return new dt7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_device_yunmai_pair is invalid. Received: " + tag);
                case 7:
                    if ("layout/eco_fragment_other_device_tab_v4_0".equals(tag)) {
                        return new ut7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_fragment_other_device_tab_v4 is invalid. Received: " + tag);
                case 8:
                    if ("layout/eco_item_other_device_v4_0".equals(tag)) {
                        return new au7(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for eco_item_other_device_v4 is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
