package n50;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln50/e;", "", "", "distance", "elevationGain", "elevationLoss", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f123744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f123745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f123746c;

    public e(Double d14, Double d15, Double d16) {
        this.f123744a = d14;
        this.f123745b = d15;
        this.f123746c = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f123744a, eVar.f123744a) && s.g(this.f123745b, eVar.f123745b) && s.g(this.f123746c, eVar.f123746c);
    }

    public final int hashCode() {
        Double d14 = this.f123744a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f123745b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f123746c;
        return iHashCode2 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        return i.g(k.i("CreateCourseHeaderUIState(distance=", this.f123744a, this.f123745b, ", elevationGain=", ", elevationLoss="), this.f123746c, ")");
    }
}
