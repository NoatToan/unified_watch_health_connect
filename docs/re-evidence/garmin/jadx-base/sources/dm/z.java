package dm;

import java.util.List;
import p005kotlin.Metadata;
import ps.o1;
import ps.p1;
import ps.v0;
import ps.x0;
import ps.x1;
import ps.y1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/z;", "Liu1/k;", "Lps/v0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements iu1.k<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f60426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f60427b;

    public z(o oVar, long j8) {
        this.f60426a = oVar;
        this.f60427b = j8;
    }

    @Override // iu1.k
    public final void onSuccess(v0 v0Var) {
        v0 v0Var2 = v0Var;
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        o oVar = this.f60426a;
        aq.d dVar = (aq.d) oVar.f50097g.get(eVar);
        ps.p pVar = ((aq.d) oVar.f50097g.get(eVar)).f11891m;
        ps.p activitySplits = v0Var2.getActivitySplits();
        List<ps.o0> listF = activitySplits != null ? activitySplits.f() : null;
        ps.p activitySplits2 = v0Var2.getActivitySplits();
        List<x0> listG = activitySplits2 != null ? activitySplits2.g() : null;
        p1 splitSummary = v0Var2.getSplitSummary();
        List<o1> listB = splitSummary != null ? splitSummary.b() : null;
        y1 typedSplits = v0Var2.getTypedSplits();
        List<x1> listD = typedSplits != null ? typedSplits.d() : null;
        pVar.getClass();
        ps.p pVar2 = new ps.p(this.f60427b, listF, listG, listB, listD);
        dVar.getClass();
        dVar.f11891m = pVar2;
    }
}
