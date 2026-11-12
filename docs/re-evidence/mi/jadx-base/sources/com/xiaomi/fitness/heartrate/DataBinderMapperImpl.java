package com.xiaomi.fitness.heartrate;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.b7c;
import defpackage.lui;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.v6c;
import defpackage.x6c;
import defpackage.z6c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12334a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12335a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f12335a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12336a;

        static {
            HashMap<String, Integer> map = new HashMap<>(4);
            f12336a = map;
            map.put("layout/heartrate_activity_camera_detect_0", Integer.valueOf(lui.f25443a));
            map.put("layout/heartrate_activity_detect_manual_0", Integer.valueOf(lui.d));
            map.put("layout/heartrate_activity_finger_detect_0", Integer.valueOf(lui.e));
            map.put("layout/heartrate_activity_heart_rate_report_0", Integer.valueOf(lui.g));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f12334a = sparseIntArray;
        sparseIntArray.put(lui.f25443a, 1);
        sparseIntArray.put(lui.d, 2);
        sparseIntArray.put(lui.e, 3);
        sparseIntArray.put(lui.g, 4);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.heartrate.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.instance.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12335a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12334a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12336a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12334a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/heartrate_activity_camera_detect_0".equals(tag)) {
                return new v6c(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for heartrate_activity_camera_detect is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/heartrate_activity_detect_manual_0".equals(tag)) {
                return new x6c(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for heartrate_activity_detect_manual is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/heartrate_activity_finger_detect_0".equals(tag)) {
                return new z6c(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for heartrate_activity_finger_detect is invalid. Received: " + tag);
        }
        if (i2 != 4) {
            return null;
        }
        if ("layout/heartrate_activity_heart_rate_report_0".equals(tag)) {
            return new b7c(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for heartrate_activity_heart_rate_report is invalid. Received: " + tag);
    }
}
