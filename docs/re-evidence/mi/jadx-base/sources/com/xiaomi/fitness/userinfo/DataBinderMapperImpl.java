package com.xiaomi.fitness.userinfo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.bjq;
import defpackage.bkq;
import defpackage.ckq;
import defpackage.djq;
import defpackage.ekq;
import defpackage.fjq;
import defpackage.gkq;
import defpackage.hjq;
import defpackage.ikq;
import defpackage.jjq;
import defpackage.kkq;
import defpackage.ljq;
import defpackage.mkq;
import defpackage.njq;
import defpackage.nvi;
import defpackage.okq;
import defpackage.pjq;
import defpackage.qk5;
import defpackage.qkq;
import defpackage.rjq;
import defpackage.rk5;
import defpackage.tjq;
import defpackage.vjq;
import defpackage.xiq;
import defpackage.xjq;
import defpackage.ziq;
import defpackage.zjq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13307a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13308a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f13308a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "info");
            sparseArray.put(2, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13309a;

        static {
            HashMap<String, Integer> map = new HashMap<>(24);
            f13309a = map;
            map.put("layout/userinfo_activity_calorie_goal_guid_0", Integer.valueOf(nvi.e));
            map.put("layout/userinfo_activity_goal_manager_0", Integer.valueOf(nvi.f));
            map.put("layout/userinfo_activity_guide_birthday_0", Integer.valueOf(nvi.g));
            map.put("layout/userinfo_activity_guide_body_detect_finish_0", Integer.valueOf(nvi.h));
            map.put("layout/userinfo_activity_guide_gender_0", Integer.valueOf(nvi.i));
            map.put("layout/userinfo_activity_guide_height_0", Integer.valueOf(nvi.j));
            map.put("layout/userinfo_activity_guide_user_info_0", Integer.valueOf(nvi.f28484k));
            map.put("layout/userinfo_activity_guide_weight_0", Integer.valueOf(nvi.l));
            map.put("layout/userinfo_activity_heart_rate_0", Integer.valueOf(nvi.m));
            map.put("layout/userinfo_activity_mhs_goal_guid_0", Integer.valueOf(nvi.n));
            map.put("layout/userinfo_activity_stand_times_goal_guid_0", Integer.valueOf(nvi.o));
            map.put("layout/userinfo_activity_step_goal_guid_0", Integer.valueOf(nvi.p));
            map.put("layout/userinfo_card_aid_record_0", Integer.valueOf(nvi.q));
            map.put("layout/userinfo_display_item_view_0", Integer.valueOf(nvi.f28485r));
            map.put("layout/userinfo_edit_goal_manager_0", Integer.valueOf(nvi.s));
            map.put("layout-large-land/userinfo_fragment_first_aid_edit_0", Integer.valueOf(nvi.t));
            map.put("layout/userinfo_fragment_first_aid_edit_0", Integer.valueOf(nvi.t));
            map.put("layout/userinfo_fragment_first_aid_home_0", Integer.valueOf(nvi.u));
            map.put("layout/userinfo_layout_activity_0", Integer.valueOf(nvi.w));
            map.put("layout/userinfo_layout_aid_record_detail_0", Integer.valueOf(nvi.x));
            map.put("layout/userinfo_layout_goal_guid_0", Integer.valueOf(nvi.B));
            map.put("layout/userinfo_layout_goal_update_guid_0", Integer.valueOf(nvi.C));
            map.put("layout/userinfo_layout_item_0", Integer.valueOf(nvi.E));
            map.put("layout/userinfo_layout_medicalid_add_emergency_contact_0", Integer.valueOf(nvi.F));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(23);
        f13307a = sparseIntArray;
        sparseIntArray.put(nvi.e, 1);
        sparseIntArray.put(nvi.f, 2);
        sparseIntArray.put(nvi.g, 3);
        sparseIntArray.put(nvi.h, 4);
        sparseIntArray.put(nvi.i, 5);
        sparseIntArray.put(nvi.j, 6);
        sparseIntArray.put(nvi.f28484k, 7);
        sparseIntArray.put(nvi.l, 8);
        sparseIntArray.put(nvi.m, 9);
        sparseIntArray.put(nvi.n, 10);
        sparseIntArray.put(nvi.o, 11);
        sparseIntArray.put(nvi.p, 12);
        sparseIntArray.put(nvi.q, 13);
        sparseIntArray.put(nvi.f28485r, 14);
        sparseIntArray.put(nvi.s, 15);
        sparseIntArray.put(nvi.t, 16);
        sparseIntArray.put(nvi.u, 17);
        sparseIntArray.put(nvi.w, 18);
        sparseIntArray.put(nvi.x, 19);
        sparseIntArray.put(nvi.B, 20);
        sparseIntArray.put(nvi.C, 21);
        sparseIntArray.put(nvi.E, 22);
        sparseIntArray.put(nvi.F, 23);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(29);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.training_plan_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13308a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f13307a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13309a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f13307a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/userinfo_activity_calorie_goal_guid_0".equals(tag)) {
                        return new xiq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_calorie_goal_guid is invalid. Received: " + tag);
                case 2:
                    if ("layout/userinfo_activity_goal_manager_0".equals(tag)) {
                        return new ziq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_goal_manager is invalid. Received: " + tag);
                case 3:
                    if ("layout/userinfo_activity_guide_birthday_0".equals(tag)) {
                        return new bjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_guide_birthday is invalid. Received: " + tag);
                case 4:
                    if ("layout/userinfo_activity_guide_body_detect_finish_0".equals(tag)) {
                        return new djq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_guide_body_detect_finish is invalid. Received: " + tag);
                case 5:
                    if ("layout/userinfo_activity_guide_gender_0".equals(tag)) {
                        return new fjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_guide_gender is invalid. Received: " + tag);
                case 6:
                    if ("layout/userinfo_activity_guide_height_0".equals(tag)) {
                        return new hjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_guide_height is invalid. Received: " + tag);
                case 7:
                    if ("layout/userinfo_activity_guide_user_info_0".equals(tag)) {
                        return new jjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_guide_user_info is invalid. Received: " + tag);
                case 8:
                    if ("layout/userinfo_activity_guide_weight_0".equals(tag)) {
                        return new ljq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_guide_weight is invalid. Received: " + tag);
                case 9:
                    if ("layout/userinfo_activity_heart_rate_0".equals(tag)) {
                        return new njq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_heart_rate is invalid. Received: " + tag);
                case 10:
                    if ("layout/userinfo_activity_mhs_goal_guid_0".equals(tag)) {
                        return new pjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_mhs_goal_guid is invalid. Received: " + tag);
                case 11:
                    if ("layout/userinfo_activity_stand_times_goal_guid_0".equals(tag)) {
                        return new rjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_stand_times_goal_guid is invalid. Received: " + tag);
                case 12:
                    if ("layout/userinfo_activity_step_goal_guid_0".equals(tag)) {
                        return new tjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_activity_step_goal_guid is invalid. Received: " + tag);
                case 13:
                    if ("layout/userinfo_card_aid_record_0".equals(tag)) {
                        return new vjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_card_aid_record is invalid. Received: " + tag);
                case 14:
                    if ("layout/userinfo_display_item_view_0".equals(tag)) {
                        return new xjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_display_item_view is invalid. Received: " + tag);
                case 15:
                    if ("layout/userinfo_edit_goal_manager_0".equals(tag)) {
                        return new zjq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_edit_goal_manager is invalid. Received: " + tag);
                case 16:
                    if ("layout-large-land/userinfo_fragment_first_aid_edit_0".equals(tag)) {
                        return new ckq(rk5Var, view);
                    }
                    if ("layout/userinfo_fragment_first_aid_edit_0".equals(tag)) {
                        return new bkq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_fragment_first_aid_edit is invalid. Received: " + tag);
                case 17:
                    if ("layout/userinfo_fragment_first_aid_home_0".equals(tag)) {
                        return new ekq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_fragment_first_aid_home is invalid. Received: " + tag);
                case 18:
                    if ("layout/userinfo_layout_activity_0".equals(tag)) {
                        return new gkq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_layout_activity is invalid. Received: " + tag);
                case 19:
                    if ("layout/userinfo_layout_aid_record_detail_0".equals(tag)) {
                        return new ikq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_layout_aid_record_detail is invalid. Received: " + tag);
                case 20:
                    if ("layout/userinfo_layout_goal_guid_0".equals(tag)) {
                        return new kkq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_layout_goal_guid is invalid. Received: " + tag);
                case 21:
                    if ("layout/userinfo_layout_goal_update_guid_0".equals(tag)) {
                        return new mkq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_layout_goal_update_guid is invalid. Received: " + tag);
                case 22:
                    if ("layout/userinfo_layout_item_0".equals(tag)) {
                        return new okq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_layout_item is invalid. Received: " + tag);
                case 23:
                    if ("layout/userinfo_layout_medicalid_add_emergency_contact_0".equals(tag)) {
                        return new qkq(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for userinfo_layout_medicalid_add_emergency_contact is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
