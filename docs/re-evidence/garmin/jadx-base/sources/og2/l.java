package og2;

import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Log2/l;", "", "", "Li53/c;", "Log2/j;", "charts", "chartDot", "Log2/b;", "xAxisRange", "yAxisRange", "Log2/p0;", "yAxisLabelValues", "Log2/g;", "gradient", "Log2/j0;", "xAxisPositionsAndLabels", "", "invertYAxis", "<init>", "(Ljava/util/List;Log2/j;Log2/b;Log2/b;Li53/c;Li53/c;Li53/c;Z)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i53.c<j>> f132053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f132054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f132055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f132056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<p0> f132057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<g> f132058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<j0> f132059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f132060h;

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends i53.c<j>> list, j jVar, b bVar, b bVar2, i53.c<p0> cVar, i53.c<g> cVar2, i53.c<j0> cVar3, boolean z14) {
        list.getClass();
        bVar.getClass();
        bVar2.getClass();
        cVar.getClass();
        cVar3.getClass();
        this.f132053a = list;
        this.f132054b = jVar;
        this.f132055c = bVar;
        this.f132056d = bVar2;
        this.f132057e = cVar;
        this.f132058f = cVar2;
        this.f132059g = cVar3;
        this.f132060h = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f132053a.equals(lVar.f132053a) && p005kotlin.jvm.internal.s.g(this.f132054b, lVar.f132054b) && this.f132055c.equals(lVar.f132055c) && this.f132056d.equals(lVar.f132056d) && this.f132057e.equals(lVar.f132057e) && p005kotlin.jvm.internal.s.g(this.f132058f, lVar.f132058f) && this.f132059g.equals(lVar.f132059g) && this.f132060h == lVar.f132060h;
    }

    public final int hashCode() {
        int iHashCode = this.f132053a.hashCode() * 31;
        j jVar = this.f132054b;
        int iA = l2.a(this.f132057e, (this.f132056d.hashCode() + ((this.f132055c.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31)) * 31, 31);
        i53.c<g> cVar = this.f132058f;
        return Boolean.hashCode(this.f132060h) + l2.a(this.f132059g, (iA + (cVar != null ? cVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChartState(charts=");
        sb3.append(this.f132053a);
        sb3.append(", chartDot=");
        sb3.append(this.f132054b);
        sb3.append(", xAxisRange=");
        sb3.append(this.f132055c);
        sb3.append(", yAxisRange=");
        sb3.append(this.f132056d);
        sb3.append(", yAxisLabelValues=");
        q6.f.w(sb3, this.f132057e, ", gradient=", this.f132058f, ", xAxisPositionsAndLabels=");
        sb3.append(this.f132059g);
        sb3.append(", invertYAxis=");
        sb3.append(this.f132060h);
        sb3.append(")");
        return sb3.toString();
    }
}
