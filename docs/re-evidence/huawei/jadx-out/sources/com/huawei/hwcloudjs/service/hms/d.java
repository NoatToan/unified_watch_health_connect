package com.huawei.hwcloudjs.service.hms;

import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hwcloudjs.core.JsCallback;

/* JADX INFO: loaded from: classes10.dex */
class d implements OnCompleteListener<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsCallback f17148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi f17149b;

    @Override // com.huawei.hmf.tasks.OnCompleteListener
    public void onComplete(Task<Void> task) {
        if (task != null) {
            com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "cancelAuthorization task is not null", true);
            if (task.isSuccessful()) {
                com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "cancelAuthorization successed", true);
                this.f17148a.success();
                return;
            }
            Exception exception = task.getException();
            if (exception == null || !(exception instanceof ApiException)) {
                com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "cancelAuthorization getException failed", true);
                this.f17148a.failure("cancelAuthorization getException failed");
                return;
            }
            ApiException apiException = (ApiException) task.getException();
            com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "cancelAuthorization failed, statusCode:" + apiException.getStatusCode() + " msg:" + apiException.getStatusMessage(), true);
            this.f17148a.failure(apiException.getStatusCode(), apiException.getStatusMessage());
            return;
        }
        com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "cancelAuthorization failed, task is null", true);
        this.f17148a.failure("cancelAuthorization failed, task is null");
    }

    d(HmsCoreApi hmsCoreApi, JsCallback jsCallback) {
        this.f17149b = hmsCoreApi;
        this.f17148a = jsCallback;
    }
}
