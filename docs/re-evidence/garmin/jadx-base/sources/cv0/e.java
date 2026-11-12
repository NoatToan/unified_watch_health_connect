package cv0;

import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.q;
import h4.k;
import h4.r;
import h5.e0;
import i3.fe;
import i3.mh;
import l72.a3;
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
import s5.x0;
import u1.a2;
import xd2.m0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55847a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f55848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f55849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f55850d;

    public /* synthetic */ e(p1 p1Var, l lVar, boolean z14) {
        this.f55848b = p1Var;
        this.f55849c = lVar;
        this.f55850d = z14;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f55847a;
        m.a aVar = m.f135153a;
        boolean z14 = this.f55850d;
        l lVar = this.f55849c;
        p1 p1Var = this.f55848b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarB = a2.b(aVar2, a2.a(mVar), true);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarB, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(mVar, R.string.livetrack_past_sessions_privacy_header);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar);
                    r rVarE = u1.n.e(aVar2, d92.b.a(mVar).c().b(), m1.f128891a);
                    d92.b.f58625c.getClass();
                    mh.c(strQ, c2.l.y(rVarE, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a11.b0(lVar, p1Var, 3);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new a11.b0(lVar, p1Var, 3);
                            mVar.K(objQ);
                        }
                    }
                    g.a(null, z14, (l) objQ, mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var2 = n.f135158a;
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC2 = c2.l.C(aVar4, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                Boolean bool = (Boolean) p1Var.getF182175a();
                bool.booleanValue();
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                Object objQ2 = mVar2.q();
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new m0(22);
                    mVar2.K(objQ2);
                }
                r1.b.a(bool, rVarC2, (l) objQ2, gVar, "", null, z3.f.c(521892369, new a3(lVar, z14, 2), mVar2), mVar2, 1600896, 32);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(boolean z14, l lVar, p1 p1Var) {
        this.f55850d = z14;
        this.f55849c = lVar;
        this.f55848b = p1Var;
    }
}
