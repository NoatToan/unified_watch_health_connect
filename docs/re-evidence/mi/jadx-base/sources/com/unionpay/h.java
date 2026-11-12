package com.unionpay;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
final class h implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f10771a;

    public h(g gVar) {
        this.f10771a = gVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        IUnionCallback iUnionCallback;
        String str;
        String str2;
        int i = message.what;
        if (i != 1006) {
            if (i != 1007 || this.f10771a.f10770b || this.f10771a.c == null) {
                return true;
            }
            g.c(this.f10771a);
            if (message.getData() != null) {
                UPPayAssistEx.a(message.getData(), this.f10771a.c);
                return true;
            }
            iUnionCallback = this.f10771a.c;
            str = "03";
            str2 = "unknown error";
        } else {
            if (this.f10771a.f10770b || this.f10771a.c == null) {
                return true;
            }
            g.c(this.f10771a);
            iUnionCallback = this.f10771a.c;
            str = "02";
            str2 = "network error";
        }
        iUnionCallback.onError(str, str2);
        return true;
    }
}
