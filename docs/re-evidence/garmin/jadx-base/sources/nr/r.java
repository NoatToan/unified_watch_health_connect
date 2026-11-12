package nr;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/r;", "", "Lps/d0;", "dataField", "", "value", "<init>", "(Lps/d0;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps.d0 f127311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127312b;

    static {
        Parcelable.Creator<ps.d0> creator = ps.d0.CREATOR;
    }

    public r(ps.d0 d0Var, String str) {
        d0Var.getClass();
        this.f127311a = d0Var;
        this.f127312b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f127311a.equals(rVar.f127311a) && p005kotlin.jvm.internal.s.g(this.f127312b, rVar.f127312b);
    }

    public final int hashCode() {
        int iHashCode = this.f127311a.hashCode() * 31;
        String str = this.f127312b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ConnectIqStatInfo(dataField=" + this.f127311a + ", value=" + this.f127312b + ")";
    }
}
