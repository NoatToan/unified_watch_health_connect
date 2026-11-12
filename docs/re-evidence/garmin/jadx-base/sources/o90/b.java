package o90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo90/b;", "", "", "isEligible", "", "freeTrialDuration", "<init>", "(ZI)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f130971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f130972b;

    public b(boolean z14, int i14) {
        this.f130971a = z14;
        this.f130972b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f130971a == bVar.f130971a && this.f130972b == bVar.f130972b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130972b) + (Boolean.hashCode(this.f130971a) * 31);
    }

    public final String toString() {
        return "FreeTrialEligibility(isEligible=" + this.f130971a + ", freeTrialDuration=" + this.f130972b + ")";
    }
}
