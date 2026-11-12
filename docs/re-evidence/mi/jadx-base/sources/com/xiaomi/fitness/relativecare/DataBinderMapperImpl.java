package com.xiaomi.fitness.relativecare;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.agk;
import defpackage.cgk;
import defpackage.egk;
import defpackage.gfk;
import defpackage.ifk;
import defpackage.kfk;
import defpackage.mfk;
import defpackage.ofk;
import defpackage.qfk;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.vdk;
import defpackage.wsl;
import defpackage.xdk;
import defpackage.xui;
import defpackage.yfk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12773a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12774a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f12774a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12775a;

        static {
            HashMap<String, Integer> map = new HashMap<>(13);
            f12775a = map;
            map.put("layout/relative_care_confirm_user_info_0", Integer.valueOf(xui.f39481a));
            map.put("layout/relative_care_home_activity_0", Integer.valueOf(xui.f39482b));
            map.put("layout/relative_care_home_title_bar_0", Integer.valueOf(xui.c));
            map.put("layout/relative_care_layout_data_range_accessible_to_relative_0", Integer.valueOf(xui.e));
            map.put("layout/relative_care_layout_edit_label_0", Integer.valueOf(xui.f));
            map.put("layout/relative_care_layout_more_settings_0", Integer.valueOf(xui.g));
            map.put("layout/relative_care_layout_result_status_0", Integer.valueOf(xui.i));
            map.put("layout/relative_care_layout_scan_0", Integer.valueOf(xui.j));
            map.put("layout/relative_care_my_qr_code_0", Integer.valueOf(xui.f39483k));
            map.put("layout/relative_care_no_data_shared_0", Integer.valueOf(xui.l));
            map.put("layout/relative_care_relative_item_layout_0", Integer.valueOf(xui.n));
            map.put("layout/relative_care_share_data_list_activity_0", Integer.valueOf(xui.o));
            map.put("layout/send_invitation_with_xiaomi_account_0", Integer.valueOf(xui.f39484r));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(13);
        f12773a = sparseIntArray;
        sparseIntArray.put(xui.f39481a, 1);
        sparseIntArray.put(xui.f39482b, 2);
        sparseIntArray.put(xui.c, 3);
        sparseIntArray.put(xui.e, 4);
        sparseIntArray.put(xui.f, 5);
        sparseIntArray.put(xui.g, 6);
        sparseIntArray.put(xui.i, 7);
        sparseIntArray.put(xui.j, 8);
        sparseIntArray.put(xui.f39483k, 9);
        sparseIntArray.put(xui.l, 10);
        sparseIntArray.put(xui.n, 11);
        sparseIntArray.put(xui.o, 12);
        sparseIntArray.put(xui.f39484r, 13);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(23);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.message.center.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12774a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12773a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12775a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12773a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/relative_care_confirm_user_info_0".equals(tag)) {
                        return new vdk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_confirm_user_info is invalid. Received: " + tag);
                case 2:
                    if ("layout/relative_care_home_activity_0".equals(tag)) {
                        return new xdk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_home_activity is invalid. Received: " + tag);
                case 3:
                    if ("layout/relative_care_home_title_bar_0".equals(tag)) {
                        return new gfk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_home_title_bar is invalid. Received: " + tag);
                case 4:
                    if ("layout/relative_care_layout_data_range_accessible_to_relative_0".equals(tag)) {
                        return new ifk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_layout_data_range_accessible_to_relative is invalid. Received: " + tag);
                case 5:
                    if ("layout/relative_care_layout_edit_label_0".equals(tag)) {
                        return new kfk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_layout_edit_label is invalid. Received: " + tag);
                case 6:
                    if ("layout/relative_care_layout_more_settings_0".equals(tag)) {
                        return new mfk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_layout_more_settings is invalid. Received: " + tag);
                case 7:
                    if ("layout/relative_care_layout_result_status_0".equals(tag)) {
                        return new ofk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_layout_result_status is invalid. Received: " + tag);
                case 8:
                    if ("layout/relative_care_layout_scan_0".equals(tag)) {
                        return new qfk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_layout_scan is invalid. Received: " + tag);
                case 9:
                    if ("layout/relative_care_my_qr_code_0".equals(tag)) {
                        return new yfk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_my_qr_code is invalid. Received: " + tag);
                case 10:
                    if ("layout/relative_care_no_data_shared_0".equals(tag)) {
                        return new agk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_no_data_shared is invalid. Received: " + tag);
                case 11:
                    if ("layout/relative_care_relative_item_layout_0".equals(tag)) {
                        return new cgk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_relative_item_layout is invalid. Received: " + tag);
                case 12:
                    if ("layout/relative_care_share_data_list_activity_0".equals(tag)) {
                        return new egk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for relative_care_share_data_list_activity is invalid. Received: " + tag);
                case 13:
                    if ("layout/send_invitation_with_xiaomi_account_0".equals(tag)) {
                        return new wsl(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for send_invitation_with_xiaomi_account is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
