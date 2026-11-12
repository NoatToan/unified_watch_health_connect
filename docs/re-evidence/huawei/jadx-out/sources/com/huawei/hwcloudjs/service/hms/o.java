package com.huawei.hwcloudjs.service.hms;

import com.huawei.hwcloudjs.core.JsCallback;
import com.huawei.hwidauth.api.ResultCallBack;
import defpackage.nmu;

/* JADX INFO: loaded from: classes10.dex */
class o implements ResultCallBack<nmu> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsCallback f17188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HmsLiteCoreApi f17189b;

    @Override // com.huawei.hwidauth.api.ResultCallBack
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(nmu nmuVar) {
        com.huawei.hwcloudjs.f.d.c("HmsLiteCoreApi", "signInOauth onResult", true);
        this.f17189b.a(nmuVar, this.f17188a);
    }

    o(HmsLiteCoreApi hmsLiteCoreApi, JsCallback jsCallback) {
        this.f17189b = hmsLiteCoreApi;
        this.f17188a = jsCallback;
    }
}
