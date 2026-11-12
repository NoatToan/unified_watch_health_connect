package d43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p43.g2;
import p43.n0;
import p43.v0;
import p43.v1;
import p43.y1;

/* JADX INFO: loaded from: classes3.dex */
public class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f57488a;

    public o(q qVar) {
        this.f57488a = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        q qVar = this.f57488a;
        v0 v0VarP = qVar.f57492b.e().k("Comparable").p();
        v0VarP.getClass();
        ArrayList arrayListM = p13.x.m(y1.d(v0VarP, p13.w.c(new v1(g2.IN_VARIANCE, qVar.f57494d)), null, 2));
        t23.c0 c0Var = qVar.f57492b;
        c0Var.getClass();
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = c0Var.e();
        dVarE.getClass();
        v0 v0VarT = dVarE.t(q23.h.INT);
        if (v0VarT == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(59);
            throw null;
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE2 = c0Var.e();
        dVarE2.getClass();
        v0 v0VarT2 = dVarE2.t(q23.h.LONG);
        if (v0VarT2 == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(60);
            throw null;
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE3 = c0Var.e();
        dVarE3.getClass();
        v0 v0VarT3 = dVarE3.t(q23.h.BYTE);
        if (v0VarT3 == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(57);
            throw null;
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE4 = c0Var.e();
        dVarE4.getClass();
        v0 v0VarT4 = dVarE4.t(q23.h.SHORT);
        if (v0VarT4 == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(58);
            throw null;
        }
        List listK = p13.x.k(v0VarT, v0VarT2, v0VarT3, v0VarT4);
        if (listK == null || !listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (qVar.f57493c.contains((n0) it.next())) {
                    v0 v0VarP2 = c0Var.e().k("Number").p();
                    if (v0VarP2 != null) {
                        arrayListM.add(v0VarP2);
                        return arrayListM;
                    }
                    p005kotlin.reflect.jvm.internal.impl.builtins.d.a(56);
                    throw null;
                }
            }
        }
        return arrayListM;
    }
}
