package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DevicePeriodRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0425c extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FindNetworkCallback f13231a;

    public C0425c(DevicePeriodRequestBean devicePeriodRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.calibrateDevicePeriod", devicePeriodRequestBean);
        this.f13231a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        int statusCode = responseErrorCode.getStatusCode();
        HmsFindSDKLog.i("CalibrateDevicePeriodApiCall", "handleBusiness statusCode:" + statusCode + ", errorCode" + responseErrorCode.getErrorCode() + ", reason:" + responseErrorCode.getErrorReason());
        if (this.f13231a == null) {
            HmsFindSDKLog.w("CalibrateDevicePeriodApiCall", "callback null");
            return;
        }
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(statusCode);
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        if (statusCode != 0) {
            this.f13231a.onFail(findNetworkResult);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            findNetworkResult.setData(str);
            this.f13231a.onSuccess(findNetworkResult);
        }
    }
}
