package tf;

import o13.r;
import sf.q;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(q qVar, v13.c cVar) {
        d dVar;
        q qVar2;
        Throwable th3;
        w63.e eVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f164427d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f164427d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object obj = dVar.f164426c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f164427d;
        if (i15 != 0) {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = dVar.f164425b;
            qVar2 = dVar.f164424a;
            try {
                r.b(obj);
                zf.b.h(qVar2, null);
                return eVar;
            } catch (Throwable th4) {
                th3 = th4;
                try {
                    throw th3;
                } catch (Throwable th5) {
                    zf.b.h(qVar2, th3);
                    throw th5;
                }
            }
        }
        r.b(obj);
        try {
            w63.e eVar2 = new w63.e();
            dVar.f164424a = qVar;
            dVar.f164425b = eVar2;
            dVar.f164427d = 1;
            if (qVar.D1(eVar2) == aVar) {
                return aVar;
            }
            qVar2 = qVar;
            eVar = eVar2;
            zf.b.h(qVar2, null);
            return eVar;
        } catch (Throwable th6) {
            qVar2 = qVar;
            th3 = th6;
            throw th3;
        }
    }
}
