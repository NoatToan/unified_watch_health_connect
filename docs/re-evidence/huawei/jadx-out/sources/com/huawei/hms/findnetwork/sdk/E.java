package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SetDevicePublicKeysRequestBean;

/* JADX INFO: loaded from: classes33.dex */
public class E extends BaseTaskApiCall {
    public E(SetDevicePublicKeysRequestBean setDevicePublicKeysRequestBean) {
        super("findnetwork.setDevicePublicKeys", setDevicePublicKeysRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(null);
    }
}
