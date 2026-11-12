package u50;

import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.fe;
import l72.d3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSearchActivity f168645b;

    public /* synthetic */ b(CourseSearchActivity courseSearchActivity, int i14) {
        this.f168644a = i14;
        this.f168645b = courseSearchActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f168644a;
        CourseSearchActivity courseSearchActivity = this.f168645b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CourseSearchActivity.a aVar = CourseSearchActivity.f33091e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1653600728, new b(courseSearchActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CourseSearchActivity.a aVar2 = CourseSearchActivity.f33091e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p1 p1VarC = s9.c.c(courseSearchActivity.ca().f168673i, mVar2);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new fe();
                        mVar2.K(objQ);
                    }
                    fe feVar = (fe) objQ;
                    r.a aVar3 = r.S;
                    r rVarD = x2.d(aVar3, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
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
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u uVar = u.f22885a;
                    x50.f fVar = (x50.f) p1VarC.getF182175a();
                    h hVarCa = courseSearchActivity.ca();
                    boolean zR = mVar2.r(hVarCa);
                    Object objQ2 = mVar2.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new c(hVarCa);
                        mVar2.K(objQ2);
                    }
                    g.a(fVar, (e23.l) ((k23.g) objQ2), mVar2, 0);
                    d3.b(feVar, uVar.c(aVar3, h4.d.a.f81531i), mVar2, 6, 0);
                    mVar2.y();
                    Integer numValueOf = Integer.valueOf(((x50.f) p1VarC.getF182175a()).f189011f);
                    boolean zR2 = mVar2.r(courseSearchActivity) | mVar2.B(p1VarC);
                    Object objQ3 = mVar2.q();
                    if (zR2 || objQ3 == c2565a) {
                        objQ3 = new d(courseSearchActivity, p1VarC, null);
                        mVar2.K(objQ3);
                    }
                    l0.e((p) objQ3, numValueOf, mVar2);
                    Unit unit = Unit.INSTANCE;
                    boolean zR3 = mVar2.r(courseSearchActivity);
                    Object objQ4 = mVar2.q();
                    if (zR3 || objQ4 == c2565a) {
                        objQ4 = new e(courseSearchActivity, feVar, null);
                        mVar2.K(objQ4);
                    }
                    l0.e((p) objQ4, unit, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
