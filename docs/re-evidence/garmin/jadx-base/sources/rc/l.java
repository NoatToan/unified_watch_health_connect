package rc;

import cw1.k0;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k23.p;
import lc.q0;
import o62.s0;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final q0<Object> a(k63.e eVar, Map<p, ? extends q0<?>> map) {
        Object next;
        q0<?> q0VarA;
        boolean zEquals;
        Iterator<T> it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p pVar = (p) next;
            eVar.getClass();
            pVar.getClass();
            if (eVar.b() != pVar.getF16114d()) {
                zEquals = false;
            } else {
                i63.c cVarM = y.M(p63.h.f136264a, pVar);
                if (cVarM == null) {
                    n23.j.t("Cannot find KSerializer for [", eVar.getF103221c(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                    return null;
                }
                zEquals = eVar.equals(cVarM.getF158591b());
            }
        } while (!zEquals);
        p pVar2 = (p) next;
        q0<?> bVar = pVar2 != null ? map.get(pVar2) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar == null) {
            eVar.getClass();
            f fVarA = g.a(eVar);
            int[] iArr = g.a.f151836a;
            switch (iArr[fVarA.ordinal()]) {
                case 1:
                    e.f151801a.getClass();
                    q0VarA = e.f151808h;
                    bVar = q0VarA;
                    break;
                case 2:
                    q0VarA = q0.f111851p;
                    bVar = q0VarA;
                    break;
                case 3:
                    q0VarA = q0.f111838c;
                    bVar = q0VarA;
                    break;
                case 4:
                    q0VarA = q0.f111848m;
                    bVar = q0VarA;
                    break;
                case 5:
                    e.f151801a.getClass();
                    q0VarA = e.f151804d;
                    bVar = q0VarA;
                    break;
                case 6:
                    q0VarA = q0.f111845j;
                    bVar = q0VarA;
                    break;
                case 7:
                    q0VarA = q0.f111842g;
                    bVar = q0VarA;
                    break;
                case 8:
                    q0.b bVar2 = q0.f111837b;
                    Class<?> clsA = h.a(eVar);
                    bVar2.getClass();
                    q0VarA = q0.b.a(clsA, false);
                    if (q0VarA == null) {
                        q0VarA = o.f151858s;
                    }
                    bVar = q0VarA;
                    break;
                case 9:
                    e.f151801a.getClass();
                    q0VarA = e.f151802b;
                    bVar = q0VarA;
                    break;
                case 10:
                    e.f151801a.getClass();
                    q0VarA = e.f151803c;
                    bVar = q0VarA;
                    break;
                case 11:
                    e.f151801a.getClass();
                    q0VarA = e.f151805e;
                    bVar = q0VarA;
                    break;
                case 12:
                    e.f151801a.getClass();
                    q0VarA = e.f151806f;
                    bVar = q0VarA;
                    break;
                case 13:
                    e.f151801a.getClass();
                    q0VarA = e.f151807g;
                    bVar = q0VarA;
                    break;
                case 14:
                    q0VarA = q0.f111840e;
                    bVar = q0VarA;
                    break;
                case 15:
                    q0VarA = q0.f111849n;
                    bVar = q0VarA;
                    break;
                case 16:
                    e.f151801a.getClass();
                    q0VarA = e.f151811k;
                    bVar = q0VarA;
                    break;
                case 17:
                    q0VarA = q0.f111846k;
                    bVar = q0VarA;
                    break;
                case 18:
                    q0VarA = q0.f111843h;
                    bVar = q0VarA;
                    break;
                case 19:
                    int i14 = iArr[g.a(eVar.h(0)).ordinal()];
                    if (i14 == 1) {
                        q0VarA = q0.f111852q;
                    } else if (i14 != 2) {
                        q0VarA = o.f151858s;
                    } else {
                        e.f151801a.getClass();
                        q0VarA = e.f151809i;
                    }
                    bVar = q0VarA;
                    break;
                case 20:
                    switch (iArr[g.a(eVar.h(0)).ordinal()]) {
                        case 1:
                            q0VarA = q0.f111853r;
                            bVar = q0VarA;
                            break;
                        case 2:
                            e.f151801a.getClass();
                            q0VarA = e.f151810j;
                            bVar = q0VarA;
                            break;
                        case 3:
                            q0VarA = q0.f111841f;
                            bVar = q0VarA;
                            break;
                        case 4:
                            q0VarA = q0.f111850o;
                            bVar = q0VarA;
                            break;
                        case 5:
                            e.f151801a.getClass();
                            q0VarA = e.f151812l;
                            bVar = q0VarA;
                            break;
                        case 6:
                            q0VarA = q0.f111847l;
                            bVar = q0VarA;
                            break;
                        case 7:
                            q0VarA = q0.f111844i;
                            bVar = q0VarA;
                            break;
                        case 8:
                            bVar = new b<>(h.a(eVar.h(0)));
                            break;
                        default:
                            q0VarA = o.f151858s;
                            bVar = q0VarA;
                            break;
                    }
                    break;
                case 21:
                    Class<?> clsA2 = h.a(eVar);
                    if (!Enum.class.isAssignableFrom(clsA2)) {
                        q0VarA = o.f151858s;
                        bVar = q0VarA;
                    } else {
                        bVar = new c<>(clsA2);
                    }
                    break;
                default:
                    q0VarA = o.f151858s;
                    bVar = q0VarA;
                    break;
            }
        }
        if (s.g(bVar, o.f151858s)) {
            return null;
        }
        bVar.getClass();
        return bVar;
    }

    public static final <T> int b(i63.c<T> cVar) {
        int iHashCode = cVar.getF158591b().getF103221c().hashCode();
        int f116985c = cVar.getF158591b().getF103235c();
        for (int i14 = 0; i14 < f116985c; i14++) {
            iHashCode = (iHashCode * 31) + cVar.getF158591b().d(i14).hashCode();
        }
        return iHashCode;
    }

    public static final ArrayList c(i63.c cVar, Map map) {
        map.getClass();
        if (cVar instanceof i63.e) {
            org.apache.commons.lang3.e.l("Cannot generate NavArguments for polymorphic serializer ", cVar, ". Arguments can only be generated from concrete classes or objects.");
            return null;
        }
        int f116985c = cVar.getF158591b().getF103235c();
        ArrayList arrayList = new ArrayList(f116985c);
        int i14 = 0;
        while (i14 < f116985c) {
            String strD = cVar.getF158591b().d(i14);
            i63.c cVar2 = cVar;
            arrayList.add(gl1.d.M(new k0(cVar2, i14, map, strD, 10), strD));
            i14++;
            cVar = cVar2;
        }
        return arrayList;
    }

    public static final <T> String d(i63.c<T> cVar, Map<p, ? extends q0<?>> map, String str) {
        map.getClass();
        if (cVar instanceof i63.e) {
            StringBuilder sb3 = new StringBuilder("Cannot generate route pattern from polymorphic class ");
            k23.d dVarZ = ge1.b.z(((i63.e) cVar).getF158591b());
            throw new IllegalArgumentException(am.j.o(dVarZ != null ? dVarZ.D() : null, ". Routes can only be generated from concrete classes or objects.", sb3));
        }
        i iVar = str != null ? new i(str, cVar) : new i(cVar);
        s0 s0Var = new s0(iVar, 17);
        int f116985c = cVar.getF158591b().getF103235c();
        for (int i14 = 0; i14 < f116985c; i14++) {
            String strD = cVar.getF158591b().d(i14);
            q0<Object> q0VarA = a(cVar.getF158591b().h(i14), map);
            if (q0VarA == null) {
                vb.h.s(g(strD, cVar.getF158591b().h(i14).getF103221c(), cVar.getF158591b().getF103221c(), map.toString()));
                return null;
            }
            s0Var.invoke(Integer.valueOf(i14), strD, q0VarA);
        }
        return iVar.f151838b + iVar.f151839c + iVar.f151840d;
    }

    public static final String e(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        i63.c cVarJ = y.J(p005kotlin.jvm.internal.s0.f105811a.b(obj.getClass()));
        Map<String, List<String>> mapG = new k(cVarJ, linkedHashMap).G(obj);
        i iVar = new i(cVarJ);
        o72.b bVar = new o72.b(21, mapG, iVar);
        int f116985c = cVarJ.getF158591b().getF103235c();
        for (int i14 = 0; i14 < f116985c; i14++) {
            String strD = cVarJ.getF158591b().d(i14);
            q0 q0Var = (q0) linkedHashMap.get(strD);
            if (q0Var == null) {
                e0.n(o2.c.c(']', "Cannot locate NavType for argument [", strD));
                return null;
            }
            bVar.invoke(Integer.valueOf(i14), strD, q0Var);
        }
        return iVar.f151838b + iVar.f151839c + iVar.f151840d;
    }

    public static final boolean f(k63.e eVar) {
        eVar.getClass();
        return s.g(eVar.getF103234b(), k63.m.a.f103253a) && eVar.getF116965m() && eVar.getF103235c() == 1;
    }

    public static final String g(String str, String str2, String str3, String str4) {
        return e0.h(p6.b.i("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }
}
