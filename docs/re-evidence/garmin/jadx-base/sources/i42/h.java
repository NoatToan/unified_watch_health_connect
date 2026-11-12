package i42;

import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
public interface h {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object d(h hVar, String str, String str2, String str3, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f91006d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f91006d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(hVar, cVar);
            }
        } else {
            gVar = new g(hVar, cVar);
        }
        Object objH = gVar.f91004b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f91006d;
        if (i15 == 0) {
            r.b(objH);
            gVar.f91003a = hVar;
            gVar.f91006d = 1;
            objH = hVar.h(str, str2, str3, gVar);
            if (objH != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objH);
                return objH;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hVar = gVar.f91003a;
        r.b(objH);
        Long l14 = (Long) objH;
        if (l14 == null) {
            return null;
        }
        long jLongValue = l14.longValue();
        gVar.f91003a = null;
        gVar.f91006d = 2;
        Object objE = hVar.e(jLongValue, gVar);
        return objE == aVar ? aVar : objE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[LOOP:0: B:27:0x00ae->B:29:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
    
        if (r1.g(r2, r3) == r4) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object j(h hVar, String str, String str2, String str3, List list, v13.c cVar) {
        f fVar;
        h hVar2;
        List<e> list2;
        String str4;
        String str5;
        String str6;
        h hVar3;
        long jLongValue;
        ArrayList arrayList;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f91002h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f91002h = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(hVar, cVar);
            }
        } else {
            fVar = new f(hVar, cVar);
        }
        Object objL = fVar.f91000f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f91002h;
        if (i15 == 0) {
            r.b(objL);
            fVar.f90995a = hVar;
            fVar.f90996b = str;
            fVar.f90997c = str2;
            fVar.f90998d = str3;
            fVar.f90999e = list;
            fVar.f91002h = 1;
            if (hVar.f(str2, fVar) != aVar) {
                hVar2 = hVar;
                list2 = list;
                str4 = str2;
                str5 = str;
                str6 = str3;
            }
            return aVar;
        }
        if (i15 == 1) {
            list2 = fVar.f90999e;
            String str7 = fVar.f90998d;
            String str8 = fVar.f90997c;
            String str9 = fVar.f90996b;
            hVar2 = fVar.f90995a;
            r.b(objL);
            str6 = str7;
            str4 = str8;
            str5 = str9;
        } else if (i15 == 2) {
            list2 = fVar.f90999e;
            hVar3 = fVar.f90995a;
            r.b(objL);
            jLongValue = ((Number) objL).longValue();
            arrayList = new ArrayList(y.r(list2, 10));
            for (e eVar : list2) {
                String str10 = eVar.f90992b;
                String str11 = eVar.f90993c;
                String str12 = eVar.f90994d;
                str10.getClass();
                str11.getClass();
                str12.getClass();
                arrayList.add(new e(jLongValue, str10, str11, str12));
            }
            fVar.f90995a = null;
            fVar.f90996b = null;
            fVar.f90997c = null;
            fVar.f90998d = null;
            fVar.f90999e = null;
            fVar.f91002h = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objL);
        }
        return Unit.INSTANCE;
        d dVar = new d(0L, str5, str4, str6, 1, null);
        fVar.f90995a = hVar2;
        fVar.f90996b = null;
        fVar.f90997c = null;
        fVar.f90998d = null;
        fVar.f90999e = list2;
        fVar.f91002h = 2;
        objL = hVar2.l(dVar, fVar);
        if (objL != aVar) {
            hVar3 = hVar2;
            jLongValue = ((Number) objL).longValue();
            arrayList = new ArrayList(y.r(list2, 10));
            while (r0.hasNext()) {
                String str13 = eVar.f90992b;
                String str14 = eVar.f90993c;
                String str15 = eVar.f90994d;
                str13.getClass();
                str14.getClass();
                str15.getClass();
                arrayList.add(new e(jLongValue, str13, str14, str15));
            }
            fVar.f90995a = null;
            fVar.f90996b = null;
            fVar.f90997c = null;
            fVar.f90998d = null;
            fVar.f90999e = null;
            fVar.f91002h = 3;
        }
        return aVar;
    }

    Object a(String str, c cVar);

    default Object b(String str, String str2, String str3, b bVar) {
        return d(this, str, str2, str3, bVar);
    }

    Object c(String str, c cVar);

    Object e(long j8, g gVar);

    Object f(String str, f fVar);

    Object g(ArrayList arrayList, f fVar);

    Object h(String str, String str2, String str3, g gVar);

    Object i(t13.d<? super Unit> dVar);

    default Object k(String str, String str2, String str3, ArrayList arrayList, a aVar) {
        return j(this, str, str2, str3, arrayList, aVar);
    }

    Object l(d dVar, f fVar);
}
