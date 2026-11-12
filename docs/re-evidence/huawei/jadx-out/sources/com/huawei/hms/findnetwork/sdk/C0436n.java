package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.AccessoryDetectResult;
import com.huawei.hms.findnetwork.comm.request.bean.GetFidRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0436n extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FindNetworkCallback f13234a;

    public C0436n(GetFidRequestBean getFidRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.getDeviceFid", getFidRequestBean);
        this.f13234a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        AccessoryDetectResult accessoryDetectResult;
        int statusCode = responseErrorCode.getStatusCode();
        HmsFindSDKLog.i("GetDeviceFidApiCall", "handleBusiness statusCode:" + statusCode + ", errorCode" + responseErrorCode.getErrorCode() + ", reason:" + responseErrorCode.getErrorReason());
        if (this.f13234a == null) {
            HmsFindSDKLog.w("GetDeviceFidApiCall", "callback null");
            return;
        }
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(statusCode);
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        if (statusCode != 0) {
            this.f13234a.onFail(findNetworkResult);
        } else {
            if (TextUtils.isEmpty(str) || (accessoryDetectResult = (AccessoryDetectResult) JsonUtils.json2Object(str, AccessoryDetectResult.class)) == null) {
                return;
            }
            findNetworkResult.setData(accessoryDetectResult);
            this.f13234a.onSuccess(findNetworkResult);
        }
    }
}
