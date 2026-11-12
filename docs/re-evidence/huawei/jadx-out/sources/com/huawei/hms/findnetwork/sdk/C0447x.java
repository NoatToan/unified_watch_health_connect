package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkStatusResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C0447x extends BaseTaskApiCall {
    public C0447x(BaseRequestBean baseRequestBean) {
        super("findnetwork.queryFindNetworkStatus", baseRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        FindNetworkStatusResult findNetworkStatusResult = (FindNetworkStatusResult) JsonUtils.json2Object(str, FindNetworkStatusResult.class);
        if (findNetworkStatusResult == null) {
            findNetworkStatusResult = new FindNetworkStatusResult(-1);
        }
        taskCompletionSource.setResult(findNetworkStatusResult);
    }
}
