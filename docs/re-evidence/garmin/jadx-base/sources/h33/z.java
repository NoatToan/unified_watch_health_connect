package h33;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class z implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f81515a;

    public z(a0 a0Var) {
        this.f81515a = a0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        q13.b bVarB = p13.w.b();
        a0 a0Var = this.f81515a;
        bVarB.add(a0Var.f81402a.f81471a);
        h0 h0Var = a0Var.f81403b;
        if (h0Var != null) {
            bVarB.add("under-migration:" + h0Var.f81471a);
        }
        for (Map.Entry<x33.c, h0> entry : a0Var.f81404c.entrySet()) {
            bVarB.add("@" + entry.getKey() + CoreConstants.COLON_CHAR + entry.getValue().f81471a);
        }
        return (String[]) p13.w.a(bVarB).toArray(new String[0]);
    }
}
