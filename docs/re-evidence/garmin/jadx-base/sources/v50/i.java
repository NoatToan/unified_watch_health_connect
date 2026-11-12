package v50;

import e23.l;
import e23.r;
import gg1.o0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i implements r<e2.d, Integer, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f175754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x50.e f175755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f175756c;

    public i(List list, x50.e eVar, l lVar) {
        this.f175754a = list;
        this.f175755b = eVar;
        this.f175756c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            x50.a aVar = (x50.a) this.f175754a.get(iIntValue);
            mVar2.C(61746668);
            x50.e eVar = this.f175755b;
            boolean z14 = eVar.f189004d;
            o0 o0Var = eVar.f189005e;
            boolean zB = mVar2.B(aVar);
            l lVar = this.f175756c;
            boolean zB2 = zB | mVar2.B(lVar);
            Object objQ = mVar2.q();
            m.a aVar2 = m.f135153a;
            if (zB2) {
                objQ = new c(aVar, lVar);
                mVar2.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c(aVar, lVar);
                    mVar2.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean zB3 = mVar2.B(aVar) | mVar2.B(lVar);
            Object objQ2 = mVar2.q();
            if (zB3) {
                objQ2 = new d(aVar, lVar);
                mVar2.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new d(aVar, lVar);
                    mVar2.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            boolean zB4 = mVar2.B(aVar) | mVar2.B(lVar);
            Object objQ3 = mVar2.q();
            if (zB4) {
                objQ3 = new e(aVar, lVar);
                mVar2.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new e(aVar, lVar);
                    mVar2.K(objQ3);
                }
            }
            b.b(aVar, z14, o0Var, aVar3, aVar4, (e23.a) objQ3, mVar2, 0);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
