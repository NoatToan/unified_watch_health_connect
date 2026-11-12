package com.xiaomi.fitness.sync.init;

import com.facebook.react.bridge.BaseJavaModule;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveKt;
import com.xiaomi.fitness.sync.BleDataHandler;
import com.xiaomi.fitness.sync.SyncJobService;
import com.xiaomi.fitness.sync.WifiDataHandler;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.init.SyncComponent;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sync/init/SyncComponent;", "", "<init>", "()V", "isHandlerAdded", "", "()Z", "setHandlerAdded", "(Z)V", "bleDataHandler", "Lcom/xiaomi/fitness/sync/BleDataHandler;", "getBleDataHandler", "()Lcom/xiaomi/fitness/sync/BleDataHandler;", "bleDataHandler$delegate", "Lkotlin/Lazy;", "wifiDataHandler", "Lcom/xiaomi/fitness/sync/WifiDataHandler;", "getWifiDataHandler", "()Lcom/xiaomi/fitness/sync/WifiDataHandler;", "wifiDataHandler$delegate", "initSync", "", "reportDeviceSyncActive", "did", "", "backStageConnect", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = BaseJavaModule.METHOD_TYPE_SYNC)
public final class SyncComponent {
    public static final int SYNC_WIFI_TIME = 300000;
    private boolean isHandlerAdded;

    /* JADX INFO: renamed from: bleDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bleDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lso
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyncComponent.bleDataHandler_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: wifiDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wifiDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mso
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyncComponent.wifiDataHandler_delegate$lambda$1();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final BleDataHandler bleDataHandler_delegate$lambda$0() {
        return new BleDataHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifiDataHandler getWifiDataHandler() {
        return (WifiDataHandler) this.wifiDataHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSync$lambda$2(SyncComponent this$0, String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_RESUME)) {
            AnyExtKt.io$default(null, new SyncComponent$initSync$1$1(this$0, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportDeviceSyncActive(String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return;
        }
        DeviceManagerExtKt.reportDeviceActive(wearableDeviceModel, DeviceActiveKt.DEVICE_SYNC_DATA_ACTIVATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WifiDataHandler wifiDataHandler_delegate$lambda$1() {
        return new WifiDataHandler();
    }

    @ComponentTask(multiProcess = false, notLaterThan = 2, processName = ":device")
    public final void backStageConnect() {
        Logger.d("SyncComponent", "initSync in device process");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(2, getBleDataHandler());
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.sync.init.SyncComponent.backStageConnect.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onBind(String did, boolean isRebind) {
                super.onBind(did, isRebind);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
                super.onConnectFailure(did, errorCode, retryTimes);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
                super.onConnectStart(did);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                super.onConnectSuccess(did);
                Logger.d("SyncComponent", "onConnectSuccess" + did);
                AnyExtKt.io$default(null, new SyncComponent$backStageConnect$1$onConnectSuccess$1(null), 1, null);
                if (SyncComponent.this.getIsHandlerAdded()) {
                    return;
                }
                SyncComponent.this.setHandlerAdded(true);
                DeviceContact.Companion companion = DeviceContact.INSTANCE;
                DeviceSyncExtKt.getInstance(companion).addDataHandler(16, SyncComponent.this.getBleDataHandler());
                DeviceSyncExtKt.getInstance(companion).addDataHandler(10, SyncComponent.this.getBleDataHandler());
                DeviceSyncExtKt.getInstance(companion).addDataHandler(11, SyncComponent.this.getBleDataHandler());
                DeviceSyncExtKt.getInstance(companion).addDataHandler(12, SyncComponent.this.getBleDataHandler());
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                if (isRemoved) {
                    Logger.d("SyncComponent", "device unbind destroy did:" + did);
                    SyncPreference syncPreference = SyncPreference.INSTANCE;
                    syncPreference.setSyncWeatherLastTime(did == null ? "" : did, 0L);
                    if (did == null) {
                        did = "";
                    }
                    syncPreference.setSyncWeatherLocationLastTime(did, 0L);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                super.onDisconnect(did);
                Logger.d("SyncComponent", "onDisconnect" + did);
                if (did == null || did.length() == 0) {
                    return;
                }
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did)) == null) {
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onInit(String did, boolean isReadded) {
                super.onInit(did, isReadded);
            }
        });
    }

    @NotNull
    public final BleDataHandler getBleDataHandler() {
        return (BleDataHandler) this.bleDataHandler.getValue();
    }

    @ComponentTask(notEarlierThan = 2, notLaterThan = 3, onMainThread = true)
    public final void initSync() {
        Logger.d("SyncComponent", "initSync");
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceSyncExtKt.getInstance(companion).addDataHandler(2, getWifiDataHandler());
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new Function2() { // from class: kso
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SyncComponent.initSync$lambda$2(this.f24268a, (String) obj, (String) obj2);
            }
        });
        DeviceSyncExtKt.getInstance(companion).addSyncStateListener(new SyncStateListener() { // from class: com.xiaomi.fitness.sync.init.SyncComponent.initSync.2
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.d("SyncComponent", "onFinish");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i("SyncComponent", "onStart scheduleOnce");
                SyncJobService.INSTANCE.scheduleOnce();
                SyncComponent.this.reportDeviceSyncActive(did);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.d("SyncComponent", "onSyncing");
            }
        });
    }

    /* JADX INFO: renamed from: isHandlerAdded, reason: from getter */
    public final boolean getIsHandlerAdded() {
        return this.isHandlerAdded;
    }

    public final void setHandlerAdded(boolean z) {
        this.isHandlerAdded = z;
    }
}
