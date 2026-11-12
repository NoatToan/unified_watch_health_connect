package kw0;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import pv0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkw0/f;", "LifestyleMetric", "", "", "behaviourName", "Lpv0/w;", "predefinedBehaviour", "", "showSummary", "", "dailyMetrics", "Lkw0/d;", "dailyLogDetails", "Lkw0/a;", "dailyLogs", "Lkw0/c;", "dailyLogStats", "<init>", "(Ljava/lang/String;Lpv0/w;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lkw0/c;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f<LifestyleMetric> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f106945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f106946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<LifestyleMetric> f106947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d> f106948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f106949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f106950g;

    public f(String str, w wVar, boolean z14, List list, List list2, List list3, c cVar, int i14, j jVar) {
        this(str, wVar, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? j0.f134944a : list2, (i14 & 32) != 0 ? null : list3, (i14 & 64) != 0 ? new c(null, null, null, null, null, null, 0, 127, null) : cVar);
    }

    public static f a(f fVar) {
        String str = fVar.f106944a;
        w wVar = fVar.f106945b;
        List<LifestyleMetric> list = fVar.f106947d;
        List<d> list2 = fVar.f106948e;
        List<a> list3 = fVar.f106949f;
        c cVar = fVar.f106950g;
        str.getClass();
        list.getClass();
        list2.getClass();
        cVar.getClass();
        return new f(str, wVar, false, list, list2, list3, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f106944a, fVar.f106944a) && this.f106945b == fVar.f106945b && this.f106946c == fVar.f106946c && s.g(this.f106947d, fVar.f106947d) && s.g(this.f106948e, fVar.f106948e) && s.g(this.f106949f, fVar.f106949f) && s.g(this.f106950g, fVar.f106950g);
    }

    public final int hashCode() {
        int iHashCode = this.f106944a.hashCode() * 31;
        w wVar = this.f106945b;
        int iB = u0.b(u0.b(q6.f.g((iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31, 31, this.f106946c), 31, this.f106947d), 31, this.f106948e);
        List<a> list = this.f106949f;
        return this.f106950g.hashCode() + ((iB + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LifestyleLoggingSummaryChartData(behaviourName=");
        sb3.append(this.f106944a);
        sb3.append(", predefinedBehaviour=");
        sb3.append(this.f106945b);
        sb3.append(", showSummary=");
        sb3.append(this.f106946c);
        sb3.append(", dailyMetrics=");
        sb3.append(this.f106947d);
        sb3.append(", dailyLogDetails=");
        n23.j.z(sb3, this.f106948e, ", dailyLogs=", this.f106949f, ", dailyLogStats=");
        sb3.append(this.f106950g);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, w wVar, boolean z14, List<? extends LifestyleMetric> list, List<d> list2, List<a> list3, c cVar) {
        str.getClass();
        list.getClass();
        list2.getClass();
        cVar.getClass();
        this.f106944a = str;
        this.f106945b = wVar;
        this.f106946c = z14;
        this.f106947d = list;
        this.f106948e = list2;
        this.f106949f = list3;
        this.f106950g = cVar;
    }
}
