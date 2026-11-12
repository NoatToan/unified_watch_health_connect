package com.google.android.datatransport.cct.internal;

import am.j;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_LogResponse extends LogResponse {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long j8) {
        this.nextRequestWaitMillis = j8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.nextRequestWaitMillis == ((LogResponse) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long j8 = this.nextRequestWaitMillis;
        return ((int) (j8 ^ (j8 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return j.i(this.nextRequestWaitMillis, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
