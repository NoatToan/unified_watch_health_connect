package com.huawei.hms.a.a.d;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.AccountPickerSignOutResult;
import defpackage.nox;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public class d extends TaskApiCall<com.huawei.hms.a.a.b.a, Void> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 9;
    }

    public d(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(com.huawei.hms.a.a.b.a aVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        a(responseErrorCode, str);
        int errorCode = responseErrorCode.getErrorCode();
        nox.b("[ACCOUNTSDK]AccountPickerSignOutTaskApiCall", "ResponseErrorCode:" + errorCode, true);
        if (!TextUtils.isEmpty(str)) {
            nox.b("[ACCOUNTSDK]AccountPickerSignOutTaskApiCall", "signOut body is not null.", true);
            try {
                AccountPickerSignOutResult accountPickerSignOutResultFromJson = new AccountPickerSignOutResult().fromJson(str);
                int statusCode = accountPickerSignOutResultFromJson.getStatus().getStatusCode();
                if (accountPickerSignOutResultFromJson.isSuccess()) {
                    taskCompletionSource.setResult(null);
                    return;
                } else {
                    taskCompletionSource.setException(new ApiException(new Status(statusCode, responseErrorCode.getErrorReason())));
                    return;
                }
            } catch (JSONException e) {
                nox.a("[ACCOUNTSDK]AccountPickerSignOutTaskApiCall", "JSONException：" + e.getClass().getSimpleName(), true);
                taskCompletionSource.setException(new ApiException(new Status(2015, "JSON parse exception.")));
                return;
            }
        }
        nox.b("[ACCOUNTSDK]AccountPickerSignOutTaskApiCall", "signOut body is null.", true);
        taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        nox.b("[ACCOUNTSDK]AccountPickerSignOutTaskApiCall", sb.toString(), true);
    }
}
