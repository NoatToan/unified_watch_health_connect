package ek1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;
import p13.k0;
import z10.g3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lek1/i;", "", "Lnk1/g;", "repository", "Lp92/o;", "garminConsent", "Lek1/h;", "getCapabilitiesPermissionsUseCase", "<init>", "(Lnk1/g;Lp92/o;Lek1/h;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f64449c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk1.g f64450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p92.o f64451b;

    static {
        new a(null);
    }

    public i(nk1.g gVar, p92.o oVar, h hVar) {
        gVar.getClass();
        oVar.getClass();
        hVar.getClass();
        this.f64450a = gVar;
        this.f64451b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a1 A[EDGE_INSN: B:118:0x01a1->B:68:0x01a1 BREAK  A[LOOP:2: B:62:0x0190->B:66:0x019d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:66:0x019d A[LOOP:2: B:62:0x0190->B:66:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0232  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v0, types: [ek1.i] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    public final Object a(hk1.r rVar, boolean z14, e23.l lVar, v13.c cVar) {
        k kVar;
        e23.l lVar2;
        hk1.r rVar2;
        boolean z15;
        String str;
        ArrayList arrayList;
        String str2;
        e23.l lVar3;
        List list;
        ?? arrayList2;
        boolean z16;
        ?? r14;
        boolean zContains;
        List list2;
        g3[] g3VarArrValues;
        int length;
        int i14;
        g3 g3Var;
        String str3;
        String str4;
        hk1.r rVar3;
        List list3;
        ?? r15;
        s92.g gVar;
        HashMap map;
        Iterator it;
        String consumerCapability;
        Iterator it3;
        Object next;
        hk1.d dVar;
        boolean zContains2;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i15 = kVar.f64460i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f64460i = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objB = kVar.f64458g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar.f64460i;
        if (i16 == 0) {
            o13.r.b(objB);
            i2.f36769a.getClass();
            i2.a.a(a2.GENERAL, "GetThirdPartyAppDataUseCase fetchThirdPartyAppData for " + rVar);
            String consumerKey = rVar.getConsumerKey();
            if (consumerKey == null) {
                return new v2.a(new Exception("Consumer key is null"), null, hk1.l.INVALID_REQUEST.f84172a, 2, null);
            }
            kVar.f64452a = rVar;
            lVar2 = lVar;
            kVar.f64453b = lVar2;
            kVar.f64454c = consumerKey;
            kVar.f64457f = z14;
            kVar.f64460i = 1;
            nk1.g gVar2 = this.f64450a;
            Object objJ = f0.J(gVar2, new nk1.j(gVar2, consumerKey, null), kVar);
            if (objJ != aVar) {
                rVar2 = rVar;
                z15 = z14;
                str = consumerKey;
                objB = objJ;
            }
            return aVar;
        }
        if (i16 == 1) {
            z15 = kVar.f64457f;
            String str5 = kVar.f64454c;
            e23.l lVar4 = kVar.f64453b;
            rVar2 = kVar.f64452a;
            o13.r.b(objB);
            str = str5;
            lVar2 = lVar4;
        } else {
            if (i16 == 2) {
                z15 = kVar.f64457f;
                List list4 = kVar.f64455d;
                str2 = kVar.f64454c;
                lVar3 = kVar.f64453b;
                rVar2 = kVar.f64452a;
                o13.r.b(objB);
                list = list4;
                List list5 = (List) objB;
                z16 = z15;
                r14 = list5;
                list2 = list;
                lVar2 = lVar3;
                str = str2;
                lVar2.invoke(r14);
                g3.f201014c.getClass();
                str.getClass();
                g3VarArrValues = g3.values();
                length = g3VarArrValues.length;
                i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        g3Var = null;
                        break;
                    }
                    g3Var = g3VarArrValues[i14];
                    if (g3Var.f201017b.contains(str)) {
                        break;
                    }
                    i14++;
                }
                if (g3Var != null || (str3 = g3Var.f201016a) == null) {
                    str3 = q92.x.DI_CONNECT_THIRDPARTY.f143819a;
                }
                kVar.f64452a = rVar2;
                kVar.f64453b = null;
                kVar.f64454c = str;
                kVar.f64455d = list2;
                kVar.f64456e = r14;
                kVar.f64457f = z16;
                kVar.f64460i = 3;
                p92.o oVar = p92.o.f136619a;
                objB = this.f64451b.d(str3, Locale.getDefault(), kVar);
                if (objB != aVar) {
                    str4 = str;
                    rVar3 = rVar2;
                    list3 = list2;
                    r15 = r14;
                }
                return aVar;
            }
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list6 = kVar.f64456e;
            List list7 = kVar.f64455d;
            str4 = kVar.f64454c;
            rVar3 = kVar.f64452a;
            o13.r.b(objB);
            r15 = list6;
            list3 = list7;
        }
        gVar = (s92.g) objB;
        if (gVar == null) {
            return new v2.a(new Exception(fb1.c.n("Consent text not found for consumerKey: ", str4)), null, hk1.l.SERVER_ERROR.f84172a, 2, null);
        }
        map = new HashMap();
        if (list3 != null) {
            it = list3.iterator();
            while (it.hasNext()) {
                consumerCapability = ((hk1.e) it.next()).getConsumerCapability();
                if (consumerCapability != null) {
                    hk1.d.f84132d.getClass();
                    it3 = hk1.d.f84139k.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!p005kotlin.jvm.internal.s.g(((hk1.d) next).f84140a, consumerCapability));
                    dVar = (hk1.d) next;
                    if (dVar != null) {
                        if (r15 != 0) {
                            zContains2 = r15.contains(consumerCapability);
                        } else {
                            zContains2 = false;
                        }
                        map.put(dVar, Boolean.valueOf(zContains2));
                    }
                }
            }
        }
        TreeMap treeMap = new TreeMap(new j());
        treeMap.putAll(map);
        return new v2.b(new hk1.s(rVar3, treeMap, gVar), 200, null, null, 12, null);
        v2 v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                v2.a aVar2 = (v2.a) v2Var;
                return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
            }
            u0.r();
            return null;
        }
        a2 a2Var = a2.GENERAL;
        Object obj = ((v2.b) v2Var).f47386a;
        i2.f36769a.getClass();
        i2.a.a(a2Var, "GetThirdPartyAppDataUseCase " + rVar2 + " capabilities[" + obj + "]");
        hk1.g gVar3 = (hk1.g) obj;
        List<String> listD = gVar3.d();
        List<hk1.e> listB = gVar3.b();
        if (listB != null) {
            arrayList = new ArrayList();
            for (Object obj2 : listB) {
                hk1.e eVar = (hk1.e) obj2;
                if (listD != null) {
                    String consumerCapability2 = eVar.getConsumerCapability();
                    if (consumerCapability2 == null) {
                        consumerCapability2 = "";
                    }
                    zContains = listD.contains(consumerCapability2);
                } else {
                    zContains = false;
                }
                if (!zContains) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (z15) {
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    String consumerCapability3 = ((hk1.e) it4.next()).getConsumerCapability();
                    if (p005kotlin.jvm.internal.s.g(consumerCapability3, hk1.d.f84137i.f84140a)) {
                        consumerCapability3 = null;
                    }
                    if (consumerCapability3 != null) {
                        arrayList2.add(consumerCapability3);
                    }
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            ?? r17 = arrayList2;
            z16 = z15;
            r14 = r17;
            list2 = arrayList;
            lVar2.invoke(r14);
            g3.f201014c.getClass();
            str.getClass();
            g3VarArrValues = g3.values();
            length = g3VarArrValues.length;
            i14 = 0;
            while (true) {
                if (i14 >= length) {
                    g3Var = null;
                    break;
                }
                g3Var = g3VarArrValues[i14];
                if (g3Var.f201017b.contains(str)) {
                    break;
                    break;
                }
                i14++;
            }
            if (g3Var != null) {
                str3 = q92.x.DI_CONNECT_THIRDPARTY.f143819a;
            } else {
                str3 = q92.x.DI_CONNECT_THIRDPARTY.f143819a;
            }
            kVar.f64452a = rVar2;
            kVar.f64453b = null;
            kVar.f64454c = str;
            kVar.f64455d = list2;
            kVar.f64456e = r14;
            kVar.f64457f = z16;
            kVar.f64460i = 3;
            p92.o oVar2 = p92.o.f136619a;
            objB = this.f64451b.d(str3, Locale.getDefault(), kVar);
            if (objB != aVar) {
                str4 = str;
                rVar3 = rVar2;
                list3 = list2;
                r15 = r14;
                gVar = (s92.g) objB;
                if (gVar == null) {
                    return new v2.a(new Exception(fb1.c.n("Consent text not found for consumerKey: ", str4)), null, hk1.l.SERVER_ERROR.f84172a, 2, null);
                }
                map = new HashMap();
                if (list3 != null) {
                    it = list3.iterator();
                    while (it.hasNext()) {
                        consumerCapability = ((hk1.e) it.next()).getConsumerCapability();
                        if (consumerCapability != null) {
                            hk1.d.f84132d.getClass();
                            it3 = hk1.d.f84139k.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (!p005kotlin.jvm.internal.s.g(((hk1.d) next).f84140a, consumerCapability));
                            dVar = (hk1.d) next;
                            if (dVar != null) {
                                if (r15 != 0) {
                                    zContains2 = r15.contains(consumerCapability);
                                } else {
                                    zContains2 = false;
                                }
                                map.put(dVar, Boolean.valueOf(zContains2));
                            }
                        }
                    }
                }
                TreeMap treeMap2 = new TreeMap(new j());
                treeMap2.putAll(map);
                return new v2.b(new hk1.s(rVar3, treeMap2, gVar), 200, null, null, 12, null);
            }
        } else {
            kVar.f64452a = rVar2;
            kVar.f64453b = lVar2;
            kVar.f64454c = str;
            kVar.f64455d = arrayList;
            kVar.f64457f = z15;
            kVar.f64460i = 2;
            objB = b(str, kVar);
            if (objB != aVar) {
                str2 = str;
                lVar3 = lVar2;
                list = arrayList;
                List list8 = (List) objB;
                z16 = z15;
                r14 = list8;
                list2 = list;
                lVar2 = lVar3;
                str = str2;
                lVar2.invoke(r14);
                g3.f201014c.getClass();
                str.getClass();
                g3VarArrValues = g3.values();
                length = g3VarArrValues.length;
                i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        g3Var = null;
                        break;
                    }
                    g3Var = g3VarArrValues[i14];
                    if (g3Var.f201017b.contains(str)) {
                        break;
                        break;
                    }
                    i14++;
                }
                if (g3Var != null) {
                    str3 = q92.x.DI_CONNECT_THIRDPARTY.f143819a;
                } else {
                    str3 = q92.x.DI_CONNECT_THIRDPARTY.f143819a;
                }
                kVar.f64452a = rVar2;
                kVar.f64453b = null;
                kVar.f64454c = str;
                kVar.f64455d = list2;
                kVar.f64456e = r14;
                kVar.f64457f = z16;
                kVar.f64460i = 3;
                p92.o oVar3 = p92.o.f136619a;
                objB = this.f64451b.d(str3, Locale.getDefault(), kVar);
                if (objB != aVar) {
                    str4 = str;
                    rVar3 = rVar2;
                    list3 = list2;
                    r15 = r14;
                    gVar = (s92.g) objB;
                    if (gVar == null) {
                        return new v2.a(new Exception(fb1.c.n("Consent text not found for consumerKey: ", str4)), null, hk1.l.SERVER_ERROR.f84172a, 2, null);
                    }
                    map = new HashMap();
                    if (list3 != null) {
                        it = list3.iterator();
                        while (it.hasNext()) {
                            consumerCapability = ((hk1.e) it.next()).getConsumerCapability();
                            if (consumerCapability != null) {
                                hk1.d.f84132d.getClass();
                                it3 = hk1.d.f84139k.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it3.next();
                                } while (!p005kotlin.jvm.internal.s.g(((hk1.d) next).f84140a, consumerCapability));
                                dVar = (hk1.d) next;
                                if (dVar != null) {
                                    if (r15 != 0) {
                                        zContains2 = r15.contains(consumerCapability);
                                    } else {
                                        zContains2 = false;
                                    }
                                    map.put(dVar, Boolean.valueOf(zContains2));
                                }
                            }
                        }
                    }
                    TreeMap treeMap3 = new TreeMap(new j());
                    treeMap3.putAll(map);
                    return new v2.b(new hk1.s(rVar3, treeMap3, gVar), 200, null, null, 12, null);
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, v13.c cVar) {
        l lVar;
        Object next;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f64464d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f64464d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objJ = lVar.f64462b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f64464d;
        if (i15 == 0) {
            o13.r.b(objJ);
            lVar.f64461a = str;
            lVar.f64464d = 1;
            nk1.g gVar = this.f64450a;
            objJ = f0.J(gVar, new nk1.k(gVar, null), lVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = lVar.f64461a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String string = ((v2.a) v2Var).f47383a.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "GetThirdPartyAppDataUseCase", string);
            return j0.f134944a;
        }
        Iterator it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((hk1.h) next).getConsumerKey(), str));
        hk1.h hVar = (hk1.h) next;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public final Object c(hk1.r rVar, boolean z14, e23.l lVar, v13.c cVar) {
        if (!rVar.getIsAuthProhibited()) {
            return a(rVar, z14, lVar, cVar);
        }
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return new v2.b(new hk1.s(rVar, k0Var, null), 200, null, null, 12, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lek1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
