package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class zas extends Handler {
    private static zar a;

    public zas() {
    }

    public zas(Looper looper) {
        super(looper);
    }

    public zas(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
