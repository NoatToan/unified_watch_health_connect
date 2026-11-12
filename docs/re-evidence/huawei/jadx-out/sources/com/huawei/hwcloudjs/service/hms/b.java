package com.huawei.hwcloudjs.service.hms;

import com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hwcloudjs.core.JsCallback;

/* JADX INFO: loaded from: classes10.dex */
class b implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi.LoginReq f17140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsCallback f17141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi f17142c;

    @Override // com.huawei.hwcloudjs.service.hms.a.c
    public void a(a.b bVar) {
        HuaweiIdAuthResult huaweiIdFromIntent = HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.parseHuaweiIdFromIntent(bVar.a());
        if (huaweiIdFromIntent == null) {
            com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "getSignInIntent failed, result is null", true);
            this.f17141b.failure("getSignInIntent failed, result is null");
            return;
        }
        com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "getSignInIntent result is not null", true);
        if (!huaweiIdFromIntent.isSuccess()) {
            com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "getSignInIntent failed, statusCode:" + huaweiIdFromIntent.getStatus().getStatusCode() + " msg:" + huaweiIdFromIntent.getStatus().getStatusMessage(), true);
            this.f17141b.failure(huaweiIdFromIntent.getStatus().getStatusCode(), huaweiIdFromIntent.getStatus().getStatusMessage());
            return;
        }
        AuthHuaweiId huaweiId = huaweiIdFromIntent.getHuaweiId();
        if (huaweiId != null) {
            com.huawei.hwcloudjs.f.d.c("HmsCoreApi", "getSignInIntent authHuaweiId is not null", true);
            this.f17142c.a(huaweiId, this.f17140a.needAuthCode, this.f17141b);
            return;
        }
        com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "getSignInIntent authHuaweiId is null", true);
        com.huawei.hwcloudjs.f.d.b("HmsCoreApi", "getSignInIntent statusCode:" + huaweiIdFromIntent.getStatus().getStatusCode() + " msg:" + huaweiIdFromIntent.getStatus().getStatusMessage(), true);
        this.f17141b.failure(1);
    }

    b(HmsCoreApi hmsCoreApi, HmsCoreApi.LoginReq loginReq, JsCallback jsCallback) {
        this.f17142c = hmsCoreApi;
        this.f17140a = loginReq;
        this.f17141b = jsCallback;
    }
}
