package e11;

import c2.x2;
import f5.k2;
import f5.v1;
import java.util.List;
import p005kotlin.Unit;
import p006l2.a2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61912a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f61915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f61916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f61917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f61918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f61919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f61920i;

    public /* synthetic */ l(h4.r rVar, i53.c cVar, v21.e eVar, boolean z14, boolean z15, e23.l lVar, e23.l lVar2, e23.a aVar, int i14) {
        this.f61920i = rVar;
        this.f61913b = cVar;
        this.f61914c = eVar;
        this.f61915d = z14;
        this.f61916e = z15;
        this.f61917f = lVar;
        this.f61918g = lVar2;
        this.f61919h = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:25:0x0129  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f61912a;
        Object obj3 = this.f61918g;
        Object obj4 = this.f61917f;
        Object obj5 = this.f61920i;
        Object obj6 = this.f61919h;
        Object obj7 = this.f61913b;
        Object obj8 = this.f61914c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                x.e((v21.e) obj8, (i53.c) obj7, this.f61915d, this.f61916e, (e23.a) obj6, (e23.a) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                x.d((h4.r) obj5, (i53.c) obj7, (v21.e) obj8, this.f61915d, this.f61916e, (e23.l) obj4, (e23.l) obj3, (e23.a) obj6, (p3.m) obj, p0.t(1));
                break;
            case 2:
                String str = (String) obj8;
                String str2 = (String) obj7;
                b92.a aVar = (b92.a) obj4;
                String str3 = (String) obj3;
                e23.a aVar2 = (e23.a) obj6;
                e23.a aVar3 = (e23.a) obj5;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i15 = b92.a.f16960b;
                    j21.j.a(null, str, str2, aVar, str3, this.f61915d, this.f61916e, aVar2, aVar3, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                e23.a aVar4 = (e23.a) obj6;
                m3.r rVar = (m3.r) obj8;
                e2.i0 i0Var = (e2.i0) obj7;
                k2 k2Var = (k2) obj5;
                v1 v1Var = (v1) obj3;
                e23.l lVar = (e23.l) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = this.f61915d;
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (z14) {
                        mVar2.C(-1136410619);
                        boolean zB = mVar2.B(aVar4);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new j22.d(aVar4, 4);
                            mVar2.K(objQ);
                        } else {
                            aVar5.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new j22.d(aVar4, 4);
                                mVar2.K(objQ);
                            }
                        }
                        boolean z15 = this.f61916e;
                        m3.l.b(z15, (e23.a) objQ, null, rVar, null, z3.f.c(2108321596, new p003ji0.e(rVar, z15), mVar2), z3.f.c(-805762051, new fb0.b((Object) i0Var, (Object) k2Var, (Object) v1Var, lVar, 14), mVar2), mVar2, 1769472, 20);
                        mVar2.f();
                    } else {
                        mVar2.C(-1135297347);
                        h4.r rVarD = x2.d(h4.r.S, 1.0f);
                        boolean zB2 = mVar2.B(k2Var) | mVar2.r(v1Var) | mVar2.B(lVar);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new p003ji0.c(lVar, k2Var, v1Var, 1);
                            mVar2.K(objQ2);
                        } else {
                            aVar5.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new p003ji0.c(lVar, k2Var, v1Var, 1);
                                mVar2.K(objQ2);
                            }
                        }
                        e2.c.b(rVarD, i0Var, null, null, null, null, false, null, (e23.l) objQ2, mVar2, 6, 508);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                qa0.h.a((String) obj8, (List) obj7, this.f61915d, this.f61916e, (e23.a) obj6, (e23.p) obj4, (e23.a) obj5, (e23.a) obj3, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                yy1.v.c((h4.r) obj8, (String) obj7, (String) obj6, (a2) obj5, (a2.j) obj4, this.f61915d, this.f61916e, (e23.p) obj3, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(h4.r rVar, String str, String str2, a2 a2Var, a2.j jVar, boolean z14, boolean z15, e23.p pVar, int i14) {
        this.f61914c = rVar;
        this.f61913b = str;
        this.f61919h = str2;
        this.f61920i = a2Var;
        this.f61917f = jVar;
        this.f61915d = z14;
        this.f61916e = z15;
        this.f61918g = pVar;
    }

    public /* synthetic */ l(String str, String str2, b92.a aVar, String str3, boolean z14, boolean z15, e23.a aVar2, e23.a aVar3) {
        this.f61914c = str;
        this.f61913b = str2;
        this.f61917f = aVar;
        this.f61918g = str3;
        this.f61915d = z14;
        this.f61916e = z15;
        this.f61919h = aVar2;
        this.f61920i = aVar3;
    }

    public /* synthetic */ l(String str, List list, boolean z14, boolean z15, e23.a aVar, e23.p pVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f61914c = str;
        this.f61913b = list;
        this.f61915d = z14;
        this.f61916e = z15;
        this.f61919h = aVar;
        this.f61917f = pVar;
        this.f61920i = aVar2;
        this.f61918g = aVar3;
    }

    public /* synthetic */ l(v21.e eVar, i53.c cVar, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, e23.l lVar, e23.l lVar2, int i14) {
        this.f61914c = eVar;
        this.f61913b = cVar;
        this.f61915d = z14;
        this.f61916e = z15;
        this.f61919h = aVar;
        this.f61920i = aVar2;
        this.f61917f = lVar;
        this.f61918g = lVar2;
    }

    public /* synthetic */ l(boolean z14, boolean z15, e23.a aVar, m3.r rVar, e2.i0 i0Var, k2 k2Var, v1 v1Var, e23.l lVar) {
        this.f61915d = z14;
        this.f61916e = z15;
        this.f61919h = aVar;
        this.f61914c = rVar;
        this.f61913b = i0Var;
        this.f61920i = k2Var;
        this.f61918g = v1Var;
        this.f61917f = lVar;
    }
}
