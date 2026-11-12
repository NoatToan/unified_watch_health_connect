package com.huawei.hwcloudjs.service.hms;

import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hwcloudjs.core.JsCallback;

/* JADX INFO: loaded from: classes10.dex */
class e implements ResultCallback<Status> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsCallback f17150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi f17151b;

    @Override // com.huawei.hms.support.api.client.ResultCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(Status status) {
        if (status != null) {
            com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "cancelAuthorization status is not null", true);
            if (status.isSuccess()) {
                com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "cancelAuthorization successed", true);
                this.f17150a.success();
                return;
            }
            com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "cancelAuthorization failed, statusCode:" + status.getStatusCode() + " msg:" + status.getStatusMessage(), true);
            this.f17150a.failure(status.getStatusCode(), status.getStatusMessage());
            return;
        }
        com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "cancelAuthorization failed, status is null", true);
        this.f17150a.failure("cancelAuthorization failed, status is null");
    }

    e(HmsCoreApi hmsCoreApi, JsCallback jsCallback) {
        this.f17151b = hmsCoreApi;
        this.f17150a = jsCallback;
    }
}
