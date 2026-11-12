package g21;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lg21/h;", "", "Lb63/o;", "date", "Lb63/v;", "timelineStart", "timelineEnd", "Ls21/c;", "dailyViewType", "Lg21/u;", "dailyNutritionGoals", "Lb11/f;", "dailyNutritionContent", "Li53/c;", "Lg21/p;", "mealDetails", "Lb11/e;", "foods", "Ls21/o;", "micronutrientsSettings", "<init>", "(Lb63/o;Lb63/v;Lb63/v;Ls21/c;Lg21/u;Lb11/f;Li53/c;Li53/c;Ls21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f75424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.v f75425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.v f75426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s21.c f75427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f75428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b11.f f75429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<p> f75430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<b11.e> f75431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s21.o f75432i;

    public h(b63.o oVar, b63.v vVar, b63.v vVar2, s21.c cVar, u uVar, b11.f fVar, i53.c<p> cVar2, i53.c<b11.e> cVar3, s21.o oVar2) {
        oVar.getClass();
        vVar.getClass();
        vVar2.getClass();
        cVar.getClass();
        fVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f75424a = oVar;
        this.f75425b = vVar;
        this.f75426c = vVar2;
        this.f75427d = cVar;
        this.f75428e = uVar;
        this.f75429f = fVar;
        this.f75430g = cVar2;
        this.f75431h = cVar3;
        this.f75432i = oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f75424a.equals(hVar.f75424a) && this.f75425b.equals(hVar.f75425b) && this.f75426c.equals(hVar.f75426c) && this.f75427d == hVar.f75427d && p005kotlin.jvm.internal.s.g(this.f75428e, hVar.f75428e) && this.f75429f.equals(hVar.f75429f) && this.f75430g.equals(hVar.f75430g) && this.f75431h.equals(hVar.f75431h) && p005kotlin.jvm.internal.s.g(this.f75432i, hVar.f75432i);
    }

    public final int hashCode() {
        int iHashCode = (this.f75427d.hashCode() + l2.c(this.f75426c.f16219a, l2.c(this.f75425b.f16219a, this.f75424a.f16206a.hashCode() * 31, 31), 31)) * 31;
        u uVar = this.f75428e;
        int iA = l2.a(this.f75431h, l2.a(this.f75430g, (this.f75429f.hashCode() + ((iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31, 31), 31);
        s21.o oVar = this.f75432i;
        return iA + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DailyNutritionSummaryUIModel(date=");
        sb3.append(this.f75424a);
        sb3.append(", timelineStart=");
        sb3.append(this.f75425b);
        sb3.append(", timelineEnd=");
        sb3.append(this.f75426c);
        sb3.append(", dailyViewType=");
        sb3.append(this.f75427d);
        sb3.append(", dailyNutritionGoals=");
        sb3.append(this.f75428e);
        sb3.append(", dailyNutritionContent=");
        sb3.append(this.f75429f);
        sb3.append(", mealDetails=");
        q6.f.w(sb3, this.f75430g, ", foods=", this.f75431h, ", micronutrientsSettings=");
        sb3.append(this.f75432i);
        sb3.append(")");
        return sb3.toString();
    }
}
