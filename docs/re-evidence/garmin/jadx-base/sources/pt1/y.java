package pt1;

import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpt1/y;", "", "", "trailId", "activityId", "activityDateMs", "", "formattedActivityDate", "trailName", "trailImageUrl", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f141026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f141027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f141028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f141030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f141031f;

    public /* synthetic */ y(long j8, long j14, long j15, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, str, str2, (i14 & 32) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f141026a == yVar.f141026a && this.f141027b == yVar.f141027b && this.f141028c == yVar.f141028c && p005kotlin.jvm.internal.s.g(this.f141029d, yVar.f141029d) && p005kotlin.jvm.internal.s.g(this.f141030e, yVar.f141030e) && p005kotlin.jvm.internal.s.g(this.f141031f, yVar.f141031f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(q6.f.e(q6.f.e(Long.hashCode(this.f141026a) * 31, 31, this.f141027b), 31, this.f141028c), 31, this.f141029d), 31, this.f141030e);
        String str = this.f141031f;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f141026a, "TrailReviewSuggestionState(trailId=", ", activityId=");
        sbK.append(this.f141027b);
        j20.x.j(this.f141028c, ", activityDateMs=", ", formattedActivityDate=", sbK);
        sn.a.t(sbK, this.f141029d, ", trailName=", this.f141030e, ", trailImageUrl=");
        return am.j.o(this.f141031f, ")", sbK);
    }

    public y(long j8, long j14, long j15, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f141026a = j8;
        this.f141027b = j14;
        this.f141028c = j15;
        this.f141029d = str;
        this.f141030e = str2;
        this.f141031f = str3;
    }
}
