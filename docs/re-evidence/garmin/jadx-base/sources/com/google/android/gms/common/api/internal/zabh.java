package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes14.dex */
final class zabh extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(zabi zabiVar, Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i14 = message.what;
        if (i14 == 1) {
            ((zabg) message.obj).zab(this.zaa);
        } else if (i14 == 2) {
            throw ((RuntimeException) message.obj);
        }
    }
}
