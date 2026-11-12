package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidBatchRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.OfflineLocationBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class z extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13254a;

    public z(FidBatchRequestBean fidBatchRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.wear_queryOfflineLocationBatch", fidBatchRequestBean);
        this.f13254a = findNetworkCallback;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("QueryOfflineLocationBatchApiCall", "handleBusiness QueryOfflineLocationApiCall");
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setSrcTransId(getTransactionId());
        if (responseErrorCode.getErrorCode() != 0 || TextUtils.isEmpty(str)) {
            findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
            findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        } else {
            findNetworkResult.setData(JsonUtils.getObjectList(str, OfflineLocationBean.class));
        }
        this.f13254a.onUpdate(findNetworkResult);
    }
}
