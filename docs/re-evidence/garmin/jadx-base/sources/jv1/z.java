package jv1;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljv1/z;", "", "Lvt1/o;", "trainingType", "", "supportsStrengthWorkouts", "", "Lwt1/q;", "trainingDays", "longDays", "swimmingDays", "Lhv1/i;", "swimAbility", "Lvt1/h;", "strengthWorkoutType", "supportsTrainingLevel", "Ltw1/k;", "trainingLevel", "<init>", "(Lvt1/o;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lhv1/i;Lvt1/h;ZLtw1/k;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt1.o f101180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<wt1.q> f101182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<wt1.q> f101183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<wt1.q> f101184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hv1.i f101185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vt1.h f101186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f101187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tw1.k f101188i;

    public z(vt1.o oVar, boolean z14, List list, List list2, List list3, hv1.i iVar, vt1.h hVar, boolean z15, tw1.k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? vt1.o.f180175f : oVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? j0.f134944a : list2, (i14 & 16) != 0 ? null : list3, (i14 & 32) != 0 ? null : iVar, (i14 & 64) != 0 ? vt1.h.NONE : hVar, (i14 & 128) != 0 ? false : z15, (i14 & 256) != 0 ? null : kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f101180a == zVar.f101180a && this.f101181b == zVar.f101181b && p005kotlin.jvm.internal.s.g(this.f101182c, zVar.f101182c) && p005kotlin.jvm.internal.s.g(this.f101183d, zVar.f101183d) && p005kotlin.jvm.internal.s.g(this.f101184e, zVar.f101184e) && this.f101185f == zVar.f101185f && this.f101186g == zVar.f101186g && this.f101187h == zVar.f101187h && this.f101188i == zVar.f101188i;
    }

    public final int hashCode() {
        int iB = u0.b(u0.b(q6.f.g(this.f101180a.hashCode() * 31, 31, this.f101181b), 31, this.f101182c), 31, this.f101183d);
        List<wt1.q> list = this.f101184e;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        hv1.i iVar = this.f101185f;
        int iG = q6.f.g((this.f101186g.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31, 31, this.f101187h);
        tw1.k kVar = this.f101188i;
        return iG + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReviewScheduleUIModel(trainingType=");
        sb3.append(this.f101180a);
        sb3.append(", supportsStrengthWorkouts=");
        sb3.append(this.f101181b);
        sb3.append(", trainingDays=");
        n23.j.z(sb3, this.f101182c, ", longDays=", this.f101183d, ", swimmingDays=");
        sb3.append(this.f101184e);
        sb3.append(", swimAbility=");
        sb3.append(this.f101185f);
        sb3.append(", strengthWorkoutType=");
        sb3.append(this.f101186g);
        sb3.append(", supportsTrainingLevel=");
        sb3.append(this.f101187h);
        sb3.append(", trainingLevel=");
        sb3.append(this.f101188i);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(vt1.o oVar, boolean z14, List<? extends wt1.q> list, List<? extends wt1.q> list2, List<? extends wt1.q> list3, hv1.i iVar, vt1.h hVar, boolean z15, tw1.k kVar) {
        oVar.getClass();
        list.getClass();
        list2.getClass();
        hVar.getClass();
        this.f101180a = oVar;
        this.f101181b = z14;
        this.f101182c = list;
        this.f101183d = list2;
        this.f101184e = list3;
        this.f101185f = iVar;
        this.f101186g = hVar;
        this.f101187h = z15;
        this.f101188i = kVar;
    }

    public z() {
        this(null, false, null, null, null, null, null, false, null, 511, null);
    }
}
