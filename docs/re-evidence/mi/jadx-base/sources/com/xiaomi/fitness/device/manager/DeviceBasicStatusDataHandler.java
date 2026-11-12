package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import defpackage.owo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vwo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceBasicStatusDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "Lvwo;", "deviceStatus", "", "updateDeviceStatus", "(Ljava/lang/String;Lvwo;)V", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "callback", "syncBattery", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "TAG", "Ljava/lang/String;", "lastChargeStatus", "I", "getLastChargeStatus", "()I", "setLastChargeStatus", "(I)V", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceBasicStatusDataHandler extends DataHandlerWrapper {

    @NotNull
    public static final DeviceBasicStatusDataHandler INSTANCE = new DeviceBasicStatusDataHandler();

    @NotNull
    public static final String TAG = "DeviceBasicStatusDataHandler";
    private static int lastChargeStatus;

    private DeviceBasicStatusDataHandler() {
    }

    public static /* synthetic */ void syncBattery$default(DeviceBasicStatusDataHandler deviceBasicStatusDataHandler, String str, DeviceSyncCallback deviceSyncCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            deviceSyncCallback = null;
        }
        deviceBasicStatusDataHandler.syncBattery(str, deviceSyncCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateDeviceStatus(String did, vwo deviceStatus) {
        vwo.a.C1129a c1129a;
        boolean z;
        vwo.a aVar;
        vwo.a.C1129a c1129a2;
        vwo.a aVar2;
        vwo.a aVar3;
        Logger.i(TAG, "deviceBatteryStatus = " + deviceStatus);
        WearableDeviceManager deviceManagerExtKt = com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        Intrinsics.checkNotNull(did);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        int i = (deviceStatus == null || (aVar3 = deviceStatus.c) == null) ? -1 : aVar3.c;
        if (wearableDeviceModel != null) {
            BatteryInfo batteryInfo = new BatteryInfo();
            batteryInfo.setBattery(i);
            batteryInfo.setChargeStatus((deviceStatus == null || (aVar2 = deviceStatus.c) == null) ? 0 : aVar2.d);
            if (deviceStatus == null || (aVar = deviceStatus.c) == null) {
                c1129a = 0;
            } else {
                c1129a2 = aVar.e;
            }
            if (c1129a != 0) {
                BatteryInfo.ChargeInfo chargeInfo = new BatteryInfo.ChargeInfo();
                chargeInfo.setState(c1129a.c);
                chargeInfo.setTimestamp(c1129a.d);
                batteryInfo.setChargeInfo(chargeInfo);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(chargeInfo.getTimestamp() * ((long) 1000));
                batteryInfo.setLastCharge(calendar);
                if (batteryInfo.getChargeStatus() == 1) {
                    c1129a = c1129a2;
                    z = true;
                } else {
                    c1129a = c1129a2;
                    z = false;
                }
                batteryInfo.setCharging(z);
                batteryInfo.setChargeFull(c1129a.c == 3);
            } else {
                c1129a = c1129a2;
                batteryInfo.setChargeInfo((BatteryInfo.ChargeInfo) c1129a);
            }
            WearableDeviceInfo deviceInfo = wearableDeviceModel.getDeviceInfo();
            deviceInfo.setBatteryInfo(batteryInfo);
            wearableDeviceModel.setDeviceInfo(deviceInfo);
            Logger.i(TAG, "updateDeviceBatteryStatus = " + wearableDeviceModel.getDeviceInfo().getBatteryInfo());
        }
    }

    public final int getLastChargeStatus() {
        return lastChargeStatus;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet == null) {
            return false;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) && packet.f == 79) {
            owo owoVarC = packet.E().C();
            Logger.i(TAG, "REPORT_BASIC_STATUS = " + owoVarC + "，lastChargeStatus = " + lastChargeStatus);
            if (owoVarC.c != lastChargeStatus) {
                syncBattery$default(this, did, null, 2, null);
                lastChargeStatus = owoVarC.c;
            }
        }
        return false;
    }

    public final void setLastChargeStatus(int i) {
        lastChargeStatus = i;
    }

    public final void syncBattery(@NotNull String did, @Nullable final DeviceSyncCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "callback = " + callback);
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 1;
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.manager.DeviceBasicStatusDataHandler.syncBattery.1
            private int battery;
            private vwo deviceStatus;

            public final int getBattery() {
                return this.battery;
            }

            public final vwo getDeviceStatus() {
                return this.deviceStatus;
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(DeviceBasicStatusDataHandler.TAG, "sync battery error, did=" + did2 + ", type=" + type + ", code=" + code);
                DeviceSyncCallback deviceSyncCallback = callback;
                if (deviceSyncCallback != null) {
                    Intrinsics.checkNotNull(did2);
                    deviceSyncCallback.onSyncError(did2, 3, String.valueOf(code));
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                s7r packet;
                txo txoVarE;
                s7r packet2;
                txo txoVarE2;
                vwo vwoVarS;
                vwo.a aVar;
                this.battery = (result == null || (packet2 = result.getPacket()) == null || (txoVarE2 = packet2.E()) == null || (vwoVarS = txoVarE2.s()) == null || (aVar = vwoVarS.c) == null) ? -1 : aVar.c;
                WearableDeviceInfo deviceInfo = null;
                this.deviceStatus = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.s();
                Logger.i(DeviceBasicStatusDataHandler.TAG, "sync battery success, battery=" + this.battery);
                WearableDeviceManager deviceManagerExtKt = com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                Intrinsics.checkNotNull(did2);
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did2);
                if (wearableDeviceModel != null) {
                    deviceInfo = wearableDeviceModel.getDeviceInfo();
                    Intrinsics.checkNotNull(deviceInfo);
                    deviceInfo.setBattery(this.battery);
                    wearableDeviceModel.setDeviceInfo(deviceInfo);
                }
                DeviceBasicStatusDataHandler.INSTANCE.updateDeviceStatus(did2, this.deviceStatus);
                DeviceSyncCallback deviceSyncCallback = callback;
                if (deviceSyncCallback != null) {
                    deviceSyncCallback.onSyncSuccess(did2, 3, deviceInfo);
                }
            }

            public final void setBattery(int i) {
                this.battery = i;
            }

            public final void setDeviceStatus(vwo vwoVar) {
                this.deviceStatus = vwoVar;
            }
        }, 6000);
    }
}
