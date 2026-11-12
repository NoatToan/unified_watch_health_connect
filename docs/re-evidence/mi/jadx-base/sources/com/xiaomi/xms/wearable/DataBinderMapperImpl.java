package com.xiaomi.xms.wearable;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.atr;
import defpackage.ctr;
import defpackage.etr;
import defpackage.gtr;
import defpackage.itr;
import defpackage.ktr;
import defpackage.ntr;
import defpackage.ptr;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.wsr;
import defpackage.wvi;
import defpackage.ysr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f14472a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f14473a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f14473a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f14474a;

        static {
            HashMap<String, Integer> map = new HashMap<>(10);
            f14474a = map;
            map.put("layout/xms_fragment_request_thirdapp_permission_0", Integer.valueOf(wvi.f38407a));
            map.put("layout/xms_fragment_third_app_debug_0", Integer.valueOf(wvi.f38408b));
            map.put("layout/xms_fragment_third_app_detail_0", Integer.valueOf(wvi.c));
            map.put("layout/xms_fragment_third_app_list_base_0", Integer.valueOf(wvi.d));
            map.put("layout/xms_fragment_thirdapplist_0", Integer.valueOf(wvi.e));
            map.put("layout/xms_fragment_thirdappmarket_0", Integer.valueOf(wvi.f));
            map.put("layout/xms_item_watchapp_list_0", Integer.valueOf(wvi.h));
            map.put("layout/xms_layout_empty_view_0", Integer.valueOf(wvi.i));
            map.put("layout/xms_view_download_progress_0", Integer.valueOf(wvi.f38409k));
            map.put("layout/xms_view_third_app_bottom_view_0", Integer.valueOf(wvi.l));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f14472a = sparseIntArray;
        sparseIntArray.put(wvi.f38407a, 1);
        sparseIntArray.put(wvi.f38408b, 2);
        sparseIntArray.put(wvi.c, 3);
        sparseIntArray.put(wvi.d, 4);
        sparseIntArray.put(wvi.e, 5);
        sparseIntArray.put(wvi.f, 6);
        sparseIntArray.put(wvi.h, 7);
        sparseIntArray.put(wvi.i, 8);
        sparseIntArray.put(wvi.f38409k, 9);
        sparseIntArray.put(wvi.l, 10);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(21);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.capability.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xms.wearable.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f14473a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f14472a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f14474a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f14472a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/xms_fragment_request_thirdapp_permission_0".equals(tag)) {
                        return new wsr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_fragment_request_thirdapp_permission is invalid. Received: " + tag);
                case 2:
                    if ("layout/xms_fragment_third_app_debug_0".equals(tag)) {
                        return new ysr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_fragment_third_app_debug is invalid. Received: " + tag);
                case 3:
                    if ("layout/xms_fragment_third_app_detail_0".equals(tag)) {
                        return new atr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_fragment_third_app_detail is invalid. Received: " + tag);
                case 4:
                    if ("layout/xms_fragment_third_app_list_base_0".equals(tag)) {
                        return new ctr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_fragment_third_app_list_base is invalid. Received: " + tag);
                case 5:
                    if ("layout/xms_fragment_thirdapplist_0".equals(tag)) {
                        return new etr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_fragment_thirdapplist is invalid. Received: " + tag);
                case 6:
                    if ("layout/xms_fragment_thirdappmarket_0".equals(tag)) {
                        return new gtr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_fragment_thirdappmarket is invalid. Received: " + tag);
                case 7:
                    if ("layout/xms_item_watchapp_list_0".equals(tag)) {
                        return new itr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_item_watchapp_list is invalid. Received: " + tag);
                case 8:
                    if ("layout/xms_layout_empty_view_0".equals(tag)) {
                        return new ktr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_layout_empty_view is invalid. Received: " + tag);
                case 9:
                    if ("layout/xms_view_download_progress_0".equals(tag)) {
                        return new ntr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_view_download_progress is invalid. Received: " + tag);
                case 10:
                    if ("layout/xms_view_third_app_bottom_view_0".equals(tag)) {
                        return new ptr(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for xms_view_third_app_bottom_view is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
