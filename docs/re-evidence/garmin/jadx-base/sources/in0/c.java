package in0;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lin0/c;", "", "Lb63/o;", "calendarDate", "", "outliersCount", "Lb63/l;", "createTimestamp", "updateTimestamp", "Li53/c;", "Lin0/h;", "metrics", "Lin0/g;", "featuresState", "<init>", "(Lb63/o;Ljava/lang/Integer;Lb63/l;Lb63/l;Li53/c;Lin0/g;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f94420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f94421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.l f94422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.l f94423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<h> f94424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f94425f;

    public c(o oVar, Integer num, b63.l lVar, b63.l lVar2, i53.c<h> cVar, g gVar) {
        oVar.getClass();
        this.f94420a = oVar;
        this.f94421b = num;
        this.f94422c = lVar;
        this.f94423d = lVar2;
        this.f94424e = cVar;
        this.f94425f = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f94420a, cVar.f94420a) && s.g(this.f94421b, cVar.f94421b) && s.g(this.f94422c, cVar.f94422c) && s.g(this.f94423d, cVar.f94423d) && s.g(this.f94424e, cVar.f94424e) && s.g(this.f94425f, cVar.f94425f);
    }

    public final int hashCode() {
        int iHashCode = this.f94420a.f16206a.hashCode() * 31;
        Integer num = this.f94421b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        b63.l lVar = this.f94422c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.f16204a.hashCode())) * 31;
        b63.l lVar2 = this.f94423d;
        int iHashCode4 = (iHashCode3 + (lVar2 == null ? 0 : lVar2.f16204a.hashCode())) * 31;
        i53.c<h> cVar = this.f94424e;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        g gVar = this.f94425f;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "HealthStatusDetails(calendarDate=" + this.f94420a + ", outliersCount=" + this.f94421b + ", createTimestamp=" + this.f94422c + ", updateTimestamp=" + this.f94423d + ", metrics=" + this.f94424e + ", featuresState=" + this.f94425f + ")";
    }

    public /* synthetic */ c(o oVar, Integer num, b63.l lVar, b63.l lVar2, i53.c cVar, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, num, lVar, lVar2, cVar, (i14 & 32) != 0 ? null : gVar);
    }
}
