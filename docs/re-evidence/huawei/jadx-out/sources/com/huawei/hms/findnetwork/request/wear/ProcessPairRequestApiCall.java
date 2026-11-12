package com.huawei.hms.findnetwork.request.wear;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.PairRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.PhoneResponseMessage;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class ProcessPairRequestApiCall extends BaseTaskApiCall {

    public static class PairRequestResultTypeToken extends TypeToken<FindNetworkResult<PhoneResponseMessage>> {
        private PairRequestResultTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        ApiException apiException;
        HmsFindSDKLog.i("ProcessPairRequestApiCall", "handleBusiness ProcessPairRequestApiCall");
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("ProcessPairRequestApiCall", "body null");
            apiException = new ApiException(new Status(-1, "body null"));
        } else {
            FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new PairRequestResultTypeToken().getType());
            if (findNetworkResult == null) {
                HmsFindSDKLog.i("ProcessPairRequestApiCall", "body parse error");
                apiException = new ApiException(new Status(-1, "body parse error"));
            } else {
                if (findNetworkResult.getRespCode() == 0) {
                    taskCompletionSource.setResult(findNetworkResult);
                    return;
                }
                HmsFindSDKLog.i("ProcessPairRequestApiCall", "result error " + findNetworkResult.getRespCode() + " " + findNetworkResult.getDescription());
                apiException = new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription()));
            }
        }
        taskCompletionSource.setException(apiException);
    }

    public ProcessPairRequestApiCall(PairRequestBean pairRequestBean) {
        super("findnetwork.wear_processPairRequestMsg", pairRequestBean);
    }
}
