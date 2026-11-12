package q21;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq21/l;", "", "", "dailyCaloriesGoal", "", "Lo21/d;", "dailyMealGoals", "", "isLoading", "showErrorNavigateBack", "<init>", "(Ljava/lang/Integer;Ljava/util/List;ZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f142255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o21.d> f142256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f142257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f142258d;

    public l(Integer num, List list, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15);
    }

    public static l a(l lVar, List list, boolean z14, int i14) {
        Integer num = lVar.f142255a;
        if ((i14 & 2) != 0) {
            list = lVar.f142256b;
        }
        if ((i14 & 4) != 0) {
            z14 = lVar.f142257c;
        }
        boolean z15 = (i14 & 8) != 0 ? lVar.f142258d : true;
        lVar.getClass();
        list.getClass();
        return new l(num, list, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f142255a, lVar.f142255a) && p005kotlin.jvm.internal.s.g(this.f142256b, lVar.f142256b) && this.f142257c == lVar.f142257c && this.f142258d == lVar.f142258d;
    }

    public final int hashCode() {
        Integer num = this.f142255a;
        return Boolean.hashCode(this.f142258d) + q6.f.g(u0.b((num == null ? 0 : num.hashCode()) * 31, 31, this.f142256b), 31, this.f142257c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LegacyNutritionMealGoalsUiState(dailyCaloriesGoal=");
        sb3.append(this.f142255a);
        sb3.append(", dailyMealGoals=");
        sb3.append(this.f142256b);
        sb3.append(", isLoading=");
        return com.airbnb.lottie.animation.keyframe.a.f(", showErrorNavigateBack=", ")", sb3, this.f142257c, this.f142258d);
    }

    public l(Integer num, List<o21.d> list, boolean z14, boolean z15) {
        list.getClass();
        this.f142255a = num;
        this.f142256b = list;
        this.f142257c = z14;
        this.f142258d = z15;
    }

    public l() {
        this(null, null, false, false, 15, null);
    }
}
