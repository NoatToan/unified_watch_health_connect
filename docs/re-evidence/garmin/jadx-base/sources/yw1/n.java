package yw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyw1/n;", "Lyw1/m;", "", "avgWeeklyCalories", "", "avgWeeklyTime", "", "avgIntensityMins", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f199956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f199958c;

    public n(Double d14, String str, Long l14) {
        super(null);
        this.f199956a = d14;
        this.f199957b = str;
        this.f199958c = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f199956a, nVar.f199956a) && p005kotlin.jvm.internal.s.g(this.f199957b, nVar.f199957b) && p005kotlin.jvm.internal.s.g(this.f199958c, nVar.f199958c);
    }

    public final int hashCode() {
        Double d14 = this.f199956a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.f199957b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f199958c;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FitnessPerformanceStatsAverages(avgWeeklyCalories=");
        sb3.append(this.f199956a);
        sb3.append(", avgWeeklyTime=");
        sb3.append(this.f199957b);
        sb3.append(", avgIntensityMins=");
        return p6.b.g(sb3, this.f199958c, ")");
    }
}
