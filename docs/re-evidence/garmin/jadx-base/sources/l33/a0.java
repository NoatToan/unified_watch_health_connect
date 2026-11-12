package l33;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import p43.c2;
import p43.d2;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends u0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f109693v = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t23.e f109694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o33.f f109695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f109696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o43.j<List<t23.d>> f109697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o43.j<Set<x33.f>> f109698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o43.j<Set<x33.f>> f109699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o43.j<Map<x33.f, o33.m>> f109700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o43.i<x33.f, t23.e> f109701u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k33.i iVar, t23.e eVar, o33.f fVar, boolean z14, a0 a0Var) {
        super(iVar, a0Var);
        iVar.getClass();
        eVar.getClass();
        fVar.getClass();
        this.f109694n = eVar;
        this.f109695o = fVar;
        this.f109696p = z14;
        o43.n nVar = iVar.f102785a.f102751a;
        this.f109697q = nVar.g(new o(this, iVar));
        this.f109698r = nVar.g(new p(this));
        this.f109699s = nVar.g(new q(iVar, this));
        this.f109700t = nVar.g(new r(this));
        this.f109701u = nVar.h(new s(this, iVar));
    }

    public static t23.x0 A(t23.x0 x0Var, t23.v vVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return x0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            t23.x0 x0Var2 = (t23.x0) it.next();
            if (!x0Var.equals(x0Var2) && x0Var2.y0() == null && D(x0Var2, vVar)) {
                t23.v vVarBuild = x0Var.j0().b().build();
                vVarBuild.getClass();
                return (t23.x0) vVarBuild;
            }
        }
        return x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static t23.x0 B(t23.x0 x0Var) {
        x33.c cVarI;
        List<j1> listF = x0Var.f();
        listF.getClass();
        j1 j1Var = (j1) p13.h0.n0(listF);
        if (j1Var != null) {
            t23.h hVarT = j1Var.getType().F0().t();
            if (hVarT != null) {
                int i14 = f43.e.f68881a;
                x33.d dVarF = b43.i.f(hVarT);
                dVarF.getClass();
                if (!dVarF.d()) {
                    dVarF = null;
                }
                if (dVarF != null) {
                    cVarI = dVarF.i();
                } else {
                    cVarI = null;
                }
            } else {
                cVarI = null;
            }
            if (!p005kotlin.jvm.internal.s.g(cVarI, p005kotlin.reflect.jvm.internal.impl.builtins.f.f105855g)) {
                j1Var = null;
            }
            if (j1Var != null) {
                t23.v.a<? extends t23.v> aVarJ0 = x0Var.j0();
                List<j1> listF2 = x0Var.f();
                listF2.getClass();
                t23.x0 x0Var2 = (t23.x0) aVarJ0.l(p13.h0.V(1, listF2)).o(j1Var.getType().D0().get(0).getType()).build();
                w23.r0 r0Var = (w23.r0) x0Var2;
                if (r0Var != null) {
                    r0Var.f181740x = true;
                }
                return x0Var2;
            }
        }
        return null;
    }

    public static boolean D(t23.v vVar, t23.v vVar2) {
        kotlin.reflect.jvm.internal.impl.resolve.b.c.a aVarB = p005kotlin.reflect.jvm.internal.impl.resolve.b.f105945f.p(true, vVar2, vVar).b();
        aVarB.getClass();
        if (aVarB != kotlin.reflect.jvm.internal.impl.resolve.b.c.a.OVERRIDABLE) {
            return false;
        }
        JavaIncompatibilityRulesOverridabilityCondition.Companion.getClass();
        return !JavaIncompatibilityRulesOverridabilityCondition.a.a(vVar2, vVar);
    }

    public static boolean E(t23.x0 x0Var, t23.x0 x0Var2) {
        p005kotlin.reflect.jvm.internal.impl.load.java.a.f105902m.getClass();
        x0Var.getClass();
        t23.x0 x0VarA = x0Var2;
        if (p005kotlin.jvm.internal.s.g(x0Var.getName().b(), "removeAt")) {
            String strB = q33.b0.b(x0Var);
            p005kotlin.reflect.jvm.internal.impl.load.java.d.f105904a.getClass();
            if (p005kotlin.jvm.internal.s.g(strB, p005kotlin.reflect.jvm.internal.impl.load.java.d.f105911h.f105920e)) {
                x0VarA = x0Var2;
                x0VarA = x0Var2.a();
            }
        }
        x0VarA = x0Var2;
        x0VarA.getClass();
        return D(x0VarA, x0Var);
    }

    public static t23.x0 F(t23.r0 r0Var, String str, e23.l lVar) {
        t23.x0 x0Var;
        Iterator it = ((Iterable) lVar.invoke(x33.f.e(str))).iterator();
        do {
            x0Var = null;
            if (!it.hasNext()) {
                break;
            }
            t23.x0 x0Var2 = (t23.x0) it.next();
            if (x0Var2.f().size() == 0) {
                q43.o oVar = q43.d.f142786a;
                p43.n0 returnType = x0Var2.getReturnType();
                if (returnType == null ? false : oVar.d(returnType, r0Var.getType())) {
                    x0Var = x0Var2;
                }
            }
        } while (x0Var == null);
        return x0Var;
    }

    public static t23.x0 H(t23.r0 r0Var, e23.l lVar) {
        t23.x0 x0Var;
        p43.n0 returnType;
        String strB = r0Var.getName().b();
        strB.getClass();
        Iterator it = ((Iterable) lVar.invoke(x33.f.e("set".concat(h33.b0.b(strB) ? strB.substring(2) : w52.u0.h(strB))))).iterator();
        do {
            x0Var = null;
            if (!it.hasNext()) {
                break;
            }
            t23.x0 x0Var2 = (t23.x0) it.next();
            if (x0Var2.f().size() == 1 && (returnType = x0Var2.getReturnType()) != null) {
                x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
                if (p005kotlin.reflect.jvm.internal.impl.builtins.d.E(returnType, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105875e)) {
                    q43.o oVar = q43.d.f142786a;
                    List<j1> listF = x0Var2.f();
                    listF.getClass();
                    if (oVar.a(((j1) p13.h0.I0(listF)).getType(), r0Var.getType())) {
                        x0Var = x0Var2;
                    }
                }
            }
        } while (x0Var == null);
        return x0Var;
    }

    public static boolean K(t23.x0 x0Var, t23.v vVar) {
        String strA = q33.b0.a(x0Var, 2);
        t23.v vVarA = vVar.a();
        vVarA.getClass();
        return strA.equals(q33.b0.a(vVarA, 2)) && !D(x0Var, vVar);
    }

    public final boolean C(t23.r0 r0Var, e23.l<? super x33.f, ? extends Collection<? extends t23.x0>> lVar) {
        if (gl1.y.A(r0Var)) {
            return false;
        }
        t23.x0 x0VarG = G(r0Var, lVar);
        t23.x0 x0VarH = H(r0Var, lVar);
        if (x0VarG == null) {
            return false;
        }
        if (r0Var.Y()) {
            return x0VarH != null && x0VarH.g() == x0VarG.g();
        }
        return true;
    }

    public final t23.x0 G(t23.r0 r0Var, e23.l<? super x33.f, ? extends Collection<? extends t23.x0>> lVar) {
        w23.o0 getter = r0Var.getGetter();
        String strA = null;
        t23.s0 s0Var = getter != null ? (t23.s0) p005kotlin.reflect.jvm.internal.impl.load.java.c.b(getter) : null;
        if (s0Var != null) {
            h33.j.f81474a.getClass();
            strA = h33.j.a(s0Var);
        }
        if (strA != null && !p005kotlin.reflect.jvm.internal.impl.load.java.c.d(this.f109694n, s0Var)) {
            return F(r0Var, strA, lVar);
        }
        String strB = r0Var.getName().b();
        strB.getClass();
        return F(r0Var, h33.b0.a(strB), lVar);
    }

    public final LinkedHashSet I(x33.f fVar) {
        Collection<p43.n0> collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionZ.iterator();
        while (it.hasNext()) {
            p13.d0.v(linkedHashSet, ((p43.n0) it.next()).i().c(fVar, b33.b.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    public final Set<t23.r0> J(x33.f fVar) {
        Collection<p43.n0> collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection<? extends t23.r0> collectionA = ((p43.n0) it.next()).i().a(fVar, b33.b.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(p13.y.r(collectionA, 10));
            Iterator<T> it3 = collectionA.iterator();
            while (it3.hasNext()) {
                arrayList2.add((t23.r0) it3.next());
            }
            p13.d0.v(arrayList, arrayList2);
        }
        return p13.h0.g1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:1: B:55:0x0128->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[LOOP:3: B:73:0x0184->B:109:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x014f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e6 A[SYNTHETIC] */
    public final boolean L(t23.x0 x0Var) {
        Collection collectionL;
        x33.f fVar;
        x33.f name;
        t23.x0 x0VarB;
        LinkedHashSet<t23.x0> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it3;
        t23.v vVarA;
        ArrayList arrayList2;
        t23.x0 x0Var2;
        Iterator it4;
        t23.x0 x0Var3;
        x33.f name2 = x0Var.getName();
        name2.getClass();
        String strB = name2.b();
        strB.getClass();
        h33.b0 b0Var = h33.b0.f81409a;
        if (d53.u.y(strB, "get", false) || d53.u.y(strB, "is", false)) {
            x33.f fVarT = g8.i.T(name2, "get", null, 12);
            if (fVarT == null) {
                fVarT = g8.i.T(name2, "is", null, 8);
            }
            collectionL = p13.x.l(fVarT);
        } else if (d53.u.y(strB, "set", false)) {
            collectionL = p13.u.C(new x33.f[]{g8.i.T(name2, "set", null, 4), g8.i.T(name2, "set", "is", 4)});
        } else {
            h33.h.f81462a.getClass();
            collectionL = (List) h33.h.f81464c.get(name2);
            if (collectionL == null) {
                collectionL = p13.j0.f134944a;
            }
        }
        if (collectionL != null && collectionL.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.load.java.d.a aVar = p005kotlin.reflect.jvm.internal.impl.load.java.d.f105904a;
            x33.f name3 = x0Var.getName();
            name3.getClass();
            aVar.getClass();
            fVar = (x33.f) p005kotlin.reflect.jvm.internal.impl.load.java.d.f105915l.get(name3);
            if (fVar == null) {
                p005kotlin.reflect.jvm.internal.impl.load.java.b bVar = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
                name = x0Var.getName();
                name.getClass();
                bVar.getClass();
                if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
                    x0VarB = B(x0Var);
                    if (x0VarB == null) {
                        return true;
                    }
                    x33.f name4 = x0Var.getName();
                    name4.getClass();
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (t23.x0 x0Var4 : linkedHashSetI) {
                        if (x0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                x33.f name5 = x0Var.getName();
                name5.getClass();
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
                    if (vVarA != null) {
                        arrayList.add(vVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    x0VarB = B(x0Var);
                    if (x0VarB == null) {
                        return true;
                    }
                    x33.f name6 = x0Var.getName();
                    name6.getClass();
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (x0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (K(x0Var, (t23.v) it3.next())) {
                    }
                }
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name7 = x0Var.getName();
                name7.getClass();
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(fVar);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI3) {
                x0Var3 = (t23.x0) obj;
                x0Var3.getClass();
                if (p005kotlin.reflect.jvm.internal.impl.load.java.c.b(x0Var3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                p005kotlin.reflect.jvm.internal.impl.load.java.b bVar2 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
                name = x0Var.getName();
                name.getClass();
                bVar2.getClass();
                if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
                    x0VarB = B(x0Var);
                    if (x0VarB == null) {
                        return true;
                    }
                    x33.f name8 = x0Var.getName();
                    name8.getClass();
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (x0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                x33.f name9 = x0Var.getName();
                name9.getClass();
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
                    if (vVarA != null) {
                        arrayList.add(vVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    x0VarB = B(x0Var);
                    if (x0VarB == null) {
                        return true;
                    }
                    x33.f name10 = x0Var.getName();
                    name10.getClass();
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (x0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (K(x0Var, (t23.v) it3.next())) {
                    }
                }
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name11 = x0Var.getName();
                name11.getClass();
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            t23.v.a<? extends t23.v> aVarJ0 = x0Var.j0();
            aVarJ0.c(fVar);
            aVarJ0.r();
            aVarJ0.h();
            t23.v vVarBuild = aVarJ0.build();
            vVarBuild.getClass();
            x0Var2 = (t23.x0) vVarBuild;
            if (arrayList2.isEmpty()) {
                p005kotlin.reflect.jvm.internal.impl.load.java.b bVar3 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
                name = x0Var.getName();
                name.getClass();
                bVar3.getClass();
                if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
                    x0VarB = B(x0Var);
                    if (x0VarB == null) {
                        return true;
                    }
                    x33.f name12 = x0Var.getName();
                    name12.getClass();
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (x0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                x33.f name13 = x0Var.getName();
                name13.getClass();
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
                    if (vVarA != null) {
                        arrayList.add(vVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    x0VarB = B(x0Var);
                    if (x0VarB == null) {
                        return true;
                    }
                    x33.f name14 = x0Var.getName();
                    name14.getClass();
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (x0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (K(x0Var, (t23.v) it3.next())) {
                    }
                }
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name15 = x0Var.getName();
                name15.getClass();
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                if (E((t23.x0) it4.next(), x0Var2)) {
                }
            }
            p005kotlin.reflect.jvm.internal.impl.load.java.b bVar4 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
            name = x0Var.getName();
            name.getClass();
            bVar4.getClass();
            if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name16 = x0Var.getName();
                name16.getClass();
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            x33.f name17 = x0Var.getName();
            name17.getClass();
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
                if (vVarA != null) {
                    arrayList.add(vVarA);
                }
            }
            if (arrayList.isEmpty()) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name18 = x0Var.getName();
                name18.getClass();
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (K(x0Var, (t23.v) it3.next())) {
                }
            }
            x0VarB = B(x0Var);
            if (x0VarB == null) {
                return true;
            }
            x33.f name19 = x0Var.getName();
            name19.getClass();
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (x0Var4.isSuspend()) {
                }
            }
            return true;
        }
        Iterator it5 = collectionL.iterator();
        while (it5.hasNext()) {
            Set<t23.r0> setJ = J((x33.f) it5.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (t23.r0 r0Var : setJ) {
                    if (C(r0Var, new u(x0Var, this))) {
                        if (!r0Var.Y()) {
                            String strB2 = x0Var.getName().b();
                            strB2.getClass();
                            if (!d53.u.y(strB2, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.load.java.d.a aVar2 = p005kotlin.reflect.jvm.internal.impl.load.java.d.f105904a;
        x33.f name20 = x0Var.getName();
        name20.getClass();
        aVar2.getClass();
        fVar = (x33.f) p005kotlin.reflect.jvm.internal.impl.load.java.d.f105915l.get(name20);
        if (fVar == null) {
            p005kotlin.reflect.jvm.internal.impl.load.java.b bVar5 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
            name = x0Var.getName();
            name.getClass();
            bVar5.getClass();
            if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name110 = x0Var.getName();
                name110.getClass();
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend() || !D(x0VarB, x0Var4)) {
                    }
                }
                return true;
            }
            x33.f name111 = x0Var.getName();
            name111.getClass();
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
                if (vVarA != null) {
                    arrayList.add(vVarA);
                }
            }
            if (arrayList.isEmpty()) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name112 = x0Var.getName();
                name112.getClass();
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (K(x0Var, (t23.v) it3.next())) {
                }
            }
            x0VarB = B(x0Var);
            if (x0VarB == null) {
                return true;
            }
            x33.f name113 = x0Var.getName();
            name113.getClass();
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (x0Var4.isSuspend()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(fVar);
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            x0Var3 = (t23.x0) obj;
            x0Var3.getClass();
            if (p005kotlin.reflect.jvm.internal.impl.load.java.c.b(x0Var3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            p005kotlin.reflect.jvm.internal.impl.load.java.b bVar6 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
            name = x0Var.getName();
            name.getClass();
            bVar6.getClass();
            if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name114 = x0Var.getName();
                name114.getClass();
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            x33.f name115 = x0Var.getName();
            name115.getClass();
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
                if (vVarA != null) {
                    arrayList.add(vVarA);
                }
            }
            if (arrayList.isEmpty()) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name116 = x0Var.getName();
                name116.getClass();
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (K(x0Var, (t23.v) it3.next())) {
                }
            }
            x0VarB = B(x0Var);
            if (x0VarB == null) {
                return true;
            }
            x33.f name117 = x0Var.getName();
            name117.getClass();
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (x0Var4.isSuspend()) {
                }
            }
            return true;
        }
        t23.v.a<? extends t23.v> aVarJ1 = x0Var.j0();
        aVarJ1.c(fVar);
        aVarJ1.r();
        aVarJ1.h();
        t23.v vVarBuild2 = aVarJ1.build();
        vVarBuild2.getClass();
        x0Var2 = (t23.x0) vVarBuild2;
        if (arrayList2.isEmpty()) {
            p005kotlin.reflect.jvm.internal.impl.load.java.b bVar7 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
            name = x0Var.getName();
            name.getClass();
            bVar7.getClass();
            if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name118 = x0Var.getName();
                name118.getClass();
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            x33.f name119 = x0Var.getName();
            name119.getClass();
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
                if (vVarA != null) {
                    arrayList.add(vVarA);
                }
            }
            if (arrayList.isEmpty()) {
                x0VarB = B(x0Var);
                if (x0VarB == null) {
                    return true;
                }
                x33.f name1110 = x0Var.getName();
                name1110.getClass();
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (x0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (K(x0Var, (t23.v) it3.next())) {
                }
            }
            x0VarB = B(x0Var);
            if (x0VarB == null) {
                return true;
            }
            x33.f name1111 = x0Var.getName();
            name1111.getClass();
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (x0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            if (E((t23.x0) it4.next(), x0Var2)) {
            }
        }
        p005kotlin.reflect.jvm.internal.impl.load.java.b bVar8 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
        name = x0Var.getName();
        name.getClass();
        bVar8.getClass();
        if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(name)) {
            x0VarB = B(x0Var);
            if (x0VarB == null) {
                return true;
            }
            x33.f name1112 = x0Var.getName();
            name1112.getClass();
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (x0Var4.isSuspend()) {
                }
            }
            return true;
        }
        x33.f name1113 = x0Var.getName();
        name1113.getClass();
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a((t23.x0) it.next());
            if (vVarA != null) {
                arrayList.add(vVarA);
            }
        }
        if (arrayList.isEmpty()) {
            x0VarB = B(x0Var);
            if (x0VarB == null) {
                return true;
            }
            x33.f name1114 = x0Var.getName();
            name1114.getClass();
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (x0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (K(x0Var, (t23.v) it3.next())) {
            }
        }
        x0VarB = B(x0Var);
        if (x0VarB == null) {
            return true;
        }
        x33.f name1115 = x0Var.getName();
        name1115.getClass();
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r9.hasNext()) {
            if (x0Var4.isSuspend()) {
            }
        }
        return true;
        return false;
    }

    public final void M(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        this.f109810b.f102785a.f102764n.getClass();
        this.f109694n.getClass();
        b33.a.C0220a c0220a = b33.a.C0220a.f15678a;
    }

    public final ArrayList N(x33.f fVar) {
        Collection<o33.o> collectionC = this.f109813e.invoke().c(fVar);
        ArrayList arrayList = new ArrayList(p13.y.r(collectionC, 10));
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(t((o33.o) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(x33.f fVar) {
        LinkedHashSet linkedHashSetI = I(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            t23.x0 x0Var = (t23.x0) obj;
            x0Var.getClass();
            if (p005kotlin.reflect.jvm.internal.impl.load.java.c.b(x0Var) == null && p005kotlin.reflect.jvm.internal.impl.load.java.b.a(x0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // l33.u0, i43.m, i43.l
    public final Collection<t23.r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        M(fVar, bVar);
        return super.a(fVar, bVar);
    }

    @Override // l33.u0, i43.m, i43.l
    public final Collection<t23.x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        M(fVar, bVar);
        return super.c(fVar, bVar);
    }

    @Override // i43.m, i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        o43.i<x33.f, t23.e> iVar;
        t23.e eVarInvoke;
        fVar.getClass();
        bVar.getClass();
        M(fVar, bVar);
        a0 a0Var = (a0) this.f109811c;
        return (a0Var == null || (iVar = a0Var.f109701u) == null || (eVarInvoke = iVar.invoke(fVar)) == null) ? this.f109701u.invoke(fVar) : eVarInvoke;
    }

    @Override // l33.u0
    public final Set<x33.f> h(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        return p13.c1.h(this.f109698r.invoke(), this.f109700t.invoke().keySet());
    }

    @Override // l33.u0
    public final Set i(i43.d dVar, e23.l lVar) {
        dVar.getClass();
        t23.e eVar = this.f109694n;
        Collection<p43.n0> collectionB = eVar.h().b();
        collectionB.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            p13.d0.v(linkedHashSet, ((p43.n0) it.next()).i().b());
        }
        o43.j<c> jVar = this.f109813e;
        linkedHashSet.addAll(jVar.invoke().b());
        linkedHashSet.addAll(jVar.invoke().d());
        linkedHashSet.addAll(h(dVar, lVar));
        k33.i iVar = this.f109810b;
        linkedHashSet.addAll(iVar.f102785a.f102774x.c(eVar, iVar));
        return linkedHashSet;
    }

    @Override // l33.u0
    public final void j(ArrayList arrayList, x33.f fVar) {
        fVar.getClass();
        boolean zX = this.f109695o.x();
        t23.e eVar = this.f109694n;
        k33.i iVar = this.f109810b;
        if (zX) {
            o43.j<c> jVar = this.f109813e;
            if (jVar.invoke().a(fVar) != null) {
                if (arrayList.isEmpty()) {
                    o33.s sVarA = jVar.invoke().a(fVar);
                    sVarA.getClass();
                    k33.f fVarN = gg.b.N(iVar, sVarA);
                    k33.c cVar = iVar.f102785a;
                    j33.e eVarS0 = j33.e.S0(eVar, fVarN, sVarA.getName(), cVar.f102760j.a(sVarA), true);
                    p43.n0 n0VarD = iVar.f102788d.d(sVarA.getType(), gg.b.P(c2.COMMON, false, null, 6));
                    t23.u0 u0VarP = p();
                    p13.j0 j0Var = p13.j0.f134944a;
                    t23.a0.f161986a.getClass();
                    eVarS0.R0(null, u0VarP, j0Var, j0Var, j0Var, n0VarD, t23.a0.OPEN, t23.q.f162050e, null);
                    eVarS0.T0(false, false);
                    cVar.f102757g.getClass();
                    arrayList.add(eVarS0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((t23.x0) it.next()).f().isEmpty()) {
                        }
                    }
                    o33.s sVarA2 = jVar.invoke().a(fVar);
                    sVarA2.getClass();
                    k33.f fVarN2 = gg.b.N(iVar, sVarA2);
                    k33.c cVar2 = iVar.f102785a;
                    j33.e eVarS1 = j33.e.S0(eVar, fVarN2, sVarA2.getName(), cVar2.f102760j.a(sVarA2), true);
                    p43.n0 n0VarD2 = iVar.f102788d.d(sVarA2.getType(), gg.b.P(c2.COMMON, false, null, 6));
                    t23.u0 u0VarP2 = p();
                    p13.j0 j0Var2 = p13.j0.f134944a;
                    t23.a0.f161986a.getClass();
                    eVarS1.R0(null, u0VarP2, j0Var2, j0Var2, j0Var2, n0VarD2, t23.a0.OPEN, t23.q.f162050e, null);
                    eVarS1.T0(false, false);
                    cVar2.f102757g.getClass();
                    arrayList.add(eVarS1);
                }
            }
        }
        iVar.f102785a.f102774x.d(eVar, fVar, arrayList, iVar);
    }

    @Override // l33.u0
    public final c k() {
        return new b(this.f109695o, t.f109805a);
    }

    @Override // l33.u0
    public final void m(LinkedHashSet linkedHashSet, x33.f fVar) {
        fVar.getClass();
        LinkedHashSet linkedHashSetI = I(fVar);
        p005kotlin.reflect.jvm.internal.impl.load.java.d.f105904a.getClass();
        if (!p005kotlin.reflect.jvm.internal.impl.load.java.d.f105914k.contains(fVar)) {
            p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m.getClass();
            if (!p005kotlin.reflect.jvm.internal.impl.load.java.b.b(fVar)) {
                if (!linkedHashSetI.isEmpty()) {
                    Iterator it = linkedHashSetI.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((t23.v) it.next()).isSuspend()) {
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : linkedHashSetI) {
                    if (L((t23.x0) obj)) {
                        arrayList.add(obj);
                    }
                }
                w(linkedHashSet, fVar, arrayList, false);
                return;
            }
        }
        z43.j.f202430c.getClass();
        z43.j jVarA = z43.j.b.a();
        LinkedHashSet linkedHashSetX = g8.i.X(linkedHashSetI, p13.j0.f134944a, this.f109810b.f102785a.f102771u.c(), l43.w.f110117a, this.f109694n, fVar);
        x(fVar, linkedHashSet, linkedHashSetX, linkedHashSet, new y(this));
        x(fVar, linkedHashSet, linkedHashSetX, jVarA, new z(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((t23.x0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        w(linkedHashSet, fVar, p13.h0.C0(arrayList2, jVarA), true);
    }

    @Override // l33.u0
    public final void n(ArrayList arrayList, x33.f fVar) {
        o33.o oVar;
        fVar.getClass();
        boolean zQ = this.f109695o.q();
        k33.i iVar = this.f109810b;
        if (zQ && (oVar = (o33.o) p13.h0.J0(this.f109813e.invoke().c(fVar))) != null) {
            j33.f fVarL0 = j33.f.L0(this.f109694n, gg.b.N(iVar, oVar), t23.a0.FINAL, h33.l0.a(oVar.getVisibility()), false, oVar.getName(), iVar.f102785a.f102760j.a(oVar), false);
            u23.h.f168226x0.getClass();
            w23.o0 o0VarC = b43.h.c(u23.h.a.f168228b, fVarL0);
            fVarL0.I0(o0VarC, null, null, null);
            iVar.getClass();
            p43.n0 n0VarL = u0.l(oVar, new k33.i(iVar.f102785a, new k33.k(iVar, fVarL0, oVar, 0), iVar.f102787c));
            p13.j0 j0Var = p13.j0.f134944a;
            fVarL0.K0(n0VarL, j0Var, p(), null, j0Var);
            o0VarC.f181692m = n0VarL;
            arrayList.add(fVarL0);
        }
        Set<t23.r0> setJ = J(fVar);
        if (setJ.isEmpty()) {
            return;
        }
        z43.j.f202430c.getClass();
        z43.j jVarA = z43.j.b.a();
        z43.j jVarA2 = z43.j.b.a();
        y(setJ, arrayList, jVarA, new v(this));
        y(p13.c1.g(setJ, jVarA), jVarA2, null, new w(this));
        LinkedHashSet linkedHashSetH = p13.c1.h(setJ, jVarA2);
        k33.c cVar = iVar.f102785a;
        arrayList.addAll(g8.i.X(linkedHashSetH, arrayList, cVar.f102771u.c(), cVar.f102756f, this.f109694n, fVar));
    }

    @Override // l33.u0
    public final Set o(i43.d dVar) {
        dVar.getClass();
        if (this.f109695o.q()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f109813e.invoke().f());
        Collection<p43.n0> collectionB = this.f109694n.h().b();
        collectionB.getClass();
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            p13.d0.v(linkedHashSet, ((p43.n0) it.next()).i().d());
        }
        return linkedHashSet;
    }

    @Override // l33.u0
    public final t23.u0 p() {
        t23.e eVar = this.f109694n;
        if (eVar != null) {
            int i14 = b43.i.f15728a;
            return eVar.k0();
        }
        b43.i.a(0);
        throw null;
    }

    @Override // l33.u0
    public final t23.l q() {
        return this.f109694n;
    }

    @Override // l33.u0
    public final boolean r(j33.e eVar) {
        if (this.f109695o.q()) {
            return false;
        }
        return L(eVar);
    }

    @Override // l33.u0
    public final u0.a s(o33.o oVar, ArrayList arrayList, p43.n0 n0Var, List list) {
        oVar.getClass();
        ((i33.o.a) this.f109810b.f102785a.f102755e).getClass();
        if (this.f109694n != null) {
            i33.o.b bVar = new i33.o.b(n0Var, null, list, arrayList, Collections.EMPTY_LIST, false);
            p43.n0 n0Var2 = bVar.f90814a;
            if (n0Var2 == null) {
                i33.o.b.a(4);
                throw null;
            }
            List<j1> list2 = bVar.f90816c;
            if (list2 == null) {
                i33.o.b.a(5);
                throw null;
            }
            List<t23.d1> list3 = bVar.f90817d;
            if (list3 == null) {
                i33.o.b.a(6);
                throw null;
            }
            List<String> list4 = bVar.f90818e;
            if (list4 != null) {
                return new u0.a(n0Var2, bVar.f90815b, list2, list3, bVar.f90819f, list4);
            }
            i33.o.b.a(7);
            throw null;
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = FirebaseAnalytics.Param.METHOD;
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // l33.u0
    public final String toString() {
        return "Lazy Java member scope for " + this.f109695o.c();
    }

    public final void v(ArrayList arrayList, j33.b bVar, int i14, o33.o oVar, p43.n0 n0Var, p43.n0 n0Var2) {
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        x33.f name = oVar.getName();
        if (n0Var != null) {
            arrayList.add(new w23.x0(bVar, null, i14, c3153a, name, d2.i(n0Var, false), oVar.G(), false, false, n0Var2 != null ? d2.i(n0Var2, false) : null, this.f109810b.f102785a.f102760j.a(oVar)));
        } else {
            d2.a(2);
            throw null;
        }
    }

    public final void w(LinkedHashSet linkedHashSet, x33.f fVar, ArrayList arrayList, boolean z14) {
        k33.c cVar = this.f109810b.f102785a;
        LinkedHashSet<t23.x0> linkedHashSetX = g8.i.X(arrayList, linkedHashSet, cVar.f102771u.c(), cVar.f102756f, this.f109694n, fVar);
        if (!z14) {
            linkedHashSet.addAll(linkedHashSetX);
            return;
        }
        ArrayList arrayListC0 = p13.h0.C0(linkedHashSet, linkedHashSetX);
        ArrayList arrayList2 = new ArrayList(p13.y.r(linkedHashSetX, 10));
        for (t23.x0 x0VarA : linkedHashSetX) {
            t23.x0 x0Var = (t23.x0) p005kotlin.reflect.jvm.internal.impl.load.java.c.c(x0VarA);
            if (x0Var != null) {
                x0VarA = A(x0VarA, x0Var, arrayListC0);
            }
            arrayList2.add(x0VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    public final void x(x33.f fVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, e23.l lVar) {
        t23.x0 x0VarA;
        Object next;
        t23.x0 x0Var;
        t23.x0 x0VarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            t23.x0 x0Var2 = (t23.x0) it.next();
            t23.x0 x0Var3 = (t23.x0) p005kotlin.reflect.jvm.internal.impl.load.java.c.b(x0Var2);
            t23.x0 x0Var4 = null;
            if (x0Var3 != null) {
                String strA = p005kotlin.reflect.jvm.internal.impl.load.java.c.a(x0Var3);
                strA.getClass();
                Iterator it3 = ((Collection) lVar.invoke(x33.f.e(strA))).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        x0VarA = null;
                        break;
                    }
                    t23.v.a<? extends t23.v> aVarJ0 = ((t23.x0) it3.next()).j0();
                    aVarJ0.c(fVar);
                    aVarJ0.r();
                    aVarJ0.h();
                    t23.v vVarBuild = aVarJ0.build();
                    vVarBuild.getClass();
                    t23.x0 x0Var5 = (t23.x0) vVarBuild;
                    if (E(x0Var3, x0Var5)) {
                        x0VarA = A(x0Var5, x0Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                x0VarA = null;
                break;
            }
            if (x0VarA != null) {
                abstractSet.add(x0VarA);
            }
            t23.v vVarA = p005kotlin.reflect.jvm.internal.impl.load.java.b.a(x0Var2);
            if (vVarA == null) {
                x0VarA2 = null;
            } else {
                x33.f name = vVarA.getName();
                name.getClass();
                Iterator it4 = ((Iterable) lVar.invoke(name)).iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!K((t23.x0) next, vVarA));
                t23.x0 x0Var6 = (t23.x0) next;
                if (x0Var6 != null) {
                    t23.v.a<? extends t23.v> aVarJ1 = x0Var6.j0();
                    List<j1> listF = vVarA.f();
                    listF.getClass();
                    ArrayList arrayList = new ArrayList(p13.y.r(listF, 10));
                    Iterator<T> it5 = listF.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(((j1) it5.next()).getType());
                    }
                    List<j1> listF2 = x0Var6.f();
                    listF2.getClass();
                    aVarJ1.l(gg.b.p(arrayList, listF2, vVarA));
                    aVarJ1.r();
                    aVarJ1.h();
                    aVarJ1.g(j33.e.X);
                    x0Var = (t23.x0) aVarJ1.build();
                } else {
                    x0Var = null;
                }
                if (x0Var == null) {
                    x0VarA2 = null;
                } else {
                    if (!L(x0Var)) {
                        x0Var = null;
                    }
                    if (x0Var != null) {
                        x0VarA2 = A(x0Var, vVarA, linkedHashSet);
                    } else {
                        x0VarA2 = null;
                    }
                }
            }
            if (x0VarA2 != null) {
                abstractSet.add(x0VarA2);
            }
            if (x0Var2.isSuspend()) {
                x33.f name2 = x0Var2.getName();
                name2.getClass();
                Iterator it6 = ((Iterable) lVar.invoke(name2)).iterator();
                while (it6.hasNext()) {
                    t23.x0 x0VarB = B((t23.x0) it6.next());
                    if (x0VarB == null || !D(x0VarB, x0Var2)) {
                        x0VarB = null;
                    }
                    if (x0VarB != null) {
                        x0Var4 = x0VarB;
                        break;
                    }
                }
            }
            if (x0Var4 != null) {
                abstractSet.add(x0Var4);
            }
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, z43.j jVar, e23.l lVar) {
        t23.x0 x0VarH;
        w23.p0 p0VarJ;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            t23.r0 r0Var = (t23.r0) it.next();
            j33.d dVar = null;
            if (C(r0Var, lVar)) {
                t23.x0 x0VarG = G(r0Var, lVar);
                x0VarG.getClass();
                if (r0Var.Y()) {
                    x0VarH = H(r0Var, lVar);
                    x0VarH.getClass();
                } else {
                    x0VarH = null;
                }
                if (x0VarH != null) {
                    x0VarH.g();
                    x0VarG.g();
                }
                j33.d dVar2 = new j33.d(this.f109694n, x0VarG, x0VarH, r0Var);
                p43.n0 returnType = x0VarG.getReturnType();
                returnType.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                dVar2.K0(returnType, j0Var, p(), null, j0Var);
                w23.o0 o0VarI = b43.h.i(dVar2, x0VarG.getAnnotations(), false, x0VarG.getSource());
                o0VarI.f181661l = x0VarG;
                o0VarI.G0(dVar2.getType());
                if (x0VarH != null) {
                    List<j1> listF = x0VarH.f();
                    listF.getClass();
                    j1 j1Var = (j1) p13.h0.d0(listF);
                    if (j1Var == null) {
                        com.nimbusds.jose.shaded.gson.internal.a.y(x0VarH, "No parameter found for ");
                        return;
                    } else {
                        p0VarJ = b43.h.j(dVar2, x0VarH.getAnnotations(), j1Var.getAnnotations(), false, x0VarH.getVisibility(), x0VarH.getSource());
                        p0VarJ.f181661l = x0VarH;
                    }
                } else {
                    p0VarJ = null;
                }
                dVar2.I0(o0VarI, p0VarJ, null, null);
                dVar = dVar2;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (jVar != null) {
                    jVar.add(r0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<p43.n0> z() {
        boolean z14 = this.f109696p;
        t23.e eVar = this.f109694n;
        if (!z14) {
            return this.f109810b.f102785a.f102771u.b().e(eVar);
        }
        Collection<p43.n0> collectionB = eVar.h().b();
        collectionB.getClass();
        return collectionB;
    }

    public /* synthetic */ a0(k33.i iVar, t23.e eVar, o33.f fVar, boolean z14, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, eVar, fVar, z14, (i14 & 16) != 0 ? null : a0Var);
    }
}
