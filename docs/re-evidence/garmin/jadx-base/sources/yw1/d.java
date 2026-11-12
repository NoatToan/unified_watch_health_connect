package yw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/d;", "Lyw1/b;", "", "totalDistance", "", "totalTime", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f199901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199902b;

    public d(Double d14, String str) {
        super(null);
        this.f199901a = d14;
        this.f199902b = str;
    }

    @Override // yw1.b
    public final boolean a() {
        return (this.f199901a == null && this.f199902b == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f199901a, dVar.f199901a) && p005kotlin.jvm.internal.s.g(this.f199902b, dVar.f199902b);
    }

    public final int hashCode() {
        Double d14 = this.f199901a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.f199902b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FBTActivityPerformanceStatsTotal(totalDistance=" + this.f199901a + ", totalTime=" + this.f199902b + ")";
    }
}
