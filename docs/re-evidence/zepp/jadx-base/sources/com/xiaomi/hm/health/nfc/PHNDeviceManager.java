package com.xiaomi.hm.health.nfc;

import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.phn.core.device.Device;
import com.huami.phn.core.device.DeviceManager;
import com.huami.phn.core.device.impl.BleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016R\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/nfc/PHNDeviceManager;", "Lcom/huami/phn/core/device/DeviceManager;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getActiveBleDevice", "Lcom/huami/phn/core/device/Device;", "getActiveDevice", "", "getBindingDevice", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "managerApi", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
final class PHNDeviceManager implements DeviceManager, KoinComponentAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy managerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public PHNDeviceManager() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.managerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.nfc.PHNDeviceManager$special$$inlined$inject$default$1
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
        return (DeviceManagerApi) this.managerApi.getValue();
    }

    @Override // com.huami.phn.core.device.DeviceManager
    @Nullable
    public HMBaseDevice getActiveBleDevice() {
        return a().getDevice();
    }

    @Override // com.huami.phn.core.device.DeviceManager
    @Nullable
    public Device getActiveDevice() {
        HMBaseDevice device = a().getDevice();
        if (device == null) {
            return null;
        }
        return new BleDevice(device, null, null, 6, null);
    }

    @Override // com.huami.phn.core.device.DeviceManager
    @NotNull
    public List<Device> getBindingDevice() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.phn.core.device.DeviceManager
    public boolean isActiveDeviceConnected() {
        return DeviceManager.DefaultImpls.isActiveDeviceConnected(this);
    }

    @Override // com.huami.phn.core.device.DeviceManager
    public boolean isActiveDeviceSupportPhn() {
        return DeviceManager.DefaultImpls.isActiveDeviceSupportPhn(this);
    }
}
