package g21;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg21/q;", "", "", "mealName", "", "isTranslated", "", "displayOrder", "calories", "", "caloriesPercentage", "<init>", "(Ljava/lang/String;ZILjava/lang/Integer;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f75480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f75481e;

    public q(String str, boolean z14, int i14, Integer num, Double d14) {
        str.getClass();
        this.f75477a = str;
        this.f75478b = z14;
        this.f75479c = i14;
        this.f75480d = num;
        this.f75481e = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f75477a.equals(qVar.f75477a) && this.f75478b == qVar.f75478b && this.f75479c == qVar.f75479c && p005kotlin.jvm.internal.s.g(this.f75480d, qVar.f75480d) && p005kotlin.jvm.internal.s.g(this.f75481e, qVar.f75481e);
    }

    public final int hashCode() {
        int iD = q2.d(this.f75479c, q6.f.g(this.f75477a.hashCode() * 31, 31, this.f75478b), 31);
        Integer num = this.f75480d;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f75481e;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbD = zl.a.d("MealSplitUIModel(mealName=", this.f75477a, ", isTranslated=", this.f75478b, ", displayOrder=");
        sbD.append(this.f75479c);
        sbD.append(", calories=");
        sbD.append(this.f75480d);
        sbD.append(", caloriesPercentage=");
        return b71.i.g(sbD, this.f75481e, ")");
    }
}
