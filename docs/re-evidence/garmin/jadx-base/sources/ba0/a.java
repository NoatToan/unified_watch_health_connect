package ba0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lba0/a;", "", "", "caption", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16966b;

    public a(String str, String str2) {
        str.getClass();
        this.f16965a = str;
        this.f16966b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16965a.equals(aVar.f16965a) && s.g(this.f16966b, aVar.f16966b);
    }

    public final int hashCode() {
        int iHashCode = this.f16965a.hashCode() * 31;
        String str = this.f16966b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("MarkerData(caption=", this.f16965a, ", title=", this.f16966b, ")");
    }
}
