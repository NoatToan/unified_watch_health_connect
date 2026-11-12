package com.huawei.hwservicesmgr;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.eei;
import defpackage.eel;
import defpackage.eey;
import defpackage.mkf;
import defpackage.nio;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.MagicBuild;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ExternalPhoneService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        byte b2;
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            LogUtil.j("ExternalPhoneService", "onStartCommand intent is null");
            e(i2);
            return 2;
        }
        LogUtil.a("ExternalPhoneService", "ExternalPhoneService onStartCommand:", intent);
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            LogUtil.j("ExternalPhoneService", "error, action is null");
            e(i2);
            return 2;
        }
        action.hashCode();
        switch (action) {
            case "com.huawei.synergy.AUTH_STATE_REQ":
                b2 = 0;
                break;
            case "alarm_clock_msg_from_device":
                b2 = 1;
                break;
            case "com.hihonor.synergy.AUTH_STATE_REQ":
                b2 = 2;
                break;
            case "com.huawei.synergy.NOTIFY_MSG":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            d(intent);
        } else if (b2 == 1) {
            e(intent);
        } else if (b2 == 2) {
            d(intent);
        } else if (b2 != 3) {
            LogUtil.j("ExternalPhoneService", "onStartCommand case default");
        } else {
            a(intent);
        }
        e(i2);
        return 2;
    }

    private void e(int i) {
        if (CommonUtil.ap()) {
            LogUtil.a("ExternalPhoneService", "stopExternalPhoneService startId:", Integer.valueOf(i));
            stopSelf(i);
        }
    }

    private void e(Intent intent) {
        int intExtra = intent.getIntExtra("notification_id", -1);
        int intExtra2 = intent.getIntExtra("action", -1);
        LogUtil.a("ExternalPhoneService", "processAlarmClockMsgToSynergy notificationId = " + intExtra, "action = " + intExtra2);
        Intent intent2 = new Intent("com.huawei.synergy.CTROL_ALARM_MSG");
        intent2.setComponent(new ComponentName("com.huawei.synergy", "com.huawei.synergy.server.QueryService"));
        intent2.putExtra("notification_id", intExtra);
        intent2.putExtra("action", intExtra2);
        try {
            startService(intent2);
            LogUtil.a("ExternalPhoneService", "processAlarmClockMsgToSynergy startService");
        } catch (IllegalStateException unused) {
            LogUtil.e("ExternalPhoneService", "processAlarmClockMsgToSynergy IllegalStateException");
        } catch (SecurityException unused2) {
            LogUtil.e("ExternalPhoneService", "processAlarmClockMsgToSynergy SecurityException");
        }
    }

    private void a(Intent intent) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "ExternalPhoneService");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_ExternalPhoneService", "processSynergyNotifyMsgToDevice deviceInfo is null");
            return;
        }
        if (!eey.d(deviceInfo, 200)) {
            ReleaseLogUtil.e("R_ExternalPhoneService", "processSynergyNotifyMsgToDevice device is not support alarm clock process");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("ExternalPhoneService", "processSynergyNotifyMsgToDevice connectedMac = ", CommonUtil.n(deviceIdentify));
        if (eei.d(nio.e(deviceIdentify)) != 1) {
            ReleaseLogUtil.e("R_ExternalPhoneService", "processSynergyNotifyMsgToDevice alarm switch is closed");
        } else {
            c(intent, deviceIdentify);
        }
    }

    private void c(Intent intent, String str) {
        boolean z;
        String stringExtra = intent.getStringExtra("macList");
        if (!TextUtils.isEmpty(stringExtra)) {
            String[] strArrSplit = stringExtra.split(";");
            z = false;
            int i = 0;
            while (true) {
                if (i >= strArrSplit.length) {
                    z = true;
                    break;
                } else if (TextUtils.equals(strArrSplit[i], str)) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            z = true;
            break;
        }
        ReleaseLogUtil.d("R_ExternalPhoneService", "sendAlarmToDevice isSendClockToDevice = ", Boolean.valueOf(z));
        if (!z) {
            ReleaseLogUtil.d("R_ExternalPhoneService", "sendAlarmToDevice is not need send to device");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("attribute");
        StringBuffer stringBuffer = new StringBuffer();
        DeviceCommand deviceCommand = new DeviceCommand();
        int i2 = bundleExtra.getInt("type", -1);
        LogUtil.a("ExternalPhoneService", "sendAlarmToDevice type = ", Integer.valueOf(i2));
        if (i2 == 0) {
            b(bundleExtra, stringBuffer, deviceCommand);
        } else if (i2 == 1 || i2 == 2) {
            d(bundleExtra, stringBuffer, deviceCommand);
        } else {
            LogUtil.j("ExternalPhoneService", "sendAlarmToDevice unKnow type");
            return;
        }
        byte[] bArrA = HEXUtils.a(stringBuffer.toString());
        deviceCommand.setDataContent(bArrA);
        deviceCommand.setDataLen(bArrA.length);
        LogUtil.a("ExternalPhoneService", "sendAlarmToDevice command = ", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void d(Bundle bundle, StringBuffer stringBuffer, DeviceCommand deviceCommand) {
        String str;
        long j = bundle.getInt("notification_id", -1);
        LogUtil.a("ExternalPhoneService", "formatCommandByStopAndPause alarmId = ", Long.valueOf(j));
        String str2 = "";
        if (j == -1) {
            str = "";
        } else {
            String strD = HEXUtils.d(j);
            str = HEXUtils.b(1) + HEXUtils.b(strD.length() / 2) + strD;
        }
        int i = bundle.getInt("type", -1);
        LogUtil.a("ExternalPhoneService", "formatCommandByStopAndPause alarmAction = ", Integer.valueOf(i));
        if (i != -1) {
            String strB = HEXUtils.b(i);
            str2 = HEXUtils.b(2) + HEXUtils.b(strB.length() / 2) + strB;
        }
        stringBuffer.append(str).append(str2);
        deviceCommand.setServiceID(8);
        deviceCommand.setCommandID(10);
    }

    private void b(Bundle bundle, StringBuffer stringBuffer, DeviceCommand deviceCommand) {
        String str;
        String str2;
        String str3;
        String str4;
        LogUtil.a("ExternalPhoneService", "formatCommandByOpen 5.8.9 start");
        int i = bundle.getInt("notification_id", -1);
        LogUtil.a("ExternalPhoneService", "formatCommandByOpen notificationId = ", Integer.valueOf(i));
        String str5 = "";
        if (i == -1) {
            str = "";
        } else {
            String strD = HEXUtils.d(i);
            str = HEXUtils.b(1) + HEXUtils.b(strD.length() / 2) + strD;
        }
        String string = bundle.getString("title");
        if (!TextUtils.isEmpty(string)) {
            String strC = HEXUtils.c(string);
            str2 = HEXUtils.b(2) + HEXUtils.b(strC.length() / 2) + strC;
        } else {
            LogUtil.a("ExternalPhoneService", "formatCommandByOpen alarm title is empty.");
            str2 = "";
        }
        long j = bundle.getLong("time", -1L);
        LogUtil.a("ExternalPhoneService", "formatCommandByOpen alarmTime = " + j);
        if (j == -1) {
            str3 = "";
        } else {
            String strB = HEXUtils.b(j);
            str3 = HEXUtils.b(3) + HEXUtils.b(strB.length() / 2) + strB;
        }
        int i2 = bundle.getInt("snooze_delay", -1);
        LogUtil.a("ExternalPhoneService", "formatCommandByOpen snoozeDelay = ", Integer.valueOf(i2));
        if (i2 == -1) {
            str4 = "";
        } else {
            String strB2 = HEXUtils.b(i2);
            str4 = HEXUtils.b(4) + HEXUtils.b(strB2.length() / 2) + strB2;
        }
        int i3 = bundle.getInt("snooze_count", -1);
        LogUtil.a("ExternalPhoneService", "formatCommandByOpen snoozeCount = ", Integer.valueOf(i3));
        if (i3 != -1) {
            String strB3 = HEXUtils.b(i3);
            str5 = HEXUtils.b(5) + HEXUtils.b(strB3.length() / 2) + strB3;
        }
        stringBuffer.append(str).append(str2).append(str3).append(str4).append(str5);
        deviceCommand.setServiceID(8);
        deviceCommand.setCommandID(9);
    }

    private void d(Intent intent) {
        int i;
        Intent intent2;
        LogUtil.a("ExternalPhoneService", "processSynergyAuth Enter");
        String stringExtra = intent.getStringExtra("DEVICE_ADDRESS");
        Iterator<DeviceInfo> it = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "ExternalPhoneService").iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            DeviceInfo next = it.next();
            if (!eel.d(next.getProductType()) && next.getDeviceIdentify().equalsIgnoreCase(stringExtra)) {
                i = 1;
                break;
            }
        }
        LogUtil.a("ExternalPhoneService", "processSynergyAuth authInfo:", Integer.valueOf(i), ",address:", CommonUtil.n(stringExtra));
        if (MagicBuild.f36615a) {
            LogUtil.a("ExternalPhoneService", "processSynergyAuth honor");
            intent2 = new Intent("com.huawei.health.AUTH_STATE_RESP");
            intent2.setComponent(new ComponentName("com.hihonor.synergy", "com.hihonor.synergy.server.QueryService"));
            intent2.putExtra("DEVICE_ADDRESS", stringExtra);
            intent2.putExtra("AUTH_NAME", i);
        } else {
            intent2 = new Intent("com.huawei.health.AUTH_STATE_RESP");
            intent2.setComponent(new ComponentName("com.huawei.synergy", "com.huawei.synergy.server.QueryService"));
            intent2.putExtra("DEVICE_ADDRESS", stringExtra);
            intent2.putExtra("AUTH_NAME", i);
        }
        try {
            startService(intent2);
            LogUtil.a("ExternalPhoneService", "processSynergyAuth startService");
        } catch (IllegalStateException unused) {
            LogUtil.e("ExternalPhoneService", "processSynergyAuth IllegalStateException");
        } catch (SecurityException unused2) {
            LogUtil.e("ExternalPhoneService", "processSynergyAuth SecurityException");
        }
    }
}
