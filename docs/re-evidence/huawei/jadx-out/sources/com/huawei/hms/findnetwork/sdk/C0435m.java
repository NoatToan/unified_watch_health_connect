package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.GetAntiStalkingRecordRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0435m extends BaseTaskApiCall {
    public C0435m(GetAntiStalkingRecordRequestBean getAntiStalkingRecordRequestBean) {
        super("findnetwork.getAntiStalkingRecord", getAntiStalkingRecordRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult((FindNetworkResult) JsonUtils.json2Object(str, FindNetworkResult.class));
    }
}
