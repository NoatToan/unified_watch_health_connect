package w43;

import java.util.List;
import p13.h0;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f182022a = new p();

    @Override // e23.l
    public final Object invoke(Object obj) {
        t23.v vVar = (t23.v) obj;
        s sVar = s.f182025a;
        vVar.getClass();
        List<j1> listF = vVar.f();
        listF.getClass();
        j1 j1Var = (j1) h0.n0(listF);
        if (j1Var == null || f43.e.a(j1Var) || j1Var.R() != null) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
