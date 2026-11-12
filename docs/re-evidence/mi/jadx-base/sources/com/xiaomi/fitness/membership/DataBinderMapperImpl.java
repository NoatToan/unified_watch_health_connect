package com.xiaomi.fitness.membership;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.bpf;
import defpackage.qk5;
import defpackage.qof;
import defpackage.qui;
import defpackage.rk5;
import defpackage.vof;
import defpackage.xof;
import defpackage.zof;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12400a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12401a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f12401a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12402a;

        static {
            HashMap<String, Integer> map = new HashMap<>(5);
            f12402a = map;
            map.put("layout/membership_expired_face_item_0", Integer.valueOf(qui.f31858a));
            map.put("layout/membership_vip_facce_expire_0", Integer.valueOf(qui.f31859b));
            map.put("layout/membership_vip_list_dialog_0", Integer.valueOf(qui.c));
            map.put("layout/membership_vip_list_item_0", Integer.valueOf(qui.d));
            map.put("layout/membership_vip_retention_dialog_0", Integer.valueOf(qui.e));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f12400a = sparseIntArray;
        sparseIntArray.put(qui.f31858a, 1);
        sparseIntArray.put(qui.f31859b, 2);
        sparseIntArray.put(qui.c, 3);
        sparseIntArray.put(qui.d, 4);
        sparseIntArray.put(qui.e, 5);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(21);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.membership.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.pay.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.watch.face.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12401a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12400a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12402a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12400a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/membership_expired_face_item_0".equals(tag)) {
                return new qof(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for membership_expired_face_item is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/membership_vip_facce_expire_0".equals(tag)) {
                return new vof(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for membership_vip_facce_expire is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/membership_vip_list_dialog_0".equals(tag)) {
                return new xof(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for membership_vip_list_dialog is invalid. Received: " + tag);
        }
        if (i2 == 4) {
            if ("layout/membership_vip_list_item_0".equals(tag)) {
                return new zof(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for membership_vip_list_item is invalid. Received: " + tag);
        }
        if (i2 != 5) {
            return null;
        }
        if ("layout/membership_vip_retention_dialog_0".equals(tag)) {
            return new bpf(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for membership_vip_retention_dialog is invalid. Received: " + tag);
    }
}
