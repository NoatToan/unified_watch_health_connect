package p006l2;

import g6.o;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.t1;
import l01.b;
import p3.m;
import p3.n;
import p3.x1;
import p3.y3;
import s5.c;
import s5.x0;
import s5.y;
import w5.q;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3 f108336a = new y3(new b(13));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f108337b;

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[Catch: RejectedExecutionException -> 0x0095, TryCatch #0 {RejectedExecutionException -> 0x0095, blocks: (B:8:0x003a, B:14:0x0047, B:16:0x005c, B:21:0x0067, B:23:0x0079, B:26:0x0090, B:25:0x0082, B:18:0x0062, B:10:0x0040), top: B:32:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079 A[Catch: RejectedExecutionException -> 0x0095, TryCatch #0 {RejectedExecutionException -> 0x0095, blocks: (B:8:0x003a, B:14:0x0047, B:16:0x005c, B:21:0x0067, B:23:0x0079, B:26:0x0090, B:25:0x0082, B:18:0x0062, B:10:0x0040), top: B:32:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[Catch: RejectedExecutionException -> 0x0095, TryCatch #0 {RejectedExecutionException -> 0x0095, blocks: (B:8:0x003a, B:14:0x0047, B:16:0x005c, B:21:0x0067, B:23:0x0079, B:26:0x0090, B:25:0x0082, B:18:0x0062, B:10:0x0040), top: B:32:0x003a }] */
    public static final void a(c cVar, x0 x0Var, q.b bVar, List<c.d<y>> list, m mVar, int i14) {
        boolean z14;
        boolean zK;
        Object objQ;
        x1 x1Var = n.f135158a;
        Executor executor = (Executor) mVar.A(f108336a);
        if (executor == null || !b(cVar.f157138b.length())) {
            mVar.C(-523310345);
        } else {
            mVar.C(-518761746);
            o oVar = (o) mVar.A(t1.f91496n);
            g6.c cVar2 = (g6.c) mVar.A(t1.f91490h);
            if (((i14 & 112) ^ 48) > 32) {
                try {
                    if (mVar.B(x0Var)) {
                        z14 = true;
                    } else if ((i14 & 48) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zK = z14 | mVar.k(oVar.ordinal()) | mVar.r(list) | ((((i14 & 14) ^ 6) <= 4 && mVar.B(cVar)) || (i14 & 6) == 4) | mVar.B(cVar2) | mVar.r(bVar);
                    objQ = mVar.q();
                    if (zK) {
                        z zVar = new z(x0Var, oVar, list, cVar, cVar2, bVar, 0);
                        mVar.K(zVar);
                        objQ = zVar;
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            z zVar2 = new z(x0Var, oVar, list, cVar, cVar2, bVar, 0);
                            mVar.K(zVar2);
                            objQ = zVar2;
                        }
                    }
                    executor.execute((Runnable) objQ);
                } catch (RejectedExecutionException unused) {
                }
            } else {
                if ((i14 & 48) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK = z14 | mVar.k(oVar.ordinal()) | mVar.r(list) | ((((i14 & 14) ^ 6) <= 4 && mVar.B(cVar)) || (i14 & 6) == 4) | mVar.B(cVar2) | mVar.r(bVar);
                objQ = mVar.q();
                if (zK) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        z zVar3 = new z(x0Var, oVar, list, cVar, cVar2, bVar, 0);
                        mVar.K(zVar3);
                        objQ = zVar3;
                    }
                } else {
                    z zVar4 = new z(x0Var, oVar, list, cVar, cVar2, bVar, 0);
                    mVar.K(zVar4);
                    objQ = zVar4;
                }
                executor.execute((Runnable) objQ);
            }
        }
        mVar.f();
        x1 x1Var2 = n.f135158a;
    }

    public static final boolean b(int i14) {
        if (i14 >= 8 && i14 < 1000) {
            if (f108337b == null) {
                f108337b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f108337b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
