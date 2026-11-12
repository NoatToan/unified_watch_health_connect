package gj0;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;
import yc.l2;
import z72.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgj0/e;", "", "", "formattedTitle", "formattedSubtitle", "", "pieChartIndicatorValue", "Li53/c;", "Lz72/l;", "pieChartSections", "", "isStale", "showAddWeightSection", "", "powerToWeightRatio", "functionalThresholdPower", "weightInKilograms", "formattedValue", "formattedValueCaption", "formattedBasedOnValue", "formattedBasedOnValueDate", "formattedBasedOnWeightValue", "formattedBasedOnWeightValueDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Li53/c;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f77499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<l> f77500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f77501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f77502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f77503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f77504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f77505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f77507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f77508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f77509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f77510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f77511o;

    public /* synthetic */ e(String str, String str2, Float f14, i53.c cVar, boolean z14, boolean z15, Double d14, Double d15, Double d16, String str3, String str4, String str5, String str6, String str7, String str8, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, str2, (i14 & 4) != 0 ? null : f14, cVar, z14, z15, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? null : d16, str3, (i14 & 1024) != 0 ? null : str4, (i14 & 2048) != 0 ? null : str5, (i14 & 4096) != 0 ? null : str6, (i14 & 8192) != 0 ? null : str7, (i14 & 16384) != 0 ? null : str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f77497a, eVar.f77497a) && s.g(this.f77498b, eVar.f77498b) && s.g(this.f77499c, eVar.f77499c) && s.g(this.f77500d, eVar.f77500d) && this.f77501e == eVar.f77501e && this.f77502f == eVar.f77502f && s.g(this.f77503g, eVar.f77503g) && s.g(this.f77504h, eVar.f77504h) && s.g(this.f77505i, eVar.f77505i) && s.g(this.f77506j, eVar.f77506j) && s.g(this.f77507k, eVar.f77507k) && s.g(this.f77508l, eVar.f77508l) && s.g(this.f77509m, eVar.f77509m) && s.g(this.f77510n, eVar.f77510n) && s.g(this.f77511o, eVar.f77511o);
    }

    public final int hashCode() {
        String str = this.f77497a;
        int iJ = g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f77498b);
        Float f14 = this.f77499c;
        int iG = q6.f.g(q6.f.g(l2.a(this.f77500d, (iJ + (f14 == null ? 0 : f14.hashCode())) * 31, 31), 31, this.f77501e), 31, this.f77502f);
        Double d14 = this.f77503g;
        int iHashCode = (iG + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f77504h;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f77505i;
        int iJ2 = g.j((iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31, 31, this.f77506j);
        String str2 = this.f77507k;
        int iHashCode3 = (iJ2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77508l;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f77509m;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f77510n;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f77511o;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FtpSportCurrentState(formattedTitle=", this.f77497a, ", formattedSubtitle=", this.f77498b, ", pieChartIndicatorValue=");
        sbI.append(this.f77499c);
        sbI.append(", pieChartSections=");
        sbI.append(this.f77500d);
        sbI.append(", isStale=");
        kg.f.q(", showAddWeightSection=", ", powerToWeightRatio=", sbI, this.f77501e, this.f77502f);
        i.p(this.f77503g, this.f77504h, ", functionalThresholdPower=", ", weightInKilograms=", sbI);
        i.u(sbI, this.f77505i, ", formattedValue=", this.f77506j, ", formattedValueCaption=");
        sn.a.t(sbI, this.f77507k, ", formattedBasedOnValue=", this.f77508l, ", formattedBasedOnValueDate=");
        sn.a.t(sbI, this.f77509m, ", formattedBasedOnWeightValue=", this.f77510n, ", formattedBasedOnWeightValueDate=");
        return am.j.o(this.f77511o, ")", sbI);
    }

    public e(String str, String str2, Float f14, i53.c<l> cVar, boolean z14, boolean z15, Double d14, Double d15, Double d16, String str3, String str4, String str5, String str6, String str7, String str8) {
        str2.getClass();
        cVar.getClass();
        str3.getClass();
        this.f77497a = str;
        this.f77498b = str2;
        this.f77499c = f14;
        this.f77500d = cVar;
        this.f77501e = z14;
        this.f77502f = z15;
        this.f77503g = d14;
        this.f77504h = d15;
        this.f77505i = d16;
        this.f77506j = str3;
        this.f77507k = str4;
        this.f77508l = str5;
        this.f77509m = str6;
        this.f77510n = str7;
        this.f77511o = str8;
    }
}
