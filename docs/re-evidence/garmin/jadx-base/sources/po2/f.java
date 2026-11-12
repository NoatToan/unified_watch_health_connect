package po2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b'\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpo2/f;", "Lpo2/k0;", "Laq2/l;", "", "", "jobPollingIntervalInMs", "syncPollingIntervalInMs", "deviceId", "<init>", "(JJJ)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f extends k0<aq2.l<? extends Unit>> {
    public f(long j8, long j14, long j15) {
        super(j8, j14, j15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r5.c(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(f fVar, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f139130d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f139130d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar, cVar);
            }
        } else {
            eVar = new e(fVar, cVar);
        }
        Object obj = eVar.f139128b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f139130d;
        if (i15 == 0) {
            o13.r.b(obj);
            aq2.l.c cVar2 = new aq2.l.c(100);
            eVar.f139127a = fVar;
            eVar.f139130d = 1;
            if (fVar.q(cVar2, eVar) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            fVar = eVar.f139127a;
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        aq2.l.d dVar = new aq2.l.d(Unit.INSTANCE);
        eVar.f139127a = null;
        eVar.f139130d = 2;
    }

    @Override // po2.k0
    public final Object b(t13.d dVar, Throwable th3) {
        Object objC = c(new aq2.l.a(th3), (v13.c) dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // po2.k0
    public final Object l(r0 r0Var) {
        return s(this, r0Var);
    }

    @Override // po2.k0
    public final Object n(int i14, r0 r0Var) {
        Object objQ = q(new aq2.l.c(i14), r0Var);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // po2.k0
    public Object p(t13.d<? super Unit> dVar) {
        Object objQ = q(aq2.l.b.f12513a, (v13.c) dVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }
}
