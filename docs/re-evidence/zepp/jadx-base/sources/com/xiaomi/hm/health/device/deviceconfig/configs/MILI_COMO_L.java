package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR&\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u00168\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_COMO_L;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", "i", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", z.j, "getDevicePageBg", "devicePageBg", hl.k, "getDeviceIcon", "deviceIcon", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "l", "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class MILI_COMO_L extends HMBaseDeviceConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = CollectionsKt__CollectionsKt.arrayListOf("Como Lite", "Como", "Amazfit Pop");

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int deviceDesc = R.string.como;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int devicePageBg = R.drawable.img_bg_pyh;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.como_img;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseDevice> deviceClass = HMMiLiProDevice.class;

    public MILI_COMO_L() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.COMO_NESS_SERIES_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_REALTIME_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_OFFLINE_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.PRO_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FONT_RES_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.AUTH_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FULL_HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FULL_HR_READ_WRITE_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.WEATHER_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.WEATHER_SUNSET_SUNRISE, true);
        ConfigHelperKt.set(configBitSet, Feature.LOG_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.RESET_ON_DEVICE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.ENABLE_HIDEALL_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_DATE_FORMAT_S, true);
        ConfigHelperKt.set(configBitSet, Feature.PROTOCAL_NEW_S, true);
        ConfigHelperKt.set(configBitSet, Feature.GPS_DATA_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_TIME_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.G3_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.LATIN_FW_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.MUSIC_CONTROL_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.CUSTOM_VIBRATE, true);
        ConfigHelperKt.set(configBitSet, Feature.LIFT_WRIST_SENSITIVITY, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_HR_DETECT, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_ALERT, true);
        ConfigHelperKt.set(configBitSet, Feature.DEVICE_SPORT_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_AVOID_SPITE_BIND, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_GET_TEMPERATURE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.LINKAGE_NOTIFICATION, true);
        ConfigHelperKt.set(configBitSet, Feature.MUSIC_VOLUME, true);
        ConfigHelperKt.set(configBitSet, Feature.KOREAN_DISABLE_AUTO_LOCATE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_HR_BROADCAST, true);
        ConfigHelperKt.set(configBitSet, Feature.CALENDAR_AND_START_DAY_OF_WEEK, true);
        ConfigHelperKt.set(configBitSet, Feature.WATCH_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, true);
        ConfigHelperKt.set(configBitSet, Feature.PROTO_STATISTICS_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ANALYZE_SWIMMING_DATA_SOURCE, true);
        ConfigHelperKt.set(configBitSet, Feature.SPEECH_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_NEW_SPEECH_SOURCES, true);
        ConfigHelperKt.set(configBitSet, Feature.PAI_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_CHANGE_ALARM_ON_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_CHANGE_REMINDER_ON_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.HUMIDITY_WIND_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FEMALE_HEALTH, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ATRIAL_FIB, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_NATIVE_DIAL, true);
        ConfigHelperKt.set(configBitSet, Feature.NPS_QUESTION, true);
        ConfigHelperKt.set(configBitSet, Feature.UIH_COMPRESS_DIAL, true);
        ConfigHelperKt.set(configBitSet, Feature.OFF_WIST_ZERO_TO_NINE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SCHEDULE, true);
        ConfigHelperKt.set(configBitSet, Feature.HIDE_WATCH_SKIN_DOWNLOAD_TIME, true);
        ConfigHelperKt.set(configBitSet, Feature.GES_SCREEN_ANIM, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_UVI, true);
        ConfigHelperKt.set(configBitSet, Feature.SMART_ASSISTANT, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_TAKE_PIC, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_NEW_DEVICE_SETTING, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_LIBRARY, true);
        ConfigHelperKt.set(configBitSet, Feature.DISABLE_SCHEDULE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_STAND_ALERT, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_INCOMING_CALL_REPLY, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_APP_SORT_NEW, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_WATCH_FACE_STORE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_RR_PEAK, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_HEALTH_DETECT_TITLE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_FOLLOW_PHONE_LANGUAGE, true);
        ConfigHelperKt.set(configBitSet, Feature.SQUARE_WATCH_S, true);
        ConfigHelperKt.set(configBitSet, Feature.UPLOAD_DEVICE_SETTINGS, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @Nullable
    public Class<? extends HMBaseDevice> getDeviceClass() {
        return this.deviceClass;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceIcon() {
        return this.deviceIcon;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDevicePageBg() {
        return this.devicePageBg;
    }
}
