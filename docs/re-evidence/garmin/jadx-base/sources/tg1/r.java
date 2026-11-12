package tg1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import i3.ve;
import l72.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg1.b f164543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f164544c;

    public /* synthetic */ r(sg1.b bVar, p1 p1Var, int i14) {
        this.f164542a = i14;
        this.f164543b = bVar;
        this.f164544c = p1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f164542a;
        p1 p1Var = this.f164544c;
        sg1.b bVar = this.f164543b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(115763662, new r(bVar, p1Var, i15), mVar), mVar, 12582912, 123);
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
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(rVarD, eVar.f97920e, 0.0f, 2);
                    c2.j jVar = c2.j.f22691a;
                    float f14 = eVar.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarI, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    String str = bVar.f159196f;
                    h4.r rVarC2 = c2.l.C(x2.f(aVar, 1.0f), 0.0f, eVar.f97922g, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    d6.h hVarA = d6.h.a(d6.h.f57755e);
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarC2, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 130044);
                    f.a(b0Var.a(x2.f(aVar, 1.0f), 1.0f, true), bVar, mVar2, 0);
                    f0 f0Var = f0.f110999a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_device_migration_restore_from_backup);
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarC3 = c2.l.C(x2.h(x2.f(aVar, 1.0f), 80), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sg0.l(p1Var, 28);
                        mVar2.K(objQ);
                    }
                    f0Var.d(24576, 9, (e23.a) objQ, rVarC3, strQ, mVar2, null, false);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
