package com.xiaomi.fitness.main;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.k1f;
import defpackage.nui;
import defpackage.p1f;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.v2f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12374a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12375a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            f12375a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "mainViewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12376a;

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            f12376a = map;
            map.put("layout/main_activity_main_0", Integer.valueOf(nui.f28379a));
            map.put("layout/main_base_fragment_content_0", Integer.valueOf(nui.f28380b));
            map.put("layout/main_view_tab_0", Integer.valueOf(nui.e));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f12374a = sparseIntArray;
        sparseIntArray.put(nui.f28379a, 1);
        sparseIntArray.put(nui.f28380b, 2);
        sparseIntArray.put(nui.e, 3);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(51);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.appupgrade.export.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.checkupdate.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.uri_parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.map.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.membership.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.nfc.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.notify.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.push.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.res.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.watch.face.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.wearos.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12375a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12374a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12376a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12374a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/main_activity_main_0".equals(tag)) {
                return new k1f(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for main_activity_main is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/main_base_fragment_content_0".equals(tag)) {
                return new p1f(rk5Var, view);
            }
            throw new IllegalArgumentException("The tag for main_base_fragment_content is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/main_view_tab_0".equals(tag)) {
            return new v2f(rk5Var, view);
        }
        throw new IllegalArgumentException("The tag for main_view_tab is invalid. Received: " + tag);
    }
}
