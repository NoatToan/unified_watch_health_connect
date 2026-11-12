package com.huawei.hwcloudjs.service.hms;

import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hwcloudjs.core.JsCallback;

/* JADX INFO: loaded from: classes10.dex */
class c implements OnCompleteListener<AuthHuaweiId> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi.LoginReq f17145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsCallback f17146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HmsCoreApi f17147c;

    @Override // com.huawei.hmf.tasks.OnCompleteListener
    public void onComplete(Task<AuthHuaweiId> task) throws Throwable {
        try {
            this.f17147c.a(task.getResultThrowException(ApiException.class), this.f17145a.needAuthCode, this.f17146b);
        } catch (ApiException e) {
            this.f17147c.a(e, this.f17146b);
        }
    }

    c(HmsCoreApi hmsCoreApi, HmsCoreApi.LoginReq loginReq, JsCallback jsCallback) {
        this.f17147c = hmsCoreApi;
        this.f17145a = loginReq;
        this.f17146b = jsCallback;
    }
}
