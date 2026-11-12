package sm;

import am.j;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsm/b;", "", "", "startTime", "endTime", "<init>", "(JJ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f160060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f160061b;

    public b(long j8, long j14) {
        this.f160060a = j8;
        this.f160061b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f160060a == bVar.f160060a && this.f160061b == bVar.f160061b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f160061b) + (Long.hashCode(this.f160060a) * 31);
    }

    public final String toString() {
        return j.i(this.f160061b, ")", e0.k(this.f160060a, "SplitTime(startTime=", ", endTime="));
    }
}
