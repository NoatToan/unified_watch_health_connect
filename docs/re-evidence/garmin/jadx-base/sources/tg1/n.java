package tg1;

import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.mh;
import i3.ve;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg1.d f164527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pg1.d f164528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f164529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f164530e;

    public /* synthetic */ n(sg1.d dVar, pg1.d dVar2, List list, e23.l lVar, int i14) {
        this.f164526a = i14;
        this.f164527b = dVar;
        this.f164528c = dVar2;
        this.f164529d = list;
        this.f164530e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f164526a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(-408129722, new n(this.f164527b, this.f164528c, this.f164529d, this.f164530e, 1), mVar), mVar, 12582912, 123);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    sg1.d dVar = this.f164527b;
                    boolean z14 = dVar.f159211a;
                    pg1.d dVar2 = this.f164528c;
                    if (!z14) {
                        dVar2.invoke(Boolean.FALSE);
                    }
                    if (dVar.f159211a) {
                        mVar2.C(460022713);
                        mVar2.f();
                        dVar2.invoke(Boolean.TRUE);
                    } else if (dVar.f159212b) {
                        mVar2.C(460135739);
                        h4.r.a aVar = h4.r.S;
                        h4.r rVarD = x2.d(aVar, 1.0f);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar2);
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
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        u uVar = u.f22885a;
                        String strQ = y.Q(mVar2, R.string.txt_error_occurred);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ, uVar.c(aVar, h4.d.a.f81528f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(460542924);
                        if (dVar.f159213c.isEmpty()) {
                            mVar2.C(460753104);
                            o.a(x2.d(h4.r.S, 1.0f), mVar2, 6);
                            mVar2.f();
                        } else {
                            mVar2.C(460618967);
                            o.b(this.f164529d, this.f164530e, dVar, mVar2, 0);
                            mVar2.f();
                        }
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
