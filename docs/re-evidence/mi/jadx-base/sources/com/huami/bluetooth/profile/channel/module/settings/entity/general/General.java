package com.huami.bluetooth.profile.channel.module.settings.entity.general;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b7\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u0002:\u0002\u0095\u0001B\t¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR(\u0010(\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR(\u0010+\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR(\u00101\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00107\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010:\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00104\"\u0004\b9\u00106R(\u0010=\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R(\u0010@\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR(\u0010C\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u00104\"\u0004\bB\u00106R(\u0010F\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u00104\"\u0004\bE\u00106R(\u0010I\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R(\u0010L\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010.\"\u0004\bK\u00100R(\u0010O\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u00104\"\u0004\bN\u00106R(\u0010R\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R(\u0010X\u001a\u0004\u0018\u00010S2\b\u0010\u0017\u001a\u0004\u0018\u00010S8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR(\u0010[\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u0019\"\u0004\bZ\u0010\u001bR(\u0010^\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010.\"\u0004\b]\u00100R(\u0010d\u001a\u0004\u0018\u00010_2\b\u0010\u0017\u001a\u0004\u0018\u00010_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010g\u001a\u0004\u0018\u00010_2\b\u0010\u0017\u001a\u0004\u0018\u00010_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010a\"\u0004\bf\u0010cR(\u0010j\u001a\u0004\u0018\u00010_2\b\u0010\u0017\u001a\u0004\u0018\u00010_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010a\"\u0004\bi\u0010cR(\u0010m\u001a\u0004\u0018\u00010_2\b\u0010\u0017\u001a\u0004\u0018\u00010_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR(\u0010p\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010.\"\u0004\bo\u00100R(\u0010s\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010.\"\u0004\br\u00100R(\u0010v\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010\u0019\"\u0004\bu\u0010\u001bR(\u0010y\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010\u0019\"\u0004\bx\u0010\u001bR(\u0010|\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u00104\"\u0004\b{\u00106R(\u0010\u007f\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u00104\"\u0004\b~\u00106R+\u0010\u0082\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010.\"\u0005\b\u0081\u0001\u00100R+\u0010\u0085\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010.\"\u0005\b\u0084\u0001\u00100R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010.\"\u0005\b\u0087\u0001\u00100R+\u0010\u008b\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010.\"\u0005\b\u008a\u0001\u00100R+\u0010\u008e\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010.\"\u0005\b\u008d\u0001\u00100R+\u0010\u0091\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010.\"\u0005\b\u0090\u0001\u00100¨\u0006\u0096\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "settingsGroupName", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getTimeFormat", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setTimeFormat", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "timeFormat", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "getDateDisplayStyle", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "setDateDisplayStyle", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;)V", "dateDisplayStyle", "getOtherCalendar", "setOtherCalendar", "otherCalendar", "getWeeklyStartTime", "setWeeklyStartTime", "weeklyStartTime", "getMileageUnit", "setMileageUnit", "mileageUnit", "", "getHourlyAnnounceSwitch", "()Ljava/lang/Boolean;", "setHourlyAnnounceSwitch", "(Ljava/lang/Boolean;)V", "hourlyAnnounceSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getHourlyAnnounceStartTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setHourlyAnnounceStartTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "hourlyAnnounceStartTime", "getHourlyAnnounceStopTime", "setHourlyAnnounceStopTime", "hourlyAnnounceStopTime", "getEnableDevice", "setEnableDevice", "enableDevice", "getDndMode", "setDndMode", "dndMode", "getDndStartTime", "setDndStartTime", "dndStartTime", "getDndStopTime", "setDndStopTime", "dndStopTime", "getWristBrightInDNDSwitch", "setWristBrightInDNDSwitch", "wristBrightInDNDSwitch", "getConnLostRemindSwitch", "setConnLostRemindSwitch", "connLostRemindSwitch", "getConnLostRemindStartTime", "setConnLostRemindStartTime", "connLostRemindStartTime", "getConnLostRemindStopTime", "setConnLostRemindStopTime", "connLostRemindStopTime", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getIncomingCallDelayTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setIncomingCallDelayTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "incomingCallDelayTime", "getTemperatureUnit", "setTemperatureUnit", "temperatureUnit", "getTimeFormatFollowMobilePhoneSwitch", "setTimeFormatFollowMobilePhoneSwitch", "timeFormatFollowMobilePhoneSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "getLongPressSideApp", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "setLongPressSideApp", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;)V", "longPressSideApp", "getLongPressUpApp", "setLongPressUpApp", "longPressUpApp", "getClickDownApp", "setClickDownApp", "clickDownApp", "getClickSelectApp", "setClickSelectApp", "clickSelectApp", "getInComingCallDisplayContactsSwitch", "setInComingCallDisplayContactsSwitch", "inComingCallDisplayContactsSwitch", "getSmsDisplayContactsSwitch", "setSmsDisplayContactsSwitch", "smsDisplayContactsSwitch", "getWeightUnit", "setWeightUnit", "weightUnit", "getNightMode", "setNightMode", "nightMode", "getNightModeStartTime", "setNightModeStartTime", "nightModeStartTime", "getNightModeStopTime", "setNightModeStopTime", "nightModeStopTime", "getAutoOtaAtNightSwitch", "setAutoOtaAtNightSwitch", "autoOtaAtNightSwitch", "getDisableHid", "setDisableHid", "disableHid", "getSleepModeSwitch", "setSleepModeSwitch", "sleepModeSwitch", "getSleepModeForDisplaySwitch", "setSleepModeForDisplaySwitch", "sleepModeForDisplaySwitch", "getSleepModeSmartEnableSwitch", "setSleepModeSmartEnableSwitch", "sleepModeSmartEnableSwitch", "getHidConnect", "setHidConnect", "hidConnect", "<init>", "()V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class General extends Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final int DND_MODE_CLOSE = 0;
    public static final int DND_MODE_DIY = 2;
    public static final int DND_MODE_SMART = 1;
    public static final int GROUP_VERSION = 2;
    private static final int KEY_AUTO_OTA_AT_NIGHT_SWITCH;
    private static final int KEY_CLICK_DOWN_APP;
    private static final int KEY_CLICK_SELECT_APP;
    private static final int KEY_CONN_LOST_REMIND_START_TIME;
    private static final int KEY_CONN_LOST_REMIND_STOP_TIME;
    private static final int KEY_CONN_LOST_REMIND_SWITCH;
    private static final int KEY_DATE_DISPLAY_STYLE;
    private static final int KEY_DISABLE_HID;
    private static final int KEY_DND_MODE;
    private static final int KEY_DND_START_TIME;
    private static final int KEY_DND_STOP_TIME;
    private static final int KEY_ENABLE_DEVICE;
    private static final int KEY_HID_CONNECT;
    private static final int KEY_HOURLY_ANNOUNCE_START_TIME;
    private static final int KEY_HOURLY_ANNOUNCE_STOP_TIME;
    private static final int KEY_HOURLY_ANNOUNCE_SWITCH;

    @JvmField
    public static final int KEY_INCOMING_CALL_DELAY_TIME;
    private static final int KEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH;
    private static final int KEY_LONG_PRESS_SIDE_APP;
    private static final int KEY_LONG_PRESS_UP_APP;
    private static final int KEY_MILEAGE_UNIT;
    private static final int KEY_NIGHT_MODE;
    private static final int KEY_NIGHT_MODE_START_TIME;
    private static final int KEY_NIGHT_MODE_STOP_TIME;
    private static final int KEY_OTHER_CALENDAR;
    private static final int KEY_SLEEP_MODE_FOR_DISPLAY_SWITCH;
    private static final int KEY_SLEEP_MODE_SMART_ENABLE_SWITCH;
    private static final int KEY_SLEEP_MODE_SWITCH;
    private static final int KEY_SMS_DISPLAY_CONTACTS_SWITCH;
    private static final int KEY_TEMPERATURE_UNIT;
    private static final int KEY_TIME_FORMAT;
    private static final int KEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH;
    private static final int KEY_WEEKLY_START_TIME;
    private static final int KEY_WEIGHT_UNIT;
    private static final int KEY_WRIST_BRIGHT_IN_DND_MODE;
    public static final int MILEAGE_UNIT_METRIC = 0;
    public static final int MILEAGE_UNIT_MILE = 1;
    public static final int NIGHT_MODE_CLOSE = 0;
    public static final int NIGHT_MODE_SUN_SET = 1;
    public static final int NIGHT_MODE_TIMER = 2;
    public static final int TIME_FORMAT_12_HOUR = 0;
    public static final int TIME_FORMAT_24_HOUR = 1;

    @NotNull
    private static final HashMap<Integer, String> hashMap;
    private static final long serialVersionUID = 1;
    private int groupVersion = 2;

    @NotNull
    private final String settingsGroupName = AIApiConstants.General.NAME;

    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.GENERAL;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.entity.general.General$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b_\u0010`J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R3\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0006j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000eR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000eR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b\f\u0010\u000eR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000eR\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000eR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010\u000eR\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b-\u0010\u000eR\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u000eR\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\f\u001a\u0004\b3\u0010\u000eR\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u000eR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\f\u001a\u0004\b7\u0010\u000eR\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b9\u0010\u000eR\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b;\u0010\u000eR\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b=\u0010\u000eR\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010\u000eR\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010\u000eR\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\f\u001a\u0004\bC\u0010\u000eR\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010\u000eR\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010\f\u001a\u0004\bG\u0010\u000eR\u0017\u0010H\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010\f\u001a\u0004\bI\u0010\u000eR\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010\u000eR\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010\u000eR\u0017\u0010N\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\f\u001a\u0004\bO\u0010\u000eR\u0014\u0010P\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\fR\u0014\u0010Q\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\fR\u0014\u0010R\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\fR\u0014\u0010S\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\fR\u0014\u0010T\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\fR\u0014\u0010U\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\fR\u0014\u0010V\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010\fR\u0014\u0010W\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010\fR\u0014\u0010X\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010\fR\u0014\u0010Y\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010\fR\u0014\u0010Z\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010\fR\u0014\u0010[\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\fR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General$a;", "", "", "", "name", PluginDeviceInfo.FMODEL, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "KEY_TIME_FORMAT", "I", "E", "()I", "KEY_DATE_DISPLAY_STYLE", "h", "KEY_OTHER_CALENDAR", "y", "KEY_WEEKLY_START_TIME", "G", "KEY_MILEAGE_UNIT", "u", "KEY_HOURLY_ANNOUNCE_SWITCH", "q", "KEY_HOURLY_ANNOUNCE_START_TIME", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "KEY_HOURLY_ANNOUNCE_STOP_TIME", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "KEY_ENABLE_DEVICE", "m", "KEY_DND_MODE", "j", "KEY_DND_START_TIME", Constant.KeyValue.KEY_COLUMN, "KEY_DND_STOP_TIME", e.f13808a, "KEY_WRIST_BRIGHT_IN_DND_MODE", "KEY_CONN_LOST_REMIND_SWITCH", PluginDeviceInfo.FLOCALIZATIONS, "KEY_CONN_LOST_REMIND_START_TIME", PluginDeviceInfo.FICONOFFLINE, "KEY_CONN_LOST_REMIND_STOP_TIME", PluginDeviceInfo.FBLUETOOTHPAIR, "KEY_TEMPERATURE_UNIT", "D", "KEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH", "F", "KEY_LONG_PRESS_SIDE_APP", "s", "KEY_LONG_PRESS_UP_APP", DeviceTagInterface.CUSTOM_TAG_TYPE, "KEY_CLICK_DOWN_APP", PluginDeviceInfo.FICONON, "KEY_CLICK_SELECT_APP", PluginDeviceInfo.FICONOFF, "KEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH", "r", "KEY_SMS_DISPLAY_CONTACTS_SWITCH", "C", "KEY_WEIGHT_UNIT", c.f13756b, "KEY_NIGHT_MODE", "v", "KEY_NIGHT_MODE_START_TIME", Constants.DEVICE_TYPE_WEAR, "KEY_NIGHT_MODE_STOP_TIME", "x", "KEY_AUTO_OTA_AT_NIGHT_SWITCH", PluginDeviceInfo.FDESC, "KEY_DISABLE_HID", "i", "KEY_SLEEP_MODE_SWITCH", c.f13755a, "KEY_SLEEP_MODE_FOR_DISPLAY_SWITCH", "z", "KEY_SLEEP_MODE_SMART_ENABLE_SWITCH", "A", "KEY_HID_CONNECT", "n", "DND_MODE_CLOSE", "DND_MODE_DIY", "DND_MODE_SMART", "GROUP_VERSION", "KEY_INCOMING_CALL_DELAY_TIME", "MILEAGE_UNIT_METRIC", "MILEAGE_UNIT_MILE", "NIGHT_MODE_CLOSE", "NIGHT_MODE_SUN_SET", "NIGHT_MODE_TIMER", "TIME_FORMAT_12_HOUR", "TIME_FORMAT_24_HOUR", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return General.KEY_SLEEP_MODE_SMART_ENABLE_SWITCH;
        }

        public final int B() {
            return General.KEY_SLEEP_MODE_SWITCH;
        }

        public final int C() {
            return General.KEY_SMS_DISPLAY_CONTACTS_SWITCH;
        }

        public final int D() {
            return General.KEY_TEMPERATURE_UNIT;
        }

        public final int E() {
            return General.KEY_TIME_FORMAT;
        }

        public final int F() {
            return General.KEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH;
        }

        public final int G() {
            return General.KEY_WEEKLY_START_TIME;
        }

        public final int H() {
            return General.KEY_WEIGHT_UNIT;
        }

        public final int I() {
            return General.KEY_WRIST_BRIGHT_IN_DND_MODE;
        }

        public final int b() {
            return General.KEY_AUTO_OTA_AT_NIGHT_SWITCH;
        }

        public final int c() {
            return General.KEY_CLICK_DOWN_APP;
        }

        public final int d() {
            return General.KEY_CLICK_SELECT_APP;
        }

        public final int e() {
            return General.KEY_CONN_LOST_REMIND_START_TIME;
        }

        public final int f() {
            return General.KEY_CONN_LOST_REMIND_STOP_TIME;
        }

        public final int g() {
            return General.KEY_CONN_LOST_REMIND_SWITCH;
        }

        public final int h() {
            return General.KEY_DATE_DISPLAY_STYLE;
        }

        public final int i() {
            return General.KEY_DISABLE_HID;
        }

        public final int j() {
            return General.KEY_DND_MODE;
        }

        public final int k() {
            return General.KEY_DND_START_TIME;
        }

        public final int l() {
            return General.KEY_DND_STOP_TIME;
        }

        public final int m() {
            return General.KEY_ENABLE_DEVICE;
        }

        public final int n() {
            return General.KEY_HID_CONNECT;
        }

        public final int o() {
            return General.KEY_HOURLY_ANNOUNCE_START_TIME;
        }

        public final int p() {
            return General.KEY_HOURLY_ANNOUNCE_STOP_TIME;
        }

        public final int q() {
            return General.KEY_HOURLY_ANNOUNCE_SWITCH;
        }

        public final int r() {
            return General.KEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH;
        }

        public final int s() {
            return General.KEY_LONG_PRESS_SIDE_APP;
        }

        public final int t() {
            return General.KEY_LONG_PRESS_UP_APP;
        }

        public final int u() {
            return General.KEY_MILEAGE_UNIT;
        }

        public final int v() {
            return General.KEY_NIGHT_MODE;
        }

        public final int w() {
            return General.KEY_NIGHT_MODE_START_TIME;
        }

        public final int x() {
            return General.KEY_NIGHT_MODE_STOP_TIME;
        }

        public final int y() {
            return General.KEY_OTHER_CALENDAR;
        }

        public final int z() {
            return General.KEY_SLEEP_MODE_FOR_DISPLAY_SWITCH;
        }

        @NotNull
        public final HashMap<Integer, String> a() {
            return General.hashMap;
        }

        public final int a(int i, String str) {
            a().put(Integer.valueOf(i), str);
            return i;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        hashMap = new HashMap<>();
        KEY_TIME_FORMAT = companion.a(1, "时间制式");
        KEY_DATE_DISPLAY_STYLE = companion.a(2, "多语言日期显示样式");
        KEY_OTHER_CALENDAR = companion.a(3, "其它历法");
        KEY_WEEKLY_START_TIME = companion.a(4, "每周开始时间");
        KEY_MILEAGE_UNIT = companion.a(5, "长度单位");
        KEY_HOURLY_ANNOUNCE_SWITCH = companion.a(6, "整点报时开关");
        KEY_HOURLY_ANNOUNCE_START_TIME = companion.a(7, "整点报时起始时间");
        KEY_HOURLY_ANNOUNCE_STOP_TIME = companion.a(8, "整点报时结束时间");
        KEY_ENABLE_DEVICE = companion.a(9, "设备启用开关");
        KEY_DND_MODE = companion.a(10, "勿扰模式");
        KEY_DND_START_TIME = companion.a(11, "勿扰开始时间");
        KEY_DND_STOP_TIME = companion.a(12, "勿扰结束时间");
        KEY_WRIST_BRIGHT_IN_DND_MODE = companion.a(13, "勿扰模式下抬腕亮屏开关");
        KEY_CONN_LOST_REMIND_SWITCH = companion.a(14, "断连提醒开关");
        KEY_CONN_LOST_REMIND_START_TIME = companion.a(15, "断连提醒开始时间");
        KEY_CONN_LOST_REMIND_STOP_TIME = companion.a(16, "断连提醒结束时间");
        KEY_INCOMING_CALL_DELAY_TIME = companion.a(17, "来电延迟时间（单位：秒）");
        KEY_TEMPERATURE_UNIT = companion.a(18, "温度单位");
        KEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH = companion.a(19, "时间格式跟随手机");
        KEY_LONG_PRESS_SIDE_APP = companion.a(20, "长按侧键启动的应用");
        KEY_LONG_PRESS_UP_APP = companion.a(21, "长按上键启动的应用");
        KEY_CLICK_DOWN_APP = companion.a(22, "点按下键启动的应用");
        KEY_CLICK_SELECT_APP = companion.a(23, "点按选择键启动的应用");
        KEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH = companion.a(24, "来电显示联系人开关");
        KEY_SMS_DISPLAY_CONTACTS_SWITCH = companion.a(25, "短信显示联系人开关");
        KEY_WEIGHT_UNIT = companion.a(26, "体重单位");
        KEY_NIGHT_MODE = companion.a(27, "夜间模式");
        KEY_NIGHT_MODE_START_TIME = companion.a(28, "夜间模式开始时间");
        KEY_NIGHT_MODE_STOP_TIME = companion.a(29, "夜间模式结束时间");
        KEY_AUTO_OTA_AT_NIGHT_SWITCH = companion.a(30, "夜间自动升级开关");
        KEY_DISABLE_HID = companion.a(31, "禁用手机遥控拍照");
        KEY_SLEEP_MODE_SWITCH = companion.a(32, "睡眠模式开关");
        KEY_SLEEP_MODE_FOR_DISPLAY_SWITCH = companion.a(33, "睡眠屏幕开关");
        KEY_SLEEP_MODE_SMART_ENABLE_SWITCH = companion.a(34, "睡眠模式智能启用开关");
        KEY_HID_CONNECT = companion.a(35, "手机端Hid连接状态");
    }

    @Nullable
    public final Boolean getAutoOtaAtNightSwitch() {
        return getBoolean(KEY_AUTO_OTA_AT_NIGHT_SWITCH);
    }

    @Nullable
    public final StringEnum getClickDownApp() {
        return getStringEnum(KEY_CLICK_DOWN_APP);
    }

    @Nullable
    public final StringEnum getClickSelectApp() {
        return getStringEnum(KEY_CLICK_SELECT_APP);
    }

    @Nullable
    public final Time getConnLostRemindStartTime() {
        return getTime(KEY_CONN_LOST_REMIND_START_TIME);
    }

    @Nullable
    public final Time getConnLostRemindStopTime() {
        return getTime(KEY_CONN_LOST_REMIND_STOP_TIME);
    }

    @Nullable
    public final Boolean getConnLostRemindSwitch() {
        return getBoolean(KEY_CONN_LOST_REMIND_SWITCH);
    }

    @Nullable
    public final StringData getDateDisplayStyle() {
        return getString(KEY_DATE_DISPLAY_STYLE);
    }

    @Nullable
    public final Boolean getDisableHid() {
        return getBoolean(KEY_DISABLE_HID);
    }

    @Nullable
    public final EnumData getDndMode() {
        return getEnum(KEY_DND_MODE);
    }

    @Nullable
    public final Time getDndStartTime() {
        return getTime(KEY_DND_START_TIME);
    }

    @Nullable
    public final Time getDndStopTime() {
        return getTime(KEY_DND_STOP_TIME);
    }

    @Nullable
    public final Boolean getEnableDevice() {
        return getBoolean(KEY_ENABLE_DEVICE);
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
    public final Boolean getHidConnect() {
        return getBoolean(KEY_HID_CONNECT);
    }

    @Nullable
    public final Time getHourlyAnnounceStartTime() {
        return getTime(KEY_HOURLY_ANNOUNCE_START_TIME);
    }

    @Nullable
    public final Time getHourlyAnnounceStopTime() {
        return getTime(KEY_HOURLY_ANNOUNCE_STOP_TIME);
    }

    @Nullable
    public final Boolean getHourlyAnnounceSwitch() {
        return getBoolean(KEY_HOURLY_ANNOUNCE_SWITCH);
    }

    @Nullable
    public final Boolean getInComingCallDisplayContactsSwitch() {
        return getBoolean(KEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH);
    }

    @Nullable
    public final IntData getIncomingCallDelayTime() {
        return getInt(KEY_INCOMING_CALL_DELAY_TIME);
    }

    @Nullable
    public final StringEnum getLongPressSideApp() {
        return getStringEnum(KEY_LONG_PRESS_SIDE_APP);
    }

    @Nullable
    public final StringEnum getLongPressUpApp() {
        return getStringEnum(KEY_LONG_PRESS_UP_APP);
    }

    @Nullable
    public final EnumData getMileageUnit() {
        return getEnum(KEY_MILEAGE_UNIT);
    }

    @Nullable
    public final EnumData getNightMode() {
        return getEnum(KEY_NIGHT_MODE);
    }

    @Nullable
    public final Time getNightModeStartTime() {
        return getTime(KEY_NIGHT_MODE_START_TIME);
    }

    @Nullable
    public final Time getNightModeStopTime() {
        return getTime(KEY_NIGHT_MODE_STOP_TIME);
    }

    @Nullable
    public final EnumData getOtherCalendar() {
        return getEnum(KEY_OTHER_CALENDAR);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Nullable
    public final Boolean getSleepModeForDisplaySwitch() {
        return getBoolean(KEY_SLEEP_MODE_FOR_DISPLAY_SWITCH);
    }

    @Nullable
    public final Boolean getSleepModeSmartEnableSwitch() {
        return getBoolean(KEY_SLEEP_MODE_SMART_ENABLE_SWITCH);
    }

    @Nullable
    public final Boolean getSleepModeSwitch() {
        return getBoolean(KEY_SLEEP_MODE_SWITCH);
    }

    @Nullable
    public final Boolean getSmsDisplayContactsSwitch() {
        return getBoolean(KEY_SMS_DISPLAY_CONTACTS_SWITCH);
    }

    @Nullable
    public final EnumData getTemperatureUnit() {
        return getEnum(KEY_TEMPERATURE_UNIT);
    }

    @Nullable
    public final EnumData getTimeFormat() {
        return getEnum(KEY_TIME_FORMAT);
    }

    @Nullable
    public final Boolean getTimeFormatFollowMobilePhoneSwitch() {
        return getBoolean(KEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH);
    }

    @Nullable
    public final EnumData getWeeklyStartTime() {
        return getEnum(KEY_WEEKLY_START_TIME);
    }

    @Nullable
    public final EnumData getWeightUnit() {
        return getEnum(KEY_WEIGHT_UNIT);
    }

    @Nullable
    public final Boolean getWristBrightInDNDSwitch() {
        return getBoolean(KEY_WRIST_BRIGHT_IN_DND_MODE);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return hashMap.get(Integer.valueOf(key));
    }

    public final void setAutoOtaAtNightSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_AUTO_OTA_AT_NIGHT_SWITCH);
    }

    public final void setClickDownApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, KEY_CLICK_DOWN_APP);
    }

    public final void setClickSelectApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, KEY_CLICK_SELECT_APP);
    }

    public final void setConnLostRemindStartTime(@Nullable Time time) {
        setTime(time, KEY_CONN_LOST_REMIND_START_TIME);
    }

    public final void setConnLostRemindStopTime(@Nullable Time time) {
        setTime(time, KEY_CONN_LOST_REMIND_STOP_TIME);
    }

    public final void setConnLostRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_CONN_LOST_REMIND_SWITCH);
    }

    public final void setDateDisplayStyle(@Nullable StringData stringData) {
        setString(stringData, KEY_DATE_DISPLAY_STYLE);
    }

    public final void setDisableHid(@Nullable Boolean bool) {
        setBoolean(bool, KEY_DISABLE_HID);
    }

    public final void setDndMode(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_DND_MODE);
    }

    public final void setDndStartTime(@Nullable Time time) {
        setTime(time, KEY_DND_START_TIME);
    }

    public final void setDndStopTime(@Nullable Time time) {
        setTime(time, KEY_DND_STOP_TIME);
    }

    public final void setEnableDevice(@Nullable Boolean bool) {
        setBoolean(bool, KEY_ENABLE_DEVICE);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setHidConnect(@Nullable Boolean bool) {
        setBoolean(bool, KEY_HID_CONNECT);
    }

    public final void setHourlyAnnounceStartTime(@Nullable Time time) {
        setTime(time, KEY_HOURLY_ANNOUNCE_START_TIME);
    }

    public final void setHourlyAnnounceStopTime(@Nullable Time time) {
        setTime(time, KEY_HOURLY_ANNOUNCE_STOP_TIME);
    }

    public final void setHourlyAnnounceSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_HOURLY_ANNOUNCE_SWITCH);
    }

    public final void setInComingCallDisplayContactsSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH);
    }

    public final void setIncomingCallDelayTime(@Nullable IntData intData) {
        setInt(intData, KEY_INCOMING_CALL_DELAY_TIME);
    }

    public final void setLongPressSideApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, KEY_LONG_PRESS_SIDE_APP);
    }

    public final void setLongPressUpApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, KEY_LONG_PRESS_UP_APP);
    }

    public final void setMileageUnit(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_MILEAGE_UNIT);
    }

    public final void setNightMode(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_NIGHT_MODE);
    }

    public final void setNightModeStartTime(@Nullable Time time) {
        setTime(time, KEY_NIGHT_MODE_START_TIME);
    }

    public final void setNightModeStopTime(@Nullable Time time) {
        setTime(time, KEY_NIGHT_MODE_STOP_TIME);
    }

    public final void setOtherCalendar(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_OTHER_CALENDAR);
    }

    public final void setSleepModeForDisplaySwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SLEEP_MODE_FOR_DISPLAY_SWITCH);
    }

    public final void setSleepModeSmartEnableSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SLEEP_MODE_SMART_ENABLE_SWITCH);
    }

    public final void setSleepModeSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SLEEP_MODE_SWITCH);
    }

    public final void setSmsDisplayContactsSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SMS_DISPLAY_CONTACTS_SWITCH);
    }

    public final void setTemperatureUnit(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_TEMPERATURE_UNIT);
    }

    public final void setTimeFormat(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_TIME_FORMAT);
    }

    public final void setTimeFormatFollowMobilePhoneSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH);
    }

    public final void setWeeklyStartTime(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_WEEKLY_START_TIME);
    }

    public final void setWeightUnit(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_WEIGHT_UNIT);
    }

    public final void setWristBrightInDNDSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_WRIST_BRIGHT_IN_DND_MODE);
    }
}
