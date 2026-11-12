package ri2;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lri2/a;", "", "", "url", "jsonStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152946b;

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f152945a = str;
        this.f152946b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f152945a.equals(aVar.f152945a) && this.f152946b.equals(aVar.f152946b);
    }

    public final int hashCode() {
        return this.f152946b.hashCode() + (this.f152945a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("GCChildRegistrationResponse(url=", this.f152945a, ", jsonStr=", this.f152946b, ")");
    }
}
