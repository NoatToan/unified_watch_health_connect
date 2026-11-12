package bx;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbx/j;", "", "", "timestamp", "", "stressLevel", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f21646b;

    public j(Long l14, Integer num) {
        this.f21645a = l14;
        this.f21646b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f21645a, jVar.f21645a) && s.g(this.f21646b, jVar.f21646b);
    }

    public final int hashCode() {
        Long l14 = this.f21645a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Integer num = this.f21646b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "StressValue(timestamp=" + this.f21645a + ", stressLevel=" + this.f21646b + ")";
    }
}
