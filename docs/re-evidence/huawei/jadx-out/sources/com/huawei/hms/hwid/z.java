package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.hwid.RevokeAccessResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class z extends TaskApiCall<u, Void> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    public z(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        ar.b("HuaweiIdCancelAuthorizationTaskApiCall", "HuaweiIdCancelAuthorizationTaskApiCall doExecute", true);
        x.a();
        if (responseErrorCode == null) {
            ar.b("HuaweiIdCancelAuthorizationTaskApiCall", "response is null.", true);
            taskCompletionSource.setException(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            ar.b("HuaweiIdCancelAuthorizationTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            taskCompletionSource.setException(new ResolvableApiException(status));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if ("{}".equals(str)) {
                ar.b("HuaweiIdCancelAuthorizationTaskApiCall", "CancelAuthorization complete, body is null", true);
                taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                return;
            }
            try {
                RevokeAccessResult revokeAccessResultFromJson = new RevokeAccessResult().fromJson(str);
                if (!revokeAccessResultFromJson.isSuccess()) {
                    Status status2 = revokeAccessResultFromJson.getStatus();
                    taskCompletionSource.setException(new ApiException(new Status(status2.getStatusCode(), status2.getStatusMessage())));
                    return;
                } else {
                    taskCompletionSource.setResult(null);
                    return;
                }
            } catch (JSONException e) {
                ar.b("HuaweiIdCancelAuthorizationTaskApiCall", "JSONException:" + e.getClass().getSimpleName(), true);
                taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                return;
            }
        }
        taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
    }
}
