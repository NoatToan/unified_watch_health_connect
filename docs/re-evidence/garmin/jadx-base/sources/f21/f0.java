package f21;

import c2.x2;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import vd0.b1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68521a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f68522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f68523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o13.h f68524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o13.h f68525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f68526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f68527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f68528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f68529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f68531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o13.h f68532l;

    public /* synthetic */ f0(e23.a aVar, e23.a aVar2, e23.p pVar, e23.p pVar2, gg1.o0 o0Var, i53.c cVar, String str, p1 p1Var, rk0.f0 f0Var, boolean z14, boolean z15) {
        this.f68522b = z14;
        this.f68523c = z15;
        this.f68526f = aVar;
        this.f68527g = f0Var;
        this.f68528h = cVar;
        this.f68529i = o0Var;
        this.f68530j = p1Var;
        this.f68524d = pVar;
        this.f68525e = pVar2;
        this.f68531k = str;
        this.f68532l = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b5  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f68521a;
        o13.h hVar = this.f68532l;
        Object obj3 = this.f68529i;
        Object obj4 = this.f68531k;
        Object obj5 = this.f68530j;
        o13.h hVar2 = this.f68525e;
        o13.h hVar3 = this.f68524d;
        Object obj6 = this.f68528h;
        Object obj7 = this.f68527g;
        Object obj8 = this.f68526f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                h0.a((h4.r) obj8, (v21.e) obj7, (g21.f) obj6, (e23.p) hVar3, (e23.l) obj3, (e23.p) hVar2, (e23.l) obj5, (e23.l) obj4, (gw1.d) hVar, this.f68522b, this.f68523c, (p3.m) obj, p0.t(1));
                break;
            case 1:
                e23.a aVar = (e23.a) obj8;
                rk0.f0 f0Var = (rk0.f0) obj7;
                i53.c cVar = (i53.c) obj6;
                gg1.o0 o0Var = (gg1.o0) obj3;
                p1 p1Var = (p1) obj5;
                e23.p pVar = (e23.p) hVar3;
                e23.p pVar2 = (e23.p) hVar2;
                String str = (String) obj4;
                e23.a aVar2 = (e23.a) hVar;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    m3.s sVarE = m3.l.e(mVar);
                    boolean z14 = this.f68522b;
                    boolean z15 = false;
                    boolean z16 = this.f68523c;
                    if (z14 && z16) {
                        z15 = true;
                    }
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    boolean zB = mVar.B(aVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new qk0.o(aVar, 29);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new qk0.o(aVar, 29);
                            mVar.K(objQ);
                        }
                    }
                    m3.l.b(z15, (e23.a) objQ, rVarD, sVarE, null, z3.f.c(1144339221, new p003ji0.e(z15, sVarE, 8), mVar), z3.f.c(-615115754, new cq.j(aVar, aVar2, pVar, pVar2, o0Var, cVar, str, p1Var, f0Var, z14, z16), mVar), mVar, 1769856, 16);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b1.a((pe0.f) obj8, this.f68522b, this.f68523c, (e23.a) obj7, (e23.a) obj6, (e23.a) hVar3, (e23.a) hVar2, (e23.a) obj5, (zc.d) obj4, (e23.l) obj3, (e23.a) hVar, (p3.m) obj, p0.t(134217729));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f0(h4.r rVar, v21.e eVar, g21.f fVar, e23.p pVar, e23.l lVar, e23.p pVar2, e23.l lVar2, e23.l lVar3, gw1.d dVar, boolean z14, boolean z15, int i14) {
        this.f68526f = rVar;
        this.f68527g = eVar;
        this.f68528h = fVar;
        this.f68524d = pVar;
        this.f68529i = lVar;
        this.f68525e = pVar2;
        this.f68530j = lVar2;
        this.f68531k = lVar3;
        this.f68532l = dVar;
        this.f68522b = z14;
        this.f68523c = z15;
    }

    public /* synthetic */ f0(pe0.f fVar, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, zc.d dVar, e23.l lVar, e23.a aVar6, int i14) {
        this.f68526f = fVar;
        this.f68522b = z14;
        this.f68523c = z15;
        this.f68527g = aVar;
        this.f68528h = aVar2;
        this.f68524d = aVar3;
        this.f68525e = aVar4;
        this.f68530j = aVar5;
        this.f68531k = dVar;
        this.f68529i = lVar;
        this.f68532l = aVar6;
    }
}
