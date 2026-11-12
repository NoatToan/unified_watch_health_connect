package we2;

import java.net.URL;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwe2/f;", "", "Ljava/net/URL;", "mfaServiceURLForLight", "mfaServiceURLForDark", "<init>", "(Ljava/net/URL;Ljava/net/URL;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f184854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f184855b;

    public f(URL url, URL url2) {
        url.getClass();
        url2.getClass();
        this.f184854a = url;
        this.f184855b = url2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f184854a.equals(fVar.f184854a) && this.f184855b.equals(fVar.f184855b);
    }

    public final int hashCode() {
        return this.f184855b.hashCode() + (this.f184854a.hashCode() * 31);
    }

    public final String toString() {
        return "PortalAttributes(mfaServiceURLForLight=" + this.f184854a + ", mfaServiceURLForDark=" + this.f184855b + ")";
    }
}
