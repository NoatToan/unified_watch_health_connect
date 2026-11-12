package rm1;

import c22.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrm1/m;", "", "", "epochTimestamp", "", "spO2Reading", "<init>", "(Ljava/lang/String;I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153627b;

    public m(String str, int i14) {
        this.f153626a = str;
        this.f153627b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.f153626a, mVar.f153626a) && this.f153627b == mVar.f153627b;
    }

    public final int hashCode() {
        String str = this.f153626a;
        return Integer.hashCode(this.f153627b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return t.e(this.f153627b, "SpO2Epoch(epochTimestamp=", this.f153626a, ", spO2Reading=", ")");
    }
}
