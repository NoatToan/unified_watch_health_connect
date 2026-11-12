package gs1;

import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgs1/y;", "", "", "timestamp", "", "value", "<init>", "(JD)V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f78893b;

    public y(long j8, double d14) {
        this.f78892a = j8;
        this.f78893b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f78892a == yVar.f78892a && Double.compare(this.f78893b, yVar.f78893b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f78893b) + (Long.hashCode(this.f78892a) * 31);
    }

    public final String toString() {
        return c22.t.d(this.f78893b, ")", e0.k(this.f78892a, "TimestampValue(timestamp=", ", value="));
    }
}
