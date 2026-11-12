package com.xiaomi.fitness.training_plan;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.bvp;
import defpackage.cm0;
import defpackage.dvp;
import defpackage.em0;
import defpackage.fi;
import defpackage.fvp;
import defpackage.gm0;
import defpackage.hvp;
import defpackage.im0;
import defpackage.jn0;
import defpackage.jvi;
import defpackage.k2a;
import defpackage.km0;
import defpackage.lsp;
import defpackage.mf;
import defpackage.mg0;
import defpackage.mm0;
import defpackage.nnd;
import defpackage.og0;
import defpackage.om0;
import defpackage.qg0;
import defpackage.qk5;
import defpackage.qo0;
import defpackage.rk5;
import defpackage.sg0;
import defpackage.ug0;
import defpackage.uh;
import defpackage.vo0;
import defpackage.vrp;
import defpackage.wg0;
import defpackage.xnd;
import defpackage.xrp;
import defpackage.xup;
import defpackage.zf;
import defpackage.zg;
import defpackage.znd;
import defpackage.zup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13278a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13279a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f13279a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13280a;

        static {
            HashMap<String, Integer> map = new HashMap<>(34);
            f13280a = map;
            map.put("layout/ability_course_item_single_detail_0", Integer.valueOf(jvi.c));
            map.put("layout/ability_day_plan_item_0", Integer.valueOf(jvi.d));
            map.put("layout/ability_day_plan_item_course_info_0", Integer.valueOf(jvi.e));
            map.put("layout/ability_medal_progress_layout_0", Integer.valueOf(jvi.f));
            map.put("layout/ability_medal_progress_layout_tablet_0", Integer.valueOf(jvi.g));
            map.put("layout/activity_ability_course_list_0", Integer.valueOf(jvi.f23186k));
            map.put("layout/activity_ability_plan_date_0", Integer.valueOf(jvi.l));
            map.put("layout/activity_ability_plan_detail_0", Integer.valueOf(jvi.m));
            map.put("layout/activity_ability_plan_question_0", Integer.valueOf(jvi.n));
            map.put("layout/activity_ability_plan_running_course_detail_0", Integer.valueOf(jvi.o));
            map.put("layout/activity_ability_plan_setting_0", Integer.valueOf(jvi.p));
            map.put("layout/activity_habit_plan_detail_0", Integer.valueOf(jvi.f23187r));
            map.put("layout/activity_habit_plan_guide_0", Integer.valueOf(jvi.s));
            map.put("layout/activity_habit_plan_history_record_list_0", Integer.valueOf(jvi.t));
            map.put("layout/activity_habit_plan_home_0", Integer.valueOf(jvi.u));
            map.put("layout/activity_habit_plan_manual_0", Integer.valueOf(jvi.v));
            map.put("layout/activity_habit_plan_setting_0", Integer.valueOf(jvi.w));
            map.put("layout/activity_habit_plan_suggest_0", Integer.valueOf(jvi.x));
            map.put("layout/activity_plan_history_list_0", Integer.valueOf(jvi.y));
            map.put("layout/activity_sport_plan_setting_0", Integer.valueOf(jvi.z));
            map.put("layout/activity_training_type_list_0", Integer.valueOf(jvi.A));
            map.put("layout/fragment_ability_plan_calendar_0", Integer.valueOf(jvi.F));
            map.put("layout/item_habit_report_0", Integer.valueOf(jvi.O));
            map.put("layout/item_plan_history_0", Integer.valueOf(jvi.P));
            map.put("layout/item_share_slogan_view_0", Integer.valueOf(jvi.Q));
            map.put("layout/train_plan_default_report_share_fragment_0", Integer.valueOf(jvi.V));
            map.put("layout/train_plan_default_whole_report_layout_0", Integer.valueOf(jvi.W));
            map.put("layout/train_plan_report_share_activity_0", Integer.valueOf(jvi.X));
            map.put("layout/training_plan_customize_sport_report_share_fragment_0", Integer.valueOf(jvi.Z));
            map.put("layout/training_plan_default_sport_report_share_fragment_0", Integer.valueOf(jvi.b0));
            map.put("layout/training_plan_layout_report_basic_info_0", Integer.valueOf(jvi.c0));
            map.put("layout/training_plan_layout_report_basic_info_list_item_0", Integer.valueOf(jvi.d0));
            map.put("layout/training_plan_layout_report_fragment_0", Integer.valueOf(jvi.e0));
            map.put("layout/training_plan_report_report_item_0", Integer.valueOf(jvi.f0));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(34);
        f13278a = sparseIntArray;
        sparseIntArray.put(jvi.c, 1);
        sparseIntArray.put(jvi.d, 2);
        sparseIntArray.put(jvi.e, 3);
        sparseIntArray.put(jvi.f, 4);
        sparseIntArray.put(jvi.g, 5);
        sparseIntArray.put(jvi.f23186k, 6);
        sparseIntArray.put(jvi.l, 7);
        sparseIntArray.put(jvi.m, 8);
        sparseIntArray.put(jvi.n, 9);
        sparseIntArray.put(jvi.o, 10);
        sparseIntArray.put(jvi.p, 11);
        sparseIntArray.put(jvi.f23187r, 12);
        sparseIntArray.put(jvi.s, 13);
        sparseIntArray.put(jvi.t, 14);
        sparseIntArray.put(jvi.u, 15);
        sparseIntArray.put(jvi.v, 16);
        sparseIntArray.put(jvi.w, 17);
        sparseIntArray.put(jvi.x, 18);
        sparseIntArray.put(jvi.y, 19);
        sparseIntArray.put(jvi.z, 20);
        sparseIntArray.put(jvi.A, 21);
        sparseIntArray.put(jvi.F, 22);
        sparseIntArray.put(jvi.O, 23);
        sparseIntArray.put(jvi.P, 24);
        sparseIntArray.put(jvi.Q, 25);
        sparseIntArray.put(jvi.V, 26);
        sparseIntArray.put(jvi.W, 27);
        sparseIntArray.put(jvi.X, 28);
        sparseIntArray.put(jvi.Z, 29);
        sparseIntArray.put(jvi.b0, 30);
        sparseIntArray.put(jvi.c0, 31);
        sparseIntArray.put(jvi.d0, 32);
        sparseIntArray.put(jvi.e0, 33);
        sparseIntArray.put(jvi.f0, 34);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.capability.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.temperature.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.persist.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.motion.recognition.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.steps.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.training_plan_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13279a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f13278a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13280a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f13278a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/ability_course_item_single_detail_0".equals(tag)) {
                        return new mf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for ability_course_item_single_detail is invalid. Received: " + tag);
                case 2:
                    if ("layout/ability_day_plan_item_0".equals(tag)) {
                        return new zf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for ability_day_plan_item is invalid. Received: " + tag);
                case 3:
                    if ("layout/ability_day_plan_item_course_info_0".equals(tag)) {
                        return new zg(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for ability_day_plan_item_course_info is invalid. Received: " + tag);
                case 4:
                    if ("layout/ability_medal_progress_layout_0".equals(tag)) {
                        return new uh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for ability_medal_progress_layout is invalid. Received: " + tag);
                case 5:
                    if ("layout/ability_medal_progress_layout_tablet_0".equals(tag)) {
                        return new fi(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for ability_medal_progress_layout_tablet is invalid. Received: " + tag);
                case 6:
                    if ("layout/activity_ability_course_list_0".equals(tag)) {
                        return new mg0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_ability_course_list is invalid. Received: " + tag);
                case 7:
                    if ("layout/activity_ability_plan_date_0".equals(tag)) {
                        return new og0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_ability_plan_date is invalid. Received: " + tag);
                case 8:
                    if ("layout/activity_ability_plan_detail_0".equals(tag)) {
                        return new qg0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_ability_plan_detail is invalid. Received: " + tag);
                case 9:
                    if ("layout/activity_ability_plan_question_0".equals(tag)) {
                        return new sg0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_ability_plan_question is invalid. Received: " + tag);
                case 10:
                    if ("layout/activity_ability_plan_running_course_detail_0".equals(tag)) {
                        return new ug0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_ability_plan_running_course_detail is invalid. Received: " + tag);
                case 11:
                    if ("layout/activity_ability_plan_setting_0".equals(tag)) {
                        return new wg0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_ability_plan_setting is invalid. Received: " + tag);
                case 12:
                    if ("layout/activity_habit_plan_detail_0".equals(tag)) {
                        return new cm0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_habit_plan_detail is invalid. Received: " + tag);
                case 13:
                    if ("layout/activity_habit_plan_guide_0".equals(tag)) {
                        return new em0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_habit_plan_guide is invalid. Received: " + tag);
                case 14:
                    if ("layout/activity_habit_plan_history_record_list_0".equals(tag)) {
                        return new gm0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_habit_plan_history_record_list is invalid. Received: " + tag);
                case 15:
                    if ("layout/activity_habit_plan_home_0".equals(tag)) {
                        return new im0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_habit_plan_home is invalid. Received: " + tag);
                case 16:
                    if ("layout/activity_habit_plan_manual_0".equals(tag)) {
                        return new km0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_habit_plan_manual is invalid. Received: " + tag);
                case 17:
                    if ("layout/activity_habit_plan_setting_0".equals(tag)) {
                        return new mm0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_habit_plan_setting is invalid. Received: " + tag);
                case 18:
                    if ("layout/activity_habit_plan_suggest_0".equals(tag)) {
                        return new om0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_habit_plan_suggest is invalid. Received: " + tag);
                case 19:
                    if ("layout/activity_plan_history_list_0".equals(tag)) {
                        return new jn0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_plan_history_list is invalid. Received: " + tag);
                case 20:
                    if ("layout/activity_sport_plan_setting_0".equals(tag)) {
                        return new qo0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_sport_plan_setting is invalid. Received: " + tag);
                case 21:
                    if ("layout/activity_training_type_list_0".equals(tag)) {
                        return new vo0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_training_type_list is invalid. Received: " + tag);
                case 22:
                    if ("layout/fragment_ability_plan_calendar_0".equals(tag)) {
                        return new k2a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_ability_plan_calendar is invalid. Received: " + tag);
                case 23:
                    if ("layout/item_habit_report_0".equals(tag)) {
                        return new nnd(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for item_habit_report is invalid. Received: " + tag);
                case 24:
                    if ("layout/item_plan_history_0".equals(tag)) {
                        return new xnd(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for item_plan_history is invalid. Received: " + tag);
                case 25:
                    if ("layout/item_share_slogan_view_0".equals(tag)) {
                        return new znd(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for item_share_slogan_view is invalid. Received: " + tag);
                case 26:
                    if ("layout/train_plan_default_report_share_fragment_0".equals(tag)) {
                        return new vrp(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for train_plan_default_report_share_fragment is invalid. Received: " + tag);
                case 27:
                    if ("layout/train_plan_default_whole_report_layout_0".equals(tag)) {
                        return new xrp(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for train_plan_default_whole_report_layout is invalid. Received: " + tag);
                case 28:
                    if ("layout/train_plan_report_share_activity_0".equals(tag)) {
                        return new lsp(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for train_plan_report_share_activity is invalid. Received: " + tag);
                case 29:
                    if ("layout/training_plan_customize_sport_report_share_fragment_0".equals(tag)) {
                        return new xup(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for training_plan_customize_sport_report_share_fragment is invalid. Received: " + tag);
                case 30:
                    if ("layout/training_plan_default_sport_report_share_fragment_0".equals(tag)) {
                        return new zup(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for training_plan_default_sport_report_share_fragment is invalid. Received: " + tag);
                case 31:
                    if ("layout/training_plan_layout_report_basic_info_0".equals(tag)) {
                        return new bvp(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for training_plan_layout_report_basic_info is invalid. Received: " + tag);
                case 32:
                    if ("layout/training_plan_layout_report_basic_info_list_item_0".equals(tag)) {
                        return new dvp(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for training_plan_layout_report_basic_info_list_item is invalid. Received: " + tag);
                case 33:
                    if ("layout/training_plan_layout_report_fragment_0".equals(tag)) {
                        return new fvp(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for training_plan_layout_report_fragment is invalid. Received: " + tag);
                case 34:
                    if ("layout/training_plan_report_report_item_0".equals(tag)) {
                        return new hvp(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for training_plan_report_report_item is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
