package i50;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li50/d;", "", "", "imageRes", "", "message", "detailsText", "actionButtonText", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91732d;

    public d(int i14, String str, String str2, String str3) {
        str.getClass();
        this.f91729a = i14;
        this.f91730b = str;
        this.f91731c = str2;
        this.f91732d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f91729a == dVar.f91729a && this.f91730b.equals(dVar.f91730b) && s.g(this.f91731c, dVar.f91731c) && s.g(this.f91732d, dVar.f91732d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Integer.hashCode(this.f91729a) * 31, 31, this.f91730b);
        String str = this.f91731c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f91732d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e5.h(wr.g.r(this.f91729a, "CoursesEmptyState(imageRes=", ", message=", this.f91730b, ", detailsText="), this.f91731c, ", actionButtonText=", this.f91732d, ")");
    }
}
