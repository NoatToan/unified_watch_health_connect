package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0440s extends BaseTaskApiCall {
    public C0440s() {
        this("", null);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
    }

    public C0440s(String str, BaseRequestBean baseRequestBean) {
        super(str, baseRequestBean);
    }
}
