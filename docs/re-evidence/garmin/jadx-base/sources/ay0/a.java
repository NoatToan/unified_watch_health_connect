package ay0;

import am.x0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.p;
import p13.h0;
import p13.m0;
import p13.n0;
import p13.o0;
import p13.t0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<x0> f13652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f13653b;

    static {
        List<x0> listK = x.k(x0.f4308n, x0.f4312o, x0.f4316p, x0.f4324r, x0.f4331t, x0.f4320q, x0.C, x0.D, x0.U1, x0.f4350y, x0.f4277d3, x0.f4323q3, x0.f4268a3, x0.f4346x);
        f13652a = listK;
        n0 n0VarJ1 = h0.j1(listK);
        int iA = t0.a(y.r(n0VarJ1, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = n0VarJ1.iterator();
        while (true) {
            o0 o0Var = (o0) it;
            if (!o0Var.f134956a.hasNext()) {
                f13653b = linkedHashMap;
                return;
            } else {
                m0 m0Var = (m0) o0Var.next();
                p pVar = new p(m0Var.f134952b, Integer.valueOf(m0Var.f134951a));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
        }
    }
}
