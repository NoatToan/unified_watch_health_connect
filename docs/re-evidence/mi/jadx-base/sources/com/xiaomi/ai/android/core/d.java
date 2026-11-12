package com.xiaomi.ai.android.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.ai.android.capability.ErrorCapability;
import defpackage.dcd;
import defpackage.f01;
import defpackage.wpe;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10886a;

    public d(e eVar, Looper looper) {
        super(looper);
        this.f10886a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f10886a.n().a((dcd) message.obj);
            return;
        }
        if (i == 2) {
            this.f10886a.n().a((byte[]) message.obj);
            return;
        }
        if (i != 3) {
            return;
        }
        ErrorCapability errorCapability = (ErrorCapability) this.f10886a.a(ErrorCapability.class);
        if (errorCapability == null) {
            wpe.e("DownloadHandler", "handleMessage:ErrorCapability not register");
        } else {
            errorCapability.onError((f01) message.obj);
            this.f10886a.restart();
        }
    }
}
