package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg21/b;", "", "", "fat", "protein", "carbs", "", "otherCalories", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f75379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f75380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f75382d;

    public b(Double d14, Double d15, Double d16, Integer num) {
        this.f75379a = d14;
        this.f75380b = d15;
        this.f75381c = d16;
        this.f75382d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f75379a, bVar.f75379a) && p005kotlin.jvm.internal.s.g(this.f75380b, bVar.f75380b) && p005kotlin.jvm.internal.s.g(this.f75381c, bVar.f75381c) && p005kotlin.jvm.internal.s.g(this.f75382d, bVar.f75382d);
    }

    public final int hashCode() {
        Double d14 = this.f75379a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f75380b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75381c;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num = this.f75382d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("AvgMacrosNutritionUIModel(fat=", this.f75379a, this.f75380b, ", protein=", ", carbs=");
        sbI.append(this.f75381c);
        sbI.append(", otherCalories=");
        sbI.append(this.f75382d);
        sbI.append(")");
        return sbI.toString();
    }
}
