package com.huawei.hms.findnetwork.request;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.RegisterDetailsBean;
import com.huawei.hms.findnetwork.comm.request.bean.RegisterStatusBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes10.dex */
public class RegisterDeviceApiCall extends BaseTaskApiCall {

    public static class RegisterResultTypeToken extends TypeToken<FindNetworkResult<RegisterStatusBean>> {
        private RegisterResultTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("RegisterDeviceApiCall", "handleBusiness");
        if (responseErrorCode.getErrorCode() != 0) {
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.e("RegisterDeviceApiCall", "body is null");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body is null")));
            return;
        }
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new RegisterResultTypeToken().getType());
        if (findNetworkResult != null) {
            taskCompletionSource.setResult(findNetworkResult);
        } else {
            HmsFindSDKLog.i("RegisterDeviceApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
        }
    }

    public RegisterDeviceApiCall(RegisterDetailsBean registerDetailsBean) {
        super("findnetwork.registerDevice", registerDetailsBean);
    }
}
