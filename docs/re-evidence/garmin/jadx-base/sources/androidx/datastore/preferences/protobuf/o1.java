package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class o1 extends m1<n1, n1> {
    @Override // androidx.datastore.preferences.protobuf.m1
    public final void a(n1 n1Var, int i14, int i15) {
        n1Var.e((i14 << 3) | 5, Integer.valueOf(i15));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void b(n1 n1Var, int i14, long j8) {
        n1Var.e((i14 << 3) | 1, Long.valueOf(j8));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void c(n1 n1Var, int i14, n1 n1Var2) {
        n1Var.e((i14 << 3) | 3, n1Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void d(n1 n1Var, int i14, h hVar) {
        n1Var.e((i14 << 3) | 2, hVar);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void e(n1 n1Var, int i14, long j8) {
        n1Var.e(i14 << 3, Long.valueOf(j8));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final n1 f(Object obj) {
        x xVar = (x) obj;
        n1 n1Var = xVar.unknownFields;
        if (n1Var != n1.f6788f) {
            return n1Var;
        }
        n1 n1VarD = n1.d();
        xVar.unknownFields = n1VarD;
        return n1VarD;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final n1 g(Object obj) {
        return ((x) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int h(n1 n1Var) {
        return n1Var.b();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int i(n1 n1Var) {
        n1 n1Var2 = n1Var;
        int i14 = n1Var2.f6792d;
        if (i14 != -1) {
            return i14;
        }
        int iB = 0;
        for (int i15 = 0; i15 < n1Var2.f6789a; i15++) {
            int i16 = n1Var2.f6790b[i15] >>> 3;
            iB += CodedOutputStream.b(3, (h) n1Var2.f6791c[i15]) + CodedOutputStream.h(i16) + CodedOutputStream.g(2) + (CodedOutputStream.g(1) * 2);
        }
        n1Var2.f6792d = iB;
        return iB;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void j(Object obj) {
        n1 n1Var = ((x) obj).unknownFields;
        if (n1Var.f6793e) {
            n1Var.f6793e = false;
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
    @Override // androidx.datastore.preferences.protobuf.m1
    public final n1 k(Object obj, Object obj2) {
        n1 n1Var = (n1) obj;
        n1 n1Var2 = (n1) obj2;
        n1 n1Var3 = n1.f6788f;
        if (n1Var3.equals(n1Var2)) {
            return n1Var;
        }
        if (n1Var3.equals(n1Var)) {
            return n1.c(n1Var, n1Var2);
        }
        n1Var.getClass();
        if (n1Var2.equals(n1Var3)) {
            return n1Var;
        }
        if (!n1Var.f6793e) {
            com.google.protobuf.a.m();
            return null;
        }
        int i14 = n1Var.f6789a + n1Var2.f6789a;
        n1Var.a(i14);
        System.arraycopy(n1Var2.f6790b, 0, n1Var.f6790b, n1Var.f6789a, n1Var2.f6789a);
        System.arraycopy(n1Var2.f6791c, 0, n1Var.f6791c, n1Var.f6789a, n1Var2.f6789a);
        n1Var.f6789a = i14;
        return n1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final n1 m() {
        return n1.d();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void n(Object obj, n1 n1Var) {
        ((x) obj).unknownFields = n1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void o(Object obj, n1 n1Var) {
        ((x) obj).unknownFields = n1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final n1 p(Object obj) {
        n1 n1Var = (n1) obj;
        if (n1Var.f6793e) {
            n1Var.f6793e = false;
        }
        return n1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void q(n1 n1Var, u1 u1Var) {
        n1 n1Var2 = n1Var;
        n1Var2.getClass();
        k kVar = (k) u1Var;
        kVar.getClass();
        if (u1.a.ASCENDING == u1.a.DESCENDING) {
            for (int i14 = n1Var2.f6789a - 1; i14 >= 0; i14--) {
                kVar.i(n1Var2.f6790b[i14] >>> 3, n1Var2.f6791c[i14]);
            }
            return;
        }
        for (int i15 = 0; i15 < n1Var2.f6789a; i15++) {
            kVar.i(n1Var2.f6790b[i15] >>> 3, n1Var2.f6791c[i15]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void r(n1 n1Var, u1 u1Var) {
        n1Var.f(u1Var);
    }
}
