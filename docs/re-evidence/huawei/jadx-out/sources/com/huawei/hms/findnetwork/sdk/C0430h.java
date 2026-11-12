package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DisconnectNotificationParams;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0430h extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13233a;

    public C0430h(DisconnectNotificationParams disconnectNotificationParams, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.enableNewDisconnectNotification", disconnectNotificationParams);
        this.f13233a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        if (responseErrorCode.getStatusCode() == 0) {
            HmsFindSDKLog.i("DisconnectNotifyModeApiCall", "DisconnectNotifyModeApiCall success");
            findNetworkResult.setRespCode(0);
            this.f13233a.onSuccess(findNetworkResult);
        } else {
            HmsFindSDKLog.i("DisconnectNotifyModeApiCall", "fail code = " + responseErrorCode.getStatusCode());
            findNetworkResult.setRespCode(responseErrorCode.getStatusCode());
            findNetworkResult.setDescription(responseErrorCode.getErrorReason());
            this.f13233a.onFail(findNetworkResult);
        }
    }
}
