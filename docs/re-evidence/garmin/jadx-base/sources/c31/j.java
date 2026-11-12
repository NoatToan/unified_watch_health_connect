package c31;

import b31.l;
import b63.u;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface j {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r5.d(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object b(j jVar, List list, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f24097e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f24097e = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(jVar, cVar);
            }
        } else {
            iVar = new i(jVar, cVar);
        }
        Object obj = iVar.f24095c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f24097e;
        if (i15 == 0) {
            r.b(obj);
            iVar.f24093a = jVar;
            iVar.f24094b = list;
            iVar.f24097e = 1;
            if (jVar.a(iVar) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            list = iVar.f24094b;
            jVar = iVar.f24093a;
            r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        iVar.f24093a = null;
        iVar.f24094b = null;
        iVar.f24097e = 2;
    }

    Object a(v13.c cVar);

    Object c(d31.d dVar, d31.c cVar, l lVar);

    Object d(List list, i iVar);

    default Object e(ArrayList arrayList, b31.j jVar) {
        return b(this, arrayList, jVar);
    }

    Object f(d31.d dVar, u uVar, b31.k kVar);

    Object g(d31.c cVar, zo0.d.c cVar2);
}
