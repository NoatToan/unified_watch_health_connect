package k61;

import ds.e0;
import i53.c;
import j61.h;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import ww1.a0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk61/b;", "", "Lorg/joda/time/DateTime;", "startDate", "endDate", "Li53/c;", "dates", "Lww1/a0;", "trainingPlanPhases", "Lj61/h;", "trainingPlanAggregation", "Lk61/a;", "anaerobicCapacityChartPoints", "aerobicCapacityChartPoints", "aerobicEnduranceChartPoints", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Li53/c;Li53/c;Lj61/h;Li53/c;Li53/c;Li53/c;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f103163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f103164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<DateTime> f103165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c<a0> f103166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f103167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c<a> f103168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c<a> f103169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c<a> f103170h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(DateTime dateTime, DateTime dateTime2, c<DateTime> cVar, c<? extends a0> cVar2, h hVar, c<a> cVar3, c<a> cVar4, c<a> cVar5) {
        dateTime.getClass();
        dateTime2.getClass();
        cVar.getClass();
        cVar3.getClass();
        cVar4.getClass();
        cVar5.getClass();
        this.f103163a = dateTime;
        this.f103164b = dateTime2;
        this.f103165c = cVar;
        this.f103166d = cVar2;
        this.f103167e = hVar;
        this.f103168f = cVar3;
        this.f103169g = cVar4;
        this.f103170h = cVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f103163a, bVar.f103163a) && s.g(this.f103164b, bVar.f103164b) && s.g(this.f103165c, bVar.f103165c) && s.g(this.f103166d, bVar.f103166d) && this.f103167e == bVar.f103167e && s.g(this.f103168f, bVar.f103168f) && s.g(this.f103169g, bVar.f103169g) && s.g(this.f103170h, bVar.f103170h);
    }

    public final int hashCode() {
        int iA = l2.a(this.f103165c, e0.a(this.f103163a.hashCode() * 31, this.f103164b, 31), 31);
        c<a0> cVar = this.f103166d;
        int iHashCode = (iA + (cVar == null ? 0 : cVar.hashCode())) * 31;
        h hVar = this.f103167e;
        return this.f103170h.hashCode() + l2.a(this.f103169g, l2.a(this.f103168f, (iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CyclingAbilitySummary(startDate=");
        sb3.append(this.f103163a);
        sb3.append(", endDate=");
        sb3.append(this.f103164b);
        sb3.append(", dates=");
        f.w(sb3, this.f103165c, ", trainingPlanPhases=", this.f103166d, ", trainingPlanAggregation=");
        sb3.append(this.f103167e);
        sb3.append(", anaerobicCapacityChartPoints=");
        sb3.append(this.f103168f);
        sb3.append(", aerobicCapacityChartPoints=");
        sb3.append(this.f103169g);
        sb3.append(", aerobicEnduranceChartPoints=");
        sb3.append(this.f103170h);
        sb3.append(")");
        return sb3.toString();
    }

    public /* synthetic */ b(DateTime dateTime, DateTime dateTime2, c cVar, c cVar2, h hVar, c cVar3, c cVar4, c cVar5, int i14, j jVar) {
        this(dateTime, dateTime2, cVar, (i14 & 8) != 0 ? null : cVar2, (i14 & 16) != 0 ? null : hVar, cVar3, cVar4, cVar5);
    }
}
