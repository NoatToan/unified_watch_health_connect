package gr2;

import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.r;
import h4.k;
import h5.e0;
import i3.v5;
import java.util.List;
import o13.p;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import u1.w;
import v.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements r<e2.d, Integer, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f78580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f78581b;

    public e(List list, l lVar) {
        this.f78580a = list;
        this.f78581b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            p pVar = (p) this.f78580a.get(iIntValue);
            mVar2.C(-876930278);
            Object obj = pVar.f128594a;
            zq2.f fVar = (zq2.f) pVar.f128595b;
            h4.r rVarE = u1.n.e(h4.r.S, p6.b.a(d92.b.f58623a, mVar2), m1.f128891a);
            l lVar = this.f78581b;
            boolean zB = mVar2.B(lVar) | mVar2.r(obj);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new b(lVar, obj);
                mVar2.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new b(lVar, obj);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = k.c(rVarD, mVar2);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            b0 b0Var = b0.f22601a;
            f.a(fVar.f206677b, fVar.f206676a, fVar.f206678c, mVar2, 0);
            v5.a(gl.b.q(mVar2, R.dimen.material_divider_thickness), 0, 1, n5.a.a(mVar2, R.color.GPcolorDivider), null, mVar2);
            mVar2.y();
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
