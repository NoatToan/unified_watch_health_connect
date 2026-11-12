package com.xiaomi.fitness.route;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.bvi;
import defpackage.byk;
import defpackage.c3g;
import defpackage.dzk;
import defpackage.e3g;
import defpackage.f2g;
import defpackage.fzk;
import defpackage.g3g;
import defpackage.i3g;
import defpackage.j2g;
import defpackage.jzk;
import defpackage.k3g;
import defpackage.n2g;
import defpackage.p2g;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.y1g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12827a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12828a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f12828a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "report");
            sparseArray.put(2, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12829a;

        static {
            HashMap<String, Integer> map = new HashMap<>(14);
            f12829a = map;
            map.put("layout/mine_layout_edit_route_0", Integer.valueOf(bvi.f4641a));
            map.put("layout/mine_medal_entrance_medal_item_0", Integer.valueOf(bvi.f4642b));
            map.put("layout/mine_medal_unlogged_in_entrance_0", Integer.valueOf(bvi.c));
            map.put("layout/mine_my_track_lib_activity_0", Integer.valueOf(bvi.d));
            map.put("layout/mine_no_ele_layout_0", Integer.valueOf(bvi.e));
            map.put("layout/mine_track_adapter_0", Integer.valueOf(bvi.f));
            map.put("layout/mine_track_detail_activity_0", Integer.valueOf(bvi.g));
            map.put("layout/mine_track_detail_progress_0", Integer.valueOf(bvi.h));
            map.put("layout/mine_track_height_0", Integer.valueOf(bvi.i));
            map.put("layout/mine_track_no_data_0", Integer.valueOf(bvi.j));
            map.put("layout/route_activity_my_track_list_0", Integer.valueOf(bvi.n));
            map.put("layout/route_fragment_track_list_collect_0", Integer.valueOf(bvi.o));
            map.put("layout/route_fragment_track_list_create_0", Integer.valueOf(bvi.p));
            map.put("layout/route_layout_track_list_tab_item_0", Integer.valueOf(bvi.q));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(14);
        f12827a = sparseIntArray;
        sparseIntArray.put(bvi.f4641a, 1);
        sparseIntArray.put(bvi.f4642b, 2);
        sparseIntArray.put(bvi.c, 3);
        sparseIntArray.put(bvi.d, 4);
        sparseIntArray.put(bvi.e, 5);
        sparseIntArray.put(bvi.f, 6);
        sparseIntArray.put(bvi.g, 7);
        sparseIntArray.put(bvi.h, 8);
        sparseIntArray.put(bvi.i, 9);
        sparseIntArray.put(bvi.j, 10);
        sparseIntArray.put(bvi.n, 11);
        sparseIntArray.put(bvi.o, 12);
        sparseIntArray.put(bvi.p, 13);
        sparseIntArray.put(bvi.q, 14);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(25);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.map.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.chart.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.map.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.route.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12828a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12827a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12829a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12827a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/mine_layout_edit_route_0".equals(tag)) {
                        return new y1g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_layout_edit_route is invalid. Received: " + tag);
                case 2:
                    if ("layout/mine_medal_entrance_medal_item_0".equals(tag)) {
                        return new f2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_medal_entrance_medal_item is invalid. Received: " + tag);
                case 3:
                    if ("layout/mine_medal_unlogged_in_entrance_0".equals(tag)) {
                        return new j2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_medal_unlogged_in_entrance is invalid. Received: " + tag);
                case 4:
                    if ("layout/mine_my_track_lib_activity_0".equals(tag)) {
                        return new n2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_my_track_lib_activity is invalid. Received: " + tag);
                case 5:
                    if ("layout/mine_no_ele_layout_0".equals(tag)) {
                        return new p2g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_no_ele_layout is invalid. Received: " + tag);
                case 6:
                    if ("layout/mine_track_adapter_0".equals(tag)) {
                        return new c3g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_track_adapter is invalid. Received: " + tag);
                case 7:
                    if ("layout/mine_track_detail_activity_0".equals(tag)) {
                        return new e3g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_track_detail_activity is invalid. Received: " + tag);
                case 8:
                    if ("layout/mine_track_detail_progress_0".equals(tag)) {
                        return new g3g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_track_detail_progress is invalid. Received: " + tag);
                case 9:
                    if ("layout/mine_track_height_0".equals(tag)) {
                        return new i3g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_track_height is invalid. Received: " + tag);
                case 10:
                    if ("layout/mine_track_no_data_0".equals(tag)) {
                        return new k3g(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_track_no_data is invalid. Received: " + tag);
                case 11:
                    if ("layout/route_activity_my_track_list_0".equals(tag)) {
                        return new byk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for route_activity_my_track_list is invalid. Received: " + tag);
                case 12:
                    if ("layout/route_fragment_track_list_collect_0".equals(tag)) {
                        return new dzk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for route_fragment_track_list_collect is invalid. Received: " + tag);
                case 13:
                    if ("layout/route_fragment_track_list_create_0".equals(tag)) {
                        return new fzk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for route_fragment_track_list_create is invalid. Received: " + tag);
                case 14:
                    if ("layout/route_layout_track_list_tab_item_0".equals(tag)) {
                        return new jzk(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for route_layout_track_list_tab_item is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
