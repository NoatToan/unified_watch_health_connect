package com.huawei.hwdevice.phoneprocess.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cku;
import defpackage.cpl;
import defpackage.ecu;
import defpackage.mkb;
import defpackage.mkn;
import defpackage.nfm;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HandleIntentService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("type_time_change", -1);
                ReleaseLogUtil.d("HandleIntentService", "type_time_change: ", Integer.valueOf(intExtra));
                if (intExtra == 1000) {
                    nfm.d().a();
                    a();
                    e();
                } else {
                    BroadcastManagerUtil.a(this, intent);
                }
            } catch (NullPointerException e) {
                LogUtil.e("HandleIntentService", "onStartCommand Exception error,", ExceptionUtils.c(e));
            }
        }
        return 2;
    }

    private void e() {
        try {
            if (CommonUtil.ap()) {
                StringBuilder sb = new StringBuilder("data sync: ");
                SystemInfo.d(sb);
                xjt.b(sb.toString());
            }
        } catch (Exception e) {
            ReleaseLogUtil.d("HandleIntentService", "dataSyncRiskEvent  Exception", ExceptionUtils.c(e));
        }
    }

    private void a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HandleIntentService");
        LogUtil.a("HandleIntentService", "deviceList size(): ", Integer.valueOf(deviceList.size()));
        for (DeviceInfo deviceInfo : deviceList) {
            LogUtil.a("HandleIntentService", "deviceInfo address: ", cpl.e(deviceInfo.getDeviceIdentify()));
            if (deviceInfo.getProductType() == 275) {
                LogUtil.a("HandleIntentService", "no need send local time");
            } else {
                DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
                if (deviceCapabilityC != null && deviceCapabilityC.isSupportTimeSetting()) {
                    LogUtil.a("HandleIntentService", "updateTimeService support time set.");
                    byte[] bArrC = cku.c();
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(1);
                    deviceCommand.setCommandID(5);
                    deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                    deviceCommand.setDataContent(bArrC);
                    deviceCommand.setDataLen(bArrC.length);
                    LogUtil.a("HandleIntentService", "updateTimeService, deviceCommand: ", deviceCommand.toString());
                    mkn.e().sendDeviceData(deviceCommand);
                }
            }
        }
    }
}
