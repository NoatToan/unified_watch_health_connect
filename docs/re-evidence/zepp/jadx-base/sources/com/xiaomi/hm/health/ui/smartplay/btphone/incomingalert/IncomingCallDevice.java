package com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007J\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u0002R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/IncomingCallDevice;", "Lorg/koin/core/component/KoinComponent;", "", "supportShowContact", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "checkUpgrade", "", "getDeviceAddress", "show", "showContact", "", "getDelayTime", "time", "setDelayTime", "supportSettingDelayTime", "a", "Ljava/lang/String;", "TAG", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class IncomingCallDevice implements KoinComponent {

    @NotNull
    public static final IncomingCallDevice INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "IncomingCallDevice";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Boolean bool) {
            super(0);
            this.a = i;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set delay time " + this.a + " seconds, result: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMMiLiProDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMMiLiProDevice hMMiLiProDevice) {
            super(0);
            this.a = hMMiLiProDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "show contact failed as device is: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final IncomingCallDevice incomingCallDevice = new IncomingCallDevice();
        INSTANCE = incomingCallDevice;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.IncomingCallDevice$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = incomingCallDevice;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private IncomingCallDevice() {
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    public final void checkUpgrade(@NotNull Context context) {
        HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
        if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                hMFwOnlineUpgradeManager.checkFwUpgrade(context.getApplicationContext(), hMDeviceType, false);
                return;
            }
        }
        HMFwUpgradeManager.getInstance().checkFwUpgrade(context.getApplicationContext(), HMDeviceType.MILI, false);
    }

    public final int getDelayTime() {
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            return -1;
        }
        return hMMiLiProDevice.getBtPhoneDelaySync();
    }

    @NotNull
    public final String getDeviceAddress() {
        String boundDeviceAddress = a().getBoundDeviceAddress(HMDeviceType.MILI);
        return boundDeviceAddress == null ? "" : boundDeviceAddress;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void setDelayTime(int time) {
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        HMLog.info(TAG, new a(time, hMMiLiProDevice != null ? Boolean.valueOf(hMMiLiProDevice.setBtPhoneDelaySync((byte) time)) : null));
    }

    @WorkerThread
    public final boolean showContact(boolean show) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) a().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice != null) {
            return hMMiLiProDevice.showContactSync(HMAlertMode.ALERT_INCALL, show);
        }
        HMLog.info(TAG, new b(hMMiLiProDevice));
        return false;
    }

    public final boolean supportSettingDelayTime() {
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        SettingsModule settingsModule = hMMiLiProDevice != null ? (SettingsModule) hMMiLiProDevice.getChannelModule(SettingsModule.class) : null;
        if (settingsModule == null) {
            return false;
        }
        return settingsModule.supportGroup(SettingsGroupType.GENERAL);
    }

    public final boolean supportShowContact() {
        return HMDeviceConfig.hasFeatureFontResDevice() && HMDeviceUtils.isSupportContactNameForSystemLanguage();
    }
}
