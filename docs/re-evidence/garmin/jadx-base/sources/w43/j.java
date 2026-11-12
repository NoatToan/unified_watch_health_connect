package w43;

import java.util.List;
import p13.h0;
import p43.c1;
import p43.d2;
import p43.k1;
import p43.n0;
import p43.q0;
import p43.v0;
import t23.c0;
import t23.d1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f182010a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f182011b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // w43.f
    public final boolean a(j33.e eVar) {
        v0 v0VarD;
        j1 j1Var = eVar.f().get(1);
        kotlin.reflect.jvm.internal.impl.builtins.e.b bVar = p005kotlin.reflect.jvm.internal.impl.builtins.e.f105843d;
        j1Var.getClass();
        int i14 = f43.e.f68881a;
        c0 c0VarC = b43.i.c(j1Var);
        c0VarC.getClass();
        bVar.getClass();
        t23.e eVarA = t23.u.a(c0VarC, kotlin.reflect.jvm.internal.impl.builtins.f.a.S);
        if (eVarA == null) {
            v0VarD = null;
        } else {
            k1.f135863b.getClass();
            k1 k1Var = k1.f135864c;
            List<d1> parameters = eVarA.h().getParameters();
            parameters.getClass();
            Object objI0 = h0.I0(parameters);
            objI0.getClass();
            v0VarD = q0.d(k1Var, eVarA, p13.w.c(new c1((d1) objI0)));
        }
        if (v0VarD == null) {
            return false;
        }
        n0 type = j1Var.getType();
        type.getClass();
        return q43.d.f142786a.d(v0VarD, d2.i(type, false));
    }

    @Override // w43.f
    public final /* bridge */ String b(j33.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // w43.f
    public final String getDescription() {
        return f182011b;
    }
}
