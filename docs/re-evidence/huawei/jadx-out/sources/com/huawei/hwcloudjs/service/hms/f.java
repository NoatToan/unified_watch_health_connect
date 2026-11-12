package com.huawei.hwcloudjs.service.hms;

import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hwcloudjs.core.JsCallback;

/* JADX INFO: loaded from: classes10.dex */
class f implements OnCompleteListener<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsCallback f17152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi f17153b;

    @Override // com.huawei.hmf.tasks.OnCompleteListener
    public void onComplete(Task<Void> task) {
        if (task != null) {
            com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "signOut task is not null", true);
            if (task.isSuccessful()) {
                com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "signOut successed", true);
                this.f17152a.success();
                return;
            }
            Exception exception = task.getException();
            if (exception == null || !(exception instanceof ApiException)) {
                com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "signOut getException failed", true);
                this.f17152a.failure("signOut getException failed");
                return;
            }
            ApiException apiException = (ApiException) exception;
            com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "signOut failed, statusCode:" + apiException.getStatusCode() + " msg:" + apiException.getStatusMessage(), true);
            this.f17152a.failure(apiException.getStatusCode(), apiException.getStatusMessage());
            return;
        }
        com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "signOut failed, task is null", true);
        this.f17152a.failure("signOut failed, task is null");
    }

    f(HmsCoreApi hmsCoreApi, JsCallback jsCallback) {
        this.f17153b = hmsCoreApi;
        this.f17152a = jsCallback;
    }
}
