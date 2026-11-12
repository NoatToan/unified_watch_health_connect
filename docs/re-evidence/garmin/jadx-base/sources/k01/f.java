package k01;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import s21.n;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk01/f;", "", "Lk01/c;", "nutritionData", "Ll42/k;", "weightData", "", "Ls21/n;", "micronutrients", "<init>", "(Lk01/c;Ll42/k;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f102054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l42.k f102055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n> f102056c;

    public /* synthetic */ f(c cVar, l42.k kVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : kVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f102054a, fVar.f102054a) && s.g(this.f102055b, fVar.f102055b) && s.g(this.f102056c, fVar.f102056c);
    }

    public final int hashCode() {
        c cVar = this.f102054a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        l42.k kVar = this.f102055b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<n> list = this.f102056c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionWeightDailyReports(nutritionData=");
        sb3.append(this.f102054a);
        sb3.append(", weightData=");
        sb3.append(this.f102055b);
        sb3.append(", micronutrients=");
        return z.c(sb3, this.f102056c, ")");
    }

    public f(c cVar, l42.k kVar, List<n> list) {
        this.f102054a = cVar;
        this.f102055b = kVar;
        this.f102056c = list;
    }
}
