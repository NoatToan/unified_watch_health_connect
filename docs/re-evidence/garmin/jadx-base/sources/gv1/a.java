package gv1;

import fg0.k;
import jv1.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vt1.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgv1/a;", "", "Lvt1/f;", "selectedTrainingGoal", "Ljv1/m;", "selectedPlanGoal", "planTargetData", "Lfg0/k;", "eventDTO", "<init>", "(Lvt1/f;Ljv1/m;Ljv1/m;Lfg0/k;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f79442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f79443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f79444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f79445d;

    public /* synthetic */ a(f fVar, m mVar, m mVar2, k kVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : mVar, (i14 & 4) != 0 ? null : mVar2, (i14 & 8) != 0 ? null : kVar);
    }

    public static a a(a aVar, f fVar, m mVar, int i14) {
        if ((i14 & 1) != 0) {
            fVar = aVar.f79442a;
        }
        if ((i14 & 2) != 0) {
            mVar = aVar.f79443b;
        }
        return new a(fVar, mVar, aVar.f79444c, aVar.f79445d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f79442a, aVar.f79442a) && s.g(this.f79443b, aVar.f79443b) && s.g(this.f79444c, aVar.f79444c) && s.g(this.f79445d, aVar.f79445d);
    }

    public final int hashCode() {
        f fVar = this.f79442a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        m mVar = this.f79443b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        m mVar2 = this.f79444c;
        int iHashCode3 = (iHashCode2 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31;
        k kVar = this.f79445d;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "FBTEditGoalModel(selectedTrainingGoal=" + this.f79442a + ", selectedPlanGoal=" + this.f79443b + ", planTargetData=" + this.f79444c + ", eventDTO=" + this.f79445d + ")";
    }

    public a(f fVar, m mVar, m mVar2, k kVar) {
        this.f79442a = fVar;
        this.f79443b = mVar;
        this.f79444c = mVar2;
        this.f79445d = kVar;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
