package com.google.android.datatransport.runtime.backends;

import am.j;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_BackendResponse extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse.Status status;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j8) {
        if (status == null) {
            x.l("Null status");
            throw null;
        }
        this.status = status;
        this.nextRequestWaitMillis = j8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            if (this.status.equals(backendResponse.getStatus()) && this.nextRequestWaitMillis == backendResponse.getNextRequestWaitMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() ^ 1000003) * 1000003;
        long j8 = this.nextRequestWaitMillis;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("BackendResponse{status=");
        sb3.append(this.status);
        sb3.append(", nextRequestWaitMillis=");
        return j.i(this.nextRequestWaitMillis, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
