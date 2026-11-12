package q43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lc.u0;
import p43.f0;
import p43.f2;
import p43.g2;
import p43.m0;
import p43.m1;
import p43.n0;
import p43.q0;
import p43.t1;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends p43.o {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f142787a = new a();

        private a() {
        }
    }

    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<t43.h, f2> {
        public b(Object obj) {
            super(1, obj, e.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // e23.l
        public final f2 invoke(t43.h hVar) {
            t43.h hVar2 = hVar;
            hVar2.getClass();
            return ((e) this.receiver).a(hVar2);
        }
    }

    public static v0 c(v0 v0Var) {
        n0 type;
        m1 m1VarF0 = v0Var.F0();
        m0 m0VarF = null;
        f2VarI0 = null;
        f2 f2VarI0 = null;
        if (m1VarF0 instanceof c43.c) {
            c43.c cVar = (c43.c) m1VarF0;
            t1 t1Var = cVar.f24441a;
            t1 t1Var2 = t1Var.a() == g2.IN_VARIANCE ? t1Var : null;
            if (t1Var2 != null && (type = t1Var2.getType()) != null) {
                f2VarI0 = type.I0();
            }
            if (cVar.f24442b == null) {
                Collection<n0> collectionB = cVar.b();
                ArrayList arrayList = new ArrayList(p13.y.r(collectionB, 10));
                Iterator<T> it = collectionB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((n0) it.next()).I0());
                }
                cVar.f24442b = new m(t1Var, arrayList, null, 4, null);
            }
            t43.b bVar = t43.b.FOR_SUBTYPING;
            m mVar = cVar.f24442b;
            mVar.getClass();
            return new h(bVar, mVar, f2VarI0, v0Var.E0(), v0Var.G0(), false, 32, null);
        }
        if (m1VarF0 instanceof d43.s) {
            p13.y.r(null, 10);
            throw null;
        }
        if (!(m1VarF0 instanceof m0) || !v0Var.G0()) {
            return v0Var;
        }
        m0 m0Var = (m0) m1VarF0;
        LinkedHashSet<n0> linkedHashSet = m0Var.f135886b;
        ArrayList arrayList2 = new ArrayList(p13.y.r(linkedHashSet, 10));
        Iterator<T> it3 = linkedHashSet.iterator();
        boolean z14 = false;
        while (it3.hasNext()) {
            arrayList2.add(o72.t.S((n0) it3.next()));
            z14 = true;
        }
        if (z14) {
            n0 n0Var = m0Var.f135885a;
            m0VarF = new m0(arrayList2).f(n0Var != null ? o72.t.S(n0Var) : null);
        }
        if (m0VarF != null) {
            m0Var = m0VarF;
        }
        return m0Var.a();
    }

    @Override // p43.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f2 a(t43.h hVar) {
        f2 f2VarB;
        hVar.getClass();
        if (!(hVar instanceof n0)) {
            vb.h.s("Failed requirement.");
            return null;
        }
        f2 f2VarI0 = ((n0) hVar).I0();
        if (f2VarI0 instanceof v0) {
            f2VarB = c((v0) f2VarI0);
        } else {
            if (!(f2VarI0 instanceof f0)) {
                u0.r();
                return null;
            }
            f0 f0Var = (f0) f2VarI0;
            v0 v0Var = f0Var.f135830c;
            v0 v0Var2 = f0Var.f135829b;
            v0 v0VarC = c(v0Var2);
            v0 v0VarC2 = c(v0Var);
            f2VarB = (v0VarC == v0Var2 && v0VarC2 == v0Var) ? f2VarI0 : q0.b(v0VarC, v0VarC2);
        }
        b bVar = new b(this);
        n0 n0VarC = og.a.C(f2VarI0);
        return og.a.e0(f2VarB, n0VarC != null ? (n0) bVar.invoke(n0VarC) : null);
    }
}
