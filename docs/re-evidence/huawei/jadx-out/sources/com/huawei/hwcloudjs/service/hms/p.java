package com.huawei.hwcloudjs.service.hms;

import com.huawei.hwcloudjs.core.JsCallback;
import com.huawei.hwidauth.api.ResultCallBack;
import defpackage.nml;

/* JADX INFO: loaded from: classes10.dex */
class p implements ResultCallBack<nml> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsCallback f17190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HmsLiteCoreApi f17191b;

    @Override // com.huawei.hwidauth.api.ResultCallBack
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(nml nmlVar) {
        if (nmlVar == null) {
            this.f17190a.failure("signOut result is null");
            com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", "signOut result is null", true);
        } else if (nmlVar.a()) {
            com.huawei.hwcloudjs.f.d.c("HmsLiteCoreApi", "signOut success", true);
            this.f17190a.success();
        } else {
            com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", "signOut failed", true);
            this.f17190a.failure(nmlVar.getStatus().e(), nmlVar.getStatus().a());
        }
    }

    p(HmsLiteCoreApi hmsLiteCoreApi, JsCallback jsCallback) {
        this.f17191b = hmsLiteCoreApi;
        this.f17190a = jsCallback;
    }
}
