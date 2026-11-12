package com.google.android.datatransport.runtime.backends;

import com.alipay.sdk.m.u.i;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class b extends BackendResponse {
    private final BackendResponse.Status a;
    private final long b;

    public b(BackendResponse.Status status, long j) {
        Objects.requireNonNull(status, "Null status");
        this.a = status;
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.a.equals(backendResponse.getStatus()) && this.b == backendResponse.getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + i.d;
    }
}
