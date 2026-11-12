package ss;

import c22.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lss/g;", "", "", "minValue", "maxValue", "<init>", "(DD)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f160602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f160603b;

    public /* synthetic */ g(double d14, double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0.0d : d14, (i14 & 2) != 0 ? 0.0d : d15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Double.compare(this.f160602a, gVar.f160602a) == 0 && Double.compare(this.f160603b, gVar.f160603b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f160603b) + (Double.hashCode(this.f160602a) * 31);
    }

    public final String toString() {
        return t.d(this.f160603b, ")", com.airbnb.lottie.parser.moshi.a.a("IntervalLimits(minValue=", this.f160602a, ", maxValue="));
    }

    public g(double d14, double d15) {
        this.f160602a = d14;
        this.f160603b = d15;
    }

    public g() {
        this(0.0d, 0.0d, 3, null);
    }
}
