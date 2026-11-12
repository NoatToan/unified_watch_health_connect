package su0;

import com.garmin.android.apps.connectmobile.livetrackui.data.exception.AddContactException;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import lc.u0;
import o53.i0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu0/t;", "", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f161004a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uu0.b f161005b = ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static pu0.k f161006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List<pu0.b> f161007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static pu0.e f161008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList f161009f;

    static {
        j0 j0Var = j0.f134944a;
        f161008e = new pu0.e(j0Var, j0Var, false, false);
    }

    private t() {
    }

    public static pu0.b d(String str) {
        pu0.k kVar = f161006c;
        Object obj = null;
        if (kVar == null) {
            return null;
        }
        for (Object obj2 : kVar.f141286a) {
            if (p005kotlin.jvm.internal.s.g(((pu0.b) obj2).f141183a, str)) {
                obj = obj2;
                break;
            }
        }
        return (pu0.b) obj;
    }

    public static pu0.b e(String str) {
        Object next;
        str.getClass();
        pu0.k kVar = f161006c;
        Object obj = null;
        if (kVar != null) {
            Iterator<T> it = kVar.f141286a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((pu0.b) next).f141183a, str));
            pu0.b bVar = (pu0.b) next;
            if (bVar != null) {
                return bVar;
            }
        }
        List<pu0.b> list = f161007d;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (p005kotlin.jvm.internal.s.g(((pu0.b) obj2).f141183a, str)) {
                obj = obj2;
                break;
            }
        }
        return (pu0.b) obj;
    }

    public static boolean i() {
        ArrayList<pu0.b> arrayList = f161009f;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        for (pu0.b bVar : arrayList) {
            bVar.getClass();
            if (!g22.n.d(og.a.I(bVar))) {
                return true;
            }
            pu0.h hVar = (pu0.h) h0.d0(bVar.f141192j);
            if ((hVar != null ? hVar.f141249m : null) == pu0.h.a.AVAILABLE) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(pu0.b bVar) {
        pu0.k kVar = f161006c;
        if (kVar == null) {
            return false;
        }
        List<pu0.b> list = kVar.f141286a;
        if (list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (p005kotlin.jvm.internal.s.g(((pu0.b) it.next()).f141183a, bVar.f141183a)) {
                return true;
            }
        }
        return false;
    }

    public static void m(List list, pu0.k kVar) {
        f161006c = kVar;
        f161007d = list;
        ArrayList arrayList = new ArrayList();
        pu0.k kVar2 = f161006c;
        if (kVar2 != null) {
            for (pu0.b bVar : kVar2.f141286a) {
                Iterator<T> it = bVar.f141186d.iterator();
                while (it.hasNext()) {
                    List listC = p13.w.c((pu0.f) it.next());
                    j0 j0Var = j0.f134944a;
                    arrayList.add(pu0.b.a(bVar, listC, null, j0Var, j0Var, null, null, 64759));
                }
                Iterator<T> it3 = bVar.f141191i.iterator();
                while (it3.hasNext()) {
                    List listC2 = p13.w.c((pu0.i) it3.next());
                    j0 j0Var2 = j0.f134944a;
                    arrayList.add(pu0.b.a(bVar, j0Var2, null, listC2, j0Var2, null, null, 64759));
                }
                Iterator<T> it4 = bVar.f141192j.iterator();
                while (it4.hasNext()) {
                    List listC3 = p13.w.c((pu0.h) it4.next());
                    j0 j0Var3 = j0.f134944a;
                    arrayList.add(pu0.b.a(bVar, j0Var3, null, j0Var3, listC3, null, null, 64759));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                pu0.b bVar2 = (pu0.b) it5.next();
                for (pu0.f fVar : bVar2.f141186d) {
                    if (!arrayList.isEmpty()) {
                        Iterator it6 = arrayList.iterator();
                        do {
                            if (it6.hasNext()) {
                            }
                        } while (!og.a.B((pu0.b) it6.next()).equals(fVar.f141221b));
                    }
                    arrayList2.add(pu0.b.a(bVar2, p13.w.c(fVar), null, j0.f134944a, null, null, null, 65271));
                }
                for (pu0.i iVar : bVar2.f141191i) {
                    if (!arrayList.isEmpty()) {
                        Iterator it7 = arrayList.iterator();
                        do {
                            if (it7.hasNext()) {
                            }
                        } while (!og.a.K((pu0.b) it7.next()).equals(iVar.f141261b));
                    }
                    arrayList2.add(pu0.b.a(bVar2, j0.f134944a, null, p13.w.c(iVar), null, null, null, 65271));
                }
            }
        }
        List listM0 = h0.M0(arrayList2);
        List listM1 = h0.M0(arrayList);
        boolean z14 = false;
        boolean z15 = kVar != null && kVar.f141287b;
        if (kVar != null && kVar.f141288c) {
            z14 = true;
        }
        f161008e = new pu0.e(listM0, listM1, z15, z14);
    }

    public final Object a(pu0.b bVar, v13.c cVar) throws AddContactException.LiveTrackEmailsLimitReached {
        Object obj;
        Object next;
        Object next2;
        ArrayList arrayList = f161009f;
        if ((arrayList != null ? arrayList.size() : 0) >= 50) {
            throw new AddContactException.LiveTrackEmailsLimitReached();
        }
        pu0.d dVar = bVar.f141188f;
        if (p005kotlin.jvm.internal.s.g(dVar, pu0.d.c.f141214a)) {
            return b(bVar, cVar);
        }
        if (p005kotlin.jvm.internal.s.g(dVar, pu0.d.C2651d.f141215a)) {
            return q(bVar, cVar);
        }
        pu0.b bVarD = d(bVar.f141183a);
        if (bVarD == null) {
            return Boolean.TRUE;
        }
        Iterator<T> it = bVarD.f141186d.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((pu0.f) next).f141221b, og.a.B(bVar)));
        pu0.f fVar = (pu0.f) next;
        if (fVar != null) {
            fVar.f141222c = pu0.g.a.f141234a;
        }
        Iterator<T> it3 = bVarD.f141191i.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!p005kotlin.jvm.internal.s.g(((pu0.i) next2).f141261b, og.a.K(bVar)));
        pu0.i iVar = (pu0.i) next2;
        if (iVar != null) {
            iVar.f141262c = pu0.g.a.f141234a;
        }
        for (Object obj2 : bVarD.f141192j) {
            if (p005kotlin.jvm.internal.s.g(((pu0.h) obj2).f141238b, og.a.I(bVar))) {
                obj = obj2;
                break;
            }
        }
        pu0.h hVar = (pu0.h) obj;
        if (hVar != null) {
            hVar.f141239c = pu0.g.a.f141234a;
        }
        pu0.d.b bVar2 = pu0.d.b.f141213a;
        bVar2.getClass();
        bVarD.f141188f = bVar2;
        return f161004a.p(bVarD, cVar);
    }

    public final Object b(pu0.b bVar, v13.c cVar) throws AddContactException.MaximumContactsReached {
        pu0.k kVar = f161006c;
        if ((kVar != null ? kVar.f141286a.size() : 0) >= 50) {
            throw new AddContactException.MaximumContactsReached();
        }
        pu0.f fVar = (pu0.f) h0.d0(bVar.f141186d);
        if (fVar != null) {
            fVar.f141222c = pu0.g.a.f141234a;
        }
        pu0.i iVar = (pu0.i) h0.d0(bVar.f141191i);
        if (iVar != null) {
            iVar.f141262c = pu0.g.a.f141234a;
        }
        pu0.h hVar = (pu0.h) h0.d0(bVar.f141192j);
        if (hVar != null) {
            hVar.f141239c = pu0.g.a.f141234a;
        }
        return p(pu0.b.a(bVar, bVar.f141186d, pu0.d.b.f141213a, bVar.f141191i, bVar.f141192j, null, null, 64726), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(v13.c cVar) throws Throwable {
        i iVar;
        i0 i0Var;
        i0 i0Var2;
        Object objAwait;
        i0 i0Var3;
        t tVar;
        List list;
        Object objAwait2;
        List list2;
        t tVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f160971g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f160971g = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objE0 = iVar.f160969e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f160971g;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            k kVar = new k(null);
            iVar.f160971g = 1;
            objE0 = ge1.b.e0(bVar, kVar, iVar);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE0);
        } else {
            if (i15 == 2) {
                i0Var = iVar.f160965a;
                o13.r.b(objE0);
                i0Var2 = (i0) objE0;
                iVar.f160965a = null;
                iVar.f160966b = i0Var2;
                iVar.f160967c = this;
                iVar.f160971g = 3;
                objAwait = i0Var.await(iVar);
                if (objAwait != aVar) {
                    i0Var3 = i0Var2;
                    objE0 = objAwait;
                    tVar = this;
                    list = (List) objE0;
                    iVar.f160965a = null;
                    iVar.f160966b = null;
                    iVar.f160967c = tVar;
                    iVar.f160968d = list;
                    iVar.f160971g = 4;
                    objAwait2 = i0Var3.await(iVar);
                    if (objAwait2 != aVar) {
                        list2 = list;
                        objE0 = objAwait2;
                        tVar2 = tVar;
                    }
                }
                return aVar;
            }
            if (i15 == 3) {
                tVar = iVar.f160967c;
                i0Var3 = iVar.f160966b;
                o13.r.b(objE0);
                list = (List) objE0;
                iVar.f160965a = null;
                iVar.f160966b = null;
                iVar.f160967c = tVar;
                iVar.f160968d = list;
                iVar.f160971g = 4;
                objAwait2 = i0Var3.await(iVar);
                if (objAwait2 != aVar) {
                    list2 = list;
                    objE0 = objAwait2;
                    tVar2 = tVar;
                }
                return aVar;
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = iVar.f160968d;
            tVar2 = iVar.f160967c;
            o13.r.b(objE0);
        }
        tVar2.getClass();
        m(list2, (pu0.k) objE0);
        return f161008e;
        i0Var = (i0) objE0;
        x53.c cVar3 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        j jVar = new j(null);
        iVar.f160965a = i0Var;
        iVar.f160971g = 2;
        objE0 = ge1.b.e0(bVar2, jVar, iVar);
        if (objE0 != aVar) {
            i0Var2 = (i0) objE0;
            iVar.f160965a = null;
            iVar.f160966b = i0Var2;
            iVar.f160967c = this;
            iVar.f160971g = 3;
            objAwait = i0Var.await(iVar);
            if (objAwait != aVar) {
                i0Var3 = i0Var2;
                objE0 = objAwait;
                tVar = this;
                list = (List) objE0;
                iVar.f160965a = null;
                iVar.f160966b = null;
                iVar.f160967c = tVar;
                iVar.f160968d = list;
                iVar.f160971g = 4;
                objAwait2 = i0Var3.await(iVar);
                if (objAwait2 != aVar) {
                    list2 = list;
                    objE0 = objAwait2;
                    tVar2 = tVar;
                    tVar2.getClass();
                    m(list2, (pu0.k) objE0);
                    return f161008e;
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(boolean z14, v13.c cVar) {
        l lVar;
        Object next;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f160978c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f160978c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objC = lVar.f160976a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f160978c;
        if (i15 == 0) {
            o13.r.b(objC);
            lVar.f160978c = 1;
            objC = (z14 || f161008e.f141216a.isEmpty() || f161008e.f141217b.isEmpty()) ? c(lVar) : f161008e;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        List<pu0.b> list = ((pu0.e) objC).f141217b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pu0.b bVar = (pu0.b) obj;
            if (!lv0.e.a(bVar.f141186d) && !lv0.e.b(bVar.f141191i)) {
                List<pu0.h> list2 = bVar.f141192j;
                list2.getClass();
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((pu0.h) next).f141239c, pu0.g.a.f141234a));
                if (next != null) {
                }
            }
            arrayList.add(obj);
        }
        f161009f = arrayList;
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f160981c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f160981c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Serializable serializableF = mVar.f160979a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f160981c;
        if (i15 == 0) {
            o13.r.b(serializableF);
            mVar.f160981c = 1;
            serializableF = f(false, mVar);
            if (serializableF == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(serializableF);
        }
        List list = (List) serializableF;
        Object obj2 = null;
        if (list != null) {
            for (Object obj3 : list) {
                if (lv0.e.b(((pu0.b) obj3).f141191i)) {
                    obj2 = obj3;
                    break;
                }
            }
            obj2 = (pu0.b) obj2;
        }
        return Boolean.valueOf(obj2 != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f160984c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f160984c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f160982a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f160984c;
        if (i15 == 0) {
            o13.r.b(obj);
            if (f161008e.f141216a.isEmpty() || f161008e.f141217b.isEmpty()) {
                nVar.f160984c = 1;
                if (c(nVar) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Boolean.valueOf(f161008e.f141219d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f160987c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f160987c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f160985a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f160987c;
        if (i15 == 0) {
            o13.r.b(obj);
            if (f161008e.f141216a.isEmpty() || f161008e.f141217b.isEmpty()) {
                oVar.f160987c = 1;
                if (c(oVar) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Boolean.valueOf(f161008e.f141218c);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(pu0.b bVar, v13.c cVar) {
        p pVar;
        pu0.b bVarD;
        int i14;
        v2 v2Var;
        v2 v2Var2;
        pu0.k kVar;
        Iterable iterable;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i15 = pVar.f160993f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                pVar.f160993f = i15 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objB = pVar.f160991d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = pVar.f160993f;
        t tVar = f161004a;
        uu0.b bVar2 = f161005b;
        pu0.k kVarA = null;
        if (i16 != 0) {
            if (i16 == 1) {
                i14 = pVar.f160990c;
                bVarD = pVar.f160988a;
                o13.r.b(objB);
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var2 = pVar.f160989b;
                o13.r.b(objB);
            }
            kVar = (pu0.k) objB;
            List<pu0.b> list = f161008e.f141216a;
            if (kVar != null) {
                List<pu0.b> list2 = kVar.f141286a;
                pu0.k kVar2 = f161006c;
                iterable = kVar2 != null ? kVar2.f141286a : null;
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                kVarA = pu0.k.a(kVar, h0.C0(list2, iterable));
            }
            tVar.getClass();
            m(list, kVarA);
            v2Var = v2Var2;
            return new v2.b(Boolean.TRUE, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        o13.r.b(objB);
        bVarD = d(bVar.f141183a);
        if (bVarD == null) {
            return new v2.a(new Exception("Recipient not found"), null, null, 6, null);
        }
        for (pu0.f fVar : bVarD.f141186d) {
            if (p005kotlin.jvm.internal.s.g(fVar.f141221b, og.a.B(bVar))) {
                fVar.f141222c = pu0.g.b.f141235a;
            }
        }
        for (pu0.i iVar : bVarD.f141191i) {
            if (p005kotlin.jvm.internal.s.g(iVar.f141261b, og.a.K(bVar))) {
                iVar.f141262c = pu0.g.b.f141235a;
            }
        }
        pu0.d dVar = (lv0.e.a(bVarD.f141186d) || lv0.e.b(bVarD.f141191i)) ? pu0.d.b.f141213a : pu0.d.a.f141212a;
        dVar.getClass();
        bVarD.f141188f = dVar;
        pVar.f160988a = bVarD;
        i14 = 0;
        pVar.f160990c = 0;
        pVar.f160993f = 1;
        objB = bVar2.b(bVarD, pVar);
        if (objB != aVar) {
        }
        return aVar;
        v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        tVar.getClass();
        if (!j(bVarD)) {
            pVar.f160988a = null;
            pVar.f160989b = (v2.b) v2Var;
            pVar.f160990c = i14;
            pVar.f160993f = 2;
            Object objC = bVar2.c(pVar);
            if (objC != aVar) {
                objB = objC;
                v2Var2 = v2Var;
                kVar = (pu0.k) objB;
                List<pu0.b> list3 = f161008e.f141216a;
                if (kVar != null) {
                    List<pu0.b> list4 = kVar.f141286a;
                    pu0.k kVar3 = f161006c;
                    if (kVar3 != null) {
                    }
                    if (iterable == null) {
                        iterable = j0.f134944a;
                    }
                    kVarA = pu0.k.a(kVar, h0.C0(list4, iterable));
                }
                tVar.getClass();
                m(list3, kVarA);
                v2Var = v2Var2;
            }
            return aVar;
        }
        m(f161008e.f141216a, f161006c);
        return new v2.b(Boolean.TRUE, ((v2.b) v2Var).f47387b, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(pu0.b bVar, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f160996c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f160996c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objP = qVar.f160994a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f160996c;
        boolean zBooleanValue = true;
        if (i15 == 0) {
            o13.r.b(objP);
            pu0.b bVarD = d(bVar.f141183a);
            if (bVarD != null) {
                for (pu0.f fVar : bVarD.f141186d) {
                    if (p005kotlin.jvm.internal.s.g(fVar.f141221b, og.a.B(bVar))) {
                        fVar.f141222c = pu0.g.b.f141235a;
                    }
                }
                for (pu0.i iVar : bVarD.f141191i) {
                    if (p005kotlin.jvm.internal.s.g(iVar.f141261b, og.a.K(bVar))) {
                        iVar.f141262c = pu0.g.b.f141235a;
                    }
                }
                for (pu0.h hVar : bVarD.f141192j) {
                    if (p005kotlin.jvm.internal.s.g(hVar.f141238b, og.a.I(bVar))) {
                        hVar.f141239c = pu0.g.b.f141235a;
                    }
                }
                pu0.d dVar = (lv0.e.a(bVarD.f141186d) || lv0.e.b(bVarD.f141191i)) ? pu0.d.b.f141213a : pu0.d.a.f141212a;
                dVar.getClass();
                bVarD.f141188f = dVar;
                qVar.f160996c = 1;
                objP = f161004a.p(bVarD, qVar);
                if (objP == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objP);
        zBooleanValue = ((Boolean) objP).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(pu0.b bVar, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f161000d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f161000d = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objE = rVar.f160998b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f161000d;
        if (i15 == 0) {
            o13.r.b(objE);
            if (bVar == null) {
                return Boolean.TRUE;
            }
            rVar.f160997a = bVar;
            rVar.f161000d = 1;
            objE = f161005b.e(bVar, rVar);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = rVar.f160997a;
            o13.r.b(objE);
        }
        List list = (List) objE;
        if (list == null) {
            return Boolean.FALSE;
        }
        if (j(bVar)) {
            m(f161008e.f141216a, f161006c);
        } else {
            List<pu0.b> list2 = f161008e.f141216a;
            pu0.k kVar = f161006c;
            m(list2, kVar != null ? pu0.k.a(kVar, h0.C0(kVar.f141286a, list)) : null);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
    
        if (r14 == r1) goto L83;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(pu0.b bVar, v13.c cVar) throws AddContactException.MaximumContactsReached {
        s sVar;
        boolean z14;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f161003c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f161003c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objP = sVar.f161001a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f161003c;
        if (i15 == 0) {
            o13.r.b(objP);
            pu0.k kVar = f161006c;
            pu0.b bVar2 = null;
            Object obj2 = null;
            if (kVar != null) {
                for (Object obj3 : kVar.f141286a) {
                    pu0.b bVar3 = (pu0.b) obj3;
                    bVar3.getClass();
                    bVar.getClass();
                    if (p005kotlin.jvm.internal.s.g(bVar3.f141184b, bVar.f141184b) && p005kotlin.jvm.internal.s.g(bVar3.f141185c, bVar.f141185c)) {
                        List<pu0.i> list = bVar3.f141191i;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            String str = ((pu0.i) it.next()).f141261b;
                            linkedHashSet.add(str != null ? d53.w.O(str, "+1") : null);
                        }
                        List<pu0.i> list2 = bVar.f141191i;
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            String str2 = ((pu0.i) it3.next()).f141261b;
                            linkedHashSet2.add(str2 != null ? d53.w.O(str2, "+1") : null);
                        }
                        if (h0.h0(linkedHashSet, linkedHashSet2).isEmpty()) {
                            List<pu0.f> list3 = bVar3.f141186d;
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            Iterator<T> it4 = list3.iterator();
                            while (true) {
                                String str3 = "";
                                if (!it4.hasNext()) {
                                    break;
                                }
                                String str4 = ((pu0.f) it4.next()).f141221b;
                                if (str4 != null) {
                                    str3 = str4;
                                }
                                linkedHashSet3.add(str3);
                            }
                            List<pu0.f> list4 = bVar.f141186d;
                            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                            Iterator<T> it5 = list4.iterator();
                            while (it5.hasNext()) {
                                String str5 = ((pu0.f) it5.next()).f141221b;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                linkedHashSet4.add(str5);
                            }
                            z14 = !h0.h0(linkedHashSet3, linkedHashSet4).isEmpty();
                        } else {
                            z14 = true;
                        }
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        obj2 = obj3;
                        break;
                    }
                }
                bVar2 = (pu0.b) obj2;
            }
            if (bVar2 != null) {
                pu0.f fVar = (pu0.f) h0.d0(bVar.f141186d);
                if (fVar != null) {
                    fVar.f141222c = pu0.g.a.f141234a;
                    bVar2.f141186d = h0.D0(bVar2.f141186d, fVar);
                }
                pu0.i iVar = (pu0.i) h0.d0(bVar.f141191i);
                if (iVar != null) {
                    iVar.f141262c = pu0.g.a.f141234a;
                    bVar2.f141191i = h0.D0(bVar2.f141191i, iVar);
                }
                pu0.h hVar = (pu0.h) h0.d0(bVar.f141192j);
                if (hVar != null) {
                    hVar.f141239c = pu0.g.a.f141234a;
                    bVar2.f141192j = h0.D0(bVar2.f141192j, hVar);
                }
                pu0.d.b bVar4 = pu0.d.b.f141213a;
                bVar4.getClass();
                bVar2.f141188f = bVar4;
                sVar.f161003c = 1;
                objP = f161004a.p(bVar2, sVar);
            } else {
                sVar.f161003c = 2;
                Object objB = b(bVar, sVar);
                if (objB != obj) {
                    return objB;
                }
            }
            return obj;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objP);
                return objP;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objP);
        Boolean bool = (Boolean) objP;
        bool.booleanValue();
        return bool;
    }
}
