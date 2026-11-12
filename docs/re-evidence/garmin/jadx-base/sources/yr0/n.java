package yr0;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyr0/n;", "", "", "name", "timezone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199034b;

    public n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f199033a = str;
        this.f199034b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f199033a.equals(nVar.f199033a) && this.f199034b.equals(nVar.f199034b);
    }

    public final int hashCode() {
        return this.f199034b.hashCode() + (this.f199033a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("JetLagLocation(name=", this.f199033a, ", timezone=", this.f199034b, ")");
    }
}
