package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes22.dex */
class s0 extends Handler {
    public final /* synthetic */ C1648r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(C1648r c1648r, Looper looper) {
        super(looper);
        this.a = c1648r;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C1648r.b bVar = (C1648r.b) message.obj;
        int i = message.what;
        if (i == 0) {
            bVar.a();
        } else if (i == 1) {
            bVar.c();
        }
        super.handleMessage(message);
    }
}
