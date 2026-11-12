package com.huami.bluetooth.profile.channel.module.settings.entity.health;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Int32Data;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0001\u007fB\t\b\u0002¢\u0006\u0004\b}\u0010~J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001c\u0010\f\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u00020\u00058\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010.\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R(\u00101\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R(\u00104\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R(\u00107\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R(\u0010:\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R(\u0010=\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R(\u0010@\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R(\u0010C\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R(\u0010F\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR(\u0010I\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R(\u0010O\u001a\u0004\u0018\u00010J2\b\u0010\u001a\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010R\u001a\u0004\u0018\u00010J2\b\u0010\u001a\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NR(\u0010U\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010(\"\u0004\bT\u0010*R(\u0010X\u001a\u0004\u0018\u00010J2\b\u0010\u001a\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010L\"\u0004\bW\u0010NR(\u0010[\u001a\u0004\u0018\u00010J2\b\u0010\u001a\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR(\u0010^\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010(\"\u0004\b]\u0010*R(\u0010d\u001a\u0004\u0018\u00010_2\b\u0010\u001a\u001a\u0004\u0018\u00010_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010j\u001a\u0004\u0018\u00010e2\b\u0010\u001a\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR(\u0010m\u001a\u0004\u0018\u00010e2\b\u0010\u001a\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR(\u0010p\u001a\u0004\u0018\u00010e2\b\u0010\u001a\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010g\"\u0004\bo\u0010iR(\u0010s\u001a\u0004\u0018\u00010e2\b\u0010\u001a\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010g\"\u0004\br\u0010iR(\u0010v\u001a\u0004\u0018\u00010e2\b\u0010\u001a\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010g\"\u0004\bu\u0010iR(\u0010y\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010(\"\u0004\bx\u0010*R(\u0010|\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010\u001c\"\u0004\b{\u0010\u001e¨\u0006\u0080\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "c", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", "e", LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getHrAllayDetectionFrequency", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setHrAllayDetectionFrequency", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "hrAllayDetectionFrequency", "getHrTooHighRemindValue", "setHrTooHighRemindValue", "hrTooHighRemindValue", "getHrTooLowRemindValue", "setHrTooLowRemindValue", "hrTooLowRemindValue", "", "getHrActivityMonitorSwitch", "()Ljava/lang/Boolean;", "setHrActivityMonitorSwitch", "(Ljava/lang/Boolean;)V", "hrActivityMonitorSwitch", "getHrAdvertisementInActiveSwitch", "setHrAdvertisementInActiveSwitch", "hrAdvertisementInActiveSwitch", "getScientificSleepSwitch", "setScientificSleepSwitch", "scientificSleepSwitch", "getOsaSwitch", "setOsaSwitch", "osaSwitch", "getAllDayPressureSwitch", "setAllDayPressureSwitch", "allDayPressureSwitch", "getRelievePressureRemindSwitch", "setRelievePressureRemindSwitch", "relievePressureRemindSwitch", "getHeartHealthyMonitorSwitch", "setHeartHealthyMonitorSwitch", "heartHealthyMonitorSwitch", "getHeartHealthyRemindDndInSleepSwitch", "setHeartHealthyRemindDndInSleepSwitch", "heartHealthyRemindDndInSleepSwitch", "getSmartSpo2MonitorSwitch", "setSmartSpo2MonitorSwitch", "smartSpo2MonitorSwitch", "getSpo2LowLevelRemindValue", "setSpo2LowLevelRemindValue", "spo2LowLevelRemindValue", "getStandUpRemindSwitch", "setStandUpRemindSwitch", "standUpRemindSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getStandUpRemindStartTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setStandUpRemindStartTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "standUpRemindStartTime", "getStandUpRemindStopTime", "setStandUpRemindStopTime", "standUpRemindStopTime", "getMiddyRestDndSwitch", "setMiddyRestDndSwitch", "middyRestDndSwitch", "getMiddyRestStartTime", "setMiddyRestStartTime", "middyRestStartTime", "getMiddyRestStopTime", "setMiddyRestStopTime", "middyRestStopTime", "getTargetAchieveRemindSwitch", "setTargetAchieveRemindSwitch", "targetAchieveRemindSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntPrimaryData;", "getStepTarget", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntPrimaryData;", "setStepTarget", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntPrimaryData;)V", "stepTarget", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getCalorieTarget", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setCalorieTarget", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "calorieTarget", "getWeightTarget", "setWeightTarget", "weightTarget", "getSleepTarget", "setSleepTarget", "sleepTarget", "getStandTarget", "setStandTarget", "standTarget", "getActivityTarget", "setActivityTarget", "activityTarget", "getBloodPressureMonitorSwitch", "setBloodPressureMonitorSwitch", "bloodPressureMonitorSwitch", "getActivityMode", "setActivityMode", "activityMode", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Health extends Settings implements Serializable {
    private static final int A;
    private static final int B;
    private static final int C;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final int D;
    private static final int E;
    private static final int F;
    private static final int G;
    public static final int GROUP_VERSION_1 = 1;
    public static final int GROUP_VERSION_2 = 2;
    private static final int H;
    private static final int I;
    private static final int J = 50000;

    @NotNull
    private static final String f = "Health";

    @NotNull
    private static final HashMap<Integer, String> g;
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
    @NotNull
    private final SettingsGroupType groupType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String settingsGroupName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int groupVersion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bH\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bS\u0010TJ\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J'\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR5\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u001e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010 \u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0019\u0010\"\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u0019\u0010$\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015R\u0019\u0010&\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015R\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0015R\u0019\u0010*\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u0015R\u0019\u0010,\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010\u0015R\u0019\u0010.\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u0010\u0015R\u0019\u00100\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b1\u0010\u0015R\u0019\u00102\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b3\u0010\u0015R\u0019\u00104\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u0010\u0015R\u0019\u00106\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b7\u0010\u0015R\u0019\u00108\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010\u0013\u001a\u0004\b9\u0010\u0015R\u0019\u0010:\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010\u0013\u001a\u0004\b;\u0010\u0015R\u0019\u0010<\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010\u0013\u001a\u0004\b=\u0010\u0015R\u0019\u0010>\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010\u0013\u001a\u0004\b?\u0010\u0015R\u0019\u0010@\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010\u0013\u001a\u0004\bA\u0010\u0015R\u0019\u0010B\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010\u0013\u001a\u0004\bC\u0010\u0015R\u0019\u0010D\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010\u0013\u001a\u0004\bE\u0010\u0015R\u0019\u0010F\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010\u0013\u001a\u0004\bG\u0010\u0015R\u0019\u0010H\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010\u0013\u001a\u0004\bI\u0010\u0015R\u0019\u0010J\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010\u0013\u001a\u0004\bK\u0010\u0015R\u0016\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0013R\u0016\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\u0013R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010\u0013R\u0016\u0010O\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health$Companion;", "", "", "", "name", "a", "", "stepTarget", "settingsVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "newInstance", "(Ljava/lang/Long;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_HR_ALL_DAY_DETECTION_FREQUENCY", LogUtil.I, "getKEY_HR_ALL_DAY_DETECTION_FREQUENCY", "()I", "KEY_HR_TOO_HIGH_REMIND_VALUE", "getKEY_HR_TOO_HIGH_REMIND_VALUE", "KEY_HR_TOO_LOW_REMIND_VALUE", "getKEY_HR_TOO_LOW_REMIND_VALUE", "KEY_HR_ACTIVITY_MONITOR_SWITCH", "getKEY_HR_ACTIVITY_MONITOR_SWITCH", "KEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH", "getKEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH", "KEY_SCIENTIFIC_SLEEP_SWITCH", "getKEY_SCIENTIFIC_SLEEP_SWITCH", "KEY_OSA_SWITCH", "getKEY_OSA_SWITCH", "KEY_ALL_DAY_PRESSURE_SWITCH", "getKEY_ALL_DAY_PRESSURE_SWITCH", "KEY_RELIEVE_PRESSURE_REMIND_SWITCH", "getKEY_RELIEVE_PRESSURE_REMIND_SWITCH", "KEY_HEART_HEALTHY_MONITOR_SWITCH", "getKEY_HEART_HEALTHY_MONITOR_SWITCH", "KEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH", "getKEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH", "KEY_SMART_SPO2_MONITOR_SWITCH", "getKEY_SMART_SPO2_MONITOR_SWITCH", "KEY_SPO2_LOW_LEVEL_REMIND_VALUE", "getKEY_SPO2_LOW_LEVEL_REMIND_VALUE", "KEY_STAND_UP_REMIND_SWITCH", "getKEY_STAND_UP_REMIND_SWITCH", "KEY_STAND_UP_REMIND_START_TIME", "getKEY_STAND_UP_REMIND_START_TIME", "KEY_STAND_UP_REMIND_STOP_TIME", "getKEY_STAND_UP_REMIND_STOP_TIME", "KEY_MIDDY_REST_DND_SWITCH", "getKEY_MIDDY_REST_DND_SWITCH", "KEY_MIDDY_REST_START_TIME", "getKEY_MIDDY_REST_START_TIME", "KEY_MIDDY_REST_STOP_TIME", "getKEY_MIDDY_REST_STOP_TIME", "KEY_TARGET_ACHIEVE_REMIND_SWITCH", "getKEY_TARGET_ACHIEVE_REMIND_SWITCH", "KEY_STEP_TARGET", "getKEY_STEP_TARGET", "KEY_CALORIE_TARGET", "getKEY_CALORIE_TARGET", "KEY_WEIGHT_TARGET", "getKEY_WEIGHT_TARGET", "KEY_SLEEP_TARGET", "getKEY_SLEEP_TARGET", "KEY_STAND_TARGET", "getKEY_STAND_TARGET", "KEY_ACTIVITY_TARGET", "getKEY_ACTIVITY_TARGET", "KEY_SLEEP_BLOOD_PRESSURE_MONITOR", "getKEY_SLEEP_BLOOD_PRESSURE_MONITOR", "KEY_ACTIVITY_MODE", "getKEY_ACTIVITY_MODE", "GROUP_VERSION_1", "GROUP_VERSION_2", "MAX_STEP", "TAG", "Ljava/lang/String;", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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

        public static /* synthetic */ Health newInstance$default(Companion companion, Long l, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.newInstance(l, num);
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return Health.g;
        }

        public final int getKEY_ACTIVITY_MODE() {
            return Health.I;
        }

        public final int getKEY_ACTIVITY_TARGET() {
            return Health.G;
        }

        public final int getKEY_ALL_DAY_PRESSURE_SWITCH() {
            return Health.o;
        }

        public final int getKEY_CALORIE_TARGET() {
            return Health.C;
        }

        public final int getKEY_HEART_HEALTHY_MONITOR_SWITCH() {
            return Health.q;
        }

        public final int getKEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH() {
            return Health.r;
        }

        public final int getKEY_HR_ACTIVITY_MONITOR_SWITCH() {
            return Health.k;
        }

        public final int getKEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH() {
            return Health.l;
        }

        public final int getKEY_HR_ALL_DAY_DETECTION_FREQUENCY() {
            return Health.h;
        }

        public final int getKEY_HR_TOO_HIGH_REMIND_VALUE() {
            return Health.i;
        }

        public final int getKEY_HR_TOO_LOW_REMIND_VALUE() {
            return Health.j;
        }

        public final int getKEY_MIDDY_REST_DND_SWITCH() {
            return Health.x;
        }

        public final int getKEY_MIDDY_REST_START_TIME() {
            return Health.y;
        }

        public final int getKEY_MIDDY_REST_STOP_TIME() {
            return Health.z;
        }

        public final int getKEY_OSA_SWITCH() {
            return Health.n;
        }

        public final int getKEY_RELIEVE_PRESSURE_REMIND_SWITCH() {
            return Health.p;
        }

        public final int getKEY_SCIENTIFIC_SLEEP_SWITCH() {
            return Health.m;
        }

        public final int getKEY_SLEEP_BLOOD_PRESSURE_MONITOR() {
            return Health.H;
        }

        public final int getKEY_SLEEP_TARGET() {
            return Health.E;
        }

        public final int getKEY_SMART_SPO2_MONITOR_SWITCH() {
            return Health.s;
        }

        public final int getKEY_SPO2_LOW_LEVEL_REMIND_VALUE() {
            return Health.t;
        }

        public final int getKEY_STAND_TARGET() {
            return Health.F;
        }

        public final int getKEY_STAND_UP_REMIND_START_TIME() {
            return Health.v;
        }

        public final int getKEY_STAND_UP_REMIND_STOP_TIME() {
            return Health.w;
        }

        public final int getKEY_STAND_UP_REMIND_SWITCH() {
            return Health.u;
        }

        public final int getKEY_STEP_TARGET() {
            return Health.B;
        }

        public final int getKEY_TARGET_ACHIEVE_REMIND_SWITCH() {
            return Health.A;
        }

        public final int getKEY_WEIGHT_TARGET() {
            return Health.D;
        }

        @Nullable
        public final Health newInstance(@Nullable Long stepTarget, @Nullable Integer settingsVersion) {
            IntPrimaryData intData;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (stepTarget == null) {
                return new Health(defaultConstructorMarker);
            }
            if (settingsVersion == null) {
                Debug.fi(Health.f, "can't set stepTarget without settingsVersion!");
                return null;
            }
            Health health = new Health(defaultConstructorMarker);
            if (settingsVersion.intValue() >= 3) {
                if (stepTarget.longValue() > 50000) {
                    Debug.fi(Health.f, "value " + stepTarget + " too big!");
                    return null;
                }
                intData = new Int32Data((int) stepTarget.longValue());
            } else {
                if (stepTarget.longValue() > 32767) {
                    Debug.fi(Health.f, "value " + stepTarget + " too big!");
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
        g = map;
        map.put(1, "全天心率检测频率");
        h = 1;
        map.put(2, "高心率提醒值");
        i = 2;
        map.put(3, "低心率提醒值");
        j = 3;
        map.put(4, "活动心率监测开关");
        k = 4;
        map.put(5, "运动/活动心率广播");
        l = 5;
        map.put(17, "科学睡眠开关");
        m = 17;
        map.put(18, "睡眠血氧监测开关（睡眠呼吸质量监测）");
        n = 18;
        map.put(19, "全天压力监测开关");
        o = 19;
        map.put(20, "舒压提醒开关");
        p = 20;
        map.put(33, "心脏健康监测开关");
        q = 33;
        map.put(34, "（心脏健康监测）睡眠勿扰开关");
        r = 34;
        map.put(49, "智能血氧监测开关");
        s = 49;
        map.put(50, "低血氧预警值");
        t = 50;
        map.put(65, "站立提醒开关");
        u = 65;
        map.put(66, "站立提醒开始时间");
        v = 66;
        map.put(67, "站立提醒结束时间");
        w = 67;
        map.put(68, "（站立提醒）午休免打扰开关");
        x = 68;
        map.put(69, "（站立提醒）午休免打扰开始时间");
        y = 69;
        map.put(70, "（站立提醒）午休免打扰结束时间");
        z = 70;
        map.put(81, "总达标提醒开关");
        A = 81;
        map.put(82, "目标步数");
        B = 82;
        map.put(83, "目标卡路里");
        C = 83;
        D = companion.a(84, "体重目标，单位公斤");
        E = companion.a(85, "睡眠目标，分钟数");
        F = companion.a(86, "站立目标，单位：次");
        G = companion.a(87, "中高强度活动目标，单位：分钟");
        H = companion.a(97, "睡眠中血压自动测量开关");
        I = companion.a(113, "站立/中高强度切换");
    }

    private Health() {
        this.groupType = SettingsGroupType.HEALTH;
        this.settingsGroupName = f;
        this.groupVersion = 1;
    }

    public /* synthetic */ Health(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final EnumData getActivityMode() {
        return getEnum(I);
    }

    @Nullable
    public final IntData getActivityTarget() {
        return getInt(G);
    }

    @Nullable
    public final Boolean getAllDayPressureSwitch() {
        return getBoolean(o);
    }

    @Nullable
    public final Boolean getBloodPressureMonitorSwitch() {
        return getBoolean(H);
    }

    @Nullable
    public final IntData getCalorieTarget() {
        return getInt(C);
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
        return getBoolean(q);
    }

    @Nullable
    public final Boolean getHeartHealthyRemindDndInSleepSwitch() {
        return getBoolean(r);
    }

    @Nullable
    public final Boolean getHrActivityMonitorSwitch() {
        return getBoolean(k);
    }

    @Nullable
    public final Boolean getHrAdvertisementInActiveSwitch() {
        return getBoolean(l);
    }

    @Nullable
    public final EnumData getHrAllayDetectionFrequency() {
        return getEnum(h);
    }

    @Nullable
    public final EnumData getHrTooHighRemindValue() {
        return getEnum(i);
    }

    @Nullable
    public final EnumData getHrTooLowRemindValue() {
        return getEnum(j);
    }

    @Nullable
    public final Boolean getMiddyRestDndSwitch() {
        return getBoolean(x);
    }

    @Nullable
    public final Time getMiddyRestStartTime() {
        return getTime(y);
    }

    @Nullable
    public final Time getMiddyRestStopTime() {
        return getTime(z);
    }

    @Nullable
    public final Boolean getOsaSwitch() {
        return getBoolean(n);
    }

    @Nullable
    public final Boolean getRelievePressureRemindSwitch() {
        return getBoolean(p);
    }

    @Nullable
    public final Boolean getScientificSleepSwitch() {
        return getBoolean(m);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Nullable
    public final IntData getSleepTarget() {
        return getInt(E);
    }

    @Nullable
    public final Boolean getSmartSpo2MonitorSwitch() {
        return getBoolean(s);
    }

    @Nullable
    public final EnumData getSpo2LowLevelRemindValue() {
        return getEnum(t);
    }

    @Nullable
    public final IntData getStandTarget() {
        return getInt(F);
    }

    @Nullable
    public final Time getStandUpRemindStartTime() {
        return getTime(v);
    }

    @Nullable
    public final Time getStandUpRemindStopTime() {
        return getTime(w);
    }

    @Nullable
    public final Boolean getStandUpRemindSwitch() {
        return getBoolean(u);
    }

    @Nullable
    public final IntPrimaryData getStepTarget() {
        return getIntPrimaryData(B);
    }

    @Nullable
    public final Boolean getTargetAchieveRemindSwitch() {
        return getBoolean(A);
    }

    @Nullable
    public final IntData getWeightTarget() {
        return getInt(D);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return g.get(Integer.valueOf(key));
    }

    public final void setActivityMode(@Nullable EnumData enumData) {
        setEnum(enumData, I);
    }

    public final void setActivityTarget(@Nullable IntData intData) {
        setInt(intData, G);
    }

    public final void setAllDayPressureSwitch(@Nullable Boolean bool) {
        setBoolean(bool, o);
    }

    public final void setBloodPressureMonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, H);
    }

    public final void setCalorieTarget(@Nullable IntData intData) {
        setInt(intData, C);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setHeartHealthyMonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, q);
    }

    public final void setHeartHealthyRemindDndInSleepSwitch(@Nullable Boolean bool) {
        setBoolean(bool, r);
    }

    public final void setHrActivityMonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, k);
    }

    public final void setHrAdvertisementInActiveSwitch(@Nullable Boolean bool) {
        setBoolean(bool, l);
    }

    public final void setHrAllayDetectionFrequency(@Nullable EnumData enumData) {
        setEnum(enumData, h);
    }

    public final void setHrTooHighRemindValue(@Nullable EnumData enumData) {
        setEnum(enumData, i);
    }

    public final void setHrTooLowRemindValue(@Nullable EnumData enumData) {
        setEnum(enumData, j);
    }

    public final void setMiddyRestDndSwitch(@Nullable Boolean bool) {
        setBoolean(bool, x);
    }

    public final void setMiddyRestStartTime(@Nullable Time time) {
        setTime(time, y);
    }

    public final void setMiddyRestStopTime(@Nullable Time time) {
        setTime(time, z);
    }

    public final void setOsaSwitch(@Nullable Boolean bool) {
        setBoolean(bool, n);
    }

    public final void setRelievePressureRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, p);
    }

    public final void setScientificSleepSwitch(@Nullable Boolean bool) {
        setBoolean(bool, m);
    }

    public final void setSleepTarget(@Nullable IntData intData) {
        setInt(intData, E);
    }

    public final void setSmartSpo2MonitorSwitch(@Nullable Boolean bool) {
        setBoolean(bool, s);
    }

    public final void setSpo2LowLevelRemindValue(@Nullable EnumData enumData) {
        setEnum(enumData, t);
    }

    public final void setStandTarget(@Nullable IntData intData) {
        setInt(intData, F);
    }

    public final void setStandUpRemindStartTime(@Nullable Time time) {
        setTime(time, v);
    }

    public final void setStandUpRemindStopTime(@Nullable Time time) {
        setTime(time, w);
    }

    public final void setStandUpRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, u);
    }

    public final void setStepTarget(@Nullable IntPrimaryData intPrimaryData) {
        setInt(intPrimaryData, B);
    }

    public final void setTargetAchieveRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, A);
    }

    public final void setWeightTarget(@Nullable IntData intData) {
        setInt(intData, D);
    }
}
