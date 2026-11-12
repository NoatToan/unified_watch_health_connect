package com.xiaomi.fitness.electronic.scale;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.ak0;
import defpackage.al0;
import defpackage.c68;
import defpackage.ck0;
import defpackage.cl0;
import defpackage.e68;
import defpackage.ej0;
import defpackage.ek0;
import defpackage.el0;
import defpackage.g68;
import defpackage.gj0;
import defpackage.gk0;
import defpackage.gui;
import defpackage.i68;
import defpackage.ij0;
import defpackage.ik0;
import defpackage.k48;
import defpackage.k68;
import defpackage.kj0;
import defpackage.kk0;
import defpackage.m48;
import defpackage.m68;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.o48;
import defpackage.o5a;
import defpackage.o68;
import defpackage.oj0;
import defpackage.ok0;
import defpackage.q48;
import defpackage.q5a;
import defpackage.q68;
import defpackage.qj0;
import defpackage.qk0;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.s48;
import defpackage.s68;
import defpackage.sj0;
import defpackage.sk0;
import defpackage.uj0;
import defpackage.uk0;
import defpackage.wj0;
import defpackage.wk0;
import defpackage.yj0;
import defpackage.yk0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12096a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12097a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(4);
            f12097a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "onClick");
            sparseArray.put(2, "shareListHelper");
            sparseArray.put(3, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12098a;

        static {
            HashMap<String, Integer> map = new HashMap<>(43);
            f12098a = map;
            map.put("layout/activity_electronic_scale_about_device_0", Integer.valueOf(gui.f19341a));
            map.put("layout/activity_electronic_scale_add_share_0", Integer.valueOf(gui.f19342b));
            map.put("layout/activity_electronic_scale_baby_weight_0", Integer.valueOf(gui.c));
            map.put("layout/activity_electronic_scale_balance_weight_0", Integer.valueOf(gui.d));
            map.put("layout/activity_electronic_scale_claim_record_0", Integer.valueOf(gui.e));
            map.put("layout/activity_electronic_scale_claim_record_header_0", Integer.valueOf(gui.f));
            map.put("layout/activity_electronic_scale_config_wifi_0", Integer.valueOf(gui.g));
            map.put("layout/activity_electronic_scale_config_wifi_timeout_0", Integer.valueOf(gui.h));
            map.put("layout/activity_electronic_scale_data_report_0", Integer.valueOf(gui.i));
            map.put("layout/activity_electronic_scale_detail_0", Integer.valueOf(gui.j));
            map.put("layout/activity_electronic_scale_device_manage_0", Integer.valueOf(gui.f19343k));
            map.put("layout/activity_electronic_scale_device_share_0", Integer.valueOf(gui.l));
            map.put("layout/activity_electronic_scale_eight_weight_0", Integer.valueOf(gui.m));
            map.put("layout/activity_electronic_scale_ota_0", Integer.valueOf(gui.n));
            map.put("layout/activity_electronic_scale_ota_help_0", Integer.valueOf(gui.o));
            map.put("layout/activity_electronic_scale_pair_guide_0", Integer.valueOf(gui.p));
            map.put("layout/activity_electronic_scale_select_wifi_0", Integer.valueOf(gui.q));
            map.put("layout/activity_electronic_scale_share_confirm_0", Integer.valueOf(gui.f19344r));
            map.put("layout/activity_electronic_scale_user_add_0", Integer.valueOf(gui.s));
            map.put("layout/activity_electronic_scale_user_manage_0", Integer.valueOf(gui.t));
            map.put("layout/activity_electronic_scale_userinfo_layout_0", Integer.valueOf(gui.u));
            map.put("layout/activity_electronic_scale_virtual_member_data_0", Integer.valueOf(gui.v));
            map.put("layout/activity_electronic_scale_visitor_weight_0", Integer.valueOf(gui.w));
            map.put("layout/activity_electronic_scale_visitor_weight_success_0", Integer.valueOf(gui.x));
            map.put("layout/activity_electronic_scale_weight_guide_0", Integer.valueOf(gui.y));
            map.put("layout/activity_electronic_scale_weight_help_0", Integer.valueOf(gui.z));
            map.put("layout/activity_electronic_scale_wifi_info_0", Integer.valueOf(gui.A));
            map.put("layout/electronic_scale_footer_user_manage_list_item_0", Integer.valueOf(gui.F));
            map.put("layout/electronic_scale_header_user_manage_list_item_0", Integer.valueOf(gui.G));
            map.put("layout/electronic_scale_health_layout_card_data_item_0", Integer.valueOf(gui.I));
            map.put("layout/electronic_scale_health_triplet_item_with_logo_0", Integer.valueOf(gui.K));
            map.put("layout/electronic_scale_health_weight_evaluation_detail_item_0", Integer.valueOf(gui.L));
            map.put("layout/electronic_scale_view_analysis_data_0", Integer.valueOf(gui.R));
            map.put("layout/electronic_scale_view_analysis_data_des_0", Integer.valueOf(gui.S));
            map.put("layout/electronic_scale_view_body_composition_analysis_0", Integer.valueOf(gui.T));
            map.put("layout/electronic_scale_view_body_condition_0", Integer.valueOf(gui.U));
            map.put("layout/electronic_scale_view_body_index_score_0", Integer.valueOf(gui.V));
            map.put("layout/electronic_scale_view_evaluation_index_0", Integer.valueOf(gui.W));
            map.put("layout/electronic_scale_view_fat_analysis_0", Integer.valueOf(gui.X));
            map.put("layout/electronic_scale_view_skeleta_muscle_analysis_0", Integer.valueOf(gui.Z));
            map.put("layout/electronic_scale_view_skeletal_muscle_analysis_0", Integer.valueOf(gui.a0));
            map.put("layout/fragment_electronic_scale_virtual_member_day_tab_0", Integer.valueOf(gui.e0));
            map.put("layout/fragment_electronic_scale_virtual_member_statistics_tab_0", Integer.valueOf(gui.g0));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(43);
        f12096a = sparseIntArray;
        sparseIntArray.put(gui.f19341a, 1);
        sparseIntArray.put(gui.f19342b, 2);
        sparseIntArray.put(gui.c, 3);
        sparseIntArray.put(gui.d, 4);
        sparseIntArray.put(gui.e, 5);
        sparseIntArray.put(gui.f, 6);
        sparseIntArray.put(gui.g, 7);
        sparseIntArray.put(gui.h, 8);
        sparseIntArray.put(gui.i, 9);
        sparseIntArray.put(gui.j, 10);
        sparseIntArray.put(gui.f19343k, 11);
        sparseIntArray.put(gui.l, 12);
        sparseIntArray.put(gui.m, 13);
        sparseIntArray.put(gui.n, 14);
        sparseIntArray.put(gui.o, 15);
        sparseIntArray.put(gui.p, 16);
        sparseIntArray.put(gui.q, 17);
        sparseIntArray.put(gui.f19344r, 18);
        sparseIntArray.put(gui.s, 19);
        sparseIntArray.put(gui.t, 20);
        sparseIntArray.put(gui.u, 21);
        sparseIntArray.put(gui.v, 22);
        sparseIntArray.put(gui.w, 23);
        sparseIntArray.put(gui.x, 24);
        sparseIntArray.put(gui.y, 25);
        sparseIntArray.put(gui.z, 26);
        sparseIntArray.put(gui.A, 27);
        sparseIntArray.put(gui.F, 28);
        sparseIntArray.put(gui.G, 29);
        sparseIntArray.put(gui.I, 30);
        sparseIntArray.put(gui.K, 31);
        sparseIntArray.put(gui.L, 32);
        sparseIntArray.put(gui.R, 33);
        sparseIntArray.put(gui.S, 34);
        sparseIntArray.put(gui.T, 35);
        sparseIntArray.put(gui.U, 36);
        sparseIntArray.put(gui.V, 37);
        sparseIntArray.put(gui.W, 38);
        sparseIntArray.put(gui.X, 39);
        sparseIntArray.put(gui.Z, 40);
        sparseIntArray.put(gui.a0, 41);
        sparseIntArray.put(gui.e0, 42);
        sparseIntArray.put(gui.g0, 43);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(37);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.chad.library.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.chart.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.feedback.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.ble.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12097a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12096a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12098a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12096a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/activity_electronic_scale_about_device_0".equals(tag)) {
                        return new ej0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_about_device is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_electronic_scale_add_share_0".equals(tag)) {
                        return new gj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_add_share is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_electronic_scale_baby_weight_0".equals(tag)) {
                        return new ij0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_baby_weight is invalid. Received: " + tag);
                case 4:
                    if ("layout/activity_electronic_scale_balance_weight_0".equals(tag)) {
                        return new kj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_balance_weight is invalid. Received: " + tag);
                case 5:
                    if ("layout/activity_electronic_scale_claim_record_0".equals(tag)) {
                        return new mj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_claim_record is invalid. Received: " + tag);
                case 6:
                    if ("layout/activity_electronic_scale_claim_record_header_0".equals(tag)) {
                        return new oj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_claim_record_header is invalid. Received: " + tag);
                case 7:
                    if ("layout/activity_electronic_scale_config_wifi_0".equals(tag)) {
                        return new qj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_config_wifi is invalid. Received: " + tag);
                case 8:
                    if ("layout/activity_electronic_scale_config_wifi_timeout_0".equals(tag)) {
                        return new sj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_config_wifi_timeout is invalid. Received: " + tag);
                case 9:
                    if ("layout/activity_electronic_scale_data_report_0".equals(tag)) {
                        return new uj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_data_report is invalid. Received: " + tag);
                case 10:
                    if ("layout/activity_electronic_scale_detail_0".equals(tag)) {
                        return new wj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_detail is invalid. Received: " + tag);
                case 11:
                    if ("layout/activity_electronic_scale_device_manage_0".equals(tag)) {
                        return new yj0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_device_manage is invalid. Received: " + tag);
                case 12:
                    if ("layout/activity_electronic_scale_device_share_0".equals(tag)) {
                        return new ak0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_device_share is invalid. Received: " + tag);
                case 13:
                    if ("layout/activity_electronic_scale_eight_weight_0".equals(tag)) {
                        return new ck0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_eight_weight is invalid. Received: " + tag);
                case 14:
                    if ("layout/activity_electronic_scale_ota_0".equals(tag)) {
                        return new ek0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_ota is invalid. Received: " + tag);
                case 15:
                    if ("layout/activity_electronic_scale_ota_help_0".equals(tag)) {
                        return new gk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_ota_help is invalid. Received: " + tag);
                case 16:
                    if ("layout/activity_electronic_scale_pair_guide_0".equals(tag)) {
                        return new ik0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_pair_guide is invalid. Received: " + tag);
                case 17:
                    if ("layout/activity_electronic_scale_select_wifi_0".equals(tag)) {
                        return new kk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_select_wifi is invalid. Received: " + tag);
                case 18:
                    if ("layout/activity_electronic_scale_share_confirm_0".equals(tag)) {
                        return new mk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_share_confirm is invalid. Received: " + tag);
                case 19:
                    if ("layout/activity_electronic_scale_user_add_0".equals(tag)) {
                        return new ok0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_user_add is invalid. Received: " + tag);
                case 20:
                    if ("layout/activity_electronic_scale_user_manage_0".equals(tag)) {
                        return new qk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_user_manage is invalid. Received: " + tag);
                case 21:
                    if ("layout/activity_electronic_scale_userinfo_layout_0".equals(tag)) {
                        return new sk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_userinfo_layout is invalid. Received: " + tag);
                case 22:
                    if ("layout/activity_electronic_scale_virtual_member_data_0".equals(tag)) {
                        return new uk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_virtual_member_data is invalid. Received: " + tag);
                case 23:
                    if ("layout/activity_electronic_scale_visitor_weight_0".equals(tag)) {
                        return new wk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_visitor_weight is invalid. Received: " + tag);
                case 24:
                    if ("layout/activity_electronic_scale_visitor_weight_success_0".equals(tag)) {
                        return new yk0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_visitor_weight_success is invalid. Received: " + tag);
                case 25:
                    if ("layout/activity_electronic_scale_weight_guide_0".equals(tag)) {
                        return new al0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_weight_guide is invalid. Received: " + tag);
                case 26:
                    if ("layout/activity_electronic_scale_weight_help_0".equals(tag)) {
                        return new cl0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_weight_help is invalid. Received: " + tag);
                case 27:
                    if ("layout/activity_electronic_scale_wifi_info_0".equals(tag)) {
                        return new el0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_electronic_scale_wifi_info is invalid. Received: " + tag);
                case 28:
                    if ("layout/electronic_scale_footer_user_manage_list_item_0".equals(tag)) {
                        return new k48(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_footer_user_manage_list_item is invalid. Received: " + tag);
                case 29:
                    if ("layout/electronic_scale_header_user_manage_list_item_0".equals(tag)) {
                        return new m48(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_header_user_manage_list_item is invalid. Received: " + tag);
                case 30:
                    if ("layout/electronic_scale_health_layout_card_data_item_0".equals(tag)) {
                        return new o48(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_health_layout_card_data_item is invalid. Received: " + tag);
                case 31:
                    if ("layout/electronic_scale_health_triplet_item_with_logo_0".equals(tag)) {
                        return new q48(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_health_triplet_item_with_logo is invalid. Received: " + tag);
                case 32:
                    if ("layout/electronic_scale_health_weight_evaluation_detail_item_0".equals(tag)) {
                        return new s48(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_health_weight_evaluation_detail_item is invalid. Received: " + tag);
                case 33:
                    if ("layout/electronic_scale_view_analysis_data_0".equals(tag)) {
                        return new c68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_analysis_data is invalid. Received: " + tag);
                case 34:
                    if ("layout/electronic_scale_view_analysis_data_des_0".equals(tag)) {
                        return new e68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_analysis_data_des is invalid. Received: " + tag);
                case 35:
                    if ("layout/electronic_scale_view_body_composition_analysis_0".equals(tag)) {
                        return new g68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_body_composition_analysis is invalid. Received: " + tag);
                case 36:
                    if ("layout/electronic_scale_view_body_condition_0".equals(tag)) {
                        return new i68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_body_condition is invalid. Received: " + tag);
                case 37:
                    if ("layout/electronic_scale_view_body_index_score_0".equals(tag)) {
                        return new k68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_body_index_score is invalid. Received: " + tag);
                case 38:
                    if ("layout/electronic_scale_view_evaluation_index_0".equals(tag)) {
                        return new m68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_evaluation_index is invalid. Received: " + tag);
                case 39:
                    if ("layout/electronic_scale_view_fat_analysis_0".equals(tag)) {
                        return new o68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_fat_analysis is invalid. Received: " + tag);
                case 40:
                    if ("layout/electronic_scale_view_skeleta_muscle_analysis_0".equals(tag)) {
                        return new q68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_skeleta_muscle_analysis is invalid. Received: " + tag);
                case 41:
                    if ("layout/electronic_scale_view_skeletal_muscle_analysis_0".equals(tag)) {
                        return new s68(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for electronic_scale_view_skeletal_muscle_analysis is invalid. Received: " + tag);
                case 42:
                    if ("layout/fragment_electronic_scale_virtual_member_day_tab_0".equals(tag)) {
                        return new o5a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_electronic_scale_virtual_member_day_tab is invalid. Received: " + tag);
                case 43:
                    if ("layout/fragment_electronic_scale_virtual_member_statistics_tab_0".equals(tag)) {
                        return new q5a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_electronic_scale_virtual_member_statistics_tab is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
