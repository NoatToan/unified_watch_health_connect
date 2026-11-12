package com.google.android.datatransport.cct.internal;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes2.dex */
final class f extends LogResponse {
    private final long b;

    public f(long j) {
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.b == ((LogResponse) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.b + i.d;
    }
}
