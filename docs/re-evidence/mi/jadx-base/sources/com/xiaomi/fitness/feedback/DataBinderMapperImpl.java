package com.xiaomi.fitness.feedback;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.aj9;
import defpackage.cj9;
import defpackage.ck9;
import defpackage.ei9;
import defpackage.ej9;
import defpackage.gi9;
import defpackage.hui;
import defpackage.ii9;
import defpackage.ki9;
import defpackage.mi9;
import defpackage.oi9;
import defpackage.qi9;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.si9;
import defpackage.ui9;
import defpackage.wi9;
import defpackage.yi9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12169a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12170a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(5);
            f12170a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "detail");
            sparseArray.put(2, "info");
            sparseArray.put(3, "item");
            sparseArray.put(4, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12171a;

        static {
            HashMap<String, Integer> map = new HashMap<>(15);
            f12171a = map;
            map.put("layout/feedback_activity_0", Integer.valueOf(hui.f20475a));
            map.put("layout/feedback_activity_history_0", Integer.valueOf(hui.f20476b));
            map.put("layout/feedback_activity_history_detail_0", Integer.valueOf(hui.c));
            map.put("layout/feedback_activity_question_0", Integer.valueOf(hui.d));
            map.put("layout/feedback_activity_switch_device_0", Integer.valueOf(hui.e));
            map.put("layout/feedback_add_app_layout_item_binding_0", Integer.valueOf(hui.g));
            map.put("layout/feedback_common_layout_recycleview_0", Integer.valueOf(hui.j));
            map.put("layout/feedback_dialog_comment_0", Integer.valueOf(hui.f20477k));
            map.put("layout/feedback_item_app_question_0", Integer.valueOf(hui.o));
            map.put("layout/feedback_item_device_question_0", Integer.valueOf(hui.p));
            map.put("layout/feedback_item_dialogue_0", Integer.valueOf(hui.q));
            map.put("layout/feedback_item_history_0", Integer.valueOf(hui.f20478r));
            map.put("layout/feedback_item_label_0", Integer.valueOf(hui.s));
            map.put("layout/feedback_layout_item_bottom_0", Integer.valueOf(hui.u));
            map.put("layout/feedback_sub_category_layout_0", Integer.valueOf(hui.v));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        f12169a = sparseIntArray;
        sparseIntArray.put(hui.f20475a, 1);
        sparseIntArray.put(hui.f20476b, 2);
        sparseIntArray.put(hui.c, 3);
        sparseIntArray.put(hui.d, 4);
        sparseIntArray.put(hui.e, 5);
        sparseIntArray.put(hui.g, 6);
        sparseIntArray.put(hui.j, 7);
        sparseIntArray.put(hui.f20477k, 8);
        sparseIntArray.put(hui.o, 9);
        sparseIntArray.put(hui.p, 10);
        sparseIntArray.put(hui.q, 11);
        sparseIntArray.put(hui.f20478r, 12);
        sparseIntArray.put(hui.s, 13);
        sparseIntArray.put(hui.u, 14);
        sparseIntArray.put(hui.v, 15);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.feedback.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.wearos.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12170a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12169a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12171a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12169a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/feedback_activity_0".equals(tag)) {
                        return new ei9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_activity is invalid. Received: " + tag);
                case 2:
                    if ("layout/feedback_activity_history_0".equals(tag)) {
                        return new gi9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_activity_history is invalid. Received: " + tag);
                case 3:
                    if ("layout/feedback_activity_history_detail_0".equals(tag)) {
                        return new ii9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_activity_history_detail is invalid. Received: " + tag);
                case 4:
                    if ("layout/feedback_activity_question_0".equals(tag)) {
                        return new ki9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_activity_question is invalid. Received: " + tag);
                case 5:
                    if ("layout/feedback_activity_switch_device_0".equals(tag)) {
                        return new mi9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_activity_switch_device is invalid. Received: " + tag);
                case 6:
                    if ("layout/feedback_add_app_layout_item_binding_0".equals(tag)) {
                        return new oi9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_add_app_layout_item_binding is invalid. Received: " + tag);
                case 7:
                    if ("layout/feedback_common_layout_recycleview_0".equals(tag)) {
                        return new qi9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_common_layout_recycleview is invalid. Received: " + tag);
                case 8:
                    if ("layout/feedback_dialog_comment_0".equals(tag)) {
                        return new si9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_dialog_comment is invalid. Received: " + tag);
                case 9:
                    if ("layout/feedback_item_app_question_0".equals(tag)) {
                        return new ui9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_item_app_question is invalid. Received: " + tag);
                case 10:
                    if ("layout/feedback_item_device_question_0".equals(tag)) {
                        return new wi9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_item_device_question is invalid. Received: " + tag);
                case 11:
                    if ("layout/feedback_item_dialogue_0".equals(tag)) {
                        return new yi9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_item_dialogue is invalid. Received: " + tag);
                case 12:
                    if ("layout/feedback_item_history_0".equals(tag)) {
                        return new aj9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_item_history is invalid. Received: " + tag);
                case 13:
                    if ("layout/feedback_item_label_0".equals(tag)) {
                        return new cj9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_item_label is invalid. Received: " + tag);
                case 14:
                    if ("layout/feedback_layout_item_bottom_0".equals(tag)) {
                        return new ej9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_layout_item_bottom is invalid. Received: " + tag);
                case 15:
                    if ("layout/feedback_sub_category_layout_0".equals(tag)) {
                        return new ck9(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for feedback_sub_category_layout is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
