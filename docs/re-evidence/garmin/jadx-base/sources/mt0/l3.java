package mt0;

import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/l3;", "Lmt0/m3$c;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l3 implements m3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<ot0.g>> f120703a = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<ot0.g>> f120704b = new androidx.lifecycle.y0<>();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mt0.m3.c
    public final Object a(ArrayList arrayList, v13.c cVar) {
        k3 k3Var;
        ArrayList arrayList2;
        if (cVar instanceof k3) {
            k3Var = (k3) cVar;
            int i14 = k3Var.f120688d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k3Var.f120688d = i14 - Integer.MIN_VALUE;
            } else {
                k3Var = new k3(this, cVar);
            }
        } else {
            k3Var = new k3(this, cVar);
        }
        Object obj = k3Var.f120686b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k3Var.f120688d;
        if (i15 == 0) {
            o13.r.b(obj);
            ArrayList arrayList3 = new ArrayList(p13.h0.C0(p13.x.m(ot0.g.ALL_CHALLENGES), p13.h0.M0(arrayList)));
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            k3Var.f120685a = arrayList3;
            k3Var.f120688d = 1;
            Object objL = j1Var.l(qVar, k3Var);
            if (objL == aVar) {
                return aVar;
            }
            obj = objL;
            arrayList2 = arrayList3;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = k3Var.f120685a;
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ot0.g gVar = ot0.g.GC_PLUS;
            if (arrayList2.contains(gVar)) {
                arrayList2.remove(gVar);
                arrayList2.add(0, gVar);
                ot0.g gVar2 = ot0.g.ALL_CHALLENGES;
                arrayList2.remove(gVar2);
                arrayList2.add(0, gVar2);
            }
        }
        this.f120703a.m(arrayList2);
        androidx.lifecycle.y0<List<ot0.g>> y0Var = this.f120704b;
        List<ot0.g> listD = y0Var.d();
        ArrayList arrayList4 = listD != null ? new ArrayList(listD) : new ArrayList();
        arrayList4.removeIf(new a73.n(new aq1.d0(arrayList2, 17), 20));
        y0Var.m(arrayList4);
        return Unit.INSTANCE;
    }

    @Override // mt0.m3.c
    public final androidx.lifecycle.y0<List<ot0.g>> b() {
        return this.f120704b;
    }
}
