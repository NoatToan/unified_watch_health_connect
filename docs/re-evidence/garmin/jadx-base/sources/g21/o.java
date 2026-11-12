package g21;

import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lg21/o;", "", "", "mealId", "", "mealName", "", "isTranslated", "Lj23/g;", "Lb63/v;", "timeRange", "mealWindow", "Lg21/f0;", "nutritionContent", "Lg21/u;", "nutritionGoals", "Li53/c;", "Lb11/i;", "loggedItems", "", "displayOrder", "isUncategorized", "<init>", "(JLjava/lang/String;ZLj23/g;Lj23/g;Lg21/f0;Lg21/u;Li53/c;IZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j23.g<b63.v> f75466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j23.g<b63.v> f75467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f75468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f75469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<b11.i> f75470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f75471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f75472j;

    /* JADX WARN: Multi-variable type inference failed */
    public o(long j8, String str, boolean z14, j23.g<b63.v> gVar, j23.g<b63.v> gVar2, f0 f0Var, u uVar, i53.c<? extends b11.i> cVar, int i14, boolean z15) {
        str.getClass();
        f0Var.getClass();
        cVar.getClass();
        this.f75463a = j8;
        this.f75464b = str;
        this.f75465c = z14;
        this.f75466d = gVar;
        this.f75467e = gVar2;
        this.f75468f = f0Var;
        this.f75469g = uVar;
        this.f75470h = cVar;
        this.f75471i = i14;
        this.f75472j = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f75463a == oVar.f75463a && this.f75464b.equals(oVar.f75464b) && this.f75465c == oVar.f75465c && p005kotlin.jvm.internal.s.g(this.f75466d, oVar.f75466d) && p005kotlin.jvm.internal.s.g(this.f75467e, oVar.f75467e) && this.f75468f.equals(oVar.f75468f) && p005kotlin.jvm.internal.s.g(this.f75469g, oVar.f75469g) && this.f75470h.equals(oVar.f75470h) && this.f75471i == oVar.f75471i && this.f75472j == oVar.f75472j;
    }

    public final int hashCode() {
        int iG = q6.f.g(wr.g.j(Long.hashCode(this.f75463a) * 31, 31, this.f75464b), 31, this.f75465c);
        j23.g<b63.v> gVar = this.f75466d;
        int iHashCode = (iG + (gVar == null ? 0 : gVar.hashCode())) * 31;
        j23.g<b63.v> gVar2 = this.f75467e;
        int iHashCode2 = (this.f75468f.hashCode() + ((iHashCode + (gVar2 == null ? 0 : gVar2.hashCode())) * 31)) * 31;
        u uVar = this.f75469g;
        return Boolean.hashCode(this.f75472j) + q2.d(this.f75471i, l2.a(this.f75470h, (iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f75463a, "MealBlock(mealId=", ", mealName=", this.f75464b);
        sbK.append(", isTranslated=");
        sbK.append(this.f75465c);
        sbK.append(", timeRange=");
        sbK.append(this.f75466d);
        sbK.append(", mealWindow=");
        sbK.append(this.f75467e);
        sbK.append(", nutritionContent=");
        sbK.append(this.f75468f);
        sbK.append(", nutritionGoals=");
        sbK.append(this.f75469g);
        sbK.append(", loggedItems=");
        sbK.append(this.f75470h);
        sbK.append(", displayOrder=");
        sbK.append(this.f75471i);
        sbK.append(", isUncategorized=");
        sbK.append(this.f75472j);
        sbK.append(")");
        return sbK.toString();
    }
}
