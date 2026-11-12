package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class P extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13213a;

    public P(SnRequestBean snRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.stop_navigate", snRequestBean);
        this.f13213a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("StopNavigateApiCall", "StopNavigateApiCall handleBusiness");
        if (this.f13213a == null) {
            HmsFindSDKLog.i("StopNavigateApiCall", "StopNavigateApiCall callback == null");
            return;
        }
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setData(str);
        HmsFindSDKLog.i("StopNavigateApiCall", "result.getRespCode() == " + findNetworkResult.getRespCode());
        if (responseErrorCode.getStatusCode() == 0) {
            this.f13213a.onSuccess(findNetworkResult);
        } else {
            this.f13213a.onFail(findNetworkResult);
        }
        taskCompletionSource.setResult(null);
    }
}
