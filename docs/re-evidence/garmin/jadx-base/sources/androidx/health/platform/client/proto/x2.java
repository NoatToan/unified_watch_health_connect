package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public class x2 extends v2<w2, w2> {
    @Override // androidx.health.platform.client.proto.v2
    public final void a(w2 w2Var, int i14, int i15) {
        w2Var.e((i14 << 3) | 5, Integer.valueOf(i15));
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void b(w2 w2Var, int i14, long j8) {
        w2Var.e((i14 << 3) | 1, Long.valueOf(j8));
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void c(w2 w2Var, int i14, w2 w2Var2) {
        w2Var.e((i14 << 3) | 3, w2Var2);
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void d(w2 w2Var, int i14, i iVar) {
        w2Var.e((i14 << 3) | 2, iVar);
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void e(w2 w2Var, int i14, long j8) {
        w2Var.e(i14 << 3, Long.valueOf(j8));
    }

    @Override // androidx.health.platform.client.proto.v2
    public final w2 f(Object obj) {
        j0 j0Var = (j0) obj;
        w2 w2Var = j0Var.unknownFields;
        if (w2Var != w2.f7807f) {
            return w2Var;
        }
        w2 w2VarD = w2.d();
        j0Var.unknownFields = w2VarD;
        return w2VarD;
    }

    @Override // androidx.health.platform.client.proto.v2
    public final w2 g(Object obj) {
        return ((j0) obj).unknownFields;
    }

    @Override // androidx.health.platform.client.proto.v2
    public final int h(w2 w2Var) {
        return w2Var.b();
    }

    @Override // androidx.health.platform.client.proto.v2
    public final int i(w2 w2Var) {
        w2 w2Var2 = w2Var;
        int i14 = w2Var2.f7811d;
        if (i14 != -1) {
            return i14;
        }
        int iA = 0;
        for (int i15 = 0; i15 < w2Var2.f7808a; i15++) {
            int i16 = w2Var2.f7809b[i15] >>> 3;
            iA += CodedOutputStream.a(3, (i) w2Var2.f7810c[i15]) + CodedOutputStream.g(i16) + CodedOutputStream.f(2) + (CodedOutputStream.f(1) * 2);
        }
        w2Var2.f7811d = iA;
        return iA;
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void j(Object obj) {
        w2 w2Var = ((j0) obj).unknownFields;
        if (w2Var.f7812e) {
            w2Var.f7812e = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.health.platform.client.proto.v2
    public final w2 k(Object obj, Object obj2) {
        w2 w2Var = (w2) obj;
        w2 w2Var2 = (w2) obj2;
        w2 w2Var3 = w2.f7807f;
        if (w2Var3.equals(w2Var2)) {
            return w2Var;
        }
        if (w2Var3.equals(w2Var)) {
            return w2.c(w2Var, w2Var2);
        }
        w2Var.getClass();
        if (w2Var2.equals(w2Var3)) {
            return w2Var;
        }
        if (!w2Var.f7812e) {
            com.google.protobuf.a.m();
            return null;
        }
        int i14 = w2Var.f7808a + w2Var2.f7808a;
        w2Var.a(i14);
        System.arraycopy(w2Var2.f7809b, 0, w2Var.f7809b, w2Var.f7808a, w2Var2.f7808a);
        System.arraycopy(w2Var2.f7810c, 0, w2Var.f7810c, w2Var.f7808a, w2Var2.f7808a);
        w2Var.f7808a = i14;
        return w2Var;
    }

    @Override // androidx.health.platform.client.proto.v2
    public final w2 m() {
        return w2.d();
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void n(Object obj, w2 w2Var) {
        ((j0) obj).unknownFields = w2Var;
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void o(Object obj, w2 w2Var) {
        ((j0) obj).unknownFields = w2Var;
    }

    @Override // androidx.health.platform.client.proto.v2
    public final w2 p(Object obj) {
        w2 w2Var = (w2) obj;
        if (w2Var.f7812e) {
            w2Var.f7812e = false;
        }
        return w2Var;
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void q(w2 w2Var, d3 d3Var) {
        w2 w2Var2 = w2Var;
        w2Var2.getClass();
        l lVar = (l) d3Var;
        lVar.getClass();
        if (d3.a.ASCENDING == d3.a.DESCENDING) {
            for (int i14 = w2Var2.f7808a - 1; i14 >= 0; i14--) {
                lVar.i(w2Var2.f7809b[i14] >>> 3, w2Var2.f7810c[i14]);
            }
            return;
        }
        for (int i15 = 0; i15 < w2Var2.f7808a; i15++) {
            lVar.i(w2Var2.f7809b[i15] >>> 3, w2Var2.f7810c[i15]);
        }
    }

    @Override // androidx.health.platform.client.proto.v2
    public final void r(w2 w2Var, d3 d3Var) {
        w2Var.f(d3Var);
    }
}
