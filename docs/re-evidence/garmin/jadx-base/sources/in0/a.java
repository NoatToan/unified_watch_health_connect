package in0;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lin0/a;", "", "Lb63/o;", "date", "Li53/d;", "Lin0/m;", "", "values", "Lj23/g;", "baselineValues", "Lin0/h$b;", "extraData", "<init>", "(Lb63/o;Li53/d;Li53/d;Lin0/h$b;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f94416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.d<m, Double> f94417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.d<m, j23.g<Double>> f94418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.b f94419d;

    public /* synthetic */ a(o oVar, i53.d dVar, i53.d dVar2, h.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, (i14 & 2) != 0 ? i53.a.c() : dVar, (i14 & 4) != 0 ? i53.a.c() : dVar2, (i14 & 8) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f94416a, aVar.f94416a) && s.g(this.f94417b, aVar.f94417b) && s.g(this.f94418c, aVar.f94418c) && s.g(this.f94419d, aVar.f94419d);
    }

    public final int hashCode() {
        int iB = l2.b(this.f94418c, l2.b(this.f94417b, this.f94416a.f16206a.hashCode() * 31, 31), 31);
        h.b bVar = this.f94419d;
        return iB + (bVar == null ? 0 : bVar.f94462a.hashCode());
    }

    public final String toString() {
        return "HealthStatusDailyMetricValues(date=" + this.f94416a + ", values=" + this.f94417b + ", baselineValues=" + this.f94418c + ", extraData=" + this.f94419d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(o oVar, i53.d<m, Double> dVar, i53.d<m, ? extends j23.g<Double>> dVar2, h.b bVar) {
        oVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        this.f94416a = oVar;
        this.f94417b = dVar;
        this.f94418c = dVar2;
        this.f94419d = bVar;
    }
}
