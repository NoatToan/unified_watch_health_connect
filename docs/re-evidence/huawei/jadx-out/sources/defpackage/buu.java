package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class buu implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1179a = new Object();
    private IBaseResponseCallback d;
    private ExtendHandler e;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final buu f1180a = new buu();
    }

    private buu() {
        this.e = null;
        LogUtil.a("SleepNotificationManager", "create SleepNotificationManager.");
    }

    public static buu a() {
        return a.f1180a;
    }

    private void d() {
        this.e = HandlerCenter.b(new d(), "SleepNotificationManager");
    }

    public void c(but butVar, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SleepNotificationManager", "sendSleepNotificationEvent enter");
        this.d = iBaseResponseCallback;
        boolean z = ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.START_ACTIVITIES_FROM_BACKGROUND") == 0;
        LogUtil.a("SleepNotificationManager", "sendSleepNotificationEvent hasGrantedPermission: ", Boolean.valueOf(z));
        if (!z) {
            d(101);
            return;
        }
        boolean zB = NotificationContentProviderUtil.b();
        boolean zA = NotificationContentProviderUtil.a(BaseApplication.getAppPackage());
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled();
        LogUtil.a("SleepNotificationManager", "sendSleepNotificationEvent isNotificationStatus:", Boolean.valueOf(zB), ", isHealthNotificationStatus:", Boolean.valueOf(zA), ", isHealthAppNotification:", Boolean.valueOf(zAreNotificationsEnabled));
        if (!zB || !zA || !zAreNotificationsEnabled) {
            d(101);
            return;
        }
        if (butVar == null) {
            LogUtil.j("SleepNotificationManager", "sendSleepNotificationEvent notificationData is null");
            d(101);
            return;
        }
        DeviceInfo deviceInfoB = b();
        if (deviceInfoB == null || deviceInfoB.getDeviceConnectState() != 2) {
            LogUtil.j("SleepNotificationManager", "sendSleepNotificationEvent deviceInfo is null or disconnect");
            d(101);
            return;
        }
        e();
        if (this.e == null) {
            d();
        }
        this.e.sendEmptyMessage(1, 2000L);
        boolean zSendSampleEventCommand = edc.e().sendSampleEventCommand(deviceInfoB, d(deviceInfoB, butVar), "SleepNotificationManager");
        LogUtil.a("SleepNotificationManager", "sendSampleEventCommand return isSendSuccess:", Boolean.valueOf(zSendSampleEventCommand));
        if (zSendSampleEventCommand) {
            return;
        }
        d(101);
    }

    private DeviceInfo b() {
        if (EnvironmentUtils.d()) {
            return mgg.c("SleepNotificationManager");
        }
        DeviceInfo deviceInfo = null;
        if (EnvironmentUtils.e()) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "SleepNotificationManager");
            if (deviceList == null || deviceList.isEmpty()) {
                LogUtil.a("SleepNotificationManager", "getDeviceInfo() deviceInfoList is null or empty");
                return null;
            }
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
            LogUtil.a("SleepNotificationManager", "getDeviceInfo() deviceInfo:", deviceInfo, " , tag is ", "SleepNotificationManager");
            return deviceInfo;
        }
        LogUtil.j("SleepNotificationManager", "getDeviceInfo else, return null");
        return null;
    }

    private eee d(DeviceInfo deviceInfo, but butVar) {
        LogUtil.a("SleepNotificationManager", "getSampleEvent notificationData");
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.sleepnotification");
        eeeVar.setWearPkgName("hw.watch.health.sleep");
        eeeVar.setCommandId(2);
        eeeVar.a(80030001L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(b(deviceInfo, butVar)));
        return eeeVar;
    }

    private String b(DeviceInfo deviceInfo, but butVar) {
        StringBuilder sb = new StringBuilder(16);
        String strA = eeq.a(butVar.h());
        sb.append(eeq.d(6) + eeq.b(strA.length() / 2) + strA);
        String strA2 = eeq.a(butVar.c());
        sb.append(eeq.d(7) + eeq.b(strA2.length() / 2) + strA2);
        String strA3 = eeq.a(butVar.e());
        sb.append(eeq.d(8) + eeq.b(strA3.length() / 2) + strA3);
        String strA4 = eeq.a(butVar.b());
        sb.append(eeq.d(9) + eeq.b(strA4.length() / 2) + strA4);
        String strA5 = eeq.a(nff.d(deviceInfo));
        sb.append(eeq.d(10) + eeq.b(strA5.length() / 2) + strA5);
        String strA6 = eeq.a(butVar.d());
        sb.append(eeq.d(11) + eeq.b(strA6.length() / 2) + strA6);
        String strA7 = eeq.a(butVar.a());
        sb.append(eeq.d(12) + eeq.b(strA7.length() / 2) + strA7);
        LogUtil.a("SleepNotificationManager", "getEventData tlv:", sb.toString());
        return sb.toString();
    }

    private void e() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.sleepnotification", this);
    }

    private void j() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.sleepnotification");
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("SleepNotificationManager", "onDataReceived: ", Integer.valueOf(i));
        if (!(eecVar instanceof eee)) {
            LogUtil.a("SleepNotificationManager", "onDataReceived message is error");
            d(101);
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (eecVar.getCommandId() != 2) {
            LogUtil.j("SleepNotificationManager", "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
            d(101);
            return;
        }
        if (eeeVar.d() != 80030001) {
            LogUtil.j("SleepNotificationManager", "onDataReceived, sampleEvent EventId is error");
            d(101);
            return;
        }
        String strE = eeq.e(eeeVar.c());
        LogUtil.a("SleepNotificationManager", "onDataReceived eventData:", strE);
        if (CommonUtil.v(strE) == 1) {
            d(100);
        } else {
            d(101);
        }
        if (this.e == null) {
            d();
        }
        this.e.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.d.a(i, null);
    }

    public void c() {
        j();
        synchronized (f1179a) {
            ExtendHandler extendHandler = this.e;
            if (extendHandler != null) {
                extendHandler.removeTasksAndMessages();
                this.e.quit(true);
                this.e = null;
            }
        }
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                LogUtil.a("SleepNotificationManager", "SleepNotificationHandler time out");
                buu.this.d(101);
                return true;
            }
            LogUtil.j("SleepNotificationManager", "SleepNotificationHandler default");
            return false;
        }
    }
}
