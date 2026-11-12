package q01;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq01/a;", "", "", "activeCaloriesAverage", "", "valuesCount", "<init>", "(Ljava/lang/Double;I)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f141980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f141981b;

    public a(Double d14, int i14) {
        this.f141980a = d14;
        this.f141981b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f141980a, aVar.f141980a) && this.f141981b == aVar.f141981b;
    }

    public final int hashCode() {
        Double d14 = this.f141980a;
        return Integer.hashCode(this.f141981b) + ((d14 == null ? 0 : d14.hashCode()) * 31);
    }

    public final String toString() {
        return "ActiveCaloriesData(activeCaloriesAverage=" + this.f141980a + ", valuesCount=" + this.f141981b + ")";
    }
}
