package pt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpt1/v;", "", "", "trailName", "trailLocation", "trailImageUrl", "", "isActivityTypeHiking", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f140996d;

    public v(String str, String str2, String str3, boolean z14) {
        str.getClass();
        str2.getClass();
        this.f140993a = str;
        this.f140994b = str2;
        this.f140995c = str3;
        this.f140996d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f140993a, vVar.f140993a) && p005kotlin.jvm.internal.s.g(this.f140994b, vVar.f140994b) && p005kotlin.jvm.internal.s.g(this.f140995c, vVar.f140995c) && this.f140996d == vVar.f140996d;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f140993a.hashCode() * 31, 31, this.f140994b);
        String str = this.f140995c;
        return Boolean.hashCode(this.f140996d) + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return am.j.n(this.f140995c, ", isActivityTypeHiking=", ")", p6.b.i("TrailReviewPromptState(trailName=", this.f140993a, ", trailLocation=", this.f140994b, ", trailImageUrl="), this.f140996d);
    }

    public /* synthetic */ v(String str, String str2, String str3, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? false : z14);
    }
}
