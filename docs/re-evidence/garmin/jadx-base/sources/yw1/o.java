package yw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyw1/o;", "Lyw1/m;", "", "totalCalories", "", "totalTime", "", "totalIntensityMins", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f199959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f199961c;

    public o(Double d14, String str, Long l14) {
        super(null);
        this.f199959a = d14;
        this.f199960b = str;
        this.f199961c = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f199959a, oVar.f199959a) && p005kotlin.jvm.internal.s.g(this.f199960b, oVar.f199960b) && p005kotlin.jvm.internal.s.g(this.f199961c, oVar.f199961c);
    }

    public final int hashCode() {
        Double d14 = this.f199959a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.f199960b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f199961c;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FitnessPerformanceStatsTotals(totalCalories=");
        sb3.append(this.f199959a);
        sb3.append(", totalTime=");
        sb3.append(this.f199960b);
        sb3.append(", totalIntensityMins=");
        return p6.b.g(sb3, this.f199961c, ")");
    }
}
