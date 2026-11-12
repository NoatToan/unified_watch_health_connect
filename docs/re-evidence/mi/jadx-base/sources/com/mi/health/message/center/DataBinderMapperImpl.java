package com.mi.health.message.center;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.arf;
import defpackage.crf;
import defpackage.frf;
import defpackage.hrf;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.vti;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10029a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f10030a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f10030a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f10031a;

        static {
            HashMap<String, Integer> map = new HashMap<>(4);
            f10031a = map;
            map.put("layout/message_center_agree_reject_item_0", Integer.valueOf(vti.f37213a));
            map.put("layout/message_center_desc_and_time_item_0", Integer.valueOf(vti.f37214b));
            map.put("layout/message_center_main_activity_0", Integer.valueOf(vti.c));
            map.put("layout/message_center_relative_care_fragment_0", Integer.valueOf(vti.d));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f10029a = sparseIntArray;
        sparseIntArray.put(vti.f37213a, 1);
        sparseIntArray.put(vti.f37214b, 2);
        sparseIntArray.put(vti.c, 3);
        sparseIntArray.put(vti.d, 4);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(17);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.message.center.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f10030a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f10029a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f10031a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f10029a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/message_center_agree_reject_item_0".equals(tag)) {
                return new arf(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for message_center_agree_reject_item is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/message_center_desc_and_time_item_0".equals(tag)) {
                return new crf(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for message_center_desc_and_time_item is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/message_center_main_activity_0".equals(tag)) {
                return new frf(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for message_center_main_activity is invalid. Received: " + tag);
        }
        if (i2 != 4) {
            return null;
        }
        if ("layout/message_center_relative_care_fragment_0".equals(tag)) {
            return new hrf(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for message_center_relative_care_fragment is invalid. Received: " + tag);
    }
}
