package ak0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import l72.i3;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import v62.l2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3651a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3657g;

    public /* synthetic */ n(h4.r rVar, String str, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, int i14) {
        this.f3656f = rVar;
        this.f3652b = str;
        this.f3653c = z14;
        this.f3654d = z15;
        this.f3655e = aVar;
        this.f3657g = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01de  */
    /* JADX WARN: Code duplicated, block: B:67:0x0203  */
    /* JADX WARN: Code duplicated, block: B:73:0x0234  */
    /* JADX WARN: Code duplicated, block: B:81:0x0259  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3651a;
        i53.c cVarE = null;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = this.f3654d;
        boolean z15 = this.f3653c;
        Object obj3 = this.f3655e;
        Object obj4 = this.f3656f;
        Object obj5 = this.f3657g;
        Object obj6 = this.f3652b;
        switch (i14) {
            case 0:
                String str = (String) obj6;
                i3 i3Var = (i3) obj4;
                e23.l lVar = (e23.l) obj5;
                e23.a aVar2 = (e23.a) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (!z15) {
                        mVar.C(1608014027);
                        i53.c cVarE2 = i3Var != null ? i53.a.e(p13.w.c(i3Var)) : null;
                        boolean zB = mVar.B(lVar);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new a12.a(lVar, 5);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a12.a(lVar, 5);
                                mVar.K(objQ);
                            }
                        }
                        z02.f.b(null, null, str, null, null, cVarE2, null, (e23.l) objQ, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 91);
                        mVar.f();
                    } else if (z14) {
                        mVar.C(1608376169);
                        boolean zB2 = mVar.B(aVar2);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new defpackage.c(aVar2, 6);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new defpackage.c(aVar2, 6);
                                mVar.K(objQ2);
                            }
                        }
                        e23.a aVar3 = (e23.a) objQ2;
                        cVarE = i3Var != null ? i53.a.e(p13.w.c(i3Var)) : null;
                        boolean zB3 = mVar.B(lVar);
                        Object objQ3 = mVar.q();
                        if (zB3) {
                            objQ3 = new a12.a(lVar, 6);
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new a12.a(lVar, 6);
                                mVar.K(objQ3);
                            }
                        }
                        z02.f.e(str, null, aVar3, cVarE, (e23.l) objQ3, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                        mVar.f();
                    } else {
                        mVar.C(1608787136);
                        boolean zB4 = mVar.B(aVar2);
                        Object objQ4 = mVar.q();
                        if (zB4) {
                            objQ4 = new defpackage.c(aVar2, 7);
                            mVar.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new defpackage.c(aVar2, 7);
                                mVar.K(objQ4);
                            }
                        }
                        e23.a aVar4 = (e23.a) objQ4;
                        cVarE = i3Var != null ? i53.a.e(p13.w.c(i3Var)) : null;
                        boolean zB5 = mVar.B(lVar);
                        Object objQ5 = mVar.q();
                        if (zB5) {
                            objQ5 = new a12.a(lVar, 7);
                            mVar.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new a12.a(lVar, 7);
                                mVar.K(objQ5);
                            }
                        }
                        z02.f.d(str, null, null, aVar4, cVarE, null, (e23.l) objQ5, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                s70.p.a((h4.r) obj4, (String) obj6, this.f3653c, this.f3654d, (e23.a) obj3, (e23.a) obj5, (p3.m) obj, p0.t(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                xo0.b.b((wo0.a) obj4, this.f3653c, (String) obj6, (String) obj5, (String) obj3, this.f3654d, (p3.m) obj, p0.t(196609));
                break;
            default:
                o51.f fVar = (o51.f) obj6;
                e23.l lVar2 = (e23.l) obj5;
                p1 p1Var = (p1) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (z15) {
                        mVar2.C(3947466);
                        mVar2.f();
                    } else {
                        mVar2.C(2380602);
                        String strQ = gl1.y.Q(mVar2, R.string.pacepro_title);
                        if (z14 || fVar.f129236a == null) {
                            mVar2.C(2899542);
                            mVar2.f();
                        } else {
                            mVar2.C(2514305);
                            String strQ2 = gl1.y.Q(mVar2, R.string.lbl_send_to_device);
                            s62.a.f157643a.getClass();
                            t62.b.f162798a.getClass();
                            cVarE = i53.a.a(new i3("send_to_device", strQ2, false, x62.n.a(l2.f175943a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                            mVar2.f();
                        }
                        i53.c cVar = cVarE;
                        i53.c cVar2 = (i53.c) p1Var2.getF182175a();
                        b.u uVar = (b.u) mVar2.A(g02.d.f74342a);
                        boolean zR = mVar2.r(uVar);
                        Object objQ6 = mVar2.q();
                        if (zR) {
                            objQ6 = new z41.h.a(uVar);
                            mVar2.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new z41.h.a(uVar);
                                mVar2.K(objQ6);
                            }
                        }
                        e23.a aVar5 = (e23.a) ((k23.g) objQ6);
                        boolean zR2 = mVar2.r(fVar) | mVar2.B(lVar2) | mVar2.B(p1Var);
                        Object objQ7 = mVar2.q();
                        if (zR2) {
                            objQ7 = new wn2.f(fVar, 27, lVar2, p1Var);
                            mVar2.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new wn2.f(fVar, 27, lVar2, p1Var);
                                mVar2.K(objQ7);
                            }
                        }
                        z02.f.d(strQ, null, null, aVar5, cVar, cVar2, (e23.l) objQ7, mVar2, 2359296, 22);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(wo0.a aVar, boolean z14, String str, String str2, String str3, boolean z15, int i14) {
        this.f3656f = aVar;
        this.f3653c = z14;
        this.f3652b = str;
        this.f3657g = str2;
        this.f3655e = str3;
        this.f3654d = z15;
    }

    public /* synthetic */ n(boolean z14, String str, i3 i3Var, e23.l lVar, boolean z15, e23.a aVar) {
        this.f3653c = z14;
        this.f3652b = str;
        this.f3656f = i3Var;
        this.f3657g = lVar;
        this.f3654d = z15;
        this.f3655e = aVar;
    }

    public /* synthetic */ n(boolean z14, boolean z15, o51.f fVar, e23.l lVar, p1 p1Var, p1 p1Var2) {
        this.f3653c = z14;
        this.f3654d = z15;
        this.f3652b = fVar;
        this.f3657g = lVar;
        this.f3656f = p1Var;
        this.f3655e = p1Var2;
    }
}
