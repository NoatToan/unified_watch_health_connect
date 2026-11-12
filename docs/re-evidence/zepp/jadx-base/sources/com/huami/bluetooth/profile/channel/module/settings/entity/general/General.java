package com.huami.bluetooth.profile.channel.module.settings.entity.general;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.ai.api.AIApiConstants;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b6\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B\t¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u00020\u00058\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010(\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR(\u0010+\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR(\u0010.\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR(\u00104\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u0010:\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010=\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00107\"\u0004\b<\u00109R(\u0010@\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u00101\"\u0004\b?\u00103R(\u0010C\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR(\u0010F\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u00107\"\u0004\bE\u00109R(\u0010I\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u00107\"\u0004\bH\u00109R(\u0010L\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u00101\"\u0004\bK\u00103R(\u0010O\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u00101\"\u0004\bN\u00103R(\u0010R\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u00107\"\u0004\bQ\u00109R(\u0010U\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u00107\"\u0004\bT\u00109R(\u0010[\u001a\u0004\u0018\u00010V2\b\u0010\u001a\u001a\u0004\u0018\u00010V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010^\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u001c\"\u0004\b]\u0010\u001eR(\u0010a\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u00101\"\u0004\b`\u00103R(\u0010g\u001a\u0004\u0018\u00010b2\b\u0010\u001a\u001a\u0004\u0018\u00010b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR(\u0010j\u001a\u0004\u0018\u00010b2\b\u0010\u001a\u001a\u0004\u0018\u00010b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010d\"\u0004\bi\u0010fR(\u0010m\u001a\u0004\u0018\u00010b2\b\u0010\u001a\u001a\u0004\u0018\u00010b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010d\"\u0004\bl\u0010fR(\u0010p\u001a\u0004\u0018\u00010b2\b\u0010\u001a\u001a\u0004\u0018\u00010b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010d\"\u0004\bo\u0010fR(\u0010s\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u00101\"\u0004\br\u00103R(\u0010v\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u00101\"\u0004\bu\u00103R(\u0010y\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010\u001c\"\u0004\bx\u0010\u001eR(\u0010|\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010\u001c\"\u0004\b{\u0010\u001eR(\u0010\u007f\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u00107\"\u0004\b~\u00109R+\u0010\u0082\u0001\u001a\u0004\u0018\u0001052\b\u0010\u001a\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u00107\"\u0005\b\u0081\u0001\u00109R+\u0010\u0085\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u00101\"\u0005\b\u0084\u0001\u00103R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u00101\"\u0005\b\u0087\u0001\u00103R+\u0010\u008b\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u00101\"\u0005\b\u008a\u0001\u00103R+\u0010\u008e\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u00101\"\u0005\b\u008d\u0001\u00103R+\u0010\u0091\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u00101\"\u0005\b\u0090\u0001\u00103R+\u0010\u0094\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u00101\"\u0005\b\u0093\u0001\u00103¨\u0006\u0098\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "c", LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getTimeFormat", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setTimeFormat", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "timeFormat", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "getDateDisplayStyle", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "setDateDisplayStyle", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;)V", "dateDisplayStyle", "getOtherCalendar", "setOtherCalendar", "otherCalendar", "getWeeklyStartTime", "setWeeklyStartTime", "weeklyStartTime", "getMileageUnit", "setMileageUnit", "mileageUnit", "", "getHourlyAnnounceSwitch", "()Ljava/lang/Boolean;", "setHourlyAnnounceSwitch", "(Ljava/lang/Boolean;)V", "hourlyAnnounceSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getHourlyAnnounceStartTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setHourlyAnnounceStartTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "hourlyAnnounceStartTime", "getHourlyAnnounceStopTime", "setHourlyAnnounceStopTime", "hourlyAnnounceStopTime", "getEnableDevice", "setEnableDevice", "enableDevice", "getDndMode", "setDndMode", "dndMode", "getDndStartTime", "setDndStartTime", "dndStartTime", "getDndStopTime", "setDndStopTime", "dndStopTime", "getWristBrightInDNDSwitch", "setWristBrightInDNDSwitch", "wristBrightInDNDSwitch", "getConnLostRemindSwitch", "setConnLostRemindSwitch", "connLostRemindSwitch", "getConnLostRemindStartTime", "setConnLostRemindStartTime", "connLostRemindStartTime", "getConnLostRemindStopTime", "setConnLostRemindStopTime", "connLostRemindStopTime", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getIncomingCallDelayTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setIncomingCallDelayTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "incomingCallDelayTime", "getTemperatureUnit", "setTemperatureUnit", "temperatureUnit", "getTimeFormatFollowMobilePhoneSwitch", "setTimeFormatFollowMobilePhoneSwitch", "timeFormatFollowMobilePhoneSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "getLongPressSideApp", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "setLongPressSideApp", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;)V", "longPressSideApp", "getLongPressUpApp", "setLongPressUpApp", "longPressUpApp", "getClickDownApp", "setClickDownApp", "clickDownApp", "getClickSelectApp", "setClickSelectApp", "clickSelectApp", "getInComingCallDisplayContactsSwitch", "setInComingCallDisplayContactsSwitch", "inComingCallDisplayContactsSwitch", "getSmsDisplayContactsSwitch", "setSmsDisplayContactsSwitch", "smsDisplayContactsSwitch", "getWeightUnit", "setWeightUnit", "weightUnit", "getNightMode", "setNightMode", "nightMode", "getNightModeStartTime", "setNightModeStartTime", "nightModeStartTime", "getNightModeStopTime", "setNightModeStopTime", "nightModeStopTime", "getAutoOtaAtNightSwitch", "setAutoOtaAtNightSwitch", "autoOtaAtNightSwitch", "getDisableHid", "setDisableHid", "disableHid", "getSleepModeSwitch", "setSleepModeSwitch", "sleepModeSwitch", "getSleepModeForDisplaySwitch", "setSleepModeForDisplaySwitch", "sleepModeForDisplaySwitch", "getSleepModeSmartEnableSwitch", "setSleepModeSmartEnableSwitch", "sleepModeSmartEnableSwitch", "getHidConnect", "setHidConnect", "hidConnect", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class General extends Settings implements Serializable {
    private static final int A;
    private static final int B;
    private static final int C;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final int D;
    public static final int DND_MODE_CLOSE = 0;
    public static final int DND_MODE_DIY = 2;
    public static final int DND_MODE_SMART = 1;
    private static final int E;
    private static final int F;
    private static final int G;
    public static final int GROUP_VERSION = 2;
    private static final int H;
    private static final int I;
    private static final int J;
    private static final int K;

    @JvmField
    public static final int KEY_INCOMING_CALL_DELAY_TIME;
    private static final int L;
    private static final int M;
    public static final int MILEAGE_UNIT_METRIC = 0;
    public static final int MILEAGE_UNIT_MILE = 1;
    private static final int N;
    public static final int NIGHT_MODE_CLOSE = 0;
    public static final int NIGHT_MODE_SUN_SET = 1;
    public static final int NIGHT_MODE_TIMER = 2;
    public static final int TIME_FORMAT_12_HOUR = 0;
    public static final int TIME_FORMAT_24_HOUR = 1;

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
    private static final int y;
    private static final int z;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int groupVersion = 2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String settingsGroupName = AIApiConstants.General.NAME;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.GENERAL;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\ba\u0010bJ\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R5\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0006j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u001e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010 \u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000fR\u0019\u0010\"\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000fR\u0019\u0010$\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000fR\u0019\u0010&\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000fR\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u000fR\u0019\u0010*\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b+\u0010\u000fR\u0019\u0010,\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000fR\u0019\u0010.\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000fR\u0019\u00100\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b1\u0010\u000fR\u0019\u00102\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000fR\u0019\u00104\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b5\u0010\u000fR\u0019\u00106\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u000fR\u0019\u00108\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010\r\u001a\u0004\b9\u0010\u000fR\u0019\u0010:\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010\r\u001a\u0004\b;\u0010\u000fR\u0019\u0010<\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010\r\u001a\u0004\b=\u0010\u000fR\u0019\u0010>\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010\r\u001a\u0004\b?\u0010\u000fR\u0019\u0010@\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010\r\u001a\u0004\bA\u0010\u000fR\u0019\u0010B\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010\r\u001a\u0004\bC\u0010\u000fR\u0019\u0010D\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010\r\u001a\u0004\bE\u0010\u000fR\u0019\u0010F\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010\r\u001a\u0004\bG\u0010\u000fR\u0019\u0010H\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010\r\u001a\u0004\bI\u0010\u000fR\u0019\u0010J\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010\r\u001a\u0004\bK\u0010\u000fR\u0019\u0010L\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010\r\u001a\u0004\bM\u0010\u000fR\u0019\u0010N\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010\r\u001a\u0004\bO\u0010\u000fR\u0019\u0010P\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010\r\u001a\u0004\bQ\u0010\u000fR\u0016\u0010R\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\rR\u0016\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\rR\u0016\u0010T\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010\rR\u0016\u0010U\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\rR\u0016\u0010V\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\rR\u0016\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010\rR\u0016\u0010X\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010\rR\u0016\u0010Y\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010\rR\u0016\u0010Z\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010\rR\u0016\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\rR\u0016\u0010\\\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010\rR\u0016\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010\rR\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General$Companion;", "", "", "", "name", "a", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_TIME_FORMAT", LogUtil.I, "getKEY_TIME_FORMAT", "()I", "KEY_DATE_DISPLAY_STYLE", "getKEY_DATE_DISPLAY_STYLE", "KEY_OTHER_CALENDAR", "getKEY_OTHER_CALENDAR", "KEY_WEEKLY_START_TIME", "getKEY_WEEKLY_START_TIME", "KEY_MILEAGE_UNIT", "getKEY_MILEAGE_UNIT", "KEY_HOURLY_ANNOUNCE_SWITCH", "getKEY_HOURLY_ANNOUNCE_SWITCH", "KEY_HOURLY_ANNOUNCE_START_TIME", "getKEY_HOURLY_ANNOUNCE_START_TIME", "KEY_HOURLY_ANNOUNCE_STOP_TIME", "getKEY_HOURLY_ANNOUNCE_STOP_TIME", "KEY_ENABLE_DEVICE", "getKEY_ENABLE_DEVICE", "KEY_DND_MODE", "getKEY_DND_MODE", "KEY_DND_START_TIME", "getKEY_DND_START_TIME", "KEY_DND_STOP_TIME", "getKEY_DND_STOP_TIME", "KEY_WRIST_BRIGHT_IN_DND_MODE", "getKEY_WRIST_BRIGHT_IN_DND_MODE", "KEY_CONN_LOST_REMIND_SWITCH", "getKEY_CONN_LOST_REMIND_SWITCH", "KEY_CONN_LOST_REMIND_START_TIME", "getKEY_CONN_LOST_REMIND_START_TIME", "KEY_CONN_LOST_REMIND_STOP_TIME", "getKEY_CONN_LOST_REMIND_STOP_TIME", "KEY_TEMPERATURE_UNIT", "getKEY_TEMPERATURE_UNIT", "KEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH", "getKEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH", "KEY_LONG_PRESS_SIDE_APP", "getKEY_LONG_PRESS_SIDE_APP", "KEY_LONG_PRESS_UP_APP", "getKEY_LONG_PRESS_UP_APP", "KEY_CLICK_DOWN_APP", "getKEY_CLICK_DOWN_APP", "KEY_CLICK_SELECT_APP", "getKEY_CLICK_SELECT_APP", "KEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH", "getKEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH", "KEY_SMS_DISPLAY_CONTACTS_SWITCH", "getKEY_SMS_DISPLAY_CONTACTS_SWITCH", "KEY_WEIGHT_UNIT", "getKEY_WEIGHT_UNIT", "KEY_NIGHT_MODE", "getKEY_NIGHT_MODE", "KEY_NIGHT_MODE_START_TIME", "getKEY_NIGHT_MODE_START_TIME", "KEY_NIGHT_MODE_STOP_TIME", "getKEY_NIGHT_MODE_STOP_TIME", "KEY_AUTO_OTA_AT_NIGHT_SWITCH", "getKEY_AUTO_OTA_AT_NIGHT_SWITCH", "KEY_DISABLE_HID", "getKEY_DISABLE_HID", "KEY_SLEEP_MODE_SWITCH", "getKEY_SLEEP_MODE_SWITCH", "KEY_SLEEP_MODE_FOR_DISPLAY_SWITCH", "getKEY_SLEEP_MODE_FOR_DISPLAY_SWITCH", "KEY_SLEEP_MODE_SMART_ENABLE_SWITCH", "getKEY_SLEEP_MODE_SMART_ENABLE_SWITCH", "KEY_HID_CONNECT", "getKEY_HID_CONNECT", "DND_MODE_CLOSE", "DND_MODE_DIY", "DND_MODE_SMART", "GROUP_VERSION", "KEY_INCOMING_CALL_DELAY_TIME", "MILEAGE_UNIT_METRIC", "MILEAGE_UNIT_MILE", "NIGHT_MODE_CLOSE", "NIGHT_MODE_SUN_SET", "NIGHT_MODE_TIMER", "TIME_FORMAT_12_HOUR", "TIME_FORMAT_24_HOUR", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(int i, String str) {
            getHashMap().put(Integer.valueOf(i), str);
            return i;
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return General.f;
        }

        public final int getKEY_AUTO_OTA_AT_NIGHT_SWITCH() {
            return General.I;
        }

        public final int getKEY_CLICK_DOWN_APP() {
            return General.A;
        }

        public final int getKEY_CLICK_SELECT_APP() {
            return General.B;
        }

        public final int getKEY_CONN_LOST_REMIND_START_TIME() {
            return General.u;
        }

        public final int getKEY_CONN_LOST_REMIND_STOP_TIME() {
            return General.v;
        }

        public final int getKEY_CONN_LOST_REMIND_SWITCH() {
            return General.t;
        }

        public final int getKEY_DATE_DISPLAY_STYLE() {
            return General.h;
        }

        public final int getKEY_DISABLE_HID() {
            return General.J;
        }

        public final int getKEY_DND_MODE() {
            return General.p;
        }

        public final int getKEY_DND_START_TIME() {
            return General.q;
        }

        public final int getKEY_DND_STOP_TIME() {
            return General.r;
        }

        public final int getKEY_ENABLE_DEVICE() {
            return General.o;
        }

        public final int getKEY_HID_CONNECT() {
            return General.N;
        }

        public final int getKEY_HOURLY_ANNOUNCE_START_TIME() {
            return General.m;
        }

        public final int getKEY_HOURLY_ANNOUNCE_STOP_TIME() {
            return General.n;
        }

        public final int getKEY_HOURLY_ANNOUNCE_SWITCH() {
            return General.l;
        }

        public final int getKEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH() {
            return General.C;
        }

        public final int getKEY_LONG_PRESS_SIDE_APP() {
            return General.y;
        }

        public final int getKEY_LONG_PRESS_UP_APP() {
            return General.z;
        }

        public final int getKEY_MILEAGE_UNIT() {
            return General.k;
        }

        public final int getKEY_NIGHT_MODE() {
            return General.F;
        }

        public final int getKEY_NIGHT_MODE_START_TIME() {
            return General.G;
        }

        public final int getKEY_NIGHT_MODE_STOP_TIME() {
            return General.H;
        }

        public final int getKEY_OTHER_CALENDAR() {
            return General.i;
        }

        public final int getKEY_SLEEP_MODE_FOR_DISPLAY_SWITCH() {
            return General.L;
        }

        public final int getKEY_SLEEP_MODE_SMART_ENABLE_SWITCH() {
            return General.M;
        }

        public final int getKEY_SLEEP_MODE_SWITCH() {
            return General.K;
        }

        public final int getKEY_SMS_DISPLAY_CONTACTS_SWITCH() {
            return General.D;
        }

        public final int getKEY_TEMPERATURE_UNIT() {
            return General.w;
        }

        public final int getKEY_TIME_FORMAT() {
            return General.g;
        }

        public final int getKEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH() {
            return General.x;
        }

        public final int getKEY_WEEKLY_START_TIME() {
            return General.j;
        }

        public final int getKEY_WEIGHT_UNIT() {
            return General.E;
        }

        public final int getKEY_WRIST_BRIGHT_IN_DND_MODE() {
            return General.s;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f = new HashMap<>();
        g = companion.a(1, "时间制式");
        h = companion.a(2, "多语言日期显示样式");
        i = companion.a(3, "其它历法");
        j = companion.a(4, "每周开始时间");
        k = companion.a(5, "长度单位");
        l = companion.a(6, "整点报时开关");
        m = companion.a(7, "整点报时起始时间");
        n = companion.a(8, "整点报时结束时间");
        o = companion.a(9, "设备启用开关");
        p = companion.a(10, "勿扰模式");
        q = companion.a(11, "勿扰开始时间");
        r = companion.a(12, "勿扰结束时间");
        s = companion.a(13, "勿扰模式下抬腕亮屏开关");
        t = companion.a(14, "断连提醒开关");
        u = companion.a(15, "断连提醒开始时间");
        v = companion.a(16, "断连提醒结束时间");
        KEY_INCOMING_CALL_DELAY_TIME = companion.a(17, "来电延迟时间（单位：秒）");
        w = companion.a(18, "温度单位");
        x = companion.a(19, "时间格式跟随手机");
        y = companion.a(20, "长按侧键启动的应用");
        z = companion.a(21, "长按上键启动的应用");
        A = companion.a(22, "点按下键启动的应用");
        B = companion.a(23, "点按选择键启动的应用");
        C = companion.a(24, "来电显示联系人开关");
        D = companion.a(25, "短信显示联系人开关");
        E = companion.a(26, "体重单位");
        F = companion.a(27, "夜间模式");
        G = companion.a(28, "夜间模式开始时间");
        H = companion.a(29, "夜间模式结束时间");
        I = companion.a(30, "夜间自动升级开关");
        J = companion.a(31, "禁用手机遥控拍照");
        K = companion.a(32, "睡眠模式开关");
        L = companion.a(33, "睡眠屏幕开关");
        M = companion.a(34, "睡眠模式智能启用开关");
        N = companion.a(35, "手机端Hid连接状态");
    }

    @Nullable
    public final Boolean getAutoOtaAtNightSwitch() {
        return getBoolean(I);
    }

    @Nullable
    public final StringEnum getClickDownApp() {
        return getStringEnum(A);
    }

    @Nullable
    public final StringEnum getClickSelectApp() {
        return getStringEnum(B);
    }

    @Nullable
    public final Time getConnLostRemindStartTime() {
        return getTime(u);
    }

    @Nullable
    public final Time getConnLostRemindStopTime() {
        return getTime(v);
    }

    @Nullable
    public final Boolean getConnLostRemindSwitch() {
        return getBoolean(t);
    }

    @Nullable
    public final StringData getDateDisplayStyle() {
        return getString(h);
    }

    @Nullable
    public final Boolean getDisableHid() {
        return getBoolean(J);
    }

    @Nullable
    public final EnumData getDndMode() {
        return getEnum(p);
    }

    @Nullable
    public final Time getDndStartTime() {
        return getTime(q);
    }

    @Nullable
    public final Time getDndStopTime() {
        return getTime(r);
    }

    @Nullable
    public final Boolean getEnableDevice() {
        return getBoolean(o);
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
        return getBoolean(N);
    }

    @Nullable
    public final Time getHourlyAnnounceStartTime() {
        return getTime(m);
    }

    @Nullable
    public final Time getHourlyAnnounceStopTime() {
        return getTime(n);
    }

    @Nullable
    public final Boolean getHourlyAnnounceSwitch() {
        return getBoolean(l);
    }

    @Nullable
    public final Boolean getInComingCallDisplayContactsSwitch() {
        return getBoolean(C);
    }

    @Nullable
    public final IntData getIncomingCallDelayTime() {
        return getInt(KEY_INCOMING_CALL_DELAY_TIME);
    }

    @Nullable
    public final StringEnum getLongPressSideApp() {
        return getStringEnum(y);
    }

    @Nullable
    public final StringEnum getLongPressUpApp() {
        return getStringEnum(z);
    }

    @Nullable
    public final EnumData getMileageUnit() {
        return getEnum(k);
    }

    @Nullable
    public final EnumData getNightMode() {
        return getEnum(F);
    }

    @Nullable
    public final Time getNightModeStartTime() {
        return getTime(G);
    }

    @Nullable
    public final Time getNightModeStopTime() {
        return getTime(H);
    }

    @Nullable
    public final EnumData getOtherCalendar() {
        return getEnum(i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Nullable
    public final Boolean getSleepModeForDisplaySwitch() {
        return getBoolean(L);
    }

    @Nullable
    public final Boolean getSleepModeSmartEnableSwitch() {
        return getBoolean(M);
    }

    @Nullable
    public final Boolean getSleepModeSwitch() {
        return getBoolean(K);
    }

    @Nullable
    public final Boolean getSmsDisplayContactsSwitch() {
        return getBoolean(D);
    }

    @Nullable
    public final EnumData getTemperatureUnit() {
        return getEnum(w);
    }

    @Nullable
    public final EnumData getTimeFormat() {
        return getEnum(g);
    }

    @Nullable
    public final Boolean getTimeFormatFollowMobilePhoneSwitch() {
        return getBoolean(x);
    }

    @Nullable
    public final EnumData getWeeklyStartTime() {
        return getEnum(j);
    }

    @Nullable
    public final EnumData getWeightUnit() {
        return getEnum(E);
    }

    @Nullable
    public final Boolean getWristBrightInDNDSwitch() {
        return getBoolean(s);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    public final void setAutoOtaAtNightSwitch(@Nullable Boolean bool) {
        setBoolean(bool, I);
    }

    public final void setClickDownApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, A);
    }

    public final void setClickSelectApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, B);
    }

    public final void setConnLostRemindStartTime(@Nullable Time time) {
        setTime(time, u);
    }

    public final void setConnLostRemindStopTime(@Nullable Time time) {
        setTime(time, v);
    }

    public final void setConnLostRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, t);
    }

    public final void setDateDisplayStyle(@Nullable StringData stringData) {
        setString(stringData, h);
    }

    public final void setDisableHid(@Nullable Boolean bool) {
        setBoolean(bool, J);
    }

    public final void setDndMode(@Nullable EnumData enumData) {
        setEnum(enumData, p);
    }

    public final void setDndStartTime(@Nullable Time time) {
        setTime(time, q);
    }

    public final void setDndStopTime(@Nullable Time time) {
        setTime(time, r);
    }

    public final void setEnableDevice(@Nullable Boolean bool) {
        setBoolean(bool, o);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setHidConnect(@Nullable Boolean bool) {
        setBoolean(bool, N);
    }

    public final void setHourlyAnnounceStartTime(@Nullable Time time) {
        setTime(time, m);
    }

    public final void setHourlyAnnounceStopTime(@Nullable Time time) {
        setTime(time, n);
    }

    public final void setHourlyAnnounceSwitch(@Nullable Boolean bool) {
        setBoolean(bool, l);
    }

    public final void setInComingCallDisplayContactsSwitch(@Nullable Boolean bool) {
        setBoolean(bool, C);
    }

    public final void setIncomingCallDelayTime(@Nullable IntData intData) {
        setInt(intData, KEY_INCOMING_CALL_DELAY_TIME);
    }

    public final void setLongPressSideApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, y);
    }

    public final void setLongPressUpApp(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, z);
    }

    public final void setMileageUnit(@Nullable EnumData enumData) {
        setEnum(enumData, k);
    }

    public final void setNightMode(@Nullable EnumData enumData) {
        setEnum(enumData, F);
    }

    public final void setNightModeStartTime(@Nullable Time time) {
        setTime(time, G);
    }

    public final void setNightModeStopTime(@Nullable Time time) {
        setTime(time, H);
    }

    public final void setOtherCalendar(@Nullable EnumData enumData) {
        setEnum(enumData, i);
    }

    public final void setSleepModeForDisplaySwitch(@Nullable Boolean bool) {
        setBoolean(bool, L);
    }

    public final void setSleepModeSmartEnableSwitch(@Nullable Boolean bool) {
        setBoolean(bool, M);
    }

    public final void setSleepModeSwitch(@Nullable Boolean bool) {
        setBoolean(bool, K);
    }

    public final void setSmsDisplayContactsSwitch(@Nullable Boolean bool) {
        setBoolean(bool, D);
    }

    public final void setTemperatureUnit(@Nullable EnumData enumData) {
        setEnum(enumData, w);
    }

    public final void setTimeFormat(@Nullable EnumData enumData) {
        setEnum(enumData, g);
    }

    public final void setTimeFormatFollowMobilePhoneSwitch(@Nullable Boolean bool) {
        setBoolean(bool, x);
    }

    public final void setWeeklyStartTime(@Nullable EnumData enumData) {
        setEnum(enumData, j);
    }

    public final void setWeightUnit(@Nullable EnumData enumData) {
        setEnum(enumData, E);
    }

    public final void setWristBrightInDNDSwitch(@Nullable Boolean bool) {
        setBoolean(bool, s);
    }
}
