package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class wzm {
    public void d(DeviceInfo deviceInfo, ICloudOperationResult<String> iCloudOperationResult) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceName())) {
            iCloudOperationResult.operationResult("", "device info is null", false);
            return;
        }
        ReleaseLogUtil.d("R_ProfileBindDeviceService", "deviceInfo", deviceInfo.getDeviceName(), ",prodid:", deviceInfo.getHiLinkDeviceId(), ",code:", CommonUtil.n(HEXUtils.b(deviceInfo.getUuid()) + "#ANDROID21"));
        GetBindDeviceReq getBindDeviceReq = new GetBindDeviceReq();
        getBindDeviceReq.setDeviceCode(0L);
        GetBindDeviceRsp getBindDeviceRspC = lqo.b(BaseApplication.b()).c(getBindDeviceReq);
        if (getBindDeviceRspC == null || njy.e(getBindDeviceRspC.getDeviceInfos())) {
            iCloudOperationResult.operationResult("", "getBindDeviceRsp has no data", false);
            return;
        }
        for (com.huawei.hwcloudmodel.model.userprofile.DeviceInfo deviceInfo2 : getBindDeviceRspC.getDeviceInfos()) {
            LogUtil.d("ProfileBindDeviceService", "info ", deviceInfo2.getDeviceCode(), ":", deviceInfo2.getName());
            if (xaf.b(deviceInfo, deviceInfo2)) {
                iCloudOperationResult.operationResult(String.valueOf(deviceInfo2.getDeviceCode()), getBindDeviceRspC.toString(), deviceInfo2.getDeviceCode().longValue() != 0);
                return;
            }
        }
        iCloudOperationResult.operationResult("", "device code not found", false);
    }
}
