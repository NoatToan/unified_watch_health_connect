package yw1;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyw1/q;", "Lyw1/p;", "", "avgWeeklySteps", "", "avgWeeklyDistance", "", "avgWeeklyTime", "avgWeeklyCalories", "", "avgIntensityMins", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f199962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f199963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f199965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f199966e;

    public q(Integer num, Double d14, String str, Double d15, Long l14) {
        super(null);
        this.f199962a = num;
        this.f199963b = d14;
        this.f199964c = str;
        this.f199965d = d15;
        this.f199966e = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f199962a, qVar.f199962a) && p005kotlin.jvm.internal.s.g(this.f199963b, qVar.f199963b) && p005kotlin.jvm.internal.s.g(this.f199964c, qVar.f199964c) && p005kotlin.jvm.internal.s.g(this.f199965d, qVar.f199965d) && p005kotlin.jvm.internal.s.g(this.f199966e, qVar.f199966e);
    }

    public final int hashCode() {
        Integer num = this.f199962a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f199963b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f199964c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d15 = this.f199965d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l14 = this.f199966e;
        return iHashCode4 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = u0.m("FrogPerformanceStatsAverages(avgWeeklySteps=", this.f199962a, ", avgWeeklyDistance=", this.f199963b, ", avgWeeklyTime=");
        b71.i.x(sbM, this.f199964c, ", avgWeeklyCalories=", this.f199965d, ", avgIntensityMins=");
        return p6.b.g(sbM, this.f199966e, ")");
    }
}
