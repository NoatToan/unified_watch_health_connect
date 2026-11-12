package ei;

import com.apollographql.apollo3.exception.CacheMissException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.t0;
import p13.u0;
import p13.y;
import vh.e0;
import vh.f0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvh/n0$a;", "D", "invoke", "()Lvh/n0$a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class j extends w implements e23.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0<Object> f64122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f64123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f64124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci.a f64125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n0<Object> n0Var, z zVar, h hVar, ci.a aVar) {
        super(0);
        this.f64122a = n0Var;
        this.f64123b = zVar;
        this.f64124c = hVar;
        this.f64125d = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        o13.p pVar;
        h hVar = this.f64124c;
        di.f fVar = (di.f) hVar.f64118e.getValue();
        ci.e eVar = hVar.f64115b;
        n0<Object> n0Var = this.f64122a;
        n0Var.getClass();
        z zVar = this.f64123b;
        zVar.getClass();
        fVar.getClass();
        ci.a aVar = this.f64125d;
        aVar.getClass();
        ci.b.f27594b.getClass();
        di.a aVar2 = new di.a(fVar, ci.b.f27596d.f27597a, f0.a(n0Var, zVar), eVar, aVar, n0Var.b().f178375f, n0Var.b().f178371b.a().f178393a);
        di.a.b bVar = new di.a.b(aVar2.f59675b, j0.f134944a, aVar2.f59679f, aVar2.f59680g);
        ArrayList arrayList = aVar2.f59682i;
        arrayList.add(bVar);
        while (true) {
            boolean zIsEmpty = arrayList.isEmpty();
            LinkedHashMap linkedHashMap = aVar2.f59681h;
            if (zIsEmpty) {
                n0<Object> n0Var2 = n0Var;
                j0 j0Var = j0.f134944a;
                Object objC = aVar2.c(linkedHashMap.get(j0Var), j0Var);
                objC.getClass();
                return (n0.a) ((e0.a) n0Var2.a().b(new zh.h((Map) objC, null, 2, null), zVar));
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((di.a.b) it.next()).f59684a);
            }
            Collection collectionB = aVar2.f59674a.b(arrayList2, aVar2.f59678e);
            int iA = t0.a(y.r(collectionB, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
            for (Object obj : collectionB) {
                linkedHashMap2.put(((ci.n) obj).f27616a, obj);
            }
            List<di.a.b> listB1 = h0.b1(arrayList);
            arrayList.clear();
            for (di.a.b bVar2 : listB1) {
                String str = bVar2.f59684a;
                String str2 = bVar2.f59684a;
                List<Object> list = bVar2.f59685b;
                Object nVar = linkedHashMap2.get(str);
                if (nVar == null) {
                    ci.b.f27594b.getClass();
                    if (!str2.equals(ci.b.f27596d.f27597a)) {
                        throw new CacheMissException(str2, null, false, 6, null);
                    }
                    k0 k0Var = k0.f134949a;
                    k0Var.getClass();
                    list = list;
                    nVar = new ci.n(str2, k0Var, null, 4, null);
                }
                List<vh.w> list2 = bVar2.f59686c;
                String str3 = bVar2.f59687d;
                ci.n nVar2 = (ci.n) nVar;
                Object obj2 = nVar2.get("__typename");
                String str4 = obj2 instanceof String ? (String) obj2 : null;
                di.a.C1275a c1275a = new di.a.C1275a();
                di.a.a(list2, str3, str4, c1275a);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : c1275a.f59683a) {
                    vh.q qVar = (vh.q) obj3;
                    String str5 = qVar.f178372c;
                    if (str5 == null) {
                        str5 = qVar.f178370a;
                    }
                    o13.p pVar2 = new o13.p(str5, qVar.f178373d);
                    Object arrayList3 = linkedHashMap3.get(pVar2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(pVar2, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                Collection<List> collectionValues = linkedHashMap3.values();
                ArrayList<vh.q> arrayList4 = new ArrayList(y.r(collectionValues, 10));
                for (List list3 : collectionValues) {
                    vh.q qVar2 = (vh.q) h0.b0(list3);
                    qVar2.getClass();
                    vh.q.a aVar3 = new vh.q.a(qVar2);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        d0.v(arrayList5, ((vh.q) it3.next()).f178375f);
                    }
                    aVar3.f178381f = arrayList5;
                    arrayList4.add(aVar3.c());
                }
                ArrayList arrayList6 = new ArrayList();
                for (vh.q qVar3 : arrayList4) {
                    e0.b bVar3 = aVar2.f59676c;
                    boolean zO = zf.b.O(qVar3, bVar3.f178306a);
                    String str6 = qVar3.f178370a;
                    n0<Object> n0Var3 = n0Var;
                    String str7 = qVar3.f178372c;
                    if (zO) {
                        pVar = null;
                    } else {
                        Object objA = aVar2.f59677d.a(qVar3, bVar3, (Map) nVar, nVar2.f27616a);
                        aVar2.b(objA, h0.D0(list, str7 == null ? str6 : str7), qVar3.f178375f, qVar3.f178371b.a().f178393a);
                        if (str7 != null) {
                            str6 = str7;
                        }
                        pVar = new o13.p(str6, objA);
                    }
                    if (pVar != null) {
                        arrayList6.add(pVar);
                    }
                    n0Var = n0Var3;
                    arrayList = arrayList;
                }
                linkedHashMap.put(list, u0.l(arrayList6));
            }
        }
    }
}
