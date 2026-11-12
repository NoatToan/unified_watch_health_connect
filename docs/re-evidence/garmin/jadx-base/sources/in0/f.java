package in0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lin0/f;", "", "", "sleepPulseOxEnabled", "opticalHeartRateEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f94440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f94441b;

    public f(Boolean bool, Boolean bool2) {
        this.f94440a = bool;
        this.f94441b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f94440a, fVar.f94440a) && s.g(this.f94441b, fVar.f94441b);
    }

    public final int hashCode() {
        Boolean bool = this.f94440a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f94441b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "HealthStatusDeviceSettings(sleepPulseOxEnabled=" + this.f94440a + ", opticalHeartRateEnabled=" + this.f94441b + ")";
    }
}
