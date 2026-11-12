package p005kotlin.reflect.jvm.internal.impl.load.java;

import b43.i;
import f43.e;
import h33.h;
import h33.i0;
import h33.j;
import h33.j0;
import h33.k0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.builtins.d;
import p43.a2;
import p43.d2;
import p43.f2;
import p43.g2;
import p43.m1;
import p43.n0;
import p43.o1;
import p43.t1;
import p43.v0;
import q33.b0;
import q43.a0;
import q43.u;
import t23.b;
import t23.l;
import t23.q0;
import t23.r0;
import t23.v;
import t23.x0;
import x33.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final String a(v vVar) {
        b bVarB = d.A(vVar) ? b(vVar) : null;
        if (bVarB != null) {
            b bVarI = e.i(bVarB);
            if (bVarI instanceof r0) {
                j.f81474a.getClass();
                return j.a(bVarI);
            }
            if (bVarI instanceof x0) {
                a.f105902m.getClass();
                d.f105904a.getClass();
                LinkedHashMap linkedHashMap = d.f105913j;
                String strB = b0.b((x0) bVarI);
                f fVar = strB == null ? null : (f) linkedHashMap.get(strB);
                if (fVar != null) {
                    return fVar.b();
                }
            }
        }
        return null;
    }

    public static final <T extends b> T b(T t7) {
        t7.getClass();
        d.f105904a.getClass();
        if (!d.f105914k.contains(t7.getName())) {
            h.f81462a.getClass();
            if (!h.f81466e.contains(e.i(t7).getName())) {
                return null;
            }
        }
        if ((t7 instanceof r0) || (t7 instanceof q0)) {
            return (T) e.b(t7, i0.f81473a);
        }
        if (t7 instanceof x0) {
            return (T) e.b(t7, j0.f81475a);
        }
        return null;
    }

    public static final <T extends b> T c(T t7) {
        t7.getClass();
        T t14 = (T) b(t7);
        if (t14 != null) {
            return t14;
        }
        b bVar = b.f105903m;
        f name = t7.getName();
        name.getClass();
        bVar.getClass();
        if (b.b(name)) {
            return (T) e.b(t7, k0.f81477a);
        }
        return null;
    }

    public static final boolean d(t23.e eVar, b bVar) {
        eVar.getClass();
        bVar.getClass();
        l lVarD = bVar.d();
        lVarD.getClass();
        v0 v0VarP = ((t23.e) lVarD).p();
        v0VarP.getClass();
        for (t23.e eVarI = i.i(eVar); eVarI != null; eVarI = i.i(eVarI)) {
            if (!(eVarI instanceof j33.c)) {
                v0 v0VarP2 = eVarI.p();
                if (v0VarP2 == null) {
                    org.apache.commons.lang3.e.s("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"});
                    return false;
                }
                new q43.v();
                ArrayDeque arrayDeque = new ArrayDeque();
                f2 f2VarI = null;
                arrayDeque.add(new u(v0VarP2, null));
                m1 m1VarF0 = v0VarP.F0();
                while (!arrayDeque.isEmpty()) {
                    u uVar = (u) arrayDeque.poll();
                    n0 n0VarH = uVar.f142815a;
                    m1 m1VarF1 = n0VarH.F0();
                    if (m1VarF1 == null) {
                        q43.v.a(3);
                        throw null;
                    }
                    if (m1VarF0 == null) {
                        q43.v.a(4);
                        throw null;
                    }
                    if (m1VarF1.equals(m1VarF0)) {
                        boolean zG0 = n0VarH.G0();
                        for (u uVar2 = uVar.f142816b; uVar2 != null; uVar2 = uVar2.f142816b) {
                            n0 n0Var = uVar2.f142815a;
                            List<t1> listD0 = n0Var.D0();
                            if (listD0 != null && listD0.isEmpty()) {
                                o1.a aVar = o1.f135897b;
                                aVar.getClass();
                                n0VarH = a2.e(aVar.a(n0Var.F0(), n0Var.D0())).h(g2.INVARIANT, n0VarH);
                                break;
                            }
                            Iterator<T> it = listD0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    o1.a aVar2 = o1.f135897b;
                                    aVar2.getClass();
                                    n0VarH = a2.e(aVar2.a(n0Var.F0(), n0Var.D0())).h(g2.INVARIANT, n0VarH);
                                    break;
                                }
                                g2 g2VarA = ((t1) it.next()).a();
                                g2 g2Var = g2.INVARIANT;
                                if (g2VarA != g2Var) {
                                    o1.a aVar3 = o1.f135897b;
                                    aVar3.getClass();
                                    n0VarH = v43.c.a(a2.e(dh.b.U(aVar3.a(n0Var.F0(), n0Var.D0()))).h(g2Var, n0VarH)).f175698b;
                                    break;
                                }
                            }
                            zG0 = zG0 || n0Var.G0();
                        }
                        m1 m1VarF2 = n0VarH.F0();
                        if (m1VarF2 == null) {
                            q43.v.a(3);
                            throw null;
                        }
                        if (m1VarF2.equals(m1VarF0)) {
                            f2VarI = d2.i(n0VarH, zG0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + a0.a(m1VarF2) + ", \n\nsupertype: " + a0.a(m1VarF0) + " \n" + m1VarF2.equals(m1VarF0));
                    }
                    for (n0 n0Var2 : m1VarF1.b()) {
                        n0Var2.getClass();
                        arrayDeque.add(new u(n0Var2, uVar));
                    }
                }
                if (f2VarI != null) {
                    return !d.A(eVarI);
                }
            }
        }
        return false;
    }
}
