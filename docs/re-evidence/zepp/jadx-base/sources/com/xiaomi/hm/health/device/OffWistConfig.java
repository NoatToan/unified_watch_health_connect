package com.xiaomi.hm.health.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.SmartExecutor;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.OffWistConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistConfig;", "", "", "component1", "", "component2", Constants.ENABLED, "password", "copy", "toString", "", "hashCode", "other", "equals", "a", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "b", "Ljava/lang/String;", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "<init>", "(ZLjava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OffWistConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KeeperProxyApi c = (KeeperProxyApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), null, null);

    @NotNull
    private static final String d = "OffWistConfig";
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;

    @NotNull
    private static final String h = "huami.mifit.user.settings.cinco.leftwristlock";

    @NotNull
    private static final String i = "huami.mifit.user.settings.gtseries.leftwristlock";

    @NotNull
    private static final String j = "huami.mifit.user.settings.gt2series.leftwristlock";

    @NotNull
    private static final String k = "enable";

    @NotNull
    private static final String l = "password";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String password;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014R\u0019\u0010\u0018\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001d¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistConfig$Companion;", "", "Lcom/xiaomi/hm/health/device/OffWistConfig;", "offWistConfig", "", "c", "", "e", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "updateOffWrist", "", "isOffWristPasswordSaveCloud", "()Ljava/lang/Boolean;", "isOffWristOpened", "saveOffWistConfig", "enable", "password", "Lcom/xiaomi/hm/health/device/SaveOffWristCallback;", "callback", "saveOffWrist", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "getKeeperProxyApi", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "OFF_WIST_LOCK_ENABLE_KEY", "Ljava/lang/String;", "OFF_WIST_LOCK_GT2_PROPERTY", "OFF_WIST_LOCK_GT_PROPERTY", "OFF_WIST_LOCK_PASSWORD_KEY", "OFF_WIST_LOCK_PROPERTY", "OFF_WRIST_LOCK_NOT_SAVE", LogUtil.I, "OFF_WRIST_LOCK_SAVE_CLOUD", "OFF_WRIST_LOCK_SAVE_DEVICE", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int b() {
            int offWristLockSaveState = getKeeperProxyApi().getOffWristLockSaveState();
            return offWristLockSaveState == 0 ? e() : offWristLockSaveState;
        }

        private final String c(OffWistConfig offWistConfig) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enable", offWistConfig.getEnabled());
            jSONObject.put("password", offWistConfig.getPassword());
            return jSONObject.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d() {
            Companion companion = OffWistConfig.INSTANCE;
            companion.getKeeperProxyApi().clearOffWristLockData();
            companion.e();
        }

        private final int e() {
            HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.MILI);
            if (!(device instanceof HMMiLiProDevice)) {
                return 0;
            }
            try {
                Boolean offWristLockStateSync = ((HMMiLiProDevice) device).getOffWristLockStateSync();
                if (offWristLockStateSync == null) {
                    getKeeperProxyApi().offWristLockSaveCloud();
                    return 1;
                }
                getKeeperProxyApi().offWristLockSaveDevice();
                getKeeperProxyApi().saveOffWristLockSaveDeviceOpened(offWristLockStateSync.booleanValue());
                return 2;
            } catch (Exception unused) {
                return 0;
            }
        }

        @NotNull
        public final KeeperProxyApi getKeeperProxyApi() {
            return OffWistConfig.c;
        }

        @Nullable
        public final Boolean isOffWristOpened() {
            int iB = b();
            if (iB == 1) {
                return Boolean.valueOf(offWistConfig().getEnabled());
            }
            if (iB != 2) {
                return null;
            }
            return Boolean.valueOf(getKeeperProxyApi().isOffWristLockSaveDeviceOpened());
        }

        @Nullable
        public final Boolean isOffWristPasswordSaveCloud() {
            int iB = b();
            if (iB == 0) {
                return null;
            }
            return Boolean.valueOf(iB == 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final OffWistConfig offWistConfig() {
            String property;
            String str = null;
            Object[] objArr = 0;
            if (((DeviceUtilsApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), null, null)).supportSixPwd()) {
                property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(OffWistConfig.j, "");
            } else {
                property = ConfigHelperKt.hasMiliFeature(Feature.OFF_WIST_ZERO_TO_NINE) ? DeviceXFunctionsKt.getPropertyStoreApi().getProperty(OffWistConfig.i, "") : DeviceXFunctionsKt.getPropertyStoreApi().getProperty(OffWistConfig.h, "");
            }
            OffWistConfig offWistConfig = new OffWistConfig(false, str, 3, objArr == true ? 1 : 0);
            try {
                JSONObject jSONObject = new JSONObject(property);
                offWistConfig.setEnabled(jSONObject.getBoolean("enable"));
                offWistConfig.setPassword(jSONObject.getString("password"));
            } catch (Throwable unused) {
            }
            return offWistConfig;
        }

        public final void saveOffWistConfig(@NotNull OffWistConfig offWistConfig) {
            if (((DeviceUtilsApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), null, null)).supportSixPwd()) {
                DeviceXFunctionsKt.getPropertyStoreApi().setProperty(OffWistConfig.j, c(offWistConfig));
                DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            } else if (ConfigHelperKt.hasMiliFeature(Feature.OFF_WIST_ZERO_TO_NINE)) {
                DeviceXFunctionsKt.getPropertyStoreApi().setProperty(OffWistConfig.i, c(offWistConfig));
                DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            } else {
                DeviceXFunctionsKt.getPropertyStoreApi().setProperty(OffWistConfig.h, c(offWistConfig));
                DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            }
        }

        public final void saveOffWrist(boolean enable, @NotNull final String password, @Nullable final SaveOffWristCallback callback) {
            HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.MILI);
            Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
            final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
            hMMiLiProDevice.setUnwearPassword(true, password, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.OffWistConfig$Companion$saveOffWrist$hmCallBack$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "Open off wist " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info("OffWistConfig", new a(result));
                    if (result && !hMMiLiProDevice.isHuamiOs()) {
                        OffWistConfig.INSTANCE.saveOffWistConfig(new OffWistConfig(true, password));
                    }
                    SaveOffWristCallback saveOffWristCallback = callback;
                    if (saveOffWristCallback == null) {
                        return;
                    }
                    saveOffWristCallback.onFinish(result);
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onStart() {
                    SaveOffWristCallback saveOffWristCallback = callback;
                    if (saveOffWristCallback == null) {
                        return;
                    }
                    saveOffWristCallback.onStart();
                }
            });
        }

        public final void updateOffWrist(@NotNull HMDeviceType type) {
            DeviceInfo deviceInfo;
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(type);
            HMDeviceSource deviceSource = null;
            if (device != null && (deviceInfo = device.getDeviceInfo()) != null) {
                deviceSource = deviceInfo.getDeviceSource();
            }
            if (deviceSource != null && HMDeviceConfig.hasFeatureOffWistLock(deviceSource)) {
                SmartExecutor.getExecutor().execute(new Runnable() { // from class: bj5
                    @Override // java.lang.Runnable
                    public final void run() {
                        OffWistConfig.Companion.d();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OffWistConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public OffWistConfig(boolean z, @NotNull String str) {
        this.enabled = z;
        this.password = str;
    }

    public static /* synthetic */ OffWistConfig copy$default(OffWistConfig offWistConfig, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = offWistConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            str = offWistConfig.password;
        }
        return offWistConfig.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final OffWistConfig copy(boolean enabled, @NotNull String password) {
        return new OffWistConfig(enabled, password);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffWistConfig)) {
            return false;
        }
        OffWistConfig offWistConfig = (OffWistConfig) other;
        return this.enabled == offWistConfig.enabled && Intrinsics.areEqual(this.password, offWistConfig.password);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.password.hashCode();
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setPassword(@NotNull String str) {
        this.password = str;
    }

    @NotNull
    public String toString() {
        return "OffWistConfig(enabled=" + this.enabled + ", password=" + this.password + ")";
    }

    public /* synthetic */ OffWistConfig(boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str);
    }
}
