package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5636b;

    public /* synthetic */ m2(Object obj, int i14) {
        this.f5635a = i14;
        this.f5636b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.impl.l2.d
    public final void a(l2 l2Var, l2.g gVar) {
        int i14 = this.f5635a;
        int i15 = 1;
        Object obj = this.f5636b;
        switch (i14) {
            case 0:
                Iterator it = ((l2.h) obj).f5628n.iterator();
                while (it.hasNext()) {
                    ((l2.d) it.next()).a(l2Var, gVar);
                }
                break;
            case 1:
                b0.l0 l0Var = (b0.l0) obj;
                b0.l0.c cVar = b0.l0.C;
                if (l0Var.c() != null) {
                    l0Var.f14023z.pause();
                    l0Var.F(true);
                    String strE = l0Var.e();
                    l1 l1Var = (l1) l0Var.f13969h;
                    q2 q2Var = l0Var.f13970i;
                    q2Var.getClass();
                    l2.b bVarG = l0Var.G(strE, l1Var, q2Var);
                    l0Var.f14021x = bVarG;
                    Object[] objArr = {bVarG.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    l0Var.E(Collections.unmodifiableList(arrayList));
                    l0Var.q();
                    l0Var.f14023z.resume();
                    break;
                }
                break;
            case 2:
                b0.w0 w0Var = (b0.w0) obj;
                b0.w0.b bVar = b0.w0.f14076z;
                if (w0Var.c() != null) {
                    w0Var.H((d2) w0Var.f13969h, w0Var.f13970i);
                    w0Var.q();
                    break;
                }
                break;
            case 3:
                v.w1 w1Var = (v.w1) obj;
                w1Var.f174107b = w1Var.a();
                v.w1.c cVar2 = w1Var.f174110e;
                if (cVar2 != null) {
                    v.s sVar = ((v.n) cVar2).f173936b;
                    k0.h hVar = sVar.f174008c;
                    try {
                        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
                        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
                        aVar.f6080b = dVar;
                        aVar.f6079a = v.h.class;
                        try {
                            try {
                                hVar.execute(new v.p(sVar, aVar, i15));
                            } catch (RejectedExecutionException unused) {
                                aVar.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                            }
                            aVar.f6079a = "isMeteringRepeatingAttached";
                        } catch (Exception e4) {
                            dVar.a(e4);
                        }
                        if (((Boolean) dVar.f6084b.get()).booleanValue()) {
                            v.w1 w1Var2 = sVar.D;
                            hVar.execute(new v.q(sVar, v.s.w(w1Var2), w1Var2.f174107b, w1Var2.f174108c, null, Collections.singletonList(c3.b.METERING_REPEATING), 1));
                            break;
                        }
                    } catch (InterruptedException | ExecutionException e14) {
                        r1.q2.v("Unable to check if MeteringRepeating is attached.", e14);
                        return;
                    }
                }
                break;
            default:
                z0.h0.c cVar3 = z0.h0.G;
                ((z0.h0) obj).N();
                break;
        }
    }
}
