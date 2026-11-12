package com.mi.fitness.lpamanagement;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.i9a;
import defpackage.k9a;
import defpackage.m5a;
import defpackage.m9a;
import defpackage.o9a;
import defpackage.pti;
import defpackage.q9a;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.s9a;
import defpackage.u9a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9946a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f9947a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f9947a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f9948a;

        static {
            HashMap<String, Integer> map = new HashMap<>(8);
            f9948a = map;
            map.put("layout/fragment_download_profile_0", Integer.valueOf(pti.f30757a));
            map.put("layout/fragment_lpa_chinamobile_0", Integer.valueOf(pti.f30758b));
            map.put("layout/fragment_lpa_chinatelecom_0", Integer.valueOf(pti.c));
            map.put("layout/fragment_lpa_management_0", Integer.valueOf(pti.d));
            map.put("layout/fragment_lpa_management_cm_provision_0", Integer.valueOf(pti.e));
            map.put("layout/fragment_lpa_management_cu_0", Integer.valueOf(pti.f));
            map.put("layout/fragment_lpa_management_cu_provision_0", Integer.valueOf(pti.g));
            map.put("layout/fragment_lpa_management_cu_wechat_0", Integer.valueOf(pti.h));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f9946a = sparseIntArray;
        sparseIntArray.put(pti.f30757a, 1);
        sparseIntArray.put(pti.f30758b, 2);
        sparseIntArray.put(pti.c, 3);
        sparseIntArray.put(pti.d, 4);
        sparseIntArray.put(pti.e, 5);
        sparseIntArray.put(pti.f, 6);
        sparseIntArray.put(pti.g, 7);
        sparseIntArray.put(pti.h, 8);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(21);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.lpamanagement.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f9947a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f9946a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f9948a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f9946a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/fragment_download_profile_0".equals(tag)) {
                        return new m5a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_download_profile is invalid. Received: " + tag);
                case 2:
                    if ("layout/fragment_lpa_chinamobile_0".equals(tag)) {
                        return new i9a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_lpa_chinamobile is invalid. Received: " + tag);
                case 3:
                    if ("layout/fragment_lpa_chinatelecom_0".equals(tag)) {
                        return new k9a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_lpa_chinatelecom is invalid. Received: " + tag);
                case 4:
                    if ("layout/fragment_lpa_management_0".equals(tag)) {
                        return new m9a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_lpa_management is invalid. Received: " + tag);
                case 5:
                    if ("layout/fragment_lpa_management_cm_provision_0".equals(tag)) {
                        return new o9a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_lpa_management_cm_provision is invalid. Received: " + tag);
                case 6:
                    if ("layout/fragment_lpa_management_cu_0".equals(tag)) {
                        return new q9a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_lpa_management_cu is invalid. Received: " + tag);
                case 7:
                    if ("layout/fragment_lpa_management_cu_provision_0".equals(tag)) {
                        return new s9a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_lpa_management_cu_provision is invalid. Received: " + tag);
                case 8:
                    if ("layout/fragment_lpa_management_cu_wechat_0".equals(tag)) {
                        return new u9a(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_lpa_management_cu_wechat is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
