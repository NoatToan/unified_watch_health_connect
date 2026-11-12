package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class O extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13212a;

    public O(BaseRequestBean baseRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.stopBTMeasure", baseRequestBean);
        this.f13212a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("StopBTMeasureApiCall", "StopBTMeasureApiCall handleBusiness");
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
        findNetworkResult.setData(str);
        HmsFindSDKLog.i("StopBTMeasureApiCall", "result.getRespCode() == " + findNetworkResult.getRespCode());
        if (responseErrorCode.getStatusCode() == 0) {
            this.f13212a.onSuccess(findNetworkResult);
        } else {
            this.f13212a.onFail(findNetworkResult);
        }
        taskCompletionSource.setResult(null);
    }
}
