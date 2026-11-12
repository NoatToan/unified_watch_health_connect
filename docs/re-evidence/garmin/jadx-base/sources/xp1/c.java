package xp1;

import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxp1/c;", "", "", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "<init>", "(JJ)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f191857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191858b;

    public /* synthetic */ c(long j8, long j14, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? 0L : j14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f191857a == cVar.f191857a && this.f191858b == cVar.f191858b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f191858b) + (Long.hashCode(this.f191857a) * 31);
    }

    public final String toString() {
        return am.j.i(this.f191858b, ")", e0.k(this.f191857a, "SleepState(sleepStartTimestampGMT=", ", sleepEndTimestampGMT="));
    }

    public c(long j8, long j14) {
        this.f191857a = j8;
        this.f191858b = j14;
    }

    public c() {
        this(0L, 0L, 3, null);
    }
}
