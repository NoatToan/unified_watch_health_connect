package g21;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg21/a;", "", "", "calories", "", "weight", "bmi", "bodyFat", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f75369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f75370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f75372d;

    public a(Integer num, Double d14, Double d15, Double d16) {
        this.f75369a = num;
        this.f75370b = d14;
        this.f75371c = d15;
        this.f75372d = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f75369a, aVar.f75369a) && p005kotlin.jvm.internal.s.g(this.f75370b, aVar.f75370b) && p005kotlin.jvm.internal.s.g(this.f75371c, aVar.f75371c) && p005kotlin.jvm.internal.s.g(this.f75372d, aVar.f75372d);
    }

    public final int hashCode() {
        Integer num = this.f75369a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f75370b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f75371c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75372d;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        return sn.a.f(this.f75371c, this.f75372d, ", bodyFat=", ")", u0.m("AvgCaloriesWeightUIModel(calories=", this.f75369a, ", weight=", this.f75370b, ", bmi="));
    }
}
