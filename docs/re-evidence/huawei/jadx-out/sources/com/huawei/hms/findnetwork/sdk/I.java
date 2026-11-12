package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.AccessoryDetectResult;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class I extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FindNetworkCallback f13205a;

    public I(BaseRequestBean baseRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.startAccessoryDetect", baseRequestBean);
        this.f13205a = findNetworkCallback;
    }

    public final void a(ResponseErrorCode responseErrorCode) {
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(responseErrorCode.getStatusCode());
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        findNetworkResult.setData(null);
        this.f13205a.onFail(findNetworkResult);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (this.f13205a == null) {
            HmsFindSDKLog.e("StartAccessoryDetectApiCall", "handleBusiness ignore, callback is null.");
            return;
        }
        if (responseErrorCode == null) {
            HmsFindSDKLog.e("StartAccessoryDetectApiCall", "handleBusiness ignore, response is null.");
            return;
        }
        HmsFindSDKLog.i("StartAccessoryDetectApiCall", "handleBusiness, code:" + responseErrorCode.getStatusCode() + ":" + responseErrorCode.getErrorReason());
        if (responseErrorCode.getStatusCode() == 0) {
            a((AccessoryDetectResult) JsonUtils.json2Object(str, AccessoryDetectResult.class));
        } else {
            a(responseErrorCode);
        }
    }

    public final void a(AccessoryDetectResult accessoryDetectResult) {
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(0);
        findNetworkResult.setData(accessoryDetectResult);
        this.f13205a.onSuccess(findNetworkResult);
    }
}
