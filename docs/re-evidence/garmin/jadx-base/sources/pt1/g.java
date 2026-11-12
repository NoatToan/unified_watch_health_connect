package pt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpt1/g;", "", "", "trailId", "", "trailName", "issueText", "Lus1/d;", "reportTrailIssueType", "", "activityDataConsent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lus1/d;Z)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final us1.d f140848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f140849e;

    public g(long j8, String str, String str2, us1.d dVar, boolean z14) {
        str.getClass();
        str2.getClass();
        this.f140845a = j8;
        this.f140846b = str;
        this.f140847c = str2;
        this.f140848d = dVar;
        this.f140849e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f140845a == gVar.f140845a && p005kotlin.jvm.internal.s.g(this.f140846b, gVar.f140846b) && p005kotlin.jvm.internal.s.g(this.f140847c, gVar.f140847c) && this.f140848d == gVar.f140848d && this.f140849e == gVar.f140849e;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(Long.hashCode(this.f140845a) * 31, 31, this.f140846b), 31, this.f140847c);
        us1.d dVar = this.f140848d;
        return Boolean.hashCode(this.f140849e) + ((iJ + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f140845a, "ReportMappingIssueState(trailId=", ", trailName=", this.f140846b);
        sbK.append(", issueText=");
        sbK.append(this.f140847c);
        sbK.append(", reportTrailIssueType=");
        sbK.append(this.f140848d);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", activityDataConsent=", this.f140849e, ")");
    }

    public /* synthetic */ g(long j8, String str, String str2, us1.d dVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, str2, (i14 & 8) != 0 ? null : dVar, (i14 & 16) != 0 ? false : z14);
    }
}
