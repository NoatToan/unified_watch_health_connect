package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.result.AssistTokenResult;
import com.huawei.hms.support.account.result.GetAssistTokenResult;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class p extends TaskApiCall<c, AssistTokenResult> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 14;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 60000000;
    }

    public p(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<AssistTokenResult> taskCompletionSource) {
        if (responseErrorCode == null) {
            ar.b("[AccountSDK]GetAssistTokenTaskApiCall", "response is null.", true);
            taskCompletionSource.setException(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str) || "{}".equals(str)) {
            ar.b("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken complete, response or body is null, failed", true);
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            AssistTokenResult assistTokenResult = new AssistTokenResult();
            GetAssistTokenResult getAssistTokenResultFromJson = new GetAssistTokenResult().fromJson(str);
            if (getAssistTokenResultFromJson.isSuccess()) {
                ar.b("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken success", true);
                assistTokenResult.setAssistToken(getAssistTokenResultFromJson.getAssistToken());
                taskCompletionSource.setResult(assistTokenResult);
            } else {
                ar.b("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken failed", true);
                taskCompletionSource.setException(new ApiException(getAssistTokenResultFromJson.getStatus()));
            }
        } catch (JSONException unused) {
            ar.d("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken complete, but parser json exception", true);
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }
}
