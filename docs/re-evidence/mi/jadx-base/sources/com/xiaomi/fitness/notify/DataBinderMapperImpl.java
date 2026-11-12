package com.xiaomi.fitness.notify;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.czg;
import defpackage.ezg;
import defpackage.gzg;
import defpackage.j1h;
import defpackage.lzg;
import defpackage.nzg;
import defpackage.pzg;
import defpackage.qk5;
import defpackage.rk5;
import defpackage.tui;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12698a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12699a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f12699a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12700a;

        static {
            HashMap<String, Integer> map = new HashMap<>(7);
            f12700a = map;
            map.put("layout/notify_fragment_call_notify_0", Integer.valueOf(tui.f35057b));
            map.put("layout/notify_fragment_notify_0", Integer.valueOf(tui.c));
            map.put("layout/notify_fragment_sms_reply_0", Integer.valueOf(tui.d));
            map.put("layout/notify_item_sms_reply_0", Integer.valueOf(tui.e));
            map.put("layout/notify_layout_seconds_picker_0", Integer.valueOf(tui.g));
            map.put("layout/notify_layout_sms_reply_popup_menu_0", Integer.valueOf(tui.h));
            map.put("layout/notify_select_app_activity_0", Integer.valueOf(tui.i));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f12698a = sparseIntArray;
        sparseIntArray.put(tui.f35057b, 1);
        sparseIntArray.put(tui.c, 2);
        sparseIntArray.put(tui.d, 3);
        sparseIntArray.put(tui.e, 4);
        sparseIntArray.put(tui.g, 5);
        sparseIntArray.put(tui.h, 6);
        sparseIntArray.put(tui.i, 7);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(33);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.aivs.export.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.capability.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.blood_sugar_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.media.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.milink.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.notify.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ubox_guide.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12699a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12698a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12700a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12698a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/notify_fragment_call_notify_0".equals(tag)) {
                        return new czg(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for notify_fragment_call_notify is invalid. Received: " + tag);
                case 2:
                    if ("layout/notify_fragment_notify_0".equals(tag)) {
                        return new ezg(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for notify_fragment_notify is invalid. Received: " + tag);
                case 3:
                    if ("layout/notify_fragment_sms_reply_0".equals(tag)) {
                        return new gzg(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for notify_fragment_sms_reply is invalid. Received: " + tag);
                case 4:
                    if ("layout/notify_item_sms_reply_0".equals(tag)) {
                        return new lzg(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for notify_item_sms_reply is invalid. Received: " + tag);
                case 5:
                    if ("layout/notify_layout_seconds_picker_0".equals(tag)) {
                        return new nzg(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for notify_layout_seconds_picker is invalid. Received: " + tag);
                case 6:
                    if ("layout/notify_layout_sms_reply_popup_menu_0".equals(tag)) {
                        return new pzg(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for notify_layout_sms_reply_popup_menu is invalid. Received: " + tag);
                case 7:
                    if ("layout/notify_select_app_activity_0".equals(tag)) {
                        return new j1h(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for notify_select_app_activity is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
