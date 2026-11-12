package ww1;

import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lww1/u;", "", "Lww1/t;", "trainingPlan", "", "Lfg0/e;", "trainableEvents", "Lxw1/p;", "workoutPlanType", "", "isSkippedWorkouts", "isCompletedPlan", "Lww1/s;", "fitnessStatsActivities", "<init>", "(Lww1/t;Ljava/util/List;Ljava/util/List;ZZLjava/util/List;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f187871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<fg0.e> f187872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<xw1.p> f187873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f187874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f187875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<s> f187876f;

    public u(t tVar, List<fg0.e> list, List<xw1.p> list2, boolean z14, boolean z15, List<s> list3) {
        tVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f187871a = tVar;
        this.f187872b = list;
        this.f187873c = list2;
        this.f187874d = z14;
        this.f187875e = z15;
        this.f187876f = list3;
    }

    public final xw1.p a() {
        Object obj;
        Object next;
        Integer workoutPlanTypeId;
        c0 trainingPlanDetailBrief;
        Iterator<T> it = this.f187873c.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                workoutPlanTypeId = ((xw1.p) next).getWorkoutPlanTypeId();
                trainingPlanDetailBrief = this.f187871a.getTrainingPlanDetailBrief();
            }
            return (xw1.p) obj;
        } while (!p005kotlin.jvm.internal.s.g(workoutPlanTypeId, trainingPlanDetailBrief != null ? trainingPlanDetailBrief.getPlanTypeId() : null));
        obj = next;
        return (xw1.p) obj;
    }

    public final g0 b() {
        g0.a aVar = g0.f187768d;
        c0 trainingPlanDetailBrief = this.f187871a.getTrainingPlanDetailBrief();
        String trainingType = trainingPlanDetailBrief != null ? trainingPlanDetailBrief.getTrainingType() : null;
        aVar.getClass();
        g0 g0VarA = g0.a.a(trainingType);
        xw1.p pVarA = a();
        return g0VarA == null ? g0.a.a(pVarA != null ? pVarA.getTrainingType() : null) : g0VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f187871a.equals(uVar.f187871a) && this.f187872b.equals(uVar.f187872b) && this.f187873c.equals(uVar.f187873c) && this.f187874d == uVar.f187874d && this.f187875e == uVar.f187875e && this.f187876f.equals(uVar.f187876f);
    }

    public final int hashCode() {
        return this.f187876f.hashCode() + q6.f.g(q6.f.g(u0.b(u0.b(this.f187871a.hashCode() * 31, 31, this.f187872b), 31, this.f187873c), 31, this.f187874d), 31, this.f187875e);
    }

    public final String toString() {
        return "DashboardTrainingPlanItem(trainingPlan=" + this.f187871a + ", trainableEvents=" + this.f187872b + ", workoutPlanType=" + this.f187873c + ", isSkippedWorkouts=" + this.f187874d + ", isCompletedPlan=" + this.f187875e + ", fitnessStatsActivities=" + this.f187876f + ")";
    }
}
