package com.xiaomi.fitness.statistics;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.example.statistics.export.AccountType;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.statistics.OneTrackAnalytics;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001¢\u0006\u0002\u0010\u0016J7\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001cJ&\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00052\u0016\u0010\u001e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ2\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/statistics/OneTrackAnalytics;", "", "<init>", "()V", "ONETRACK_APPID", "", "TAG", "sOneTrack", "Lcom/xiaomi/onetrack/OneTrack;", "init", "", "app", "Landroid/app/Application;", q.f13857a, "setCustomPrivacyPolicyAccepted", "accepted", "", "track", "stat", "Lcom/example/statistics/export/OneTrackStatBean;", "args", "", "(Lcom/example/statistics/export/OneTrackStatBean;[Ljava/lang/Object;)V", "instanceID", "getInstanceID", "()Ljava/lang/String;", "argsToMap", "", "(Lcom/example/statistics/export/OneTrackStatBean;[Ljava/lang/Object;)Ljava/util/Map;", "event", "params", "login", "userId", "accountType", "Lcom/example/statistics/export/AccountType;", "skipLoginEvent", TrackConstants.LOGOUT, "setCommonProperty", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OneTrackAnalytics {

    @NotNull
    public static final OneTrackAnalytics INSTANCE = new OneTrackAnalytics();

    @NotNull
    private static final String ONETRACK_APPID = "926314";

    @NotNull
    private static final String TAG = "StatisticsManager";

    @Nullable
    private static OneTrack sOneTrack;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.PHONE_NUMBERl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.WEIXIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountType.WEIBO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountType.QQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountType.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).addDeviceChangeListener(new Function1() { // from class: rah
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OneTrackAnalytics._init_$lambda$0((WearableDeviceModel) obj);
            }
        });
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.statistics.OneTrackAnalytics.2
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                super.onConnectSuccess(did);
                OneTrackAnalytics.INSTANCE.setCommonProperty();
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                super.onDisconnect(did);
                OneTrackAnalytics.INSTANCE.setCommonProperty();
            }
        });
    }

    private OneTrackAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(WearableDeviceModel wearableDeviceModel) {
        INSTANCE.setCommonProperty();
        return Unit.INSTANCE;
    }

    private final Map<String, Object> argsToMap(OneTrackStatBean stat, Object... args) {
        HashMap map = new HashMap();
        int length = args.length;
        if (length % 2 == 0) {
            map.put("tip", stat.getTip());
            for (int i = 0; i < length; i += 2) {
                map.put(args[i].toString(), args[i + 1]);
            }
        }
        return map;
    }

    private final void config(Application app) {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (regionPreference.getPRIVACY_AGREE()) {
            OneTrack.registerCrashHook(app);
            Configuration.Builder builder = new Configuration.Builder();
            builder.setAppId(ONETRACK_APPID).setMode(OneTrack.Mode.APP).setUseCustomPrivacyPolicy(true).setExceptionCatcherEnable(true);
            sOneTrack = OneTrack.createInstance(app, builder.build());
            OneTrack.setDebugMode(false);
            OneTrack.setAccessNetworkEnable(app, true);
            setCustomPrivacyPolicyAccepted(regionPreference.getPREF_PRIVACY_EXPERIENCE_TAG());
            OneTrack oneTrack = sOneTrack;
            if (oneTrack != null) {
                oneTrack.setEventHook(new OneTrack.IEventHook() { // from class: com.xiaomi.fitness.statistics.OneTrackAnalytics.config.1
                    @Override // com.xiaomi.onetrack.OneTrack.IEventHook
                    public boolean isCustomDauEvent(String eventName) {
                        return TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_CONNECTIVITY) || TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_CONNECTIVITY_DEVICE) || TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_MIWEAR_DEV_POWER) || TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_MIWEAR_DEV_BLUETOOTH);
                    }

                    @Override // com.xiaomi.onetrack.OneTrack.IEventHook
                    public boolean isRecommendEvent(String eventName) {
                        return TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_CONNECTIVITY) || TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_CONNECTIVITY_DEVICE) || TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_MIWEAR_DEV_POWER) || TextUtils.equals(eventName, OneTrackConstant.EVENT_NAME_MIWEAR_DEV_BLUETOOTH);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(Application app, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(app, "$app");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -804849512) {
                if (iHashCode == 1948094805 && str.equals("key_privacy_agree")) {
                    INSTANCE.config(app);
                    return;
                }
                return;
            }
            if (str.equals("key_pref_privacy_experience_tag")) {
                RegionPreference regionPreference = RegionPreference.INSTANCE;
                Logger.i(TAG, "enable update " + regionPreference.getPREF_PRIVACY_EXPERIENCE_TAG() + "**processId=" + Process.myPid());
                INSTANCE.setCustomPrivacyPolicyAccepted(regionPreference.getPREF_PRIVACY_EXPERIENCE_TAG());
            }
        }
    }

    @NotNull
    public final String getInstanceID() {
        String instanceId;
        OneTrack oneTrack = sOneTrack;
        return (oneTrack == null || (instanceId = oneTrack.getInstanceId()) == null) ? "" : instanceId;
    }

    public final void init(@NotNull final Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Logger.i(TAG, "com.xiaomi.fitness.statistics.OneTrackAnalytics init");
        config(app);
        RegionPreference.INSTANCE.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: qah
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                OneTrackAnalytics.init$lambda$1(app, sharedPreferences, str);
            }
        });
    }

    public final void login(@NotNull String userId, @NotNull AccountType accountType, @NotNull Map<String, ? extends Object> params, boolean skipLoginEvent) {
        OneTrack.UserIdType userIdType;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(params, "params");
        switch (WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()]) {
            case 1:
                userIdType = OneTrack.UserIdType.XIAOMI;
                break;
            case 2:
                userIdType = OneTrack.UserIdType.PHONE_NUMBER;
                break;
            case 3:
                userIdType = OneTrack.UserIdType.WEIXIN;
                break;
            case 4:
                userIdType = OneTrack.UserIdType.WEIBO;
                break;
            case 5:
                userIdType = OneTrack.UserIdType.QQ;
                break;
            case 6:
                userIdType = OneTrack.UserIdType.OTHER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        OneTrack oneTrack = sOneTrack;
        if (oneTrack != null) {
            oneTrack.login(userId, userIdType, params, skipLoginEvent);
        }
    }

    public final void logout() {
        OneTrack oneTrack = sOneTrack;
        if (oneTrack != null) {
            oneTrack.logout();
        }
    }

    public final void setCommonProperty() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            Logger.d(TAG, "setCommonProperty is");
            OneTrack oneTrack = sOneTrack;
            if (oneTrack != null) {
                oneTrack.setCommonProperty(GetCommonPropertMap.INSTANCE.getCommonPropert());
            }
        }
    }

    public final void setCustomPrivacyPolicyAccepted(boolean accepted) {
        OneTrack oneTrack = sOneTrack;
        if (oneTrack != null) {
            oneTrack.setCustomPrivacyPolicyAccepted(accepted);
        }
    }

    public final void track(@NotNull OneTrackStatBean stat, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(stat, "stat");
        Intrinsics.checkNotNullParameter(args, "args");
        Map<String, Object> mapArgsToMap = argsToMap(stat, Arrays.copyOf(args, args.length));
        if (!mapArgsToMap.isEmpty()) {
            track(stat.getEventName(), (Map<String, ? extends Object>) mapArgsToMap);
        }
    }

    public final void track(@NotNull String event, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        Logger.d("DataReporter", "module-onetrack track:eventName = " + event + " params = " + params);
        OneTrack oneTrack = sOneTrack;
        if (oneTrack != null) {
            oneTrack.track(event, params);
        }
    }
}
