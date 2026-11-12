package com.huawei.hms.findnetwork.request.wear;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.ResultResponse;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class WearUnPairApiCall extends BaseTaskApiCall {

    public static class UnPairResultTypeToken extends TypeToken<FindNetworkResult<ResultResponse>> {
        private UnPairResultTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("WearUnPairApiCall", "body null");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body null")));
            return;
        }
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new UnPairResultTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.i("WearUnPairApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        if (findNetworkResult.getRespCode() != 0) {
            HmsFindSDKLog.i("WearUnPairApiCall", "result error " + findNetworkResult.getRespCode() + " " + findNetworkResult.getDescription());
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
            return;
        }
        FindNetworkResult findNetworkResult2 = new FindNetworkResult();
        findNetworkResult2.setRespCode(findNetworkResult.getRespCode());
        findNetworkResult2.setSrcTransId(findNetworkResult.getSrcTransId());
        if (findNetworkResult.getData() != null) {
            findNetworkResult2.setData(((ResultResponse) findNetworkResult.getData()).getResult());
        }
        taskCompletionSource.setResult(findNetworkResult2);
    }

    public WearUnPairApiCall(FidRequestBean fidRequestBean) {
        super("findnetwork.wear_unPair", fidRequestBean);
    }
}
