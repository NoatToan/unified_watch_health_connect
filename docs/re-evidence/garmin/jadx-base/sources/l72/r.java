package l72;

import i3.fb;
import i3.gb;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.j f111215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f111216c;

    public /* synthetic */ r(a2.j jVar, e23.a aVar, int i14) {
        this.f111214a = i14;
        this.f111215b = jVar;
        this.f111216c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0080  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f111214a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f111216c;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                s sVar = s.f111232a;
                rVar.getClass();
                mVar.C(212634912);
                p3.x1 x1Var = p3.n.f135158a;
                gb gbVarA = fb.a(0.0f, 6, 0L, true);
                boolean zB = mVar.B(aVar2);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new ku1.a(aVar2, 27);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ku1.a(aVar2, 27);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarB = u1.w.b(rVar, this.f111215b, gbVarA, true, null, null, (e23.a) objQ, 24);
                mVar.f();
                return rVarB;
            case 1:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                v.h.y(2075679331, rVar2, (Integer) obj3, mVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                gb gbVarA2 = fb.a(0.0f, 6, 0L, true);
                boolean zB2 = mVar2.B(aVar2);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new sg0.q0(aVar2, 5);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new sg0.q0(aVar2, 5);
                        mVar2.K(objQ2);
                    }
                }
                h4.r rVarB2 = u1.w.b(rVar2, this.f111215b, gbVarA2, false, null, null, (e23.a) objQ2, 28);
                mVar2.f();
                return rVarB2;
            default:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                v.h.y(-1833780470, rVar3, (Integer) obj3, mVar3);
                p3.x1 x1Var3 = p3.n.f135158a;
                h4.r.a aVar3 = h4.r.S;
                boolean zB3 = mVar3.B(aVar2);
                Object objQ3 = mVar3.q();
                if (zB3) {
                    objQ3 = new wv0.v(aVar2, 4);
                    mVar3.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new wv0.v(aVar2, 4);
                        mVar3.K(objQ3);
                    }
                }
                h4.r rVarThen = rVar3.then(u1.w.b(aVar3, this.f111215b, null, false, null, null, (e23.a) objQ3, 28));
                mVar3.f();
                return rVarThen;
        }
    }
}
