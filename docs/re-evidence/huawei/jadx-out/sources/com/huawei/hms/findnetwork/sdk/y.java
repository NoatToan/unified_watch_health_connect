package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.OfflineLocationBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class y extends BaseTaskApiCall {
    public y(FidRequestBean fidRequestBean) {
        super("findnetwork.wear_queryOfflineLocation", fidRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("QueryOfflineLocationApiCall", "handleBusiness QueryOfflineLocationApiCall");
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setSrcTransId(getTransactionId());
        if (responseErrorCode.getErrorCode() != 0 || TextUtils.isEmpty(str)) {
            findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
            findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        } else {
            findNetworkResult.setData((OfflineLocationBean) JsonUtils.json2Object(str, OfflineLocationBean.class));
        }
        taskCompletionSource.setResult(findNetworkResult);
    }
}
