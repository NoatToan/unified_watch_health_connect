package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zas;

/* JADX INFO: loaded from: classes3.dex */
final class t extends zas {
    private final /* synthetic */ zaaz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zaaz zaazVar, Looper looper) {
        super(looper);
        this.b = zaazVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((s) message.obj).b(this.b);
        } else {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        }
    }
}
