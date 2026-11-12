package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SetTrustTagRequestBean;

/* JADX INFO: loaded from: classes33.dex */
public class H extends BaseTaskApiCall {
    public H(SetTrustTagRequestBean setTrustTagRequestBean) {
        super("findnetwork.setTrustTag", setTrustTagRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(null);
    }
}
