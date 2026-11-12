package xx1;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j02.d0;
import j02.h0;
import java.util.Iterator;
import l72.c1;
import l72.p2;
import lm0.o;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import ug2.q;
import yg2.q0;
import yg2.u0;
import yz1.a0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f192554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f192555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f192556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f192557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f192558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f192559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f192560h;

    public /* synthetic */ c(dy1.g gVar, p pVar, l lVar, l lVar2, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f192553a = 1;
        this.f192554b = gVar;
        this.f192555c = pVar;
        this.f192556d = lVar;
        this.f192557e = lVar2;
        this.f192558f = aVar;
        this.f192559g = aVar2;
        this.f192560h = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0437  */
    /* JADX WARN: Code duplicated, block: B:36:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0301  */
    /* JADX WARN: Code duplicated, block: B:73:0x033c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0418  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        dy1.g gVar;
        dy1.h hVar;
        String str;
        int i14 = this.f192553a;
        m.a aVar = m.f135153a;
        Object obj3 = this.f192558f;
        Object obj4 = this.f192557e;
        Object obj5 = this.f192556d;
        Object obj6 = this.f192555c;
        Object obj7 = this.f192560h;
        Object obj8 = this.f192559g;
        Object obj9 = this.f192554b;
        switch (i14) {
            case 0:
                dy1.g gVar2 = (dy1.g) obj9;
                p1 p1Var = (p1) obj8;
                l lVar = (l) obj5;
                p1 p1Var2 = (p1) obj7;
                p pVar = (p) obj6;
                l lVar2 = (l) obj4;
                e23.a aVar2 = (e23.a) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar3 = r.S;
                    r rVarD = x2.d(aVar3, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81537o;
                    j jVar = j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    jVar.getClass();
                    z zVarA = y.a(j.i(f14), aVar4, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarD, mVar);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    i0 i0VarA = k0.a(0, 0, 3, mVar);
                    boolean zB = mVar.B(pVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new f.b(pVar, null);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new f.b(pVar, null);
                            mVar.K(objQ);
                        }
                    }
                    h0 h0VarB = d0.b(i0VarA, (e23.r) objQ, mVar);
                    r rVarA = b0Var.a(aVar3, 1.0f, false);
                    boolean zB2 = mVar.B(gVar2) | mVar.B(h0VarB) | mVar.B(p1Var2) | mVar.B(p1Var) | mVar.B(lVar2);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        gVar = gVar2;
                        q qVar = new q((Object) gVar, (Object) h0VarB, p1Var2, p1Var, (Object) lVar2, 14);
                        mVar.K(qVar);
                        objQ2 = qVar;
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            gVar = gVar2;
                            q qVar2 = new q((Object) gVar, (Object) h0VarB, p1Var2, p1Var, (Object) lVar2, 14);
                            mVar.K(qVar2);
                            objQ2 = qVar2;
                        } else {
                            gVar = gVar2;
                        }
                    }
                    e2.c.b(rVarA, i0VarA, null, null, aVar4, null, false, null, (l) objQ2, mVar, 196608, 476);
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_add_accessory_lift);
                    a.f192534a.getClass();
                    p2Var.g(strQ, null, null, null, a.f192535b, gVar.f61555b.size() <= 10, false, aVar2, mVar, 24576, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
                    mVar.y();
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar.C(408863995);
                        c1 c1Var = c1.f110940a;
                        Iterator<dy1.h> it = gVar.f61555b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                dy1.h next = it.next();
                                if (s.g(next.f61556a, (String) p1Var.getF182175a())) {
                                    hVar = next;
                                }
                            } else {
                                hVar = null;
                            }
                        }
                        dy1.h hVar2 = hVar;
                        if (hVar2 == null || (str = hVar2.f61563h) == null) {
                            str = "";
                        }
                        String strP = gl1.y.P(R.string.common_delete_object, new Object[]{str}, mVar);
                        String strQ2 = gl1.y.Q(mVar, R.string.lbl_delete);
                        String strQ3 = gl1.y.Q(mVar, R.string.lbl_cancel);
                        boolean zB3 = mVar.B(p1Var) | mVar.B(lVar) | mVar.B(p1Var2);
                        Object objQ3 = mVar.q();
                        if (zB3) {
                            objQ3 = new o(p1Var, lVar, p1Var2, 8);
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new o(p1Var, lVar, p1Var2, 8);
                                mVar.K(objQ3);
                            }
                        }
                        e23.a<Unit> aVar6 = (e23.a) objQ3;
                        boolean zB4 = mVar.B(p1Var2);
                        Object objQ4 = mVar.q();
                        if (zB4) {
                            objQ4 = new x91.d(p1Var2, 7);
                            mVar.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new x91.d(p1Var2, 7);
                                mVar.K(objQ4);
                            }
                        }
                        c1 c1Var2 = c1.f110940a;
                        c1Var.a(false, null, strP, null, null, strQ2, true, false, aVar6, strQ3, (e23.a) objQ4, mVar, 1572870, 0, 154);
                        mVar.f();
                    } else {
                        mVar.C(409680194);
                        mVar.f();
                    }
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                f.a((dy1.g) obj9, (p) obj6, (l) obj5, (l) obj4, (e23.a) obj3, (e23.a) obj8, (e23.a) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                q0.d((yg2.a) obj9, (yg2.o) obj8, (yg2.h0) obj7, (u0) obj4, (i0) obj6, (o53.b0) obj3, (l) obj5, (m) obj, p0.t(1572865));
                return Unit.INSTANCE;
            case 3:
                a0.a aVar7 = (a0.a) obj9;
                c02.c cVar = (c02.c) obj8;
                i53.c cVar2 = (i53.c) obj7;
                String str2 = (String) obj5;
                String str3 = (String) obj6;
                String str4 = (String) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar8 = r.S;
                    r rVarD2 = x2.d(aVar8, 1.0f);
                    j.f22691a.getClass();
                    j.b bVar2 = j.f22695e;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(bVar2, h4.d.a.f81536n, mVar2, 6);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = k.c(rVarD2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    if (aVar7 != null) {
                        mVar2.C(-306985884);
                        if (cVar == null || cVar2 == null) {
                            mVar2.C(-306506903);
                            r rVarF = x2.f(aVar8, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            mh.c(str2, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 48, 0, 131068);
                            mVar2.f();
                        } else {
                            mVar2.C(-306900572);
                            c02.n.a(x2.f(aVar8, 1.0f), cVar2, cVar, null, c02.n.b(cVar), 0, null, false, mVar2, 3078, 224);
                            mVar2.f();
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(-304801097);
                        mVar2.f();
                    }
                    boolean zB5 = mVar2.B(str4);
                    Object objQ5 = mVar2.q();
                    if (zB5) {
                        objQ5 = new y01.k(str4, 18);
                        mVar2.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new y01.k(str4, 18);
                            mVar2.K(objQ5);
                        }
                    }
                    r rVarF2 = x2.f(v.c((l) objQ5, aVar8, false), 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarC3 = c2.l.C(rVarF2, 0.0f, eVar.f97917b, 0.0f, eVar.f97920e, 5);
                    d92.b.f58624b.getClass();
                    mh.c(str3, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                z12.d.a((r) obj9, (String) obj8, (String) obj7, (String) obj4, (String) obj6, this.f192558f, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(dy1.g gVar, p1 p1Var, l lVar, p1 p1Var2, p pVar, l lVar2, e23.a aVar) {
        this.f192553a = 0;
        this.f192554b = gVar;
        this.f192559g = p1Var;
        this.f192556d = lVar;
        this.f192560h = p1Var2;
        this.f192555c = pVar;
        this.f192557e = lVar2;
        this.f192558f = aVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, l lVar, int i14, int i15) {
        this.f192553a = i15;
        this.f192554b = obj;
        this.f192559g = obj2;
        this.f192560h = obj3;
        this.f192557e = obj4;
        this.f192555c = obj5;
        this.f192558f = obj6;
        this.f192556d = lVar;
    }

    public /* synthetic */ c(a0.a aVar, c02.c cVar, i53.c cVar2, String str, i53.f fVar, String str2, String str3) {
        this.f192553a = 3;
        this.f192554b = aVar;
        this.f192559g = cVar;
        this.f192560h = cVar2;
        this.f192556d = str;
        this.f192557e = fVar;
        this.f192555c = str2;
        this.f192558f = str3;
    }
}
