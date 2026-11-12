package jv1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljv1/f;", "", "Lvt1/o;", "activityType", "", "titlePlaceHolderResource", "", "Lxw1/h;", "runningCoachPlanDTO", "Ltw1/c;", "cyclingCoachPlanDTO", "", "shouldShowMorePlans", "showMorePlansResultHeader", "Lvt1/f;", "forceGoalType", "<init>", "(Lvt1/o;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;ZZLvt1/f;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt1.o f101047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f101048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<xw1.h> f101049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<tw1.c> f101050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f101051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f101052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vt1.f f101053g;

    public /* synthetic */ f(vt1.o oVar, Integer num, List list, List list2, boolean z14, boolean z15, vt1.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? null : fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f101047a == fVar.f101047a && p005kotlin.jvm.internal.s.g(this.f101048b, fVar.f101048b) && p005kotlin.jvm.internal.s.g(this.f101049c, fVar.f101049c) && p005kotlin.jvm.internal.s.g(this.f101050d, fVar.f101050d) && this.f101051e == fVar.f101051e && this.f101052f == fVar.f101052f && p005kotlin.jvm.internal.s.g(this.f101053g, fVar.f101053g);
    }

    public final int hashCode() {
        int iHashCode = this.f101047a.hashCode() * 31;
        Integer num = this.f101048b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<xw1.h> list = this.f101049c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<tw1.c> list2 = this.f101050d;
        int iG = q6.f.g(q6.f.g((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f101051e), 31, this.f101052f);
        vt1.f fVar = this.f101053g;
        return iG + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CoachPlanSelectionUIModel(activityType=");
        sb3.append(this.f101047a);
        sb3.append(", titlePlaceHolderResource=");
        sb3.append(this.f101048b);
        sb3.append(", runningCoachPlanDTO=");
        n23.j.z(sb3, this.f101049c, ", cyclingCoachPlanDTO=", this.f101050d, ", shouldShowMorePlans=");
        kg.f.q(", showMorePlansResultHeader=", ", forceGoalType=", sb3, this.f101051e, this.f101052f);
        sb3.append(this.f101053g);
        sb3.append(")");
        return sb3.toString();
    }

    public f(vt1.o oVar, Integer num, List<xw1.h> list, List<tw1.c> list2, boolean z14, boolean z15, vt1.f fVar) {
        oVar.getClass();
        this.f101047a = oVar;
        this.f101048b = num;
        this.f101049c = list;
        this.f101050d = list2;
        this.f101051e = z14;
        this.f101052f = z15;
        this.f101053g = fVar;
    }
}
