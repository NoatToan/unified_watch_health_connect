package com.xiaomi.hm.health.nfc.door;

import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.ui.MutexLoginActivity;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/nfc/door/NfcDoorToolkits;", "Lcom/huami/wallet/accessdoor/di/koin/INfcDoorToolkits;", "Lorg/koin/core/component/KoinComponent;", "", "isLogin", "isMainlandUser", "isMutexLogin", "isMutexTopStack", "isSupportNfc", "", "getBindDeviceDisplayName", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "c", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NfcDoorToolkits implements INfcDoorToolkits, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX WARN: Multi-variable type inference failed */
    public NfcDoorToolkits() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.nfc.door.NfcDoorToolkits$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
    }

    private final HMBaseDevice a() {
        return HMDeviceManager.getInstance().getDevice(c());
    }

    private final DeviceUtilsApi b() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final HMDeviceType c() {
        return HMDeviceManager.getInstance().getMajorDeviceType();
    }

    @Override // com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits
    @Nullable
    public String getBindDeviceDisplayName() {
        DeviceInfo deviceInfo;
        HMBaseDevice hMBaseDeviceA = a();
        HMDeviceSource deviceSource = (hMBaseDeviceA == null || (deviceInfo = hMBaseDeviceA.getDeviceInfo()) == null) ? null : deviceInfo.getDeviceSource();
        if (deviceSource == null) {
            return null;
        }
        return b().getDeviceDescription(deviceSource);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits
    public boolean isLogin() {
        return !HMLoginManager.isUnInit();
    }

    @Override // com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits
    public boolean isMainlandUser() {
        return HMLoginManager.isMainlandUser();
    }

    @Override // com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits
    public boolean isMutexLogin() {
        return HMLogoutManager.isMutexLogin();
    }

    @Override // com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits
    public boolean isMutexTopStack() {
        boolean z = BraceletForegroundCallBack.getTopActivity() instanceof MutexLoginActivity;
        return z || z;
    }

    @Override // com.huami.wallet.accessdoor.di.koin.INfcDoorToolkits
    public boolean isSupportNfc() {
        Device currentDevice = DeviceManager.getManager(BraceletApp.getContext()).getCurrentDevice();
        Boolean boolValueOf = currentDevice == null ? null : Boolean.valueOf(DeviceUtil.isSupportNFCDoor(currentDevice));
        return boolValueOf == null ? NfcDeviceConfigKt.hasFeatureNfcDoorDevice() : boolValueOf.booleanValue();
    }
}
