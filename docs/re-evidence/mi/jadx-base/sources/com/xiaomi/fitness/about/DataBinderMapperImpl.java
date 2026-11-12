package com.xiaomi.fitness.about;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.hz;
import defpackage.mi0;
import defpackage.ny;
import defpackage.pnd;
import defpackage.py;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.yti;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f11524a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f11525a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f11525a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "rnDeviceInfo");
            sparseArray.put(2, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f11526a;

        static {
            HashMap<String, Integer> map = new HashMap<>(5);
            f11526a = map;
            map.put("layout/about_activity_0", Integer.valueOf(yti.f40523a));
            map.put("layout/about_activity_cloud_sync_setting_0", Integer.valueOf(yti.f40524b));
            map.put("layout/about_setting_activity_0", Integer.valueOf(yti.f));
            map.put("layout/activity_device_dual_authorization_0", Integer.valueOf(yti.g));
            map.put("layout/item_list_device_dual_authorization_0", Integer.valueOf(yti.i));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f11524a = sparseIntArray;
        sparseIntArray.put(yti.f40523a, 1);
        sparseIntArray.put(yti.f40524b, 2);
        sparseIntArray.put(yti.f, 3);
        sparseIntArray.put(yti.g, 4);
        sparseIntArray.put(yti.i, 5);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(31);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.active.pk.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.keep_alive.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.push.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f11525a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f11524a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f11526a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f11524a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/about_activity_0".equals(tag)) {
                return new ny(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for about_activity is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/about_activity_cloud_sync_setting_0".equals(tag)) {
                return new py(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for about_activity_cloud_sync_setting is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/about_setting_activity_0".equals(tag)) {
                return new hz(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for about_setting_activity is invalid. Received: " + tag);
        }
        if (i2 == 4) {
            if ("layout/activity_device_dual_authorization_0".equals(tag)) {
                return new mi0(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for activity_device_dual_authorization is invalid. Received: " + tag);
        }
        if (i2 != 5) {
            return null;
        }
        if ("layout/item_list_device_dual_authorization_0".equals(tag)) {
            return new pnd(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for item_list_device_dual_authorization is invalid. Received: " + tag);
    }
}
