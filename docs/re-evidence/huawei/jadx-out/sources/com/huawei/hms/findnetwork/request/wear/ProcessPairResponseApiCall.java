package com.huawei.hms.findnetwork.request.wear;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.PairResponseBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.ResultResponse;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class ProcessPairResponseApiCall extends BaseTaskApiCall {

    public static class PairResponseResultTypeToken extends TypeToken<FindNetworkResult<ResultResponse>> {
        private PairResponseResultTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        ApiException apiException;
        HmsFindSDKLog.i("ProcessPairResponseApiCall", "handleBusiness ProcessPairResponseApiCall");
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("ProcessPairResponseApiCall", "body null");
            apiException = new ApiException(new Status(-1, "body null"));
        } else {
            FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new PairResponseResultTypeToken().getType());
            if (findNetworkResult == null) {
                HmsFindSDKLog.i("ProcessPairResponseApiCall", "body parse error");
                apiException = new ApiException(new Status(-1, "body parse error"));
            } else {
                if (findNetworkResult.getRespCode() == 0) {
                    FindNetworkResult findNetworkResult2 = new FindNetworkResult();
                    findNetworkResult2.setRespCode(findNetworkResult.getRespCode());
                    findNetworkResult2.setSrcTransId(findNetworkResult.getSrcTransId());
                    if (findNetworkResult.getData() != null) {
                        findNetworkResult2.setData(((ResultResponse) findNetworkResult.getData()).getResult());
                    }
                    taskCompletionSource.setResult(findNetworkResult2);
                    return;
                }
                HmsFindSDKLog.i("ProcessPairResponseApiCall", "result error " + findNetworkResult.getRespCode() + " " + findNetworkResult.getDescription());
                apiException = new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription()));
            }
        }
        taskCompletionSource.setException(apiException);
    }

    public ProcessPairResponseApiCall(PairResponseBean pairResponseBean) {
        super("findnetwork.wear_processPairResponseMsg", pairResponseBean);
    }
}
