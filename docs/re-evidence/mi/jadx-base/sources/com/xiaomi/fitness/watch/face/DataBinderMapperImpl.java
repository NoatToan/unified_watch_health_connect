package com.xiaomi.fitness.watch.face;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.a19;
import defpackage.a29;
import defpackage.a39;
import defpackage.ax8;
import defpackage.c19;
import defpackage.c29;
import defpackage.c39;
import defpackage.c6a;
import defpackage.c9e;
import defpackage.cx8;
import defpackage.e19;
import defpackage.e29;
import defpackage.e39;
import defpackage.e6a;
import defpackage.e9e;
import defpackage.ex8;
import defpackage.g19;
import defpackage.g29;
import defpackage.g39;
import defpackage.g6a;
import defpackage.g9e;
import defpackage.gka;
import defpackage.gx8;
import defpackage.i19;
import defpackage.i29;
import defpackage.i39;
import defpackage.i6a;
import defpackage.i9e;
import defpackage.ix8;
import defpackage.k19;
import defpackage.k29;
import defpackage.k39;
import defpackage.k6a;
import defpackage.k9e;
import defpackage.kx8;
import defpackage.lx8;
import defpackage.m19;
import defpackage.m29;
import defpackage.m39;
import defpackage.m6a;
import defpackage.m9e;
import defpackage.nx8;
import defpackage.o19;
import defpackage.o29;
import defpackage.o6a;
import defpackage.o9e;
import defpackage.ovi;
import defpackage.pae;
import defpackage.px8;
import defpackage.q19;
import defpackage.q29;
import defpackage.q6a;
import defpackage.q9e;
import defpackage.qk5;
import defpackage.rae;
import defpackage.rk5;
import defpackage.rnd;
import defpackage.s19;
import defpackage.s29;
import defpackage.s6a;
import defpackage.s8e;
import defpackage.s9e;
import defpackage.u19;
import defpackage.u29;
import defpackage.u6a;
import defpackage.u8e;
import defpackage.u9e;
import defpackage.vnd;
import defpackage.w19;
import defpackage.w29;
import defpackage.w6a;
import defpackage.y19;
import defpackage.y29;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13350a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f13351a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(4);
            f13351a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "categoryData");
            sparseArray.put(2, "tabListData");
            sparseArray.put(3, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f13352a;

        static {
            HashMap<String, Integer> map = new HashMap<>(71);
            f13352a = map;
            map.put("layout/face_fragment_debug_designer_0", Integer.valueOf(ovi.c));
            map.put("layout/face_fragment_edit_photo_crop_0", Integer.valueOf(ovi.d));
            map.put("layout/face_fragment_edit_photo_picker_0", Integer.valueOf(ovi.e));
            map.put("layout/face_fragment_edit_video_crop_0", Integer.valueOf(ovi.f));
            map.put("layout/face_fragment_face_detail_0", Integer.valueOf(ovi.g));
            map.put("layout/face_fragment_face_edit_0", Integer.valueOf(ovi.h));
            map.put("layout-large-land/face_fragment_face_edit_0", Integer.valueOf(ovi.h));
            map.put("layout/face_fragment_paid_list_0", Integer.valueOf(ovi.i));
            map.put("layout/face_fragment_search_0", Integer.valueOf(ovi.j));
            map.put("layout/face_layout_carousel_banner_item_0", Integer.valueOf(ovi.f29737k));
            map.put("layout/face_layout_detail_header_0", Integer.valueOf(ovi.m));
            map.put("layout/face_layout_detail_icon_item_0", Integer.valueOf(ovi.n));
            map.put("layout/face_layout_edit_color_0", Integer.valueOf(ovi.o));
            map.put("layout/face_layout_edit_color_item_0", Integer.valueOf(ovi.p));
            map.put("layout/face_layout_edit_common_item_0", Integer.valueOf(ovi.q));
            map.put("layout/face_layout_edit_font_0", Integer.valueOf(ovi.f29738r));
            map.put("layout/face_layout_edit_font_color_item_0", Integer.valueOf(ovi.s));
            map.put("layout/face_layout_edit_photo_0", Integer.valueOf(ovi.t));
            map.put("layout/face_layout_edit_photo_crop_style_item_0", Integer.valueOf(ovi.u));
            map.put("layout/face_layout_edit_photo_picker_add_0", Integer.valueOf(ovi.v));
            map.put("layout/face_layout_edit_photo_picker_item_0", Integer.valueOf(ovi.w));
            map.put("layout/face_layout_edit_position_0", Integer.valueOf(ovi.y));
            map.put("layout/face_layout_edit_slot_0", Integer.valueOf(ovi.A));
            map.put("layout/face_layout_edit_slot_item_0", Integer.valueOf(ovi.B));
            map.put("layout/face_layout_edit_slot_picker_item_0", Integer.valueOf(ovi.D));
            map.put("layout/face_layout_edit_slot_picker_label_0", Integer.valueOf(ovi.E));
            map.put("layout/face_layout_edit_style_0", Integer.valueOf(ovi.F));
            map.put("layout/face_layout_edit_tab_item_0", Integer.valueOf(ovi.G));
            map.put("layout/face_layout_edit_text_0", Integer.valueOf(ovi.H));
            map.put("layout/face_layout_edit_text_add_item_0", Integer.valueOf(ovi.I));
            map.put("layout/face_layout_edit_text_item_0", Integer.valueOf(ovi.J));
            map.put("layout/face_layout_edit_video_0", Integer.valueOf(ovi.K));
            map.put("layout/face_layout_error_log_item_0", Integer.valueOf(ovi.L));
            map.put("layout/face_layout_history_item_0", Integer.valueOf(ovi.N));
            map.put("layout/face_layout_label_item_0", Integer.valueOf(ovi.O));
            map.put("layout/face_layout_pay_uninstall_item_0", Integer.valueOf(ovi.P));
            map.put("layout/face_layout_photo_edit_bar_0", Integer.valueOf(ovi.Q));
            map.put("layout/face_layout_photo_picker_bar_0", Integer.valueOf(ovi.R));
            map.put("layout/face_layout_search_result_item_0", Integer.valueOf(ovi.T));
            map.put("layout/face_layout_search_title_0", Integer.valueOf(ovi.U));
            map.put("layout/face_layout_suggestion_item_0", Integer.valueOf(ovi.W));
            map.put("layout/face_market_basic_tab_item_0", Integer.valueOf(ovi.Y));
            map.put("layout/fragment_face_0", Integer.valueOf(ovi.Z));
            map.put("layout/fragment_face_ble_photo_0", Integer.valueOf(ovi.a0));
            map.put("layout/fragment_face_ble_video_0", Integer.valueOf(ovi.b0));
            map.put("layout/fragment_face_category_0", Integer.valueOf(ovi.c0));
            map.put("layout/fragment_face_feed_0", Integer.valueOf(ovi.d0));
            map.put("layout/fragment_face_info_ble_0", Integer.valueOf(ovi.e0));
            map.put("layout/fragment_face_info_video_0", Integer.valueOf(ovi.f0));
            map.put("layout/fragment_face_info_wear_os_0", Integer.valueOf(ovi.g0));
            map.put("layout/fragment_face_market_0", Integer.valueOf(ovi.h0));
            map.put("layout/fragment_face_me_0", Integer.valueOf(ovi.i0));
            map.put("layout/fragment_face_wear_os_0", Integer.valueOf(ovi.j0));
            map.put("layout/fragment_fengxian_photo_face_0", Integer.valueOf(ovi.k0));
            map.put("layout/fragment_tab_list_0", Integer.valueOf(ovi.l0));
            map.put("layout/item_os_watch_face_0", Integer.valueOf(ovi.m0));
            map.put("layout/item_photo_face_bg_0", Integer.valueOf(ovi.n0));
            map.put("layout/layout_edit_watch_face_style_option_0", Integer.valueOf(ovi.p0));
            map.put("layout/layout_edit_watch_face_style_setting_0", Integer.valueOf(ovi.q0));
            map.put("layout/layout_face_0", Integer.valueOf(ovi.r0));
            map.put("layout/layout_face_category_item_0", Integer.valueOf(ovi.s0));
            map.put("layout/layout_face_entrance_0", Integer.valueOf(ovi.t0));
            map.put("layout/layout_face_feed_album_item_0", Integer.valueOf(ovi.u0));
            map.put("layout/layout_face_feed_banner_item_0", Integer.valueOf(ovi.v0));
            map.put("layout/layout_face_feed_common_item_0", Integer.valueOf(ovi.w0));
            map.put("layout/layout_face_feed_tab_list_item_0", Integer.valueOf(ovi.x0));
            map.put("layout/layout_face_market_basic_more_item_0", Integer.valueOf(ovi.y0));
            map.put("layout/layout_face_market_des_item_0", Integer.valueOf(ovi.z0));
            map.put("layout/layout_face_tab_list_item_0", Integer.valueOf(ovi.A0));
            map.put("layout/layout_photo_bg_picker_0", Integer.valueOf(ovi.B0));
            map.put("layout/layout_recommend_tab_0", Integer.valueOf(ovi.C0));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(70);
        f13350a = sparseIntArray;
        sparseIntArray.put(ovi.c, 1);
        sparseIntArray.put(ovi.d, 2);
        sparseIntArray.put(ovi.e, 3);
        sparseIntArray.put(ovi.f, 4);
        sparseIntArray.put(ovi.g, 5);
        sparseIntArray.put(ovi.h, 6);
        sparseIntArray.put(ovi.i, 7);
        sparseIntArray.put(ovi.j, 8);
        sparseIntArray.put(ovi.f29737k, 9);
        sparseIntArray.put(ovi.m, 10);
        sparseIntArray.put(ovi.n, 11);
        sparseIntArray.put(ovi.o, 12);
        sparseIntArray.put(ovi.p, 13);
        sparseIntArray.put(ovi.q, 14);
        sparseIntArray.put(ovi.f29738r, 15);
        sparseIntArray.put(ovi.s, 16);
        sparseIntArray.put(ovi.t, 17);
        sparseIntArray.put(ovi.u, 18);
        sparseIntArray.put(ovi.v, 19);
        sparseIntArray.put(ovi.w, 20);
        sparseIntArray.put(ovi.y, 21);
        sparseIntArray.put(ovi.A, 22);
        sparseIntArray.put(ovi.B, 23);
        sparseIntArray.put(ovi.D, 24);
        sparseIntArray.put(ovi.E, 25);
        sparseIntArray.put(ovi.F, 26);
        sparseIntArray.put(ovi.G, 27);
        sparseIntArray.put(ovi.H, 28);
        sparseIntArray.put(ovi.I, 29);
        sparseIntArray.put(ovi.J, 30);
        sparseIntArray.put(ovi.K, 31);
        sparseIntArray.put(ovi.L, 32);
        sparseIntArray.put(ovi.N, 33);
        sparseIntArray.put(ovi.O, 34);
        sparseIntArray.put(ovi.P, 35);
        sparseIntArray.put(ovi.Q, 36);
        sparseIntArray.put(ovi.R, 37);
        sparseIntArray.put(ovi.T, 38);
        sparseIntArray.put(ovi.U, 39);
        sparseIntArray.put(ovi.W, 40);
        sparseIntArray.put(ovi.Y, 41);
        sparseIntArray.put(ovi.Z, 42);
        sparseIntArray.put(ovi.a0, 43);
        sparseIntArray.put(ovi.b0, 44);
        sparseIntArray.put(ovi.c0, 45);
        sparseIntArray.put(ovi.d0, 46);
        sparseIntArray.put(ovi.e0, 47);
        sparseIntArray.put(ovi.f0, 48);
        sparseIntArray.put(ovi.g0, 49);
        sparseIntArray.put(ovi.h0, 50);
        sparseIntArray.put(ovi.i0, 51);
        sparseIntArray.put(ovi.j0, 52);
        sparseIntArray.put(ovi.k0, 53);
        sparseIntArray.put(ovi.l0, 54);
        sparseIntArray.put(ovi.m0, 55);
        sparseIntArray.put(ovi.n0, 56);
        sparseIntArray.put(ovi.p0, 57);
        sparseIntArray.put(ovi.q0, 58);
        sparseIntArray.put(ovi.r0, 59);
        sparseIntArray.put(ovi.s0, 60);
        sparseIntArray.put(ovi.t0, 61);
        sparseIntArray.put(ovi.u0, 62);
        sparseIntArray.put(ovi.v0, 63);
        sparseIntArray.put(ovi.w0, 64);
        sparseIntArray.put(ovi.x0, 65);
        sparseIntArray.put(ovi.y0, 66);
        sparseIntArray.put(ovi.z0, 67);
        sparseIntArray.put(ovi.A0, 68);
        sparseIntArray.put(ovi.B0, 69);
        sparseIntArray.put(ovi.C0, 70);
    }

    private final ViewDataBinding a(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/face_fragment_debug_designer_0".equals(obj)) {
                    return new ax8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_debug_designer is invalid. Received: " + obj);
            case 2:
                if ("layout/face_fragment_edit_photo_crop_0".equals(obj)) {
                    return new cx8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_edit_photo_crop is invalid. Received: " + obj);
            case 3:
                if ("layout/face_fragment_edit_photo_picker_0".equals(obj)) {
                    return new ex8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_edit_photo_picker is invalid. Received: " + obj);
            case 4:
                if ("layout/face_fragment_edit_video_crop_0".equals(obj)) {
                    return new gx8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_edit_video_crop is invalid. Received: " + obj);
            case 5:
                if ("layout/face_fragment_face_detail_0".equals(obj)) {
                    return new ix8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_face_detail is invalid. Received: " + obj);
            case 6:
                if ("layout/face_fragment_face_edit_0".equals(obj)) {
                    return new kx8(rk5Var, view);
                }
                if ("layout-large-land/face_fragment_face_edit_0".equals(obj)) {
                    return new lx8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_face_edit is invalid. Received: " + obj);
            case 7:
                if ("layout/face_fragment_paid_list_0".equals(obj)) {
                    return new nx8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_paid_list is invalid. Received: " + obj);
            case 8:
                if ("layout/face_fragment_search_0".equals(obj)) {
                    return new px8(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_fragment_search is invalid. Received: " + obj);
            case 9:
                if ("layout/face_layout_carousel_banner_item_0".equals(obj)) {
                    return new a19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_carousel_banner_item is invalid. Received: " + obj);
            case 10:
                if ("layout/face_layout_detail_header_0".equals(obj)) {
                    return new c19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_detail_header is invalid. Received: " + obj);
            case 11:
                if ("layout/face_layout_detail_icon_item_0".equals(obj)) {
                    return new e19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_detail_icon_item is invalid. Received: " + obj);
            case 12:
                if ("layout/face_layout_edit_color_0".equals(obj)) {
                    return new g19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_color is invalid. Received: " + obj);
            case 13:
                if ("layout/face_layout_edit_color_item_0".equals(obj)) {
                    return new i19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_color_item is invalid. Received: " + obj);
            case 14:
                if ("layout/face_layout_edit_common_item_0".equals(obj)) {
                    return new k19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_common_item is invalid. Received: " + obj);
            case 15:
                if ("layout/face_layout_edit_font_0".equals(obj)) {
                    return new m19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_font is invalid. Received: " + obj);
            case 16:
                if ("layout/face_layout_edit_font_color_item_0".equals(obj)) {
                    return new o19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_font_color_item is invalid. Received: " + obj);
            case 17:
                if ("layout/face_layout_edit_photo_0".equals(obj)) {
                    return new q19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_photo is invalid. Received: " + obj);
            case 18:
                if ("layout/face_layout_edit_photo_crop_style_item_0".equals(obj)) {
                    return new s19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_photo_crop_style_item is invalid. Received: " + obj);
            case 19:
                if ("layout/face_layout_edit_photo_picker_add_0".equals(obj)) {
                    return new u19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_photo_picker_add is invalid. Received: " + obj);
            case 20:
                if ("layout/face_layout_edit_photo_picker_item_0".equals(obj)) {
                    return new w19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_photo_picker_item is invalid. Received: " + obj);
            case 21:
                if ("layout/face_layout_edit_position_0".equals(obj)) {
                    return new y19(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_position is invalid. Received: " + obj);
            case 22:
                if ("layout/face_layout_edit_slot_0".equals(obj)) {
                    return new a29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_slot is invalid. Received: " + obj);
            case 23:
                if ("layout/face_layout_edit_slot_item_0".equals(obj)) {
                    return new c29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_slot_item is invalid. Received: " + obj);
            case 24:
                if ("layout/face_layout_edit_slot_picker_item_0".equals(obj)) {
                    return new e29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_slot_picker_item is invalid. Received: " + obj);
            case 25:
                if ("layout/face_layout_edit_slot_picker_label_0".equals(obj)) {
                    return new g29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_slot_picker_label is invalid. Received: " + obj);
            case 26:
                if ("layout/face_layout_edit_style_0".equals(obj)) {
                    return new i29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_style is invalid. Received: " + obj);
            case 27:
                if ("layout/face_layout_edit_tab_item_0".equals(obj)) {
                    return new k29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_tab_item is invalid. Received: " + obj);
            case 28:
                if ("layout/face_layout_edit_text_0".equals(obj)) {
                    return new o29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_text is invalid. Received: " + obj);
            case 29:
                if ("layout/face_layout_edit_text_add_item_0".equals(obj)) {
                    return new m29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_text_add_item is invalid. Received: " + obj);
            case 30:
                if ("layout/face_layout_edit_text_item_0".equals(obj)) {
                    return new q29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_text_item is invalid. Received: " + obj);
            case 31:
                if ("layout/face_layout_edit_video_0".equals(obj)) {
                    return new s29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_edit_video is invalid. Received: " + obj);
            case 32:
                if ("layout/face_layout_error_log_item_0".equals(obj)) {
                    return new u29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_error_log_item is invalid. Received: " + obj);
            case 33:
                if ("layout/face_layout_history_item_0".equals(obj)) {
                    return new w29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_history_item is invalid. Received: " + obj);
            case 34:
                if ("layout/face_layout_label_item_0".equals(obj)) {
                    return new y29(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_label_item is invalid. Received: " + obj);
            case 35:
                if ("layout/face_layout_pay_uninstall_item_0".equals(obj)) {
                    return new a39(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_pay_uninstall_item is invalid. Received: " + obj);
            case 36:
                if ("layout/face_layout_photo_edit_bar_0".equals(obj)) {
                    return new c39(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_photo_edit_bar is invalid. Received: " + obj);
            case 37:
                if ("layout/face_layout_photo_picker_bar_0".equals(obj)) {
                    return new e39(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_photo_picker_bar is invalid. Received: " + obj);
            case 38:
                if ("layout/face_layout_search_result_item_0".equals(obj)) {
                    return new g39(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_search_result_item is invalid. Received: " + obj);
            case 39:
                if ("layout/face_layout_search_title_0".equals(obj)) {
                    return new i39(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_search_title is invalid. Received: " + obj);
            case 40:
                if ("layout/face_layout_suggestion_item_0".equals(obj)) {
                    return new k39(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_layout_suggestion_item is invalid. Received: " + obj);
            case 41:
                if ("layout/face_market_basic_tab_item_0".equals(obj)) {
                    return new m39(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for face_market_basic_tab_item is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_face_0".equals(obj)) {
                    return new c6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_face_ble_photo_0".equals(obj)) {
                    return new e6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_ble_photo is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_face_ble_video_0".equals(obj)) {
                    return new g6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_ble_video is invalid. Received: " + obj);
            case 45:
                if ("layout/fragment_face_category_0".equals(obj)) {
                    return new i6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_category is invalid. Received: " + obj);
            case 46:
                if ("layout/fragment_face_feed_0".equals(obj)) {
                    return new k6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_feed is invalid. Received: " + obj);
            case 47:
                if ("layout/fragment_face_info_ble_0".equals(obj)) {
                    return new m6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_info_ble is invalid. Received: " + obj);
            case 48:
                if ("layout/fragment_face_info_video_0".equals(obj)) {
                    return new o6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_info_video is invalid. Received: " + obj);
            case 49:
                if ("layout/fragment_face_info_wear_os_0".equals(obj)) {
                    return new q6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_info_wear_os is invalid. Received: " + obj);
            case 50:
                if ("layout/fragment_face_market_0".equals(obj)) {
                    return new s6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_market is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding b(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/fragment_face_me_0".equals(obj)) {
                    return new u6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_me is invalid. Received: " + obj);
            case 52:
                if ("layout/fragment_face_wear_os_0".equals(obj)) {
                    return new w6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_face_wear_os is invalid. Received: " + obj);
            case 53:
                if ("layout/fragment_fengxian_photo_face_0".equals(obj)) {
                    return new y6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_fengxian_photo_face is invalid. Received: " + obj);
            case 54:
                if ("layout/fragment_tab_list_0".equals(obj)) {
                    return new gka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tab_list is invalid. Received: " + obj);
            case 55:
                if ("layout/item_os_watch_face_0".equals(obj)) {
                    return new rnd(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_os_watch_face is invalid. Received: " + obj);
            case 56:
                if ("layout/item_photo_face_bg_0".equals(obj)) {
                    return new vnd(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_photo_face_bg is invalid. Received: " + obj);
            case 57:
                if ("layout/layout_edit_watch_face_style_option_0".equals(obj)) {
                    return new s8e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_edit_watch_face_style_option is invalid. Received: " + obj);
            case 58:
                if ("layout/layout_edit_watch_face_style_setting_0".equals(obj)) {
                    return new u8e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_edit_watch_face_style_setting is invalid. Received: " + obj);
            case 59:
                if ("layout/layout_face_0".equals(obj)) {
                    return new c9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face is invalid. Received: " + obj);
            case 60:
                if ("layout/layout_face_category_item_0".equals(obj)) {
                    return new e9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_category_item is invalid. Received: " + obj);
            case 61:
                if ("layout/layout_face_entrance_0".equals(obj)) {
                    return new g9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_entrance is invalid. Received: " + obj);
            case 62:
                if ("layout/layout_face_feed_album_item_0".equals(obj)) {
                    return new i9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_feed_album_item is invalid. Received: " + obj);
            case 63:
                if ("layout/layout_face_feed_banner_item_0".equals(obj)) {
                    return new k9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_feed_banner_item is invalid. Received: " + obj);
            case 64:
                if ("layout/layout_face_feed_common_item_0".equals(obj)) {
                    return new m9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_feed_common_item is invalid. Received: " + obj);
            case 65:
                if ("layout/layout_face_feed_tab_list_item_0".equals(obj)) {
                    return new o9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_feed_tab_list_item is invalid. Received: " + obj);
            case 66:
                if ("layout/layout_face_market_basic_more_item_0".equals(obj)) {
                    return new q9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_market_basic_more_item is invalid. Received: " + obj);
            case 67:
                if ("layout/layout_face_market_des_item_0".equals(obj)) {
                    return new s9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_market_des_item is invalid. Received: " + obj);
            case 68:
                if ("layout/layout_face_tab_list_item_0".equals(obj)) {
                    return new u9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_face_tab_list_item is invalid. Received: " + obj);
            case 69:
                if ("layout/layout_photo_bg_picker_0".equals(obj)) {
                    return new pae(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_photo_bg_picker is invalid. Received: " + obj);
            case 70:
                if ("layout/layout_recommend_tab_0".equals(obj)) {
                    return new rae(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_recommend_tab is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(30);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.checkupdate.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.sfnttly.tools.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.membership.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.pay.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.watch.face.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f13351a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        int i2;
        if (viewArr != null && viewArr.length != 0 && (i2 = f13350a.get(i)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 69) {
                if ("layout/layout_photo_bg_picker_0".equals(tag)) {
                    return new pae(rk5Var, viewArr);
                }
                throw new IllegalArgumentException("The tag for layout_photo_bg_picker is invalid. Received: " + tag);
            }
        }
        return null;
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f13352a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f13350a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            int i3 = (i2 - 1) / 50;
            if (i3 == 0) {
                return a(rk5Var, view, i2, tag);
            }
            if (i3 != 1) {
                return null;
            }
            return b(rk5Var, view, i2, tag);
        }
        throw new RuntimeException("view must have a tag");
    }
}
