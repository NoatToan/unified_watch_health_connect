package com.huawei.hms.findnetwork.request;

import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class StartFastPairApiCall extends BaseTaskApiCall {

    public static class StartFastPairTypeToken extends TypeToken<FindNetworkResult<Void>> {
        private StartFastPairTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        int errorCode = responseErrorCode.getErrorCode();
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(errorCode);
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        FindNetworkResult findNetworkResult2 = (FindNetworkResult) JsonUtils.json2Object(str, new StartFastPairTypeToken().getType());
        if (findNetworkResult2 == null) {
            HmsFindSDKLog.i("StartFastPairApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        findNetworkResult.setData((Void) findNetworkResult2.getData());
        findNetworkResult.setDescription(findNetworkResult2.getDescription());
        findNetworkResult.setRespCode(findNetworkResult2.getRespCode());
        HmsFindSDKLog.i("StartFastPairApiCall", "success to call StartFastPair. fncResult=" + findNetworkResult2.getRespCode());
        if (findNetworkResult.getRespCode() == 0) {
            taskCompletionSource.setResult(findNetworkResult);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
        }
    }

    public StartFastPairApiCall(BaseRequestBean baseRequestBean) {
        super("findnetwork.startFastPair", baseRequestBean);
    }
}
