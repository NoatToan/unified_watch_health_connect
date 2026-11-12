package n23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122396a;

        static {
            int[] iArr = new int[c33.b0.values().length];
            try {
                iArr[c33.b0.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c33.b0.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c33.b0.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f122396a = iArr;
        }
    }

    public static final k23.d<?> a(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        Class<?> clsG = s4.g(classLoader, d(str), 0);
        if (clsG != null) {
            return p005kotlin.jvm.internal.s0.f105811a.b(clsG);
        }
        return null;
    }

    public static final Annotation b(c33.d dVar, ClassLoader classLoader) {
        String str = dVar.f24169a;
        Class<?> clsG = s4.g(classLoader, d(str), 0);
        if (clsG == null) {
            throw new w3("Annotation class not found: ".concat(str));
        }
        Map<String, c33.e> map = dVar.f24170b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), c((c33.e) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) o23.f.b(clsG, linkedHashMap);
    }

    public static final Object c(c33.e eVar, String str, String str2, ClassLoader classLoader) {
        List<k23.k> parameters;
        if (eVar instanceof c33.e.a) {
            return b(((c33.e.a) eVar).f24176a, classLoader);
        }
        int i14 = 0;
        if (eVar instanceof c33.e.b) {
            c33.e.b bVar = (c33.e.b) eVar;
            String str3 = bVar.f24177a;
            k23.d<?> dVarA = a(classLoader, str3);
            if (dVarA == null) {
                throw new w3("Unresolved class: ".concat(str3));
            }
            Class<?> clsU = dh.b.u(dVarA);
            int i15 = bVar.f24178b;
            while (i14 < i15) {
                clsU = s4.c(clsU);
                i14++;
            }
            return clsU;
        }
        Object obj = null;
        if (eVar instanceof c33.e.c) {
            k23.d<?> dVarA2 = a(classLoader, str);
            if (dVarA2 != null) {
                if (!dh.b.u(dVarA2).isAnnotation()) {
                    dVarA2 = null;
                }
                if (dVarA2 != null) {
                    k23.g gVar = (k23.g) p13.h0.J0(dVarA2.n());
                    if (gVar != null && (parameters = gVar.getParameters()) != null) {
                        Iterator<T> it = parameters.iterator();
                        boolean z14 = false;
                        Object obj2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                if (!z14) {
                                    break;
                                }
                                break;
                            }
                            Object next = it.next();
                            if (p005kotlin.jvm.internal.s.g(((k23.k) next).getName(), str2)) {
                                if (!z14) {
                                    z14 = true;
                                    obj2 = next;
                                }
                            }
                            obj2 = null;
                            break;
                        }
                        k23.k kVar = (k23.k) obj2;
                        if (kVar != null) {
                            b53.l type = kVar.getType();
                            k23.e f105782a = type.getF105782a();
                            k23.d dVar = f105782a instanceof k23.d ? (k23.d) f105782a : null;
                            if (dVar == null) {
                                lc.u0.t(type, "Array parameter type is not a class: ");
                                return null;
                            }
                            Class clsU2 = dh.b.u(dVar);
                            Class<?> componentType = p005kotlin.jvm.internal.s.g(clsU2.getComponentType(), k23.d.class) ? Class.class : clsU2.getComponentType();
                            List<c33.e> list = ((c33.e.c) eVar).f24180a;
                            Object objNewInstance = Array.newInstance(componentType, list.size());
                            Iterator<T> it3 = list.iterator();
                            while (it3.hasNext()) {
                                Array.set(objNewInstance, i14, c((c33.e) it3.next(), str, null, classLoader));
                                i14++;
                            }
                            objNewInstance.getClass();
                            return objNewInstance;
                        }
                    }
                    throw new w3(androidx.room.a0.j("No parameter ", str2, " found in annotation constructor of ", str));
                }
            }
            throw new w3("Not an annotation class: ".concat(str));
        }
        if (!(eVar instanceof c33.e.h)) {
            if (!(eVar instanceof c33.e.k)) {
                if (eVar instanceof c33.e.l) {
                    return ((c33.e.l) eVar).a();
                }
                lc.u0.r();
                return null;
            }
            String str4 = ((c33.e.k) eVar).f24189a;
            Class<?> clsG = s4.g(classLoader, d(str4), 0);
            if (clsG != null) {
                return clsG;
            }
            throw new w3("Unresolved class: ".concat(str4));
        }
        c33.e.h hVar = (c33.e.h) eVar;
        String str5 = hVar.f24186b;
        String str6 = hVar.f24185a;
        Class<?> clsG2 = s4.g(classLoader, d(str6), 0);
        if (clsG2 == null) {
            throw new w3("Unresolved enum class: ".concat(str6));
        }
        Object[] enumConstants = clsG2.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        boolean z15 = false;
        Object obj3 = null;
        while (true) {
            if (i14 >= length) {
                if (!z15) {
                    break;
                }
                obj = obj3;
                break;
            }
            Object obj4 = enumConstants[i14];
            obj4.getClass();
            if (p005kotlin.jvm.internal.s.g(((Enum) obj4).name(), str5)) {
                if (z15) {
                    break;
                }
                z15 = true;
                obj3 = obj4;
            }
            i14++;
        }
        if (obj != null) {
            return obj;
        }
        throw new w3("Unresolved enum entry: " + str6 + '.' + str5);
    }

    public static final x33.b d(String str) {
        str.getClass();
        boolean zY = d53.u.y(str, ".", false);
        if (zY) {
            str = str.substring(1);
        }
        int iK = d53.w.K(IOUtils.DIR_SEPARATOR_UNIX, 0, 6, str);
        String strReplace = (iK == -1 ? "" : str.substring(0, iK)).replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
        strReplace.getClass();
        return new x33.b(new x33.c(strReplace), new x33.c(d53.w.d0(IOUtils.DIR_SEPARATOR_UNIX, str, str)), zY);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d4 A[LOOP:0: B:24:0x00ce->B:26:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, b53.v] */
    public static final b53.v e(c33.w wVar, ClassLoader classLoader, r4 r4Var, e23.a aVar) {
        k23.e eVarA;
        k23.e eVarB;
        ArrayList arrayList;
        Iterator it;
        c33.w wVar2;
        b53.p<?> pVarA;
        b53.v vVarE;
        c33.g gVarA;
        c33.g.a aVar2;
        String str;
        c33.g gVarA2;
        c33.g.a aVar3;
        String str2;
        x33.b bVarD;
        wVar.getClass();
        classLoader.getClass();
        r4Var.getClass();
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        List listS = c53.c0.s(new c53.g0(c53.c0.l(c53.q.e(v.f122639a, wVar), w.f122645a), new x(classLoader, r4Var, aVar, r0Var)));
        c33.g gVarA3 = wVar.a();
        if (gVarA3 instanceof c33.g.a) {
            String str3 = ((c33.g.a) gVarA3).f24223a;
            if (p005kotlin.jvm.internal.s.g(str3, "kotlin/Array")) {
                k23.p pVar = ((k23.r) p13.h0.I0(listS)).f102464b;
                if (pVar == null) {
                    o4.f122553a.getClass();
                    pVar = o4.f122554b;
                }
                eVarB = p005kotlin.jvm.internal.s0.f105811a.b(s4.c(dh.b.u(g8.i.I(pVar))));
            } else {
                eVarA = a(classLoader, str3);
                if (eVarA == null) {
                    throw new w3("Class not found: ".concat(str3));
                }
            }
            boolean zA = c33.a.f24129g.a(wVar, c33.a.f24123a[46]);
            e33.d dVar = g33.h.f75725c;
            dVar.getClass();
            ArrayList arrayList2 = ((g33.h) ((e33.h) dh.b.P(wVar.f24295g, dVar))).f75727b;
            arrayList = new ArrayList(p13.y.r(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(b((c33.d) it.next(), classLoader));
            }
            wVar2 = wVar.f24292d;
            pVarA = null;
            if (wVar2 != null) {
                vVarE = e(wVar2, classLoader, r4Var, null);
            } else {
                vVarE = null;
            }
            d33.a aVar4 = c33.a.f24131i;
            k23.l<?>[] lVarArr = c33.a.f24123a;
            boolean zA2 = aVar4.a(wVar, lVarArr[48]);
            gVarA = wVar.a();
            if (gVarA instanceof c33.g.a) {
                aVar2 = (c33.g.a) gVarA;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                str = aVar2.f24223a;
            } else {
                str = null;
            }
            boolean zG = p005kotlin.jvm.internal.s.g(str, "kotlin/Nothing");
            boolean zA3 = c33.a.f24130h.a(wVar, lVarArr[47]);
            gVarA2 = wVar.a();
            if (gVarA2 instanceof c33.g.a) {
                aVar3 = (c33.g.a) gVarA2;
            } else {
                aVar3 = null;
            }
            if (aVar3 != null && (str2 = aVar3.f24223a) != null) {
                bVarD = d(str2);
                s23.c.f156232a.getClass();
                if (s23.c.f156244m.containsKey(bVarD)) {
                    pVarA = b53.s.a(bVarD.a(), (k23.d) eVarB);
                }
            }
            ?? vVar = new b53.v(eVarB, listS, zA, arrayList, vVarE, zA2, zG, zA3, pVarA, aVar);
            r0Var.f105810a = vVar;
            return vVar;
        }
        if (gVarA3 instanceof c33.g.b) {
            eVarA = new r3(d(((c33.g.b) gVarA3).f24224a).a());
        } else {
            if (!(gVarA3 instanceof c33.g.c)) {
                lc.u0.r();
                return null;
            }
            int i14 = ((c33.g.c) gVarA3).f24225a;
            eVarA = r4Var.a(i14);
            if (eVarA == null) {
                throw new w3(am.j.h(i14, "Type parameter not found: "));
            }
        }
        eVarB = eVarA;
        boolean zA4 = c33.a.f24129g.a(wVar, c33.a.f24123a[46]);
        e33.d dVar2 = g33.h.f75725c;
        dVar2.getClass();
        ArrayList arrayList3 = ((g33.h) ((e33.h) dh.b.P(wVar.f24295g, dVar2))).f75727b;
        arrayList = new ArrayList(p13.y.r(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList.add(b((c33.d) it.next(), classLoader));
        }
        wVar2 = wVar.f24292d;
        pVarA = null;
        if (wVar2 != null) {
            vVarE = e(wVar2, classLoader, r4Var, null);
        } else {
            vVarE = null;
        }
        d33.a aVar5 = c33.a.f24131i;
        k23.l<?>[] lVarArr2 = c33.a.f24123a;
        boolean zA5 = aVar5.a(wVar, lVarArr2[48]);
        gVarA = wVar.a();
        if (gVarA instanceof c33.g.a) {
            aVar2 = (c33.g.a) gVarA;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            str = aVar2.f24223a;
        } else {
            str = null;
        }
        boolean zG2 = p005kotlin.jvm.internal.s.g(str, "kotlin/Nothing");
        boolean zA6 = c33.a.f24130h.a(wVar, lVarArr2[47]);
        gVarA2 = wVar.a();
        if (gVarA2 instanceof c33.g.a) {
            aVar3 = (c33.g.a) gVarA2;
        } else {
            aVar3 = null;
        }
        if (aVar3 != null) {
            bVarD = d(str2);
            s23.c.f156232a.getClass();
            if (s23.c.f156244m.containsKey(bVarD)) {
                pVarA = b53.s.a(bVarD.a(), (k23.d) eVarB);
            }
        }
        ?? vVar2 = new b53.v(eVarB, listS, zA4, arrayList, vVarE, zA5, zG2, zA6, pVarA, aVar);
        r0Var.f105810a = vVar2;
        return vVar2;
    }

    public static final k23.s f(c33.b0 b0Var) {
        int i14 = a.f122396a[b0Var.ordinal()];
        if (i14 == 1) {
            return k23.s.IN;
        }
        if (i14 == 2) {
            return k23.s.OUT;
        }
        if (i14 == 3) {
            return k23.s.INVARIANT;
        }
        lc.u0.r();
        return null;
    }
}
