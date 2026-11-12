package w51;

import android.content.Context;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f182427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f182428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f182429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f182430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f182431e;

    public u(List list, h0 h0Var, Context context, b63.o oVar, e23.l lVar) {
        this.f182427a = list;
        this.f182428b = h0Var;
        this.f182429c = context;
        this.f182430d = oVar;
        this.f182431e = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
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
            x1 x1Var = p3.n.f135158a;
            z51.h hVar = (z51.h) this.f182427a.get(iIntValue);
            mVar2.C(-71857947);
            h4.r rVarC = e2.d.c(dVar2, h4.r.S);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(rVarC, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            h0 h0Var = this.f182428b;
            boolean zR = mVar2.r(h0Var);
            Context context = this.f182429c;
            boolean zR2 = zR | mVar2.r(context);
            b63.o oVar = this.f182430d;
            boolean zR3 = zR2 | mVar2.r(oVar);
            Object objQ = mVar2.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR3) {
                objQ = new o(h0Var, context, oVar);
                mVar2.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new o(h0Var, context, oVar);
                    mVar2.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR4 = mVar2.r(h0Var) | mVar2.r(oVar);
            Object objQ2 = mVar2.q();
            if (zR4) {
                objQ2 = new p(h0Var, oVar);
                mVar2.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new p(h0Var, oVar);
                    mVar2.K(objQ2);
                }
            }
            e23.l lVar2 = (e23.l) objQ2;
            e23.l lVar3 = this.f182431e;
            boolean zB = mVar2.B(lVar3);
            Object objQ3 = mVar2.q();
            if (zB) {
                objQ3 = new q(lVar3);
                mVar2.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new q(lVar3);
                    mVar2.K(objQ3);
                }
            }
            v.b(hVar, rVarC2, lVar, lVar2, (e23.l) objQ3, mVar2, z51.h.f202503m);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
