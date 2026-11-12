package defpackage;

import android.content.Intent;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mzt extends AbstractSyncTask {
    public mzt() {
        super("UPDATE_DEVICE_TASK");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        boolean zE;
        if (iBaseResponseCallback == null) {
            LogUtil.j("UpdateDeviceTask", "callback == null");
            return;
        }
        boolean z = false;
        iBaseResponseCallback.a(0, "");
        boolean zB = mio.b(mio.c("update_device_task_check_time"));
        boolean zE2 = mio.e();
        LogUtil.a("UpdateDeviceTask", "startTask isCheckInterval ", Boolean.valueOf(zB), " isProcessStarted ", Boolean.valueOf(zE2));
        if (zB || !zE2) {
            LogUtil.a("UpdateDeviceTask", "task enter.");
            mio.a(true);
            DeviceInfo deviceInfo = null;
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "UpdateDeviceTask");
            if (deviceList.size() > 0) {
                for (DeviceInfo deviceInfo2 : deviceList) {
                    if (eey.d(deviceInfo2, 108)) {
                        zE = mio.a(deviceInfo2.getDeviceUdid());
                    } else {
                        zE = mio.e(deviceInfo2.getDeviceIdentify());
                    }
                    boolean zD = mio.d(deviceInfo2.getProductType(), deviceInfo2.getDeviceIdentify());
                    LogUtil.a("UpdateDeviceTask", "task enter. isHasNewVersion ", Boolean.valueOf(zE), " isAlreadyCheck ", Boolean.valueOf(zD));
                    if (!zD || zE) {
                        z = true;
                        deviceInfo = deviceInfo2;
                        break;
                    }
                }
            }
            if (deviceInfo == null) {
                LogUtil.j("UpdateDeviceTask", "task deviceInfo == null");
            } else {
                mio.d("update_device_task_check_time");
                a(deviceInfo, z);
            }
        }
    }

    private void a(DeviceInfo deviceInfo, boolean z) {
        boolean z2 = true;
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "UpdateDeviceTask");
        DeviceCapability deviceCapability = new DeviceCapability();
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        }
        if (!eey.d(deviceInfo, 58) && !eey.d(deviceInfo, 108) && (deviceCapability == null || !deviceCapability.isOtaUpdate())) {
            z2 = false;
        }
        if (z && z2) {
            LogUtil.a("UpdateDeviceTask", "enter autoCheckBandNewVersionService");
            Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
            intent.putExtra("extra_band_imei", deviceInfo.getDeviceIdentify());
            intent.setAction("action_band_auto_check_new_version");
            try {
                BaseApplication.getContext().startService(intent);
            } catch (IllegalStateException | SecurityException e) {
                LogUtil.e("autoCheckBandNewVersionService IllegalStateException ", ExceptionUtils.c(e));
            }
        }
    }
}
