package com.huawei.hwcloudjs.service.hms;

import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hwcloudjs.core.JsCallback;

/* JADX INFO: loaded from: classes10.dex */
class g implements ResultCallback<Status> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsCallback f17154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi f17155b;

    @Override // com.huawei.hms.support.api.client.ResultCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(Status status) {
        if (status != null) {
            com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "signOut status is not null", true);
            if (status.isSuccess()) {
                com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "signOut successed", true);
                this.f17154a.success();
                return;
            }
            com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "signOut failed, statusCode:" + status.getStatusCode() + " msg:" + status.getStatusMessage(), true);
            this.f17154a.failure(status.getStatusCode(), status.getStatusMessage());
            return;
        }
        com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "signOut failed, status is null", true);
        this.f17154a.failure("signOut failed, status is null");
    }

    g(HmsCoreApi hmsCoreApi, JsCallback jsCallback) {
        this.f17155b = hmsCoreApi;
        this.f17154a = jsCallback;
    }
}
