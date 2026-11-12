package com.huawei.hms.hwid;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes34.dex */
public class ak extends TaskApiCall<ai, Void> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    public ak(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(ai aiVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        ag agVarB = ag.b(str);
        Integer numA = agVarB.a();
        String strB = agVarB.b();
        if (numA == null) {
            numA = Integer.valueOf(responseErrorCode.getErrorCode());
            strB = responseErrorCode.getErrorReason();
        }
        if (a(responseErrorCode, agVarB.a())) {
            taskCompletionSource.setResult(null);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(numA.intValue(), strB)));
        }
    }

    private boolean a(ResponseErrorCode responseErrorCode, Integer num) {
        if (num == null) {
            return responseErrorCode.getStatusCode() == 0;
        }
        return num.intValue() == 0;
    }
}
