package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import java.util.BitSet;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R&\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliGT4;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "", "h", LogUtil.I, "getDevicePageBg", "()I", "devicePageBg", "i", "getDeviceIcon", "deviceIcon", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", z.j, "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class MiliGT4 extends HMBaseDeviceConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int devicePageBg = R.drawable.img_bg_pyh;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_amazfitwatch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseBleDevice> deviceClass = HMMiLiProDevice.class;

    public MiliGT4() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.HUMIDITY_WIND_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_REALTIME_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_OFFLINE_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.PRO_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FONT_RES_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.AUTH_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FULL_HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FULL_HR_READ_WRITE_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.WEATHER_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.WEATHER_SUNSET_SUNRISE, true);
        ConfigHelperKt.set(configBitSet, Feature.LOG_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.RESET_ON_DEVICE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.PROTOCAL_NEW_S, true);
        ConfigHelperKt.set(configBitSet, Feature.ENABLE_HIDEALL_S, true);
        ConfigHelperKt.set(configBitSet, Feature.REMINDER_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.COMPRESS_RES_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.GPS_DATA_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_TIME_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.G3_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.LATIN_FW_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.MUSIC_CONTROL_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.CUSTOM_VIBRATE, true);
        ConfigHelperKt.set(configBitSet, Feature.LIFT_WRIST_SENSITIVITY, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_HR_DETECT, true);
        ConfigHelperKt.set(configBitSet, Feature.HR_ALERT, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_AVOID_SPITE_BIND, true);
        ConfigHelperKt.set(configBitSet, Feature.LINKAGE_NOTIFICATION, true);
        ConfigHelperKt.set(configBitSet, Feature.MUSIC_VOLUME, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_HR_BROADCAST, true);
        ConfigHelperKt.set(configBitSet, Feature.CALENDAR_AND_START_DAY_OF_WEEK, true);
        ConfigHelperKt.set(configBitSet, Feature.WATCH_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ANALYZE_SWIMMING_DATA_SOURCE, true);
        ConfigHelperKt.set(configBitSet, Feature.KOREAN_DISABLE_AUTO_LOCATE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, true);
        ConfigHelperKt.set(configBitSet, Feature.PROTO_STATISTICS_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ATRIAL_FIB, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_NATIVE_DIAL, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_EVENT_REMIND_NEW_NAME, true);
        ConfigHelperKt.set(configBitSet, Feature.PAI_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SPORT_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.UIH_COMPRESS_DIAL, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_CHANGE_ALARM_ON_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_CHANGE_REMINDER_ON_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.OFF_WIST_ZERO_TO_NINE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SCHEDULE, true);
        ConfigHelperKt.set(configBitSet, Feature.GT4_SOURCE, true);
        Feature feature = Feature.SUPPORT_SETTINGS_UPLOAD;
        ConfigHelperKt.set(configBitSet, feature, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_WEB_INTRO, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_JS_APP, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SIX_PASSWORD, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SPORT_SETTING, true);
        ConfigHelperKt.set(configBitSet, Feature.ROUND_WATCH_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HIDE_WATCH_SKIN_DOWNLOAD_TIME, true);
        ConfigHelperKt.set(configBitSet, Feature.GES_SCREEN_ANIM, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_UVI, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_WATCH_FACE_STORE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_RR_PEAK, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_HEALTH_DETECT_TITLE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_NEW_DEVICE_SETTING, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_BIND_INTRO, true);
        ConfigHelperKt.set(configBitSet, Feature.SELECT_RESTORE_SOURCE, true);
        ConfigHelperKt.set(configBitSet, Feature.NEED_INJECT_TOKEN, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_APP_SORT_NEW, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_READ_APP_SORT_FROM_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.APP_SORT_NEW_ICON, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_STAND_ALERT, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_TAKE_PIC, true);
        ConfigHelperKt.set(configBitSet, Feature.ZEPP_OS_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.HEART_RATE_REGION_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_VOICE, true);
        ConfigHelperKt.set(configBitSet, feature, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_GPS, true);
        ConfigHelperKt.set(configBitSet, Feature.GT3_SOURCE, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @Nullable
    public Class<? extends HMBaseBleDevice> getDeviceClass() {
        return this.deviceClass;
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
