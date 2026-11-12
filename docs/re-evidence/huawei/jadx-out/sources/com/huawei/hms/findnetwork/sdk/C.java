package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SendHeartBeatRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class C extends BaseTaskApiCall {
    public C(SendHeartBeatRequestBean sendHeartBeatRequestBean) {
        super("findnetwork.sendHeartBeat", sendHeartBeatRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setData(str);
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
        if (responseErrorCode.getErrorCode() != 0) {
            r.a().b();
            HmsFindSDKLog.e("SendHeartBeatApiCall", "FindNetwork Kit response error");
        }
        taskCompletionSource.setResult(findNetworkResult);
    }
}
