package g02;

import c2.h2;
import i3.fe;
import i3.mc;
import java.util.List;
import kd0.i6;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f74523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f74525f;

    public /* synthetic */ q0(int i14, int i15, h4.r rVar, String str, String str2, u4.d dVar) {
        this.f74520a = 10;
        this.f74524e = rVar;
        this.f74525f = dVar;
        this.f74522c = str;
        this.f74523d = str2;
        this.f74521b = i15;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x040c  */
    /* JADX WARN: Code duplicated, block: B:87:0x042d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74520a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = this.f74521b;
        Object obj3 = this.f74525f;
        Object obj4 = this.f74524e;
        Object obj5 = this.f74523d;
        Object obj6 = this.f74522c;
        int i16 = 1;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                r0.b((String) obj6, (String) obj5, (z3.e) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                gv0.j0.b((gv0.y) obj6, (pu0.b) obj5, (hl.a) obj4, (e23.p) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                gw0.j.h((b63.o) obj6, (pv0.q) obj5, (gw0.u) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                h02.b.a((c2.a0) obj4, (String) obj6, (String) obj5, (Integer) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                h21.y.a((v21.e) obj5, (String) obj6, (g21.u) obj4, (g21.f0) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                hl1.t.a((hl1.u) obj6, (e23.a) obj3, (e23.p) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 6:
                jo.c cVar = (jo.c) obj6;
                e23.q qVar = (e23.q) obj5;
                e23.p pVar = (e23.p) obj4;
                e23.p pVar2 = (e23.p) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    jo.c.a aVar2 = (jo.c.a) cVar;
                    boolean zB = mVar.B(qVar) | mVar.k(i15);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new hn1.l(qVar, i15, i16);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new hn1.l(qVar, i15, i16);
                            mVar.K(objQ);
                        }
                    }
                    e23.p pVar3 = (e23.p) objQ;
                    boolean zB2 = mVar.B(pVar) | mVar.k(i15);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new f2.g(pVar, i15, 1);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f2.g(pVar, i15, 1);
                            mVar.K(objQ2);
                        }
                    }
                    e23.l lVar = (e23.l) objQ2;
                    boolean zB3 = mVar.B(pVar2) | mVar.k(i15);
                    Object objQ3 = mVar.q();
                    if (zB3) {
                        objQ3 = new f2.g(pVar2, i15, 2);
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new f2.g(pVar2, i15, 2);
                            mVar.K(objQ3);
                        }
                    }
                    ho.w.f(aVar2, pVar3, lVar, (e23.l) objQ3, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ht1.d.c((String) obj6, (String) obj5, (h4.r) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                hv0.c.d((gv0.d) obj6, this.f74521b, (e23.l) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                hw1.j.a((h4.r) obj5, (String) obj6, (s5.x0) obj4, (h2) obj3, (p3.m) obj, p3.p0.t(1), this.f74521b);
                break;
            case 10:
                ((Integer) obj2).getClass();
                i91.h.a(p3.p0.t(1), this.f74521b, (h4.r) obj4, (String) obj6, (String) obj5, (p3.m) obj, (u4.d) obj3);
                break;
            case 11:
                ((Integer) obj2).intValue();
                i91.h.d((String) obj6, (mc) obj5, (e23.a) obj3, (e23.r) obj4, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                in1.f.b((km1.v) obj6, (DateTime) obj5, (sm1.s) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                jy0.y.b((Long) obj6, (Long) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                int i17 = i6.f104121g;
                ((i6) obj6).i((h4.r) obj5, (h61.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                kh0.h.a((ih0.s) obj6, (List) obj5, (DateTime) obj4, (DateTime) obj3, this.f74521b, (p3.m) obj, p3.p0.t(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                kn1.g.a((mn1.b) obj6, (km1.c) obj5, (mc) obj4, (o53.b0) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                kn1.k.j((h4.r) obj6, (km1.c) obj5, (kn1.c) obj4, (e23.p) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ky0.v0.f((l22.b) obj6, (i53.d) obj5, (i53.c) obj4, this.f74521b, (am.x0) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                me1.e.a((List) obj6, this.f74521b, (b63.o) obj5, (b63.o) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                me1.n.a((i53.f) obj6, this.f74521b, (b63.o) obj5, (b63.o) obj4, (h4.r) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                nf1.i.a((o82.a) obj6, (o82.g) obj5, (u82.f) obj4, (p3.p1) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                nw0.q.c((i53.c) obj6, (nw0.d) obj5, (nw0.r) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                nw0.q.g((String) obj6, (e23.l) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                o60.c.a((h4.r) obj6, (m60.a) obj5, (e23.l) obj4, (kh0.d) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.g((m52.k) obj6, (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj5, (com.garmin.android.apps.connectmobile.repcounting.model.c) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 26:
                e23.l<? super x5.l0, x5.l0> lVar2 = (e23.l) obj5;
                String str = (String) obj6;
                e23.l<? super String, Unit> lVar3 = (e23.l) obj4;
                p3.p1 p1Var = (p3.p1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    b82.t0 t0Var = b82.t0.f16792a;
                    if (lVar2 == null) {
                        mVar2.C(1021761287);
                        Object objQ4 = mVar2.q();
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new o72.z0(11);
                            mVar2.K(objQ4);
                        }
                        lVar2 = (e23.l) objQ4;
                    } else {
                        mVar2.C(1695527531);
                    }
                    mVar2.f();
                    e23.l<? super x5.l0, x5.l0> lVar4 = lVar2;
                    Object objQ5 = mVar2.q();
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new o72.v1(p1Var, 18);
                        mVar2.K(objQ5);
                    }
                    t0Var.j(null, "Distance", str, null, false, lVar4, lVar3, (e23.l) objQ5, this.f74521b, 0, null, mVar2, 12610608, 0, 1537);
                } else {
                    mVar2.e();
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                oo0.e.a((DateTime) obj6, (gs1.t) obj5, (qo0.a) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ot1.e eVar = ot1.e.f133785a;
                ((ot1.e) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ot1.g gVar = ot1.g.f133790a;
                ((ot1.g) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q0(c2.a0 a0Var, String str, String str2, Integer num, int i14) {
        this.f74520a = 3;
        this.f74524e = a0Var;
        this.f74522c = str;
        this.f74523d = str2;
        this.f74525f = num;
        this.f74521b = i14;
    }

    public /* synthetic */ q0(e23.l lVar, String str, e23.l lVar2, int i14, p3.p1 p1Var) {
        this.f74520a = 26;
        this.f74523d = lVar;
        this.f74522c = str;
        this.f74524e = lVar2;
        this.f74521b = i14;
        this.f74525f = p1Var;
    }

    public /* synthetic */ q0(gv0.d dVar, int i14, e23.l lVar, e23.a aVar, e23.a aVar2, int i15) {
        this.f74520a = 8;
        this.f74522c = dVar;
        this.f74521b = i14;
        this.f74523d = lVar;
        this.f74525f = aVar;
        this.f74524e = aVar2;
    }

    public /* synthetic */ q0(h4.r rVar, String str, s5.x0 x0Var, h2 h2Var, int i14, int i15) {
        this.f74520a = 9;
        this.f74523d = rVar;
        this.f74522c = str;
        this.f74524e = x0Var;
        this.f74525f = h2Var;
        this.f74521b = i15;
    }

    public /* synthetic */ q0(hl1.u uVar, e23.a aVar, e23.p pVar, e23.a aVar2, int i14) {
        this.f74520a = 5;
        this.f74522c = uVar;
        this.f74525f = aVar;
        this.f74523d = pVar;
        this.f74524e = aVar2;
        this.f74521b = i14;
    }

    public /* synthetic */ q0(ih0.s sVar, List list, DateTime dateTime, DateTime dateTime2, int i14, int i15) {
        this.f74520a = 15;
        this.f74522c = sVar;
        this.f74523d = list;
        this.f74524e = dateTime;
        this.f74525f = dateTime2;
        this.f74521b = i14;
    }

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f74520a = i15;
        this.f74522c = obj;
        this.f74523d = obj2;
        this.f74524e = obj3;
        this.f74525f = obj4;
        this.f74521b = i14;
    }

    public /* synthetic */ q0(String str, Object obj, e23.a aVar, o13.h hVar, int i14, int i15) {
        this.f74520a = i15;
        this.f74522c = str;
        this.f74523d = obj;
        this.f74525f = aVar;
        this.f74524e = hVar;
        this.f74521b = i14;
    }

    public /* synthetic */ q0(List list, int i14, b63.o oVar, b63.o oVar2, Object obj, int i15, int i16) {
        this.f74520a = i16;
        this.f74522c = list;
        this.f74521b = i14;
        this.f74523d = oVar;
        this.f74524e = oVar2;
        this.f74525f = obj;
    }

    public /* synthetic */ q0(jo.c cVar, e23.q qVar, int i14, e23.p pVar, e23.p pVar2) {
        this.f74520a = 6;
        this.f74522c = cVar;
        this.f74523d = qVar;
        this.f74521b = i14;
        this.f74524e = pVar;
        this.f74525f = pVar2;
    }

    public /* synthetic */ q0(l22.b bVar, i53.d dVar, i53.c cVar, int i14, am.x0 x0Var, int i15) {
        this.f74520a = 18;
        this.f74522c = bVar;
        this.f74523d = dVar;
        this.f74524e = cVar;
        this.f74521b = i14;
        this.f74525f = x0Var;
    }

    public /* synthetic */ q0(v21.e eVar, String str, g21.u uVar, g21.f0 f0Var, int i14) {
        this.f74520a = 4;
        this.f74523d = eVar;
        this.f74522c = str;
        this.f74524e = uVar;
        this.f74525f = f0Var;
        this.f74521b = i14;
    }
}
