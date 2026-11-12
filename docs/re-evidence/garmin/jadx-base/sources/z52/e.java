package z52;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz52/e;", "", "", "speed", "", "heartRate", "heartRateCycling", "<init>", "(DLjava/lang/Integer;Ljava/lang/Integer;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f202539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f202540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f202541c;

    public e(double d14, Integer num, Integer num2) {
        this.f202539a = d14;
        this.f202540b = num;
        this.f202541c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Double.compare(this.f202539a, eVar.f202539a) == 0 && s.g(this.f202540b, eVar.f202540b) && s.g(this.f202541c, eVar.f202541c);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f202539a) * 31;
        Integer num = this.f202540b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f202541c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LatestLactateThreshold(speed=" + this.f202539a + ", heartRate=" + this.f202540b + ", heartRateCycling=" + this.f202541c + ")";
    }
}
