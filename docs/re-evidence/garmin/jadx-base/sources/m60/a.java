package m60;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm60/a;", "", "Lyz1/d;", "status", "", "lastUpdated", "", "paceInMetersPerSecond", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/lang/Double;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f116871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f116873c;

    public a(yz1.d dVar, String str, Double d14) {
        dVar.getClass();
        this.f116871a = dVar;
        this.f116872b = str;
        this.f116873c = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f116871a.equals(aVar.f116871a) && s.g(this.f116872b, aVar.f116872b) && s.g(this.f116873c, aVar.f116873c);
    }

    public final int hashCode() {
        int iHashCode = this.f116871a.hashCode() * 31;
        String str = this.f116872b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.f116873c;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CriticalSwimSpeedCardData(status=");
        sb3.append(this.f116871a);
        sb3.append(", lastUpdated=");
        sb3.append(this.f116872b);
        sb3.append(", paceInMetersPerSecond=");
        return i.g(sb3, this.f116873c, ")");
    }
}
