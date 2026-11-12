package ep0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lep0/b0;", "", "", "statTypeKey", "subTypeKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64869b;

    public b0(String str, String str2) {
        str.getClass();
        this.f64868a = str;
        this.f64869b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f64868a.equals(b0Var.f64868a) && p005kotlin.jvm.internal.s.g(this.f64869b, b0Var.f64869b);
    }

    public final int hashCode() {
        int iHashCode = this.f64868a.hashCode() * 31;
        String str = this.f64869b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return v.e0.g("StatType(statTypeKey=", this.f64868a, ", subTypeKey=", this.f64869b, ")");
    }
}
