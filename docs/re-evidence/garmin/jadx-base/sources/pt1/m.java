package pt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpt1/m;", "", "", "trailId", "", "trailName", "suggestion", "Lus1/d;", "reportTrailIssueType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lus1/d;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final us1.d f140892d;

    public m(long j8, String str, String str2, us1.d dVar) {
        str.getClass();
        str2.getClass();
        this.f140889a = j8;
        this.f140890b = str;
        this.f140891c = str2;
        this.f140892d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f140889a == mVar.f140889a && p005kotlin.jvm.internal.s.g(this.f140890b, mVar.f140890b) && p005kotlin.jvm.internal.s.g(this.f140891c, mVar.f140891c) && this.f140892d == mVar.f140892d;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(Long.hashCode(this.f140889a) * 31, 31, this.f140890b), 31, this.f140891c);
        us1.d dVar = this.f140892d;
        return iJ + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f140889a, "SuggestEditState(trailId=", ", trailName=", this.f140890b);
        sbK.append(", suggestion=");
        sbK.append(this.f140891c);
        sbK.append(", reportTrailIssueType=");
        sbK.append(this.f140892d);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ m(long j8, String str, String str2, us1.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, str2, (i14 & 8) != 0 ? null : dVar);
    }
}
