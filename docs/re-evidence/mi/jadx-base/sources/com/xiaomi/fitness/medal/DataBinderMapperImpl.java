package com.xiaomi.fitness.medal;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.acf;
import defpackage.ccf;
import defpackage.dcf;
import defpackage.kff;
import defpackage.oef;
import defpackage.ohf;
import defpackage.pef;
import defpackage.phf;
import defpackage.pui;
import defpackage.qk5;
import defpackage.ref;
import defpackage.rk5;
import defpackage.tef;
import defpackage.vbf;
import defpackage.vef;
import defpackage.xbf;
import defpackage.xef;
import defpackage.ybf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12384a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12385a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f12385a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "medal");
            sparseArray.put(2, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12386a;

        static {
            HashMap<String, Integer> map = new HashMap<>(15);
            f12386a = map;
            map.put("layout/medal_activity_city_medal_list_0", Integer.valueOf(pui.f30800a));
            map.put("layout/medal_activity_detail_0", Integer.valueOf(pui.f30801b));
            map.put("layout-large/medal_activity_detail_0", Integer.valueOf(pui.f30801b));
            map.put("layout/medal_activity_list_0", Integer.valueOf(pui.c));
            map.put("layout/medal_activity_share_0", Integer.valueOf(pui.d));
            map.put("layout-large/medal_activity_share_0", Integer.valueOf(pui.d));
            map.put("layout/medal_item_layout_header_0", Integer.valueOf(pui.h));
            map.put("layout-large/medal_item_layout_header_0", Integer.valueOf(pui.h));
            map.put("layout/medal_item_layout_info_0", Integer.valueOf(pui.i));
            map.put("layout/medal_item_layout_knowmore_0", Integer.valueOf(pui.j));
            map.put("layout/medal_item_layout_setion_0", Integer.valueOf(pui.l));
            map.put("layout/medal_item_layout_to_be_unlocked_0", Integer.valueOf(pui.m));
            map.put("layout/medal_load_more_item_0", Integer.valueOf(pui.p));
            map.put("layout/medal_share_content_view_0", Integer.valueOf(pui.s));
            map.put("layout-large/medal_share_content_view_0", Integer.valueOf(pui.s));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(11);
        f12384a = sparseIntArray;
        sparseIntArray.put(pui.f30800a, 1);
        sparseIntArray.put(pui.f30801b, 2);
        sparseIntArray.put(pui.c, 3);
        sparseIntArray.put(pui.d, 4);
        sparseIntArray.put(pui.h, 5);
        sparseIntArray.put(pui.i, 6);
        sparseIntArray.put(pui.j, 7);
        sparseIntArray.put(pui.l, 8);
        sparseIntArray.put(pui.m, 9);
        sparseIntArray.put(pui.p, 10);
        sparseIntArray.put(pui.s, 11);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(21);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.access.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12385a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12384a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12386a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12384a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/medal_activity_city_medal_list_0".equals(tag)) {
                        return new vbf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_activity_city_medal_list is invalid. Received: " + tag);
                case 2:
                    if ("layout/medal_activity_detail_0".equals(tag)) {
                        return new xbf(rk5Var, view);
                    }
                    if ("layout-large/medal_activity_detail_0".equals(tag)) {
                        return new ybf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_activity_detail is invalid. Received: " + tag);
                case 3:
                    if ("layout/medal_activity_list_0".equals(tag)) {
                        return new acf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_activity_list is invalid. Received: " + tag);
                case 4:
                    if ("layout/medal_activity_share_0".equals(tag)) {
                        return new ccf(rk5Var, view);
                    }
                    if ("layout-large/medal_activity_share_0".equals(tag)) {
                        return new dcf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_activity_share is invalid. Received: " + tag);
                case 5:
                    if ("layout/medal_item_layout_header_0".equals(tag)) {
                        return new oef(rk5Var, view);
                    }
                    if ("layout-large/medal_item_layout_header_0".equals(tag)) {
                        return new pef(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_item_layout_header is invalid. Received: " + tag);
                case 6:
                    if ("layout/medal_item_layout_info_0".equals(tag)) {
                        return new ref(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_item_layout_info is invalid. Received: " + tag);
                case 7:
                    if ("layout/medal_item_layout_knowmore_0".equals(tag)) {
                        return new tef(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_item_layout_knowmore is invalid. Received: " + tag);
                case 8:
                    if ("layout/medal_item_layout_setion_0".equals(tag)) {
                        return new vef(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_item_layout_setion is invalid. Received: " + tag);
                case 9:
                    if ("layout/medal_item_layout_to_be_unlocked_0".equals(tag)) {
                        return new xef(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_item_layout_to_be_unlocked is invalid. Received: " + tag);
                case 10:
                    if ("layout/medal_load_more_item_0".equals(tag)) {
                        return new kff(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_load_more_item is invalid. Received: " + tag);
                case 11:
                    if ("layout/medal_share_content_view_0".equals(tag)) {
                        return new ohf(rk5Var, view);
                    }
                    if ("layout-large/medal_share_content_view_0".equals(tag)) {
                        return new phf(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for medal_share_content_view is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
