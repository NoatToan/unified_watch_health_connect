package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mli {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f41872c = "";
    private static long e;

    private static boolean c(String str) {
        List<ResolveInfo> listQueryBroadcastReceivers;
        Intent intent = new Intent();
        intent.setAction(str);
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null || (listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0)) == null) {
            return false;
        }
        return !listQueryBroadcastReceivers.isEmpty();
    }

    public static void d(DeviceInfo deviceInfo) {
        if (!CommonUtil.bg()) {
            LogUtil.j("HiDiskInteractiveUtil", "sendConnectStateToHiDisk is not emui or HarmonyOS.");
            return;
        }
        if (!c("com.huawei.health.action.CONNECT_STATUS_CHANGE")) {
            LogUtil.j("HiDiskInteractiveUtil", "sendConnectStateToHiDisk broadcast is not registered.");
            return;
        }
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("HiDiskInteractiveUtil", "sendConnectStateToHiDisk deviceInfo or deviceIdentify is empty.");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceUdid()) && TextUtils.isEmpty(deviceInfo.getUuid())) {
            LogUtil.j("HiDiskInteractiveUtil", "sendConnectStateToHiDisk device uuid is empty.");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("HiDiskInteractiveUtil", "sendConnectStateToHiDisk connectState：", Integer.valueOf(deviceConnectState));
        if (deviceConnectState == 4) {
            f41872c = deviceInfo.getDeviceIdentify();
            e = System.currentTimeMillis();
        }
        if (deviceConnectState == 3) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = e;
            if (f41872c.equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && jCurrentTimeMillis - j < 500) {
                LogUtil.j("HiDiskInteractiveUtil", "sendConnectStateToHiDisk pair fail, no send broadcast.");
                f41872c = "";
                e = 0L;
                return;
            }
        }
        e(deviceInfo, deviceConnectState);
    }

    private static void e(DeviceInfo deviceInfo, int i) {
        Intent intent = new Intent("com.huawei.health.action.CONNECT_STATUS_CHANGE");
        intent.setFlags(32);
        String deviceUdid = deviceInfo.getDeviceUdid();
        if (TextUtils.isEmpty(deviceUdid)) {
            intent.putExtra("deviceId", deviceInfo.getUuid());
        } else {
            intent.putExtra("deviceId", deviceUdid);
        }
        String deviceFid = deviceInfo.getDeviceFid();
        if (!TextUtils.isEmpty(deviceFid) && !"NA".equals(deviceFid)) {
            intent.putExtra("fid", deviceFid);
        }
        String hwUdid = deviceInfo.getHwUdid();
        if (!TextUtils.isEmpty(hwUdid)) {
            intent.putExtra("realUid", hwUdid);
        }
        String strE = ykx.e(deviceInfo);
        LogUtil.a("HiDiskInteractiveUtil", "sendConnectStateToHiDiskDetails type:", strE);
        if ("06D".equals(strE)) {
            intent.putExtra("type", "2");
        } else if ("06E".equals(strE)) {
            intent.putExtra("type", "3");
        } else {
            intent.putExtra("type", "255");
        }
        if (i == 2) {
            intent.putExtra("connectType", "1");
            intent.putExtra("deviceName", deviceInfo.getDeviceName());
            intent.putExtra("deviceModule", deviceInfo.getDeviceModel());
        } else if (i == 3) {
            intent.putExtra("connectType", "0");
        } else {
            LogUtil.j("HiDiskInteractiveUtil", "sendConnectStateToHiDisk no send broadcast.");
            return;
        }
        BaseApplication.getContext().sendBroadcast(intent, "com.huawei.health.permission.CONNECTSTATUS");
    }
}
