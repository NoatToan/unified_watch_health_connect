package com.huawei.hms.findnetwork.request;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.QueryTagDerivedKeyBean;
import com.huawei.hms.findnetwork.comm.request.bean.TagDerivedKey;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes33.dex */
public class QueryTagDerivedKeyApiCall extends BaseTaskApiCall {

    public static class QueryTagDerivedKeyTypeToken extends TypeToken<FindNetworkResult<TagDerivedKey>> {
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("QueryTagDerivedKeyApiCall", "body isEmpty");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body isEmpty")));
            return;
        }
        HmsFindSDKLog.i("QueryTagDerivedKeyApiCall", "start to call query tag derived key");
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new QueryTagDerivedKeyTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.i("QueryTagDerivedKeyApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        HmsFindSDKLog.i("QueryTagDerivedKeyApiCall", "success to call query tag derived key. fncResult=" + findNetworkResult.getRespCode());
        if (findNetworkResult.getRespCode() == 0) {
            taskCompletionSource.setResult(findNetworkResult);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
        }
    }

    public QueryTagDerivedKeyApiCall(QueryTagDerivedKeyBean queryTagDerivedKeyBean) {
        super("findnetwork.query_tag_derived_Key", queryTagDerivedKeyBean);
    }
}
