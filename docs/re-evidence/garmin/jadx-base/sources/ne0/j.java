package ne0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lne0/j;", "", "Lme0/w;", "dogsRepository", "<init>", "(Lme0/w;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me0.w f125480a;

    public j(me0.w wVar) {
        wVar.getClass();
        this.f125480a = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(j jVar, List list, v13.c cVar) {
        f fVar;
        jVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f125449d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f125449d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(jVar, cVar);
            }
        } else {
            fVar = new f(jVar, cVar);
        }
        Object objJ = fVar.f125447b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f125449d;
        if (i15 == 0) {
            o13.r.b(objJ);
            me0.w wVar = jVar.f125480a;
            fVar.f125446a = list;
            fVar.f125449d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.q(wVar, list, null), fVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = fVar.f125446a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GetActivityDetailsDogsUseCase", "Failed to fetch non-owner dog profiles");
            return j53.l.b();
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList<je0.l> arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (list.contains(new Long(((je0.l) obj).f98550a))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (je0.l lVar : arrayList) {
            long j8 = lVar.f98550a;
            String str = lVar.f98551b;
            if (str == null) {
                str = "";
            }
            arrayList2.add(new pe0.a(j8, str, lVar.f98552c, null));
        }
        return i53.a.j(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(j jVar, List list, v13.c cVar) {
        g gVar;
        Map mapL;
        o13.p pVar;
        je0.n nVar;
        je0.p pVar2;
        jVar.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f125454d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f125454d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(jVar, cVar);
            }
        } else {
            gVar = new g(jVar, cVar);
        }
        Object objE = gVar.f125452b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f125454d;
        if (i15 == 0) {
            o13.r.b(objE);
            h hVar = new h(jVar, list, null);
            gVar.f125451a = list;
            gVar.f125454d = 1;
            objE = o53.c0.e(hVar, gVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = gVar.f125451a;
            o13.r.b(objE);
        }
        o13.p pVar3 = (o13.p) objE;
        v2 v2Var = (v2) pVar3.f128594a;
        v2 v2Var2 = (v2) pVar3.f128595b;
        if (!(v2Var instanceof v2.b)) {
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GetActivityDetailsDogsUseCase", "Failed to fetch owner dogs");
            return j53.l.b();
        }
        if (v2Var2 instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var2).f47386a;
            ArrayList<je0.a> arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                je0.q qVar = ((je0.i) it.next()).f98538c;
                List<je0.a> list2 = (qVar == null || (nVar = qVar.f98564a) == null || (pVar2 = nVar.f98558a) == null) ? null : pVar2.f98562a;
                if (list2 == null) {
                    list2 = p13.j0.f134944a;
                }
                p13.d0.v(arrayList, list2);
            }
            ArrayList arrayList2 = new ArrayList();
            for (je0.a aVar2 : arrayList) {
                Long l14 = aVar2.f98470a;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    Integer num = aVar2.f98471b;
                    if (num != null) {
                        pVar = new o13.p(new Long(jLongValue), new Integer(num.intValue()));
                    } else {
                        pVar = null;
                    }
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    arrayList2.add(pVar);
                }
            }
            mapL = u0.l(arrayList2);
        } else {
            mapL = p13.k0.f134949a;
            mapL.getClass();
        }
        Iterable iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList<je0.f> arrayList3 = new ArrayList();
        for (Object obj : iterable2) {
            if (list.contains(new Long(((je0.f) obj).f98501a))) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
        for (je0.f fVar : arrayList3) {
            long j8 = fVar.f98501a;
            String str = fVar.f98504d;
            if (str == null) {
                str = "";
            }
            arrayList4.add(new pe0.a(j8, str, fVar.f98517q, (Integer) mapL.get(new Long(j8))));
        }
        return i53.a.j(arrayList4);
    }
}
