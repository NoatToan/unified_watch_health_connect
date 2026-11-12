package com.xiaomi.fitness.electronic.scale.export;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0013\u001a$\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020A\u001a$\u0010B\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020A\u001a\n\u0010C\u001a\u00020<*\u00020=\u001a\n\u0010D\u001a\u00020<*\u00020=\u001a\u001a\u0010E\u001a\u00020<*\u00020=2\u0006\u0010F\u001a\u00020G2\u0006\u0010>\u001a\u00020\b\u001a\u0014\u0010H\u001a\u00020<*\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\b\u001a\u001a\u0010I\u001a\u00020<*\u00020=2\u0006\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020L\u001a:\u0010M\u001a\u00020<*\u00020=2\u0006\u0010?\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b\u001a\u0014\u0010R\u001a\u00020<*\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\b\u001a\n\u0010S\u001a\u00020<*\u00020=\u001a\u001e\u0010T\u001a\u00020<*\u00020=2\b\u0010?\u001a\u0004\u0018\u00010\b2\b\u0010U\u001a\u0004\u0018\u00010V\u001a\"\u0010W\u001a\u00020\b*\u00020=2\u0006\u0010X\u001a\u00020A2\u0006\u0010Y\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\\\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010]\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010^\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010_\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010`\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010a\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010c\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010d\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010g\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010h\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"instance", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleManager;", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleManager$Companion;)Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleManager;", "instance$delegate", "Lkotlin/Lazy;", "PARAM_DID", "", ElectronicScaleManagerExtKt.PARAM_FROM_BIND, "PARAM_UNIT", ElectronicScaleManagerExtKt.PARAM_SSID, "PARAM_MODE", ElectronicScaleManagerExtKt.PARAM_BATTERY, "PARAM_WEIGHT_BUNDLE_KEY", "PARAM_WEIGHT_BUNDLE_UNIT_KEY", "PARAM_WEIGHT_BUNDLE_WEIGHT_KEY", "PARAM_WEIGHT_BUNDLE_LOCK_KEY", "PARAM_WEIGHT_BUNDLE_MATCH_NUM_KEY", "PARAM_WEIGHT_BUNDLE_DID_KEY", ElectronicScaleManagerExtKt.PARAM_ONlY_DID, "PARAM_PAIR_GUIDE_BUNDLE_KEY", "PARAM_MAC", "SCANRECORD", "KEY_PAGE_TYPE", "ADD_VIRTUAL_MEMBER", "", ElectronicScaleManagerExtKt.KEY_PAGE_FROM, "FROM_WEIGHT_FRAGMENT", "IMAGE_HOST", "IMAGE_ELECTRONIC_SCALE_PAIR", "IMAGE_ELECTRONIC_SCALE_PAIR_NIGHT", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1_NIGHT", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2_NIGHT", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3_NIGHT", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4_NIGHT", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5_NIGHT", "IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6_NIGHT", "IMAGE_ELECTRONIC_SCALE_GUIDE_1", "IMAGE_ELECTRONIC_SCALE_GUIDE_2", "IMAGE_ELECTRONIC_SCALE_GUIDE_3", "IMAGE_ELECTRONIC_SCALE_GUIDE_1_NIGHT", "IMAGE_ELECTRONIC_SCALE_GUIDE_2_NIGHT", "IMAGE_ELECTRONIC_SCALE_GUIDE_3_NIGHT", "IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_1", "IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_2", "IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_1_NIGHT", "IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_2_NIGHT", "IMAGE_ELECTRONIC_SCALE_RESET", "IMAGE_ELECTRONIC_SCALE_RESET_NIGHT", "IMAGE_ELECTRONIC_SCALE_WEIGHT_GUIDE", "IMAGE_ELECTRONIC_SCALE_WEIGHT_GUIDE_NIGHT", "MI_JIA_RESET_GUIDE", "launchToElectronicScaleMainActivity", "", "Landroid/content/Context;", "did", "mac", "fromBind", "", "launchToElectronicScaleUserInfoActivity", "launchToElectronicScaleUserManageActivity", "launchToElectronicScaleOTA", "launchToElectronicWeightActivity", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "syncElectronicScale", "launchToDataReportActivity", "context", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "launchToElectronicPairGuideActivity", "name", "shareId", "userId", "model", "initElectronicScale", "syncRecord", "startConfigWifiActivity", "bytes", "", "getScalePrivacyUrl", "isProduct", "region", "locale", "ELECTRONIC_SCALE_MAIN", "ELECTRONIC_SCALE_USER_INFO", "ELECTRONIC_SCALE_OTA", "ELECTRONIC_SCALE_USER", "ELECTRONIC_SCALE_USER_ADD", "ELECTRONIC_EIGHT_SCALE_WEIGHT", "ELECTRONIC_EIGHT_SCALE_WEIGHT_GUIDE", "ELECTRONIC_SCALE_DATA_REPORT_ACTIVITY", "ELECTRONIC_SCALE_VIRTUAL_MEMBER_DATA_ACTIVITY", "COMMON_CALENDAR_CALENDAR_ACTIVITY", "ELECTRONIC_SCALE_PAIR_GUIDE", "ELECTRONIC_SCALE_BABY_WEIGHT_EIGHT", "ELECTRONIC_SCALE_PATH_CONFIG_WIFI_ACTIVITY", "KEY_DEVICE_DETAIL", "electronic-scale-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleManagerExtKt {
    public static final int ADD_VIRTUAL_MEMBER = 1;

    @NotNull
    public static final String COMMON_CALENDAR_CALENDAR_ACTIVITY = "/common/calendar/CalendarActivity";

    @NotNull
    public static final String ELECTRONIC_EIGHT_SCALE_WEIGHT = "/electronic/activity/eight/weight";

    @NotNull
    public static final String ELECTRONIC_EIGHT_SCALE_WEIGHT_GUIDE = "/electronic/activity/eight/guide";

    @NotNull
    public static final String ELECTRONIC_SCALE_BABY_WEIGHT_EIGHT = "/electronic/activity/baby/eight";

    @NotNull
    public static final String ELECTRONIC_SCALE_DATA_REPORT_ACTIVITY = "/electronic/activity/DataReport";

    @NotNull
    public static final String ELECTRONIC_SCALE_MAIN = "/electronic/activity/main";

    @NotNull
    public static final String ELECTRONIC_SCALE_OTA = "/electronic/activity/ota";

    @NotNull
    public static final String ELECTRONIC_SCALE_PAIR_GUIDE = "/electronic/activity/pairGuide";

    @NotNull
    public static final String ELECTRONIC_SCALE_PATH_CONFIG_WIFI_ACTIVITY = "/configwifi/ConfigWifiActivity";

    @NotNull
    public static final String ELECTRONIC_SCALE_USER = "/electronic/activity/user";

    @NotNull
    public static final String ELECTRONIC_SCALE_USER_ADD = "/electronic/activity/user_add";

    @NotNull
    public static final String ELECTRONIC_SCALE_USER_INFO = "/electronic/activity/userinfo";

    @NotNull
    public static final String ELECTRONIC_SCALE_VIRTUAL_MEMBER_DATA_ACTIVITY = "/electronic/activity/VirtualMemberData";
    public static final int FROM_WEIGHT_FRAGMENT = 100;

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_1.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_1_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_1_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_2.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_2_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_2_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_3.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_3_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_3_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_4.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_4_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_4_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_5.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_5_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_5_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_6.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_ERROR_GUIDE_6_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_error_guide_6_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_GUIDE_1 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_guide_1.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_GUIDE_1_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_guide_1_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_GUIDE_2 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_guide_2.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_GUIDE_2_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_guide_2_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_GUIDE_3 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_guide_3.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_GUIDE_3_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_guide_3_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_PAIR = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_pair.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_1 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/eco_share_pair_guide_1.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_1_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/eco_share_pair_guide_1_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_2 = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/eco_share_pair_guide_2.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_2_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/eco_share_pair_guide_2_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_PAIR_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_pair_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_RESET = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_reset.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_RESET_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_reset_night.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_WEIGHT_GUIDE = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_weight_guide.png";

    @NotNull
    public static final String IMAGE_ELECTRONIC_SCALE_WEIGHT_GUIDE_NIGHT = "https://cdn.eco.mi.com/eco-static/scale/eight-electrode-operation/electronic_scale_weight_guide_night.png";

    @NotNull
    public static final String IMAGE_HOST = "https://cdn.eco.mi.com/";

    @NotNull
    public static final String KEY_DEVICE_DETAIL = "DEVICE_DETAIL";

    @NotNull
    public static final String KEY_PAGE_FROM = "KEY_PAGE_FROM";

    @NotNull
    public static final String KEY_PAGE_TYPE = "KEY_PAGE_TYPE";

    @NotNull
    public static final String MI_JIA_RESET_GUIDE = "https://home.mi.com/views/deviceReset.html?model=%s&key=ble_reset&locale=%s";

    @NotNull
    public static final String PARAM_BATTERY = "PARAM_BATTERY";

    @NotNull
    public static final String PARAM_DID = "did";

    @NotNull
    public static final String PARAM_FROM_BIND = "PARAM_FROM_BIND";

    @NotNull
    public static final String PARAM_MAC = "mac";

    @NotNull
    public static final String PARAM_MODE = "mode";

    @NotNull
    public static final String PARAM_ONlY_DID = "PARAM_ONlY_DID";

    @NotNull
    public static final String PARAM_PAIR_GUIDE_BUNDLE_KEY = "pair_guide_bundle";

    @NotNull
    public static final String PARAM_SSID = "PARAM_SSID";

    @NotNull
    public static final String PARAM_UNIT = "unit";

    @NotNull
    public static final String PARAM_WEIGHT_BUNDLE_DID_KEY = "weight_bundle_did";

    @NotNull
    public static final String PARAM_WEIGHT_BUNDLE_KEY = "weight_bundle";

    @NotNull
    public static final String PARAM_WEIGHT_BUNDLE_LOCK_KEY = "weight_bundle_lock";

    @NotNull
    public static final String PARAM_WEIGHT_BUNDLE_MATCH_NUM_KEY = "weight_bundle_match_num";

    @NotNull
    public static final String PARAM_WEIGHT_BUNDLE_UNIT_KEY = "weight_bundle_unit";

    @NotNull
    public static final String PARAM_WEIGHT_BUNDLE_WEIGHT_KEY = "weight_bundle_weight";

    @NotNull
    public static final String SCANRECORD = "ScanRecord";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u48
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ElectronicScaleManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final ElectronicScaleManager getInstance(@NotNull ElectronicScaleManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ElectronicScaleManager) instance$delegate.getValue();
    }

    @NotNull
    public static final String getScalePrivacyUrl(@NotNull Context context, boolean z, @NotNull String region, @NotNull String locale) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return getInstance(ElectronicScaleManager.INSTANCE).getScalePrivacyUrl(z, region, locale);
    }

    public static final void initElectronicScale(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(ElectronicScaleManager.INSTANCE).initElectronicScale(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ElectronicScaleManager instance_delegate$lambda$0() {
        return ((ElectronicScalePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), ElectronicScalePoint.class)).getElectronicScaleManager();
    }

    public static final void launchToDataReportActivity(@NotNull Context context, @NotNull Context context2, @NotNull WeightItem weightItem) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        getInstance(ElectronicScaleManager.INSTANCE).launchToDataReportActivity(context2, weightItem);
    }

    public static final void launchToElectronicPairGuideActivity(@NotNull Context context, @NotNull String mac, @NotNull String name, @NotNull String shareId, @NotNull String userId, @NotNull String did, @NotNull String model) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        getInstance(ElectronicScaleManager.INSTANCE).launchToElectronicPairGuideActivity(context, mac, name, shareId, userId, did, model);
    }

    public static final void launchToElectronicScaleMainActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        getInstance(ElectronicScaleManager.INSTANCE).launchToElectronicScaleMainActivity(context, did, mac, z);
    }

    public static /* synthetic */ void launchToElectronicScaleMainActivity$default(Context context, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        launchToElectronicScaleMainActivity(context, str, str2, z);
    }

    public static final void launchToElectronicScaleOTA(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(ElectronicScaleManager.INSTANCE).launchToElectronicScaleOTA(context);
    }

    public static final void launchToElectronicScaleUserInfoActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        getInstance(ElectronicScaleManager.INSTANCE).launchToElectronicScaleUserInfoActivity(context, did, mac, z);
    }

    public static /* synthetic */ void launchToElectronicScaleUserInfoActivity$default(Context context, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        launchToElectronicScaleUserInfoActivity(context, str, str2, z);
    }

    public static final void launchToElectronicScaleUserManageActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(ElectronicScaleManager.INSTANCE).launchToElectronicScaleUserManageActivity(context);
    }

    public static final void launchToElectronicWeightActivity(@NotNull Context context, @NotNull Bundle bundle, @NotNull String did) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(did, "did");
        getInstance(ElectronicScaleManager.INSTANCE).launchToElectronicWeightActivity(context, bundle, did);
    }

    public static final void startConfigWifiActivity(@NotNull Context context, @Nullable String str, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(ElectronicScaleManager.INSTANCE).startConfigWifiActivity(context, str, bArr);
    }

    public static final void syncElectronicScale(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        getInstance(ElectronicScaleManager.INSTANCE).syncElectronicScale(str);
    }

    public static final void syncRecord(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ElectronicScaleManager.DefaultImpls.syncRecord$default(getInstance(ElectronicScaleManager.INSTANCE), null, 1, null);
    }
}
