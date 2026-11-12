package dd2;

import i3.e5;
import kg.f;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldd2/c;", "", "", "userToken", "userSecret", "consumerKey", "consumerSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59215d;

    public c(String str, String str2, String str3, String str4) {
        f.p(str, str2, str3, str4);
        this.f59212a = str;
        this.f59213b = str2;
        this.f59214c = str3;
        this.f59215d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59212a.equals(cVar.f59212a) && this.f59213b.equals(cVar.f59213b) && this.f59214c.equals(cVar.f59214c) && this.f59215d.equals(cVar.f59215d);
    }

    public final int hashCode() {
        return this.f59215d.hashCode() + g.j(g.j(this.f59212a.hashCode() * 31, 31, this.f59213b), 31, this.f59214c);
    }

    public final String toString() {
        return e5.h(p6.b.i("OAuth1Credential(userToken=", this.f59212a, ", userSecret=", this.f59213b, ", consumerKey="), this.f59214c, ", consumerSecret=", this.f59215d, ")");
    }
}
