package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.bean.BtMeasureResult;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class J extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13206a;

    public J(BaseRequestBean baseRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.startBTMeasure", baseRequestBean);
        this.f13206a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        findNetworkResult.setRespCode(responseErrorCode.getStatusCode());
        HmsFindSDKLog.d("StartBTMeasureApiCall", "handleBusiness statusCode:" + responseErrorCode.getStatusCode());
        if (responseErrorCode.getStatusCode() == 0) {
            this.f13206a.onSuccess(findNetworkResult);
        } else if (responseErrorCode.getStatusCode() == 907201007) {
            findNetworkResult.setData((BtMeasureResult) JsonUtils.json2Object(str, BtMeasureResult.class));
            this.f13206a.onUpdate(findNetworkResult);
        } else {
            this.f13206a.onFail(findNetworkResult);
        }
        taskCompletionSource.setResult(null);
    }
}
