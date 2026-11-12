package iy0;

import c22.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liy0/j;", "", "", "min", "max", "<init>", "(DD)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f95806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f95807b;

    public /* synthetic */ j(double d14, double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0.0d : d14, (i14 & 2) != 0 ? 0.0d : d15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Double.compare(this.f95806a, jVar.f95806a) == 0 && Double.compare(this.f95807b, jVar.f95807b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f95807b) + (Double.hashCode(this.f95806a) * 31);
    }

    public final String toString() {
        return t.d(this.f95807b, ")", com.airbnb.lottie.parser.moshi.a.a("AxisRange(min=", this.f95806a, ", max="));
    }

    public j(double d14, double d15) {
        this.f95806a = d14;
        this.f95807b = d15;
    }

    public j() {
        this(0.0d, 0.0d, 3, null);
    }
}
