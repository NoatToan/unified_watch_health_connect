package com.facebook.react.bridge;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes4.dex */
public class JavaScriptContextHolder {

    @GuardedBy("this")
    private long mContext;

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }

    public synchronized void clear() {
        this.mContext = 0L;
    }

    @GuardedBy("this")
    public long get() {
        return this.mContext;
    }
}
