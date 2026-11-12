package com.xiaomi.fitness.sport_manager;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportManagerComponent;
import com.xiaomi.fitness.sport_manager.device.gym.GymRetryStrategy;
import com.xiaomi.fitness.sport_manager.source.towear.SportConfigProvider;
import com.xiaomi.fitness.sport_manager.state.data.HuamiDataReceive;
import com.xiaomi.fitness.sport_manager.state.data.IAccessoriesState;
import com.xiaomi.wearable.hm.r;
import defpackage.c6o;
import defpackage.f2o;
import defpackage.i7r;
import defpackage.jdn;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/SportManagerComponent;", "", "<init>", "()V", "init", "", "addDeviceSportDataListener", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "did", "", "syncBestSportData", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "sport-manager")
public final class SportManagerComponent {

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.SportManagerComponent$init$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/sport_manager/SportManagerComponent$init$1", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "onConnectStart", "", "did", "", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C32001 implements OnDeviceStatusListener {
        public C32001() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onConnectSuccess$lambda$0(Boolean bool) {
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "cur device is support Sport : " + bool);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "onConnectFailure , did: " + did + " , errorCode : " + errorCode + " , retryTimes : " + retryTimes);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "onConnectStart , did : " + did);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            HuamiApiCaller huaMiApiCaller;
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "onConnectSuccess , did : " + did);
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did == null ? "" : did);
            if ((wearableDeviceModel != null && DeviceModelExtKt.isBle(wearableDeviceModel)) || (wearableDeviceModel != null && DeviceModelExtKt.isBluetooth(wearableDeviceModel))) {
                FitnessLogUtils.i(SportManagerComponentKt.TAG, "sync device sport state");
                f2o.x().C0();
                SportManagerComponent.this.syncBestSportData();
            } else if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel) && (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) != null) {
                huaMiApiCaller.enableRealtimeStep(false);
            }
            if (wearableDeviceModel != null) {
                com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.isSupportLaunchSport(wearableDeviceModel, did != null ? did : "", 1, new i7r() { // from class: tqn
                    @Override // defpackage.i7r
                    public final void a(Boolean bool) {
                        SportManagerComponent.C32001.onConnectSuccess$lambda$0(bool);
                    }
                });
            }
            SportManagerComponent.this.addDeviceSportDataListener(wearableDeviceModel, did);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "onDisconnect , did :" + did);
            if (SportDeviceModel.INSTANCE.isAccessoryDevice(did == null ? "" : did)) {
                FitnessLogUtils.i(SportManagerComponentKt.TAG, "accessory device disconnect , did:" + did);
                f2o.x().r().accessoriesRemove(did == null ? "" : did);
            }
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            if (did == null) {
                did = "";
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
            if ((wearableDeviceModel == null || !DeviceModelExtKt.isBle(wearableDeviceModel)) && (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel))) {
                return;
            }
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "sync device sport state");
            f2o.x().k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDeviceSportDataListener(WearableDeviceModel deviceModel, String did) {
        if ((deviceModel != null && DeviceModelExtKt.isBluetooth(deviceModel)) || ((deviceModel != null && DeviceModelExtKt.isBle(deviceModel)) || ((deviceModel != null && DeviceModelExtKt.isLocalDevice(deviceModel)) || (deviceModel != null && DeviceModelExtKt.isWearOS(deviceModel))))) {
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "SportWearReceiver is init");
            if (did == null) {
                did = "";
            }
            c6o.e(did).j();
        }
        if (deviceModel == null || !DeviceModelExtKt.isHuaMi(deviceModel)) {
            return;
        }
        String mac = deviceModel.getDeviceInfo().getMac();
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(mac != null ? mac : "");
        if (huaMiApiCaller == null) {
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "huamiApiCaller is null");
        } else {
            if (!huaMiApiCaller.isConnected()) {
                FitnessLogUtils.i(SportManagerComponentKt.TAG, "huami device is not connect");
                return;
            }
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "huami device is connected");
            huaMiApiCaller.addLFEventCallback(HuamiDataReceive.INSTANCE.get());
            huaMiApiCaller.setStepListener(new r.a() { // from class: com.xiaomi.fitness.sport_manager.SportManagerComponent.addDeviceSportDataListener.1
                @Override // com.xiaomi.wearable.hm.r
                public void onStep(int step) {
                    Logger.d(SportManagerComponentKt.TAG, "onStep() called with: step = " + step);
                    jdn.h().g().s(step);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncBestSportData() {
        SportConfigProvider.INSTANCE.get().setBestSportData();
    }

    @ComponentTask(multiProcess = false, notLaterThan = 2, processName = ":device")
    public final void init() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(GymRetryStrategy.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i(SportManagerComponentKt.TAG, "backStageConnect()");
            addDeviceSportDataListener(wearableDeviceModel, wearableDeviceModel.getDid());
        }
        System.setProperty("rx2.purge-period-seconds", "3600");
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(new C32001());
        DeviceManagerExtKt.getInstance(companion).addAccessoryDeviceStateListener(new OnAccessoryDeviceStateListener() { // from class: com.xiaomi.fitness.sport_manager.SportManagerComponent.init.2
            @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
            public void onAccessoryDeviceModeChange(String did, int mode, boolean fromApp) {
                FitnessLogUtils.i(SportManagerComponentKt.TAG, "onAccessoryDeviceModeChange , mode:" + mode + " , isAccessoryDevice:" + SportDeviceModel.INSTANCE.isAccessoryDevice(did == null ? "" : did) + " , did:" + did + " , fromApp:" + fromApp);
                if (mode == 0 && f2o.x().W()) {
                    f2o.x().r().accessoriesRemove(did == null ? "" : did);
                    IAccessoriesState iAccessoriesStateR = f2o.x().r();
                    if (did == null) {
                        did = "";
                    }
                    iAccessoriesStateR.switchMode(did);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
            public void onAccessoryDeviceModeDuplicate(String did, int mode, boolean fromApp) {
            }
        });
    }
}
