package com.xiaomi.fitness.sport_eco_manager;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.sport_eco_manager.SportEcoManagerComponent;
import com.xiaomi.fitness.sport_eco_manager.device.gym.GymRetryStrategy;
import com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport_eco_manager.source.towear.SportConfigProvider;
import com.xiaomi.fitness.sport_eco_manager.state.data.HuamiDataReceive;
import com.xiaomi.wearable.hm.r;
import defpackage.d6o;
import defpackage.g2o;
import defpackage.j7r;
import defpackage.kdn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/SportEcoManagerComponent;", "", "<init>", "()V", "init", "", "addDeviceSportDataListener", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "did", "", "syncBestSportData", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "sport-eco-manager")
public final class SportEcoManagerComponent {

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.SportEcoManagerComponent$init$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J*\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/xiaomi/fitness/sport_eco_manager/SportEcoManagerComponent$init$1", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "onConnectStart", "", "did", "", "mac", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C31791 implements OnEcoDeviceStatusListener {
        public C31791() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onConnectSuccess$lambda$0(Boolean bool) {
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "cur device is support Sport : " + bool);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectFailure(String did, String mac, int errorCode, int retryTimes) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "onConnectFailure , did: " + did + " , errorCode : " + errorCode + " , retryTimes : " + retryTimes);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectStart(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "onConnectStart , did : " + did);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectSuccess(String did, String mac) {
            HuamiApiCaller huaMiApiCaller;
            Intrinsics.checkNotNullParameter(mac, "mac");
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "onConnectSuccess , did : " + did);
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did == null ? "" : did);
            if ((ecoDeviceModel != null && EcoDeviceModelExtKt.isBle(ecoDeviceModel)) || (ecoDeviceModel != null && EcoDeviceModelExtKt.isBluetooth(ecoDeviceModel))) {
                FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "sync device sport state");
                g2o.s().n0();
                SportEcoManagerComponent.this.syncBestSportData();
            } else if (ecoDeviceModel != null && EcoDeviceModelExtKt.isHuaMi(ecoDeviceModel) && (huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(EcoDeviceModelExtKt.getMac(ecoDeviceModel))) != null) {
                huaMiApiCaller.enableRealtimeStep(false);
            }
            if (ecoDeviceModel != null) {
                DeviceModelExtKt.isSupportLaunchSport(ecoDeviceModel, 1, new j7r() { // from class: gln
                    @Override // defpackage.j7r
                    public final void a(Boolean bool) {
                        SportEcoManagerComponent.C31791.onConnectSuccess$lambda$0(bool);
                    }
                });
            }
            SportEcoManagerComponent.this.addDeviceSportDataListener(ecoDeviceModel, did);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onDisconnect(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "onDisconnect , did :" + did);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDeviceSportDataListener(EcoDeviceModel deviceModel, String did) {
        if ((deviceModel != null && EcoDeviceModelExtKt.isBluetooth(deviceModel)) || ((deviceModel != null && EcoDeviceModelExtKt.isBle(deviceModel)) || (deviceModel != null && EcoDeviceModelExtKt.isLocalDevice(deviceModel)))) {
            if (did == null) {
                did = "";
            }
            d6o.a(did).b();
        }
        if (deviceModel == null || !EcoDeviceModelExtKt.isHuaMi(deviceModel)) {
            return;
        }
        String mac = deviceModel.getDeviceInfo().getMac();
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(mac != null ? mac : "");
        if (huaMiApiCaller == null) {
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "huamiApiCaller is null");
        } else {
            if (!huaMiApiCaller.isConnected()) {
                FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "huami device is not connect");
                return;
            }
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "huami device is connected");
            huaMiApiCaller.addLFEventCallback(HuamiDataReceive.INSTANCE.get());
            huaMiApiCaller.setStepListener(new r.a() { // from class: com.xiaomi.fitness.sport_eco_manager.SportEcoManagerComponent.addDeviceSportDataListener.1
                @Override // com.xiaomi.wearable.hm.r
                public void onStep(int step) {
                    Logger.d(SportEcoManagerComponentKt.TAG, "onStep() called with: step = " + step);
                    kdn.f().e().i(step);
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
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(GymRetryStrategy.INSTANCE);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i(SportEcoManagerComponentKt.TAG, "backStageConnect()");
            addDeviceSportDataListener(ecoDeviceModel, ecoDeviceModel.getDid());
        }
        System.setProperty("rx2.purge-period-seconds", "3600");
        EcoDeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(new C31791());
    }
}
