package yw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/c;", "Lyw1/b;", "", "avgWeeklyDistance", "", "avgWeeklyTime", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f199899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199900b;

    public c(Double d14, String str) {
        super(null);
        this.f199899a = d14;
        this.f199900b = str;
    }

    @Override // yw1.b
    public final boolean a() {
        return (this.f199899a == null && this.f199900b == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f199899a, cVar.f199899a) && p005kotlin.jvm.internal.s.g(this.f199900b, cVar.f199900b);
    }

    public final int hashCode() {
        Double d14 = this.f199899a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.f199900b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FBTActivityPerformanceStatsAverage(avgWeeklyDistance=" + this.f199899a + ", avgWeeklyTime=" + this.f199900b + ")";
    }
}
