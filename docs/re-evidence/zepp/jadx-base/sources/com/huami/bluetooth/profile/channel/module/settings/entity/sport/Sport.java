package com.huami.bluetooth.profile.channel.module.settings.entity.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001dB\u0007¢\u0006\u0004\bb\u0010cJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001c\u0010\u000b\u001a\u00020\u00058\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010(\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010.\u001a\u0004\u0018\u00010)2\b\u0010\u001a\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00101\u001a\u0004\u0018\u00010)2\b\u0010\u001a\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R(\u00107\u001a\u0004\u0018\u0001022\b\u0010\u001a\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010:\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R(\u0010=\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'R(\u0010@\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R(\u0010C\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010%\"\u0004\bB\u0010'R(\u0010F\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R(\u0010I\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010\u001eR(\u0010O\u001a\u0004\u0018\u00010J2\b\u0010\u001a\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010U\u001a\u0004\u0018\u00010P2\b\u0010\u001a\u001a\u0004\u0018\u00010P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010X\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010\u001c\"\u0004\bW\u0010\u001eR(\u0010[\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010%\"\u0004\bZ\u0010'R(\u0010^\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010%\"\u0004\b]\u0010'R(\u0010a\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010%\"\u0004\b`\u0010'¨\u0006e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "c", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", GoogleApiAvailabilityLight.a, LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "", "value", "getAutoStopSwitch", "()Ljava/lang/Boolean;", "setAutoStopSwitch", "(Ljava/lang/Boolean;)V", "autoStopSwitch", "getSwimLogSwitch", "setSwimLogSwitch", "swimLogSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getReserveHeartRateMode", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setReserveHeartRateMode", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "reserveHeartRateMode", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "getReserveHeartRateValueList", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "setReserveHeartRateValueList", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;)V", "reserveHeartRateValueList", "getMaximumHeartRateValueList", "setMaximumHeartRateValueList", "maximumHeartRateValueList", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getRestHeartRate", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setRestHeartRate", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "restHeartRate", "getGpsMode", "setGpsMode", "gpsMode", "getGpsFrequencyBand", "setGpsFrequencyBand", "gpsFrequencyBand", "getGpsSystemChoice", "setGpsSystemChoice", "gpsSystemChoice", "getGpsSearchingPreference", "setGpsSearchingPreference", "gpsSearchingPreference", "getGpsDataInterval", "setGpsDataInterval", "gpsDataInterval", "getAGpsOutOfDateRemindSwitch", "setAGpsOutOfDateRemindSwitch", "aGpsOutOfDateRemindSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getAGpsOutOfDateRemindTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setAGpsOutOfDateRemindTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "aGpsOutOfDateRemindTime", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "getSportRecognitionTypes", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "setSportRecognitionTypes", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;)V", "sportRecognitionTypes", "getSportRecognizedRemindSwitch", "setSportRecognizedRemindSwitch", "sportRecognizedRemindSwitch", "getSportRecognitionSensitivity", "setSportRecognitionSensitivity", "sportRecognitionSensitivity", "getRowingMachineWearingWrist", "setRowingMachineWearingWrist", "rowingMachineWearingWrist", "getPoolSwimmingLaneLength", "setPoolSwimmingLaneLength", "poolSwimmingLaneLength", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Sport extends Settings implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 1;

    @NotNull
    private static final HashMap<Integer, String> f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;
    private static final long serialVersionUID = 1;
    private static final int t;
    private static final int u;
    private static final int v;
    private static final int w;
    private static final int x;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String settingsGroupName = "Sport";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int groupVersion = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.SPORT;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105R5\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0014\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0016\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0018\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u001a\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u001c\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u001e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u0019\u0010 \u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u0019\u0010\"\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u0019\u0010$\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR\u0019\u0010&\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR\u0019\u0010(\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\rR\u0019\u0010*\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR\u0019\u0010,\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR\u0019\u0010.\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b/\u0010\rR\u0016\u00100\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport$Companion;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_AUTO_STOP_SWITCH", LogUtil.I, "getKEY_AUTO_STOP_SWITCH", "()I", "KEY_SWIM_LOG_SWITCH", "getKEY_SWIM_LOG_SWITCH", "KEY_RESERVE_HEART_RATE_MODE", "getKEY_RESERVE_HEART_RATE_MODE", "KEY_RESERVE_HEART_RATE_VALUE_LIST", "getKEY_RESERVE_HEART_RATE_VALUE_LIST", "KEY_MAXIMUM_HEART_RATE_VALUE_LIST", "getKEY_MAXIMUM_HEART_RATE_VALUE_LIST", "KEY_REST_HEART_RATE", "getKEY_REST_HEART_RATE", "KEY_GPS_MODE", "getKEY_GPS_MODE", "GPS_FREQUENCY_BAND", "getGPS_FREQUENCY_BAND", "GPS_SYSTEM_CHOICE", "getGPS_SYSTEM_CHOICE", "GPS_SEARCHING_PREFERENCE", "getGPS_SEARCHING_PREFERENCE", "GPS_DATA_INTERVAL", "getGPS_DATA_INTERVAL", "A_GPS_OUT_OF_DATE_REMIND_SWITCH", "getA_GPS_OUT_OF_DATE_REMIND_SWITCH", "A_GPS_OUT_OF_DATE_REMIND_TIME", "getA_GPS_OUT_OF_DATE_REMIND_TIME", "SPORT_RECOGNITION_TYPES", "getSPORT_RECOGNITION_TYPES", "SPORT_RECOGNIZED_REMIND_SWITCH", "getSPORT_RECOGNIZED_REMIND_SWITCH", "SPORT_RECOGNITION_SENSITIVITY", "getSPORT_RECOGNITION_SENSITIVITY", "ROWING_MACHINE_WEARING_WRIST", "getROWING_MACHINE_WEARING_WRIST", "POOL_SWIMMING_LANE_LENGTH", "getPOOL_SWIMMING_LANE_LENGTH", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getA_GPS_OUT_OF_DATE_REMIND_SWITCH() {
            return Sport.r;
        }

        public final int getA_GPS_OUT_OF_DATE_REMIND_TIME() {
            return Sport.s;
        }

        public final int getGPS_DATA_INTERVAL() {
            return Sport.q;
        }

        public final int getGPS_FREQUENCY_BAND() {
            return Sport.n;
        }

        public final int getGPS_SEARCHING_PREFERENCE() {
            return Sport.p;
        }

        public final int getGPS_SYSTEM_CHOICE() {
            return Sport.o;
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return Sport.f;
        }

        public final int getKEY_AUTO_STOP_SWITCH() {
            return Sport.g;
        }

        public final int getKEY_GPS_MODE() {
            return Sport.m;
        }

        public final int getKEY_MAXIMUM_HEART_RATE_VALUE_LIST() {
            return Sport.k;
        }

        public final int getKEY_RESERVE_HEART_RATE_MODE() {
            return Sport.i;
        }

        public final int getKEY_RESERVE_HEART_RATE_VALUE_LIST() {
            return Sport.j;
        }

        public final int getKEY_REST_HEART_RATE() {
            return Sport.l;
        }

        public final int getKEY_SWIM_LOG_SWITCH() {
            return Sport.h;
        }

        public final int getPOOL_SWIMMING_LANE_LENGTH() {
            return Sport.x;
        }

        public final int getROWING_MACHINE_WEARING_WRIST() {
            return Sport.w;
        }

        public final int getSPORT_RECOGNITION_SENSITIVITY() {
            return Sport.v;
        }

        public final int getSPORT_RECOGNITION_TYPES() {
            return Sport.t;
        }

        public final int getSPORT_RECOGNIZED_REMIND_SWITCH() {
            return Sport.u;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "运动自动暂停开关");
        g = 1;
        map.put(2, "游泳日志开关");
        h = 2;
        map.put(4, "储备心率显示模式");
        i = 4;
        map.put(5, "储备心率");
        j = 5;
        map.put(6, "最大心率");
        k = 6;
        map.put(7, "静息心率");
        l = 7;
        map.put(32, "GPS当前选中模式");
        m = 32;
        map.put(33, "自定义模式-GPS频段");
        n = 33;
        map.put(34, "自定义模式-定位组合");
        o = 34;
        map.put(35, "自定义模式-搜星偏好");
        p = 35;
        map.put(36, "自定义模式-数据间隔");
        q = 36;
        map.put(48, "A_GPS过期提醒开关");
        r = 48;
        map.put(49, "A_GPS过期提醒时间");
        s = 49;
        map.put(64, "运动识别类型（多选）");
        t = 64;
        map.put(65, "运动识别提醒开关");
        u = 65;
        map.put(66, "运动识别灵敏度");
        v = 66;
        map.put(80, "划船机佩戴左右手");
        w = 80;
        map.put(81, "泳池游泳泳道长度");
        x = 81;
    }

    @Nullable
    public final Boolean getAGpsOutOfDateRemindSwitch() {
        return getBoolean(r);
    }

    @Nullable
    public final Time getAGpsOutOfDateRemindTime() {
        return getTime(s);
    }

    @Nullable
    public final Boolean getAutoStopSwitch() {
        return getBoolean(g);
    }

    @Nullable
    public final EnumData getGpsDataInterval() {
        return getEnum(q);
    }

    @Nullable
    public final EnumData getGpsFrequencyBand() {
        return getEnum(n);
    }

    @Nullable
    public final EnumData getGpsMode() {
        return getEnum(m);
    }

    @Nullable
    public final EnumData getGpsSearchingPreference() {
        return getEnum(p);
    }

    @Nullable
    public final EnumData getGpsSystemChoice() {
        return getEnum(o);
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
        return getIntArray(k);
    }

    @Nullable
    public final EnumData getPoolSwimmingLaneLength() {
        return getEnum(x);
    }

    @Nullable
    public final EnumData getReserveHeartRateMode() {
        return getEnum(i);
    }

    @Nullable
    public final IntegerArray getReserveHeartRateValueList() {
        return getIntArray(j);
    }

    @Nullable
    public final IntData getRestHeartRate() {
        return getInt(l);
    }

    @Nullable
    public final EnumData getRowingMachineWearingWrist() {
        return getEnum(w);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Nullable
    public final EnumData getSportRecognitionSensitivity() {
        return getEnum(v);
    }

    @Nullable
    public final EnumArray getSportRecognitionTypes() {
        return getEnumArray(t);
    }

    @Nullable
    public final Boolean getSportRecognizedRemindSwitch() {
        return getBoolean(u);
    }

    @Nullable
    public final Boolean getSwimLogSwitch() {
        return getBoolean(h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    public final void setAGpsOutOfDateRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, r);
    }

    public final void setAGpsOutOfDateRemindTime(@Nullable Time time) {
        setTime(time, s);
    }

    public final void setAutoStopSwitch(@Nullable Boolean bool) {
        setBoolean(bool, g);
    }

    public final void setGpsDataInterval(@Nullable EnumData enumData) {
        setEnum(enumData, q);
    }

    public final void setGpsFrequencyBand(@Nullable EnumData enumData) {
        setEnum(enumData, n);
    }

    public final void setGpsMode(@Nullable EnumData enumData) {
        setEnum(enumData, m);
    }

    public final void setGpsSearchingPreference(@Nullable EnumData enumData) {
        setEnum(enumData, p);
    }

    public final void setGpsSystemChoice(@Nullable EnumData enumData) {
        setEnum(enumData, o);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setMaximumHeartRateValueList(@Nullable IntegerArray integerArray) {
        setIntArray(integerArray, k);
    }

    public final void setPoolSwimmingLaneLength(@Nullable EnumData enumData) {
        setEnum(enumData, x);
    }

    public final void setReserveHeartRateMode(@Nullable EnumData enumData) {
        setEnum(enumData, i);
    }

    public final void setReserveHeartRateValueList(@Nullable IntegerArray integerArray) {
        setIntArray(integerArray, j);
    }

    public final void setRestHeartRate(@Nullable IntData intData) {
        setInt(intData, l);
    }

    public final void setRowingMachineWearingWrist(@Nullable EnumData enumData) {
        setEnum(enumData, w);
    }

    public final void setSportRecognitionSensitivity(@Nullable EnumData enumData) {
        setEnum(enumData, v);
    }

    public final void setSportRecognitionTypes(@Nullable EnumArray enumArray) {
        setEnumArray(enumArray, t);
    }

    public final void setSportRecognizedRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, u);
    }

    public final void setSwimLogSwitch(@Nullable Boolean bool) {
        setBoolean(bool, h);
    }
}
