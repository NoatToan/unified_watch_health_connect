package z52;

import am.j;
import c22.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz52/f;", "", "", "heartRate", "", "pace", "power", "cadence", "<init>", "(IDDD)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f202543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f202544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f202545d;

    public f(int i14, double d14, double d15, double d16) {
        this.f202542a = i14;
        this.f202543b = d14;
        this.f202544c = d15;
        this.f202545d = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f202542a == fVar.f202542a && Double.compare(this.f202543b, fVar.f202543b) == 0 && Double.compare(this.f202544c, fVar.f202544c) == 0 && Double.compare(this.f202545d, fVar.f202545d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f202545d) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Integer.hashCode(this.f202542a) * 31, 31, this.f202543b), 31, this.f202544c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RunningBiometric(heartRate=");
        sb3.append(this.f202542a);
        sb3.append(", pace=");
        sb3.append(this.f202543b);
        j.x(sb3, ", power=", this.f202544c, ", cadence=");
        return t.d(this.f202545d, ")", sb3);
    }
}
