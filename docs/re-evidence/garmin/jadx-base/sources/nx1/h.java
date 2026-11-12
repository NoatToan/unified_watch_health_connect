package nx1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnx1/h;", "", "Luw1/b;", "trainingPlansRepo", "<init>", "(Luw1/b;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.b f128230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f128231b;

    public h(uw1.b bVar) {
        bVar.getClass();
        this.f128230a = bVar;
        this.f128231b = q2.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Long l14, v13.c cVar) {
        g gVar;
        p2 p2Var;
        ix1.e eVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f128229d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f128229d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objJ = gVar.f128227b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f128229d;
        p2 p2Var2 = this.f128231b;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (l14 != null) {
                long jLongValue = l14.longValue();
                gVar.f128226a = p2Var2;
                gVar.f128229d = 1;
                objJ = f0.J(this.f128230a, new uw1.f(jLongValue, null), gVar);
                if (objJ != aVar) {
                    p2Var = p2Var2;
                }
            } else {
                p2Var = p2Var2;
                gVar.f128226a = null;
                gVar.f128229d = 2;
                if (p2Var.emit(eVar, gVar) != aVar) {
                    return p2Var2;
                }
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return p2Var2;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p2Var = gVar.f128226a;
        o13.r.b(objJ);
        v2 v2Var = (v2) objJ;
        eVar = v2Var instanceof v2.b ? (ix1.e) ((v2.b) v2Var).f47386a : null;
        gVar.f128226a = null;
        gVar.f128229d = 2;
        if (p2Var.emit(eVar, gVar) != aVar) {
            return aVar;
        }
        return p2Var2;
    }
}
