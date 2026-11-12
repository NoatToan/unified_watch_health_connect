package n23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class b3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.b f122401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f122402b;

    public b3(f2.b bVar, f2 f2Var) {
        this.f122401a = bVar;
        this.f122402b = f2Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List<? extends k23.p>] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    @Override // e23.a
    public final Object invoke() {
        k23.d dVarB;
        ?? r14;
        f2.b bVar;
        f2.b bVar2 = this.f122401a;
        f2 f2Var = this.f122402b;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        if (bVar2.b() == null) {
            return r4.f122598e;
        }
        r4.a aVar = r4.f122597d;
        c33.f fVarB = bVar2.b();
        fVarB.getClass();
        ArrayList<c33.y> arrayList = fVarB.f24203c;
        Class<?> enclosingClass = f2Var.f122441d.getEnclosingClass();
        if (enclosingClass != null) {
            c33.f fVarB2 = bVar2.b();
            fVarB2.getClass();
            if (!c33.a.f24127e.a(fVarB2, c33.a.f24123a[10])) {
                enclosingClass = null;
            }
            if (enclosingClass != null) {
                dVarB = p005kotlin.jvm.internal.s0.f105811a.b(enclosingClass);
            } else {
                dVarB = null;
            }
        } else {
            dVarB = null;
        }
        f2 f2Var2 = dVarB instanceof f2 ? (f2) dVarB : null;
        r4 r4VarC = (f2Var2 == null || (r14 = f2Var2.f122442e) == 0 || (bVar = (f2.b) r14.getValue()) == null) ? null : bVar.c();
        ClassLoader classLoaderD = z23.f.d(f2Var.f122441d);
        aVar.getClass();
        arrayList.getClass();
        ArrayList<t3> arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (c33.y yVar : arrayList) {
            arrayList2.add(new t3(f2Var, yVar.f24301b, b0.f(yVar.f24303d), c33.a.f24132j.a(yVar, c33.a.f24123a[49])));
        }
        p13.n0 n0VarJ1 = p13.h0.j1(arrayList);
        int iA = p13.t0.a(p13.y.r(n0VarJ1, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = n0VarJ1.iterator();
        while (true) {
            p13.o0 o0Var = (p13.o0) it;
            if (!o0Var.f134956a.hasNext()) {
                break;
            }
            p13.m0 m0Var = (p13.m0) o0Var.next();
            o13.p pVar = new o13.p(Integer.valueOf(((c33.y) m0Var.f134952b).f24302c), arrayList2.get(m0Var.f134951a));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        r4 r4Var = new r4(arrayList2, linkedHashMap, r4VarC, null);
        int i14 = 0;
        for (t3 t3Var : arrayList2) {
            int i15 = i14 + 1;
            ArrayList arrayList3 = ((c33.y) arrayList.get(i14)).f24304e;
            ?? arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(b0.e((c33.w) it3.next(), classLoaderD, r4Var, null));
            }
            if (arrayList4.isEmpty()) {
                o4.f122553a.getClass();
                arrayList4 = p13.w.c(o4.f122555c);
            }
            t3Var.getClass();
            t3Var.f122628f = arrayList4;
            i14 = i15;
        }
        return r4Var;
    }
}
