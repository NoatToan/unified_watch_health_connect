package rm1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrm1/n;", "", "", "averageSPO2", "", "sleepMeasurementStartGMT", "sleepMeasurementEndGMT", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153630c;

    public n(int i14, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f153628a = i14;
        this.f153629b = str;
        this.f153630c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f153628a == nVar.f153628a && this.f153629b.equals(nVar.f153629b) && this.f153630c.equals(nVar.f153630c);
    }

    public final int hashCode() {
        return this.f153630c.hashCode() + wr.g.j(Integer.hashCode(this.f153628a) * 31, 31, this.f153629b);
    }

    public final String toString() {
        return am.j.o(this.f153630c, ")", wr.g.r(this.f153628a, "SpO2SleepSummary(averageSPO2=", ", sleepMeasurementStartGMT=", this.f153629b, ", sleepMeasurementEndGMT="));
    }
}
