package com.huawei.phdkit;

import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.oqm;
import defpackage.ykx;

/* JADX INFO: loaded from: classes2.dex */
public class DvLiteCoreBinder extends DvLiteBinder.Stub {
    private static final String TAG = "DvLiteCoreBinder";
    IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.huawei.phdkit.DvLiteCoreBinder.4
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            oqm.c().a("binderDied");
            oqm.c().b();
        }
    };

    @Override // com.huawei.phdkit.DvLiteBinder
    public boolean startDiscovery(DiscoveryListener discoveryListener) {
        LogUtil.a(TAG, "startDiscovery enter");
        if (discoveryListener == null) {
            LogUtil.j("startDiscovery", "listener is null");
            return false;
        }
        oqm.c().b(discoveryListener);
        return true;
    }

    @Override // com.huawei.phdkit.DvLiteBinder
    public void sendBluetoothData(DvLiteCommand dvLiteCommand) {
        LogUtil.a(TAG, "sendBluetoothData enter");
        if (dvLiteCommand == null) {
            LogUtil.j(TAG, "command is null");
            return;
        }
        if (dvLiteCommand.getDataContents() == null || dvLiteCommand.getDataContents().length == 0) {
            LogUtil.j(TAG, "command getDataContents is null");
            return;
        }
        String strB = oqm.c().b(dvLiteCommand.getUdid());
        if (strB == null || strB.isEmpty()) {
            LogUtil.j(TAG, "identify is null");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(dvLiteCommand.getServiceId());
        deviceCommand.setCommandID(dvLiteCommand.getCommandId());
        LogUtil.a(TAG, "sendBluetoothData getCommandId", Integer.valueOf(dvLiteCommand.getCommandId()));
        byte[] dataContents = dvLiteCommand.getDataContents();
        deviceCommand.setDataLen(dataContents.length);
        deviceCommand.setDataContent(dataContents);
        deviceCommand.setPriority(dvLiteCommand.getPriority());
        deviceCommand.setmIdentify(strB);
        ykx.c(deviceCommand);
    }

    @Override // com.huawei.phdkit.DvLiteBinder
    public void connectDevice(String str, DataContentListener dataContentListener) {
        if (dataContentListener == null) {
            LogUtil.j(TAG, "listener is null");
        } else {
            oqm.c().c(str, dataContentListener);
        }
    }

    @Override // com.huawei.phdkit.DvLiteBinder
    public void subscribeDevice(String str, DeviceStateListener deviceStateListener) {
        oqm.c().a(str, deviceStateListener);
        if (deviceStateListener != null) {
            try {
                if (deviceStateListener.asBinder() != null) {
                    deviceStateListener.asBinder().linkToDeath(this.deathRecipient, 0);
                }
            } catch (RemoteException unused) {
                LogUtil.e(TAG, "subscribeDevice discoverDevices remoteException");
            }
        }
    }

    @Override // com.huawei.phdkit.DvLiteBinder
    public void unSubscribeDevice(String str, DeviceStateListener deviceStateListener) {
        if (deviceStateListener != null && deviceStateListener.asBinder() != null) {
            deviceStateListener.asBinder().unlinkToDeath(this.deathRecipient, 0);
        }
        oqm.c().a(str);
    }

    @Override // com.huawei.phdkit.DvLiteBinder
    public String getIdentify(String str) {
        return oqm.c().b(str);
    }

    @Override // com.huawei.phdkit.DvLiteBinder
    public void clearDataListener() {
        LogUtil.a(TAG, "clearDataListener enter");
        oqm.c().b();
    }

    @Override // com.huawei.phdkit.DvLiteBinder
    public void clearOneDataListener(String str) {
        LogUtil.a(TAG, "clearOneDataListener enter");
        oqm.c().c(str);
    }
}
