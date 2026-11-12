package al1;

import c22.t;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lal1/a;", "", "", "measuredDistance", "", "unit", "strides", "strideLength", "<init>", "(DIID)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f3752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f3755d;

    public a(double d14, int i14, int i15, double d15) {
        this.f3752a = d14;
        this.f3753b = i14;
        this.f3754c = i15;
        this.f3755d = d15;
    }

    public final boolean a() {
        return this.f3752a > 0.0d || this.f3754c > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f3752a, aVar.f3752a) == 0 && this.f3753b == aVar.f3753b && this.f3754c == aVar.f3754c && Double.compare(this.f3755d, aVar.f3755d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f3755d) + q2.d(this.f3754c, q2.d(this.f3753b, Double.hashCode(this.f3752a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StrideLengthData(measuredDistance=");
        sb3.append(this.f3752a);
        sb3.append(", unit=");
        sb3.append(this.f3753b);
        sb3.append(", strides=");
        sb3.append(this.f3754c);
        sb3.append(", strideLength=");
        return t.d(this.f3755d, ")", sb3);
    }
}
