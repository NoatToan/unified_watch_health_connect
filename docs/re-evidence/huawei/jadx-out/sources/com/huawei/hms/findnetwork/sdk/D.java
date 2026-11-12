package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SetArPoseRequestBean;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class D extends BaseTaskApiCall {
    public D(SetArPoseRequestBean setArPoseRequestBean) {
        super("findnetwork.setArPose", setArPoseRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (responseErrorCode == null || taskCompletionSource == null) {
            HmsFindSDKLog.w("SetArPoseInnerApiCall", "handleBusiness ignore, param invalid.");
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode == 0) {
            HmsFindSDKLog.i("SetArPoseInnerApiCall", "SetArPose succeed.");
            taskCompletionSource.setResult(null);
        } else {
            HmsFindSDKLog.e("SetArPoseInnerApiCall", "SetArPose failed, errorCode:" + errorCode);
            taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        }
    }
}
