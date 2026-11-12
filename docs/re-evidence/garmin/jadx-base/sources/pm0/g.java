package pm0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.y;
import e23.p;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p40.o0;
import p5.v;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.d f138616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupChallengeDTO f138617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.a f138618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d f138619e;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.group.details.challenges.d dVar, GroupChallengeDTO groupChallengeDTO, com.garmin.android.apps.connectmobile.group.details.challenges.a aVar, com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d c0641d, int i14) {
        this.f138615a = i14;
        this.f138616b = dVar;
        this.f138617c = groupChallengeDTO;
        this.f138618d = aVar;
        this.f138619e = c0641d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x021b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        h5.g.a.f fVar;
        com.garmin.android.apps.connectmobile.group.details.challenges.a aVar;
        GroupChallengeDTO groupChallengeDTO;
        switch (this.f138615a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d.f36330d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1916061091, new g(this.f138616b, this.f138617c, this.f138618d, this.f138619e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d.f36330d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarE = u1.n.e(x2.f(aVar2, 1.0f), p6.b.a(d92.b.f58623a, mVar2), m1.f128891a);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = l.y(rVarE, eVar.f97920e);
                    com.garmin.android.apps.connectmobile.group.details.challenges.d dVar = this.f138616b;
                    boolean zR = mVar2.r(dVar);
                    GroupChallengeDTO groupChallengeDTO2 = this.f138617c;
                    boolean zR2 = zR | mVar2.r(groupChallengeDTO2);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR2) {
                        objQ = new o0(8, dVar, groupChallengeDTO2);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new o0(8, dVar, groupChallengeDTO2);
                            mVar2.K(objQ);
                        }
                    }
                    r rVarD = w.d(rVarY, false, null, null, (e23.a) objQ, 15);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
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
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    com.garmin.android.apps.connectmobile.group.details.challenges.b.a aVar5 = com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b;
                    GroupChallengeDTO.b bVar3 = groupChallengeDTO2.f31513b;
                    bVar3.getClass();
                    aVar5.getClass();
                    boolean zContains = com.garmin.android.apps.connectmobile.group.details.challenges.b.PAST.f36299a.contains(bVar3);
                    com.garmin.android.apps.connectmobile.group.details.challenges.a aVar6 = this.f138618d;
                    if (zContains) {
                        mVar2.C(-1187487367);
                        aVar = aVar6;
                        fVar = fVar2;
                        groupChallengeDTO = groupChallengeDTO2;
                        b12.k.b(null, null, w13.b.j(mVar2), ((com.garmin.android.apps.connectmobile.group.details.challenges.a.b) aVar6).f36291b.f31548l, mVar2, b12.b.f14385f << 9, 19);
                        mVar2.f();
                    } else {
                        fVar = fVar2;
                        aVar = aVar6;
                        groupChallengeDTO = groupChallengeDTO2;
                        mVar2.C(-1187161650);
                        y.a(groupChallengeDTO.f31514c, mVar2, 0);
                        mVar2.f();
                    }
                    GroupChallengeDTO groupChallengeDTO3 = groupChallengeDTO;
                    r rVarC2 = l.C(aVar2, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC3 = h4.k.c(rVarC2, mVar2);
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
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    b0 b0Var = b0.f22601a;
                    String str = groupChallengeDTO3.f31516e;
                    if (str == null) {
                        str = "";
                    }
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                    m mVar3 = mVar2;
                    com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d c0641d = this.f138619e;
                    String strP = c0641d.f36332b.p((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b), groupChallengeDTO3);
                    if (g22.n.d(strP)) {
                        mVar3.C(451145633);
                        x0 x0VarF = d92.c.f(d92.c.e(j92.f.f97935l), mVar3);
                        boolean zR3 = mVar3.r(c0641d) | mVar3.r(groupChallengeDTO3);
                        Object objQ2 = mVar3.q();
                        if (zR3) {
                            objQ2 = new ph1.d(3, c0641d, groupChallengeDTO3);
                            mVar3.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new ph1.d(3, c0641d, groupChallengeDTO3);
                                mVar3.K(objQ2);
                            }
                        }
                        mh.c(strP, v.c((e23.l) objQ2, aVar2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                        mVar3 = mVar3;
                        mVar3.f();
                    } else {
                        mVar3.C(451584779);
                        mVar3.f();
                    }
                    List listS0 = h0.S0(((com.garmin.android.apps.connectmobile.group.details.challenges.a.b) aVar).f36292c, 10);
                    Object objQ3 = mVar3.q();
                    aVar3.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new p40.h(18);
                        mVar3.K(objQ3);
                    }
                    m mVar4 = mVar3;
                    mh.c(h0.k0(listS0, ", ", null, null, (e23.l) objQ3, 30), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, d92.c.f(d92.c.e(j92.f.f97935l), mVar3), mVar4, 0, 24576, 114686);
                    mVar4.y();
                    mVar4.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
