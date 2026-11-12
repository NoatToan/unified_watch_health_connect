package g21;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg21/i;", "", "Lg21/h;", "nutritionSummary", "Lg21/g;", "dailyList", "", "Lb11/o;", "micronutrientEntries", "<init>", "(Lg21/h;Lg21/g;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f75433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f75434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b11.o> f75435c;

    public i(h hVar, g gVar, List<b11.o> list) {
        hVar.getClass();
        gVar.getClass();
        this.f75433a = hVar;
        this.f75434b = gVar;
        this.f75435c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f75433a, iVar.f75433a) && p005kotlin.jvm.internal.s.g(this.f75434b, iVar.f75434b) && p005kotlin.jvm.internal.s.g(this.f75435c, iVar.f75435c);
    }

    public final int hashCode() {
        int iHashCode = (this.f75434b.hashCode() + (this.f75433a.hashCode() * 31)) * 31;
        List<b11.o> list = this.f75435c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DailySummaryData(nutritionSummary=");
        sb3.append(this.f75433a);
        sb3.append(", dailyList=");
        sb3.append(this.f75434b);
        sb3.append(", micronutrientEntries=");
        return u62.z.c(sb3, this.f75435c, ")");
    }

    public /* synthetic */ i(h hVar, g gVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, gVar, (i14 & 4) != 0 ? null : list);
    }
}
