package r30;

import c22.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr30/c;", "", "", "distance", "elevation", "<init>", "(DD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f149983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f149984b;

    public c(double d14, double d15) {
        this.f149983a = d14;
        this.f149984b = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Double.compare(this.f149983a, cVar.f149983a) == 0 && Double.compare(this.f149984b, cVar.f149984b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f149984b) + (Double.hashCode(this.f149983a) * 31);
    }

    public final String toString() {
        return t.d(this.f149984b, ")", com.airbnb.lottie.parser.moshi.a.a("ElevationClimbMarkerData(distance=", this.f149983a, ", elevation="));
    }
}
