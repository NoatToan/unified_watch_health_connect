package com.huawei.hms.findnetwork.request.wear;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.DeviceBindStatusResponse;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class CheckDeviceStatusApiCall extends BaseTaskApiCall {

    public static class CheckDeviceStatusTypeToken extends TypeToken<FindNetworkResult<DeviceBindStatusResponse>> {
        private CheckDeviceStatusTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        ApiException apiException;
        HmsFindSDKLog.i("CheckDeviceStatusApiCall", "handleBusiness CheckDeviceStatusApiCall");
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("CheckDeviceStatusApiCall", "body null");
            apiException = new ApiException(new Status(-1, "body null"));
        } else {
            FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new CheckDeviceStatusTypeToken().getType());
            if (findNetworkResult == null) {
                HmsFindSDKLog.i("CheckDeviceStatusApiCall", "body parse error");
                apiException = new ApiException(new Status(-1, "body parse error"));
            } else {
                if (findNetworkResult.getRespCode() == 0) {
                    FindNetworkResult findNetworkResult2 = new FindNetworkResult();
                    findNetworkResult2.setRespCode(findNetworkResult.getRespCode());
                    if (findNetworkResult.getData() != null) {
                        findNetworkResult2.setData((DeviceBindStatusResponse) findNetworkResult.getData());
                    }
                    taskCompletionSource.setResult(findNetworkResult2);
                    return;
                }
                HmsFindSDKLog.i("CheckDeviceStatusApiCall", "result error " + findNetworkResult.getRespCode() + " " + findNetworkResult.getDescription());
                apiException = new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription()));
            }
        }
        taskCompletionSource.setException(apiException);
    }

    public CheckDeviceStatusApiCall(FidRequestBean fidRequestBean) {
        super("findnetwork.wear_checkDeviceStatus", fidRequestBean);
    }
}
