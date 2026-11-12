package com.huawei.hms.findnetwork.request;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.LocationRecordBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class QueryLocationRecordApiCall extends BaseTaskApiCall {

    public static class QueryLocationRecordTypeToken extends TypeToken<FindNetworkResult<List<LocationRecordBean>>> {
        private QueryLocationRecordTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("QueryLocationRecordApiCall", "body null");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body null")));
            return;
        }
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new QueryLocationRecordTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.i("QueryLocationRecordApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        HmsFindSDKLog.i("QueryLocationRecordApiCall", "success to call query location record. fncResult=" + findNetworkResult.getRespCode());
        if (findNetworkResult.getRespCode() == 0) {
            taskCompletionSource.setResult(findNetworkResult);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
        }
    }

    public QueryLocationRecordApiCall(BaseRequestBean baseRequestBean) {
        super("findnetwork.queryLocationRecord", baseRequestBean);
    }
}
