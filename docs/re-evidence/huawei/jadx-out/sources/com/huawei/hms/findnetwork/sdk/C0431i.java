package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DisconnectNotifyStatusBean;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0431i extends BaseTaskApiCall {
    public C0431i(DisconnectNotifyStatusBean disconnectNotifyStatusBean) {
        super("findnetwork.enableDisconnectNotification", disconnectNotifyStatusBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (responseErrorCode.getStatusCode() == 0) {
            HmsFindSDKLog.i("DisconnectNotifyStatusApiCall", "success");
            taskCompletionSource.setResult(null);
            return;
        }
        HmsFindSDKLog.e("DisconnectNotifyStatusApiCall", "fail code = " + responseErrorCode.getStatusCode());
        HmsFindSDKLog.e("DisconnectNotifyStatusApiCall", "fail reason = " + responseErrorCode.getErrorReason());
        taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getStatusCode())));
    }
}
