package ui2;

import e23.l;
import o13.r;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(l lVar, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f171438b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f171438b = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object objInvoke = dVar.f171437a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f171438b;
        try {
            if (i15 == 0) {
                r.b(objInvoke);
                dVar.f171438b = 1;
                objInvoke = lVar.invoke(dVar);
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objInvoke);
            }
            return (f) objInvoke;
        } catch (Exception e4) {
            return new f.a(oi0.c.J(e4));
        }
    }
}
