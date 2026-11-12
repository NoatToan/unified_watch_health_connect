package k01;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import s21.n;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk01/g;", "", "Lk01/e;", "nutritionData", "Ll42/e;", "weightData", "", "Ls21/n;", "micronutrients", "<init>", "(Lk01/e;Ll42/e;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f102057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l42.e f102058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n> f102059c;

    public /* synthetic */ g(e eVar, l42.e eVar2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : eVar, (i14 & 2) != 0 ? null : eVar2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f102057a, gVar.f102057a) && s.g(this.f102058b, gVar.f102058b) && s.g(this.f102059c, gVar.f102059c);
    }

    public final int hashCode() {
        e eVar = this.f102057a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        l42.e eVar2 = this.f102058b;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        List<n> list = this.f102059c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionWeightWeeklyReports(nutritionData=");
        sb3.append(this.f102057a);
        sb3.append(", weightData=");
        sb3.append(this.f102058b);
        sb3.append(", micronutrients=");
        return z.c(sb3, this.f102059c, ")");
    }

    public g(e eVar, l42.e eVar2, List<n> list) {
        this.f102057a = eVar;
        this.f102058b = eVar2;
        this.f102059c = list;
    }
}
