package com.huawei.hwcloudjs.service.hms;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes10.dex */
class n implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HmsLiteCoreApi f17187a;

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 4) {
            return false;
        }
        Object obj = message.obj;
        if (obj == null || !(obj instanceof com.huawei.hwcloudjs.service.hms.bean.a)) {
            com.huawei.hwcloudjs.f.d.b("HmsLiteCoreApi", "msg.obj is not LoginBean type", true);
            return false;
        }
        this.f17187a.a((com.huawei.hwcloudjs.service.hms.bean.a) obj);
        return false;
    }

    n(HmsLiteCoreApi hmsLiteCoreApi) {
        this.f17187a = hmsLiteCoreApi;
    }
}
