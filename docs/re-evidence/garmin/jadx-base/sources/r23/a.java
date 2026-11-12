package r23;

import d53.u;
import d53.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o43.n;
import p13.l0;
import t23.c0;
import t23.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements v23.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f149943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f149944b;

    public a(n nVar, c0 c0Var) {
        nVar.getClass();
        c0Var.getClass();
        this.f149943a = nVar;
        this.f149944b = c0Var;
    }

    @Override // v23.b
    public final boolean a(x33.c cVar, x33.f fVar) {
        cVar.getClass();
        fVar.getClass();
        String strB = fVar.b();
        strB.getClass();
        if (u.y(strB, "Function", false) || u.y(strB, "KFunction", false) || u.y(strB, "SuspendFunction", false) || u.y(strB, "KSuspendFunction", false)) {
            g.f149963c.getClass();
            if (g.f149964d.a(strB, cVar) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // v23.b
    public final t23.e b(x33.b bVar) {
        if (bVar.f188593c || bVar.g()) {
            return null;
        }
        String str = bVar.f188592b.f188596a.f188600a;
        if (!w.z(str, "Function", false)) {
            return null;
        }
        x33.c cVar = bVar.f188591a;
        g.f149963c.getClass();
        g.b bVarA = g.f149964d.a(str, cVar);
        if (bVarA == null) {
            return null;
        }
        f fVar = bVarA.f149967a;
        int i14 = bVarA.f149968b;
        List<h0> listX = this.f149944b.d0(cVar).x();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listX) {
            if (obj instanceof q23.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof q23.d) {
                arrayList2.add(obj2);
            }
        }
        h0 h0Var = (q23.d) p13.h0.d0(arrayList2);
        if (h0Var == null) {
            h0Var = (q23.b) p13.h0.b0(arrayList);
        }
        return new b(this.f149943a, h0Var, fVar, i14);
    }

    @Override // v23.b
    public final Collection<t23.e> c(x33.c cVar) {
        cVar.getClass();
        return l0.f134950a;
    }
}
