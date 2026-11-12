package c31;

import java.util.ArrayList;
import java.util.List;
import kd0.g1;
import o13.r;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface c {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r5.j(r8, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object b(c cVar, long j8, List list, v13.c cVar2) {
        b bVar;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i14 = bVar.f24078f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f24078f = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar, cVar2);
            }
        } else {
            bVar = new b(cVar, cVar2);
        }
        Object obj = bVar.f24076d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f24078f;
        if (i15 == 0) {
            r.b(obj);
            bVar.f24073a = cVar;
            bVar.f24074b = list;
            bVar.f24075c = j8;
            bVar.f24078f = 1;
            if (cVar.i(j8, bVar) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j8 = bVar.f24075c;
            list = bVar.f24074b;
            cVar = bVar.f24073a;
            r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        bVar.f24073a = null;
        bVar.f24074b = null;
        bVar.f24075c = j8;
        bVar.f24078f = 2;
    }

    jd.g a(d31.c cVar);

    Object c(long j8, d31.d dVar, d31.c cVar, b31.e eVar);

    Object d(g1 g1Var);

    Object e(i31.a aVar);

    default Object f(long j8, ArrayList arrayList, b31.d dVar) {
        return b(this, j8, arrayList, dVar);
    }

    Object g(long j8, d31.c cVar, v13.c cVar2);

    jd.g h(long j8);

    Object i(long j8, v13.c cVar);

    Object j(List list, b bVar);

    Object k(long j8, d31.d dVar, v13.c cVar);

    Object l(d31.c cVar, v13.i iVar);
}
