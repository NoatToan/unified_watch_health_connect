package yl;

import am.j;
import j82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyl/b;", "", "", "spo2Value", "Lj82/g;", "legendSymbol", "time", "elevation", "activeDuration", "<init>", "(Ljava/lang/String;Lj82/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f197629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f197631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f197632e;

    public b(String str, g gVar, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f197628a = str;
        this.f197629b = gVar;
        this.f197630c = str2;
        this.f197631d = str3;
        this.f197632e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f197628a.equals(bVar.f197628a) && s.g(this.f197629b, bVar.f197629b) && this.f197630c.equals(bVar.f197630c) && s.g(this.f197631d, bVar.f197631d) && s.g(this.f197632e, bVar.f197632e);
    }

    public final int hashCode() {
        int iHashCode = this.f197628a.hashCode() * 31;
        g gVar = this.f197629b;
        int iJ = wr.g.j((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f197630c);
        String str = this.f197631d;
        int iHashCode2 = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f197632e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PulseOxAcclimationDailyReportChartHoverEntry(spo2Value=");
        sb3.append(this.f197628a);
        sb3.append(", legendSymbol=");
        sb3.append(this.f197629b);
        sb3.append(", time=");
        sn.a.t(sb3, this.f197630c, ", elevation=", this.f197631d, ", activeDuration=");
        return j.o(this.f197632e, ")", sb3);
    }
}
