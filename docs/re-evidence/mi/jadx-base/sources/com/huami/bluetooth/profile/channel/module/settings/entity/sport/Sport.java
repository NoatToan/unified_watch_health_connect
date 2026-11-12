package com.huami.bluetooth.profile.channel.module.settings.entity.sport;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.sport_manager.utils.SportUtilsKt;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001bB\u0007¢\u0006\u0004\b_\u0010`J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010%\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010\u0017\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010.\u001a\u0004\u0018\u00010&2\b\u0010\u0017\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R(\u00104\u001a\u0004\u0018\u00010/2\b\u0010\u0017\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00107\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R(\u0010:\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R(\u0010=\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R(\u0010@\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R(\u0010C\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R(\u0010F\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001bR(\u0010L\u001a\u0004\u0018\u00010G2\b\u0010\u0017\u001a\u0004\u0018\u00010G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010R\u001a\u0004\u0018\u00010M2\b\u0010\u0017\u001a\u0004\u0018\u00010M8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010U\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0019\"\u0004\bT\u0010\u001bR(\u0010X\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010\"\"\u0004\bW\u0010$R(\u0010[\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010$R(\u0010^\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\"\"\u0004\b]\u0010$¨\u0006c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "settingsGroupName", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "", "value", "getAutoStopSwitch", "()Ljava/lang/Boolean;", "setAutoStopSwitch", "(Ljava/lang/Boolean;)V", "autoStopSwitch", "getSwimLogSwitch", "setSwimLogSwitch", "swimLogSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getReserveHeartRateMode", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setReserveHeartRateMode", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "reserveHeartRateMode", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "getReserveHeartRateValueList", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "setReserveHeartRateValueList", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;)V", "reserveHeartRateValueList", "getMaximumHeartRateValueList", "setMaximumHeartRateValueList", "maximumHeartRateValueList", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getRestHeartRate", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setRestHeartRate", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "restHeartRate", "getGpsMode", "setGpsMode", "gpsMode", "getGpsFrequencyBand", "setGpsFrequencyBand", "gpsFrequencyBand", "getGpsSystemChoice", "setGpsSystemChoice", "gpsSystemChoice", "getGpsSearchingPreference", "setGpsSearchingPreference", "gpsSearchingPreference", "getGpsDataInterval", "setGpsDataInterval", "gpsDataInterval", "getAGpsOutOfDateRemindSwitch", "setAGpsOutOfDateRemindSwitch", "aGpsOutOfDateRemindSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getAGpsOutOfDateRemindTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setAGpsOutOfDateRemindTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "aGpsOutOfDateRemindTime", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "getSportRecognitionTypes", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "setSportRecognitionTypes", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;)V", "sportRecognitionTypes", "getSportRecognizedRemindSwitch", "setSportRecognizedRemindSwitch", "sportRecognizedRemindSwitch", "getSportRecognitionSensitivity", "setSportRecognitionSensitivity", "sportRecognitionSensitivity", "getRowingMachineWearingWrist", "setRowingMachineWearingWrist", "rowingMachineWearingWrist", "getPoolSwimmingLaneLength", "setPoolSwimmingLaneLength", "poolSwimmingLaneLength", "<init>", "()V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class Sport extends Settings {
    private static final int A_GPS_OUT_OF_DATE_REMIND_SWITCH;
    private static final int A_GPS_OUT_OF_DATE_REMIND_TIME;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int GPS_DATA_INTERVAL;
    private static final int GPS_FREQUENCY_BAND;
    private static final int GPS_SEARCHING_PREFERENCE;
    private static final int GPS_SYSTEM_CHOICE;
    public static final int GROUP_VERSION = 1;
    private static final int KEY_AUTO_STOP_SWITCH;
    private static final int KEY_GPS_MODE;
    private static final int KEY_MAXIMUM_HEART_RATE_VALUE_LIST;
    private static final int KEY_RESERVE_HEART_RATE_MODE;
    private static final int KEY_RESERVE_HEART_RATE_VALUE_LIST;
    private static final int KEY_REST_HEART_RATE;
    private static final int KEY_SWIM_LOG_SWITCH;
    private static final int POOL_SWIMMING_LANE_LENGTH;
    private static final int ROWING_MACHINE_WEARING_WRIST;
    private static final int SPORT_RECOGNITION_SENSITIVITY;
    private static final int SPORT_RECOGNITION_TYPES;
    private static final int SPORT_RECOGNIZED_REMIND_SWITCH;

    @NotNull
    private static final HashMap<Integer, String> hashMap;
    private static final long serialVersionUID = 1;

    @NotNull
    private final String settingsGroupName = SportUtilsKt.TAG;
    private int groupVersion = 1;

    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.SPORT;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport$a;", "", "", "KEY_AUTO_STOP_SWITCH", "I", PluginDeviceInfo.FLOCALIZATIONS, "()I", "KEY_SWIM_LOG_SWITCH", "m", "KEY_RESERVE_HEART_RATE_MODE", "j", "KEY_RESERVE_HEART_RATE_VALUE_LIST", Constant.KeyValue.KEY_COLUMN, "KEY_MAXIMUM_HEART_RATE_VALUE_LIST", "i", "KEY_REST_HEART_RATE", e.f13808a, "KEY_GPS_MODE", "h", "GPS_FREQUENCY_BAND", PluginDeviceInfo.FICONOFF, "GPS_SYSTEM_CHOICE", PluginDeviceInfo.FBLUETOOTHPAIR, "GPS_SEARCHING_PREFERENCE", PluginDeviceInfo.FICONOFFLINE, "GPS_DATA_INTERVAL", PluginDeviceInfo.FICONON, "A_GPS_OUT_OF_DATE_REMIND_SWITCH", PluginDeviceInfo.FMODEL, "A_GPS_OUT_OF_DATE_REMIND_TIME", PluginDeviceInfo.FDESC, "SPORT_RECOGNITION_TYPES", "q", "SPORT_RECOGNIZED_REMIND_SWITCH", "r", "SPORT_RECOGNITION_SENSITIVITY", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "ROWING_MACHINE_WEARING_WRIST", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "POOL_SWIMMING_LANE_LENGTH", "n", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Sport.A_GPS_OUT_OF_DATE_REMIND_SWITCH;
        }

        public final int b() {
            return Sport.A_GPS_OUT_OF_DATE_REMIND_TIME;
        }

        public final int c() {
            return Sport.GPS_DATA_INTERVAL;
        }

        public final int d() {
            return Sport.GPS_FREQUENCY_BAND;
        }

        public final int e() {
            return Sport.GPS_SEARCHING_PREFERENCE;
        }

        public final int f() {
            return Sport.GPS_SYSTEM_CHOICE;
        }

        public final int g() {
            return Sport.KEY_AUTO_STOP_SWITCH;
        }

        public final int h() {
            return Sport.KEY_GPS_MODE;
        }

        public final int i() {
            return Sport.KEY_MAXIMUM_HEART_RATE_VALUE_LIST;
        }

        public final int j() {
            return Sport.KEY_RESERVE_HEART_RATE_MODE;
        }

        public final int k() {
            return Sport.KEY_RESERVE_HEART_RATE_VALUE_LIST;
        }

        public final int l() {
            return Sport.KEY_REST_HEART_RATE;
        }

        public final int m() {
            return Sport.KEY_SWIM_LOG_SWITCH;
        }

        public final int n() {
            return Sport.POOL_SWIMMING_LANE_LENGTH;
        }

        public final int o() {
            return Sport.ROWING_MACHINE_WEARING_WRIST;
        }

        public final int p() {
            return Sport.SPORT_RECOGNITION_SENSITIVITY;
        }

        public final int q() {
            return Sport.SPORT_RECOGNITION_TYPES;
        }

        public final int r() {
            return Sport.SPORT_RECOGNIZED_REMIND_SWITCH;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        hashMap = map;
        map.put(1, "运动自动暂停开关");
        KEY_AUTO_STOP_SWITCH = 1;
        map.put(2, "游泳日志开关");
        KEY_SWIM_LOG_SWITCH = 2;
        map.put(4, "储备心率显示模式");
        KEY_RESERVE_HEART_RATE_MODE = 4;
        map.put(5, "储备心率");
        KEY_RESERVE_HEART_RATE_VALUE_LIST = 5;
        map.put(6, "最大心率");
        KEY_MAXIMUM_HEART_RATE_VALUE_LIST = 6;
        map.put(7, "静息心率");
        KEY_REST_HEART_RATE = 7;
        map.put(32, "GPS当前选中模式");
        KEY_GPS_MODE = 32;
        map.put(33, "自定义模式-GPS频段");
        GPS_FREQUENCY_BAND = 33;
        map.put(34, "自定义模式-定位组合");
        GPS_SYSTEM_CHOICE = 34;
        map.put(35, "自定义模式-搜星偏好");
        GPS_SEARCHING_PREFERENCE = 35;
        map.put(36, "自定义模式-数据间隔");
        GPS_DATA_INTERVAL = 36;
        map.put(48, "A_GPS过期提醒开关");
        A_GPS_OUT_OF_DATE_REMIND_SWITCH = 48;
        map.put(49, "A_GPS过期提醒时间");
        A_GPS_OUT_OF_DATE_REMIND_TIME = 49;
        map.put(64, "运动识别类型（多选）");
        SPORT_RECOGNITION_TYPES = 64;
        map.put(65, "运动识别提醒开关");
        SPORT_RECOGNIZED_REMIND_SWITCH = 65;
        map.put(66, "运动识别灵敏度");
        SPORT_RECOGNITION_SENSITIVITY = 66;
        map.put(80, "划船机佩戴左右手");
        ROWING_MACHINE_WEARING_WRIST = 80;
        map.put(81, "泳池游泳泳道长度");
        POOL_SWIMMING_LANE_LENGTH = 81;
    }

    @Nullable
    public final Boolean getAGpsOutOfDateRemindSwitch() {
        return getBoolean(A_GPS_OUT_OF_DATE_REMIND_SWITCH);
    }

    @Nullable
    public final Time getAGpsOutOfDateRemindTime() {
        return getTime(A_GPS_OUT_OF_DATE_REMIND_TIME);
    }

    @Nullable
    public final Boolean getAutoStopSwitch() {
        return getBoolean(KEY_AUTO_STOP_SWITCH);
    }

    @Nullable
    public final EnumData getGpsDataInterval() {
        return getEnum(GPS_DATA_INTERVAL);
    }

    @Nullable
    public final EnumData getGpsFrequencyBand() {
        return getEnum(GPS_FREQUENCY_BAND);
    }

    @Nullable
    public final EnumData getGpsMode() {
        return getEnum(KEY_GPS_MODE);
    }

    @Nullable
    public final EnumData getGpsSearchingPreference() {
        return getEnum(GPS_SEARCHING_PREFERENCE);
    }

    @Nullable
    public final EnumData getGpsSystemChoice() {
        return getEnum(GPS_SYSTEM_CHOICE);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public SettingsGroupType getGroupType() {
        return this.groupType;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final IntegerArray getMaximumHeartRateValueList() {
        return getIntArray(KEY_MAXIMUM_HEART_RATE_VALUE_LIST);
    }

    @Nullable
    public final EnumData getPoolSwimmingLaneLength() {
        return getEnum(POOL_SWIMMING_LANE_LENGTH);
    }

    @Nullable
    public final EnumData getReserveHeartRateMode() {
        return getEnum(KEY_RESERVE_HEART_RATE_MODE);
    }

    @Nullable
    public final IntegerArray getReserveHeartRateValueList() {
        return getIntArray(KEY_RESERVE_HEART_RATE_VALUE_LIST);
    }

    @Nullable
    public final IntData getRestHeartRate() {
        return getInt(KEY_REST_HEART_RATE);
    }

    @Nullable
    public final EnumData getRowingMachineWearingWrist() {
        return getEnum(ROWING_MACHINE_WEARING_WRIST);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Nullable
    public final EnumData getSportRecognitionSensitivity() {
        return getEnum(SPORT_RECOGNITION_SENSITIVITY);
    }

    @Nullable
    public final EnumArray getSportRecognitionTypes() {
        return getEnumArray(SPORT_RECOGNITION_TYPES);
    }

    @Nullable
    public final Boolean getSportRecognizedRemindSwitch() {
        return getBoolean(SPORT_RECOGNIZED_REMIND_SWITCH);
    }

    @Nullable
    public final Boolean getSwimLogSwitch() {
        return getBoolean(KEY_SWIM_LOG_SWITCH);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return hashMap.get(Integer.valueOf(key));
    }

    public final void setAGpsOutOfDateRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, A_GPS_OUT_OF_DATE_REMIND_SWITCH);
    }

    public final void setAGpsOutOfDateRemindTime(@Nullable Time time) {
        setTime(time, A_GPS_OUT_OF_DATE_REMIND_TIME);
    }

    public final void setAutoStopSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_AUTO_STOP_SWITCH);
    }

    public final void setGpsDataInterval(@Nullable EnumData enumData) {
        setEnum(enumData, GPS_DATA_INTERVAL);
    }

    public final void setGpsFrequencyBand(@Nullable EnumData enumData) {
        setEnum(enumData, GPS_FREQUENCY_BAND);
    }

    public final void setGpsMode(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_GPS_MODE);
    }

    public final void setGpsSearchingPreference(@Nullable EnumData enumData) {
        setEnum(enumData, GPS_SEARCHING_PREFERENCE);
    }

    public final void setGpsSystemChoice(@Nullable EnumData enumData) {
        setEnum(enumData, GPS_SYSTEM_CHOICE);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setMaximumHeartRateValueList(@Nullable IntegerArray integerArray) {
        setIntArray(integerArray, KEY_MAXIMUM_HEART_RATE_VALUE_LIST);
    }

    public final void setPoolSwimmingLaneLength(@Nullable EnumData enumData) {
        setEnum(enumData, POOL_SWIMMING_LANE_LENGTH);
    }

    public final void setReserveHeartRateMode(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_RESERVE_HEART_RATE_MODE);
    }

    public final void setReserveHeartRateValueList(@Nullable IntegerArray integerArray) {
        setIntArray(integerArray, KEY_RESERVE_HEART_RATE_VALUE_LIST);
    }

    public final void setRestHeartRate(@Nullable IntData intData) {
        setInt(intData, KEY_REST_HEART_RATE);
    }

    public final void setRowingMachineWearingWrist(@Nullable EnumData enumData) {
        setEnum(enumData, ROWING_MACHINE_WEARING_WRIST);
    }

    public final void setSportRecognitionSensitivity(@Nullable EnumData enumData) {
        setEnum(enumData, SPORT_RECOGNITION_SENSITIVITY);
    }

    public final void setSportRecognitionTypes(@Nullable EnumArray enumArray) {
        setEnumArray(enumArray, SPORT_RECOGNITION_TYPES);
    }

    public final void setSportRecognizedRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, SPORT_RECOGNIZED_REMIND_SWITCH);
    }

    public final void setSwimLogSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SWIM_LOG_SWITCH);
    }
}
