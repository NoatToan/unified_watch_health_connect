package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zas;

/* JADX INFO: loaded from: classes3.dex */
final class p extends zas {
    private final /* synthetic */ zaar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zaar zaarVar, Looper looper) {
        super(looper);
        this.b = zaarVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.b.m();
            return;
        }
        if (i == 2) {
            this.b.l();
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i);
        Log.w("GoogleApiClientImpl", sb.toString());
    }
}
