package zo1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import i3.mh;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f206299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f206300d;

    public /* synthetic */ f0(yo1.b bVar, yo1.i iVar, bp1.a aVar) {
        this.f206297a = 0;
        this.f206298b = bVar;
        this.f206299c = iVar;
        this.f206300d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0326  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f206297a;
        Object obj3 = this.f206300d;
        Object obj4 = this.f206299c;
        Object obj5 = this.f206298b;
        switch (i14) {
            case 0:
                yo1.b bVar = (yo1.b) obj5;
                yo1.i iVar = (yo1.i) obj4;
                bp1.a aVar = (bp1.a) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(aVar2, eVar.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar2, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(aVar2, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, z0VarD, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    c2.u uVar = c2.u.f22885a;
                    String imageURI = bVar.getImageURI();
                    float f14 = 64;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.u(aVar2, f14), f14);
                    float f15 = 24;
                    jf.r.a(imageURI, "", c2.l.C(rVarH, 0.0f, 0.0f, f15, f15, 3), null, null, null, null, mVar, 432, 2040);
                    h4.r rVarC3 = uVar.c(aVar2, h4.d.a.f81532j);
                    float f16 = j92.b.f97901d.f97906e;
                    com.garmin.android.apps.connectmobile.userprofile.model.j jVar = iVar.f198502n;
                    b12.k.b(rVarC3, null, f16, new b12.b(jVar != null ? jVar.f46879h : null, null, null, null, null, 30, null), mVar, b12.b.f14385f << 9, 18);
                    mVar.y();
                    h4.r rVarC4 = c2.l.C(x2.f(aVar2, 1.0f), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC5, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String title = bVar.getTitle();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97933j;
                    mh.c(title, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131070);
                    p3.m mVar2 = mVar;
                    String fullName = iVar.getFullName();
                    if (fullName != null) {
                        mVar2.C(2098697844);
                        mh.c(fullName, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                        mVar2 = mVar2;
                        mVar2.f();
                    } else {
                        mVar2.C(2098868902);
                        mVar2.f();
                    }
                    String strA = aVar.a(bVar, false);
                    if (g22.n.d(strA)) {
                        mVar2.C(2099014199);
                        boolean zR = mVar2.r(aVar) | mVar2.r(bVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new h0(aVar, bVar, 0);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new h0(aVar, bVar, 0);
                                mVar2.K(objQ);
                            }
                        }
                        p3.m mVar3 = mVar2;
                        mh.c(strA, p5.v.b(aVar2, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar3, 0, 0, 131068);
                        mVar2 = mVar3;
                        mVar2.f();
                    } else {
                        mVar2.C(2099428390);
                        mVar2.f();
                    }
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                zq0.d.a((lc.m0) obj5, (zq0.e) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(49));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                zr.h.i((h4.r) obj5, (nr.z) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                zr.h.g((h4.r) obj5, (nr.z) obj4, (Integer) obj3, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                zu1.k.a aVar5 = zu1.k.f207122d;
                ((zu1.k) obj5).u6((String) obj4, (List) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                MoveIQEventDetailsActivity.a aVar6 = MoveIQEventDetailsActivity.f39211k;
                ((MoveIQEventDetailsActivity) obj5).ca((Integer) obj4, (Integer) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f206297a = i15;
        this.f206298b = obj;
        this.f206299c = obj2;
        this.f206300d = obj3;
    }
}
