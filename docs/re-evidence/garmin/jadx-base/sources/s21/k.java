package s21;

import c22.c3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ls21/k;", "", "", "mealIndex", "", "mealName", "", "isTranslated", "showErrorIcon", "Ls21/l;", "timeWindow", "isClickable", "Lc22/c3;", "bottomLineResId", "errorInfoResId", "<init>", "(ILjava/lang/String;ZZLs21/l;ZLc22/c3;Ljava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f156140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f156141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f156142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c3 f156143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f156144h;

    public /* synthetic */ k(int i14, String str, boolean z14, boolean z15, l lVar, boolean z16, c3 c3Var, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, str, z14, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? null : lVar, (i15 & 32) != 0 ? true : z16, (i15 & 64) != 0 ? null : c3Var, (i15 & 128) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f156137a == kVar.f156137a && p005kotlin.jvm.internal.s.g(this.f156138b, kVar.f156138b) && this.f156139c == kVar.f156139c && this.f156140d == kVar.f156140d && p005kotlin.jvm.internal.s.g(this.f156141e, kVar.f156141e) && this.f156142f == kVar.f156142f && p005kotlin.jvm.internal.s.g(this.f156143g, kVar.f156143g) && p005kotlin.jvm.internal.s.g(this.f156144h, kVar.f156144h);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(wr.g.j(Integer.hashCode(this.f156137a) * 31, 31, this.f156138b), 31, this.f156139c), 31, this.f156140d);
        l lVar = this.f156141e;
        int iG2 = q6.f.g((iG + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f156142f);
        c3 c3Var = this.f156143g;
        int iHashCode = (iG2 + (c3Var == null ? 0 : c3Var.hashCode())) * 31;
        Integer num = this.f156144h;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f156137a, "MealSettingsItemUIModel(mealIndex=", ", mealName=", this.f156138b, ", isTranslated=");
        kg.f.q(", showErrorIcon=", ", timeWindow=", sbR, this.f156139c, this.f156140d);
        sbR.append(this.f156141e);
        sbR.append(", isClickable=");
        sbR.append(this.f156142f);
        sbR.append(", bottomLineResId=");
        sbR.append(this.f156143g);
        sbR.append(", errorInfoResId=");
        sbR.append(this.f156144h);
        sbR.append(")");
        return sbR.toString();
    }

    public k(int i14, String str, boolean z14, boolean z15, l lVar, boolean z16, c3 c3Var, Integer num) {
        str.getClass();
        this.f156137a = i14;
        this.f156138b = str;
        this.f156139c = z14;
        this.f156140d = z15;
        this.f156141e = lVar;
        this.f156142f = z16;
        this.f156143g = c3Var;
        this.f156144h = num;
    }
}
