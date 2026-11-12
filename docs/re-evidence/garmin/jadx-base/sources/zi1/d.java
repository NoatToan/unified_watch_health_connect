package zi1;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.notification.NotificationOffActivity;
import e23.p;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f204856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotificationOffActivity f204857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f204858d;

    public /* synthetic */ d(p1 p1Var, String str, NotificationOffActivity notificationOffActivity) {
        this.f204855a = 0;
        this.f204858d = p1Var;
        this.f204856b = str;
        this.f204857c = notificationOffActivity;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x0187  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f204855a;
        m.a aVar = m.f135153a;
        p1 p1Var = this.f204858d;
        NotificationOffActivity notificationOffActivity = this.f204857c;
        String str = this.f204856b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                NotificationOffActivity.a aVar2 = NotificationOffActivity.f43557e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.d.a(!s.g((Boolean) p1Var.getF182175a(), Boolean.FALSE), f.c(-618319759, new d(str, notificationOffActivity, p1Var, i16), mVar), null, null, null, f.c(1320227565, new d(str, notificationOffActivity, p1Var, i15), mVar), mVar, 196656, 28);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                NotificationOffActivity.a aVar3 = NotificationOffActivity.f43557e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (s.g((Boolean) p1Var.getF182175a(), Boolean.FALSE)) {
                        mVar2.C(750855603);
                        String strP = y.P(R.string.settings_os_notifications, new Object[]{str}, mVar2);
                        boolean zR = mVar2.r(notificationOffActivity);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new b(notificationOffActivity, 1);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new b(notificationOffActivity, 1);
                                mVar2.K(objQ);
                            }
                        }
                        z02.f.c(0, 54, null, (e23.a) objQ, null, strP, mVar2, null);
                        mVar2.f();
                    } else {
                        mVar2.C(751038193);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                NotificationOffActivity.a aVar4 = NotificationOffActivity.f43557e;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar5 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar5, 1.0f), h.e(d92.b.f58623a, mVar3), m1.f128891a);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC = k.c(rVarE, mVar3);
                    g.V.getClass();
                    e0.a aVar6 = g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar6);
                    } else {
                        mVar3.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar3);
                    b4.c(g.a.f81809f, i2VarX, mVar3);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar3);
                    b0 b0Var = b0.f22601a;
                    if (s.g((Boolean) p1Var.getF182175a(), Boolean.FALSE)) {
                        mVar3.C(248234411);
                        r rVarF = x2.f(aVar5, 1.0f);
                        d92.b.f58625c.getClass();
                        r rVarY = l.y(rVarF, j92.b.f97899b.f97920e);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = u62.a.a(t62.a.f162797a);
                        String strQ = y.Q(mVar3, R.string.lbl_push_notifications_are_off);
                        String strP2 = y.P(R.string.msg_push_notifications_are_off_for_device, new Object[]{str}, mVar3);
                        String strQ2 = y.Q(mVar3, R.string.go_to_settings);
                        boolean zR2 = mVar3.r(notificationOffActivity);
                        Object objQ2 = mVar3.q();
                        if (zR2) {
                            objQ2 = new b(notificationOffActivity, 2);
                            mVar3.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new b(notificationOffActivity, 2);
                                mVar3.K(objQ2);
                            }
                        }
                        b82.n.d(dVarA, strQ, strP2, rVarY, strQ2, (e23.a) objQ2, null, null, mVar3, 0, 192);
                        mVar3.f();
                    } else {
                        mVar3.C(249059755);
                        mVar3.f();
                    }
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(String str, NotificationOffActivity notificationOffActivity, p1 p1Var, int i14) {
        this.f204855a = i14;
        this.f204856b = str;
        this.f204857c = notificationOffActivity;
        this.f204858d = p1Var;
    }
}
