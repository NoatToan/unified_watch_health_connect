package ci;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lci/i;", "Lci/k;", "", "maxSizeBytes", "", "expireAfterMillis", "<init>", "(IJ)V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27613c;

    public /* synthetic */ i(int i14, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? Integer.MAX_VALUE : i14, (i15 & 2) != 0 ? -1L : j8);
    }

    @Override // ci.k
    public final j a() {
        return new h(this.f27612b, this.f27613c);
    }

    public i(int i14) {
        this(i14, 0L, 2, null);
    }

    public i() {
        this(0, 0L, 3, null);
    }

    public i(int i14, long j8) {
        this.f27612b = i14;
        this.f27613c = j8;
    }
}
