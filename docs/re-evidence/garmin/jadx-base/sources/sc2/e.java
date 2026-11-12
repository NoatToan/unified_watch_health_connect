package sc2;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsc2/e;", "", "", "fullName", "guid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158497b;

    public e(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f158496a = str;
        this.f158497b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f158496a.equals(eVar.f158496a) && this.f158497b.equals(eVar.f158497b);
    }

    public final int hashCode() {
        return this.f158497b.hashCode() + (this.f158496a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("ITBasicCustomerInfoDTO(fullName='", this.f158496a, "', guid='", this.f158497b, "')");
    }
}
