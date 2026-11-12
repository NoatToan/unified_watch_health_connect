package g21;

import java.util.List;
import lc.u0;
import m92.h0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\b\u0012\u00060\u0005j\u0002`\u00070\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u00060\u0005j\u0002`\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lg21/y;", "", "Lkotlin/Function1;", "Lq4/f;", "Li53/g;", "", "Lcom/garmin/android/composecharts/lib/util/OffsetX;", "Lcom/garmin/android/composecharts/lib/util/ChartPointX;", "chart", "Li53/f;", "Lm92/h0$e$a;", "values", "", "Lj82/f;", "legendItems", "Ld82/a;", "hoverDataBricks", "<init>", "(Le23/l;Li53/f;Ljava/util/List;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<q4.f, i53.g<Float, Float>> f75535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.f<h0.e.a> f75536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j82.f> f75537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e23.q<Float, p3.m, Integer, d82.a>> f75538d;

    /* JADX WARN: Multi-variable type inference failed */
    public y(e23.l<? super q4.f, ? extends i53.g<Float, Float>> lVar, i53.f<h0.e.a> fVar, List<j82.f> list, List<? extends e23.q<? super Float, ? super p3.m, ? super Integer, d82.a>> list2) {
        fVar.getClass();
        list.getClass();
        list2.getClass();
        this.f75535a = lVar;
        this.f75536b = fVar;
        this.f75537c = list;
        this.f75538d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f75535a, yVar.f75535a) && p005kotlin.jvm.internal.s.g(this.f75536b, yVar.f75536b) && p005kotlin.jvm.internal.s.g(this.f75537c, yVar.f75537c) && p005kotlin.jvm.internal.s.g(this.f75538d, yVar.f75538d);
    }

    public final int hashCode() {
        e23.l<q4.f, i53.g<Float, Float>> lVar = this.f75535a;
        return this.f75538d.hashCode() + u0.b((this.f75536b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31, 31, this.f75537c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionReportsChartUIModel(chart=");
        sb3.append(this.f75535a);
        sb3.append(", values=");
        sb3.append(this.f75536b);
        sb3.append(", legendItems=");
        return n23.j.j(sb3, this.f75537c, ", hoverDataBricks=", this.f75538d, ")");
    }

    public y(e23.l lVar, i53.f fVar, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, fVar, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? j0.f134944a : list2);
    }
}
