package ar;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lar/c;", "", "", "activityTypeKey", "Lps/z1;", "unitOfPoolLength", "", "distance", "numberOfActiveLengths", "<init>", "(Ljava/lang/String;Lps/z1;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f12518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f12519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f12520d;

    static {
        z1.Companion companion = z1.INSTANCE;
    }

    public /* synthetic */ c(String str, z1 z1Var, Double d14, Double d15, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : z1Var, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f12517a, cVar.f12517a) && s.g(this.f12518b, cVar.f12518b) && s.g(this.f12519c, cVar.f12519c) && s.g(this.f12520d, cVar.f12520d);
    }

    public final int hashCode() {
        int iHashCode = this.f12517a.hashCode() * 31;
        z1 z1Var = this.f12518b;
        int iHashCode2 = (iHashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        Double d14 = this.f12519c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f12520d;
        return iHashCode3 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DistanceMetricData(activityTypeKey=");
        sb3.append(this.f12517a);
        sb3.append(", unitOfPoolLength=");
        sb3.append(this.f12518b);
        sb3.append(", distance=");
        return sn.a.f(this.f12519c, this.f12520d, ", numberOfActiveLengths=", ")", sb3);
    }

    public c(String str, z1 z1Var, Double d14, Double d15) {
        str.getClass();
        this.f12517a = str;
        this.f12518b = z1Var;
        this.f12519c = d14;
        this.f12520d = d15;
    }
}
