package u21;

import com.garmin.android.apps.connectmobile.f3;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu21/o;", "", "", "dailyCaloriesGoal", "", "Ls21/j;", "dailyMealGoals", "", "isLoading", "navigateBackWithSavedData", "showErrorAndNavigateBack", "isResetEnabled", "snackbarMessageRes", "<init>", "(Ljava/lang/Integer;Ljava/util/List;ZZZZLjava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f168047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<s21.j> f168048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f168050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f168051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f168052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f168053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f168054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f168055i;

    public o(Integer num, List<s21.j> list, boolean z14, boolean z15, boolean z16, boolean z17, Integer num2) {
        list.getClass();
        this.f168047a = num;
        this.f168048b = list;
        this.f168049c = z14;
        this.f168050d = z15;
        this.f168051e = z16;
        this.f168052f = z17;
        this.f168053g = num2;
        Iterator<T> it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 += ((s21.j) it.next()).f156132d;
        }
        this.f168054h = i14;
        this.f168055i = i14 == 100;
    }

    public static o a(o oVar, List list, boolean z14, boolean z15, boolean z16, boolean z17, Integer num, int i14) {
        List list2 = list;
        Integer num2 = oVar.f168047a;
        if ((i14 & 2) != 0) {
            list2 = oVar.f168048b;
        }
        if ((i14 & 4) != 0) {
            z14 = oVar.f168049c;
        }
        if ((i14 & 8) != 0) {
            z15 = oVar.f168050d;
        }
        if ((i14 & 16) != 0) {
            z16 = oVar.f168051e;
        }
        if ((i14 & 32) != 0) {
            z17 = oVar.f168052f;
        }
        if ((i14 & 64) != 0) {
            num = oVar.f168053g;
        }
        Integer num3 = num;
        oVar.getClass();
        list2.getClass();
        boolean z18 = z17;
        boolean z19 = z16;
        boolean z24 = z15;
        return new o(num2, list2, z14, z24, z19, z18, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f168047a, oVar.f168047a) && p005kotlin.jvm.internal.s.g(this.f168048b, oVar.f168048b) && this.f168049c == oVar.f168049c && this.f168050d == oVar.f168050d && this.f168051e == oVar.f168051e && this.f168052f == oVar.f168052f && p005kotlin.jvm.internal.s.g(this.f168053g, oVar.f168053g);
    }

    public final int hashCode() {
        Integer num = this.f168047a;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(lc.u0.b((num == null ? 0 : num.hashCode()) * 31, 31, this.f168048b), 31, this.f168049c), 31, this.f168050d), 31, this.f168051e), 31, this.f168052f);
        Integer num2 = this.f168053g;
        return iG + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MealCalorieGoalsUiState(dailyCaloriesGoal=");
        sb3.append(this.f168047a);
        sb3.append(", dailyMealGoals=");
        sb3.append(this.f168048b);
        sb3.append(", isLoading=");
        kg.f.q(", navigateBackWithSavedData=", ", showErrorAndNavigateBack=", sb3, this.f168049c, this.f168050d);
        kg.f.q(", isResetEnabled=", ", snackbarMessageRes=", sb3, this.f168051e, this.f168052f);
        return f3.i(sb3, this.f168053g, ")");
    }

    public o() {
        this(null, null, false, false, false, false, null, 127, null);
    }

    public o(Integer num, List list, boolean z14, boolean z15, boolean z16, boolean z17, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? null : num2);
    }
}
