package com.huawei.hianalytics.kit;

import com.huawei.hianalytics.o0;
import com.huawei.hianalytics.t0;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes3.dex */
public class HiAnalyticsTaskApiCall extends TaskApiCall<o0, t0> {
    public HiAnalyticsTaskApiCall(String str, String str2) {
        super(str, str2);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(o0 o0Var, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<t0> taskCompletionSource) {
        if (responseErrorCode.getErrorCode() == 0) {
            taskCompletionSource.setResult(new t0(str));
        } else {
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }
}
