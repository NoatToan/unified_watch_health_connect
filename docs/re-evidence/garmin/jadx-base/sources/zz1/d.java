package zz1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzz1/d;", "", "Lyz1/d;", "status", "", "intensityMinutesWeeklyTotal", "intensityMinutesGoal", "Li53/c;", "intensityMinutesDailyProgress", "Lc02/c;", "achievedGoalDays", "today", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Li53/c;Li53/c;Lc02/c;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f207637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f207638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f207639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<Integer> f207640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<c02.c> f207641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c02.c f207642f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(yz1.d dVar, Integer num, Integer num2, i53.c<Integer> cVar, i53.c<? extends c02.c> cVar2, c02.c cVar3) {
        dVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f207637a = dVar;
        this.f207638b = num;
        this.f207639c = num2;
        this.f207640d = cVar;
        this.f207641e = cVar2;
        this.f207642f = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f207637a.equals(dVar.f207637a) && s.g(this.f207638b, dVar.f207638b) && s.g(this.f207639c, dVar.f207639c) && this.f207640d.equals(dVar.f207640d) && this.f207641e.equals(dVar.f207641e) && this.f207642f == dVar.f207642f;
    }

    public final int hashCode() {
        int iHashCode = this.f207637a.hashCode() * 31;
        Integer num = this.f207638b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f207639c;
        return this.f207642f.hashCode() + l2.a(this.f207641e, l2.a(this.f207640d, (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "IntensityMinutesData(status=" + this.f207637a + ", intensityMinutesWeeklyTotal=" + this.f207638b + ", intensityMinutesGoal=" + this.f207639c + ", intensityMinutesDailyProgress=" + this.f207640d + ", achievedGoalDays=" + this.f207641e + ", today=" + this.f207642f + ")";
    }
}
