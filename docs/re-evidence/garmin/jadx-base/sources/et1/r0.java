package et1;

import android.content.Context;
import i3.fe;
import i3.mc;
import java.util.List;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65803a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f65804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f65805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f65806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f65807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f65808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f65809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f65810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f65811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f65812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f65813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f65814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f65815m;

    public /* synthetic */ r0(h2.b bVar, p3.p1 p1Var, mc mcVar, e23.l lVar, boolean z14, zc.d dVar, e23.l lVar2, fe feVar, pt1.n nVar, p3.p1 p1Var2, e23.p pVar, e23.l lVar3) {
        this.f65808f = bVar;
        this.f65806d = p1Var;
        this.f65809g = mcVar;
        this.f65810h = lVar;
        this.f65805c = z14;
        this.f65804b = dVar;
        this.f65811i = lVar2;
        this.f65813k = feVar;
        this.f65814l = nVar;
        this.f65807e = p1Var2;
        this.f65815m = pVar;
        this.f65812j = lVar3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f65803a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f65815m;
        Object obj5 = this.f65814l;
        p3.p1 p1Var = this.f65806d;
        Object obj6 = this.f65813k;
        Object obj7 = this.f65812j;
        Object obj8 = this.f65811i;
        Object obj9 = this.f65810h;
        Object obj10 = this.f65809g;
        Object obj11 = this.f65808f;
        switch (i14) {
            case 0:
                h2.b bVar = (h2.b) obj11;
                mc mcVar = (mc) obj10;
                e23.l lVar = (e23.l) obj9;
                e23.l lVar2 = (e23.l) obj8;
                fe feVar = (fe) obj6;
                pt1.n nVar = (pt1.n) obj5;
                e23.p pVar = (e23.p) obj4;
                e23.l lVar3 = (e23.l) obj7;
                c2.w wVar = (c2.w) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(wVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h2.u.a(bVar, null, null, null, 2, 0.0f, null, null, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-1362334276, new aa2.r(17, lVar2, this.f65804b, wVar), mVar), mVar, 24576, 24576, 16110);
                    if (mcVar.e()) {
                        mVar.C(-1931242280);
                        boolean zB = mVar.B(lVar);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new e40.g(lVar, 13);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e40.g(lVar, 13);
                                mVar.K(objQ);
                            }
                        }
                        zs1.u.a(mcVar, (e23.a) objQ, null, this.f65805c, z3.f.c(-2109511109, new ak0.o(feVar, 10), mVar), z3.f.c(160041363, new ak0.j(nVar, this.f65807e, lVar, pVar, lVar3, 16), mVar), mVar, 221184);
                        mVar.f();
                    } else {
                        mVar.C(-1929598009);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                List list = (List) obj11;
                mi0.c cVar = (mi0.c) obj10;
                u2.h hVar = (u2.h) obj9;
                e2.i0 i0Var = (e2.i0) obj8;
                e2.i0 i0Var2 = (e2.i0) obj7;
                Context context = (Context) obj6;
                x3 x3Var = (x3) obj5;
                x3 x3Var2 = (x3) obj4;
                int iIntValue2 = ((Integer) obj).intValue();
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar2.k(iIntValue2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i15 = ii0.m.a.f93670a[((p003ji0.j) list.get(iIntValue2)).ordinal()];
                    if (i15 == 1) {
                        mVar2.C(359571143);
                        mi0.c.d dVar = cVar.f118711c;
                        boolean z14 = this.f65805c;
                        ii0.r0.a(this.f65804b, dVar, hVar, i0Var, z14 && !((Boolean) p1Var.getF182175a()).booleanValue(), mVar2, 8 | (li0.f.f112658h << 3));
                        if (z14) {
                            p1Var.setValue(Boolean.TRUE);
                        }
                        mVar2.f();
                    } else {
                        if (i15 != 2) {
                            throw n23.j.m(mVar2, 2089807251);
                        }
                        mVar2.C(360205744);
                        List list2 = (List) x3Var.getF182175a();
                        mi0.c.d dVar2 = cVar.f118711c;
                        boolean zBooleanValue = ((Boolean) x3Var2.getF182175a()).booleanValue();
                        boolean zR = mVar2.r(cVar) | mVar2.r(context);
                        Object objQ2 = mVar2.q();
                        if (zR) {
                            objQ2 = new i91.c(7, cVar, context);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new i91.c(7, cVar, context);
                                mVar2.K(objQ2);
                            }
                        }
                        ii0.k.a(list2, dVar2, i0Var2, zBooleanValue, (e23.a) objQ2, mVar2, li0.f.f112658h << 3);
                        p3.p1 p1Var2 = this.f65807e;
                        if (!((Boolean) p1Var2.getF182175a()).booleanValue()) {
                            p1Var2.setValue(Boolean.TRUE);
                            cVar.y4(context);
                        }
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r0(List list, zc.d dVar, mi0.c cVar, u2.h hVar, e2.i0 i0Var, boolean z14, e2.i0 i0Var2, Context context, p3.p1 p1Var, x3 x3Var, x3 x3Var2, p3.p1 p1Var2) {
        this.f65808f = list;
        this.f65804b = dVar;
        this.f65809g = cVar;
        this.f65810h = hVar;
        this.f65811i = i0Var;
        this.f65805c = z14;
        this.f65812j = i0Var2;
        this.f65813k = context;
        this.f65806d = p1Var;
        this.f65814l = x3Var;
        this.f65815m = x3Var2;
        this.f65807e = p1Var2;
    }
}
