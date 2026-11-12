package com.mi.fitness.netproxy;

import android.app.Application;
import com.mi.fitness.netproxy.NetProxyComponent;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/mi/fitness/netproxy/NetProxyComponent;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "()V", "netProxyManager", "Lcom/mi/fitness/netproxy/NetProxyManager;", "getNetProxyManager", "()Lcom/mi/fitness/netproxy/NetProxyManager;", "netProxyManager$delegate", "Lkotlin/Lazy;", "phoneNetStateSync2Device", "com/mi/fitness/netproxy/NetProxyComponent$phoneNetStateSync2Device$1", "Lcom/mi/fitness/netproxy/NetProxyComponent$phoneNetStateSync2Device$1;", "initNetProxy", "", "application", "Landroid/app/Application;", "onConnectStart", "did", "", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "isSupportNetProxy", "", "onDisconnect", "Companion", "netproxy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "NetProxy")
public final class NetProxyComponent implements OnDeviceStatusListener {

    @NotNull
    private static final String TAG = "NetProxyComponent";

    /* JADX INFO: renamed from: netProxyManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy netProxyManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ojg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NetProxyComponent.netProxyManager_delegate$lambda$0();
        }
    });

    @NotNull
    private final NetProxyComponent$phoneNetStateSync2Device$1 phoneNetStateSync2Device = new Function1<Boolean, Unit>() { // from class: com.mi.fitness.netproxy.NetProxyComponent$phoneNetStateSync2Device$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public void invoke(boolean isConnect) {
            DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).syncPhoneNetState2Device(Boolean.valueOf(isConnect));
        }
    };

    private final NetProxyManager getNetProxyManager() {
        return (NetProxyManager) this.netProxyManager.getValue();
    }

    private final boolean isSupportNetProxy(String did) {
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(did) & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) == 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetProxyManager netProxyManager_delegate$lambda$0() {
        return new NetProxyManager();
    }

    @ComponentTask(name = "NetProxy", notLaterThan = 4, onMainThread = false, processName = ":device")
    public final void initNetProxy(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Logger.d(TAG, "initNetProxy() called with: application = " + application);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && Intrinsics.areEqual(did, wearableDeviceModel.getDid())) {
            Logger.i(TAG, "onConnectSuccess: support net proxy = " + isSupportNetProxy(did));
            if (isSupportNetProxy(did)) {
                Logger.i(TAG, "onConnectSuccess() called with: net proxy did = " + did);
                getNetProxyManager().start();
                NetworkExtKt.unregisterConnectChangeListener(this.phoneNetStateSync2Device);
                NetworkExtKt.registerConnectChangeListener(this.phoneNetStateSync2Device);
                DeviceSettingsSyncHelper.DefaultImpls.syncPhoneNetState2Device$default(DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE), null, 1, null);
            }
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        if (did == null || did.length() == 0 || !isSupportNetProxy(did)) {
            return;
        }
        getNetProxyManager().stop();
        NetworkExtKt.unregisterConnectChangeListener(this.phoneNetStateSync2Device);
    }
}
