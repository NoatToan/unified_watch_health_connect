package dm;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.x0;
import ps.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/c0;", "Liu1/k;", "Lps/y0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements iu1.k<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f60332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f60333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f60334c;

    public c0(o oVar, boolean z14, long j8) {
        this.f60332a = oVar;
        this.f60333b = z14;
        this.f60334c = j8;
    }

    @Override // iu1.k
    public final void onSuccess(y0 y0Var) {
        y0 y0Var2 = y0Var;
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        o oVar = this.f60332a;
        aq.d dVar = (aq.d) oVar.f50097g.get(eVar);
        ps.p pVar = ((aq.d) oVar.f50097g.get(eVar)).f11891m;
        long activityId = y0Var2.getActivityId();
        List<ps.o0> listD = y0Var2.d();
        List<x0> listF = y0Var2.f();
        ps.p pVarB = ps.p.b(pVar, activityId, listD, listF != null ? new ArrayList(listF) : null, null, 24);
        dVar.getClass();
        dVar.f11891m = pVarB;
        if (this.f60333b) {
            cw.e.a(oVar, oVar.n(this.f60334c, true));
        }
    }
}
