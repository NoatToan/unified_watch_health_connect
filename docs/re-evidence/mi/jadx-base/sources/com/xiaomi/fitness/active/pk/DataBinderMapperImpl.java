package com.xiaomi.fitness.active.pk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.bui;
import defpackage.cyh;
import defpackage.eyh;
import defpackage.gxh;
import defpackage.gyh;
import defpackage.ixh;
import defpackage.iyh;
import defpackage.kxh;
import defpackage.kyh;
import defpackage.lyh;
import defpackage.lzh;
import defpackage.mxh;
import defpackage.myh;
import defpackage.oyh;
import defpackage.qk5;
import defpackage.qxh;
import defpackage.qyh;
import defpackage.rk5;
import defpackage.syh;
import defpackage.uxh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f11560a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f11561a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f11561a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f11562a;

        static {
            HashMap<String, Integer> map = new HashMap<>(17);
            f11562a = map;
            map.put("layout/pk_activity_history_detail_0", Integer.valueOf(bui.f4616a));
            map.put("layout/pk_activity_invite_receive_0", Integer.valueOf(bui.f4617b));
            map.put("layout/pk_activity_list_0", Integer.valueOf(bui.c));
            map.put("layout/pk_activity_test_0", Integer.valueOf(bui.d));
            map.put("layout/pk_dialog_pk_in_progress_detail_0", Integer.valueOf(bui.e));
            map.put("layout/pk_friend_recommended_item_view_0", Integer.valueOf(bui.f));
            map.put("layout/pk_layout_arrow_single_line_text_view_0", Integer.valueOf(bui.h));
            map.put("layout/pk_layout_load_more_item_0", Integer.valueOf(bui.j));
            map.put("layout/pk_layout_pk_rule_0", Integer.valueOf(bui.f4618k));
            map.put("layout/pk_layout_process_detail_0", Integer.valueOf(bui.l));
            map.put("layout-small/pk_layout_sending_invitation_activity_0", Integer.valueOf(bui.m));
            map.put("layout-sw679dp-land/pk_layout_sending_invitation_activity_0", Integer.valueOf(bui.m));
            map.put("layout/pk_layout_sending_invitation_activity_0", Integer.valueOf(bui.m));
            map.put("layout/pk_layout_sport_record_date_divider_0", Integer.valueOf(bui.o));
            map.put("layout/pk_layout_sport_record_item_0", Integer.valueOf(bui.p));
            map.put("layout/pk_layout_user_active_goal_0", Integer.valueOf(bui.q));
            map.put("layout/pk_score_percent_layout_0", Integer.valueOf(bui.v));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        f11560a = sparseIntArray;
        sparseIntArray.put(bui.f4616a, 1);
        sparseIntArray.put(bui.f4617b, 2);
        sparseIntArray.put(bui.c, 3);
        sparseIntArray.put(bui.d, 4);
        sparseIntArray.put(bui.e, 5);
        sparseIntArray.put(bui.f, 6);
        sparseIntArray.put(bui.h, 7);
        sparseIntArray.put(bui.j, 8);
        sparseIntArray.put(bui.f4618k, 9);
        sparseIntArray.put(bui.l, 10);
        sparseIntArray.put(bui.m, 11);
        sparseIntArray.put(bui.o, 12);
        sparseIntArray.put(bui.p, 13);
        sparseIntArray.put(bui.q, 14);
        sparseIntArray.put(bui.v, 15);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(22);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.access.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.active.pk.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f11561a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f11560a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f11562a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f11560a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/pk_activity_history_detail_0".equals(tag)) {
                        return new gxh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_activity_history_detail is invalid. Received: " + tag);
                case 2:
                    if ("layout/pk_activity_invite_receive_0".equals(tag)) {
                        return new ixh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_activity_invite_receive is invalid. Received: " + tag);
                case 3:
                    if ("layout/pk_activity_list_0".equals(tag)) {
                        return new kxh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_activity_list is invalid. Received: " + tag);
                case 4:
                    if ("layout/pk_activity_test_0".equals(tag)) {
                        return new mxh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_activity_test is invalid. Received: " + tag);
                case 5:
                    if ("layout/pk_dialog_pk_in_progress_detail_0".equals(tag)) {
                        return new qxh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_dialog_pk_in_progress_detail is invalid. Received: " + tag);
                case 6:
                    if ("layout/pk_friend_recommended_item_view_0".equals(tag)) {
                        return new uxh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_friend_recommended_item_view is invalid. Received: " + tag);
                case 7:
                    if ("layout/pk_layout_arrow_single_line_text_view_0".equals(tag)) {
                        return new cyh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_arrow_single_line_text_view is invalid. Received: " + tag);
                case 8:
                    if ("layout/pk_layout_load_more_item_0".equals(tag)) {
                        return new eyh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_load_more_item is invalid. Received: " + tag);
                case 9:
                    if ("layout/pk_layout_pk_rule_0".equals(tag)) {
                        return new gyh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_pk_rule is invalid. Received: " + tag);
                case 10:
                    if ("layout/pk_layout_process_detail_0".equals(tag)) {
                        return new iyh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_process_detail is invalid. Received: " + tag);
                case 11:
                    if ("layout-small/pk_layout_sending_invitation_activity_0".equals(tag)) {
                        return new lyh(rk5Var, view);
                    }
                    if ("layout-sw679dp-land/pk_layout_sending_invitation_activity_0".equals(tag)) {
                        return new myh(rk5Var, view);
                    }
                    if ("layout/pk_layout_sending_invitation_activity_0".equals(tag)) {
                        return new kyh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_sending_invitation_activity is invalid. Received: " + tag);
                case 12:
                    if ("layout/pk_layout_sport_record_date_divider_0".equals(tag)) {
                        return new oyh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_sport_record_date_divider is invalid. Received: " + tag);
                case 13:
                    if ("layout/pk_layout_sport_record_item_0".equals(tag)) {
                        return new qyh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_sport_record_item is invalid. Received: " + tag);
                case 14:
                    if ("layout/pk_layout_user_active_goal_0".equals(tag)) {
                        return new syh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_layout_user_active_goal is invalid. Received: " + tag);
                case 15:
                    if ("layout/pk_score_percent_layout_0".equals(tag)) {
                        return new lzh(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for pk_score_percent_layout is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
