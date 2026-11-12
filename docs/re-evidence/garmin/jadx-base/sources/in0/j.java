package in0;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lin0/j;", "", "Lin0/m;", "metricType", "Lj23/g;", "Lb63/o;", "dateRange", "Lin0/h$a;", "data", "Lin0/h$b;", "extraData", "Li53/d;", "", "dailyValues", "dailyBaselineValues", "<init>", "(Lin0/m;Lj23/g;Lin0/h$a;Lin0/h$b;Li53/d;Li53/d;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f94471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j23.g<o> f94472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.a f94473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.b f94474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.d<o, Double> f94475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.d<o, j23.g<Double>> f94476f;

    /* JADX WARN: Multi-variable type inference failed */
    public j(m mVar, j23.g<o> gVar, h.a aVar, h.b bVar, i53.d<o, Double> dVar, i53.d<o, ? extends j23.g<Double>> dVar2) {
        mVar.getClass();
        gVar.getClass();
        aVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        this.f94471a = mVar;
        this.f94472b = gVar;
        this.f94473c = aVar;
        this.f94474d = bVar;
        this.f94475e = dVar;
        this.f94476f = dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f94471a == jVar.f94471a && this.f94472b.equals(jVar.f94472b) && this.f94473c.equals(jVar.f94473c) && s.g(this.f94474d, jVar.f94474d) && this.f94475e.equals(jVar.f94475e) && this.f94476f.equals(jVar.f94476f);
    }

    public final int hashCode() {
        int iHashCode = (this.f94473c.hashCode() + ((this.f94472b.hashCode() + (this.f94471a.hashCode() * 31)) * 31)) * 31;
        h.b bVar = this.f94474d;
        return this.f94476f.hashCode() + l2.b(this.f94475e, (iHashCode + (bVar == null ? 0 : bVar.f94462a.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "HealthStatusMetricDetails(metricType=" + this.f94471a + ", dateRange=" + this.f94472b + ", data=" + this.f94473c + ", extraData=" + this.f94474d + ", dailyValues=" + this.f94475e + ", dailyBaselineValues=" + this.f94476f + ")";
    }
}
