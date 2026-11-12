package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nca {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42866b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f42867c = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
    private static nca e = null;

    public static nca c() {
        nca ncaVar;
        synchronized (f42866b) {
            if (e == null) {
                e = new nca();
            }
            ncaVar = e;
        }
        return ncaVar;
    }

    private nca() {
    }

    public void d(int i) {
        ReleaseLogUtil.e("DEVMGR_HwNotificationSubSwitchPushManager", "sendAllSubSwitchStatusToDevice enter type: ", Integer.valueOf(i));
        if (!f42867c.contains(Integer.valueOf(i))) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationSubSwitchPushManager", "sendAllSubSwitchStatusToDevice other conditions is not send");
            return;
        }
        if (!a()) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationSubSwitchPushManager", "sendAllSubSwitchStatusToDevice device is not support switch send deal");
            return;
        }
        if (!b()) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationSubSwitchPushManager", "sendAllSubSwitchStatusToDevice notification main switch is closed.");
            return;
        }
        List<String> listJ = NotificationContentProviderUtil.j();
        ArrayList<String> arrayList = new ArrayList(cio.e);
        arrayList.add(cio.d);
        StringBuilder sb = new StringBuilder(16);
        for (String str : arrayList) {
            if (listJ != null && listJ.contains(str)) {
                a(sb, str, 0);
            } else {
                a(sb, str, 1);
            }
        }
        DeviceCommand deviceCommandE = e(sb);
        LogUtil.a("HwNotificationSubSwitchPushManager", "sendAllSubSwitchStatusToDevice switch send deviceCommand: ", deviceCommandE);
        mkn.e().sendDeviceData(deviceCommandE);
    }

    private DeviceCommand e(StringBuilder sb) {
        String str = (eeq.d(129) + ncp.b(sb.length() / 2)) + ((Object) sb);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(11);
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setDataContent(eeq.c(str));
        return deviceCommand;
    }

    private void a(StringBuilder sb, String str, int i) {
        String strA = eeq.a(str);
        a(sb, eeq.d(3) + eeq.d(strA.length() / 2) + strA, eeq.d(4) + eeq.d(1) + eeq.d(i));
    }

    private boolean a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwNotificationSubSwitchPushManager");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("HwNotificationSubSwitchPushManager", "isSupportSubSwitchSendDeal deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY);
    }

    private void a(StringBuilder sb, String str, String str2) {
        sb.append(eeq.d(130) + ncp.b((str + str2).length() / 2));
        sb.append(str);
        sb.append(str2);
    }

    private boolean b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10035), "notificationStatus");
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.a("HwNotificationSubSwitchPushManager", "isAuthorizeEnabled value is: ", strE);
            try {
                return Integer.parseInt(strE) == 1;
            } catch (NumberFormatException unused) {
                LogUtil.e("HwNotificationSubSwitchPushManager", "isAuthorizeEnabled NumberFormatException");
                return false;
            }
        }
        boolean zA = mir.a();
        LogUtil.a("HwNotificationSubSwitchPushManager", "isAuthorizeEnabled value is null, isEnabled:", Boolean.valueOf(zA));
        return zA;
    }
}
