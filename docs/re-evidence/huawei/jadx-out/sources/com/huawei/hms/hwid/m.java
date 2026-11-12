package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class m extends TaskApiCall<c, AuthAccount> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    public m(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<AuthAccount> taskCompletionSource) {
        AuthAccount account;
        if (responseErrorCode == null) {
            ar.b("[AccountSDK]AccountSignInTaskApiCall", "response is null.", true);
            taskCompletionSource.setException(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        ar.b("[AccountSDK]AccountSignInTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            ar.b("[AccountSDK]AccountSignInTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            taskCompletionSource.setException(new ResolvableApiException(status));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ar.b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, response is null, failed", true);
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            if ("{}".equals(str)) {
                ar.b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, body is null", true);
                taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
            try {
                AccountAuthResult accountAuthResultFromJson = new AccountAuthResult().fromJson(str);
                errorCode = accountAuthResultFromJson.getStatus().getStatusCode();
                if (accountAuthResultFromJson.isSuccess()) {
                    ar.b("[AccountSDK]AccountSignInTaskApiCall", "signIn success", true);
                    new e(cVar.getContext()).a();
                    account = accountAuthResultFromJson.getAccount();
                    try {
                        taskCompletionSource.setResult(accountAuthResultFromJson.getAccount());
                    } catch (JSONException unused) {
                        ar.c("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, but parser json exception", true);
                        taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                    }
                } else {
                    ar.b("[AccountSDK]AccountSignInTaskApiCall", "signIn failed", true);
                    taskCompletionSource.setException(new ApiException(accountAuthResultFromJson.getStatus()));
                }
            } catch (JSONException unused2) {
                account = null;
            }
            g.a().a(account, (AccountAuthParams) null);
        }
        account = null;
        g.a().a(account, (AccountAuthParams) null);
    }
}
