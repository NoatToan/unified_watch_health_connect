package n23;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class h2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.b f122495b;

    public h2(f2 f2Var, f2.b bVar) {
        this.f122494a = f2Var;
        this.f122495b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        String str;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        f2 f2Var = this.f122494a;
        Class<T> cls = f2Var.f122441d;
        if (p005kotlin.jvm.internal.s.g(cls, Object.class)) {
            return p13.j0.f134944a;
        }
        boolean z14 = p4.f122570a;
        f2.b bVar = this.f122495b;
        if (z14) {
            Collection<p43.n0> collectionB = bVar.a().h().b();
            collectionB.getClass();
            ArrayList arrayList = new ArrayList(collectionB.size());
            f2<T> f2Var2 = f2.this;
            for (p43.n0 n0Var : collectionB) {
                n0Var.getClass();
                arrayList.add(new b53.l(n0Var, new s2(n0Var, f2Var2)));
            }
            t23.e eVarA = bVar.a();
            x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
            if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVarA, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b) && !p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVarA, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105871c)) {
                if (arrayList.isEmpty()) {
                    o4.f122553a.getClass();
                    arrayList.add(o4.f122554b);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        k23.e f105782a = ((k23.p) it.next()).getF105782a();
                        f2 f2Var3 = f105782a instanceof f2 ? (f2) f105782a : null;
                        if (f2Var3 == null || (f2Var3.T() != c33.b.INTERFACE && f2Var3.T() != c33.b.ANNOTATION_CLASS)) {
                        }
                    }
                    o4.f122553a.getClass();
                    arrayList.add(o4.f122554b);
                }
            }
            return w02.b0.f(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        c33.f fVarB = bVar.b();
        ArrayList<c33.w> arrayList3 = fVarB != null ? fVarB.f24204d : null;
        if (arrayList3 != null) {
            for (c33.w wVar : arrayList3) {
                c33.g gVarA = wVar.a();
                c33.g.a aVar = gVarA instanceof c33.g.a ? (c33.g.a) gVarA : null;
                if (aVar == null || (str = aVar.f24223a) == null) {
                    StringBuilder sb3 = new StringBuilder("Supertype of ");
                    sb3.append(f2Var);
                    c33.g gVarA2 = wVar.a();
                    sb3.append(" not a class: ");
                    sb3.append(gVarA2);
                    throw new w3(sb3.toString());
                }
                x33.b bVarD = b0.d(str);
                Class<?> clsG = s4.g(z23.f.d(cls), bVarD, 0);
                if (clsG == null) {
                    j.B("Unsupported superclass of ", f2Var, ": ", bVarD);
                    return null;
                }
                arrayList2.add(b0.e(wVar, z23.f.d(cls), bVar.c(), new t2(f2Var, clsG, bVarD)));
            }
            if (cls.isArray()) {
                o4.f122553a.getClass();
                arrayList2.add(o4.f122556d);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                o4.f122553a.getClass();
                k23.p pVar = o4.f122557e;
                if (!arrayList2.contains(pVar)) {
                    c4.a aVar2 = bVar.f122447f;
                    k23.l<Object> lVar = f2.b.f122443u[3];
                    String str2 = (String) aVar2.invoke();
                    if (str2 != null && d53.u.y(str2, "kotlin.", false)) {
                        arrayList2.add(pVar);
                    }
                }
            }
        } else {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass != null) {
                if (genericSuperclass.equals(Object.class)) {
                    genericSuperclass = null;
                }
                if (genericSuperclass != null) {
                    p13.k0 k0Var = p13.k0.f134949a;
                    k0Var.getClass();
                    arrayList2.add(u.e(genericSuperclass, k0Var, q4.NOT_NULL, false, 4));
                }
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            genericInterfaces.getClass();
            for (Type type : genericInterfaces) {
                type.getClass();
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                arrayList2.add(u.e(type, k0Var2, q4.NOT_NULL, false, 4));
            }
        }
        if (arrayList2.isEmpty()) {
            o4.f122553a.getClass();
            arrayList2.add(o4.f122554b);
        } else {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                k23.e f105782a2 = ((k23.p) it3.next()).getF105782a();
                f2 f2Var4 = f105782a2 instanceof f2 ? (f2) f105782a2 : null;
                if (f2Var4 == null || (f2Var4.T() != c33.b.INTERFACE && f2Var4.T() != c33.b.ANNOTATION_CLASS)) {
                }
            }
            o4.f122553a.getClass();
            arrayList2.add(o4.f122554b);
        }
        return w02.b0.f(arrayList2);
    }
}
