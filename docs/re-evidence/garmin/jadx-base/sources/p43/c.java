package p43;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f135803a = new c();

    private c() {
    }

    public static boolean a(l1 l1Var, t43.i iVar, l1.c cVar) {
        l1Var.getClass();
        iVar.getClass();
        cVar.getClass();
        t43.p pVar = l1Var.f135870d;
        if ((pVar.E(iVar) && !pVar.r(iVar)) || pVar.B0(iVar)) {
            return true;
        }
        l1Var.c();
        ArrayDeque<t43.i> arrayDeque = l1Var.f135874h;
        arrayDeque.getClass();
        z43.j jVar = l1Var.f135875i;
        jVar.getClass();
        arrayDeque.push(iVar);
        while (!arrayDeque.isEmpty()) {
            t43.i iVarPop = arrayDeque.pop();
            iVarPop.getClass();
            if (jVar.add(iVarPop)) {
                l1.c cVar2 = pVar.r(iVarPop) ? l1.c.C2572c.f135882a : cVar;
                if (p005kotlin.jvm.internal.s.g(cVar2, l1.c.C2572c.f135882a)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    Iterator<t43.h> it = pVar.E0(pVar.F0(iVarPop)).iterator();
                    while (it.hasNext()) {
                        t43.i iVarA = cVar2.a(l1Var, it.next());
                        if ((pVar.E(iVarA) && !pVar.r(iVarA)) || pVar.B0(iVarA)) {
                            l1Var.a();
                            return true;
                        }
                        arrayDeque.add(iVarA);
                    }
                }
            }
        }
        l1Var.a();
        return false;
    }

    public static boolean b(l1 l1Var, t43.i iVar, t43.m mVar) {
        t43.p pVar = l1Var.f135870d;
        if (pVar.X(iVar)) {
            return true;
        }
        if (pVar.r(iVar)) {
            return false;
        }
        if (l1Var.f135868b && pVar.o0(iVar)) {
            return true;
        }
        return pVar.P(pVar.F0(iVar), mVar);
    }
}
