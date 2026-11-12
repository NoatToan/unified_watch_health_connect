package zi1;

import android.content.DialogInterface;
import c.w;
import c2.l;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.notification.NotificationOffActivity;
import com.garmin.android.apps.connectmobile.settings.notification.NotificationOffActivity.b;
import com.garmin.android.apps.connectmobile.userprofile.model.g;
import e23.p;
import gl1.y;
import h4.r;
import java.util.ArrayList;
import l72.c1;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import v62.k7;
import yr.o0;
import yu1.h;
import z3.f;
import zo1.f1;
import zo1.z;
import zu1.k;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f204849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f204850c;

    public /* synthetic */ a(int i14, Object obj, Object obj2) {
        this.f204848a = i14;
        this.f204849b = obj;
        this.f204850c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x02bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f204848a;
        m.a aVar = m.f135153a;
        Object obj3 = this.f204850c;
        Object obj4 = this.f204849b;
        switch (i14) {
            case 0:
                NotificationOffActivity notificationOffActivity = (NotificationOffActivity) obj4;
                String str = (String) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                NotificationOffActivity.a aVar2 = NotificationOffActivity.f43557e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    p1 p1VarB = s9.c.b(((e) notificationOffActivity.f43559b.getValue()).f204860b, null, mVar, 48);
                    Boolean bool = (Boolean) p1VarB.getF182175a();
                    boolean zB = mVar.B(p1VarB) | mVar.r(notificationOffActivity);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = notificationOffActivity.new b(p1VarB, null);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = notificationOffActivity.new b(p1VarB, null);
                            mVar.K(objQ);
                        }
                    }
                    l0.e((p) objQ, bool, mVar);
                    z02.b.a(false, null, null, null, false, f.c(-1170214698, new d(p1VarB, str, notificationOffActivity), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                zj0.c.a((zj0.e) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                break;
            case 2:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d dVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d) obj4;
                g gVar = (g) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.f43911a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zR = mVar2.r(dVar);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new o0(dVar, 19);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new o0(dVar, 19);
                            mVar2.K(objQ2);
                        }
                    }
                    w.a(0, 1, (e23.a) objQ2, mVar2, false);
                    r.a aVar4 = r.S;
                    h4.d.f81522a.getClass();
                    r rVarX = x2.x(aVar4, h4.d.a.f81533k, 2);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = l.y(rVarX, j92.b.f97899b.f97920e);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = k7.a(t62.b.f162798a);
                    String strQ = y.Q(mVar2, R.string.lbl_admin_setup_feature_required);
                    String str2 = gVar != null ? gVar.f46858b : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    b82.n.c(dVarA, strQ, y.P(R.string.msg_safety_feature_administrator_required, new Object[]{str2}, mVar2), rVarY, null, mVar2, 0, 16);
                } else {
                    mVar2.e();
                }
                break;
            case 3:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f) obj4).y6((wj1.a) obj3);
                break;
            case 4:
                z zVar = (z) obj4;
                p1 p1Var = (p1) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                z.a aVar6 = z.f206495h;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    int i15 = 4;
                    h82.e.a(f.c(-1601542761, new h(i15, zVar, p1Var), mVar3), mVar3, 6);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar3.C(1773843697);
                        c1 c1Var = c1.f110940a;
                        String strQ2 = y.Q(mVar3, R.string.lbl_remove_groupride_alert_title);
                        String strQ3 = y.Q(mVar3, R.string.lbl_remove_groupride_alert_description);
                        String strQ4 = y.Q(mVar3, R.string.lbl_remove);
                        String strQ5 = y.Q(mVar3, R.string.common_cancel);
                        boolean zR2 = mVar3.r(zVar);
                        Object objQ3 = mVar3.q();
                        if (zR2) {
                            objQ3 = new z10.d(17, zVar, p1Var);
                            mVar3.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new z10.d(17, zVar, p1Var);
                                mVar3.K(objQ3);
                            }
                        }
                        e23.a<Unit> aVar7 = (e23.a) objQ3;
                        Object objQ4 = mVar3.q();
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new zk1.d(p1Var, i15);
                            mVar3.K(objQ4);
                        }
                        c1Var.a(false, strQ2, strQ3, null, null, strQ4, true, false, aVar7, strQ5, (e23.a) objQ4, mVar3, 1572870, 6, SyslogConstants.LOG_LOCAL3);
                        mVar3.f();
                    } else {
                        mVar3.C(1774700382);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                f1.e((ArrayList) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                zr.h.k((r) obj4, (nr.e.g) obj3, (m) obj, p0.t(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                zr.h.a((r) obj4, (nr.e.b) obj3, (m) obj, p0.t(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                zr.h.d((r) obj4, (nr.z) obj3, (m) obj, p0.t(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                zr.h.e((r) obj4, (nr.e.d) obj3, (m) obj, p0.t(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                k.a aVar8 = k.f207122d;
                ((k) obj4).w6((av1.f) obj3, (m) obj, p0.t(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                k.a aVar9 = k.f207122d;
                ((k) obj4).v6((p1) obj3, (m) obj, p0.t(7));
                break;
            default:
                b0 b0Var = (b0) obj4;
                a03.y yVar = (a03.y) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                b0Var.getClass();
                yVar.getClass();
                ge1.b.T(b0Var, null, null, new zz2.y((a03.p) obj3, yVar, fFloatValue, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i14, int i15) {
        this.f204848a = i15;
        this.f204849b = obj;
        this.f204850c = obj2;
    }
}
