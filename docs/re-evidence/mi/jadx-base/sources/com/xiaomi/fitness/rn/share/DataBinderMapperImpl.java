package com.xiaomi.fitness.rn.share;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.avi;
import defpackage.bwk;
import defpackage.dwk;
import defpackage.fwk;
import defpackage.hwk;
import defpackage.jwk;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.rvk;
import defpackage.tvk;
import defpackage.vvk;
import defpackage.xvk;
import defpackage.zvk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12821a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12822a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f12822a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12823a;

        static {
            HashMap<String, Integer> map = new HashMap<>(10);
            f12823a = map;
            map.put("layout/rn_share_activity_device_share_0", Integer.valueOf(avi.f3488a));
            map.put("layout/rn_share_activity_device_share_detail_0", Integer.valueOf(avi.f3489b));
            map.put("layout/rn_share_activity_input_user_id_0", Integer.valueOf(avi.c));
            map.put("layout/rn_share_activity_receive_user_info_0", Integer.valueOf(avi.d));
            map.put("layout/rn_share_device_accept_item_0", Integer.valueOf(avi.e));
            map.put("layout/rn_share_device_list_item_0", Integer.valueOf(avi.f));
            map.put("layout/rn_share_device_share_user_list_0", Integer.valueOf(avi.g));
            map.put("layout/rn_share_fragment_accept_list_0", Integer.valueOf(avi.h));
            map.put("layout/rn_share_fragment_device_list_0", Integer.valueOf(avi.i));
            map.put("layout/rn_share_show__device_share_msg_dialog_0", Integer.valueOf(avi.j));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f12821a = sparseIntArray;
        sparseIntArray.put(avi.f3488a, 1);
        sparseIntArray.put(avi.f3489b, 2);
        sparseIntArray.put(avi.c, 3);
        sparseIntArray.put(avi.d, 4);
        sparseIntArray.put(avi.e, 5);
        sparseIntArray.put(avi.f, 6);
        sparseIntArray.put(avi.g, 7);
        sparseIntArray.put(avi.h, 8);
        sparseIntArray.put(avi.i, 9);
        sparseIntArray.put(avi.j, 10);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(18);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.ble.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12822a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12821a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12823a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12821a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/rn_share_activity_device_share_0".equals(tag)) {
                        return new rvk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_activity_device_share is invalid. Received: " + tag);
                case 2:
                    if ("layout/rn_share_activity_device_share_detail_0".equals(tag)) {
                        return new tvk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_activity_device_share_detail is invalid. Received: " + tag);
                case 3:
                    if ("layout/rn_share_activity_input_user_id_0".equals(tag)) {
                        return new vvk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_activity_input_user_id is invalid. Received: " + tag);
                case 4:
                    if ("layout/rn_share_activity_receive_user_info_0".equals(tag)) {
                        return new xvk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_activity_receive_user_info is invalid. Received: " + tag);
                case 5:
                    if ("layout/rn_share_device_accept_item_0".equals(tag)) {
                        return new zvk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_device_accept_item is invalid. Received: " + tag);
                case 6:
                    if ("layout/rn_share_device_list_item_0".equals(tag)) {
                        return new bwk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_device_list_item is invalid. Received: " + tag);
                case 7:
                    if ("layout/rn_share_device_share_user_list_0".equals(tag)) {
                        return new dwk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_device_share_user_list is invalid. Received: " + tag);
                case 8:
                    if ("layout/rn_share_fragment_accept_list_0".equals(tag)) {
                        return new fwk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_fragment_accept_list is invalid. Received: " + tag);
                case 9:
                    if ("layout/rn_share_fragment_device_list_0".equals(tag)) {
                        return new hwk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_fragment_device_list is invalid. Received: " + tag);
                case 10:
                    if ("layout/rn_share_show__device_share_msg_dialog_0".equals(tag)) {
                        return new jwk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for rn_share_show__device_share_msg_dialog is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
