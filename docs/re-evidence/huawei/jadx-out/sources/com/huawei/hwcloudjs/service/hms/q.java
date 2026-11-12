package com.huawei.hwcloudjs.service.hms;

import com.huawei.hwcloudjs.core.JsCallback;
import com.huawei.hwidauth.api.ResultCallBack;
import defpackage.nms;
import defpackage.nmv;

/* JADX INFO: loaded from: classes10.dex */
class q implements ResultCallBack<nmv> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsCallback f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HmsLiteCoreApi f17193b;

    @Override // com.huawei.hwidauth.api.ResultCallBack
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(nmv nmvVar) {
        com.huawei.hwcloudjs.f.d.c("HmsLiteCoreApi", "cancelAuthorization onResult begin", true);
        if (nmvVar != null) {
            try {
                nms status = nmvVar.getStatus();
                int iE = status.e();
                if (iE == 200) {
                    com.huawei.hwcloudjs.f.d.c("HmsLiteCoreApi", "cancelAuthorization success", true);
                    this.f17192a.success();
                    return;
                } else {
                    com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", "cancelAuthorization failed", true);
                    this.f17192a.failure(iE, status.a());
                    return;
                }
            } catch (RuntimeException unused) {
                this.f17192a.failure("cancelAuthorization exception");
                com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", "cancelAuthorization exception", true);
                return;
            }
        }
        this.f17192a.failure("cancelAuthorization result is null");
        com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", "result is null", true);
    }

    q(HmsLiteCoreApi hmsLiteCoreApi, JsCallback jsCallback) {
        this.f17193b = hmsLiteCoreApi;
        this.f17192a = jsCallback;
    }
}
