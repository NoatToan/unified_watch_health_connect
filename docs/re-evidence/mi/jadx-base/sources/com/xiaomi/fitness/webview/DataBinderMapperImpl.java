package com.xiaomi.fitness.webview;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.ibr;
import defpackage.kbr;
import defpackage.pvi;
import defpackage.qk5;
import defpackage.rk5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13435a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13436a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f13436a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13437a;

        static {
            HashMap<String, Integer> map = new HashMap<>(2);
            f13437a = map;
            map.put("layout/web_activity_browser_0", Integer.valueOf(pvi.c));
            map.put("layout/web_activity_webview_0", Integer.valueOf(pvi.d));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f13435a = sparseIntArray;
        sparseIntArray.put(pvi.c, 1);
        sparseIntArray.put(pvi.d, 2);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(28);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.access.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.membership.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.nfc.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.notify.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.pay.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13436a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f13435a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13437a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f13435a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/web_activity_browser_0".equals(tag)) {
                return new ibr(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for web_activity_browser is invalid. Received: " + tag);
        }
        if (i2 != 2) {
            return null;
        }
        if ("layout/web_activity_webview_0".equals(tag)) {
            return new kbr(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for web_activity_webview is invalid. Received: " + tag);
    }
}
