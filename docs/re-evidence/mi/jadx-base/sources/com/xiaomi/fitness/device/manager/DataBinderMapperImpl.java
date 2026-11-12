package com.xiaomi.fitness.device.manager;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.a86;
import defpackage.c86;
import defpackage.dui;
import defpackage.e76;
import defpackage.e86;
import defpackage.fs6;
import defpackage.g76;
import defpackage.g86;
import defpackage.h16;
import defpackage.i46;
import defpackage.i76;
import defpackage.i86;
import defpackage.j16;
import defpackage.k56;
import defpackage.k76;
import defpackage.k86;
import defpackage.l16;
import defpackage.m36;
import defpackage.m56;
import defpackage.m76;
import defpackage.m86;
import defpackage.n16;
import defpackage.n26;
import defpackage.o36;
import defpackage.o56;
import defpackage.o76;
import defpackage.p16;
import defpackage.q36;
import defpackage.q76;
import defpackage.qk5;
import defpackage.r06;
import defpackage.r16;
import defpackage.rk5;
import defpackage.s76;
import defpackage.tu6;
import defpackage.u76;
import defpackage.vu6;
import defpackage.w76;
import defpackage.ws6;
import defpackage.y76;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f11899a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f11900a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            f11900a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "accessoryDevice");
            sparseArray.put(2, "currentDevice");
            sparseArray.put(3, "device");
            sparseArray.put(4, "deviceInfo");
            sparseArray.put(5, "info");
            sparseArray.put(6, "item");
            sparseArray.put(7, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArray.put(8, "mainViewModel");
            sparseArray.put(9, "night");
            sparseArray.put(10, "scannedDeviceInfo");
            sparseArray.put(11, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f11901a;

        static {
            HashMap<String, Integer> map = new HashMap<>(37);
            f11901a = map;
            map.put("layout/device_accessory_bean_go_to_sport_0", Integer.valueOf(dui.f15940a));
            map.put("layout/device_activity_add_device_0", Integer.valueOf(dui.f15941b));
            map.put("layout/device_activity_bind_device_0", Integer.valueOf(dui.c));
            map.put("layout/device_activity_guide_keep_alive_setting_0", Integer.valueOf(dui.d));
            map.put("layout/device_activity_manager_0", Integer.valueOf(dui.e));
            map.put("layout/device_activity_reset_guide_0", Integer.valueOf(dui.f));
            map.put("layout/device_activity_scan_device_0", Integer.valueOf(dui.g));
            map.put("layout/device_custom_swipe_view_0", Integer.valueOf(dui.h));
            map.put("layout/device_device_title_0", Integer.valueOf(dui.i));
            map.put("layout/device_dialog_resume_connect_0", Integer.valueOf(dui.l));
            map.put("layout/device_dialog_switch_wear_mode_0", Integer.valueOf(dui.n));
            map.put("layout/device_exit_accessory_list_0", Integer.valueOf(dui.o));
            map.put("layout/device_fragment_device_tab_parent_v4_0", Integer.valueOf(dui.p));
            map.put("layout/device_fragment_device_tab_v4_0", Integer.valueOf(dui.q));
            map.put("layout/device_fragment_setting_list_0", Integer.valueOf(dui.f15943r));
            map.put("layout/device_item_accessory_device_status_0", Integer.valueOf(dui.s));
            map.put("layout/device_item_add_new_0", Integer.valueOf(dui.t));
            map.put("layout/device_item_add_new_v4_0", Integer.valueOf(dui.u));
            map.put("layout/device_item_banner_item_v4_0", Integer.valueOf(dui.v));
            map.put("layout/device_item_banner_v4_0", Integer.valueOf(dui.w));
            map.put("layout/device_item_bound_device_0", Integer.valueOf(dui.x));
            map.put("layout/device_item_content_list_0", Integer.valueOf(dui.y));
            map.put("layout/device_item_device_0", Integer.valueOf(dui.z));
            map.put("layout/device_item_device_label_0", Integer.valueOf(dui.A));
            map.put("layout/device_item_device_status_v4_0", Integer.valueOf(dui.B));
            map.put("layout/device_item_face_entrance_v4_0", Integer.valueOf(dui.C));
            map.put("layout/device_item_other_device_item_0", Integer.valueOf(dui.D));
            map.put("layout/device_item_remind_setting_banner_v4_0", Integer.valueOf(dui.E));
            map.put("layout/device_item_scan_device_result_0", Integer.valueOf(dui.F));
            map.put("layout/device_item_switch_content_list_0", Integer.valueOf(dui.G));
            map.put("layout/device_item_unbind_device_v4_0", Integer.valueOf(dui.H));
            map.put("layout/device_layout_accessort_sport_select_item_0", Integer.valueOf(dui.I));
            map.put("layout/device_layout_face_entrance_icon_item_0", Integer.valueOf(dui.J));
            map.put("layout/device_tab_normal_item_0", Integer.valueOf(dui.L));
            map.put("layout/device_tab_setting_item_list_0", Integer.valueOf(dui.M));
            map.put("layout/device_view_huami_scan_guide_0", Integer.valueOf(dui.R));
            map.put("layout/device_view_normal_scan_guide_0", Integer.valueOf(dui.S));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(37);
        f11899a = sparseIntArray;
        sparseIntArray.put(dui.f15940a, 1);
        sparseIntArray.put(dui.f15941b, 2);
        sparseIntArray.put(dui.c, 3);
        sparseIntArray.put(dui.d, 4);
        sparseIntArray.put(dui.e, 5);
        sparseIntArray.put(dui.f, 6);
        sparseIntArray.put(dui.g, 7);
        sparseIntArray.put(dui.h, 8);
        sparseIntArray.put(dui.i, 9);
        sparseIntArray.put(dui.l, 10);
        sparseIntArray.put(dui.n, 11);
        sparseIntArray.put(dui.o, 12);
        sparseIntArray.put(dui.p, 13);
        sparseIntArray.put(dui.q, 14);
        sparseIntArray.put(dui.f15943r, 15);
        sparseIntArray.put(dui.s, 16);
        sparseIntArray.put(dui.t, 17);
        sparseIntArray.put(dui.u, 18);
        sparseIntArray.put(dui.v, 19);
        sparseIntArray.put(dui.w, 20);
        sparseIntArray.put(dui.x, 21);
        sparseIntArray.put(dui.y, 22);
        sparseIntArray.put(dui.z, 23);
        sparseIntArray.put(dui.A, 24);
        sparseIntArray.put(dui.B, 25);
        sparseIntArray.put(dui.C, 26);
        sparseIntArray.put(dui.D, 27);
        sparseIntArray.put(dui.E, 28);
        sparseIntArray.put(dui.F, 29);
        sparseIntArray.put(dui.G, 30);
        sparseIntArray.put(dui.H, 31);
        sparseIntArray.put(dui.I, 32);
        sparseIntArray.put(dui.J, 33);
        sparseIntArray.put(dui.L, 34);
        sparseIntArray.put(dui.M, 35);
        sparseIntArray.put(dui.R, 36);
        sparseIntArray.put(dui.S, 37);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(60);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.alexa.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.capability.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.checkupdate.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.uri_parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.blood_sugar_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.keep_alive.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.ble.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.nfc.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.notify.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_eco_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ubox_guide.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.watch.face.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.wearos.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f11900a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        int i2;
        if (viewArr != null && viewArr.length != 0 && (i2 = f11899a.get(i)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 8) {
                if ("layout/device_custom_swipe_view_0".equals(tag)) {
                    return new n26(rk5Var, viewArr);
                }
                throw new IllegalArgumentException("The tag for device_custom_swipe_view is invalid. Received: " + tag);
            }
        }
        return null;
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f11901a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f11899a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/device_accessory_bean_go_to_sport_0".equals(tag)) {
                        return new r06(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_accessory_bean_go_to_sport is invalid. Received: " + tag);
                case 2:
                    if ("layout/device_activity_add_device_0".equals(tag)) {
                        return new h16(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_activity_add_device is invalid. Received: " + tag);
                case 3:
                    if ("layout/device_activity_bind_device_0".equals(tag)) {
                        return new j16(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_activity_bind_device is invalid. Received: " + tag);
                case 4:
                    if ("layout/device_activity_guide_keep_alive_setting_0".equals(tag)) {
                        return new l16(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_activity_guide_keep_alive_setting is invalid. Received: " + tag);
                case 5:
                    if ("layout/device_activity_manager_0".equals(tag)) {
                        return new n16(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_activity_manager is invalid. Received: " + tag);
                case 6:
                    if ("layout/device_activity_reset_guide_0".equals(tag)) {
                        return new p16(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_activity_reset_guide is invalid. Received: " + tag);
                case 7:
                    if ("layout/device_activity_scan_device_0".equals(tag)) {
                        return new r16(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_activity_scan_device is invalid. Received: " + tag);
                case 8:
                    if ("layout/device_custom_swipe_view_0".equals(tag)) {
                        return new n26(rk5Var, new View[]{view});
                    }
                    throw new IllegalArgumentException("The tag for device_custom_swipe_view is invalid. Received: " + tag);
                case 9:
                    if ("layout/device_device_title_0".equals(tag)) {
                        return new m36(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_device_title is invalid. Received: " + tag);
                case 10:
                    if ("layout/device_dialog_resume_connect_0".equals(tag)) {
                        return new o36(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_dialog_resume_connect is invalid. Received: " + tag);
                case 11:
                    if ("layout/device_dialog_switch_wear_mode_0".equals(tag)) {
                        return new q36(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_dialog_switch_wear_mode is invalid. Received: " + tag);
                case 12:
                    if ("layout/device_exit_accessory_list_0".equals(tag)) {
                        return new i46(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_exit_accessory_list is invalid. Received: " + tag);
                case 13:
                    if ("layout/device_fragment_device_tab_parent_v4_0".equals(tag)) {
                        return new k56(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_fragment_device_tab_parent_v4 is invalid. Received: " + tag);
                case 14:
                    if ("layout/device_fragment_device_tab_v4_0".equals(tag)) {
                        return new m56(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_fragment_device_tab_v4 is invalid. Received: " + tag);
                case 15:
                    if ("layout/device_fragment_setting_list_0".equals(tag)) {
                        return new o56(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_fragment_setting_list is invalid. Received: " + tag);
                case 16:
                    if ("layout/device_item_accessory_device_status_0".equals(tag)) {
                        return new e76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_accessory_device_status is invalid. Received: " + tag);
                case 17:
                    if ("layout/device_item_add_new_0".equals(tag)) {
                        return new g76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_add_new is invalid. Received: " + tag);
                case 18:
                    if ("layout/device_item_add_new_v4_0".equals(tag)) {
                        return new i76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_add_new_v4 is invalid. Received: " + tag);
                case 19:
                    if ("layout/device_item_banner_item_v4_0".equals(tag)) {
                        return new k76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_banner_item_v4 is invalid. Received: " + tag);
                case 20:
                    if ("layout/device_item_banner_v4_0".equals(tag)) {
                        return new m76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_banner_v4 is invalid. Received: " + tag);
                case 21:
                    if ("layout/device_item_bound_device_0".equals(tag)) {
                        return new o76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_bound_device is invalid. Received: " + tag);
                case 22:
                    if ("layout/device_item_content_list_0".equals(tag)) {
                        return new q76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_content_list is invalid. Received: " + tag);
                case 23:
                    if ("layout/device_item_device_0".equals(tag)) {
                        return new s76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_device is invalid. Received: " + tag);
                case 24:
                    if ("layout/device_item_device_label_0".equals(tag)) {
                        return new u76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_device_label is invalid. Received: " + tag);
                case 25:
                    if ("layout/device_item_device_status_v4_0".equals(tag)) {
                        return new w76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_device_status_v4 is invalid. Received: " + tag);
                case 26:
                    if ("layout/device_item_face_entrance_v4_0".equals(tag)) {
                        return new y76(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_face_entrance_v4 is invalid. Received: " + tag);
                case 27:
                    if ("layout/device_item_other_device_item_0".equals(tag)) {
                        return new a86(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_other_device_item is invalid. Received: " + tag);
                case 28:
                    if ("layout/device_item_remind_setting_banner_v4_0".equals(tag)) {
                        return new c86(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_remind_setting_banner_v4 is invalid. Received: " + tag);
                case 29:
                    if ("layout/device_item_scan_device_result_0".equals(tag)) {
                        return new e86(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_scan_device_result is invalid. Received: " + tag);
                case 30:
                    if ("layout/device_item_switch_content_list_0".equals(tag)) {
                        return new g86(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_switch_content_list is invalid. Received: " + tag);
                case 31:
                    if ("layout/device_item_unbind_device_v4_0".equals(tag)) {
                        return new i86(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_item_unbind_device_v4 is invalid. Received: " + tag);
                case 32:
                    if ("layout/device_layout_accessort_sport_select_item_0".equals(tag)) {
                        return new k86(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_layout_accessort_sport_select_item is invalid. Received: " + tag);
                case 33:
                    if ("layout/device_layout_face_entrance_icon_item_0".equals(tag)) {
                        return new m86(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_layout_face_entrance_icon_item is invalid. Received: " + tag);
                case 34:
                    if ("layout/device_tab_normal_item_0".equals(tag)) {
                        return new fs6(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_tab_normal_item is invalid. Received: " + tag);
                case 35:
                    if ("layout/device_tab_setting_item_list_0".equals(tag)) {
                        return new ws6(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_tab_setting_item_list is invalid. Received: " + tag);
                case 36:
                    if ("layout/device_view_huami_scan_guide_0".equals(tag)) {
                        return new tu6(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_view_huami_scan_guide is invalid. Received: " + tag);
                case 37:
                    if ("layout/device_view_normal_scan_guide_0".equals(tag)) {
                        return new vu6(rk5Var, view);
                    }
                    throw new IllegalArgumentException("The tag for device_view_normal_scan_guide is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
