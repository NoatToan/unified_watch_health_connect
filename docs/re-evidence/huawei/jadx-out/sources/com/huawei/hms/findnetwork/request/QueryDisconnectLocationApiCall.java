package com.huawei.hms.findnetwork.request;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DisConnectLocation;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class QueryDisconnectLocationApiCall extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13195a;

    public static class QueryDisconnectLocationTypeToken extends TypeToken<FindNetworkResult<DisConnectLocation>> {
        private QueryDisconnectLocationTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("QueryDisconnectLocationApiCall", "handleBusiness");
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        HmsFindSDKLog.i("QueryDisconnectLocationApiCall", "RespCode: " + findNetworkResult.getRespCode());
        if (responseErrorCode.getStatusCode() != 0) {
            findNetworkResult.setDescription(responseErrorCode.getErrorReason());
            findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
            this.f13195a.onFail(findNetworkResult);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.e("QueryDisconnectLocationApiCall", "body null");
            findNetworkResult.setDescription("body null");
            findNetworkResult.setRespCode(-1);
            this.f13195a.onFail(findNetworkResult);
            return;
        }
        FindNetworkResult findNetworkResult2 = (FindNetworkResult) JsonUtils.json2Object(str, new QueryDisconnectLocationTypeToken().getType());
        if (findNetworkResult2 == null) {
            HmsFindSDKLog.e("QueryDisconnectLocationApiCall", "body parse error");
            findNetworkResult.setDescription("body parse error");
            findNetworkResult.setRespCode(-1);
            this.f13195a.onFail(findNetworkResult);
            return;
        }
        if (findNetworkResult2.getData() != null) {
            this.f13195a.onSuccess(findNetworkResult2);
            return;
        }
        HmsFindSDKLog.e("QueryDisconnectLocationApiCall", "data is null");
        findNetworkResult.setDescription("data is null");
        findNetworkResult.setRespCode(-1);
        this.f13195a.onFail(findNetworkResult);
    }

    public QueryDisconnectLocationApiCall(SnRequestBean snRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.queryDisconnectLocation", snRequestBean);
        this.f13195a = findNetworkCallback;
    }
}
