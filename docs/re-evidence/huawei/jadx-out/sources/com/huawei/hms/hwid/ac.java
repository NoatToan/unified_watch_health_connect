package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class ac extends TaskApiCall<u, AuthHuaweiId> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    public ac(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<AuthHuaweiId> taskCompletionSource) {
        AuthHuaweiId huaweiId;
        if (responseErrorCode == null) {
            ar.b("[HUAWEIIDSDK]SignInTaskApiCall", "response is null.", true);
            taskCompletionSource.setException(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        ar.b("[HUAWEIIDSDK]SignInTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            ar.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, response is null, failed", true);
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            try {
                HuaweiIdAuthResult huaweiIdAuthResultFromJson = new HuaweiIdAuthResult().fromJson(str);
                huaweiIdAuthResultFromJson.getStatus().getStatusCode();
                if (huaweiIdAuthResultFromJson.isSuccess()) {
                    ar.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn success", true);
                    new w(uVar.getContext()).a();
                    huaweiId = huaweiIdAuthResultFromJson.getHuaweiId();
                    try {
                        taskCompletionSource.setResult(huaweiIdAuthResultFromJson.getHuaweiId());
                    } catch (JSONException unused) {
                        ar.c("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, but parser json exception", true);
                        taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                    }
                } else {
                    ar.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn failed", true);
                    taskCompletionSource.setException(new ApiException(huaweiIdAuthResultFromJson.getStatus()));
                }
            } catch (JSONException unused2) {
                huaweiId = null;
            }
            y.a().a(huaweiId, (HuaweiIdAuthParams) null);
            ar.b("[HUAWEIIDSDK]SignInTaskApiCall", "report: api=hwid.silentSignInversion=61300303", true);
        }
        huaweiId = null;
        y.a().a(huaweiId, (HuaweiIdAuthParams) null);
        ar.b("[HUAWEIIDSDK]SignInTaskApiCall", "report: api=hwid.silentSignInversion=61300303", true);
    }
}
