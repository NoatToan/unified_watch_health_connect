package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DevicePeriodRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class X extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FindNetworkCallback f13224a;

    public X(DevicePeriodRequestBean devicePeriodRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.verifyDevicePeriod", devicePeriodRequestBean);
        this.f13224a = findNetworkCallback;
    }

    public final void a(int i) {
        this.f13224a.onFail(new FindNetworkResult(i, "VerifyDevicePeriod callback fail", null));
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("VerifyDevicePeriodApiCall", "VerifyDevicePeriodApiCall handleBusiness");
        if (this.f13224a == null) {
            HmsFindSDKLog.e("VerifyDevicePeriodApiCall", "VerifyDevicePeriodApiCall callback is null");
            return;
        }
        if (responseErrorCode == null) {
            HmsFindSDKLog.e("VerifyDevicePeriodApiCall", "response is null ");
            return;
        }
        HmsFindSDKLog.i("VerifyDevicePeriodApiCall", "response.getStatusCode: " + responseErrorCode.getStatusCode() + ", response.getErrorReason(): " + responseErrorCode.getErrorReason());
        if (responseErrorCode.getStatusCode() == 0) {
            a(str);
        } else {
            a(responseErrorCode.getStatusCode());
        }
    }

    public final void a(String str) {
        this.f13224a.onSuccess(new FindNetworkResult(0, "VerifyDevicePeriod callback success", str));
    }
}
