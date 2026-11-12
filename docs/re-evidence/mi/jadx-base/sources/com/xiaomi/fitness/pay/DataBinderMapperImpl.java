package com.xiaomi.fitness.pay;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.boh;
import defpackage.inh;
import defpackage.knh;
import defpackage.lmh;
import defpackage.mnh;
import defpackage.onh;
import defpackage.qk5;
import defpackage.qnh;
import defpackage.rk5;
import defpackage.snh;
import defpackage.unh;
import defpackage.uui;
import defpackage.wnh;
import defpackage.ynh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12712a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12713a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(9);
            f12713a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "channelViewModel");
            sparseArray.put(2, "nameStr");
            sparseArray.put(3, "orderId");
            sparseArray.put(4, "previewUrl");
            sparseArray.put(5, "priceValue");
            sparseArray.put(6, "resultViewModel");
            sparseArray.put(7, "startTimestamp");
            sparseArray.put(8, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12714a;

        static {
            HashMap<String, Integer> map = new HashMap<>(11);
            f12714a = map;
            map.put("layout/pay_activity_order_page_list_0", Integer.valueOf(uui.f36155a));
            map.put("layout/pay_course_order_item_0", Integer.valueOf(uui.f36156b));
            map.put("layout/pay_fragment_pay_channel_0", Integer.valueOf(uui.c));
            map.put("layout/pay_fragment_result_0", Integer.valueOf(uui.d));
            map.put("layout/pay_layout_channel_item_0", Integer.valueOf(uui.e));
            map.put("layout/pay_layout_course_fragment_0", Integer.valueOf(uui.f));
            map.put("layout/pay_layout_order_page_list_item_0", Integer.valueOf(uui.i));
            map.put("layout/pay_layout_other_order_fragment_0", Integer.valueOf(uui.j));
            map.put("layout/pay_layout_payment_dialog_0", Integer.valueOf(uui.f36157k));
            map.put("layout/pay_layout_watch_face_fragment_0", Integer.valueOf(uui.l));
            map.put("layout/pay_order_other_right_arrow_single_line_text_view_0", Integer.valueOf(uui.m));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(11);
        f12712a = sparseIntArray;
        sparseIntArray.put(uui.f36155a, 1);
        sparseIntArray.put(uui.f36156b, 2);
        sparseIntArray.put(uui.c, 3);
        sparseIntArray.put(uui.d, 4);
        sparseIntArray.put(uui.e, 5);
        sparseIntArray.put(uui.f, 6);
        sparseIntArray.put(uui.i, 7);
        sparseIntArray.put(uui.j, 8);
        sparseIntArray.put(uui.f36157k, 9);
        sparseIntArray.put(uui.l, 10);
        sparseIntArray.put(uui.m, 11);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(22);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.exception.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.pay.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.watch.face.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12713a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12712a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12714a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12712a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/pay_activity_order_page_list_0".equals(tag)) {
                        return new lmh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_activity_order_page_list is invalid. Received: " + tag);
                case 2:
                    if ("layout/pay_course_order_item_0".equals(tag)) {
                        return new inh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_course_order_item is invalid. Received: " + tag);
                case 3:
                    if ("layout/pay_fragment_pay_channel_0".equals(tag)) {
                        return new knh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_fragment_pay_channel is invalid. Received: " + tag);
                case 4:
                    if ("layout/pay_fragment_result_0".equals(tag)) {
                        return new mnh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_fragment_result is invalid. Received: " + tag);
                case 5:
                    if ("layout/pay_layout_channel_item_0".equals(tag)) {
                        return new onh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_layout_channel_item is invalid. Received: " + tag);
                case 6:
                    if ("layout/pay_layout_course_fragment_0".equals(tag)) {
                        return new qnh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_layout_course_fragment is invalid. Received: " + tag);
                case 7:
                    if ("layout/pay_layout_order_page_list_item_0".equals(tag)) {
                        return new snh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_layout_order_page_list_item is invalid. Received: " + tag);
                case 8:
                    if ("layout/pay_layout_other_order_fragment_0".equals(tag)) {
                        return new unh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_layout_other_order_fragment is invalid. Received: " + tag);
                case 9:
                    if ("layout/pay_layout_payment_dialog_0".equals(tag)) {
                        return new wnh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_layout_payment_dialog is invalid. Received: " + tag);
                case 10:
                    if ("layout/pay_layout_watch_face_fragment_0".equals(tag)) {
                        return new ynh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_layout_watch_face_fragment is invalid. Received: " + tag);
                case 11:
                    if ("layout/pay_order_other_right_arrow_single_line_text_view_0".equals(tag)) {
                        return new boh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pay_order_other_right_arrow_single_line_text_view is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
