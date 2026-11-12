package com.xiaomi.fitness.habit;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.beb;
import defpackage.deb;
import defpackage.feb;
import defpackage.heb;
import defpackage.iui;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.zdb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12182a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12183a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f12183a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12184a;

        static {
            HashMap<String, Integer> map = new HashMap<>(5);
            f12184a = map;
            map.put("layout/habit_activity_add_habit_0", Integer.valueOf(iui.f22103a));
            map.put("layout/habit_activity_habit_list_0", Integer.valueOf(iui.f22104b));
            map.put("layout/habit_activity_habit_share_0", Integer.valueOf(iui.c));
            map.put("layout/habit_activity_habit_today_0", Integer.valueOf(iui.d));
            map.put("layout/habit_activity_my_habit_list_0", Integer.valueOf(iui.e));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f12182a = sparseIntArray;
        sparseIntArray.put(iui.f22103a, 1);
        sparseIntArray.put(iui.f22104b, 2);
        sparseIntArray.put(iui.c, 3);
        sparseIntArray.put(iui.d, 4);
        sparseIntArray.put(iui.e, 5);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.habit.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12183a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12182a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12184a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12182a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/habit_activity_add_habit_0".equals(tag)) {
                return new zdb(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for habit_activity_add_habit is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/habit_activity_habit_list_0".equals(tag)) {
                return new beb(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for habit_activity_habit_list is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/habit_activity_habit_share_0".equals(tag)) {
                return new deb(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for habit_activity_habit_share is invalid. Received: " + tag);
        }
        if (i2 == 4) {
            if ("layout/habit_activity_habit_today_0".equals(tag)) {
                return new feb(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for habit_activity_habit_today is invalid. Received: " + tag);
        }
        if (i2 != 5) {
            return null;
        }
        if ("layout/habit_activity_my_habit_list_0".equals(tag)) {
            return new heb(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for habit_activity_my_habit_list is invalid. Received: " + tag);
    }
}
