package l70;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll70/u0;", "Ll70/n0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k0;", "dashboardApi", "Lf12/l;", "userSettings", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;", "dashboardConfigDataSource", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k0;Lf12/l;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.k0 f110814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f110815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0 f110816c;

    public u0(com.garmin.android.apps.connectmobile.dashboard.data.datasource.k0 k0Var, f12.l lVar, com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0 l0Var) {
        k0Var.getClass();
        lVar.getClass();
        l0Var.getClass();
        this.f110814a = k0Var;
        this.f110815b = lVar;
        this.f110816c = l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l70.n0
    public final Object J0(j70.y yVar, v13.c cVar) {
        s0 s0Var;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f110789e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f110789e = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object objJ = s0Var.f110787c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f110789e;
        if (i15 == 0) {
            o13.r.b(objJ);
            t0 t0Var = new t0(this, yVar, null);
            s0Var.f110785a = yVar;
            s0Var.f110789e = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, t0Var, s0Var);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = s0Var.f110786b;
            o13.r.b(objJ);
            return bVar;
        }
        yVar = s0Var.f110785a;
        o13.r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ht.s sVar = ht.s.f85508a;
            lt.d dVar = new lt.d(yVar.getUserFocus());
            sVar.getClass();
            ht.s.c(dVar);
            this.f110815b.q3(yVar.getUserFocus());
            s0Var.f110785a = null;
            s0Var.f110786b = (v2.b) v2Var;
            s0Var.f110789e = 2;
            if (this.f110816c.f() == aVar) {
                return aVar;
            }
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l70.n0
    public final Object j3(v13.c cVar) {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f110754c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f110754c = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objJ = o0Var.f110752a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f110754c;
        if (i15 == 0) {
            o13.r.b(objJ);
            p0 p0Var = new p0(this, null);
            o0Var.f110754c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, p0Var, o0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ht.s sVar = ht.s.f85508a;
            j70.y yVar = (j70.y) ((v2.b) v2Var).f47386a;
            lt.d dVar = new lt.d(yVar.getUserFocus());
            sVar.getClass();
            ht.s.c(dVar);
            this.f110815b.q3(yVar.getUserFocus());
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l70.n0
    public final Object r3(v13.c cVar) {
        q0 q0Var;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f110769c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f110769c = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object objJ = q0Var.f110767a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f110769c;
        if (i15 == 0) {
            o13.r.b(objJ);
            r0 r0Var = new r0(this, null);
            q0Var.f110769c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, r0Var, q0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((j70.y) it.next()).getUserFocus());
            }
            this.f110815b.K2(arrayList);
        }
        return v2Var;
    }
}
