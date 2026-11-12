package com.huawei.hms.kit.awareness.barrier.internal.a;

import com.huawei.hms.kit.awareness.barrier.BarrierStatus;
import com.huawei.hms.kit.awareness.barrier.internal.type.State;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes34.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13928a = "Traversal";

    private static int f(c cVar) {
        if (cVar.f()) {
            return d(cVar);
        }
        int iH = cVar.h();
        int iAnd = 1;
        if (iH != 1) {
            iAnd = 2;
            if (iH == 2) {
                Iterator<c> it = cVar.g().iterator();
                iAnd = 0;
                while (it.hasNext()) {
                    iAnd = State.or(iAnd, f(it.next()));
                }
            } else if (iH == 3) {
                iAnd = State.not(f(cVar.g().get(0)));
            }
        } else {
            Iterator<c> it2 = cVar.g().iterator();
            while (it2.hasNext()) {
                iAnd = State.and(iAnd, f(it2.next()));
            }
        }
        if (cVar.n().k()) {
            a(cVar, iAnd);
        }
        return iAnd;
    }

    private static int e(c cVar) {
        cVar.n().a(cVar.h);
        return d(cVar);
    }

    private static int d(c cVar) {
        BarrierStatus barrierStatusM = cVar.m();
        if (barrierStatusM != null) {
            return barrierStatusM.getPresentStatus();
        }
        return 2;
    }

    static int c(c cVar) {
        com.huawei.hms.kit.awareness.b.a.c.b(f13928a, "the current root result: " + f(cVar), new Object[0]);
        return e(cVar);
    }

    static boolean b(b bVar) {
        if (bVar.p() > 200) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13928a, "amount of ComplexCondition is more than MAX_SUB_BARRIER_NUM", new Object[0]);
            return false;
        }
        if (com.huawei.hms.kit.awareness.barrier.internal.f.c.a((Collection) bVar.g())) {
            return false;
        }
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        stack.push(bVar);
        while (true) {
            stack2.push(0);
            while (!stack.isEmpty()) {
                c cVar = (c) stack.pop();
                Integer num = (Integer) stack2.pop();
                if (cVar.f()) {
                    if (!cVar.j()) {
                        return false;
                    }
                } else if (num.intValue() < cVar.g().size()) {
                    c cVar2 = cVar.g().get(num.intValue());
                    stack.push(cVar);
                    stack2.push(Integer.valueOf(num.intValue() + 1));
                    if (stack.contains(cVar2)) {
                        return false;
                    }
                    stack.push(cVar2);
                }
            }
            return true;
        }
    }

    static void b(c cVar) {
        cVar.h = com.huawei.hms.kit.awareness.barrier.internal.d.a(cVar.n().c());
        if (cVar.f()) {
            cVar.v();
            return;
        }
        Iterator<c> it = cVar.g().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    static void a(c cVar, a aVar) {
        cVar.i = aVar;
        if (cVar.f()) {
            aVar.a(cVar);
            return;
        }
        Iterator<c> it = cVar.g().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    static void a(c cVar, int i) {
        BarrierStatus barrierStatusM = cVar.m();
        if (barrierStatusM instanceof com.huawei.hms.kit.awareness.barrier.internal.d) {
            com.huawei.hms.kit.awareness.barrier.internal.d dVar = (com.huawei.hms.kit.awareness.barrier.internal.d) barrierStatusM;
            dVar.a(i);
            dVar.a(System.currentTimeMillis());
        }
    }

    static int a(c cVar) {
        if (cVar == null) {
            return 2;
        }
        return cVar.a();
    }

    d() {
    }
}
