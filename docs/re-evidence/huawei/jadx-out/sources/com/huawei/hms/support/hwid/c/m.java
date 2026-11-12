package com.huawei.hms.support.hwid.c;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hwid.result.SignInQrInfo;
import com.huawei.hms.support.hwid.result.StartQrLoginResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class m extends b<SignInQrInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16606b;

    @Override // com.huawei.hms.support.hwid.c.b
    protected boolean a() {
        return false;
    }

    public m(String str, String str2, String str3) {
        super(str, str2, str3);
        this.f16606b = false;
    }

    @Override // com.huawei.hms.support.hwid.c.b, com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return b() ? 60600300 : 60100300;
    }

    @Override // com.huawei.hms.support.hwid.c.b, com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return b() ? 17 : 16;
    }

    @Override // com.huawei.hms.support.hwid.c.b
    protected void a(ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<SignInQrInfo> taskCompletionSource) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hms.support.hwid.common.e.e.b(this.f16603a, "body is empty.");
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            StartQrLoginResult startQrLoginResultFromJson = new StartQrLoginResult().fromJson(str);
            if (startQrLoginResultFromJson.isSuccess()) {
                taskCompletionSource.setResult(startQrLoginResultFromJson.getSignInQrInfo());
            } else {
                com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "request is error.");
                taskCompletionSource.setException(new ApiException(startQrLoginResultFromJson.getStatus()));
            }
        } catch (JSONException e) {
            com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "JSONException：" + e.getClass().getSimpleName());
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    public boolean b() {
        return this.f16606b;
    }

    public void a(boolean z) {
        this.f16606b = z;
    }
}
