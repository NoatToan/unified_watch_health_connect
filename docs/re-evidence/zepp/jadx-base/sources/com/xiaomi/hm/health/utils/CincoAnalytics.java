package com.xiaomi.hm.health.utils;

import android.app.Activity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0016\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0016\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0016\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0016\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0016\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0016\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0016\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0016\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\rR\u0016\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0016\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0016\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\rR\u0016\u0010$\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\rR\u0016\u0010%\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\rR\u0016\u0010&\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\rR\u0016\u0010'\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\rR\u0016\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\rR\u0016\u0010)\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\rR\u0016\u0010*\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\rR\u0016\u0010+\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\rR\u0016\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\rR\u0016\u0010-\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\rR\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\rR\u001d\u00104\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\f\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\rR\u0016\u0010:\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\rR\u0016\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\rR\u0016\u0010<\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\rR\u0016\u0010=\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\rR\u0016\u0010>\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\rR\u0016\u0010?\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\rR\u0016\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\rR\u0016\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\rR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\r¨\u0006F"}, d2 = {"Lcom/xiaomi/hm/health/utils/CincoAnalytics;", "Lorg/koin/core/component/KoinComponent;", "", "disconnectAnalytics", "cincoDevicePageAnalytics", "cincoFindDeviceAnalytics", "", "value", "cincoOperateAnalytics", "Landroid/app/Activity;", "activity", "cincoVibrateAnalytics", "a", "Ljava/lang/String;", "CINCO_H_VIEW_NUM", "b", "CINCO_L_VIEW_NUM", "c", "CINCO_H_FIND_BAND", GoogleApiAvailabilityLight.a, "CINCO_L_FIND_BAND", "e", "CINCO_H_OPERATE", "f", "CINCO_L_OPERATE", "OP_SCREEN_UNLOCK", "OP_CALL", "OP_BAND_CLOCK", "OP_APP_PUSH", "OP_SITTING", "OP_MORE", "OP_IDENTITY", "OP_WEAR", "OP_ENTRY_QUICK", "OP_DISPLAY", "OP_HEART_RATE_DETECT", "OP_LEARN_MORE", "OP_LIGHT_SCREEN", "OP_WEATHER_SET", "OP_UNBIND", "OP_WATCH_FACE", "OP_IDENTITY_HEART_RATE", "OP_WRIST_LOCK", "OP_VOICE", "OP_MODE_NIGHT", "OP_BIND_LIMIT", "g", "DISCONNECT_REMIND_NUM", "Lcom/huami/devicex/manager/DeviceManagerApi;", "h", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "i", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "VIBRATE_APP_PUSH", "VIBRATE_CALL", "VIBRATE_SMS", "VIBRATE_PHONE_CLOCK", "VIBRATE_DISCONNECT", "VIBRATE_SITTING_REMIND", "VIBRATE_GOALS_REMIND", "VIBRATE_BAND_CLOCK", "VIBRATE_EVENT_REMIND", z.j, "VIBRATE_EVENT_ID", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CincoAnalytics implements KoinComponent {

    @NotNull
    public static final CincoAnalytics INSTANCE;

    @NotNull
    public static final String OP_APP_PUSH = "AppPush";

    @NotNull
    public static final String OP_BAND_CLOCK = "BandClock";

    @NotNull
    public static final String OP_BIND_LIMIT = "Bind_Limit";

    @NotNull
    public static final String OP_CALL = "Call";

    @NotNull
    public static final String OP_DISPLAY = "Display";

    @NotNull
    public static final String OP_ENTRY_QUICK = "Entry_Quick";

    @NotNull
    public static final String OP_HEART_RATE_DETECT = "HeartRateDetect";

    @NotNull
    public static final String OP_IDENTITY = "Identity";

    @NotNull
    public static final String OP_IDENTITY_HEART_RATE = "Identity_HeartRate";

    @NotNull
    public static final String OP_LEARN_MORE = "LearnMore";

    @NotNull
    public static final String OP_LIGHT_SCREEN = "LightScreen";

    @NotNull
    public static final String OP_MODE_NIGHT = "Mode_Night";

    @NotNull
    public static final String OP_MORE = "More";

    @NotNull
    public static final String OP_SCREEN_UNLOCK = "ScreenUnlock";

    @NotNull
    public static final String OP_SITTING = "Sitting";

    @NotNull
    public static final String OP_UNBIND = "Unbind";

    @NotNull
    public static final String OP_VOICE = "voice";

    @NotNull
    public static final String OP_WATCH_FACE = "WatchFace";

    @NotNull
    public static final String OP_WEAR = "Wear";

    @NotNull
    public static final String OP_WEATHER_SET = "WeatherSet";

    @NotNull
    public static final String OP_WRIST_LOCK = "Wrist_Lock";

    @NotNull
    public static final String VIBRATE_APP_PUSH = "AppPush";

    @NotNull
    public static final String VIBRATE_BAND_CLOCK = "BandClock";

    @NotNull
    public static final String VIBRATE_CALL = "Call";

    @NotNull
    public static final String VIBRATE_DISCONNECT = "Disconnect";

    @NotNull
    public static final String VIBRATE_EVENT_REMIND = "EventRemind";

    @NotNull
    public static final String VIBRATE_GOALS_REMIND = "GoalsRemind";

    @NotNull
    public static final String VIBRATE_PHONE_CLOCK = "PhoneClock";

    @NotNull
    public static final String VIBRATE_SITTING_REMIND = "SittingRemind";

    @NotNull
    public static final String VIBRATE_SMS = "SMS";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String CINCO_H_VIEW_NUM = "Cinco-H_ViewNum";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String CINCO_L_VIEW_NUM = "Cinco-L_ViewNum";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String CINCO_H_FIND_BAND = "Cinco-H_FindBand";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String CINCO_L_FIND_BAND = "Cinco-L_FindBand";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String CINCO_H_OPERATE = "Cinco-H_Operate";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String CINCO_L_OPERATE = "Cinco-L_Operate";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String DISCONNECT_REMIND_NUM = "DisconnectRemind_Num";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String VIBRATE_EVENT_ID = "Vibration_customize";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_CINCO_L.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "vibrate value: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "doAnalytics";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final CincoAnalytics cincoAnalytics = new CincoAnalytics();
        INSTANCE = cincoAnalytics;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.utils.CincoAnalytics$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = cincoAnalytics;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        deviceSource = cincoAnalytics.a().getBoundDeviceSource(HMDeviceType.MILI);
    }

    private CincoAnalytics() {
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    @JvmStatic
    public static final void cincoDevicePageAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_CINCO) {
            Analytics.recordEvent(new CountEventBuilder(CINCO_H_VIEW_NUM));
        } else if (hMDeviceSource == HMDeviceSource.MILI_CINCO_L) {
            Analytics.recordEvent(new CountEventBuilder(CINCO_L_VIEW_NUM));
        }
    }

    @JvmStatic
    public static final void cincoFindDeviceAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_CINCO) {
            Analytics.recordEvent(new CountEventBuilder(CINCO_H_FIND_BAND));
        } else if (hMDeviceSource == HMDeviceSource.MILI_CINCO_L) {
            Analytics.recordEvent(new CountEventBuilder(CINCO_L_FIND_BAND));
        }
    }

    @JvmStatic
    public static final void cincoOperateAnalytics(@NotNull String value) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()];
        if (i != 1) {
            str = i != 2 ? null : CINCO_L_OPERATE;
        } else {
            str = CINCO_H_OPERATE;
        }
        if (str == null) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(str).setValue(value));
    }

    @JvmStatic
    public static final void cincoVibrateAnalytics(@Nullable Activity activity) {
        if (activity == null) {
            return;
        }
        String strCincoVibrateAnalytics = ((ConcoAnalyticsApi) INSTANCE.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ConcoAnalyticsApi.class), null, null)).cincoVibrateAnalytics(activity);
        HMLog.debug("coderJay", new a(strCincoVibrateAnalytics));
        if (strCincoVibrateAnalytics == null) {
            return;
        }
        HMLog.debug("coderJay", b.a);
        Analytics.recordEvent(new CountEventBuilder(VIBRATE_EVENT_ID).setValue(strCincoVibrateAnalytics));
    }

    @JvmStatic
    public static final void disconnectAnalytics() {
        Analytics.recordEvent(new CountEventBuilder(DISCONNECT_REMIND_NUM));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
