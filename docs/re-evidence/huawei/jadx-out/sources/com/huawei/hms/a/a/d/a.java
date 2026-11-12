package com.huawei.hms.a.a.d;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.RevokeAccessPickerResult;
import com.huawei.hms.support.picker.common.AccountPickerUtil;
import defpackage.nox;

/* JADX INFO: loaded from: classes33.dex */
public class a extends TaskApiCall<com.huawei.hms.a.a.b.a, Void> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 9;
    }

    public a(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(com.huawei.hms.a.a.b.a aVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        a(responseErrorCode, str);
        nox.b("[ACCOUNTSDK]AccountPickerAuthorizationTaskApiCall", "ResponseErrorCode:" + responseErrorCode.getErrorCode(), true);
        AccountPickerUtil.clearSignInAccountCache();
        if (!TextUtils.isEmpty(str)) {
            if ("{}".equals(str)) {
                nox.b("[ACCOUNTSDK]AccountPickerAuthorizationTaskApiCall", "CancelAuthorization complete, body is null", true);
                taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
            nox.b("[ACCOUNTSDK]AccountPickerAuthorizationTaskApiCall", "cancel authorization body is not null.", true);
            RevokeAccessPickerResult beanFromJsonStr = new RevokeAccessPickerResult().getBeanFromJsonStr(str);
            if (beanFromJsonStr.getErrorCode() != null) {
                taskCompletionSource.setException(new ApiException(new Status(beanFromJsonStr.getErrorCode().intValue(), beanFromJsonStr.getErrorMsg())));
                return;
            } else {
                taskCompletionSource.setResult(null);
                return;
            }
        }
        nox.b("[ACCOUNTSDK]AccountPickerAuthorizationTaskApiCall", "cancel authorization body is null.", true);
        taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        nox.b("[ACCOUNTSDK]AccountPickerAuthorizationTaskApiCall", sb.toString(), true);
    }
}
