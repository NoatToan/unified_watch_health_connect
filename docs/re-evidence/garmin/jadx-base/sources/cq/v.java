package cq;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcq/v;", "", "", "timestamp", "elevation", "elevationLabel", "grade", "gradeLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55110e;

    public v(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str4.getClass();
        this.f55106a = str;
        this.f55107b = str2;
        this.f55108c = str3;
        this.f55109d = str4;
        this.f55110e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f55106a.equals(vVar.f55106a) && p005kotlin.jvm.internal.s.g(this.f55107b, vVar.f55107b) && p005kotlin.jvm.internal.s.g(this.f55108c, vVar.f55108c) && this.f55109d.equals(vVar.f55109d) && p005kotlin.jvm.internal.s.g(this.f55110e, vVar.f55110e);
    }

    public final int hashCode() {
        int iHashCode = this.f55106a.hashCode() * 31;
        String str = this.f55107b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f55108c;
        int iJ = wr.g.j((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f55109d);
        String str3 = this.f55110e;
        return iJ + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ClimbMarkerData(timestamp=", this.f55106a, ", elevation=", this.f55107b, ", elevationLabel=");
        sn.a.t(sbI, this.f55108c, ", grade=", this.f55109d, ", gradeLabel=");
        return am.j.o(this.f55110e, ")", sbI);
    }
}
