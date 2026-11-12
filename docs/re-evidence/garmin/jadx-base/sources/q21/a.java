package q21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lq21/a;", "", "", "dailyCaloriesGoal", "", "Lo21/d;", "dailyMealGoals", "", "isLoading", "navigateBackWithData", "showError", "isResetEnabled", "<init>", "(Ljava/lang/Integer;Ljava/util/List;ZZZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f142202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o21.d> f142203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f142204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f142205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f142206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f142207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f142208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f142209h;

    public a(Integer num, List<o21.d> list, boolean z14, boolean z15, boolean z16, boolean z17) {
        list.getClass();
        this.f142202a = num;
        this.f142203b = list;
        this.f142204c = z14;
        this.f142205d = z15;
        this.f142206e = z16;
        this.f142207f = z17;
        Iterator<T> it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 += ((o21.d) it.next()).f128660c;
        }
        this.f142208g = i14;
        this.f142209h = i14 == 100;
    }

    public static a a(a aVar, ArrayList arrayList, boolean z14, boolean z15, boolean z16, boolean z17, int i14) {
        List<o21.d> list = arrayList;
        Integer num = aVar.f142202a;
        if ((i14 & 2) != 0) {
            list = aVar.f142203b;
        }
        if ((i14 & 4) != 0) {
            z14 = aVar.f142204c;
        }
        if ((i14 & 8) != 0) {
            z15 = aVar.f142205d;
        }
        if ((i14 & 16) != 0) {
            z16 = aVar.f142206e;
        }
        if ((i14 & 32) != 0) {
            z17 = aVar.f142207f;
        }
        boolean z18 = z17;
        aVar.getClass();
        list.getClass();
        boolean z19 = z16;
        boolean z24 = z15;
        return new a(num, list, z14, z24, z19, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f142202a, aVar.f142202a) && p005kotlin.jvm.internal.s.g(this.f142203b, aVar.f142203b) && this.f142204c == aVar.f142204c && this.f142205d == aVar.f142205d && this.f142206e == aVar.f142206e && this.f142207f == aVar.f142207f;
    }

    public final int hashCode() {
        Integer num = this.f142202a;
        return Boolean.hashCode(this.f142207f) + q6.f.g(q6.f.g(q6.f.g(u0.b((num == null ? 0 : num.hashCode()) * 31, 31, this.f142203b), 31, this.f142204c), 31, this.f142205d), 31, this.f142206e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditMealGoalsUiState(dailyCaloriesGoal=");
        sb3.append(this.f142202a);
        sb3.append(", dailyMealGoals=");
        sb3.append(this.f142203b);
        sb3.append(", isLoading=");
        kg.f.q(", navigateBackWithData=", ", showError=", sb3, this.f142204c, this.f142205d);
        return com.airbnb.lottie.animation.keyframe.a.f(", isResetEnabled=", ")", sb3, this.f142206e, this.f142207f);
    }

    public a() {
        this(null, null, false, false, false, false, 63, null);
    }

    public a(Integer num, List list, boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17);
    }
}
