package nq1;

import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnq1/k;", "", "Lyz1/d;", "status", "", "value", "goal", "distanceInMeters", "currentStreak", "longestStreak", "Li53/c;", "", "timelineValues", "predictiveLineTimelineValues", "Lae0/h;", "timelineEntries", "<init>", "(Lyz1/d;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Li53/c;Li53/c;Li53/c;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f126950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f126951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f126952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f126953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f126954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f126955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<Integer> f126956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<Integer> f126957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.c<ae0.h> f126958i;

    public k(yz1.d dVar, Double d14, Double d15, Double d16, Double d17, Double d18, i53.c cVar, i53.c cVar2, i53.c cVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, d14, d15, d16, d17, d18, (i14 & 64) != 0 ? l.b() : cVar, (i14 & 128) != 0 ? l.b() : cVar2, cVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f126950a, kVar.f126950a) && s.g(this.f126951b, kVar.f126951b) && s.g(this.f126952c, kVar.f126952c) && s.g(this.f126953d, kVar.f126953d) && s.g(this.f126954e, kVar.f126954e) && s.g(this.f126955f, kVar.f126955f) && s.g(this.f126956g, kVar.f126956g) && s.g(this.f126957h, kVar.f126957h) && s.g(this.f126958i, kVar.f126958i);
    }

    public final int hashCode() {
        int iHashCode = this.f126950a.hashCode() * 31;
        Double d14 = this.f126951b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f126952c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f126953d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f126954e;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f126955f;
        return this.f126958i.hashCode() + l2.a(this.f126957h, l2.a(this.f126956g, (iHashCode5 + (d18 != null ? d18.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StepsKeyStatsCardData(status=");
        sb3.append(this.f126950a);
        sb3.append(", value=");
        sb3.append(this.f126951b);
        sb3.append(", goal=");
        b71.i.p(this.f126952c, this.f126953d, ", distanceInMeters=", ", currentStreak=", sb3);
        b71.i.p(this.f126954e, this.f126955f, ", longestStreak=", ", timelineValues=", sb3);
        q6.f.w(sb3, this.f126956g, ", predictiveLineTimelineValues=", this.f126957h, ", timelineEntries=");
        return l2.e(sb3, this.f126958i, ")");
    }

    public k(yz1.d dVar, Double d14, Double d15, Double d16, Double d17, Double d18, i53.c<Integer> cVar, i53.c<Integer> cVar2, i53.c<ae0.h> cVar3) {
        dVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f126950a = dVar;
        this.f126951b = d14;
        this.f126952c = d15;
        this.f126953d = d16;
        this.f126954e = d17;
        this.f126955f = d18;
        this.f126956g = cVar;
        this.f126957h = cVar2;
        this.f126958i = cVar3;
    }
}
