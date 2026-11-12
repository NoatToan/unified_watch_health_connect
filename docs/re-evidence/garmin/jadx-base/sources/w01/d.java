package w01;

import j23.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw01/d;", "", "", "hydrationTotalValue", "Lq22/b;", "hydrationUnit", "Lj23/g;", "nutritionTotalValueRange", "Lw01/e;", "nutritionUnit", "La01/a;", "weatherType", "temp", "<init>", "(Ljava/lang/Double;Lq22/b;Lj23/g;Lw01/e;La01/a;Ljava/lang/Double;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f181038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q22.b f181039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g<Double> f181040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f181041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a01.a f181042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f181043f;

    public d(Double d14, q22.b bVar, g<Double> gVar, e eVar, a01.a aVar, Double d15) {
        bVar.getClass();
        eVar.getClass();
        this.f181038a = d14;
        this.f181039b = bVar;
        this.f181040c = gVar;
        this.f181041d = eVar;
        this.f181042e = aVar;
        this.f181043f = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f181038a, dVar.f181038a) && this.f181039b == dVar.f181039b && s.g(this.f181040c, dVar.f181040c) && this.f181041d == dVar.f181041d && this.f181042e == dVar.f181042e && s.g(this.f181043f, dVar.f181043f);
    }

    public final int hashCode() {
        Double d14 = this.f181038a;
        int iHashCode = (this.f181039b.hashCode() + ((d14 == null ? 0 : d14.hashCode()) * 31)) * 31;
        g<Double> gVar = this.f181040c;
        int iHashCode2 = (this.f181041d.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        a01.a aVar = this.f181042e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Double d15 = this.f181043f;
        return iHashCode3 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        return "NutritionAndHydrationRecommendation(hydrationTotalValue=" + this.f181038a + ", hydrationUnit=" + this.f181039b + ", nutritionTotalValueRange=" + this.f181040c + ", nutritionUnit=" + this.f181041d + ", weatherType=" + this.f181042e + ", temp=" + this.f181043f + ")";
    }
}
