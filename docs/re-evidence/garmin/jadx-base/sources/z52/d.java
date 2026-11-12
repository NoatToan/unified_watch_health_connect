package z52;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz52/d;", "", "", "heartRate", "", "speed", "power", "powerCurve", "cadence", "<init>", "(IDDDD)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f202535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f202536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f202537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f202538e;

    public d(int i14, double d14, double d15, double d16, double d17) {
        this.f202534a = i14;
        this.f202535b = d14;
        this.f202536c = d15;
        this.f202537d = d16;
        this.f202538e = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f202534a == dVar.f202534a && Double.compare(this.f202535b, dVar.f202535b) == 0 && Double.compare(this.f202536c, dVar.f202536c) == 0 && Double.compare(this.f202537d, dVar.f202537d) == 0 && Double.compare(this.f202538e, dVar.f202538e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f202538e) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Integer.hashCode(this.f202534a) * 31, 31, this.f202535b), 31, this.f202536c), 31, this.f202537d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CyclingBiometric(heartRate=");
        sb3.append(this.f202534a);
        sb3.append(", speed=");
        sb3.append(this.f202535b);
        j.x(sb3, ", power=", this.f202536c, ", powerCurve=");
        sb3.append(this.f202537d);
        return j.r(sb3, ", cadence=", this.f202538e, ")");
    }
}
