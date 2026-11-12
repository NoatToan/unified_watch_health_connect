package com.xiaomi.hm.health.device.headset;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.bluetooth.device.OtaUpgradeState;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.event.HMActiveDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001$\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0011J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\u0014\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "f", "Lcom/xiaomi/hm/health/databases/model/Device;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "c", "", "isReady", "Lcom/xiaomi/hm/health/device/event/HMActiveDeviceEvent;", "event", "onEventBackgroundThread", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "onCleared", "a", "Lcom/xiaomi/hm/health/databases/model/Device;", "getDevice", "()Lcom/xiaomi/hm/health/databases/model/Device;", "setDevice", "(Lcom/xiaomi/hm/health/databases/model/Device;)V", "device", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getReadyLiveData", "()Landroidx/lifecycle/MutableLiveData;", "readyLiveData", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "com/xiaomi/hm/health/device/headset/MozartUpgradePrepareViewModel$otaUpgradeState$1", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareViewModel$otaUpgradeState$1;", "otaUpgradeState", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "e", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "headsetDevice", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MozartUpgradePrepareViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> readyLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MozartUpgradePrepareViewModel$otaUpgradeState$1 otaUpgradeState;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.bluetooth.device.OtaUpgradeState, com.xiaomi.hm.health.device.headset.MozartUpgradePrepareViewModel$otaUpgradeState$1] */
    public MozartUpgradePrepareViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.MozartUpgradePrepareViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr, objArr2);
            }
        });
        ?? r0 = new OtaUpgradeState() { // from class: com.xiaomi.hm.health.device.headset.MozartUpgradePrepareViewModel$otaUpgradeState$1
            @Override // com.huami.bluetooth.device.OtaUpgradeState
            public void onOtaStateChanged(boolean enable) {
                this.a.f();
            }
        };
        this.otaUpgradeState = r0;
        EventBus.getDefault().register(this);
        Object objE = e();
        if (objE == null) {
            return;
        }
        Object obj = objE instanceof MozartDevice ? objE : null;
        if (obj == null) {
            return;
        }
        ((MozartDevice) obj).registerOtaStateCallback(r0);
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final HMDeviceSource b(Device device) {
        return HMDeviceSource.fromValue(device.getDevice_source().intValue());
    }

    private final HMDeviceType c(Device device) {
        return HMDeviceType.fromValue(device.getDevice_type().intValue());
    }

    private final HMBaseDevice e() {
        return a().getDevice(HMDeviceType.HEADSET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (a().isActive(this.device)) {
            boolean zIsReady = isReady();
            if (Intrinsics.areEqual(Boolean.valueOf(zIsReady), this.readyLiveData.getValue())) {
                return;
            }
            this.readyLiveData.postValue(Boolean.valueOf(zIsReady));
        }
    }

    @Nullable
    public final Device getDevice() {
        return this.device;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Boolean> getReadyLiveData() {
        return this.readyLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    public final boolean isReady() {
        boolean z;
        if (a().isActive(this.device)) {
            IHMAuthCallback iHMAuthCallbackE = e();
            if (iHMAuthCallbackE == null || !(iHMAuthCallbackE instanceof MozartDevice)) {
                z = false;
            } else if (iHMAuthCallbackE instanceof LullabyDevice) {
                BatteryInfo batteryInfo = ((LullabyDevice) iHMAuthCallbackE).getBatteryInfo();
                if (batteryInfo == null || batteryInfo.isCharging() || batteryInfo.isChargeFull()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MozartDevice mozartDevice = (MozartDevice) iHMAuthCallbackE;
                HeadsetDevice.HeadsetDeviceState headsetState = mozartDevice.getHeadsetState();
                boolean zIsDualConnected = headsetState == null ? false : headsetState.isDualConnected();
                BatteryInfo batteryInfo2 = mozartDevice.getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
                BatteryInfo batteryInfo3 = mozartDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
                boolean z2 = (batteryInfo2 == null || batteryInfo2.isCharging() || batteryInfo2.isChargeFull()) ? false : true;
                boolean z3 = (batteryInfo3 == null || batteryInfo3.isCharging() || batteryInfo3.isChargeFull()) ? false : true;
                boolean zIsOtaEnable = mozartDevice.isOtaEnable();
                if (zIsDualConnected && z2 && z3 && zIsOtaEnable) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        EventBus.getDefault().unregister(this);
        IHMAuthCallback iHMAuthCallbackE = e();
        if (iHMAuthCallbackE != null) {
            if (!(iHMAuthCallbackE instanceof MozartDevice)) {
                iHMAuthCallbackE = null;
            }
            if (iHMAuthCallbackE != null) {
                ((MozartDevice) iHMAuthCallbackE).unRegisterOtaStateCallback(this.otaUpgradeState);
            }
        }
        super.onCleared();
    }

    public final void onEventBackgroundThread(@NotNull HMActiveDeviceEvent event) {
        if (this.device != null) {
            HMDeviceSource deviceSource = event.getDeviceSource();
            Device device = this.device;
            if (deviceSource != (device == null ? null : b(device))) {
                return;
            }
            f();
        }
    }

    public final void setDevice(@Nullable Device device) {
        this.device = device;
    }

    public final void onEventBackgroundThread(@NotNull HeadsetDevice.HeadsetDeviceState state) {
        f();
    }

    public final void onEventBackgroundThread(@NotNull HMDeviceBatteryEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        Device device = this.device;
        if (deviceType != (device == null ? null : c(device))) {
            return;
        }
        f();
    }

    public final void onEventBackgroundThread(@NotNull HMDeviceConnectionEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        Device device = this.device;
        if (deviceType != (device == null ? null : c(device))) {
            return;
        }
        f();
    }
}
