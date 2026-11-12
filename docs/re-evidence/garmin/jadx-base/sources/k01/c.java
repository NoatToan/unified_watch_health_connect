package k01;

import b63.o;
import java.util.List;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lk01/c;", "", "Lb63/o;", "startDate", "endDate", "", "Lk01/j;", "mealNutritionContents", "Lk01/h;", "dailyNutritionContents", "Lk01/k;", "averageNutritionContents", "<init>", "(Lb63/o;Lb63/o;Ljava/util/List;Ljava/util/List;Lk01/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Lb63/o;Ljava/util/List;Ljava/util/List;Lk01/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f102015f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f102016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f102017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f102018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h> f102019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f102020e;

    static {
        n nVar = n.PUBLICATION;
        f102015f = new o13.l[]{null, null, m.a(nVar, new k01.a(1)), m.a(nVar, new k01.a(2)), null};
    }

    public /* synthetic */ c(int i14, o oVar, o oVar2, List list, List list2, k kVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f102016a = null;
        } else {
            this.f102016a = oVar;
        }
        if ((i14 & 2) == 0) {
            this.f102017b = null;
        } else {
            this.f102017b = oVar2;
        }
        if ((i14 & 4) == 0) {
            this.f102018c = null;
        } else {
            this.f102018c = list;
        }
        if ((i14 & 8) == 0) {
            this.f102019d = null;
        } else {
            this.f102019d = list2;
        }
        if ((i14 & 16) == 0) {
            this.f102020e = null;
        } else {
            this.f102020e = kVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f102016a, cVar.f102016a) && s.g(this.f102017b, cVar.f102017b) && s.g(this.f102018c, cVar.f102018c) && s.g(this.f102019d, cVar.f102019d) && s.g(this.f102020e, cVar.f102020e);
    }

    public final int hashCode() {
        o oVar = this.f102016a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        o oVar2 = this.f102017b;
        int iHashCode2 = (iHashCode + (oVar2 == null ? 0 : oVar2.f16206a.hashCode())) * 31;
        List<j> list = this.f102018c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<h> list2 = this.f102019d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k kVar = this.f102020e;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionDailyReportsDTO(startDate=");
        sb3.append(this.f102016a);
        sb3.append(", endDate=");
        sb3.append(this.f102017b);
        sb3.append(", mealNutritionContents=");
        n23.j.z(sb3, this.f102018c, ", dailyNutritionContents=", this.f102019d, ", averageNutritionContents=");
        sb3.append(this.f102020e);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: k01.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/c$b;", "", "<init>", "()V", "Li63/c;", "Lk01/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f102021a;
        }

        private Companion() {
        }
    }

    public c() {
        this((o) null, (o) null, (List) null, (List) null, (k) null, 31, (p005kotlin.jvm.internal.j) null);
    }

    public c(o oVar, o oVar2, List<j> list, List<h> list2, k kVar) {
        this.f102016a = oVar;
        this.f102017b = oVar2;
        this.f102018c = list;
        this.f102019d = list2;
        this.f102020e = kVar;
    }

    public /* synthetic */ c(o oVar, o oVar2, List list, List list2, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, (i14 & 2) != 0 ? null : oVar2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : kVar);
    }
}
