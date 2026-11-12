package com.xiaomi.fitness.sport_capture;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.evi;
import defpackage.fae;
import defpackage.g8e;
import defpackage.gae;
import defpackage.h8e;
import defpackage.hh0;
import defpackage.ih0;
import defpackage.k2o;
import defpackage.l2o;
import defpackage.n2o;
import defpackage.nma;
import defpackage.o2o;
import defpackage.oma;
import defpackage.q2o;
import defpackage.qde;
import defpackage.qk5;
import defpackage.qma;
import defpackage.r2o;
import defpackage.rde;
import defpackage.rk5;
import defpackage.rma;
import defpackage.t2o;
import defpackage.tma;
import defpackage.u2o;
import defpackage.w2o;
import defpackage.x2o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13020a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13021a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f13021a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13022a;

        static {
            HashMap<String, Integer> map = new HashMap<>(23);
            f13022a = map;
            map.put("layout-land/activity_camera_0", Integer.valueOf(evi.f17106a));
            map.put("layout/activity_camera_0", Integer.valueOf(evi.f17106a));
            map.put("layout-land/fragment_video_0", Integer.valueOf(evi.f17107b));
            map.put("layout/fragment_video_0", Integer.valueOf(evi.f17107b));
            map.put("layout/fragment_video_mix_folded_0", Integer.valueOf(evi.c));
            map.put("layout-land/fragment_video_mix_folded_0", Integer.valueOf(evi.c));
            map.put("layout/fragment_video_mix_unfolded_0", Integer.valueOf(evi.d));
            map.put("layout-land/layout_device_info_0", Integer.valueOf(evi.e));
            map.put("layout/layout_device_info_0", Integer.valueOf(evi.e));
            map.put("layout/layout_info_0", Integer.valueOf(evi.f));
            map.put("layout-land/layout_info_0", Integer.valueOf(evi.f));
            map.put("layout/layout_time_info_0", Integer.valueOf(evi.g));
            map.put("layout-land/layout_time_info_0", Integer.valueOf(evi.g));
            map.put("layout-land/sport_status_type1_0", Integer.valueOf(evi.h));
            map.put("layout/sport_status_type1_0", Integer.valueOf(evi.h));
            map.put("layout-land/sport_status_type2_0", Integer.valueOf(evi.i));
            map.put("layout/sport_status_type2_0", Integer.valueOf(evi.i));
            map.put("layout-land/sport_status_type3_0", Integer.valueOf(evi.j));
            map.put("layout/sport_status_type3_0", Integer.valueOf(evi.j));
            map.put("layout-land/sport_status_type4_0", Integer.valueOf(evi.f17108k));
            map.put("layout/sport_status_type4_0", Integer.valueOf(evi.f17108k));
            map.put("layout-land/sport_status_type5_0", Integer.valueOf(evi.l));
            map.put("layout/sport_status_type5_0", Integer.valueOf(evi.l));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        f13020a = sparseIntArray;
        sparseIntArray.put(evi.f17106a, 1);
        sparseIntArray.put(evi.f17107b, 2);
        sparseIntArray.put(evi.c, 3);
        sparseIntArray.put(evi.d, 4);
        sparseIntArray.put(evi.e, 5);
        sparseIntArray.put(evi.f, 6);
        sparseIntArray.put(evi.g, 7);
        sparseIntArray.put(evi.h, 8);
        sparseIntArray.put(evi.i, 9);
        sparseIntArray.put(evi.j, 10);
        sparseIntArray.put(evi.f17108k, 11);
        sparseIntArray.put(evi.l, 12);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(21);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.capability.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_capture_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13021a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f13020a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13022a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f13020a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout-land/activity_camera_0".equals(tag)) {
                        return new ih0(rk5Var, view);
                    }
                    if ("layout/activity_camera_0".equals(tag)) {
                        return new hh0(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_camera is invalid. Received: " + tag);
                case 2:
                    if ("layout-land/fragment_video_0".equals(tag)) {
                        return new oma(rk5Var, view);
                    }
                    if ("layout/fragment_video_0".equals(tag)) {
                        return new nma(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_video is invalid. Received: " + tag);
                case 3:
                    if ("layout/fragment_video_mix_folded_0".equals(tag)) {
                        return new qma(rk5Var, view);
                    }
                    if ("layout-land/fragment_video_mix_folded_0".equals(tag)) {
                        return new rma(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_video_mix_folded is invalid. Received: " + tag);
                case 4:
                    if ("layout/fragment_video_mix_unfolded_0".equals(tag)) {
                        return new tma(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_video_mix_unfolded is invalid. Received: " + tag);
                case 5:
                    if ("layout-land/layout_device_info_0".equals(tag)) {
                        return new h8e(rk5Var, view);
                    }
                    if ("layout/layout_device_info_0".equals(tag)) {
                        return new g8e(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_device_info is invalid. Received: " + tag);
                case 6:
                    if ("layout/layout_info_0".equals(tag)) {
                        return new fae(rk5Var, view);
                    }
                    if ("layout-land/layout_info_0".equals(tag)) {
                        return new gae(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_info is invalid. Received: " + tag);
                case 7:
                    if ("layout/layout_time_info_0".equals(tag)) {
                        return new qde(rk5Var, view);
                    }
                    if ("layout-land/layout_time_info_0".equals(tag)) {
                        return new rde(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_time_info is invalid. Received: " + tag);
                case 8:
                    if ("layout-land/sport_status_type1_0".equals(tag)) {
                        return new l2o(rk5Var, view);
                    }
                    if ("layout/sport_status_type1_0".equals(tag)) {
                        return new k2o(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for sport_status_type1 is invalid. Received: " + tag);
                case 9:
                    if ("layout-land/sport_status_type2_0".equals(tag)) {
                        return new o2o(rk5Var, view);
                    }
                    if ("layout/sport_status_type2_0".equals(tag)) {
                        return new n2o(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for sport_status_type2 is invalid. Received: " + tag);
                case 10:
                    if ("layout-land/sport_status_type3_0".equals(tag)) {
                        return new r2o(rk5Var, view);
                    }
                    if ("layout/sport_status_type3_0".equals(tag)) {
                        return new q2o(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for sport_status_type3 is invalid. Received: " + tag);
                case 11:
                    if ("layout-land/sport_status_type4_0".equals(tag)) {
                        return new u2o(rk5Var, view);
                    }
                    if ("layout/sport_status_type4_0".equals(tag)) {
                        return new t2o(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for sport_status_type4 is invalid. Received: " + tag);
                case 12:
                    if ("layout-land/sport_status_type5_0".equals(tag)) {
                        return new x2o(rk5Var, view);
                    }
                    if ("layout/sport_status_type5_0".equals(tag)) {
                        return new w2o(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for sport_status_type5 is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
