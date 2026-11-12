package vd0;

import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e2 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f177243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pe0.d f177244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177245c;

    public e2(List list, pe0.d dVar, p3.p1 p1Var) {
        this.f177243a = list;
        this.f177244b = dVar;
        this.f177245c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        boolean zIsEmpty;
        String strL;
        String strW;
        z3.e eVarC;
        pe0.d dVar2;
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
            pe0.d dVar4 = (pe0.d) this.f177243a.get(iIntValue);
            mVar2.C(-990800900);
            p3.p1 p1Var = this.f177245c;
            if (dVar4 != null) {
                i53.c cVar = (i53.c) p1Var.getF182175a();
                if (cVar != null && cVar.isEmpty()) {
                    zIsEmpty = false;
                    break;
                }
                Iterator<E> it = cVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zIsEmpty = false;
                        break;
                    }
                    if (((pe0.d) it.next()).f137416a == dVar4.f137416a) {
                        zIsEmpty = true;
                        break;
                    }
                }
            } else {
                zIsEmpty = ((i53.c) p1Var.getF182175a()).isEmpty();
            }
            boolean z14 = (dVar4 == null || (dVar2 = this.f177244b) == null || dVar2.f137416a != dVar4.f137416a) ? false : true;
            p2 p2Var = p2.f111205a;
            if (dVar4 == null) {
                strL = sn.a.h(mVar2, -1694521709, R.string.gender_not_specified, mVar2);
            } else {
                mVar2.C(-1694520098);
                strL = oi0.c.l(dVar4.f137417b, mVar2);
                mVar2.f();
            }
            if (z14) {
                mVar2.C(-1694517296);
                c22.x0.f23314a.getClass();
                strW = gl1.d.W(c22.x0.J8);
                mVar2.f();
            } else {
                mVar2.C(-990382248);
                mVar2.f();
                strW = "";
            }
            boolean z15 = zIsEmpty || z14;
            String str = strW;
            boolean z16 = !z14;
            if (zIsEmpty || z14) {
                mVar2.C(-990149839);
                eVarC = z3.f.c(126893570, new z1(z14), mVar2);
                mVar2.f();
            } else {
                mVar2.C(-989546920);
                mVar2.f();
                eVarC = null;
            }
            z3.e eVar = eVarC;
            boolean zH = mVar2.h(z14) | mVar2.B(dVar4) | mVar2.h(zIsEmpty);
            Object objQ = mVar2.q();
            if (zH) {
                objQ = new a2(z14, dVar4, zIsEmpty, p1Var);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a2(z14, dVar4, zIsEmpty, p1Var);
                    mVar2.K(objQ);
                }
            }
            p2Var.h(strL, str, null, null, null, z16, z15, null, eVar, null, (e23.a) objQ, mVar2, 0, 0, 668);
            mVar2.f();
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
