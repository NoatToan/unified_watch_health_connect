package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg21/c;", "", "", "fiber", "addedSugars", "saturatedFat", "iron", "vitaminA", "vitaminD", "calcium", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f75391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f75392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f75394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f75395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f75396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f75397g;

    public c(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24) {
        this.f75391a = d14;
        this.f75392b = d15;
        this.f75393c = d16;
        this.f75394d = d17;
        this.f75395e = d18;
        this.f75396f = d19;
        this.f75397g = d24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f75391a, cVar.f75391a) && p005kotlin.jvm.internal.s.g(this.f75392b, cVar.f75392b) && p005kotlin.jvm.internal.s.g(this.f75393c, cVar.f75393c) && p005kotlin.jvm.internal.s.g(this.f75394d, cVar.f75394d) && p005kotlin.jvm.internal.s.g(this.f75395e, cVar.f75395e) && p005kotlin.jvm.internal.s.g(this.f75396f, cVar.f75396f) && p005kotlin.jvm.internal.s.g(this.f75397g, cVar.f75397g);
    }

    public final int hashCode() {
        Double d14 = this.f75391a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f75392b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75393c;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f75394d;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f75395e;
        int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f75396f;
        int iHashCode6 = (iHashCode5 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f75397g;
        return iHashCode6 + (d24 != null ? d24.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("AvgMicrosNutritionUIModel(fiber=", this.f75391a, this.f75392b, ", addedSugars=", ", saturatedFat=");
        b71.i.p(this.f75393c, this.f75394d, ", iron=", ", vitaminA=", sbI);
        b71.i.p(this.f75395e, this.f75396f, ", vitaminD=", ", calcium=", sbI);
        return b71.i.g(sbI, this.f75397g, ")");
    }
}
