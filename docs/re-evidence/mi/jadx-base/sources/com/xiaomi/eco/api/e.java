package com.xiaomi.eco.api;

import defpackage.ch7;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    protected final a mApiCall;
    protected b mApiTask;
    protected ch7 mCallback;
    private volatile boolean mCancelled;
    protected final String mUserId;

    public e(String str, a aVar) {
        this.mUserId = str;
        this.mApiCall = aVar;
    }

    public void cancel() {
        this.mCancelled = true;
        b bVar = this.mApiTask;
        if (bVar != null) {
            bVar.a();
            this.mApiTask = null;
        }
    }

    public final boolean isCancelled() {
        return this.mCancelled;
    }

    public void start(ch7 ch7Var) {
        this.mCallback = ch7Var;
    }
}
