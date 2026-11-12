package g21;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import lc.u0;
import m92.h0;
import m92.l0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg21/d0;", "", "", "Lm92/l0;", "barConfigs", "Lm92/h0$e$a;", "points", "goalPoints", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<l0> f75407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h0.e.a> f75408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<h0.e.a> f75409c;

    public d0(List<l0> list, List<h0.e.a> list2, List<h0.e.a> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f75407a = list;
        this.f75408b = list2;
        this.f75409c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.f75407a, d0Var.f75407a) && p005kotlin.jvm.internal.s.g(this.f75408b, d0Var.f75408b) && p005kotlin.jvm.internal.s.g(this.f75409c, d0Var.f75409c);
    }

    public final int hashCode() {
        return this.f75409c.hashCode() + u0.b(this.f75407a.hashCode() * 31, 31, this.f75408b);
    }

    public final String toString() {
        return u62.z.c(f3.k("NutritionReportsNutrientChartConfig(barConfigs=", ", points=", ", goalPoints=", this.f75407a, this.f75408b), this.f75409c, ")");
    }

    public d0(List list, List list2, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, (i14 & 4) != 0 ? j0.f134944a : list3);
    }
}
