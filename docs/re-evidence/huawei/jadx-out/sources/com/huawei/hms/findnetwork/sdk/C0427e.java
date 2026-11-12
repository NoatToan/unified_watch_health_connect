package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0427e extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13232a;

    public C0427e(SnRequestBean snRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.tag_createLongConnection", snRequestBean);
        this.f13232a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("ConnectTagApiCall", "ConnectTagApiCall handleBusiness");
        if (this.f13232a == null) {
            HmsFindSDKLog.i("ConnectTagApiCall", "ConnectTagApiCall callback == null");
            return;
        }
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
        findNetworkResult.setData(str);
        HmsFindSDKLog.i("ConnectTagApiCall", "result.getRespCode() == " + findNetworkResult.getRespCode());
        if (responseErrorCode.getStatusCode() == 0) {
            this.f13232a.onSuccess(findNetworkResult);
        } else {
            this.f13232a.onFail(findNetworkResult);
        }
        taskCompletionSource.setResult(null);
    }
}
