package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u0<T> implements g1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f6901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1<?, ?> f6902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<?> f6904d;

    private u0(m1<?, ?> m1Var, p<?> pVar, q0 q0Var) {
        this.f6902b = m1Var;
        this.f6903c = pVar.e(q0Var);
        this.f6904d = pVar;
        this.f6901a = q0Var;
    }

    public static <T> u0<T> f(m1<?, ?> m1Var, p<?> pVar, q0 q0Var) {
        return new u0<>(m1Var, pVar, q0Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final int a(a aVar) {
        m1<?, ?> m1Var = this.f6902b;
        int i14 = m1Var.i(m1Var.g(aVar));
        if (!this.f6903c) {
            return i14;
        }
        j1<T, Object> j1Var = this.f6904d.c(aVar).f6848a;
        int size = j1Var.f6756a.size();
        int iF = 0;
        for (int i15 = 0; i15 < size; i15++) {
            iF += t.f(j1Var.c(i15));
        }
        Iterator<T> it = j1Var.d().iterator();
        while (it.hasNext()) {
            iF += t.f((Map.Entry) it.next());
        }
        return i14 + iF;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void b(Object obj, j jVar, o oVar) {
        m1<?, ?> m1Var = this.f6902b;
        n1 n1VarF = m1Var.f(obj);
        p<?> pVar = this.f6904d;
        t<T> tVarD = pVar.d(obj);
        while (jVar.b() != Integer.MAX_VALUE) {
            try {
                j jVar2 = jVar;
                o oVar2 = oVar;
                if (!g(jVar2, oVar2, pVar, tVarD, m1Var, n1VarF)) {
                    return;
                }
                jVar = jVar2;
                oVar = oVar2;
            } finally {
                m1Var.n(obj, n1VarF);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(x xVar, x xVar2) {
        m1<?, ?> m1Var = this.f6902b;
        if (!m1Var.g(xVar).equals(m1Var.g(xVar2))) {
            return false;
        }
        if (!this.f6903c) {
            return true;
        }
        p<?> pVar = this.f6904d;
        return pVar.c(xVar).equals(pVar.c(xVar2));
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void d(T t7, u1 u1Var) {
        Iterator itI = this.f6904d.c(t7).i();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            t.b bVar = (t.b) entry.getKey();
            if (bVar.getLiteJavaType() != t1.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                vb.h.z("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof b0.b) {
                ((k) u1Var).i(bVar.getNumber(), ((b0.b) entry).f6677a.getValue().b());
            } else {
                ((k) u1Var).i(bVar.getNumber(), entry.getValue());
            }
        }
        m1<?, ?> m1Var = this.f6902b;
        m1Var.q(m1Var.g(t7), u1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final int e(x xVar) {
        int iHashCode = this.f6902b.g(xVar).hashCode();
        if (!this.f6903c) {
            return iHashCode;
        }
        return this.f6904d.c(xVar).f6848a.hashCode() + (iHashCode * 53);
    }

    public final boolean g(j jVar, o oVar, p pVar, t tVar, m1 m1Var, Object obj) throws InvalidProtocolBufferException {
        int i14 = jVar.f6744b;
        q0 q0Var = this.f6901a;
        if (i14 != 11) {
            if ((i14 & 7) != 2) {
                return jVar.z();
            }
            x.e eVarB = pVar.b(oVar, q0Var, i14 >>> 3);
            if (eVarB == null) {
                return m1Var.l(obj, jVar, 0);
            }
            pVar.h(jVar, eVarB, oVar, tVar);
            return true;
        }
        x.e eVarB2 = null;
        h hVarF = null;
        int iW = 0;
        while (jVar.b() != Integer.MAX_VALUE) {
            int i15 = jVar.f6744b;
            if (i15 == 16) {
                jVar.y(0);
                iW = jVar.f6743a.w();
                eVarB2 = pVar.b(oVar, q0Var, iW);
            } else if (i15 == 26) {
                if (eVarB2 != null) {
                    pVar.h(jVar, eVarB2, oVar, tVar);
                } else {
                    hVarF = jVar.f();
                }
            } else if (!jVar.z()) {
                break;
            }
        }
        if (jVar.f6744b != 12) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (hVarF != null) {
            if (eVarB2 != null) {
                pVar.i(hVarF, eVarB2, oVar, tVar);
                return true;
            }
            m1Var.d(obj, iW, hVarF);
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean isInitialized(T t7) {
        return this.f6904d.c(t7).g();
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void makeImmutable(T t7) {
        this.f6902b.j(t7);
        this.f6904d.f(t7);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void mergeFrom(T t7, T t14) {
        Class<?> cls = h1.f6717a;
        m1<?, ?> m1Var = this.f6902b;
        m1Var.o(t7, m1Var.k(m1Var.g(t7), m1Var.g(t14)));
        if (this.f6903c) {
            h1.k(this.f6904d, t7, t14);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final T newInstance() {
        q0 q0Var = this.f6901a;
        return q0Var instanceof x ? (T) ((x) q0Var).l() : (T) q0Var.newBuilderForType().f();
    }
}
