package defpackage;

import com.huawei.health.devicemgr.business.constant.ResultCodeMessage;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.Result;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.remoterequestdata.RequestDataProvider;

/* JADX INFO: loaded from: classes11.dex */
public class nsu implements RequestDataProvider {
    @Override // com.huawei.hwservicesmgr.remoterequestdata.RequestDataProvider
    public Result getData(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null) {
            LogUtil.e("RequestSleepStatusProvider", "getCommonData deviceInfo is null ");
            return Result.error(ResultCodeMessage.WRONG_DEVICE_ERROR_CODE.value(), "deviceInfo is null");
        }
        return Result.success(String.valueOf(mlu.d().e(deviceInfo.getDeviceIdentify())));
    }
}
