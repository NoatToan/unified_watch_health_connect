package com.xiaomi.hm.health.di.koin.module.device.settings;

import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/module/device/settings/DeviceCenterImp;", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceCenterImp implements DeviceCenter, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceCenterImp() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.di.koin.module.device.settings.DeviceCenterImp$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.DeviceCenter
    @Nullable
    public HMBaseDevice getDevice() {
        return DeviceCenter.DefaultImpls.getDevice(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.DeviceCenter
    @NotNull
    public HMDeviceSource getDeviceSource() {
        return DeviceCenter.DefaultImpls.getDeviceSource(this);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.DeviceCenter
    @Nullable
    public HMBaseDevice getDevice(@NotNull HMDeviceType type) {
        return a().getDevice(type);
    }

    @Override // com.xiaomi.hm.health.device.setting.DeviceCenter
    @NotNull
    public HMDeviceSource getDeviceSource(@NotNull HMDeviceType type) {
        return a().getBoundDeviceSource(type);
    }
}
