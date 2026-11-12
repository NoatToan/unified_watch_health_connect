package com.mi.health.fitness.data.provider;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.qk5;
import defpackage.rk5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10009a = new SparseIntArray(0);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f10010a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f10010a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f10011a = new HashMap<>(0);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(37);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.habit.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.active.pk.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.chart.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.dataprovider.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.heartrate.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.running.group.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sensor.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sleep.trace.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        arrayList.add(new services.reminder.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f10010a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f10009a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f10011a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        if (f10009a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
