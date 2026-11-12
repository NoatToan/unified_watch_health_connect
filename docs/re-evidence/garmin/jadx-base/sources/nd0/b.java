package nd0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.handlers.FindMyEdgeCommunicationHandler;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnd0/b;", "Li90/a;", "Lpc0/a;", "backupRepo", "<init>", "(Lpc0/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc0.a f125392a;

    public b(pc0.a aVar) {
        aVar.getClass();
        this.f125392a = aVar;
    }

    @Override // i90.a
    public final void a(long j8) {
        FindMyEdgeCommunicationHandler.getInstance().sendLocationUpdatedSetEnabledRequest(j8, true);
    }

    @Override // i90.a
    public final Object b(long j8, ga0.c cVar) {
        pc0.a aVar = this.f125392a;
        Object objJ = f0.J(aVar, new pc0.c(aVar, j8, null), cVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    @Override // i90.a
    public final boolean c(long j8, SupportedCapability supportedCapability) {
        supportedCapability.getClass();
        return hk0.e.g(j8, supportedCapability);
    }

    @Override // i90.a
    public final Object d(long j8, long j14, ga0.c cVar) {
        pc0.a aVar = this.f125392a;
        Object objJ = f0.J(aVar, new pc0.b(aVar, j8, j14, null), cVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i90.a
    public final Object e(List list, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f125391c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f125391c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objJ = aVar.f125389a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f125391c;
        if (i15 == 0) {
            r.b(objJ);
            aVar.f125391c = 1;
            pc0.a aVar3 = this.f125392a;
            objJ = f0.J(aVar3, new pc0.d(aVar3, list, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        T t7 = bVar.f47386a;
        List<qv.c> listF = ((qv.a) t7).f();
        if (listF != null) {
            for (qv.c cVar2 : listF) {
                hv.h.f85764f.getClass();
                hv.h hVarA = hv.h.a.a();
                bm2.c cVarB = hVarA != null ? hVarA.b(cVar2.getDeviceTypeKey()) : null;
                if (cVarB != null) {
                    cVar2.j(cVarB.getProductDisplayName());
                    cVar2.i(cVarB.f18909g);
                }
            }
        }
        return v2.b.a(bVar, t7);
    }
}
