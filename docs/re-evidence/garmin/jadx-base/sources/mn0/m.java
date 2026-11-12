package mn0;

import com.garmin.android.apps.connectmobile.k1;
import java.util.LinkedHashSet;
import o13.q;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmn0/m;", "", "Lmn0/p;", "delegate", "<init>", "(Lmn0/p;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f119749a;

    public m(p pVar) {
        pVar.getClass();
        this.f119749a = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j8, v13.c cVar) {
        k kVar;
        LinkedHashSet linkedHashSet;
        Boolean bool;
        Boolean bool2;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f119745d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f119745d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f119743b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f119745d;
        if (i15 == 0) {
            r.b(obj);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            bv.b.f21239a.getClass();
            bv.b.a();
            k1 k1Var = k1.f37122a;
            k1Var.getClass();
            if (!bo1.a.a().c().m()) {
                linkedHashSet2.add(in0.m.HEART_RATE);
            }
            if (!k1Var.h()) {
                linkedHashSet2.add(in0.m.HRV);
            }
            if (!bo1.a.a().c().B0()) {
                linkedHashSet2.add(in0.m.SKIN_TEMP_C);
                linkedHashSet2.add(in0.m.SKIN_TEMP_F);
            }
            if (!bo1.a.a().c().m0()) {
                linkedHashSet2.add(in0.m.RESPIRATION);
            }
            e12.e eVarC = bo1.a.a().c();
            if (!eVarC.T0() || !eVarC.j0()) {
                linkedHashSet2.add(in0.m.PULSE_OX);
            }
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            l lVar = new l(this, j8, null);
            kVar.f119742a = linkedHashSet2;
            kVar.f119745d = 1;
            Object objE0 = ge1.b.e0(bVar, lVar, kVar);
            if (objE0 == aVar) {
                return aVar;
            }
            obj = objE0;
            linkedHashSet = linkedHashSet2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashSet = kVar.f119742a;
            r.b(obj);
        }
        in0.f fVar = (in0.f) obj;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        if (fVar != null && (bool2 = fVar.f94440a) != null && !bool2.booleanValue()) {
            linkedHashSet3.add(in0.m.PULSE_OX);
        }
        boolean z14 = (fVar == null || (bool = fVar.f94441b) == null || bool.booleanValue()) ? false : true;
        int i16 = q.f128596b;
        return new in0.g(i53.a.h(linkedHashSet), i53.a.h(linkedHashSet3), z14);
    }
}
