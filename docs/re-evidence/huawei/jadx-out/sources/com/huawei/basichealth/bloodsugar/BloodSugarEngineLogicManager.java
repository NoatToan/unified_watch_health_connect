package com.huawei.basichealth.bloodsugar;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import defpackage.ecu;
import defpackage.eel;
import defpackage.njy;
import defpackage.xiu;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BloodSugarEngineLogicManager extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BloodSugarEngineLogicListener f5285b;

    public interface BloodSugarEngineLogicListener {
        void onDeviceConnected(String str);

        void onDeviceDisconnected();

        void onReceiveDeviceCommand(byte[] bArr);
    }

    public BloodSugarEngineLogicManager(Context context) {
        super(context);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("BloodSugarEngineLogicManager", "backCode = ", Integer.valueOf(i));
        if (xiuVar == null) {
            LogUtil.j("BloodSugarEngineLogicManager", "onReceiveDeviceCommand message is null");
        } else {
            this.f5285b.onReceiveDeviceCommand(xiuVar.b());
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.BLOOD_SUGAR_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.example.mqhomswatch";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "com.example.mqhomswatch_BEX3m1geBbqx/kae1N5iJduBqpzyc80Q7wP/9FbJKsvwPpnUUJjgoH6EuUxzVYhKnKatOTUsJTdSdpEb+Ms5+dM=";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("BloodSugarEngineLogicManager", "connectState ", connectState);
        if (connectState == ConnectState.CONNECTED) {
            String strA = a(deviceInfo);
            this.f5285b.onDeviceConnected(strA);
            LogUtil.a("BloodSugarEngineLogicManager", "onDeviceConnectionChange = CONNECTED, deviceUuid = ", strA);
        } else {
            this.f5285b.onDeviceDisconnected();
            LogUtil.j("BloodSugarEngineLogicManager", "onDeviceConnectionChange=", connectState);
        }
    }

    public String a(DeviceInfo deviceInfo) {
        if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getSecurityUuid())) {
            String str = deviceInfo.getSecurityUuid() + "#ANDROID21";
            LogUtil.a("BloodSugarEngineLogicManager", "getDeviceUuid = ", str);
            return str;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "BloodSugarEngineLogicManager");
        if (!njy.e(deviceList)) {
            DeviceInfo deviceInfo2 = deviceList.get(0);
            if (!eel.d(deviceInfo2.getProductType())) {
                String str2 = deviceInfo2.getSecurityUuid() + "#ANDROID21";
                LogUtil.a("BloodSugarEngineLogicManager", "getDeviceUuid from list = ", str2);
                return str2;
            }
        }
        return null;
    }

    public void a(PingCallback pingCallback) {
        super.pingComand(pingCallback, "com.example.mqhomswatch");
    }

    public void b(byte[] bArr) {
        sendComand(new xiu.c().a(bArr).c(), new b());
    }

    static class b implements SendCallback {
        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendProgress(long j) {
        }

        private b() {
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendResult(int i) {
            LogUtil.a("BloodSugarEngineLogicManager", "sendCommandResult=", Integer.valueOf(i));
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onFileTransferReport(String str) {
            LogUtil.a("BloodSugarEngineLogicManager", "sendCommand onFileTransferReport transferWay: ", str);
        }
    }

    public void e(BloodSugarEngineLogicListener bloodSugarEngineLogicListener) {
        this.f5285b = bloodSugarEngineLogicListener;
    }
}
