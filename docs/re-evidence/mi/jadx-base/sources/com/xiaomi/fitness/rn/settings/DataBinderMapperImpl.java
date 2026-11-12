package com.xiaomi.fitness.rn.settings;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.ovk;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.zui;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12816a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12817a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            f12817a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12818a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f12818a = map;
            map.put("layout/rn_settings_activity_device_update_0", Integer.valueOf(zui.d));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f12816a = sparseIntArray;
        sparseIntArray.put(zui.d, 1);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(15);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12817a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12816a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12818a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12816a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/rn_settings_activity_device_update_0".equals(tag)) {
            return new ovk(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for rn_settings_activity_device_update is invalid. Received: " + tag);
    }
}
