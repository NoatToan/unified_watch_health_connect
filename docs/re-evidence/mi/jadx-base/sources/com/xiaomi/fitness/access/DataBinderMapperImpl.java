package com.xiaomi.fitness.access;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.a40;
import defpackage.a60;
import defpackage.aui;
import defpackage.h40;
import defpackage.h50;
import defpackage.m70;
import defpackage.o30;
import defpackage.o70;
import defpackage.q30;
import defpackage.q70;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.s30;
import defpackage.v40;
import defpackage.y30;
import defpackage.y50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f11536a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f11537a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f11537a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "info");
            sparseArray.put(2, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f11538a;

        static {
            HashMap<String, Integer> map = new HashMap<>(13);
            f11538a = map;
            map.put("layout/access_activity_alipay_thirdparty_0", Integer.valueOf(aui.f3458a));
            map.put("layout/access_activity_misport_import_0", Integer.valueOf(aui.f3459b));
            map.put("layout/access_activity_thirdparty_0", Integer.valueOf(aui.c));
            map.put("layout/access_delete_device_from_wechat_0", Integer.valueOf(aui.f));
            map.put("layout/access_device_layout_item_0", Integer.valueOf(aui.g));
            map.put("layout/access_device_manager_layout_activity_0", Integer.valueOf(aui.h));
            map.put("layout/access_google_fit_activity_layout_0", Integer.valueOf(aui.i));
            map.put("layout/access_non_mi_common_activity_layout_0", Integer.valueOf(aui.f3460k));
            map.put("layout/access_strava_thirdparty_0", Integer.valueOf(aui.l));
            map.put("layout/access_suunto_include_layout_0", Integer.valueOf(aui.m));
            map.put("layout/access_wechat_device_0", Integer.valueOf(aui.n));
            map.put("layout/access_wechat_sport_settings_no_devices_0", Integer.valueOf(aui.o));
            map.put("layout/access_wechat_thirdparty_0", Integer.valueOf(aui.p));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(13);
        f11536a = sparseIntArray;
        sparseIntArray.put(aui.f3458a, 1);
        sparseIntArray.put(aui.f3459b, 2);
        sparseIntArray.put(aui.c, 3);
        sparseIntArray.put(aui.f, 4);
        sparseIntArray.put(aui.g, 5);
        sparseIntArray.put(aui.h, 6);
        sparseIntArray.put(aui.i, 7);
        sparseIntArray.put(aui.f3460k, 8);
        sparseIntArray.put(aui.l, 9);
        sparseIntArray.put(aui.m, 10);
        sparseIntArray.put(aui.n, 11);
        sparseIntArray.put(aui.o, 12);
        sparseIntArray.put(aui.p, 13);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(23);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.fitness.access.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.data.access.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f11537a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f11536a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f11538a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f11536a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/access_activity_alipay_thirdparty_0".equals(tag)) {
                        return new o30(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_activity_alipay_thirdparty is invalid. Received: " + tag);
                case 2:
                    if ("layout/access_activity_misport_import_0".equals(tag)) {
                        return new q30(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_activity_misport_import is invalid. Received: " + tag);
                case 3:
                    if ("layout/access_activity_thirdparty_0".equals(tag)) {
                        return new s30(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_activity_thirdparty is invalid. Received: " + tag);
                case 4:
                    if ("layout/access_delete_device_from_wechat_0".equals(tag)) {
                        return new y30(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_delete_device_from_wechat is invalid. Received: " + tag);
                case 5:
                    if ("layout/access_device_layout_item_0".equals(tag)) {
                        return new a40(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_device_layout_item is invalid. Received: " + tag);
                case 6:
                    if ("layout/access_device_manager_layout_activity_0".equals(tag)) {
                        return new h40(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_device_manager_layout_activity is invalid. Received: " + tag);
                case 7:
                    if ("layout/access_google_fit_activity_layout_0".equals(tag)) {
                        return new v40(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_google_fit_activity_layout is invalid. Received: " + tag);
                case 8:
                    if ("layout/access_non_mi_common_activity_layout_0".equals(tag)) {
                        return new h50(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_non_mi_common_activity_layout is invalid. Received: " + tag);
                case 9:
                    if ("layout/access_strava_thirdparty_0".equals(tag)) {
                        return new y50(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_strava_thirdparty is invalid. Received: " + tag);
                case 10:
                    if ("layout/access_suunto_include_layout_0".equals(tag)) {
                        return new a60(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_suunto_include_layout is invalid. Received: " + tag);
                case 11:
                    if ("layout/access_wechat_device_0".equals(tag)) {
                        return new m70(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_wechat_device is invalid. Received: " + tag);
                case 12:
                    if ("layout/access_wechat_sport_settings_no_devices_0".equals(tag)) {
                        return new o70(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_wechat_sport_settings_no_devices is invalid. Received: " + tag);
                case 13:
                    if ("layout/access_wechat_thirdparty_0".equals(tag)) {
                        return new q70(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for access_wechat_thirdparty is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
