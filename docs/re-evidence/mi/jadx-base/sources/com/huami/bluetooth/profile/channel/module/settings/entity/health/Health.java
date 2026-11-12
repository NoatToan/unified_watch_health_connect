package com.huami.bluetooth.profile.channel.module.settings.entity.health;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.Int32Data;
import defpackage.oj;
import defpackage.t5t;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u0002:\u0002\u008f\u0001B\u000b\b\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR(\u0010(\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010+\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R(\u00101\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00104\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R(\u00107\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R(\u0010:\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R(\u0010=\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'R(\u0010@\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R(\u0010C\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010%\"\u0004\bB\u0010'R(\u0010F\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R(\u0010I\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0019\"\u0004\bH\u0010\u001bR(\u0010L\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010'R(\u0010O\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010%\"\u0004\bN\u0010'R(\u0010R\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010%\"\u0004\bQ\u0010'R(\u0010U\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0019\"\u0004\bT\u0010\u001bR(\u0010X\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010%\"\u0004\bW\u0010'R(\u0010^\u001a\u0004\u0018\u00010Y2\b\u0010\u0017\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010a\u001a\u0004\u0018\u00010Y2\b\u0010\u0017\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R(\u0010d\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010%\"\u0004\bc\u0010'R(\u0010g\u001a\u0004\u0018\u00010Y2\b\u0010\u0017\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010[\"\u0004\bf\u0010]R(\u0010j\u001a\u0004\u0018\u00010Y2\b\u0010\u0017\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R(\u0010m\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010%\"\u0004\bl\u0010'R(\u0010s\u001a\u0004\u0018\u00010n2\b\u0010\u0017\u001a\u0004\u0018\u00010n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR(\u0010v\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010.\"\u0004\bu\u00100R(\u0010y\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010.\"\u0004\bx\u00100R(\u0010|\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010.\"\u0004\b{\u00100R(\u0010\u007f\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010.\"\u0004\b~\u00100R+\u0010\u0082\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010.\"\u0005\b\u0081\u0001\u00100R+\u0010\u0085\u0001\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010%\"\u0005\b\u0084\u0001\u0010'R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010\u0019\"\u0005\b\u0087\u0001\u0010\u001bR+\u0010\u008b\u0001\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010%\"\u0005\b\u008a\u0001\u0010'¨\u0006\u0090\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "settingsGroupName", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getHrAllayDetectionFrequency", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setHrAllayDetectionFrequency", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "hrAllayDetectionFrequency", "getHrTooHighRemindValue", "setHrTooHighRemindValue", "hrTooHighRemindValue", "getHrTooLowRemindValue", "setHrTooLowRemindValue", "hrTooLowRemindValue", "", "getHrActivityMonitorSwitch", "()Ljava/lang/Boolean;", "setHrActivityMonitorSwitch", "(Ljava/lang/Boolean;)V", "hrActivityMonitorSwitch", "getHrAdvertisementInActiveSwitch", "setHrAdvertisementInActiveSwitch", "hrAdvertisementInActiveSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getHrMaxValue", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setHrMaxValue", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "hrMaxValue", "getScientificSleepSwitch", "setScientificSleepSwitch", "scientificSleepSwitch", "getOsaSwitch", "setOsaSwitch", "osaSwitch", "getAllDayPressureSwitch", "setAllDayPressureSwitch", "allDayPressureSwitch", "getRelievePressureRemindSwitch", "setRelievePressureRemindSwitch", "relievePressureRemindSwitch", "getSleepAlarmSwitch", "setSleepAlarmSwitch", "sleepAlarmSwitch", "getSleepModeSwitch", "setSleepModeSwitch", "sleepModeSwitch", "getSleepAIAlarm", "setSleepAIAlarm", "sleepAIAlarm", "getSleepBeforeDed", "setSleepBeforeDed", "sleepBeforeDed", "getHeartHealthyMonitorSwitch", "setHeartHealthyMonitorSwitch", "heartHealthyMonitorSwitch", "getHeartHealthyRemindDndInSleepSwitch", "setHeartHealthyRemindDndInSleepSwitch", "heartHealthyRemindDndInSleepSwitch", "getSmartSpo2MonitorSwitch", "setSmartSpo2MonitorSwitch", "smartSpo2MonitorSwitch", "getSpo2LowLevelRemindValue", "setSpo2LowLevelRemindValue", "spo2LowLevelRemindValue", "getStandUpRemindSwitch", "setStandUpRemindSwitch", "standUpRemindSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getStandUpRemindStartTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setStandUpRemindStartTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "standUpRemindStartTime", "getStandUpRemindStopTime", "setStandUpRemindStopTime", "standUpRemindStopTime", "getMiddyRestDndSwitch", "setMiddyRestDndSwitch", "middyRestDndSwitch", "getMiddyRestStartTime", "setMiddyRestStartTime", "middyRestStartTime", "getMiddyRestStopTime", "setMiddyRestStopTime", "middyRestStopTime", "getTargetAchieveRemindSwitch", "setTargetAchieveRemindSwitch", "targetAchieveRemindSwitch", "Loj;", "getStepTarget", "()Loj;", "setStepTarget", "(Loj;)V", "stepTarget", "getCalorieTarget", "setCalorieTarget", "calorieTarget", "getWeightTarget", "setWeightTarget", "weightTarget", "getSleepTarget", "setSleepTarget", "sleepTarget", "getStandTarget", "setStandTarget", "standTarget", "getActivityTarget", "setActivityTarget", "activityTarget", "getBloodPressureMonitorSwitch", "setBloodPressureMonitorSwitch", "bloodPressureMonitorSwitch", "getActivityMode", "setActivityMode", "activityMode", "getBodyEnergySwitch", "setBodyEnergySwitch", "bodyEnergySwitch", "<init>", "()V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class Health extends Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final int GROUP_VERSION_1 = 1;
    public static final int GROUP_VERSION_2 = 2;
    private static final int KEY_ACTIVITY_MODE;
    private static final int KEY_ACTIVITY_TARGET;
    private static final int KEY_ALL_DAY_PRESSURE_SWITCH;
    private static final int KEY_BODY_ENERGY;
    private static final int KEY_CALORIE_TARGET;
    private static final int KEY_HEART_HEALTHY_MONITOR_SWITCH;
    private static final int KEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH;
    private static final int KEY_HR_ACTIVITY_MONITOR_SWITCH;
    private static final int KEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH;
    private static final int KEY_HR_ALL_DAY_DETECTION_FREQUENCY;
    private static final int KEY_HR_MAX_VALUE;
    private static final int KEY_HR_TOO_HIGH_REMIND_VALUE;
    private static final int KEY_HR_TOO_LOW_REMIND_VALUE;
    private static final int KEY_MIDDY_REST_DND_SWITCH;
    private static final int KEY_MIDDY_REST_START_TIME;
    private static final int KEY_MIDDY_REST_STOP_TIME;
    private static final int KEY_OSA_SWITCH;
    private static final int KEY_RELIEVE_PRESSURE_REMIND_SWITCH;
    private static final int KEY_SCIENTIFIC_SLEEP_SWITCH;
    private static final int KEY_SLEEP_AI_ALARM;
    private static final int KEY_SLEEP_ALARM_SWITCH;
    private static final int KEY_SLEEP_BEFORE_BED;
    private static final int KEY_SLEEP_BLOOD_PRESSURE_MONITOR;
    private static final int KEY_SLEEP_MODE_SWITCH;
    private static final int KEY_SLEEP_TARGET;
    private static final int KEY_SMART_SPO2_MONITOR_SWITCH;
    private static final int KEY_SPO2_LOW_LEVEL_REMIND_VALUE;
    private static final int KEY_STAND_TARGET;
    private static final int KEY_STAND_UP_REMIND_START_TIME;
    private static final int KEY_STAND_UP_REMIND_STOP_TIME;
    private static final int KEY_STAND_UP_REMIND_SWITCH;
    private static final int KEY_STEP_TARGET;
    private static final int KEY_TARGET_ACHIEVE_REMIND_SWITCH;
    private static final int KEY_WEIGHT_TARGET;
    private static final int MAX_STEP = 50000;

    @NotNull
    private static final String TAG = "Health";

    @NotNull
    private static final HashMap<Integer, String> hashMap;
    private static final long serialVersionUID = 1;

    @NotNull
    private final SettingsGroupType groupType;
    private int groupVersion;

    @NotNull
    private final String settingsGroupName;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.entity.health.Health$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bR\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\\\u0010]J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J'\u0010\u0005\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\nR3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\u0013R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\u0013R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0011\u001a\u0004\b/\u0010\u0013R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u0010\u0013R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0011\u001a\u0004\b3\u0010\u0013R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b5\u0010\u0013R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0011\u001a\u0004\b7\u0010\u0013R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0011\u001a\u0004\b9\u0010\u0013R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u0011\u001a\u0004\b=\u0010\u0013R\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0011\u001a\u0004\b?\u0010\u0013R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0011\u001a\u0004\bA\u0010\u0013R\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0011\u001a\u0004\bC\u0010\u0013R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0011\u001a\u0004\bE\u0010\u0013R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010\u0011\u001a\u0004\bG\u0010\u0013R\u0017\u0010H\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010\u0011\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0011\u001a\u0004\bJ\u0010\u0013R\u0017\u0010K\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0011\u001a\u0004\bL\u0010\u0013R\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0011\u001a\u0004\bN\u0010\u0013R\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010\u0011\u001a\u0004\bP\u0010\u0013R\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0011\u001a\u0004\bR\u0010\u0013R\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0011\u001a\u0004\bT\u0010\u0013R\u0014\u0010U\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\u0011R\u0014\u0010V\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010\u0011R\u0014\u0010W\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010\u0011R\u0014\u0010X\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health$a;", "", "", "", "name", PluginDeviceInfo.FMODEL, "", "stepTarget", "settingsVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "(Ljava/lang/Long;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "KEY_HR_ALL_DAY_DETECTION_FREQUENCY", "I", Constant.KeyValue.KEY_COLUMN, "()I", "KEY_HR_TOO_HIGH_REMIND_VALUE", "m", "KEY_HR_TOO_LOW_REMIND_VALUE", "n", "KEY_HR_ACTIVITY_MONITOR_SWITCH", "i", "KEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH", "j", "KEY_HR_MAX_VALUE", e.f13808a, "KEY_SCIENTIFIC_SLEEP_SWITCH", DeviceTagInterface.CUSTOM_TAG_TYPE, "KEY_OSA_SWITCH", "r", "KEY_ALL_DAY_PRESSURE_SWITCH", PluginDeviceInfo.FICONOFF, "KEY_RELIEVE_PRESSURE_REMIND_SWITCH", "s", "KEY_SLEEP_ALARM_SWITCH", "v", "KEY_SLEEP_MODE_SWITCH", "y", "KEY_SLEEP_AI_ALARM", "u", "KEY_SLEEP_BEFORE_BED", Constants.DEVICE_TYPE_WEAR, "KEY_HEART_HEALTHY_MONITOR_SWITCH", PluginDeviceInfo.FLOCALIZATIONS, "KEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH", "h", "KEY_SMART_SPO2_MONITOR_SWITCH", "A", "KEY_SPO2_LOW_LEVEL_REMIND_VALUE", c.f13755a, "KEY_STAND_UP_REMIND_SWITCH", "F", "KEY_STAND_UP_REMIND_START_TIME", "D", "KEY_STAND_UP_REMIND_STOP_TIME", "E", "KEY_MIDDY_REST_DND_SWITCH", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "KEY_MIDDY_REST_START_TIME", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "KEY_MIDDY_REST_STOP_TIME", "q", "KEY_TARGET_ACHIEVE_REMIND_SWITCH", c.f13756b, "KEY_STEP_TARGET", "G", "KEY_CALORIE_TARGET", PluginDeviceInfo.FBLUETOOTHPAIR, "KEY_WEIGHT_TARGET", "KEY_SLEEP_TARGET", "z", "KEY_STAND_TARGET", "C", "KEY_ACTIVITY_TARGET", PluginDeviceInfo.FICONON, "KEY_SLEEP_BLOOD_PRESSURE_MONITOR", "x", "KEY_ACTIVITY_MODE", PluginDeviceInfo.FDESC, "KEY_BODY_ENERGY", PluginDeviceInfo.FICONOFFLINE, "GROUP_VERSION_1", "GROUP_VERSION_2", "MAX_STEP", "TAG", "Ljava/lang/String;", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return Health.KEY_SMART_SPO2_MONITOR_SWITCH;
        }

        public final int B() {
            return Health.KEY_SPO2_LOW_LEVEL_REMIND_VALUE;
        }

        public final int C() {
            return Health.KEY_STAND_TARGET;
        }

        public final int D() {
            return Health.KEY_STAND_UP_REMIND_START_TIME;
        }

        public final int E() {
            return Health.KEY_STAND_UP_REMIND_STOP_TIME;
        }

        public final int F() {
            return Health.KEY_STAND_UP_REMIND_SWITCH;
        }

        public final int G() {
            return Health.KEY_STEP_TARGET;
        }

        public final int H() {
            return Health.KEY_TARGET_ACHIEVE_REMIND_SWITCH;
        }

        public final int I() {
            return Health.KEY_WEIGHT_TARGET;
        }

        public final int b() {
            return Health.KEY_ACTIVITY_MODE;
        }

        public final int c() {
            return Health.KEY_ACTIVITY_TARGET;
        }

        public final int d() {
            return Health.KEY_ALL_DAY_PRESSURE_SWITCH;
        }

        public final int e() {
            return Health.KEY_BODY_ENERGY;
        }

        public final int f() {
            return Health.KEY_CALORIE_TARGET;
        }

        public final int g() {
            return Health.KEY_HEART_HEALTHY_MONITOR_SWITCH;
        }

        public final int h() {
            return Health.KEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH;
        }

        public final int i() {
            return Health.KEY_HR_ACTIVITY_MONITOR_SWITCH;
        }

        public final int j() {
            return Health.KEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH;
        }

        public final int k() {
            return Health.KEY_HR_ALL_DAY_DETECTION_FREQUENCY;
        }

        public final int l() {
            return Health.KEY_HR_MAX_VALUE;
        }

        public final int m() {
            return Health.KEY_HR_TOO_HIGH_REMIND_VALUE;
        }

        public final int n() {
            return Health.KEY_HR_TOO_LOW_REMIND_VALUE;
        }

        public final int o() {
            return Health.KEY_MIDDY_REST_DND_SWITCH;
        }

        public final int p() {
            return Health.KEY_MIDDY_REST_START_TIME;
        }

        public final int q() {
            return Health.KEY_MIDDY_REST_STOP_TIME;
        }

        public final int r() {
            return Health.KEY_OSA_SWITCH;
        }

        public final int s() {
            return Health.KEY_RELIEVE_PRESSURE_REMIND_SWITCH;
        }

        public final int t() {
            return Health.KEY_SCIENTIFIC_SLEEP_SWITCH;
        }

        public final int u() {
            return Health.KEY_SLEEP_AI_ALARM;
        }

        public final int v() {
            return Health.KEY_SLEEP_ALARM_SWITCH;
        }

        public final int w() {
            return Health.KEY_SLEEP_BEFORE_BED;
        }

        public final int x() {
            return Health.KEY_SLEEP_BLOOD_PRESSURE_MONITOR;
        }

        public final int y() {
            return Health.KEY_SLEEP_MODE_SWITCH;
        }

        public final int z() {
            return Health.KEY_SLEEP_TARGET;
        }

        @NotNull
        public final HashMap<Integer, String> a() {
            return Health.hashMap;
        }

        public final int a(int i, String str) {
            a().put(Integer.valueOf(i), str);
            return i;
        }

        public static /* synthetic */ Health a(Companion companion, Long l, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.a(l, num);
        }

        @Nullable
        public final Health a(@Nullable Long stepTarget, @Nullable Integer settingsVersion) {
            oj intData;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (stepTarget == null) {
                return new Health(defaultConstructorMarker);
            }
            if (settingsVersion == null) {
                t5t.d(Health.TAG, "can't set stepTarget without settingsVersion!");
                return null;
            }
            Health health = new Health(defaultConstructorMarker);
            if (settingsVersion.intValue() >= 3) {
                if (stepTarget.longValue() > CreateRouteLoadingFragment.STYLE_LOADING_DURATION) {
                    t5t.d(Health.TAG, "value " + stepTarget + " too big!");
                    return null;
                }
                intData = new Int32Data((int) stepTarget.longValue());
            } else {
                if (stepTarget.longValue() > 32767) {
                    t5t.d(Health.TAG, "value " + stepTarget + " too big!");
                    return null;
                }
                intData = new IntData((int) stepTarget.longValue());
            }
            health.setStepTarget(intData);
            return health;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        HashMap<Integer, String> map = new HashMap<>();
        hashMap = map;
        map.put(1, "全天心率检测频率");
        KEY_HR_ALL_DAY_DETECTION_FREQUENCY = 1;
        map.put(2, "高心率提醒值");
        KEY_HR_TOO_HIGH_REMIND_VALUE = 2;
        map.put(3, "低心率提醒值");
        KEY_HR_TOO_LOW_REMIND_VALUE = 3;
        map.put(4, "活动心率监测开关");
        KEY_HR_ACTIVITY_MONITOR_SWITCH = 4;
        map.put(5, "运动/活动心率广播");
        KEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH = 5;
        map.put(6, "用户最大的心率值");
        KEY_HR_MAX_VALUE = 6;
        map.put(17, "科学睡眠开关");
        KEY_SCIENTIFIC_SLEEP_SWITCH = 17;
        map.put(18, "睡眠血氧监测开关（睡眠呼吸质量监测）");
        KEY_OSA_SWITCH = 18;
        map.put(19, "全天压力监测开关");
        KEY_ALL_DAY_PRESSURE_SWITCH = 19;
        map.put(20, "舒压提醒开关");
        KEY_RELIEVE_PRESSURE_REMIND_SWITCH = 20;
        map.put(21, "睡眠闹钟开关");
        KEY_SLEEP_ALARM_SWITCH = 21;
        map.put(22, "睡眠模式开关");
        KEY_SLEEP_MODE_SWITCH = 22;
        map.put(23, "智能闹钟开关");
        KEY_SLEEP_AI_ALARM = 23;
        map.put(24, "就寝提醒提前时间");
        KEY_SLEEP_BEFORE_BED = 24;
        map.put(33, "心脏健康监测开关");
        KEY_HEART_HEALTHY_MONITOR_SWITCH = 33;
        map.put(34, "（心脏健康监测）睡眠勿扰开关");
        KEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH = 34;
        map.put(49, "智能血氧监测开关");
        KEY_SMART_SPO2_MONITOR_SWITCH = 49;
        map.put(50, "低血氧预警值");
        KEY_SPO2_LOW_LEVEL_REMIND_VALUE = 50;
        map.put(65, "站立提醒开关");
        KEY_STAND_UP_REMIND_SWITCH = 65;
        map.put(66, "站立提醒开始时间");
        KEY_STAND_UP_REMIND_START_TIME = 66;
        map.put(67, "站立提醒结束时间");
        KEY_STAND_UP_REMIND_STOP_TIME = 67;
        map.put(68, "（站立提醒）午休免打扰开关");
        KEY_MIDDY_REST_DND_SWITCH = 68;
        map.put(69, "（站立提醒）午休免打扰开始时间");
        KEY_MIDDY_REST_START_TIME = 69;
        map.put(70, "（站立提醒）午休免打扰结束时间");
        KEY_MIDDY_REST_STOP_TIME = 70;
        map.put(81, "总达标提醒开关");
        KEY_TARGET_ACHIEVE_REMIND_SWITCH = 81;
        map.put(82, "目标步数");
        KEY_STEP_TARGET = 82;
        map.put(83, "目标卡路里");
        KEY_CALORIE_TARGET = 83;
        KEY_WEIGHT_TARGET = companion.a(84, "体重目标，单位公斤");
        KEY_SLEEP_TARGET = companion.a(85, "睡眠目标，分钟数");
        KEY_STAND_TARGET = companion.a(86, "站立目标，单位：次");
        KEY_ACTIVITY_TARGET = companion.a(87, "中高强度活动目标，单位：分钟");
        KEY_SLEEP_BLOOD_PRESSURE_MONITOR = companion.a(97, "睡眠中血压自动测量开关");
        KEY_ACTIVITY_MODE = companion.a(113, "站立/中高强度切换");
        KEY_BODY_ENERGY = companion.a(129, "身体电量提醒开关");
    }

    public /* synthetic */ Health(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final EnumData getActivityMode() {
        return getEnum(KEY_ACTIVITY_MODE);
    }

    @Nullable
    public final IntData getActivityTarget() {
        return getInt(KEY_ACTIVITY_TARGET);
    }

    @Nullable
    public final Boolean getAllDayPressureSwitch() {
        return getBoolean(KEY_ALL_DAY_PRESSURE_SWITCH);
    }

    @Nullable
    public final Boolean getBloodPressureMonitorSwitch() {
        return getBoolean(KEY_SLEEP_BLOOD_PRESSURE_MONITOR);
    }

    @Nullable
    public final Boolean getBodyEnergySwitch() {
        return getBoolean(KEY_BODY_ENERGY);
    }

    @Nullable
    public final IntData getCalorieTarget() {
        return getInt(KEY_CALORIE_TARGET);
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
    public final Boolean getHeartHealthyMonitorSwitch() {
        return getBoolean(KEY_HEART_HEALTHY_MONITOR_SWITCH);
    }

    @Nullable
    public final Boolean getHeartHealthyRemindDndInSleepSwitch() {
        return getBoolean(KEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH);
    }

    @Nullable
    public final Boolean getHrActivityMonitorSwitch() {
        return getBoolean(KEY_HR_ACTIVITY_MONITOR_SWITCH);
    }

    @Nullable
    public final Boolean getHrAdvertisementInActiveSwitch() {
        return getBoolean(KEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH);
    }

    @Nullable
    public final EnumData getHrAllayDetectionFrequency() {
        return getEnum(KEY_HR_ALL_DAY_DETECTION_FREQUENCY);
    }

    @Nullable
    public final IntData getHrMaxValue() {
        return getInt(KEY_HR_MAX_VALUE);
    }

    @Nullable
    public final EnumData getHrTooHighRemindValue() {
        return getEnum(KEY_HR_TOO_HIGH_REMIND_VALUE);
    }

    @Nullable
    public final EnumData getHrTooLowRemindValue() {
        return getEnum(KEY_HR_TOO_LOW_REMIND_VALUE);
    }

    @Nullable
    public final Boolean getMiddyRestDndSwitch() {
        return getBoolean(KEY_MIDDY_REST_DND_SWITCH);
    }

    @Nullable
    public final Time getMiddyRestStartTime() {
        return getTime(KEY_MIDDY_REST_START_TIME);
    }

    @Nullable
    public final Time getMiddyRestStopTime() {
        return getTime(KEY_MIDDY_REST_STOP_TIME);
    }

    @Nullable
    public final Boolean getOsaSwitch() {
        return getBoolean(KEY_OSA_SWITCH);
    }

    @Nullable
    public final Boolean getRelievePressureRemindSwitch() {
        return getBoolean(KEY_RELIEVE_PRESSURE_REMIND_SWITCH);
    }

    @Nullable
    public final Boolean getScientificSleepSwitch() {
        return getBoolean(KEY_SCIENTIFIC_SLEEP_SWITCH);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Nullable
    public final Boolean getSleepAIAlarm() {
        return getBoolean(KEY_SLEEP_AI_ALARM);
    }

    @Nullable
    public final Boolean getSleepAlarmSwitch() {
        return getBoolean(KEY_SLEEP_ALARM_SWITCH);
    }

    @Nullable
    public final EnumData getSleepBeforeDed() {
        return getEnum(KEY_SLEEP_BEFORE_BED);
    }

    @Nullable
    public final Boolean getSleepModeSwitch() {
        return getBoolean(KEY_SLEEP_MODE_SWITCH);
    }

    @Nullable
    public final IntData getSleepTarget() {
        return getInt(KEY_SLEEP_TARGET);
    }

    @Nullable
    public final Boolean getSmartSpo2MonitorSwitch() {
        return getBoolean(KEY_SMART_SPO2_MONITOR_SWITCH);
    }

    @Nullable
    public final EnumData getSpo2LowLevelRemindValue() {
        return getEnum(KEY_SPO2_LOW_LEVEL_REMIND_VALUE);
    }

    @Nullable
    public final IntData getStandTarget() {
        return getInt(KEY_STAND_TARGET);
    }

    @Nullable
    public final Time getStandUpRemindStartTime() {
        return getTime(KEY_STAND_UP_REMIND_START_TIME);
    }

    @Nullable
    public final Time getStandUpRemindStopTime() {
        return getTime(KEY_STAND_UP_REMIND_STOP_TIME);
    }

    @Nullable
    public final Boolean getStandUpRemindSwitch() {
        return getBoolean(KEY_STAND_UP_REMIND_SWITCH);
    }

    @Nullable
    public final oj getStepTarget() {
        return getIntPrimaryData(KEY_STEP_TARGET);
    }

    @Nullable
    public final Boolean getTargetAchieveRemindSwitch() {
        return getBoolean(KEY_TARGET_ACHIEVE_REMIND_SWITCH);
    }

    @Nullable
    public final IntData getWeightTarget() {
        return getInt(KEY_WEIGHT_TARGET);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return hashMap.get(Integer.valueOf(key));
    }

    public final void setActivityMode(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_ACTIVITY_MODE);
    }

    public final void setActivityTarget(@Nullable IntData intData) {
        setInt(intData, KEY_ACTIVITY_TARGET);
    }

    public final void setAllDayPressureSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_ALL_DAY_PRESSURE_SWITCH);
    }

    public final void setBloodPressureMonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SLEEP_BLOOD_PRESSURE_MONITOR);
    }

    public final void setBodyEnergySwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_BODY_ENERGY);
    }

    public final void setCalorieTarget(@Nullable IntData intData) {
        setInt(intData, KEY_CALORIE_TARGET);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setHeartHealthyMonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_HEART_HEALTHY_MONITOR_SWITCH);
    }

    public final void setHeartHealthyRemindDndInSleepSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH);
    }

    public final void setHrActivityMonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_HR_ACTIVITY_MONITOR_SWITCH);
    }

    public final void setHrAdvertisementInActiveSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH);
    }

    public final void setHrAllayDetectionFrequency(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_HR_ALL_DAY_DETECTION_FREQUENCY);
    }

    public final void setHrMaxValue(@Nullable IntData intData) {
        setInt(intData, KEY_HR_MAX_VALUE);
    }

    public final void setHrTooHighRemindValue(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_HR_TOO_HIGH_REMIND_VALUE);
    }

    public final void setHrTooLowRemindValue(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_HR_TOO_LOW_REMIND_VALUE);
    }

    public final void setMiddyRestDndSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_MIDDY_REST_DND_SWITCH);
    }

    public final void setMiddyRestStartTime(@Nullable Time time) {
        setTime(time, KEY_MIDDY_REST_START_TIME);
    }

    public final void setMiddyRestStopTime(@Nullable Time time) {
        setTime(time, KEY_MIDDY_REST_STOP_TIME);
    }

    public final void setOsaSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_OSA_SWITCH);
    }

    public final void setRelievePressureRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_RELIEVE_PRESSURE_REMIND_SWITCH);
    }

    public final void setScientificSleepSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SCIENTIFIC_SLEEP_SWITCH);
    }

    public final void setSleepAIAlarm(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SLEEP_AI_ALARM);
    }

    public final void setSleepAlarmSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SLEEP_ALARM_SWITCH);
    }

    public final void setSleepBeforeDed(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_SLEEP_BEFORE_BED);
    }

    public final void setSleepModeSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SLEEP_MODE_SWITCH);
    }

    public final void setSleepTarget(@Nullable IntData intData) {
        setInt(intData, KEY_SLEEP_TARGET);
    }

    public final void setSmartSpo2MonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SMART_SPO2_MONITOR_SWITCH);
    }

    public final void setSpo2LowLevelRemindValue(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_SPO2_LOW_LEVEL_REMIND_VALUE);
    }

    public final void setStandTarget(@Nullable IntData intData) {
        setInt(intData, KEY_STAND_TARGET);
    }

    public final void setStandUpRemindStartTime(@Nullable Time time) {
        setTime(time, KEY_STAND_UP_REMIND_START_TIME);
    }

    public final void setStandUpRemindStopTime(@Nullable Time time) {
        setTime(time, KEY_STAND_UP_REMIND_STOP_TIME);
    }

    public final void setStandUpRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_STAND_UP_REMIND_SWITCH);
    }

    public final void setStepTarget(@Nullable oj ojVar) {
        setInt(ojVar, KEY_STEP_TARGET);
    }

    public final void setTargetAchieveRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_TARGET_ACHIEVE_REMIND_SWITCH);
    }

    public final void setWeightTarget(@Nullable IntData intData) {
        setInt(intData, KEY_WEIGHT_TARGET);
    }

    private Health() {
        this.groupType = SettingsGroupType.HEALTH;
        this.settingsGroupName = TAG;
        this.groupVersion = 1;
    }
}
