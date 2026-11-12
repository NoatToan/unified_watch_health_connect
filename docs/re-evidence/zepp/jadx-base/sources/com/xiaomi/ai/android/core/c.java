package com.xiaomi.ai.android.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;

/* JADX INFO: loaded from: classes18.dex */
public final class c extends Handler {
    private d a;

    public c(d dVar, Looper looper) {
        super(looper);
        this.a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.f().a((Instruction) message.obj);
            return;
        }
        if (i != 3) {
            return;
        }
        ErrorCapability errorCapability = (ErrorCapability) this.a.a(ErrorCapability.class);
        if (errorCapability == null) {
            Logger.d("DownloadHandler", "handleMessage:ErrorCapability not register");
        } else {
            errorCapability.onError((AivsError) message.obj);
            this.a.restart();
        }
    }
}
