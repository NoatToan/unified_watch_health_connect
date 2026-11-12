package k01;

import b63.o;
import java.util.List;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lk01/e;", "", "Lb63/o;", "startDate", "endDate", "", "Lk01/j;", "averageMealNutritionContents", "Lk01/l;", "weeklyNutritionContents", "Lk01/k;", "averageNutritionContents", "<init>", "(Lb63/o;Lb63/o;Ljava/util/List;Ljava/util/List;Lk01/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Lb63/o;Ljava/util/List;Ljava/util/List;Lk01/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f102047f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f102048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f102049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f102050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<l> f102051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f102052e;

    static {
        n nVar = n.PUBLICATION;
        f102047f = new o13.l[]{null, null, m.a(nVar, new k01.a(3)), m.a(nVar, new k01.a(4)), null};
    }

    public /* synthetic */ e(int i14, o oVar, o oVar2, List list, List list2, k kVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f102048a = null;
        } else {
            this.f102048a = oVar;
        }
        if ((i14 & 2) == 0) {
            this.f102049b = null;
        } else {
            this.f102049b = oVar2;
        }
        if ((i14 & 4) == 0) {
            this.f102050c = null;
        } else {
            this.f102050c = list;
        }
        if ((i14 & 8) == 0) {
            this.f102051d = null;
        } else {
            this.f102051d = list2;
        }
        if ((i14 & 16) == 0) {
            this.f102052e = null;
        } else {
            this.f102052e = kVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f102048a, eVar.f102048a) && s.g(this.f102049b, eVar.f102049b) && s.g(this.f102050c, eVar.f102050c) && s.g(this.f102051d, eVar.f102051d) && s.g(this.f102052e, eVar.f102052e);
    }

    public final int hashCode() {
        o oVar = this.f102048a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        o oVar2 = this.f102049b;
        int iHashCode2 = (iHashCode + (oVar2 == null ? 0 : oVar2.f16206a.hashCode())) * 31;
        List<j> list = this.f102050c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<l> list2 = this.f102051d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k kVar = this.f102052e;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionWeeklyReportsDTO(startDate=");
        sb3.append(this.f102048a);
        sb3.append(", endDate=");
        sb3.append(this.f102049b);
        sb3.append(", averageMealNutritionContents=");
        n23.j.z(sb3, this.f102050c, ", weeklyNutritionContents=", this.f102051d, ", averageNutritionContents=");
        sb3.append(this.f102052e);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: k01.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/e$b;", "", "<init>", "()V", "Li63/c;", "Lk01/e;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f102053a;
        }

        private Companion() {
        }
    }

    public e() {
        this((o) null, (o) null, (List) null, (List) null, (k) null, 31, (p005kotlin.jvm.internal.j) null);
    }

    public e(o oVar, o oVar2, List<j> list, List<l> list2, k kVar) {
        this.f102048a = oVar;
        this.f102049b = oVar2;
        this.f102050c = list;
        this.f102051d = list2;
        this.f102052e = kVar;
    }

    public /* synthetic */ e(o oVar, o oVar2, List list, List list2, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, (i14 & 2) != 0 ? null : oVar2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : kVar);
    }
}
