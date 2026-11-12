package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0434l extends BaseTaskApiCall {
    public C0434l(FidRequestBean fidRequestBean) {
        super("findnetwork.wear_enableFoundNotification", fidRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("EnableFoundNotificationApiCall", "handleBusiness EnableFoundNotificationApiCall");
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setSrcTransId(getTransactionId());
        if (responseErrorCode.getErrorCode() != 0) {
            findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
            findNetworkResult.setDescription(responseErrorCode.getErrorReason());
            findNetworkResult.setData(str);
        }
        taskCompletionSource.setResult(findNetworkResult);
    }
}
