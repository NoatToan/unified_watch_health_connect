package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class zabb extends com.google.android.gms.internal.base.zal {
    private final /* synthetic */ zaaw zahg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabb(zaaw zaawVar, Looper looper) {
        super(looper);
        this.zahg = zaawVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zahg.zaav();
        } else {
            if (i == 2) {
                this.zahg.resume();
                return;
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
        }
    }
}
