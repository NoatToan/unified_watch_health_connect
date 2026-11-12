package com.huawei.hwcloudjs.service.hms;

import android.app.Activity;
import com.huawei.hwcloudjs.api.TaskCallBack;
import com.huawei.hwcloudjs.core.JsCallback;
import com.huawei.hwcloudjs.service.hms.bean.AccessTokenInfo;

/* JADX INFO: loaded from: classes10.dex */
class m implements TaskCallBack<AccessTokenInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f17185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String[] f17186c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ JsCallback g;
    final /* synthetic */ HmsLiteCoreApi h;

    @Override // com.huawei.hwcloudjs.api.TaskCallBack
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(AccessTokenInfo accessTokenInfo) {
        if (this.h.f) {
            return;
        }
        if (accessTokenInfo == null) {
            this.h.g.removeMessages(4);
            this.h.a(this.f17184a, this.f17185b, this.f17186c, this.d, this.e, null, this.f, this.g);
            com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", "jsIAccessToken.getAccessToken result = null", true);
        } else {
            if (accessTokenInfo.isSuccess()) {
                String accessToken = accessTokenInfo.getAccessToken();
                com.huawei.hwcloudjs.f.d.c("HmsLiteCoreApi", "signIn getAccessToken success", true);
                this.h.g.removeMessages(4);
                this.h.a(this.f17184a, this.f17185b, this.f17186c, this.d, this.e, accessToken, this.f, this.g);
                return;
            }
            this.h.g.removeMessages(4);
            this.h.a(this.f17184a, this.f17185b, this.f17186c, this.d, this.e, null, this.f, this.g);
            com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", " stateCode = " + accessTokenInfo.getStatus().getStateCode() + "\nstatusMessage = " + accessTokenInfo.getStatus().getStateMessage(), true);
        }
    }

    m(HmsLiteCoreApi hmsLiteCoreApi, Activity activity, String str, String[] strArr, String str2, String str3, boolean z, JsCallback jsCallback) {
        this.h = hmsLiteCoreApi;
        this.f17184a = activity;
        this.f17185b = str;
        this.f17186c = strArr;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = jsCallback;
    }
}
