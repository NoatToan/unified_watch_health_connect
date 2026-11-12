package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmr/p;", "", "", "uuid", "name", "startDate", "endDate", "", "distanceMeters", "totalTimeSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f120284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f120285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f120286f;

    public p(String str, String str2, String str3, String str4, Double d14, Double d15) {
        kg.f.p(str, str2, str3, str4);
        this.f120281a = str;
        this.f120282b = str2;
        this.f120283c = str3;
        this.f120284d = str4;
        this.f120285e = d14;
        this.f120286f = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f120281a.equals(pVar.f120281a) && this.f120282b.equals(pVar.f120282b) && this.f120283c.equals(pVar.f120283c) && this.f120284d.equals(pVar.f120284d) && p005kotlin.jvm.internal.s.g(this.f120285e, pVar.f120285e) && p005kotlin.jvm.internal.s.g(this.f120286f, pVar.f120286f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(this.f120281a.hashCode() * 31, 31, this.f120282b), 31, this.f120283c), 31, this.f120284d);
        Double d14 = this.f120285e;
        int iHashCode = (iJ + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f120286f;
        return iHashCode + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EpicOverviewData(uuid=", this.f120281a, ", name=", this.f120282b, ", startDate=");
        sn.a.t(sbI, this.f120283c, ", endDate=", this.f120284d, ", distanceMeters=");
        return sn.a.f(this.f120285e, this.f120286f, ", totalTimeSeconds=", ")", sbI);
    }
}
