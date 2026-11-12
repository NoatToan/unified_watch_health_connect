package androidx.health.platform.client.proto;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g1<T> implements n2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f7648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2<?, ?> f7649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0<?> f7651d;

    private g1(v2<?, ?> v2Var, b0<?> b0Var, c1 c1Var) {
        this.f7649b = v2Var;
        this.f7650c = b0Var.e(c1Var);
        this.f7651d = b0Var;
        this.f7648a = c1Var;
    }

    public static <T> g1<T> g(v2<?, ?> v2Var, b0<?> b0Var, c1 c1Var) {
        return new g1<>(v2Var, b0Var, c1Var);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6 A[EDGE_INSN: B:51:0x00c6->B:39:0x00c6 BREAK  A[LOOP:1: B:21:0x0073->B:29:0x009e], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.n2
    public final void a(T t7, byte[] bArr, int i14, int i15, e.b bVar) throws InvalidProtocolBufferException {
        g1<T> g1Var = this;
        j0 j0Var = (j0) t7;
        w2 w2VarD = j0Var.unknownFields;
        if (w2VarD == w2.f7807f) {
            w2VarD = w2.d();
            j0Var.unknownFields = w2VarD;
        }
        w2 w2Var = w2VarD;
        j0.c cVar = (j0.c) t7;
        f0<j0.d> f0Var = cVar.extensions;
        if (f0Var.f7606b) {
            cVar.extensions = f0Var.clone();
        }
        f0<j0.d> f0Var2 = cVar.extensions;
        int iV = i14;
        j0.e eVar = null;
        while (iV < i15) {
            j0.e eVarB = eVar;
            int iQ = e.q(bArr, iV, bVar);
            int i16 = bVar.f7582a;
            a0 a0Var = bVar.f7585d;
            c1 c1Var = g1Var.f7648a;
            b0<?> b0Var = g1Var.f7651d;
            int i17 = 2;
            if (i16 == 11) {
                int i18 = 0;
                i iVar = null;
                while (iQ < i15) {
                    iQ = e.q(bArr, iQ, bVar);
                    int i19 = bVar.f7582a;
                    int i24 = i19 >>> 3;
                    int i25 = i19 & 7;
                    if (i24 != i17) {
                        if (i24 == 3) {
                            if (eVarB != null) {
                                iQ = e.d(r1.f7767c.a(eVarB.f7686c.getClass()), bArr, iQ, i15, bVar);
                                f0Var2.m(eVarB.f7687d, bVar.f7584c);
                            } else if (i25 == 2) {
                                iQ = e.a(bArr, iQ, bVar);
                                iVar = (i) bVar.f7584c;
                            } else if (i19 == 12) {
                                break;
                            } else {
                                iQ = e.v(i19, bArr, iQ, i15, bVar);
                            }
                        } else {
                            if (i19 == 12) {
                                break;
                                break;
                            }
                            iQ = e.v(i19, bArr, iQ, i15, bVar);
                        }
                    } else if (i25 == 0) {
                        iQ = e.q(bArr, iQ, bVar);
                        i18 = bVar.f7582a;
                        eVarB = b0Var.b(a0Var, c1Var, i18);
                    } else {
                        if (i19 == 12) {
                            break;
                            break;
                        }
                        iQ = e.v(i19, bArr, iQ, i15, bVar);
                    }
                    i17 = 2;
                }
                if (iVar != null) {
                    w2Var.e((i18 << 3) | 2, iVar);
                }
                g1Var = this;
                iV = iQ;
            } else if ((i16 & 7) == 2) {
                eVarB = b0Var.b(a0Var, c1Var, i16 >>> 3);
                if (eVarB != null) {
                    iV = e.d(r1.f7767c.a(eVarB.f7686c.getClass()), bArr, iQ, i15, bVar);
                    f0Var2.m(eVarB.f7687d, bVar.f7584c);
                } else {
                    iV = e.o(i16, bArr, iQ, i15, w2Var, bVar);
                }
            } else {
                iV = e.v(i16, bArr, iQ, i15, bVar);
            }
            eVar = eVarB;
        }
        if (iV != i15) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.health.platform.client.proto.n2
    public final int b(j0 j0Var) {
        int iHashCode = this.f7649b.g(j0Var).hashCode();
        if (!this.f7650c) {
            return iHashCode;
        }
        return this.f7651d.c(j0Var).f7605a.hashCode() + (iHashCode * 53);
    }

    @Override // androidx.health.platform.client.proto.n2
    public final void c(T t7, d3 d3Var) {
        Iterator itJ = this.f7651d.c(t7).j();
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            f0.b bVar = (f0.b) entry.getKey();
            if (bVar.getLiteJavaType() != c3.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                vb.h.z("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof n0.b) {
                ((l) d3Var).i(bVar.getNumber(), ((n0.b) entry).f7727a.getValue().b());
            } else {
                ((l) d3Var).i(bVar.getNumber(), entry.getValue());
            }
        }
        v2<?, ?> v2Var = this.f7649b;
        v2Var.q(v2Var.g(t7), d3Var);
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
    @Override // androidx.health.platform.client.proto.n2
    public final int d(a aVar) {
        v2<?, ?> v2Var = this.f7649b;
        int i14 = v2Var.i(v2Var.g(aVar));
        if (!this.f7650c) {
            return i14;
        }
        q2<T, Object> q2Var = this.f7651d.c(aVar).f7605a;
        int size = q2Var.f7749a.size();
        int iG = 0;
        for (int i15 = 0; i15 < size; i15++) {
            iG += f0.g(q2Var.c(i15));
        }
        Iterator<T> it = q2Var.d().iterator();
        while (it.hasNext()) {
            iG += f0.g((Map.Entry) it.next());
        }
        return i14 + iG;
    }

    @Override // androidx.health.platform.client.proto.n2
    public final void e(Object obj, k kVar, a0 a0Var) {
        v2<?, ?> v2Var = this.f7649b;
        w2 w2VarF = v2Var.f(obj);
        b0<?> b0Var = this.f7651d;
        f0<T> f0VarD = b0Var.d(obj);
        while (kVar.b() != Integer.MAX_VALUE) {
            try {
                k kVar2 = kVar;
                a0 a0Var2 = a0Var;
                if (!h(kVar2, a0Var2, b0Var, f0VarD, v2Var, w2VarF)) {
                    return;
                }
                kVar = kVar2;
                a0Var = a0Var2;
            } finally {
                v2Var.n(obj, w2VarF);
            }
        }
    }

    @Override // androidx.health.platform.client.proto.n2
    public final boolean f(j0 j0Var, j0 j0Var2) {
        v2<?, ?> v2Var = this.f7649b;
        if (!v2Var.g(j0Var).equals(v2Var.g(j0Var2))) {
            return false;
        }
        if (!this.f7650c) {
            return true;
        }
        b0<?> b0Var = this.f7651d;
        return b0Var.c(j0Var).equals(b0Var.c(j0Var2));
    }

    public final boolean h(k kVar, a0 a0Var, b0 b0Var, f0 f0Var, v2 v2Var, Object obj) throws InvalidProtocolBufferException {
        int i14 = kVar.f7699b;
        c1 c1Var = this.f7648a;
        if (i14 != 11) {
            if ((i14 & 7) != 2) {
                return kVar.z();
            }
            j0.e eVarB = b0Var.b(a0Var, c1Var, i14 >>> 3);
            if (eVarB == null) {
                return v2Var.l(obj, kVar, 0);
            }
            b0Var.h(kVar, eVarB, a0Var, f0Var);
            return true;
        }
        j0.e eVarB2 = null;
        i iVarF = null;
        int iX = 0;
        while (kVar.b() != Integer.MAX_VALUE) {
            int i15 = kVar.f7699b;
            if (i15 == 16) {
                kVar.y(0);
                iX = kVar.f7698a.x();
                eVarB2 = b0Var.b(a0Var, c1Var, iX);
            } else if (i15 == 26) {
                if (eVarB2 != null) {
                    b0Var.h(kVar, eVarB2, a0Var, f0Var);
                } else {
                    iVarF = kVar.f();
                }
            } else if (!kVar.z()) {
                break;
            }
        }
        if (kVar.f7699b != 12) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (iVarF != null) {
            if (eVarB2 != null) {
                b0Var.i(iVarF, eVarB2, a0Var, f0Var);
                return true;
            }
            v2Var.d(obj, iX, iVarF);
        }
        return true;
    }

    @Override // androidx.health.platform.client.proto.n2
    public final boolean isInitialized(T t7) {
        return this.f7651d.c(t7).h();
    }

    @Override // androidx.health.platform.client.proto.n2
    public final void makeImmutable(T t7) {
        this.f7649b.j(t7);
        this.f7651d.f(t7);
    }

    @Override // androidx.health.platform.client.proto.n2
    public final void mergeFrom(T t7, T t14) {
        Class<?> cls = o2.f7739a;
        v2<?, ?> v2Var = this.f7649b;
        v2Var.o(t7, v2Var.k(v2Var.g(t7), v2Var.g(t14)));
        if (this.f7650c) {
            o2.l(this.f7651d, t7, t14);
        }
    }

    @Override // androidx.health.platform.client.proto.n2
    public final T newInstance() {
        c1 c1Var = this.f7648a;
        return c1Var instanceof j0 ? (T) ((j0) c1Var).p() : (T) c1Var.newBuilderForType().f();
    }
}
