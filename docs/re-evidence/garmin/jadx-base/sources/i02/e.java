package i02;

import b5.a0;
import b5.h0;
import kotlinx.coroutines.TimeoutCancellationException;
import o53.j2;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f86850a = 0;

    static {
        g6.f.a aVar = g6.f.f75994b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [b5.a0] */
    public static final Object a(h0 h0Var, a0 a0Var, v13.c cVar) {
        c cVar2;
        r0 r0Var;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f86839d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f86839d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        Object obj = cVar2.f86838c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f86839d;
        if (i15 == 0) {
            r0 r0VarS = wr.g.s(obj);
            r0 r0Var2 = new r0();
            r0Var2.f105810a = a0Var;
            long jC = h0Var.getViewConfiguration().c();
            try {
                d dVar = new d(h0Var, r0Var2, r0VarS, null);
                cVar2.f86836a = a0Var;
                cVar2.f86837b = r0VarS;
                cVar2.f86839d = 1;
                if (j2.b(jC, dVar, cVar2) == aVar) {
                    return aVar;
                }
                return null;
            } catch (TimeoutCancellationException unused) {
                r0Var = r0VarS;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = cVar2.f86837b;
            a0Var = cVar2.f86836a;
            try {
                o13.r.b(obj);
                return null;
            } catch (TimeoutCancellationException unused2) {
            }
        }
        a0 a0Var2 = (a0) r0Var.f105810a;
        return a0Var2 == null ? a0Var : a0Var2;
    }
}
