package com.xiaomi.fitness.device.contact.syncer;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vwo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/contact/syncer/BatterySyncer;", "Lcom/xiaomi/fitness/device/contact/syncer/DeviceSyncerInternal;", "", "did", "Lvwo;", "deviceStatus", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "updateDeviceStatus", "(Ljava/lang/String;Lvwo;)Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/hm/health/bt/sdk/data/DeviceBatteryInfo;", DialWidgetType.BATTERY_LEVEL, "buildBatteryInfo", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/sdk/data/DeviceBatteryInfo;)Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "", "type", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "callBack", "", "syncData", "(Ljava/lang/String;ILcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "getType", "()I", "<init>", "()V", "device-contact_release"}, k = 1, mv = {2, 0, 0})
public class BatterySyncer implements DeviceSyncerInternal {
    public BatterySyncer() {
        Logger.i("BatterySyncer", "initBatterySyncer");
    }

    private final BatteryInfo buildBatteryInfo(WearableDeviceModel deviceModel, DeviceBatteryInfo batteryLevel) {
        WearableDeviceInfo deviceInfo = deviceModel.getDeviceInfo();
        BatteryInfo batteryInfo = deviceInfo.getBatteryInfo();
        batteryInfo.setBattery(batteryLevel.getLevel());
        batteryInfo.setChargeFull(batteryLevel.isChargeFull());
        batteryInfo.setCharging(batteryLevel.isCharging());
        batteryInfo.setLastCharge(batteryLevel.getLastCharge());
        deviceInfo.setBatteryInfo(batteryInfo);
        deviceModel.setDeviceInfo(deviceInfo);
        return batteryInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final BatteryInfo updateDeviceStatus(String did, vwo deviceStatus) {
        boolean z;
        vwo.a aVar;
        vwo.a.C1129a c1129a;
        vwo.a aVar2;
        vwo.a aVar3;
        DeviceSyncExtKt.logi("deviceBatteryStatus = " + deviceStatus);
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        Intrinsics.checkNotNull(did);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        int i = (deviceStatus == null || (aVar3 = deviceStatus.c) == null) ? -1 : aVar3.c;
        DeviceSyncExtKt.logi("sync battery success, battery=" + i);
        vwo.a.C1129a c1129a2 = 0;
        c1129a2 = 0;
        if (wearableDeviceModel == null) {
            return null;
        }
        BatteryInfo batteryInfo = new BatteryInfo();
        batteryInfo.setBattery(i);
        batteryInfo.setChargeStatus((deviceStatus == null || (aVar2 = deviceStatus.c) == null) ? 0 : aVar2.d);
        if (deviceStatus != null && (aVar = deviceStatus.c) != null) {
            c1129a = aVar.e;
        }
        if (c1129a2 != 0) {
            BatteryInfo.ChargeInfo chargeInfo = new BatteryInfo.ChargeInfo();
            chargeInfo.setState(c1129a2.c);
            chargeInfo.setTimestamp(c1129a2.d);
            batteryInfo.setChargeInfo(chargeInfo);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(chargeInfo.getTimestamp() * ((long) 1000));
            batteryInfo.setLastCharge(calendar);
            if (batteryInfo.getChargeStatus() == 1) {
                c1129a2 = c1129a;
                z = true;
            } else {
                c1129a2 = c1129a;
                z = false;
            }
            batteryInfo.setCharging(z);
            batteryInfo.setChargeFull(c1129a2.c == 3);
        } else {
            c1129a2 = c1129a;
            batteryInfo.setChargeInfo((BatteryInfo.ChargeInfo) c1129a2);
        }
        WearableDeviceInfo deviceInfo = wearableDeviceModel.getDeviceInfo();
        deviceInfo.setBatteryInfo(batteryInfo);
        wearableDeviceModel.setDeviceInfo(deviceInfo);
        DeviceSyncExtKt.logi("updateDeviceBatteryStatus = " + wearableDeviceModel.getDeviceInfo().getBatteryInfo());
        return batteryInfo;
    }

    @Override // com.xiaomi.fitness.device.contact.syncer.DeviceSyncerInternal
    public int getType() {
        return 3;
    }

    @Override // com.xiaomi.fitness.device.contact.syncer.DeviceSyncerInternal
    public void syncData(@NotNull String did, int type, @Nullable DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("BatterySyncer", "sync batteryData non impl");
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncer
    public void syncData(@NotNull String did, @Nullable final DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            if (callBack != null) {
                callBack.onSyncError(did, getType(), "connot find device with " + did);
                return;
            }
            return;
        }
        Logger.i("BatterySyncer", "sync batteryData isWearos:" + DeviceModelExtKt.isWearOS(wearableDeviceModel));
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                if (callBack != null) {
                    callBack.onSyncSuccess(did, getType(), null);
                    return;
                }
                return;
            } else {
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 1;
                com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.contact.syncer.BatterySyncer.syncData.1
                    private vwo deviceStatus;

                    public final vwo getDeviceStatus() {
                        return this.deviceStatus;
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type, int code) {
                        DeviceSyncExtKt.logi("sync battery error, did=" + did2 + ", type=" + type + ", code=" + code);
                        DeviceSyncCallback deviceSyncCallback = callBack;
                        if (deviceSyncCallback != null) {
                            Intrinsics.checkNotNull(did2);
                            deviceSyncCallback.onSyncError(did2, BatterySyncer.this.getType(), String.valueOf(code));
                        }
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type, SyncResult result) {
                        s7r packet;
                        txo txoVarE;
                        vwo vwoVarS = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.s();
                        this.deviceStatus = vwoVarS;
                        BatteryInfo batteryInfoUpdateDeviceStatus = BatterySyncer.this.updateDeviceStatus(did2, vwoVarS);
                        DeviceSyncCallback deviceSyncCallback = callBack;
                        if (deviceSyncCallback != null) {
                            Intrinsics.checkNotNull(did2);
                            deviceSyncCallback.onSyncSuccess(did2, BatterySyncer.this.getType(), batteryInfoUpdateDeviceStatus);
                        }
                    }

                    public final void setDeviceStatus(vwo vwoVar) {
                        this.deviceStatus = vwoVar;
                    }
                }, 6000);
                return;
            }
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        DeviceBatteryInfo batteryLevel = huaMiApiCaller != null ? huaMiApiCaller.getBatteryLevel() : null;
        DeviceSyncExtKt.logi("sync hua mi battery success, battery=" + (batteryLevel != null ? Integer.valueOf(batteryLevel.getLevel()) : null));
        if (batteryLevel == null) {
            if (callBack != null) {
                callBack.onSyncError(did, getType(), "Battery is null from HuaMi");
            }
        } else if (callBack != null) {
            callBack.onSyncSuccess(did, getType(), buildBatteryInfo(wearableDeviceModel, batteryLevel));
        }
    }
}
