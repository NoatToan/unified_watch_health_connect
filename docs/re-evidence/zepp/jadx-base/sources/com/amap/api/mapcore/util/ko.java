package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore.Inner_3dMap_location;

/* JADX INFO: loaded from: classes2.dex */
public final class ko extends Handler {
    public km a;

    public ko(Looper looper, km kmVar) {
        super(looper);
        this.a = null;
        this.a = kmVar;
    }

    public ko(km kmVar) {
        this.a = null;
        this.a = kmVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        try {
            km kmVar = this.a;
            if (kmVar != null) {
                kmVar.a((Inner_3dMap_location) message.obj);
            }
        } catch (Throwable th) {
            ke.a(th, "ClientResultHandler", "RESULT_LOCATION_FINISH");
        }
    }
}
