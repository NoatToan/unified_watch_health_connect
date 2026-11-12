package com.xiaomi.hm.health.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.activity.ChangeSportGoalActivity;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.GesScreenActivity;
import com.xiaomi.hm.health.device.HMAppSortActivity;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMShotcutAppSortActivity;
import com.xiaomi.hm.health.device.HMWeatherSettingActivity;
import com.xiaomi.hm.health.device.NightModeActivity;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.health.ui.HealthDetectSettingActivity;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.ui.smartplay.AppNotificationAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.AvoidDisturbActivity;
import com.xiaomi.hm.health.ui.smartplay.HuamiOSAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.IdBroadcastActivity;
import com.xiaomi.hm.health.ui.smartplay.IncomingCallAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.PhoneAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.ReachGoalRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.SMAlertByNotificationActivity;
import com.xiaomi.hm.health.ui.smartplay.ScreenUnlockActivity;
import com.xiaomi.hm.health.ui.smartplay.SportHRBroadcastActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitAlertActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b3\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0007J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u000eR\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u000eR\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u000eR\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u000eR\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u000eR\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u000eR\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u000eR\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u000eR\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u000eR\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\u000e¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/utils/BTConnectionAnalyticStatusHelper;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "", "value", "", "a", "registerEventBus", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "Lcom/xiaomi/hm/health/eventbus/EventBluetooth;", "Ljava/lang/String;", "TAG", "b", "CONNECTION_STATUS", "c", "CONNECTION_BROADCAST", GoogleApiAvailabilityLight.a, "CONNECTION_HR_BROADCAST", "e", "CONNECTION_LIFT_WRIST", "f", "CONNECTION_HR", "g", "CONNECTION_NIGHT_MODE", "h", "CONNECTION_SCREEN_UNLOCK", "i", "CONNECTION_INCOMING_CALL", z.j, "CONNECTION_EVENT_REMINDER", hl.k, "CONNECTION_ALARM", "l", "CONNECTION_APP_ALERTS", "m", "CONNECTION_IDLE_ALERTS", GoogleApiAvailabilityLight.b, "CONNECTION_INCOMING_SMS", "o", "CONNECTION_GOAL_NOTI", com.google.android.exoplayer2.text.ttml.b.r, "CONNECTION_CLOCK_PHONE", DTransferConstants.SEARCH_KEY, "CONNECTION_CLOCK_NOT_DISTURB", "r", "CONNECTION_CLOCK_ACTIVITY_GOAL", SOAP.XMLNS, "CONNECTION_APP_SORT", "t", "CONNECTION_QUICK_SET", "u", "CONNECTION_WEATHERSET", "v", "VALUE_BT_OFF", "w", "VALUE_CONN_FAIL", "x", "VALUE_SYNC_FAIL", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BTConnectionAnalyticStatusHelper {

    @NotNull
    public static final BTConnectionAnalyticStatusHelper INSTANCE = new BTConnectionAnalyticStatusHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BTConnectionAnalyticStatusHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_STATUS = "Connection_Status";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_BROADCAST = "Connection_Broadcast";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_HR_BROADCAST = "Connection_HeartRate_Broadcast";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_LIFT_WRIST = "Connection_Liftwrist";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_HR = "Connection_HeartRate";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_NIGHT_MODE = "Connection_NightMode";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_SCREEN_UNLOCK = "Connection_ScreenUnlock";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_INCOMING_CALL = "Connection_IncomingCall";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_EVENT_REMINDER = "Connection_EventReminder";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_ALARM = "Connection_Alarm";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_APP_ALERTS = "Connection_APPAlerts";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_IDLE_ALERTS = "Connection_IdleAlerts";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_INCOMING_SMS = "Connection_IncomingSMS";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_GOAL_NOTI = "Connection_GoalNotification";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_CLOCK_PHONE = "Connection_Clock_Phone";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_CLOCK_NOT_DISTURB = "Connection_Not_Disturb";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_CLOCK_ACTIVITY_GOAL = "Connection_ActivityGoal";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_APP_SORT = "Connection_Applicationset";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_QUICK_SET = "Connection_Quickset";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private static final String CONNECTION_WEATHERSET = "Connection_Weatherset";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private static final String VALUE_BT_OFF = "Bluetooth_Not_Turnon";

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private static final String VALUE_CONN_FAIL = "Connection_Fail";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private static final String VALUE_SYNC_FAIL = "Sync_Fail";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "doBTStatusAnalytics";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "event: " + this.a + ", value: " + this.b;
        }
    }

    private BTConnectionAnalyticStatusHelper() {
    }

    private final void a(HMDeviceType deviceType, String value) {
        HMLog.info(TAG, a.a);
        Activity topActivity = BraceletForegroundCallBack.getTopActivity();
        if (topActivity == null) {
            return;
        }
        String str = null;
        if (topActivity instanceof MainTabActivity) {
            if (deviceType == null || HMDeviceManager.getInstance().getMajorDeviceType() == deviceType) {
                str = CONNECTION_STATUS;
            }
        } else if (topActivity instanceof IdBroadcastActivity) {
            if (deviceType == null || HMDeviceType.MILI == deviceType) {
                str = CONNECTION_BROADCAST;
            }
        } else if (topActivity instanceof SportHRBroadcastActivity) {
            if (deviceType == null || HMDeviceType.MILI == deviceType) {
                str = CONNECTION_HR_BROADCAST;
            }
        } else if (topActivity instanceof GesScreenActivity) {
            if (deviceType == null || HMDeviceType.MILI == deviceType) {
                str = CONNECTION_LIFT_WRIST;
            }
        } else if (topActivity instanceof HealthDetectSettingActivity) {
            if (deviceType == null || HMDeviceType.MILI == deviceType) {
                str = CONNECTION_HR;
            }
        } else if (topActivity instanceof NightModeActivity) {
            if (deviceType == null || HMDeviceType.MILI == deviceType) {
                str = CONNECTION_NIGHT_MODE;
            }
        } else if (topActivity instanceof ScreenUnlockActivity) {
            if (deviceType == null || HMDeviceType.MILI == deviceType) {
                str = CONNECTION_SCREEN_UNLOCK;
            }
        } else if (topActivity instanceof IncomingCallAlertActivity) {
            if (deviceType == null || HMDeviceType.MILI == deviceType) {
                str = CONNECTION_INCOMING_CALL;
            }
        } else if (!(topActivity instanceof EventRemindActivity)) {
            if (topActivity instanceof HuamiOSAlarmActivity ? true : topActivity instanceof MiBandAlarmActivity) {
                if (deviceType == null || HMDeviceType.MILI == deviceType) {
                    str = CONNECTION_ALARM;
                }
            } else if (topActivity instanceof AppNotificationAlertActivity) {
                if (deviceType == null || HMDeviceType.MILI == deviceType) {
                    str = CONNECTION_APP_ALERTS;
                }
            } else if (topActivity instanceof LongSitAlertActivity) {
                if (deviceType == null || HMDeviceType.MILI == deviceType) {
                    str = CONNECTION_IDLE_ALERTS;
                }
            } else if (topActivity instanceof SMAlertByNotificationActivity) {
                if (deviceType == null || HMDeviceType.MILI == deviceType) {
                    str = CONNECTION_INCOMING_SMS;
                }
            } else if (topActivity instanceof ReachGoalRemindActivity) {
                if (deviceType == null || HMDeviceType.MILI == deviceType) {
                    str = CONNECTION_GOAL_NOTI;
                }
            } else if (topActivity instanceof PhoneAlarmActivity) {
                if (deviceType == null || HMDeviceType.MILI == deviceType) {
                    str = CONNECTION_CLOCK_PHONE;
                }
            } else if (topActivity instanceof AvoidDisturbActivity) {
                if (deviceType == null || HMDeviceType.MILI == deviceType) {
                    str = CONNECTION_CLOCK_NOT_DISTURB;
                }
            } else if (topActivity instanceof ChangeSportGoalActivity) {
                if (deviceType == null || HMDeviceManager.getInstance().getMajorDeviceType() == deviceType) {
                    str = CONNECTION_CLOCK_ACTIVITY_GOAL;
                }
            } else if (topActivity instanceof HMAppSortActivity) {
                if (deviceType == null || HMDeviceManager.getInstance().getMajorDeviceType() == deviceType) {
                    str = CONNECTION_APP_SORT;
                }
            } else if (topActivity instanceof HMShotcutAppSortActivity) {
                if (deviceType == null || HMDeviceManager.getInstance().getMajorDeviceType() == deviceType) {
                    str = CONNECTION_QUICK_SET;
                }
            } else if ((topActivity instanceof HMWeatherSettingActivity) && (deviceType == null || HMDeviceManager.getInstance().getMajorDeviceType() == deviceType)) {
                str = CONNECTION_WEATHERSET;
            }
        } else if (deviceType == null || HMDeviceType.MILI == deviceType) {
            str = CONNECTION_EVENT_REMINDER;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HMLog.info(TAG, new b(str, value));
        Analytics.recordEvent(new CountEventBuilder(str).setValue(value));
    }

    @JvmStatic
    public static final void registerEventBus() {
        EventBus eventBus = EventBus.getDefault();
        BTConnectionAnalyticStatusHelper bTConnectionAnalyticStatusHelper = INSTANCE;
        if (eventBus.isRegistered(bTConnectionAnalyticStatusHelper)) {
            return;
        }
        EventBus.getDefault().register(bTConnectionAnalyticStatusHelper);
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncDataEvent event) {
        if (event.getResult() || 5 == event.getError() || 6 == event.getError()) {
            return;
        }
        a(event.getDeviceType(), "Sync_Fail");
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        if (event.isConnectingTimeout()) {
            a(event.getDeviceType(), "Connection_Fail");
        }
    }

    public final void onEventMainThread(@NotNull EventBluetooth event) {
        if (event.isOn) {
            return;
        }
        a(null, VALUE_BT_OFF);
    }
}
