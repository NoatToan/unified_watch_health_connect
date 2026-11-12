package ee1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lee1/c;", "", "Lyz1/d;", "status", "", "latestValue", "sleepAvg", "awakeAvg", "<init>", "(Lyz1/d;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f63921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f63922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f63923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f63924d;

    public c(d dVar, Double d14, Double d15, Double d16) {
        dVar.getClass();
        this.f63921a = dVar;
        this.f63922b = d14;
        this.f63923c = d15;
        this.f63924d = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f63921a.equals(cVar.f63921a) && s.g(this.f63922b, cVar.f63922b) && s.g(this.f63923c, cVar.f63923c) && s.g(this.f63924d, cVar.f63924d);
    }

    public final int hashCode() {
        int iHashCode = this.f63921a.hashCode() * 31;
        Double d14 = this.f63922b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f63923c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f63924d;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RespirationData(status=");
        sb3.append(this.f63921a);
        sb3.append(", latestValue=");
        sb3.append(this.f63922b);
        sb3.append(", sleepAvg=");
        return sn.a.f(this.f63923c, this.f63924d, ", awakeAvg=", ")", sb3);
    }
}
