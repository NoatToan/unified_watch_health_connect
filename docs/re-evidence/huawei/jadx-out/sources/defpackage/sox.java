package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class sox {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static sox f48479b;
    private static final Object e = new Object();

    private sox() {
    }

    public static sox d() {
        sox soxVar;
        synchronized (e) {
            if (f48479b == null) {
                f48479b = new sox();
            }
            soxVar = f48479b;
        }
        return soxVar;
    }

    public void a(MenstrualSwitchStatus menstrualSwitchStatus) {
        lvb.e().a(menstrualSwitchStatus);
    }

    public void c(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(5);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1)).append(eeq.d(1)).append(eeq.d(eey.d(deviceInfo, 174) ? 3 : 2));
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        LogUtil.a("HwMenstrualInteractor", "sendCapability, deviceCommand:", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    public void a() {
        c();
    }

    private static void c() {
        synchronized (e) {
            f48479b = null;
        }
    }
}
