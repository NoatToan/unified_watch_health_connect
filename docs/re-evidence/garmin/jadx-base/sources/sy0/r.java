package sy0;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsy0/r;", "", "", "labelDate", "Lb63/o;", "localDate", "Li53/c;", "Lly0/a;", "activities", "Lcy0/l;", "dailyNote", "<init>", "(Ljava/lang/String;Lb63/o;Li53/c;Lcy0/l;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f161279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<ly0.a> f161280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cy0.l f161281d;

    public r(String str, b63.o oVar, i53.c cVar, cy0.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? j53.l.b() : cVar, (i14 & 8) != 0 ? null : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f161278a, rVar.f161278a) && p005kotlin.jvm.internal.s.g(this.f161279b, rVar.f161279b) && p005kotlin.jvm.internal.s.g(this.f161280c, rVar.f161280c) && p005kotlin.jvm.internal.s.g(this.f161281d, rVar.f161281d);
    }

    public final int hashCode() {
        String str = this.f161278a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b63.o oVar = this.f161279b;
        int iA = l2.a(this.f161280c, (iHashCode + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31, 31);
        cy0.l lVar = this.f161281d;
        return iA + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineEpicItem(labelDate=" + this.f161278a + ", localDate=" + this.f161279b + ", activities=" + this.f161280c + ", dailyNote=" + this.f161281d + ")";
    }

    public r(String str, b63.o oVar, i53.c<ly0.a> cVar, cy0.l lVar) {
        cVar.getClass();
        this.f161278a = str;
        this.f161279b = oVar;
        this.f161280c = cVar;
        this.f161281d = lVar;
    }
}
