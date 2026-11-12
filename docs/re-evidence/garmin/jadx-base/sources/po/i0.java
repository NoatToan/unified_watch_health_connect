package po;

import com.garmin.android.apps.connectmobile.r2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.List;
import ps.o0;
import ps.o1;
import ps.x0;
import ps.x1;
import ps.y0;

/* JADX INFO: loaded from: classes7.dex */
public class i0 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f138898a;

    public i0(h0 h0Var) {
        this.f138898a = h0Var;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        h0 h0Var = this.f138898a;
        r2 r2Var = h0Var.f139000g;
        int i14 = h0.f138889m;
        r2Var.t8();
        h0Var.f138892j--;
        g22.e.b(h0Var, bVar);
        h0Var.A6();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        h0 h0Var = this.f138898a;
        r2 r2Var = h0Var.f139000g;
        int i14 = h0.f138889m;
        r2Var.t8();
        if (obj == null) {
            a(lj0.b.f112956j);
            return;
        }
        h0Var.f138892j--;
        y0 y0Var = (y0) GsonUtil.f47253b.fromJson(obj.toString(), y0.class);
        if (h0Var.f138891i == null) {
            h0Var.f138891i = new ps.p();
        }
        ps.p pVar = h0Var.f138891i;
        long activityId = y0Var.getActivityId();
        List<o0> listD = y0Var.d();
        List<x0> listF = y0Var.f();
        List<o1> listH = h0Var.f138891i.h();
        List<x1> listI = h0Var.f138891i.i();
        pVar.getClass();
        h0Var.f138891i = new ps.p(activityId, listD, listF, listH, listI);
        h0Var.A6();
    }
}
