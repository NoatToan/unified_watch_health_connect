package rx;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrx/b;", "", "", "shortFeedback", "longFeedback", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154911c;

    public /* synthetic */ b(String str, String str2, String str3, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f154909a, bVar.f154909a) && s.g(this.f154910b, bVar.f154910b) && s.g(this.f154911c, bVar.f154911c);
    }

    public final int hashCode() {
        int iHashCode = this.f154909a.hashCode() * 31;
        String str = this.f154910b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154911c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f154911c, ")", p6.b.i("FeedbackData(shortFeedback=", this.f154909a, ", longFeedback=", this.f154910b, ", link="));
    }

    public b(String str, String str2, String str3) {
        str.getClass();
        this.f154909a = str;
        this.f154910b = str2;
        this.f154911c = str3;
    }
}
