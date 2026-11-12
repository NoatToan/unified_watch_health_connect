package pl1;

import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import l72.p2;
import ov1.u;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p40.o0;
import v.h;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ol1.c f138525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f138526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f138527d;

    public /* synthetic */ c(ol1.c cVar, String str, d dVar, int i14) {
        this.f138524a = i14;
        this.f138525b = cVar;
        this.f138526c = str;
        this.f138527d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x016c  */
    /* JADX WARN: Code duplicated, block: B:48:0x01cb  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f138524a;
        d dVar = this.f138527d;
        String str = this.f138526c;
        ol1.c cVar = this.f138525b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d.a aVar = d.f138528n;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-121584700, new c(cVar, str, dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d.a aVar2 = d.f138528n;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar3, mVar2);
                    g.V.getClass();
                    e0.a aVar4 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    if (cVar.f132839d != null) {
                        mVar2.C(-937929835);
                        p2.f111205a.h(gl1.y.Q(mVar2, R.string.activity_details_event_type), cVar.f132839d, null, null, null, false, false, null, null, null, null, mVar2, 0, 0, 2044);
                        mVar2.f();
                    } else {
                        mVar2.C(-937777036);
                        mVar2.f();
                    }
                    j0 j0Var = j0.f23099a;
                    String str2 = cVar.f132840e;
                    j0Var.getClass();
                    String string = j0.c(str2, "yyyy-MM-dd", "MMMM dd, yyyy", str).toString();
                    p2 p2Var = p2.f111205a;
                    p2Var.h(gl1.y.Q(mVar2, R.string.txt_date), string, null, null, null, false, false, null, null, null, null, mVar2, 0, 0, 2044);
                    p2Var.h(gl1.y.Q(mVar2, R.string.starttime), j0.c(cVar.f132841f, "HH:mm", "h:mm a", str).toString(), null, null, null, false, false, null, null, null, null, mVar2, 0, 0, 2044);
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_location);
                    String str3 = cVar.f132842g;
                    p2Var.h(strQ, str3 == null ? str : str3, null, null, null, false, false, null, null, null, null, mVar2, 0, 0, 2044);
                    Long l14 = cVar.f132843h;
                    m.a aVar5 = m.f135153a;
                    if (l14 != null) {
                        mVar2.C(-936892141);
                        String strQ2 = gl1.y.Q(mVar2, R.string.title_course);
                        String str4 = cVar.f132844i;
                        String str5 = str4 == null ? str : str4;
                        boolean zR = mVar2.r(dVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new u(dVar, 14);
                            mVar2.K(objQ);
                        } else {
                            aVar5.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new u(dVar, 14);
                                mVar2.K(objQ);
                            }
                        }
                        p2Var.h(strQ2, str5, null, null, null, false, false, null, null, null, (e23.a) objQ, mVar2, 0, 0, 1020);
                        mVar2.f();
                    } else {
                        mVar2.C(-936645164);
                        mVar2.f();
                    }
                    if (cVar.f132845j != null) {
                        mVar2.C(-936527798);
                        String strQ3 = gl1.y.Q(mVar2, R.string.lbl_website);
                        String str6 = cVar.f132845j;
                        a.f138520a.getClass();
                        z3.e eVar = a.f138521b;
                        boolean zR2 = mVar2.r(cVar) | mVar2.r(dVar);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new o0(7, cVar, dVar);
                            mVar2.K(objQ2);
                        } else {
                            aVar5.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new o0(7, cVar, dVar);
                                mVar2.K(objQ2);
                            }
                        }
                        p2Var.h(strQ3, str6, null, null, null, false, false, null, eVar, null, (e23.a) objQ2, mVar2, 100663296, 0, 764);
                        mVar2.f();
                    } else {
                        mVar2.C(-935503372);
                        mVar2.f();
                    }
                    if (cVar.f132846k != null) {
                        mVar2.C(-935421780);
                        p2Var.h(gl1.y.Q(mVar2, R.string.lbl_note), cVar.f132846k, null, null, null, false, false, null, null, null, null, mVar2, 0, 0, 2044);
                        mVar2.f();
                    } else {
                        mVar2.C(-935291084);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
