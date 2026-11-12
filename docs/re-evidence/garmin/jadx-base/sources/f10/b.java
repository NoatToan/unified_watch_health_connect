package f10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf10/b;", "", "", "isOfficial", "isVerified", "", "eventMonth", "eventDay", "eventName", "eventMetadata", "hasCourse", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f67809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f67810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f67811g;

    public b(boolean z14, boolean z15, String str, String str2, String str3, String str4, boolean z16) {
        kg.f.p(str, str2, str3, str4);
        this.f67805a = z14;
        this.f67806b = z15;
        this.f67807c = str;
        this.f67808d = str2;
        this.f67809e = str3;
        this.f67810f = str4;
        this.f67811g = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f67805a == bVar.f67805a && this.f67806b == bVar.f67806b && this.f67807c.equals(bVar.f67807c) && this.f67808d.equals(bVar.f67808d) && this.f67809e.equals(bVar.f67809e) && this.f67810f.equals(bVar.f67810f) && this.f67811g == bVar.f67811g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67811g) + wr.g.j(wr.g.j(wr.g.j(wr.g.j(q6.f.g(Boolean.hashCode(this.f67805a) * 31, 31, this.f67806b), 31, this.f67807c), 31, this.f67808d), 31, this.f67809e), 31, this.f67810f);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("EventListRowData(isOfficial=", ", isVerified=", ", eventMonth=", this.f67805a, this.f67806b);
        sn.a.t(sbM, this.f67807c, ", eventDay=", this.f67808d, ", eventName=");
        sn.a.t(sbM, this.f67809e, ", eventMetadata=", this.f67810f, ", hasCourse=");
        return hb.a.k(sbM, this.f67811g, ")");
    }
}
