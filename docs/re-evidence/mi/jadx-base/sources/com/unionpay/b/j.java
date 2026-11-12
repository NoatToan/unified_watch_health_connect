package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.tsmservice.mi.mini.ITsmCallback;
import com.unionpay.tsmservice.mi.mini.result.QueryVendorPayStatusResult;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends ITsmCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10764a = 4000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f10765b;

    public j(Handler handler) {
        this.f10765b = handler;
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onError(String str, String str2) {
        com.unionpay.utils.j.c("uppay", "errorCode:" + str + ", errorDesc:" + str2);
        Handler handler = this.f10765b;
        handler.sendMessage(Message.obtain(handler, 1, this.f10764a, 0, str + str2));
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.f10764a != 4000) {
            return;
        }
        com.unionpay.utils.j.c("uppay-spay", "query vendor pay status callback");
        bundle.setClassLoader(QueryVendorPayStatusResult.class.getClassLoader());
        Bundle queryVendorPayStatusResult = ((QueryVendorPayStatusResult) bundle.get("result")).getQueryVendorPayStatusResult();
        Handler handler = this.f10765b;
        handler.sendMessage(Message.obtain(handler, 4000, queryVendorPayStatusResult));
    }
}
