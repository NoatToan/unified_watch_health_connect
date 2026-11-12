package w01;

import j23.g;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lw01/f;", "", "Lj23/g;", "", "totalValueRange", "intervalValueRange", "", "intervalInSeconds", "", "Lw01/e;", "units", "selUnit", "<init>", "(Lj23/g;Lj23/g;ILjava/util/List;Lw01/e;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<Double> f181049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<Double> f181050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f181051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f181052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f181053e;

    /* JADX WARN: Multi-variable type inference failed */
    public f(g<Double> gVar, g<Double> gVar2, int i14, List<? extends e> list, e eVar) {
        gVar.getClass();
        gVar2.getClass();
        list.getClass();
        eVar.getClass();
        this.f181049a = gVar;
        this.f181050b = gVar2;
        this.f181051c = i14;
        this.f181052d = list;
        this.f181053e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f181049a.equals(fVar.f181049a) && this.f181050b.equals(fVar.f181050b) && this.f181051c == fVar.f181051c && this.f181052d.equals(fVar.f181052d) && this.f181053e == fVar.f181053e;
    }

    public final int hashCode() {
        return this.f181053e.hashCode() + u0.b(q2.d(this.f181051c, (this.f181050b.hashCode() + (this.f181049a.hashCode() * 31)) * 31, 31), 31, this.f181052d);
    }

    public final String toString() {
        return "NutritionRecommendation(totalValueRange=" + this.f181049a + ", intervalValueRange=" + this.f181050b + ", intervalInSeconds=" + this.f181051c + ", units=" + this.f181052d + ", selUnit=" + this.f181053e + ")";
    }
}
