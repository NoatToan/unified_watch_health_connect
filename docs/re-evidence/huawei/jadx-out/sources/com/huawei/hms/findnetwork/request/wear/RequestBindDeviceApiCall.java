package com.huawei.hms.findnetwork.request.wear;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.BindDeviceRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.ResultResponse;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class RequestBindDeviceApiCall extends BaseTaskApiCall {

    public static class RequestBindDeviceTypeToken extends TypeToken<FindNetworkResult<ResultResponse>> {
        private RequestBindDeviceTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        ApiException apiException;
        HmsFindSDKLog.i("RequestBindDeviceApiCall", "RequestBindDeviceApiCall handleBusiness, transactionId = " + getTransactionId());
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("RequestBindDeviceApiCall", "body null");
            apiException = new ApiException(new Status(-1, "body null"));
        } else {
            FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new RequestBindDeviceTypeToken().getType());
            if (findNetworkResult == null) {
                HmsFindSDKLog.i("RequestBindDeviceApiCall", "body parse error");
                apiException = new ApiException(new Status(-1, "body parse error"));
            } else {
                if (findNetworkResult.getRespCode() == 0) {
                    HmsFindSDKLog.i("RequestBindDeviceApiCall", "request bind device response");
                    FindNetworkResult findNetworkResult2 = new FindNetworkResult();
                    findNetworkResult2.setRespCode(findNetworkResult.getRespCode());
                    findNetworkResult2.setDescription(findNetworkResult.getDescription());
                    if (findNetworkResult.getData() != null) {
                        findNetworkResult2.setData(JsonUtils.object2Json((ResultResponse) findNetworkResult.getData()));
                    }
                    taskCompletionSource.setResult(findNetworkResult2);
                    return;
                }
                HmsFindSDKLog.i("RequestBindDeviceApiCall", "result errorCode = " + findNetworkResult.getRespCode() + ", description = " + findNetworkResult.getDescription());
                apiException = new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription()));
            }
        }
        taskCompletionSource.setException(apiException);
    }

    public RequestBindDeviceApiCall(BindDeviceRequestBean bindDeviceRequestBean) {
        super("findnetwork.wear_bindDevices", bindDeviceRequestBean);
    }
}
