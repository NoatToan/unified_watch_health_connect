package sc2;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsc2/h;", "", "", "serviceUrl", "serviceTicket", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158506b;

    public h(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f158505a = str;
        this.f158506b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f158505a.equals(hVar.f158505a) && this.f158506b.equals(hVar.f158506b);
    }

    public final int hashCode() {
        return this.f158506b.hashCode() + (this.f158505a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("ITServiceTicket(serviceUrl='", this.f158505a, "', serviceTicket='", this.f158506b, "')");
    }
}
