package com.xiaomi.fitness.mine;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.a2g;
import defpackage.a3g;
import defpackage.c2g;
import defpackage.e1g;
import defpackage.f1g;
import defpackage.g0g;
import defpackage.g2g;
import defpackage.gyf;
import defpackage.iyf;
import defpackage.k2g;
import defpackage.l1g;
import defpackage.lyf;
import defpackage.m3g;
import defpackage.n1g;
import defpackage.nyf;
import defpackage.o1g;
import defpackage.o4g;
import defpackage.oxh;
import defpackage.qk5;
import defpackage.qyf;
import defpackage.r2g;
import defpackage.rk5;
import defpackage.rui;
import defpackage.s1g;
import defpackage.syf;
import defpackage.t1g;
import defpackage.w1g;
import defpackage.y2g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12465a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12466a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f12466a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "mineViewModel");
            sparseArray.put(2, "viewmodel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12467a;

        static {
            HashMap<String, Integer> map = new HashMap<>(25);
            f12467a = map;
            map.put("layout/mine_activity_mine_0", Integer.valueOf(rui.f32914a));
            map.put("layout/mine_activity_weekly_report_auth_0", Integer.valueOf(rui.f32915b));
            map.put("layout/mine_app_specific_data_management_0", Integer.valueOf(rui.f));
            map.put("layout/mine_assets_item_view_0", Integer.valueOf(rui.g));
            map.put("layout/mine_assets_view_0", Integer.valueOf(rui.h));
            map.put("layout/mine_course_vip_view_0", Integer.valueOf(rui.i));
            map.put("layout/mine_fragment_mine_0", Integer.valueOf(rui.j));
            map.put("layout-large-land/mine_fragment_v4_0", Integer.valueOf(rui.f32916k));
            map.put("layout/mine_fragment_v4_0", Integer.valueOf(rui.f32916k));
            map.put("layout/mine_function_active_play_0", Integer.valueOf(rui.l));
            map.put("layout-bo-rCN/mine_function_card_view_0", Integer.valueOf(rui.m));
            map.put("layout/mine_function_card_view_0", Integer.valueOf(rui.m));
            map.put("layout-bo-rCN/mine_habit_view_0", Integer.valueOf(rui.n));
            map.put("layout/mine_habit_view_0", Integer.valueOf(rui.n));
            map.put("layout/mine_lab_collaboration_management_0", Integer.valueOf(rui.o));
            map.put("layout/mine_layout_result_status_0", Integer.valueOf(rui.q));
            map.put("layout/mine_medal_entrance_0", Integer.valueOf(rui.f32917r));
            map.put("layout/mine_medal_entrance_medal_item_0", Integer.valueOf(rui.s));
            map.put("layout/mine_medal_unlogged_in_entrance_0", Integer.valueOf(rui.t));
            map.put("layout/mine_personal_data_management_0", Integer.valueOf(rui.u));
            map.put("layout/mine_tab_basic_list_item_0", Integer.valueOf(rui.w));
            map.put("layout/mine_third_party_auth_management_0", Integer.valueOf(rui.x));
            map.put("layout/mine_user_info_view_0", Integer.valueOf(rui.y));
            map.put("layout/mine_vip_entrance_view_0", Integer.valueOf(rui.z));
            map.put("layout/pk_detail_layout_no_pk_no_invitation_0", Integer.valueOf(rui.A));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(22);
        f12465a = sparseIntArray;
        sparseIntArray.put(rui.f32914a, 1);
        sparseIntArray.put(rui.f32915b, 2);
        sparseIntArray.put(rui.f, 3);
        sparseIntArray.put(rui.g, 4);
        sparseIntArray.put(rui.h, 5);
        sparseIntArray.put(rui.i, 6);
        sparseIntArray.put(rui.j, 7);
        sparseIntArray.put(rui.f32916k, 8);
        sparseIntArray.put(rui.l, 9);
        sparseIntArray.put(rui.m, 10);
        sparseIntArray.put(rui.n, 11);
        sparseIntArray.put(rui.o, 12);
        sparseIntArray.put(rui.q, 13);
        sparseIntArray.put(rui.f32917r, 14);
        sparseIntArray.put(rui.s, 15);
        sparseIntArray.put(rui.t, 16);
        sparseIntArray.put(rui.u, 17);
        sparseIntArray.put(rui.w, 18);
        sparseIntArray.put(rui.x, 19);
        sparseIntArray.put(rui.y, 20);
        sparseIntArray.put(rui.z, 21);
        sparseIntArray.put(rui.A, 22);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(52);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.appupgrade.export.DataBinderMapperImpl());
        arrayList.add(new com.example.habit.export.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.access.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.active.pk.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.feedback.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.membership.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.pay.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.route.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_eco_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        arrayList.add(new com.xms.wearable.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12466a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12465a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12467a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12465a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/mine_activity_mine_0".equals(tag)) {
                        return new gyf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_activity_mine is invalid. Received: " + tag);
                case 2:
                    if ("layout/mine_activity_weekly_report_auth_0".equals(tag)) {
                        return new iyf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_activity_weekly_report_auth is invalid. Received: " + tag);
                case 3:
                    if ("layout/mine_app_specific_data_management_0".equals(tag)) {
                        return new lyf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_app_specific_data_management is invalid. Received: " + tag);
                case 4:
                    if ("layout/mine_assets_item_view_0".equals(tag)) {
                        return new nyf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_assets_item_view is invalid. Received: " + tag);
                case 5:
                    if ("layout/mine_assets_view_0".equals(tag)) {
                        return new qyf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_assets_view is invalid. Received: " + tag);
                case 6:
                    if ("layout/mine_course_vip_view_0".equals(tag)) {
                        return new syf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_course_vip_view is invalid. Received: " + tag);
                case 7:
                    if ("layout/mine_fragment_mine_0".equals(tag)) {
                        return new g0g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_fragment_mine is invalid. Received: " + tag);
                case 8:
                    if ("layout-large-land/mine_fragment_v4_0".equals(tag)) {
                        return new f1g(rk5Var, view);
                    }
                    if ("layout/mine_fragment_v4_0".equals(tag)) {
                        return new e1g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_fragment_v4 is invalid. Received: " + tag);
                case 9:
                    if ("layout/mine_function_active_play_0".equals(tag)) {
                        return new l1g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_function_active_play is invalid. Received: " + tag);
                case 10:
                    if ("layout-bo-rCN/mine_function_card_view_0".equals(tag)) {
                        return new n1g(rk5Var, view);
                    }
                    if ("layout/mine_function_card_view_0".equals(tag)) {
                        return new o1g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_function_card_view is invalid. Received: " + tag);
                case 11:
                    if ("layout-bo-rCN/mine_habit_view_0".equals(tag)) {
                        return new s1g(rk5Var, view);
                    }
                    if ("layout/mine_habit_view_0".equals(tag)) {
                        return new t1g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_habit_view is invalid. Received: " + tag);
                case 12:
                    if ("layout/mine_lab_collaboration_management_0".equals(tag)) {
                        return new w1g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_lab_collaboration_management is invalid. Received: " + tag);
                case 13:
                    if ("layout/mine_layout_result_status_0".equals(tag)) {
                        return new a2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_layout_result_status is invalid. Received: " + tag);
                case 14:
                    if ("layout/mine_medal_entrance_0".equals(tag)) {
                        return new c2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_medal_entrance is invalid. Received: " + tag);
                case 15:
                    if ("layout/mine_medal_entrance_medal_item_0".equals(tag)) {
                        return new g2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_medal_entrance_medal_item is invalid. Received: " + tag);
                case 16:
                    if ("layout/mine_medal_unlogged_in_entrance_0".equals(tag)) {
                        return new k2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_medal_unlogged_in_entrance is invalid. Received: " + tag);
                case 17:
                    if ("layout/mine_personal_data_management_0".equals(tag)) {
                        return new r2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_personal_data_management is invalid. Received: " + tag);
                case 18:
                    if ("layout/mine_tab_basic_list_item_0".equals(tag)) {
                        return new y2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_tab_basic_list_item is invalid. Received: " + tag);
                case 19:
                    if ("layout/mine_third_party_auth_management_0".equals(tag)) {
                        return new a3g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_third_party_auth_management is invalid. Received: " + tag);
                case 20:
                    if ("layout/mine_user_info_view_0".equals(tag)) {
                        return new m3g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_user_info_view is invalid. Received: " + tag);
                case 21:
                    if ("layout/mine_vip_entrance_view_0".equals(tag)) {
                        return new o4g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_vip_entrance_view is invalid. Received: " + tag);
                case 22:
                    if ("layout/pk_detail_layout_no_pk_no_invitation_0".equals(tag)) {
                        return new oxh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_detail_layout_no_pk_no_invitation is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
