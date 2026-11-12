package zo1;

import android.content.Context;
import c2.l2;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.ve;
import l72.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f206459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yo1.j f206460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f206461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3 f206462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f206463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f206464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c.q f206465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1 f206466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1 f206467j;

    public /* synthetic */ u0(q qVar, yo1.j jVar, x3 x3Var, x3 x3Var2, Context context, e23.l lVar, c.q qVar2, p1 p1Var, p1 p1Var2, int i14) {
        this.f206458a = i14;
        this.f206459b = qVar;
        this.f206460c = jVar;
        this.f206461d = x3Var;
        this.f206462e = x3Var2;
        this.f206463f = context;
        this.f206464g = lVar;
        this.f206465h = qVar2;
        this.f206466i = p1Var;
        this.f206467j = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0176  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        q qVar;
        p1 p1Var;
        switch (this.f206458a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(865700607, new u0(this.f206459b, this.f206460c, this.f206461d, this.f206462e, this.f206463f, this.f206464g, this.f206465h, this.f206466i, this.f206467j, 1), mVar), mVar, 12582918, 122);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = x2.d(aVar, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar, aVar2, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    yo1.j jVar = this.f206460c;
                    if (jVar.getParticipantCount() == 1) {
                        mVar2.C(-13287017);
                        r1.b(gl1.y.Q(mVar2, R.string.lbl_one_rider), null, mVar2, 0, 2);
                        mVar2.f();
                    } else {
                        mVar2.C(-13284559);
                        r1.b(gl1.y.P(R.string.lbl_riders_count, new Object[]{String.valueOf(jVar.getParticipantCount())}, mVar2), null, mVar2, 0, 2);
                        mVar2.f();
                    }
                    h4.r rVarD2 = x2.d(aVar, 1.0f);
                    c2.z zVarA2 = c2.y.a(kVar, aVar2, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarD2, mVar2);
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    h4.r rVarA = b0Var.a(aVar, 1.0f, true);
                    float f14 = 0;
                    g6.f.a aVar4 = g6.f.f75994b;
                    l2 l2VarB = c2.l.b(f14, f14);
                    x3 x3Var = this.f206461d;
                    boolean zB = mVar2.B(x3Var);
                    x3 x3Var2 = this.f206462e;
                    boolean zB2 = zB | mVar2.B(x3Var2);
                    q qVar2 = this.f206459b;
                    boolean zR = zB2 | mVar2.r(qVar2);
                    Context context = this.f206463f;
                    boolean zR2 = zR | mVar2.r(context);
                    e23.l lVar = this.f206464g;
                    boolean zB3 = zR2 | mVar2.B(lVar);
                    c.q qVar3 = this.f206465h;
                    boolean zR3 = zB3 | mVar2.r(qVar3);
                    Object objQ = mVar2.q();
                    p1 p1Var2 = this.f206466i;
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zR3) {
                        objQ = new b82.l0(x3Var, qVar2, context, lVar, qVar3, x3Var2, p1Var2);
                        qVar = qVar2;
                        p1Var = p1Var2;
                        mVar2.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b82.l0(x3Var, qVar2, context, lVar, qVar3, x3Var2, p1Var2);
                            qVar = qVar2;
                            p1Var = p1Var2;
                            mVar2.K(objQ);
                        } else {
                            qVar = qVar2;
                            p1Var = p1Var2;
                        }
                    }
                    e2.c.b(rVarA, null, l2VarB, null, null, null, false, null, (e23.l) objQ, mVar2, 384, 506);
                    mVar2.y();
                    mVar2.y();
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(-1189524739);
                        l72.c1 c1Var = l72.c1.f110940a;
                        String strQ = gl1.y.Q(mVar2, R.string.lbl_remove_groupride_alert_title);
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_remove_groupride_alert_description);
                        String strQ3 = gl1.y.Q(mVar2, R.string.lbl_remove);
                        String strQ4 = gl1.y.Q(mVar2, R.string.common_cancel);
                        boolean zR4 = mVar2.r(qVar) | mVar2.r(jVar);
                        Object objQ2 = mVar2.q();
                        if (zR4) {
                            objQ2 = new x72.k(qVar, 16, jVar, p1Var);
                            mVar2.K(objQ2);
                        } else {
                            aVar5.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new x72.k(qVar, 16, jVar, p1Var);
                                mVar2.K(objQ2);
                            }
                        }
                        e23.a<Unit> aVar6 = (e23.a) objQ2;
                        Object objQ3 = mVar2.q();
                        aVar5.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new zk1.d(p1Var, 10);
                            mVar2.K(objQ3);
                        }
                        c1Var.a(false, strQ, strQ2, null, null, strQ3, true, false, aVar6, strQ4, (e23.a) objQ3, mVar2, 1572870, 6, SyslogConstants.LOG_LOCAL3);
                        mVar2 = mVar2;
                        mVar2.f();
                    } else {
                        mVar2.C(-1188705533);
                        mVar2.f();
                    }
                    p1 p1Var3 = this.f206467j;
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        mVar2.C(-1188643223);
                        l72.c1 c1Var2 = l72.c1.f110940a;
                        String strQ5 = gl1.y.Q(mVar2, R.string.lbl_unable_to_connect);
                        String strQ6 = gl1.y.Q(mVar2, R.string.msg_unable_to_connect);
                        String strQ7 = gl1.y.Q(mVar2, R.string.lbl_ok);
                        Object objQ4 = mVar2.q();
                        aVar5.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new zk1.d(p1Var3, 11);
                            mVar2.K(objQ4);
                        }
                        p3.m mVar3 = mVar2;
                        c1Var2.a(false, strQ5, strQ6, null, null, strQ7, false, false, (e23.a) objQ4, null, null, mVar3, 100663302, 0, 1752);
                        mVar3.f();
                    } else {
                        mVar2.C(-1188187709);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
