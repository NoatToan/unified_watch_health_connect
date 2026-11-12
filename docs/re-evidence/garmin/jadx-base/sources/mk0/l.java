package mk0;

import am.x0;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jk0.x;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmk0/l;", "", "Lkk0/b;", "gearRepository", "<init>", "(Lkk0/b;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f119140a;

    public l(kk0.b bVar) {
        bVar.getClass();
        this.f119140a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r12 == r15) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, String str, Collection collection, v13.c cVar) {
        j jVar;
        kk0.b bVar = lVar.f119140a;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f119135d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f119135d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(lVar, cVar);
            }
        } else {
            jVar = new j(lVar, cVar);
        }
        Object objN = jVar.f119133b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f119135d;
        boolean z14 = false;
        if (i15 == 0) {
            r.b(objN);
            jVar.f119132a = collection;
            jVar.f119135d = 1;
            objN = bVar.N(str, jVar);
            if (objN != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            collection = jVar.f119132a;
            r.b(objN);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objN);
        }
        if (!(objN instanceof v2.a)) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
        v2 v2Var = (v2) objN;
        if (v2Var instanceof v2.b) {
            jk0.j jVar2 = (jk0.j) ((v2.b) v2Var).f47386a;
            List list = jVar2.f99269h;
            if (list == null) {
                list = j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                jk0.g gVar = (jk0.g) obj;
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!u.q(((x0) it.next()).f4358a, gVar.f99248a, true));
                }
                arrayList.add(obj);
            }
            if (arrayList.size() != list.size()) {
                jk0.j jVarA = jk0.j.a(jVar2, null, null, arrayList, 383);
                jVar.f119132a = null;
                jVar.f119135d = 2;
                objN = bVar.V(jVarA, jVar);
            } else {
                z14 = true;
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        if (r0 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l lVar, String str, Collection collection, v13.c cVar) {
        k kVar;
        Collection collection2;
        kk0.b bVar = lVar.f119140a;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f119139d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f119139d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(lVar, cVar);
            }
        } else {
            kVar = new k(lVar, cVar);
        }
        Object objY = kVar.f119137b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f119139d;
        boolean z14 = false;
        if (i15 == 0) {
            r.b(objY);
            kVar.f119136a = collection;
            kVar.f119139d = 1;
            objY = bVar.y(str, kVar);
            if (objY != aVar) {
                collection2 = collection;
            }
            return aVar;
        }
        if (i15 == 1) {
            collection2 = kVar.f119136a;
            r.b(objY);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objY);
        }
        if (!(objY instanceof v2.a)) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
        v2 v2Var = (v2) objY;
        if (v2Var instanceof v2.b) {
            x xVar = (x) ((v2.b) v2Var).f47386a;
            List list = xVar.f99354d;
            if (list == null) {
                list = j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                jk0.g gVar = (jk0.g) obj;
                Collection collection3 = collection2;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!u.q(((x0) it.next()).f4358a, gVar.f99248a, true));
                }
                arrayList.add(obj);
            }
            if (arrayList.size() != list.size()) {
                x xVarB = x.b(xVar, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, 8388599);
                kVar.f119136a = null;
                kVar.f119139d = 2;
                objY = bVar.d(xVarB, kVar);
            } else {
                z14 = true;
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return Boolean.valueOf(z14);
    }
}
