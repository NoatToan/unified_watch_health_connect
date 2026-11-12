package n23;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122631a;

        static {
            int[] iArr = new int[q4.values().length];
            try {
                iArr[q4.NOT_NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q4.NULLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122631a = iArr;
        }
    }

    public static final List<TypeVariable<?>> a(Class<?> cls) {
        cls.getClass();
        return c53.c0.s(c53.c0.k(c53.q.e(p.f122558a, cls), q.f122572a));
    }

    public static b53.v b(Type type, k23.e eVar, List list, boolean z14) {
        return new b53.v(eVar, list, z14, p13.j0.f134944a, null, false, false, false, null, new m(type));
    }

    public static final f2 c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (f2) p005kotlin.jvm.internal.s0.f105811a.b((Class) genericDeclaration);
        }
        j.u("Non-class container of a type parameter is not supported: ", genericDeclaration, " (", typeVariable);
        return null;
    }

    public static final b53.m d(b53.v vVar, Type type) {
        b53.m.a aVar = b53.m.f16132e;
        k23.e eVar = vVar.f16153b;
        List<k23.r> list = vVar.f16154c;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (k23.r rVar : list) {
            k23.p pVar = rVar.f102464b;
            if (pVar != null) {
                k23.r.f102461c.getClass();
                rVar = new k23.r(k23.s.OUT, pVar);
            }
            arrayList.add(rVar);
        }
        b53.v vVarB = b(type, eVar, arrayList, true);
        t tVar = new t(type);
        aVar.getClass();
        return (b53.m) b53.m.a.a(vVar, vVarB, false, tVar);
    }

    public static k23.p e(Type type, Map map, q4 q4Var, boolean z14, int i14) {
        ArrayList arrayList;
        b53.v vVarB;
        b53.a aVar;
        String f16141b;
        q4 q4Var2 = (i14 & 2) != 0 ? q4.FLEXIBLE : q4Var;
        boolean z15 = (i14 & 4) != 0 ? false : z14;
        type.getClass();
        map.getClass();
        q4Var2.getClass();
        x33.d dVar = null;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!a(cls).isEmpty() && !z15) {
                b53.m.a aVar2 = b53.m.f16132e;
                k23.d dVarX = dh.b.x(cls);
                List<TypeVariable<?>> listA = a(cls);
                ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    Type[] bounds = ((TypeVariable) c53.c0.n(c53.q.e(n.f122537a, (TypeVariable) it.next()))).getBounds();
                    bounds.getClass();
                    Type type2 = (Type) p13.u.E(bounds);
                    k23.r.a aVar3 = k23.r.f102461c;
                    type2.getClass();
                    k23.p pVarE = e(type2, map, null, true, 2);
                    aVar3.getClass();
                    arrayList2.add(k23.r.a.a(pVarE));
                }
                b53.v vVarB2 = b(cls, dVarX, arrayList2, false);
                k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(cls);
                List<TypeVariable<?>> listA2 = a(cls);
                ArrayList arrayList3 = new ArrayList(p13.y.r(listA2, 10));
                Iterator<T> it3 = listA2.iterator();
                while (it3.hasNext()) {
                    k23.r.f102461c.getClass();
                    arrayList3.add(k23.r.f102462d);
                }
                b53.v vVarB3 = b(cls, dVarB, arrayList3, true);
                o oVar = new o(cls);
                aVar2.getClass();
                return b53.m.a.a(vVarB2, vVarB3, true, oVar);
            }
            if (cls.isArray()) {
                k23.d dVarB2 = p005kotlin.jvm.internal.s0.f105811a.b(cls);
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return d(b(type, dVarB2, p13.w.c(f(componentType, map)), false), type);
            }
            k23.d dVarB3 = p005kotlin.jvm.internal.s0.f105811a.b(cls);
            List<TypeVariable<?>> listA3 = a(cls);
            ArrayList arrayList4 = new ArrayList(p13.y.r(listA3, 10));
            Iterator<T> it4 = listA3.iterator();
            while (it4.hasNext()) {
                k23.r.f102461c.getClass();
                arrayList4.add(k23.r.f102462d);
            }
            vVarB = b(type, dVarB3, arrayList4, false);
        } else {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                genericComponentType.getClass();
                k23.r rVarF = f(genericComponentType, map);
                k23.p pVar = rVarF.f102464b;
                pVar.getClass();
                return d(b(type, p005kotlin.jvm.internal.s0.f105811a.b(s4.c(dh.b.u(g8.i.I(pVar)))), p13.w.c(rVarF), false), type);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                rawType.getClass();
                k23.d dVarB4 = p005kotlin.jvm.internal.s0.f105811a.b((Class) rawType);
                if (z15) {
                    List<Type> listS = c53.c0.s(c53.c0.l(c53.q.e(r.f122589a, parameterizedType), s.f122602a));
                    arrayList = new ArrayList(p13.y.r(listS, 10));
                    for (Type type3 : listS) {
                        k23.r.f102461c.getClass();
                        arrayList.add(k23.r.f102462d);
                    }
                } else {
                    List listS2 = c53.c0.s(c53.c0.l(c53.q.e(r.f122589a, parameterizedType), s.f122602a));
                    ArrayList arrayList5 = new ArrayList(p13.y.r(listS2, 10));
                    Iterator it5 = listS2.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(f((Type) it5.next(), map));
                    }
                    arrayList = arrayList5;
                }
                vVarB = b(type, dVarB4, arrayList, false);
            } else {
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        throw new w3(j.h("Wildcard type is not possible here: ", type));
                    }
                    StringBuilder sb3 = new StringBuilder("Type is not supported: ");
                    sb3.append(type);
                    kg.f.t(sb3, " (", type.getClass());
                    return null;
                }
                TypeVariable typeVariable = (TypeVariable) type;
                k23.q qVar = (k23.q) map.get(typeVariable);
                if (qVar == null) {
                    Iterator<T> it6 = c(typeVariable).getTypeParameters().iterator();
                    boolean z16 = false;
                    Object obj = null;
                    while (true) {
                        if (!it6.hasNext()) {
                            if (!z16) {
                                break;
                            }
                            break;
                        }
                        Object next = it6.next();
                        if (p005kotlin.jvm.internal.s.g(((k23.q) next).getF122625c(), typeVariable.getName())) {
                            if (!z16) {
                                z16 = true;
                                obj = next;
                            }
                        }
                        obj = null;
                        break;
                    }
                    qVar = (k23.q) obj;
                    if (qVar == null) {
                        throw new w3("Type parameter " + typeVariable.getName() + " is not found in " + c(typeVariable));
                    }
                }
                vVarB = b(type, qVar, p13.j0.f134944a, false);
            }
        }
        k23.e eVar = vVarB.f16153b;
        k23.d dVar2 = eVar instanceof k23.d ? (k23.d) eVar : null;
        s23.c cVar = s23.c.f156232a;
        if (dVar2 != null && (f16141b = dVar2.getF16141b()) != null) {
            dVar = new x33.d(f16141b);
        }
        cVar.getClass();
        x33.c cVar2 = s23.c.f156243l.get(dVar);
        b53.a aVarA = vVarB;
        aVarA = vVarB;
        if (cVar2 != null && dVar2 != null) {
            b53.v vVar = new b53.v(eVar, vVarB.f16154c, vVarB.f16155d, p13.j0.f134944a, null, false, false, false, b53.s.a(cVar2, dVar2), new m(type));
            b53.m.a aVar4 = b53.m.f16132e;
            k kVar = new k(type);
            aVar4.getClass();
            aVarA = b53.m.a.a(vVar, vVarB, false, kVar);
        }
        int i15 = a.f122631a[q4Var2.ordinal()];
        if (i15 == 1) {
            return aVarA;
        }
        if (i15 == 2) {
            return aVarA.G(true);
        }
        b53.m.a aVar5 = b53.m.f16132e;
        b53.a f16133b = aVarA.getF16133b();
        if (f16133b == null) {
            aVar = f16133b;
            aVar = aVarA;
        }
        aVar = f16133b;
        b53.a f16134c = aVarA.getF16134c();
        b53.a aVar6 = aVarA;
        if (f16134c != null) {
            aVar6 = f16134c;
        }
        b53.a aVarG = aVar6.G(true);
        l lVar = new l(type);
        aVar5.getClass();
        return b53.m.a.a(aVar, aVarG, false, lVar);
    }

    public static final k23.r f(Type type, Map<TypeVariable<?>, ? extends k23.q> map) {
        if (!(type instanceof WildcardType)) {
            k23.r.a aVar = k23.r.f102461c;
            k23.p pVarE = e(type, map, null, false, 6);
            aVar.getClass();
            return k23.r.a.a(pVarE);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new w3(j.h("Wildcard types with many bounds are not supported: ", type));
        }
        if (lowerBounds.length == 1) {
            k23.r.a aVar2 = k23.r.f102461c;
            Object objV = p13.u.V(lowerBounds);
            objV.getClass();
            k23.p pVarE2 = e((Type) objV, map, null, false, 6);
            aVar2.getClass();
            pVarE2.getClass();
            return new k23.r(k23.s.IN, pVarE2);
        }
        if (upperBounds.length != 1) {
            k23.r.f102461c.getClass();
            return k23.r.f102462d;
        }
        k23.r.a aVar3 = k23.r.f102461c;
        Object objV2 = p13.u.V(upperBounds);
        objV2.getClass();
        k23.p pVarE3 = e((Type) objV2, map, null, false, 6);
        aVar3.getClass();
        pVarE3.getClass();
        return new k23.r(k23.s.OUT, pVarE3);
    }
}
