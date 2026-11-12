package com.xiaomi.fitness.login;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.gqe;
import defpackage.iqe;
import defpackage.kqe;
import defpackage.mqe;
import defpackage.mui;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.sqe;
import defpackage.vqe;
import defpackage.xqe;
import defpackage.zqe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12360a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12361a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(4);
            f12361a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "info");
            sparseArray.put(2, "regionViewModel");
            sparseArray.put(3, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12362a;

        static {
            HashMap<String, Integer> map = new HashMap<>(8);
            f12362a = map;
            map.put("layout/login_activity_internal_test_0", Integer.valueOf(mui.f27223b));
            map.put("layout/login_activity_privacy_0", Integer.valueOf(mui.c));
            map.put("layout/login_activity_splash_banner_0", Integer.valueOf(mui.d));
            map.put("layout/login_activity_welcome_0", Integer.valueOf(mui.e));
            map.put("layout/login_easy_mode_activity_0", Integer.valueOf(mui.f));
            map.put("layout/login_region_activity_select_list_0", Integer.valueOf(mui.h));
            map.put("layout/login_region_fragment_select_0", Integer.valueOf(mui.i));
            map.put("layout/login_region_layout_list_item_0", Integer.valueOf(mui.j));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f12360a = sparseIntArray;
        sparseIntArray.put(mui.f27223b, 1);
        sparseIntArray.put(mui.c, 2);
        sparseIntArray.put(mui.d, 3);
        sparseIntArray.put(mui.e, 4);
        sparseIntArray.put(mui.f, 5);
        sparseIntArray.put(mui.h, 6);
        sparseIntArray.put(mui.i, 7);
        sparseIntArray.put(mui.j, 8);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(26);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.res.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.wearos.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12361a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12360a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12362a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12360a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/login_activity_internal_test_0".equals(tag)) {
                        return new gqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_activity_internal_test is invalid. Received: " + tag);
                case 2:
                    if ("layout/login_activity_privacy_0".equals(tag)) {
                        return new iqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_activity_privacy is invalid. Received: " + tag);
                case 3:
                    if ("layout/login_activity_splash_banner_0".equals(tag)) {
                        return new kqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_activity_splash_banner is invalid. Received: " + tag);
                case 4:
                    if ("layout/login_activity_welcome_0".equals(tag)) {
                        return new mqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_activity_welcome is invalid. Received: " + tag);
                case 5:
                    if ("layout/login_easy_mode_activity_0".equals(tag)) {
                        return new sqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_easy_mode_activity is invalid. Received: " + tag);
                case 6:
                    if ("layout/login_region_activity_select_list_0".equals(tag)) {
                        return new vqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_region_activity_select_list is invalid. Received: " + tag);
                case 7:
                    if ("layout/login_region_fragment_select_0".equals(tag)) {
                        return new xqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_region_fragment_select is invalid. Received: " + tag);
                case 8:
                    if ("layout/login_region_layout_list_item_0".equals(tag)) {
                        return new zqe(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for login_region_layout_list_item is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
