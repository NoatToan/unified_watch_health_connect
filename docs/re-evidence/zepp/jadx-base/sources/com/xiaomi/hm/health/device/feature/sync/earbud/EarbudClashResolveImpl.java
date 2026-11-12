package com.xiaomi.hm.health.device.feature.sync.earbud;

import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.callback.MyActivityDataSyncCallback;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.firmware.HMFwUtils;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/earbud/EarbudClashResolveImpl;", "Lcom/xiaomi/hm/health/device/feature/sync/earbud/EarbudClashResolve;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/databases/model/Device;", "earbudDevice", "headsetDevice", "", "clashResolve", "syncHeadsetDevice", "syncEarbudDevice", "syncDataFromDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "lastBindEarbudType", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi$delegate", "Lkotlin/Lazy;", "getDeviceRepositoryApi", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi$delegate", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi$delegate", "getDeviceTimeStoreApi", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudClashResolveImpl implements EarbudClashResolve, KoinComponentAdapter {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "EarbudClashResolve";

    /* JADX INFO: renamed from: deviceManagerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: deviceRepositoryApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryApi;

    /* JADX INFO: renamed from: deviceTimeStoreApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceTimeStoreApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/earbud/EarbudClashResolveImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudClashResolveImpl() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceRepositoryApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceTimeStoreApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), objArr4, objArr5);
            }
        });
    }

    private final void clashResolve(Device earbudDevice, Device headsetDevice) {
        Long device_bind_time = earbudDevice.getDevice_bind_time();
        long jLongValue = device_bind_time == null ? 0L : device_bind_time.longValue();
        Long device_bind_time2 = headsetDevice.getDevice_bind_time();
        if (jLongValue > (device_bind_time2 == null ? 1L : device_bind_time2.longValue())) {
            syncEarbudDevice();
        } else {
            syncHeadsetDevice();
        }
    }

    private final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceRepositoryApi getDeviceRepositoryApi() {
        return (DeviceRepositoryApi) this.deviceRepositoryApi.getValue();
    }

    private final DeviceTimeStoreApi getDeviceTimeStoreApi() {
        return (DeviceTimeStoreApi) this.deviceTimeStoreApi.getValue();
    }

    private final void syncEarbudDevice() {
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        if (!HMFwUtils.allowEarbudDataSync()) {
            HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl.syncEarbudDevice.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "sync earbud data is forbidden as in earbud device activity.";
                }
            });
            return;
        }
        HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) getDeviceManagerApi().getDevice(hMDeviceType);
        if (hmEarbudDevice != null) {
            hmEarbudDevice.startSyncData(getDeviceTimeStoreApi().getBoundDeviceSyncTime(hMDeviceType), new MyActivityDataSyncCallback(getDeviceManagerApi(), getDeviceManagerApi().getBoundDeviceSource(hMDeviceType)));
        } else {
            HMLog.warn$default(TAG, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl.syncEarbudDevice.2
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "HmEarbudDevice is null when call HmEarbudDevice#startSyncData";
                }
            }, 2, null);
        }
    }

    private final void syncHeadsetDevice() {
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        try {
            if (!HMFwUtils.allowDataSync(hMDeviceType)) {
                HMLog.warn$default(TAG, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl.syncHeadsetDevice.1
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "sync data is forbidden as in HMFwUpgradeFailedActivity.";
                    }
                }, 2, null);
                return;
            }
            SyncCenterManager syncCenterManager = SyncCenterManager.INSTANCE;
            if (!syncCenterManager.isUsingSyncCenter(hMDeviceType)) {
                HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl.syncHeadsetDevice.3
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "use normal sync center";
                    }
                });
            } else {
                HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl.syncHeadsetDevice.2
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "use new sync center";
                    }
                });
                syncCenterManager.start(hMDeviceType, true);
            }
        } catch (Exception e) {
            HMLog.error(TAG, "001", e, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl.syncHeadsetDevice.4
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "error of start sync.";
                }
            });
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolve
    @Nullable
    public HMDeviceType lastBindEarbudType() {
        DeviceRepositoryApi deviceRepositoryApi = getDeviceRepositoryApi();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        Device deviceFindTopOneDevice = deviceRepositoryApi.findTopOneDevice(hMDeviceType);
        DeviceRepositoryApi deviceRepositoryApi2 = getDeviceRepositoryApi();
        HMDeviceType hMDeviceType2 = HMDeviceType.EARBUD;
        Device deviceFindTopOneDevice2 = deviceRepositoryApi2.findTopOneDevice(hMDeviceType2);
        if (deviceFindTopOneDevice == null || deviceFindTopOneDevice2 == null) {
            return null;
        }
        Long device_bind_time = deviceFindTopOneDevice2.getDevice_bind_time();
        long jLongValue = device_bind_time == null ? 0L : device_bind_time.longValue();
        Long device_bind_time2 = deviceFindTopOneDevice.getDevice_bind_time();
        return jLongValue > (device_bind_time2 == null ? 1L : device_bind_time2.longValue()) ? hMDeviceType2 : hMDeviceType;
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolve
    public void syncDataFromDevice() {
        Device deviceFindTopOneDevice = getDeviceRepositoryApi().findTopOneDevice(HMDeviceType.HEADSET);
        Device deviceFindTopOneDevice2 = getDeviceRepositoryApi().findTopOneDevice(HMDeviceType.EARBUD);
        if (deviceFindTopOneDevice != null && deviceFindTopOneDevice2 != null) {
            clashResolve(deviceFindTopOneDevice2, deviceFindTopOneDevice);
        } else if (deviceFindTopOneDevice != null) {
            syncHeadsetDevice();
        } else if (deviceFindTopOneDevice2 != null) {
            syncEarbudDevice();
        }
    }
}
