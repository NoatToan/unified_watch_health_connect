package ps0;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lps0/a;", "", "Lyz1/d;", "status", "", "bpm", "speed", "power", "powerToWeight", "", "lastUpdatedDate", "<init>", "(Lyz1/d;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f140454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f140455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f140456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f140457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f140458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f140459f;

    public a(d dVar, Double d14, Double d15, Double d16, Double d17, String str) {
        dVar.getClass();
        this.f140454a = dVar;
        this.f140455b = d14;
        this.f140456c = d15;
        this.f140457d = d16;
        this.f140458e = d17;
        this.f140459f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f140454a.equals(aVar.f140454a) && s.g(this.f140455b, aVar.f140455b) && s.g(this.f140456c, aVar.f140456c) && s.g(this.f140457d, aVar.f140457d) && s.g(this.f140458e, aVar.f140458e) && s.g(this.f140459f, aVar.f140459f);
    }

    public final int hashCode() {
        int iHashCode = this.f140454a.hashCode() * 31;
        Double d14 = this.f140455b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f140456c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f140457d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f140458e;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str = this.f140459f;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LactateThresholdCardData(status=");
        sb3.append(this.f140454a);
        sb3.append(", bpm=");
        sb3.append(this.f140455b);
        sb3.append(", speed=");
        i.p(this.f140456c, this.f140457d, ", power=", ", powerToWeight=", sb3);
        sb3.append(this.f140458e);
        sb3.append(", lastUpdatedDate=");
        sb3.append(this.f140459f);
        sb3.append(")");
        return sb3.toString();
    }
}
