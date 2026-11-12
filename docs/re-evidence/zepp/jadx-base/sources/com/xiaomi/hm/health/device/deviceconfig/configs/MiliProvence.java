package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R,\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R&\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001b\u0018\u00010\u001a8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliProvence;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "", "h", "Z", "isChineseVersion", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", z.j, LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", hl.k, "getDevicePageBg", "devicePageBg", "l", "getDeviceIcon", "deviceIcon", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "m", "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class MiliProvence extends HMBaseDeviceConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isChineseVersion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int deviceDesc;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int devicePageBg;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int deviceIcon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseBleDevice> deviceClass;

    public MiliProvence() {
        this(false, 1, null);
    }

    public MiliProvence(boolean z) {
        this.isChineseVersion = z;
        this.btNames = CollectionsKt__CollectionsKt.arrayListOf("Provence", "Amazfit GTR 3 Provence", "Amazfit GTS 4 Mini");
        this.deviceDesc = R.string.mili_provence;
        this.devicePageBg = R.drawable.img_bg_pyh;
        this.deviceIcon = R.drawable.img_midong_watch_lite;
        this.deviceClass = HMMiLiProDevice.class;
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
        if (z) {
            ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, true);
            ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, true);
            ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, true);
        }
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
        ConfigHelperKt.set(configBitSet, Feature.GT3_SOURCE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_WEB_INTRO, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_JS_APP, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SIX_PASSWORD, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SPORT_SETTING, true);
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
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_GPS, true);
        ConfigHelperKt.set(configBitSet, Feature.SQUARE_WATCH_S, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_LANGUAGE_CHANGE_BY_APP_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SETTINGS_UPLOAD, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @Nullable
    public Class<? extends HMBaseBleDevice> getDeviceClass() {
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

    public /* synthetic */ MiliProvence(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
