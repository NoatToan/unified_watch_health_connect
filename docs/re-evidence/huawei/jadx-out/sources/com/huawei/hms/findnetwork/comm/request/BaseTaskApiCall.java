package com.huawei.hms.findnetwork.comm.request;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.findnetwork.comm.log.HmsFindCommonLog;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkConfigResult;
import com.huawei.hms.findnetwork.comm.util.ErrorCode;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseTaskApiCall<ClientT extends HmsClient, RequestT extends BaseRequestBean, ResultT> extends TaskApiCall<ClientT, ResultT> {
    private static final String TAG = "BaseTaskApiCall";

    public abstract void handleBusiness(ClientT clientt, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource);

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (responseErrorCode.getErrorCode() == 0) {
            HmsFindCommonLog.d(TAG, "doExecute success");
        } else {
            HmsFindCommonLog.w(TAG, "doExecute errorCode:" + responseErrorCode.getErrorCode() + ", msg:" + responseErrorCode.getErrorReason());
        }
        handleBusiness(clientt, responseErrorCode, str, taskCompletionSource);
    }

    public FindNetworkConfigResult<RequestT> getConfigResult(int i, String str) {
        FindNetworkConfigResult<RequestT> findNetworkConfigResult = new FindNetworkConfigResult<>();
        findNetworkConfigResult.setRespCode(i);
        findNetworkConfigResult.setDescription(str);
        return findNetworkConfigResult;
    }

    public ApiException getApiException(int i) {
        return new ApiException(new Status(i, ErrorCode.getStatusCode(i)));
    }

    public BaseTaskApiCall(String str, RequestT requestt) {
        super(str, JsonUtils.object2Json(requestt));
    }
}
