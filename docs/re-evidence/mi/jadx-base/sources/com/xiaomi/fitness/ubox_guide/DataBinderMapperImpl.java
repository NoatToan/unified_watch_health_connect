package com.xiaomi.fitness.ubox_guide;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.lvi;
import defpackage.m8q;
import defpackage.o8q;
import defpackage.q8q;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.s8q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13297a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13298a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f13298a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13299a;

        static {
            HashMap<String, Integer> map = new HashMap<>(4);
            f13299a = map;
            map.put("layout/ubox_activity_guide_0", Integer.valueOf(lvi.f25473a));
            map.put("layout/ubox_fragment_done_0", Integer.valueOf(lvi.f25474b));
            map.put("layout/ubox_fragment_notify_app_setting_0", Integer.valueOf(lvi.c));
            map.put("layout/ubox_fragment_temp_0", Integer.valueOf(lvi.d));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f13297a = sparseIntArray;
        sparseIntArray.put(lvi.f25473a, 1);
        sparseIntArray.put(lvi.f25474b, 2);
        sparseIntArray.put(lvi.c, 3);
        sparseIntArray.put(lvi.d, 4);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(15);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.notify.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ubox_guide.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13298a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f13297a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13299a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f13297a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/ubox_activity_guide_0".equals(tag)) {
                return new m8q(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for ubox_activity_guide is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/ubox_fragment_done_0".equals(tag)) {
                return new o8q(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for ubox_fragment_done is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/ubox_fragment_notify_app_setting_0".equals(tag)) {
                return new q8q(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for ubox_fragment_notify_app_setting is invalid. Received: " + tag);
        }
        if (i2 != 4) {
            return null;
        }
        if ("layout/ubox_fragment_temp_0".equals(tag)) {
            return new s8q(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for ubox_fragment_temp is invalid. Received: " + tag);
    }
}
