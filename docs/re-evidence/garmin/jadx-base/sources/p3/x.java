package p3;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final <T> T a(i2 i2Var, t<T> tVar) {
        tVar.getClass();
        c4<T> c4VarA = (c4<T>) i2Var.get(tVar);
        if (c4VarA == null) {
            c4VarA = tVar.a();
        }
        return (T) c4VarA.a(i2Var);
    }

    public static final i2 b(n2<?>[] n2VarArr, i2 i2Var, i2 i2Var2) {
        z3.i iVarA = z3.j.a();
        iVarA.getClass();
        z3.i.a aVar = new z3.i.a(iVarA);
        for (n2<?> n2Var : n2VarArr) {
            t<?> tVar = n2Var.f135167a;
            tVar.getClass();
            m2 m2Var = (m2) tVar;
            if (n2Var.f135174h || !i2Var.containsKey(m2Var)) {
                aVar.put(m2Var, m2Var.b(n2Var, (c4) i2Var2.get(m2Var)));
            }
        }
        return aVar.build();
    }
}
