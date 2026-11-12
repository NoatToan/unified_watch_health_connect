package rm1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrm1/k;", "", "", "value", "", "startGMT", "<init>", "(IJ)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153612b;

    public k(int i14, long j8) {
        this.f153611a = i14;
        this.f153612b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f153611a == kVar.f153611a && this.f153612b == kVar.f153612b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f153612b) + (Integer.hashCode(this.f153611a) * 31);
    }

    public final String toString() {
        return "SleepMetricEpoch(value=" + this.f153611a + ", startGMT=" + this.f153612b + ")";
    }
}
