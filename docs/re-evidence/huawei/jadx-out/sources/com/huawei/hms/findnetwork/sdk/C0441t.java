package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.LostFindNotifyBean;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0441t extends BaseTaskApiCall {
    public C0441t(LostFindNotifyBean lostFindNotifyBean) {
        super("findnetwork.lostFindNotifySwitch", lostFindNotifyBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(null);
    }
}
