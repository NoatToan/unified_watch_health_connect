package vd0;

import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w1 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f177424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f177425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177426c;

    public w1(List list, i53.c cVar, p3.p1 p1Var) {
        this.f177424a = list;
        this.f177425b = cVar;
        this.f177426c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        pe0.d dVar2;
        boolean z14;
        String strL;
        String strW;
        z3.e eVarC;
        i53.c cVar;
        e2.d dVar3 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar3) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            pe0.d dVar4 = (pe0.d) this.f177424a.get(iIntValue);
            mVar2.C(613471606);
            p3.p1 p1Var = this.f177426c;
            boolean z15 = dVar4 != null ? !((dVar2 = (pe0.d) p1Var.getF182175a()) == null || dVar2.f137416a != dVar4.f137416a) : ((pe0.d) p1Var.getF182175a()) == null;
            if (dVar4 != null && ((cVar = this.f177425b) == null || !cVar.isEmpty())) {
                Iterator<E> it = cVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    if (((pe0.d) it.next()).f137416a == dVar4.f137416a) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            p2 p2Var = p2.f111205a;
            if (dVar4 == null) {
                strL = sn.a.h(mVar2, -1642770799, R.string.gender_not_specified, mVar2);
            } else {
                mVar2.C(-1642769188);
                strL = oi0.c.l(dVar4.f137417b, mVar2);
                mVar2.f();
            }
            if (z14) {
                mVar2.C(-1642766448);
                c22.x0.f23314a.getClass();
                strW = gl1.d.W(c22.x0.L8);
                mVar2.f();
            } else {
                mVar2.C(613895962);
                mVar2.f();
                strW = "";
            }
            boolean z16 = z15 || z14;
            String str = strW;
            boolean z17 = !z14;
            if (z15 || z14) {
                mVar2.C(614120993);
                eVarC = z3.f.c(-1301418464, new r1(z14), mVar2);
                mVar2.f();
            } else {
                mVar2.C(614679458);
                mVar2.f();
                eVarC = null;
            }
            z3.e eVar = eVarC;
            boolean zH = mVar2.h(z14) | mVar2.h(z15) | mVar2.B(dVar4);
            Object objQ = mVar2.q();
            if (zH) {
                objQ = new s1(z14, z15, dVar4, p1Var);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s1(z14, z15, dVar4, p1Var);
                    mVar2.K(objQ);
                }
            }
            p2Var.h(strL, str, null, null, null, z17, z16, null, eVar, null, (e23.a) objQ, mVar2, 0, 0, 668);
            mVar2.f();
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
