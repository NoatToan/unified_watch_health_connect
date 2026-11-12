package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkScanResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;

/* JADX INFO: loaded from: classes33.dex */
public class K extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13207a;

    public K(FindNetworkCallback findNetworkCallback, BaseRequestBean baseRequestBean) {
        super("findnetwork.startFastScan", baseRequestBean);
        this.f13207a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (this.f13207a == null) {
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(errorCode);
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        if (errorCode != 0) {
            this.f13207a.onFail(findNetworkResult);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f13207a.onSuccess(findNetworkResult);
            return;
        }
        FindNetworkScanResult findNetworkScanResult = (FindNetworkScanResult) JsonUtils.json2Object(str, FindNetworkScanResult.class);
        if (findNetworkScanResult != null) {
            findNetworkResult.setData(findNetworkScanResult);
            this.f13207a.onUpdate(findNetworkResult);
        }
    }
}
