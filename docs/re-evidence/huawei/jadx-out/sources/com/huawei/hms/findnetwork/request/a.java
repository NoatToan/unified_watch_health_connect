package com.huawei.hms.findnetwork.request;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.QueryTagDerivedRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class a extends BaseTaskApiCall {
    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("QueryDevicePublicKeyApiCall", "body null");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body null")));
            return;
        }
        HmsFindSDKLog.i("QueryDevicePublicKeyApiCall", "start to call query tag derived key");
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new QueryTagDerivedKeyApiCall.QueryTagDerivedKeyTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.i("QueryDevicePublicKeyApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        HmsFindSDKLog.i("QueryDevicePublicKeyApiCall", "success to call query tag derived key. fncResult=" + findNetworkResult.getRespCode());
        if (findNetworkResult.getRespCode() == 0) {
            taskCompletionSource.setResult(findNetworkResult);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
        }
    }

    public a(QueryTagDerivedRequestBean queryTagDerivedRequestBean) {
        super("findnetwork.queryDevicePublicKey", queryTagDerivedRequestBean);
    }
}
