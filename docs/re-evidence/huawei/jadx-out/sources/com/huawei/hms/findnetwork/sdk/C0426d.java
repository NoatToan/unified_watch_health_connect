package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.FindParamRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0426d extends BaseTaskApiCall {
    public C0426d(FindParamRequestBean findParamRequestBean) {
        super("findnetwork.configFindParam", findParamRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("ConfigFindParamApiCall", "code:" + responseErrorCode.getErrorCode() + ", msg:" + responseErrorCode.getErrorReason());
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
        taskCompletionSource.setResult(findNetworkResult);
    }
}
