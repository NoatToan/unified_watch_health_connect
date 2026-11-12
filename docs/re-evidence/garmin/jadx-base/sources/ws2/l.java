package ws2;

import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lws2/l;", "", "", "transferredSize", "totalTransferTime", "<init>", "(JJ)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f187001b;

    public l(long j8, long j14) {
        this.f187000a = j8;
        this.f187001b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f187000a == lVar.f187000a && this.f187001b == lVar.f187001b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f187001b) + (Long.hashCode(this.f187000a) * 31);
    }

    public final String toString() {
        return am.j.i(this.f187001b, ")", e0.k(this.f187000a, "FileTransferMetrics(transferredSize=", ", totalTransferTime="));
    }
}
