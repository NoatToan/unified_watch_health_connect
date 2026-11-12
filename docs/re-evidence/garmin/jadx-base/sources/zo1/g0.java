package zo1;

import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import i3.ve;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f206320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yo1.b f206321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f206322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yo1.i f206323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bp1.a f206324f;

    public /* synthetic */ g0(int i14, bp1.a aVar, e23.a aVar2, yo1.b bVar, yo1.i iVar, boolean z14) {
        this.f206319a = i14;
        this.f206320b = aVar2;
        this.f206321c = bVar;
        this.f206322d = z14;
        this.f206323e = iVar;
        this.f206324f = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0268  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strP;
        h4.r.a aVar;
        yo1.i iVar;
        h4.r.a aVar2;
        switch (this.f206319a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar3 = g6.f.f75994b;
                    ve.a(null, k2.i.a(8), fb1.c.z(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(1630457686, new g0(1, this.f206324f, this.f206320b, this.f206321c, this.f206323e, this.f206322d), mVar), mVar, 12582912, 121);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarF = x2.f(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    t4.d dVarA = n5.c.a(R.drawable.close_circle, mVar2, 0);
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_close);
                    h4.r rVarB = b0Var.b(aVar4, h4.d.a.f81538p);
                    e23.a aVar6 = this.f206320b;
                    boolean zB = mVar2.B(aVar6);
                    Object objQ = mVar2.q();
                    p3.m.a aVar7 = p3.m.f135153a;
                    if (zB) {
                        objQ = new yy1.d(aVar6, 26);
                        mVar2.K(objQ);
                    } else {
                        aVar7.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new yy1.d(aVar6, 26);
                            mVar2.K(objQ);
                        }
                    }
                    i7.a(dVarA, strQ, u1.w.d(rVarB, false, null, null, (e23.a) objQ, 15), sn.a.b(mVar2), mVar2, 0, 0);
                    yo1.b bVar2 = this.f206321c;
                    String imageLargeURI = bVar2.getImageLargeURI();
                    if (imageLargeURI == null) {
                        imageLargeURI = bVar2.getImageURI();
                    }
                    float f14 = SyslogConstants.LOG_LOCAL4;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarY2 = c2.l.y(x2.q(aVar4, f14), eVar.f97920e);
                    h4.g.a aVar9 = h4.d.a.f81537o;
                    jf.r.a(imageLargeURI, null, b0Var.b(rVarY2, aVar9), null, null, null, null, mVar2, 48, 2040);
                    String title = bVar2.getTitle();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar2);
                    d6.h.f57752b.getClass();
                    int i14 = d6.h.f57755e;
                    mh.c(title, b0Var.b(aVar4, aVar9), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                    p3.m mVar3 = mVar2;
                    boolean z14 = this.f206322d;
                    yo1.i iVar2 = this.f206323e;
                    if (z14) {
                        strP = sn.a.h(mVar3, 1979825975, R.string.lbl_you_won_this_award, mVar3);
                    } else {
                        mVar3.C(1979933266);
                        String fullName = iVar2.getFullName();
                        if (fullName != null) {
                            mVar3.C(1980047780);
                            strP = gl1.y.P(R.string.lbl_winner_badge, new Object[]{fullName}, mVar3);
                            mVar3.f();
                        } else {
                            mVar3.C(1980165146);
                            mVar3.f();
                            strP = null;
                        }
                        mVar3.f();
                    }
                    if (strP != null) {
                        mVar3.C(1980324672);
                        aVar = aVar4;
                        iVar = iVar2;
                        mh.c(strP, b0Var.b(c2.l.C(aVar4, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), aVar9), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar3, 0, 0, 130044);
                        mVar3 = mVar3;
                        mVar3.f();
                    } else {
                        aVar = aVar4;
                        iVar = iVar2;
                        mVar3.C(1980732694);
                        mVar3.f();
                    }
                    bp1.a aVar10 = this.f206324f;
                    String strA = aVar10.a(bVar2, false);
                    if (g22.n.d(strA)) {
                        mVar3.C(1980905767);
                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97932i, mVar3);
                        h4.r.a aVar11 = aVar;
                        h4.r rVarB2 = b0Var.b(c2.l.C(aVar11, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), aVar9);
                        boolean zR = mVar3.r(aVar10) | mVar3.r(bVar2);
                        Object objQ2 = mVar3.q();
                        if (zR) {
                            objQ2 = new h0(aVar10, bVar2, 1);
                            mVar3.K(objQ2);
                        } else {
                            aVar7.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new h0(aVar10, bVar2, 1);
                                mVar3.K(objQ2);
                            }
                        }
                        p3.m mVar4 = mVar3;
                        aVar2 = aVar11;
                        mh.c(strA, p5.v.b(rVarB2, (e23.l) objQ2), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 130044);
                        mVar3 = mVar4;
                        mVar3.f();
                    } else {
                        aVar2 = aVar;
                        mVar3.C(1981522326);
                        mVar3.f();
                    }
                    c2.l.f(c2.l.A(aVar2, 0.0f, eVar.f97918c, 1), mVar3);
                    h4.r rVarB3 = b0Var.b(aVar2, aVar9);
                    float f15 = j92.b.f97901d.f97906e;
                    com.garmin.android.apps.connectmobile.userprofile.model.j jVar = iVar.f198502n;
                    String str = jVar != null ? jVar.f46879h : null;
                    Integer userLevel = iVar.getUserLevel();
                    b12.k.b(rVarB3, null, f15, new b12.b(str, null, f12.u.a(userLevel != null ? userLevel.intValue() : 0), null, null, 26, null), mVar3, b12.b.f14385f << 9, 18);
                    mVar3.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
