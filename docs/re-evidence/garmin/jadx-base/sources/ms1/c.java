package ms1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lms1/c;", "", "", "startTimeGMTMillis", "", "isActivityTypeHiking", "<init>", "(JZ)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f120481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f120482b;

    public c(long j8, boolean z14) {
        this.f120481a = j8;
        this.f120482b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f120481a == cVar.f120481a && this.f120482b == cVar.f120482b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120482b) + (Long.hashCode(this.f120481a) * 31);
    }

    public final String toString() {
        return "TrailActivityData(startTimeGMTMillis=" + this.f120481a + ", isActivityTypeHiking=" + this.f120482b + ")";
    }
}
