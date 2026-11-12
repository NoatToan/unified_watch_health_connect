package g21;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg21/j;", "", "", "isMFPLinked", "", "activeCalories", "consumedCalories", "caloriesGoal", "remainingCalories", "adjustedGoal", "<init>", "(ZIIIII)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f75436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75441f;

    public j(boolean z14, int i14, int i15, int i16, int i17, int i18) {
        this.f75436a = z14;
        this.f75437b = i14;
        this.f75438c = i15;
        this.f75439d = i16;
        this.f75440e = i17;
        this.f75441f = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f75436a == jVar.f75436a && this.f75437b == jVar.f75437b && this.f75438c == jVar.f75438c && this.f75439d == jVar.f75439d && this.f75440e == jVar.f75440e && this.f75441f == jVar.f75441f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75441f) + q2.d(this.f75440e, q2.d(this.f75439d, q2.d(this.f75438c, q2.d(this.f75437b, Boolean.hashCode(this.f75436a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MFPCaloriesHelpNavData(isMFPLinked=");
        sb3.append(this.f75436a);
        sb3.append(", activeCalories=");
        sb3.append(this.f75437b);
        sb3.append(", consumedCalories=");
        ds.e0.m(this.f75438c, this.f75439d, ", caloriesGoal=", ", remainingCalories=", sb3);
        return androidx.core.view.j.e(this.f75440e, this.f75441f, ", adjustedGoal=", ")", sb3);
    }
}
