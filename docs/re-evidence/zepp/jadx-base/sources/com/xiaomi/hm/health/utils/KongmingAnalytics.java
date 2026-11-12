package com.xiaomi.hm.health.utils;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010$\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u0016\u0010%\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u0016\u0010&\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u0016\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u000eR\u0016\u0010(\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u0016\u0010)\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000eR\u0016\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u000eR\u0016\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u000eR\u0016\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u000eR\u0016\u0010-\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u000eR\u0016\u0010.\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u000eR\u0016\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u000eR\u0016\u00100\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u000eR\u0016\u00101\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u000eR\u0016\u00102\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u000eR\u0016\u00103\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u000eR\u0016\u00104\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u000eR\u0016\u00105\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u000eR\u0016\u00106\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u000eR\u0016\u00107\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u000eR\u0016\u00108\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u000eR\u0016\u00109\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u000eR\u0016\u0010:\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u000eR\u0016\u0010;\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u000eR\u0016\u0010<\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u000eR\u0016\u0010=\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u000eR\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/xiaomi/hm/health/utils/KongmingAnalytics;", "", "", "kongmingDevicePageAnalytics", "kongmingFindDeviceAnalytics", "kongmingLanguageSetNumAnalytics", "kongmingQuickEntrySetNumAnalytics", "kongmingSportSetNumAnalytics", "kongmingWristLockNumAnalytics", "kongmingAuthorizationNumAnalytics", "", "value", "kongmingOperateAnalytics", "a", "Ljava/lang/String;", "KONGMING_H_VIEW_NUM", "b", "KONGMING_H_FIND_BAND", "c", "KONGMING_H_OPERATE", GoogleApiAvailabilityLight.a, "KONGMING_L_VIEW_NUM", "e", "KONGMING_L_FIND_BAND", "f", "KONGMING_L_OPERATE", "g", "LANGUAGE_SET_NUM", "h", "QUICK_ENTRY_SET_NUM", "i", "SPORT_SET_NUM", z.j, "WRIST_LOCK_NUM", hl.k, "AUTHORIZATION_NUM", "OP_SCREEN_UNLOCK", "OP_CALL", "OP_BAND_CLOCK", "OP_APP_PUSH", "OP_SITTING", "OP_MORE", "OP_IDENTITY", "OP_WEAR", "OP_ENTRY_QUICK", "OP_DISPLAY", "OP_HEART_RATE_DETECT", "OP_LEARN_MORE", "OP_LIGHT_SCREEN", "OP_WEATHER_SET", "OP_UNBIND", "OP_WATCH_FACE", "OP_IDENTITY_HEART_RATE", "OP_WRIST_LOCK", "OP_VOICE", "OP_MODE_NIGHT", "OP_BIND_LIMIT", "OP_SPORT_SET", "OP_WORLD_CLOCK", "OP_MODE_VIBRATE", "OP_BAND_LANGUAGE", "OP_CAMERA_SETTING", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "l", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class KongmingAnalytics {

    @NotNull
    public static final String OP_APP_PUSH = "AppPush";

    @NotNull
    public static final String OP_BAND_CLOCK = "BandClock";

    @NotNull
    public static final String OP_BAND_LANGUAGE = "Band_Language";

    @NotNull
    public static final String OP_BIND_LIMIT = "Bind_Limit";

    @NotNull
    public static final String OP_CALL = "Call";

    @NotNull
    public static final String OP_CAMERA_SETTING = "Camera_Setting";

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
    public static final String OP_MODE_VIBRATE = "Mode_Vibrate";

    @NotNull
    public static final String OP_MORE = "More";

    @NotNull
    public static final String OP_SCREEN_UNLOCK = "ScreenUnlock";

    @NotNull
    public static final String OP_SITTING = "Sitting";

    @NotNull
    public static final String OP_SPORT_SET = "Sport_Set";

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
    public static final String OP_WORLD_CLOCK = "World_Clock";

    @NotNull
    public static final String OP_WRIST_LOCK = "Wrist_Lock";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String KONGMING_H_VIEW_NUM = "KongmingH_ViewNum";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String KONGMING_H_FIND_BAND = "KongmingH_FindBand";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KONGMING_H_OPERATE = "KongmingH_Operate";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String KONGMING_L_VIEW_NUM = "KongmingL_ViewNum";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String KONGMING_L_FIND_BAND = "KongmingL_FindBand";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String KONGMING_L_OPERATE = "KongmingL_Operate";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String LANGUAGE_SET_NUM = "Language_Set_Num";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String QUICK_ENTRY_SET_NUM = "QuickEntry_Set_Num";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String SPORT_SET_NUM = "Sport_Set_Num";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String WRIST_LOCK_NUM = "Wrist_Lock_Num";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String AUTHORIZATION_NUM = "Authorization_Num";

    @NotNull
    public static final KongmingAnalytics INSTANCE = new KongmingAnalytics();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final HMDeviceSource deviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private KongmingAnalytics() {
    }

    @JvmStatic
    public static final void kongmingAuthorizationNumAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_KONGMING_L || hMDeviceSource == HMDeviceSource.MILI_KONGMING) {
            Analytics.recordEvent(new CountEventBuilder(AUTHORIZATION_NUM));
        }
    }

    @JvmStatic
    public static final void kongmingDevicePageAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_KONGMING_L) {
            Analytics.recordEvent(new CountEventBuilder(KONGMING_L_VIEW_NUM));
        } else if (hMDeviceSource == HMDeviceSource.MILI_KONGMING) {
            Analytics.recordEvent(new CountEventBuilder(KONGMING_H_VIEW_NUM));
        }
    }

    @JvmStatic
    public static final void kongmingFindDeviceAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_KONGMING_L) {
            Analytics.recordEvent(new CountEventBuilder(KONGMING_L_FIND_BAND));
        } else if (hMDeviceSource == HMDeviceSource.MILI_KONGMING) {
            Analytics.recordEvent(new CountEventBuilder(KONGMING_H_FIND_BAND));
        }
    }

    @JvmStatic
    public static final void kongmingLanguageSetNumAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_KONGMING_L || hMDeviceSource == HMDeviceSource.MILI_KONGMING) {
            Analytics.recordEvent(new CountEventBuilder(LANGUAGE_SET_NUM));
        }
    }

    @JvmStatic
    public static final void kongmingOperateAnalytics(@NotNull String value) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()];
        if (i != 1) {
            str = i != 2 ? null : KONGMING_H_OPERATE;
        } else {
            str = KONGMING_L_OPERATE;
        }
        if (str == null) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(str).setValue(value));
    }

    @JvmStatic
    public static final void kongmingQuickEntrySetNumAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_KONGMING_L || hMDeviceSource == HMDeviceSource.MILI_KONGMING) {
            Analytics.recordEvent(new CountEventBuilder(QUICK_ENTRY_SET_NUM));
        }
    }

    @JvmStatic
    public static final void kongmingSportSetNumAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_KONGMING_L || hMDeviceSource == HMDeviceSource.MILI_KONGMING) {
            Analytics.recordEvent(new CountEventBuilder(SPORT_SET_NUM));
        }
    }

    @JvmStatic
    public static final void kongmingWristLockNumAnalytics() {
        HMDeviceSource hMDeviceSource = deviceSource;
        if (hMDeviceSource == HMDeviceSource.MILI_KONGMING_L || hMDeviceSource == HMDeviceSource.MILI_KONGMING) {
            Analytics.recordEvent(new CountEventBuilder(WRIST_LOCK_NUM));
        }
    }
}
