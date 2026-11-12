package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.UPSEInfoResp;

/* JADX INFO: loaded from: classes6.dex */
final class h implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f10762a;

    public h(g gVar) {
        this.f10762a = gVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f10762a.i.removeMessages(4);
            com.unionpay.utils.j.c("uppay", "msg error");
            g.a(this.f10762a, message.arg1, (String) message.obj);
            return false;
        }
        if (i == 4) {
            com.unionpay.utils.j.c("uppay", "timeout");
            g.a(this.f10762a, message.arg1, UPSEInfoResp.ERROR_TIMEOUT);
            g.b(this.f10762a);
            return false;
        }
        if (i != 4000) {
            return false;
        }
        this.f10762a.i.removeMessages(4);
        g.a(this.f10762a, (Bundle) message.obj);
        return false;
    }
}
